package itheima.java.loop;

//嵌套循环的学习
public class ForForDemo01 {
    public static void main(String[] args) {
        for(int i = 0;i <= 9;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------------");
        for(int m = 0;m <= 9;m++){
            for(int n=0;n <= m;n++){
                System.out.print(m+"*"+n+"="+m*n);
            }
            System.out.println();
        }
    }
}
