package cc.notalk.jvm.oom;

//常量池异常,使用String.intern()方法将字符串添加到常量池中
//-verbose:gc -XX:+PrintGCDetails -XX:PermSize=10M -XX:MaxPermSize=10M

//-XX:MaxMetaspaceSize=10M
public class ConstPoolOOM {

    public static void main(String[] args) {
        int i = 0;
        while (true) {
            String s = "" + i;
            //System.out.println(s.intern());
            i++;
        }
    }

}
