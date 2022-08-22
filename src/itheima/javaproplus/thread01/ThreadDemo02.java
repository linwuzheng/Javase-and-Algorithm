package itheima.javaproplus.thread01;

//使用Runnable接口创建线程,可以用匿名内部类简化下列写法
public class ThreadDemo02 {
    public static void main(String[] args) {

        Runnable target = new MyRunnable();
        Thread t = new Thread(target);
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("这是主线程的输出：" + i);
        }
    }
}
class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("这是子线程的输出：" + i);
        }
    }
}
