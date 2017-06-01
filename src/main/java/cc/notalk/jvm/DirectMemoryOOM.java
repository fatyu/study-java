package cc.notalk.jvm;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

// -Xmx20M -XX:MaxDirectMemorySize=10M -verbose -verbose:gc
public class DirectMemoryOOM {
    private static final int _20MB = 20 * 1024 * 1024;

    public static void main(String[] args) throws IllegalAccessException {
        java.lang.reflect.Field unsafeField = sun.misc.Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        sun.misc.Unsafe unsafe;
        unsafe = (sun.misc.Unsafe) unsafeField.get(null);
        int allocateTimes = 0;

        while (true) {
            if (allocateTimes % 100000 == 0) {
                System.err.println("------------------allocate " + allocateTimes + "x1Mb memory");
            }
            unsafe.allocateMemory(_20MB);
            allocateTimes++;
        }
    }
}
