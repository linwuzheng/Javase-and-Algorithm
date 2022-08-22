package Algorithm;

//返回小于指定数字的素数的个数
public class SuShu {
    public static void main(String[] args) {
        System.out.println(suShu(2));
        System.out.println(suShu(3));
        System.out.println(suShu(10));
        System.out.println(suShu(100));


    }
    public static int suShu(int n) {
        int count = 1;
        for (int i = 2; i <= n; i++) {
            count += isPrime(i) ? 1 : 0;
        }
        return count;
    }

    private static boolean isPrime(int i) {
        for (int j = 2; j < i; j++) {
            if(i % j == 0){
                return false;
            }
        }
        return true;
    }
}
