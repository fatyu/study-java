package cc.notalk.jvm.so;

/**
 * -Xss128K 设置线程栈内存大小 一般的方法栈执行深度1000~2000左右
 */
public class JVMStackOverflow {
    private int stackLength = 0;

    public void recursionStackMethod() {
        stackLength++;
        recursionStackMethod();
    }

    public static void main(String[] args) {
        cc.notalk.jvm.so.JVMStackOverflow jvmStackOverflow = new cc.notalk.jvm.so.JVMStackOverflow();
        try {
            jvmStackOverflow.recursionStackMethod();//递归调动,线程栈内存不足,抛出异常
        } catch (Throwable e) {
            System.err.println("method invoked times is :" + jvmStackOverflow.stackLength);
            throw e;
        }
    }
}
