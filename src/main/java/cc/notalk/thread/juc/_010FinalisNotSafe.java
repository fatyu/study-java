package cc.notalk.thread.juc;
//使用final修饰的对象不一定是不可变对象，因为final域可以修饰一个可变对象的引用
public class _010FinalisNotSafe {
 public final static Person p = new Person("zy!");
 public static void main(String[] args) {
  p.setName("changed!");
  System.out.println(p.getName());
  // p = new Person("new"); this is error! the memory address was changed.
 }
}
class Person {
 public Person(String name) {
  this.name = name;
 }
 private String name;
 public String getName() {
  return name;
 }
 public void setName(String name) {
  this.name = name;
 }
}
/**
 * 只有满足以下条件，一个对象才是不可变的
 * <p>
 * <li>它的状态不能再创建后修改</li>
 * <li>所有域都是final类型</li>
 * <li>他被正确创建(创建时不会发生this逸出)</li>
 * </p>
 */
