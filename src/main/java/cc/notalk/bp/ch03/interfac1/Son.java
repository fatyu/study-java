package cc.notalk.bp.ch03.interfac1;

public class Son implements InterfaceOne {
	@Override
	public void method1() {
		System.out.println("method1");
	}

	@Override
	public void method2() {
		System.out.println("method2");
	}

	/*
	 * @@Override public void method2() { System.out.println("method2"); }
	 * 
	 * @@Override public String method2(){ return "fatyu"; }
	 */
	class Solve implements InterfaceTwo {
		@Override
		public String method2() {
			return "fatyu";
		}

		@Override
		public void method1() {
		}
	}

}
