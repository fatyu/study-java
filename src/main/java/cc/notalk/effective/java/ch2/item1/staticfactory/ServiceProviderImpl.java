package cc.notalk.effective.java.ch2.item1.staticfactory;

/**
 * Service Provider
 * 
 * 服务创建接口
 * 
 * 类似于JDBC中的Driver接口
 * 
 * @author fatyu
 */
public class ServiceProviderImpl implements ServiceProvider {

	private static Service s = new ServiceImpl();// 使得获得的service对象是同一个对象

	public Service newService() {
		return s;
	}
}
