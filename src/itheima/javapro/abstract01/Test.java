package itheima.javapro.abstract01;


public class Test {
    public static void main(String[] args) {
        GoldCard gd = new GoldCard();
        gd.setMoney(10000);
        gd.setUserName("王二狗");
        gd.pay(300);
    }
}
