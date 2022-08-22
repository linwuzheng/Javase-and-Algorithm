package itheima.java.loop;

//break和continue的使用
public class ForForDemo02 {
    public static void main(String[] args) {
        for (int i=0;i<5;i++){
            System.out.println("快乐的洗碗~~~~"+(i+1));
            if (i==2){
                break;
            }
        }
        System.out.println("-----------");
        for (int i = 1;i<=5;i++){
            if(i==3){
                continue;
            }
            System.out.println("洗碗："+i);
        }
    }
}
