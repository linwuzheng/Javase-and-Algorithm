package itheima.java.method;

//方法重载（方法名称相同，形参不同）
public class MethodDemo05 {
    public static void main(String[] args) {
        weapon();
        weapon(10);
        weapon(11,"岛国");
    }
    public static void weapon(){
        System.out.println("发射1枚导弹~~~");
    }
    public static void weapon(int a){
        System.out.println("发射"+a+"枚导弹~~~");
    }
    public static void weapon(int a,String b){
        System.out.println("发射"+a+"枚导弹到"+b+"~~~");
    }
}
