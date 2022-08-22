package itheima.javapro.static01;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

//单例设计模式，单例类的创建
public class SingleInstance {
//    定义一个静态变量存储对象即可
    public static SingleInstance instance = new SingleInstance();

//    单例必须私有构造器
    private  SingleInstance(){}

//    必须提供一个方法返回一个单例对象
    public static SingleInstance getInstance(){
        SingleInstance instance = new SingleInstance();
        return instance;
    }

}
