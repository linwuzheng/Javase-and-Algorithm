package itheima.javapro.polymorphic01;


public class Test {
    public static void main(String[] args) {
        Computer c = new Computer("神州");
        c.start();

        USB k = new KeyBoard("双飞燕");
        c.installUSB(k);

        USB m = new Mouse("飞利浦");
        c.installUSB(m);
    }
}
