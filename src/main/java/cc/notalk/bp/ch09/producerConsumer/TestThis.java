package cc.notalk.bp.ch09.producerConsumer;

public class TestThis {
	public static void main(String[] args) {
		ProductContainer pc = new ProductContainer();// 创建产品容器
		Producter producter = new Producter(pc);// 创建生产者
		Consumer consumer = new Consumer(pc);// 创建消费者

		Thread tp = new Thread(producter);// 为生产者创建线程
		Thread tc = new Thread(consumer);// 为消费者创建线程

		tp.start();
		tc.start();
	}
}
