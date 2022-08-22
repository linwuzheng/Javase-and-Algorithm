package itheima.java.operator;

//使用自增或者自减运算符 ++  --
public class OperatorDemo03 {
    public static void main(String[] args) {
       int a = 10;
       a++;
       System.out.println("a="+a);

       int b = 10;
       --b;
        System.out.println("b="+b);

        int i = 10;
        int j = ++i;
        System.out.println(i);
        System.out.println(j);

        int m = 10;
        int n= m++;
        System.out.println(m);
        System.out.println(n);

        System.out.println("-------扩展案例-------");
        int c = 10;
        int d = 5;
        //c 11 12 11
        //d 4 5
        //sum 10+12-4-5+1+12=26
        int sum = c++ + ++c - --d - ++d +1 +c--;
        System.out.println(c);
        System.out.println(d);
        System.out.println(sum);
    }
}
