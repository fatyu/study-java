package cc.notalk.thread.juc;
public class CircleList {
 // 保存当前节点对象
 private Node currentNode;
 /**
  * 在当前节点前插入
  */
 public synchronized void add(Object obj) {
  Node node = new Node();
  node.obj = obj;
  // 判断当前节点是否为空
  if (currentNode == null) {
   node.next = node.pre = node;
   currentNode = node;
  } else {
   node.next = currentNode;
   node.pre = currentNode.pre;
   currentNode.pre.next = node;
   currentNode.pre = node;
  }
 }
 public Node getNext() {
  return currentNode == null ? null : currentNode.next;
 }
 public Node search(Object obj) {
  Node node = currentNode;
  do {
   if (node.obj == obj)
    return currentNode;
   node = node.next;
  } while (node != currentNode);
  return null;
 }
 public synchronized void delete(Object obj) {
  Node node = search(obj);
  if (null == node) {
   throw new NullPointerException("没有找到节点!");
  } else {
   Node pre = node.pre;
   Node next = node.next;
   pre.next = next;
   next.pre = pre;
   node = null;
  }
 }
}
class Node {// 链表中的节点对象
 Object obj;// 当前节点存放的对象
 Node pre;// 节点的前一节点
 Node next;// 节点的下一节点
}