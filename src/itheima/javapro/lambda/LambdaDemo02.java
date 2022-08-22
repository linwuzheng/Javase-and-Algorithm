package itheima.javapro.lambda;

//学会使用Lambda的标准格式简化匿名内部类的代码形式
//Lambda只能简化接口中只有一个抽象方法的匿名内部类形式
public class LambdaDemo02 {
    public static void main(String[] args) {
//        普通写法
        Swimming s1 = new Swimming(){
            public void swim(){
                System.out.println("老师游泳贼溜~~~~~~");
            }
        };
        go(s1);
//        Lambda表达式写法
        go(() -> {
            System.out.println("铁汁，我们去游泳吧~~~（Lambda）");
        });
    }
    public static void go(Swimming s){
        System.out.println("开始~~~~~~");
        s.swim();
        System.out.println("结束~~~~~~");

    }
}

@FunctionalInterface
interface Swimming{
    void swim();
}
