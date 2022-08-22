package itheima.javapro.interface02;

//一个类可以实现多个接口，而接口通过多继承实现简化
public class BasketballMan implements SportMan{

    @Override
    public void run() {
        System.out.println("运动员要跑步");
    }

    @Override
    public void competition() {
        System.out.println("运动员要比赛");
    }

    @Override
    public void rule() {
        System.out.println("要遵守规则");
    }

    @Override
    public void eat() {
        System.out.println("要吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("要睡觉");
    }
}
