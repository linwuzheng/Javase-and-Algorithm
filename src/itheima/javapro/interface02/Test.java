package itheima.javapro.interface02;

//一个类可以实现多个接口；接口的多继承，接口也可以继承接口，从而实现继承的简化
public class Test {
    public static void main(String[] args) {
        BasketballMan b = new BasketballMan();
        b.rule();
        b.competition();
    }
}
