package cc.notalk.jvm.oom;

/**
 * 方法区存放class的一些信息,当运行时产生大量的类会引起方法区的内存溢出
 * -verbose:gc -XX:+PrintGCDetails -XX:PermSize=10M -XX:MaxPermSize=10M
 *
 * -XX:MaxMetaspaceSize=10M
 */
public class MethodAreaOOM {

    public static void main(String[] args) {
        while (true) {
            net.sf.cglib.proxy.Enhancer enhancer = new net.sf.cglib.proxy.Enhancer();
            enhancer.setSuperclass(cc.notalk.jvm.oom.MethodAreaOOM.OOMObject.class);
            enhancer.setUseCache(false);
            enhancer.setCallback(new net.sf.cglib.proxy.MethodInterceptor() {
                public Object intercept(Object o, java.lang.reflect.Method method, Object[] objects, net.sf.cglib.proxy.MethodProxy methodProxy) throws Throwable {
                    return methodProxy.invokeSuper(objects, args
                    );
                }
            });
            enhancer.create();
        }
    }

    static class OOMObject {

    }
}
