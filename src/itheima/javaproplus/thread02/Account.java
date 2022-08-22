package itheima.javaproplus.thread02;

//创建一个账户
public class Account {
    private String cardId;
    private int money;

    public Account(){}

    public Account(String cardId, int money) {
        this.cardId = cardId;
        this.money = money;
    }

    public void drawMoney(int money) {
        String name = Thread.currentThread().getName();
//        通过加同步锁避免安全问题,其中this == acc（实例方法），如果是静态方法可以使用 类名.class 的方式表示锁
        synchronized (this) {
            if (this.money >= money) {
                System.out.println(name + "来取钱，吐出：" + money);
                this.money -= money;
                System.out.println(name + "取钱后剩余：" + this.money);

            } else {
                System.out.println("对不起，您的账户余额不足！！！");
            }
        }
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
