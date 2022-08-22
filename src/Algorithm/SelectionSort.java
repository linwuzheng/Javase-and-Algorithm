package Algorithm;
/*选择排序
    算法步驟
首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置；
再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾；
重复第2步，直到所有元素均排序完毕。
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = new int[]{8, 6, 4, 1, 9, 3, 7, 0, 2, 5};
        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                int minIndex = i;
                for (int j = i; j < array.length; j++) {
                    //遍历未剩余未排序元素中继续寻找最小元素
                    if (array[j] < array[minIndex]) {
                        minIndex = j;
                    }
                }
                if (minIndex != i) {
                    int temp = array[minIndex];
                    array[minIndex] = array[i];
                    array[i] = temp;
                }
            }

        }
        for (int k = 0; k < array.length; k++) {
            System.out.print(" " + array[k]);

        }
    }
}
