package cc.notalk.effective.java.ch2.item1.staticfactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 类似于JDBC的DriverManager类
 *
 * @author fatyu
 */
public class ServiceManager {
	private ServiceManager() {// 提供一个私有的构造方法
	}

	// 实例化一个静态map数据结构用来存储注册的ServiceProvider
	private static final Map<String, ServiceProvider> providers = new ConcurrentHashMap<String, ServiceProvider>();

	private static final String DEFAULT_PROVIDER_NAME = "fatyu";

	/**
	 * Reg Access API
	 *
	 * @@param sp
	 */
	public static void regDefaultProvider(ServiceProvider sp) {// 注册默认的ServiceProvider
		regProvider(DEFAULT_PROVIDER_NAME, sp);
	}

	/**
	 * Reg Access API
	 *
	 * @@param name
	 *            ,provider
	 */
	public static void regProvider(String name, ServiceProvider provider) {
		providers.put(name, provider);// 将默认的ServiceProvider放入在Map对象中
	}

	/**
	 * Service Access API
	 *
	 * @@return Service
	 */
	public static Service getService() {
		return newInstance(DEFAULT_PROVIDER_NAME);

	}

	public static Service newInstance(String string) {
		ServiceProvider s = providers.get(string);
		if (s != null) {
			return s.newService();
		} else {
			throw new IllegalArgumentException("没有注册ServiceProvider!");
		}
	}
}
