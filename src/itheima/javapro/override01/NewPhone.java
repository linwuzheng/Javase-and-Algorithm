package itheima.javapro.override01;

//子类继承并重写
public class NewPhone extends Phone{
    @Override//用于标识并校验正确性
    public void call(){
        super.call();
        System.out.println("新手机打电话");
    }
    @Override
    public void sendMessage(){
        super.sendMessage();
        System.out.println("新手机打电话");
    }

}

