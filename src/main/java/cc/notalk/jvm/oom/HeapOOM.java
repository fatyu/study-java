package cc.notalk.jvm.oom;

import java.util.ArrayList;
import java.util.List;
//-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
// heap 20M
//			young
// 				eden 8M
// 				from survivor 1M
//				to survivor 1M
//			old 10M
//PSYoungGen（PS是指Parallel Scavenge）为Eden+FromSpace

public class HeapOOM {

	static class Adspace {
	}

	public static void main(String[] args) {
		java.util.List<cc.notalk.jvm.oom.HeapOOM.Adspace> ads = new java.util.ArrayList<cc.notalk.jvm.oom.HeapOOM.Adspace>();
		while (true) {
			ads.add(new cc.notalk.jvm.oom.HeapOOM.Adspace());
		}
	}
}
