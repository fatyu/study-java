package org.fatyu.string;

/**
 * <p>
 * �ַ����ǳ��������ǵ�ֵ�ڴ���֮���ܸ��ġ��ַ���������֧�ֿɱ���ַ�������Ϊ String �����ǲ��ɱ�ģ����Կ��Թ���.
 * </p>
 *
 * @author fatyu
 * @version 1.0
 */
@SuppressWarnings("unused")
public class StringFoo
{
  /**
   * �������.
   * @param args
   */
  public static void main(String[] args)
  {
    String str = "zhangyu"; //�ַ��������޸�
    String str1 = new String("zhangyu!");
    System.out.println(str);
    System.out.println(str1);
  }

  public String stringCreater()
  {
    //1.ֱ�Ӵ����ַ���
    
	String a = "a";
    //2.ʹ��new�ؼ��ִ���.ʹ��new �ж��ַ���.@see java.lang.String
    String b = new String("b");
    //3.ʹ��StringBulider���д���
    StringBuilder sb = new StringBuilder(); //���߳�ʹ��
    sb.append("aaa");
    sb.append("bbb");
    String str = sb.toString();
    //4.ʹ��StringBuffer���д���
    StringBuffer sbuffer = new StringBuffer(); //���߳�ʹ��
    sbuffer.append("a");
    sbuffer.append("b");
    String str_sbuffer = sbuffer.toString();
    return null;
  }
}
