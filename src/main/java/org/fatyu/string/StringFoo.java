package org.fatyu.string;

/**
 * <p>
 * 字符串是常量；它们的值在创建之后不能更改。字符串缓冲区支持可变的字符串。因为 String 对象是不可变的，所以可以共享.
 * </p>
 *
 * @author fatyu
 * @version 1.0
 */
@SuppressWarnings("unused")
public class StringFoo
{
  /**
   * 程序入口.
   * @param args
   */
  public static void main(String[] args)
  {
    String str = "zhangyu"; //字符串不能修改
    String str1 = new String("zhangyu!");
    System.out.println(str);
    System.out.println(str1);
  }

  public String stringCreater()
  {
    //1.直接创建字符串
    
	String a = "a";
    //2.使用new关键字创建.使用new 有多种方法.@see java.lang.String
    String b = new String("b");
    //3.使用StringBulider进行创建
    StringBuilder sb = new StringBuilder(); //单线程使用
    sb.append("aaa");
    sb.append("bbb");
    String str = sb.toString();
    //4.使用StringBuffer进行创建
    StringBuffer sbuffer = new StringBuffer(); //多线程使用
    sbuffer.append("a");
    sbuffer.append("b");
    String str_sbuffer = sbuffer.toString();
    return null;
  }
}
