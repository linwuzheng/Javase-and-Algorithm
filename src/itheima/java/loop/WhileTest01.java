package itheima.java.loop;

//求一张纸要折叠多少次才能达到珠穆朗玛风的高度
public class WhileTest01 {
    public static void main(String[] args) {
        double peakHeight = 8848860;
        double paperThickness = 0.1;
        int count = 0;
        while (paperThickness < peakHeight){
            paperThickness *=2;
            count++;
        }
        System.out.println("折叠次数为："+count);
    }
}
