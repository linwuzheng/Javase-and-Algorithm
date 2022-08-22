package itheima.javapro.polymorphic01;

public class KeyBoard implements USB{

    private String name;

    public KeyBoard(){}

    public KeyBoard(String name){
        this.name = name;
    }

    @Override
    public void connect(){
        System.out.println(name + "连接上了电脑！");
    }
    public void keyDown(){
        System.out.println(name + "键盘打字：老铁666！！！");
    }
    @Override
    public void unconnect() {
        System.out.println(name + "断开了电脑！");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
