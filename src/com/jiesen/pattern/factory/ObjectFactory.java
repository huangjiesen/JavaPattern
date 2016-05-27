package com.jiesen.pattern.factory;

import java.util.Properties;

/**
 * 对象工厂
 * <p>配置形对象工厂,这种模式在添加接口的实现类时不需要修改工厂方法，只需要在配置文件添加映射即可</p>
 * <ul>
 *  <li>将要创建的类，使用key-value的形式保存在配置文件</li>
 *  <li>key-类简单名称,value-包含包名的类的全名</li>
 * </ul>
 * Created by sen on 16-5-20.
 */
public class ObjectFactory {
    private static Properties pr=new Properties();
    static{
        try {
            //加载配置文件
            pr.load(ObjectFactory.class.getResourceAsStream("Factory.properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取对象，通过类名获取在配置文件对应的类全名，再通过反射生成对象
     * @param c
     * @param <T>
     * @return
     */
    public static <T> T get(Class<T> c) {
        try {
            return (T) Class.forName(pr.getProperty(c.getSimpleName())).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
