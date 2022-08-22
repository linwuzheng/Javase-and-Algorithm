package itheima.javapro.abstract01;

//继承抽象类，并重写抽象方法
public class GoldCard extends Card{

    @Override
    public void pay(double money1) {
        System.out.println("您当前消费金额为："+money1);
        System.out.println("您当前的余额为："+getMoney());

//        优惠价
        double rs = money1*0.8;
        System.out.println("您实际消费金额为："+rs);
        setMoney(getMoney()-rs);
    }
}
