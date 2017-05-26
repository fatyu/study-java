package cc.notalk.bp.ch07;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * @@LinkedList读慢改快 <li>分配内存空间不连续</li> <li>以指针的形式进行链接</li> <li>读取耗费资源大</li>
 * @@ArrayList读快改慢 <li>分配内存空间连续</li><li>更改要使用Arrays.copy()方法耗费资源大</li>
 * @@Hash位于两者之间
 * @@使用debug运行此程序观察分配方式的不同
 * @author fatyu
 */
public class TestList {

	public static void main(String[] args) {

		List<Date> list4LinkedList = new LinkedList<Date>();

		try {
			list4LinkedList.add(new Date());
			Thread.sleep(1000);
			list4LinkedList.add(new Date());
			Thread.sleep(1000);
			list4LinkedList.add(new Date());
			Thread.sleep(1000);
			list4LinkedList.add(new Date());
			Thread.sleep(1000);
			list4LinkedList.add(new Date());
			Thread.sleep(1000);
			list4LinkedList.set(2, new Date());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (Date date : list4LinkedList) {
			System.out.println(date.getTime());
		}

		// --------------------------------漂亮的分割线----------------------------
		List<Date> list4Arraylist = new ArrayList<Date>();
		try {
			list4Arraylist.add(new Date());
			Thread.sleep(1000);
			list4Arraylist.add(new Date());
			Thread.sleep(1000);
			list4Arraylist.add(new Date());
			Thread.sleep(1000);
			list4Arraylist.add(new Date());
			Thread.sleep(1000);
			list4Arraylist.add(new Date());
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
