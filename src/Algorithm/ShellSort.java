package Algorithm;
/*
    1希尔排序是希尔（Donald Shell）于1959年提出的一种排序算法。希尔排序也是一种插入排序，它是简单
插入排序经过改进之后的一个更高效的版本，也称为缩小增量排序，同时该算法是冲破O(n2）的第一批算法之
一。它与插入排序的不同之处在于，它会优先比较距离较远的元素。希尔排序又叫缩小增量排序。
先将整个待排序的记录序列分割成为若干子序列分别进行直接插入排序，具体算法描述：
    2选择一个增量序列t1，t2，…，tk，其中ti>tj，tk=1；
按增量序列个数k，对序列进行k 趟排序；
每趟排序，根据对应的增量ti，将待排序列分割成若干长度为m 的子序列，分别对各子表进行直接插入排序。仅增
量因子为1 时，整个序列作为一个表来处理，表长度即为整个序列的长度。
 */
public class ShellSort {
    public static void main(String[] args) {
    int[] array = new int[]{8, 6, 4, 1, 9, 3, 7, 0, 2, 5};
        if(array.length > 0){
            int len = array.length;
            int gap = len / 2;
            while(gap > 0){
                for(int i = gap;i < len;i++){
                    int temp = array[i];
                    int index = i - gap;
                        while(index >= 0 && array[index] > temp){
                            array[index + gap] = array[index];
                             index -= gap;
                        }
                array[index + gap] = temp;
                }
            gap /= 2;
        }

    }
        for (int k = 0; k < array.length; k++) {
            System.out.print(" " + array[k]);
        }
    }
}
