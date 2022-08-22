package itheima.javaproplus.thread01;

//多线程的学习，线程的创建及使用：方式一
public class ThreadDemo01 {
    public static void main(String[] args) {

        Thread t = new MyThread();
//        调用start方法启动线程，调用后还是运行run方法，如果直接调用run方法则仍然是单线程，会先执行子线程；
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("这是主线程i输出：" + i);
        }
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("这是子线程i输出："+ i);
        }
    }
}