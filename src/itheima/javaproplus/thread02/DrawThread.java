package itheima.javaproplus.thread02;

//取钱的线程
public class DrawThread extends Thread{

    private Account acc;
    public DrawThread(Account acc,String name){
        super(name);
        this.acc = acc;
    }
    @Override
    public void run() {
//        取钱的方法
        acc.drawMoney(100000);
    }
}
