package itheima.javaproplus.thread02;

//实现同时取钱的操作,出现了安全问题，加synchronized同步锁解决
public class ThreadDemo {
    public static void main(String[] args) {
        Account acc = new Account("农业银行1号",100000);

        new DrawThread(acc,"小明").start();
        new DrawThread(acc,"小红").start();
    }
}
