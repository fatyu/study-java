package org.fatyu.gui.event;


import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JComponent;
import javax.swing.JFrame;


public class MouseEventFoo {
    public MouseEventFoo() {
        super();
    }

    public static void main(String[] args) {
        MouseFrame mf = new MouseFrame();
        mf.setVisible(true);
        mf.setAlwaysOnTop(true);
    }
}
@SuppressWarnings("serial")
class MouseFrame extends JFrame {


    public MouseFrame() {
        this.setTitle("MouseDraw");
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MouseComponent mc = new MouseComponent();
        this.add(mc);
    }
}
@SuppressWarnings("serial")
class MouseComponent extends JComponent {
    private static final int SIDELENGTH = 10;
    private List<Rectangle2D> squares;
    private Rectangle2D current;

    public MouseComponent() {
        squares = new ArrayList<Rectangle2D>();
        current = null;
        this.addMouseListener(new MouseHandle());
        this.addMouseMotionListener(new MouseMotionHandle());
    }

    public Rectangle2D find(Point2D p) {
        for (Rectangle2D r : squares) {
            if (r.contains(p)) {
                return r;
            }
        }
        return null;
    }

    /**
     *删除list的长方形
     * @param r
     */
    public void remove(Rectangle2D r) {
        if (r == null)
            return;
        if (r == current)
            current = null;
        squares.remove(r);
        repaint();
    }

    /**
     *添加一个长方形到list
     * @param p
     */
    public void add(Point2D p) {
        double x = p.getX();
        double y = p.getY();
        current =
                new Rectangle2D.Double(x - SIDELENGTH / 2, y - SIDELENGTH / 2,
                                       SIDELENGTH, SIDELENGTH);
        squares.add(current);
        repaint();
    }

    /**
     *迭代画出长方形
     * @param g
     */
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        for (Rectangle2D r2d : squares) {
            g2d.draw(r2d);
        }
    }

    private class MouseHandle extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            current = find(e.getPoint());
            if (current != null && e.getClickCount() >= 2) {
                remove(current);
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            current = find(e.getPoint());
            if (current == null) {
                add(e.getPoint());
            }
        }
    }

    private class MouseMotionHandle extends MouseMotionAdapter {

        @Override
        public void mouseDragged(MouseEvent e) {
            if (current != null) {
                int x = e.getX();
                int y = e.getY();
                current.setFrame(x - SIDELENGTH / 2, y - SIDELENGTH / 2,
                                 SIDELENGTH, SIDELENGTH);
                repaint();
            }
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            if (find(e.getPoint()) == null) {
                setCursor(Cursor.getDefaultCursor());
            } else {
                setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
            }
        }
    }

}


