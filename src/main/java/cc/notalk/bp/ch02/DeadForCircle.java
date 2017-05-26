package cc.notalk.bp.ch02;

/**
 * 使用for(;;)可以达到while(true)的效果 在死循环中可以使用break来跳出循环
 *
 * @author fatyu
 *
 */
public class DeadForCircle {

	public static void main(String[] args) {
		int i = 0;
		for (;;) {
			System.out.println("this is a Deadly for");
			i++;
			if (i >= 100) {
				break;
			}
		}
	}
}
