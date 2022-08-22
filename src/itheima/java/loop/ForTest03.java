package itheima.java.loop;

//水仙花数：三位数的个十百位的立方和等于这个数
public class ForTest03 {
    public static void main(String[] args) {
        for (int m = 100;m < 1000;m++){
            if((Math.pow((m%10),3)+Math.pow((m/10%10),3)+Math.pow((m/100),3)) == m){
                System.out.println("水仙花数："+m);
            }
        }
    }
}

