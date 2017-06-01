package cc.notalk.jvm.jvmtools;

import java.util.ArrayList;
import java.util.List;

public class MemoryMonitor {
	static class OOMObject {
		public byte[] bytes = new byte[1024 * 1024];
	}

	public static void fillHeap() {
		java.util.List<cc.notalk.jvm.jvmtools.MemoryMonitor.OOMObject> list = new java.util.ArrayList<cc.notalk.jvm.jvmtools.MemoryMonitor.OOMObject>();
		for (int i = 0; i < 1000; i++) {
			cc.notalk.jvm.jvmtools.MemoryMonitor.OOMObject oomobj = new cc.notalk.jvm.jvmtools.MemoryMonitor.OOMObject();
			list.add(oomobj);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.gc();//因为list还被fillHeap方法持有,所以老生代内存不会被回收
	}

	public static void main(String[] args) {
		fillHeap();
		System.gc();//gc此处执行才会回收掉list的引用数据
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
