package itheima.javapro.polymorphic01;

import java.security.Key;

public class Computer {

    private String name;

    public Computer(){}

    public Computer(String name) {
        this.name = name;
    }

    public void start(){
        System.out.println(name + "电脑开机了！！！");
    }
    public void installUSB(USB usb){
        usb.connect();

        if (usb instanceof KeyBoard){
            KeyBoard k = (KeyBoard) usb;
            k.keyDown();
        }else if(usb instanceof Mouse){
            Mouse m = (Mouse) usb;
            m.dbclick();
        }

        usb.unconnect();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
