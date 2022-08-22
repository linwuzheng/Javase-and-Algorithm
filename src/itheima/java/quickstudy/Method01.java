package itheima.java.quickstudy;

//方法的使用
public class Method01 {
    public static void main(String[] args) {
        int d = Method01.add(142,35);
        System.out.println(d);
    }
    static int add(int a,int b){
        int c = a+b;
        return c;
    }
}
