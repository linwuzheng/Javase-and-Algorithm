package itheima.javapro.polymorphic01;

public class Mouse implements USB{

    public String name;

    public Mouse(){}

    public Mouse(String name){
        this.name = name;
    }
    @Override
    public void connect() {
        System.out.println("鼠标成功连接了电脑！！！");
    }

    public void dbclick(){
        System.out.println(name + "双击鼠标点亮红心，一键三连！！！");
    }
    @Override
    public void unconnect() {
        System.out.println("鼠标成功从电脑上拔出");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
