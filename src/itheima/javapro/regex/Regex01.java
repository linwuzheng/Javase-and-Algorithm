package itheima.javapro.regex;

//正则表达式的使用，校验数据
public class Regex01 {
    public static void main(String[] args) {
//需求：判断qq号是否满足全是数字且长度在6-20
        System.out.println(checkQQ("1443149335"));
        System.out.println(checkQQ("441939770"));
        System.out.println(checkQQ("520"));
        System.out.println("-----------");
        System.out.println(checkQQ1("144a149335"));
        System.out.println(checkQQ1("441939770"));
        System.out.println(checkQQ1("4419397705544558855"));
    }
//    正则表达式方法
    public static boolean checkQQ1(String qq){
        return qq != null && qq.matches("\\d{6,20}");
    }
//    普通方法
    public static boolean checkQQ(String qq){
        if(qq == null || qq.length() < 6 || qq.length() > 20){
            return false;
        }
        for (int i = 0; i < qq.length(); i++) {
            char ch = qq.charAt(i);
            if(ch <'0' || ch > '9'){
                return false;
            }
        }
        return true;
    }
}
