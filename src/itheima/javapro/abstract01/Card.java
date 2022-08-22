package itheima.javapro.abstract01;

//抽象类，卡片
public abstract class Card {
    private String userName;
    private double money;

    public abstract void pay(double money1);

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
