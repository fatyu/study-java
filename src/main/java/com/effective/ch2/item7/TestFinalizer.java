package com.effective.ch2.item7;

/**
 * Finalizers are unpredictable, often dangerous, and generally unnecessary. <li>
 * As a rule of thumb, you should avoid finalizers.</li> the finalizer thread
 * was running at a lower priority(优先权) than another application thread <br>
 * <br>
 * finalize 的常规协定是： <li>
 * 当Java虚拟机已确定尚未终止的任何线程无法再通过任何方法访问此对象时，将调用此方法</li>
 * 在java中使用try{}finally{}来进行资源的释放 例如在输入输出流完毕后要关闭输入输出流
 * 
 * 调用finalizer会严重的影响程序的性能
 * 
 * @@author Fatyu
 * @@Note Finalizer is not performed automatically
 */
public class TestFinalizer {

	// System.runFinalization();//此方法表示JVM进行一定努力去调用对象
	// System.gc();
	
	// 手工调用finalizer链
	@Override
	protected void finalize() throws Throwable {
		try {
			// Finalize subclass state
		} finally {
			super.finalize();//调用父类的finalize方法
		}
	}

	/**
	 * 通常使用匿名类进行finalize外部类 用于非final的公共类使用此技术
	 * 即使子类调用父类额的finalize失败此方法也可调用finalize
	 */
	@SuppressWarnings("unused")
	private static final Object finalizeOuterClass = new Object() {
		@Override
		public void finalize() throws Throwable {
			// invoke some method
			// ...
		}
	};
}
