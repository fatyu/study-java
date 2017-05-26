package cc.notalk.effective.java.ch2.item5;

/**
 * <p>
 * Not Creating Unnecessory Object
 * </p>
 * 
 * <p>
 * Just Reuse
 * <li>The Object is IMMUTABLE</li>
 * <li>Use static block(if the consist was not use frequently so the field could
 * be lazily inited)</li>
 * </p>
 * 
 * @author fatyu
 * 
 */
public class UnnecessoryObject {
	public static void main(String[] args) {
		String[] str = new String[1000];

		for (int i = 0; i < 1000; i++) {
			// str[i] = new String(""+i);//cost 15 milliseconds
			str[i] = "" + i;// cost 0 milliseconds
		}
	}
}
