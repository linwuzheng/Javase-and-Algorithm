package Algorithm;
/*
快速排序
    1快速排序是对冒泡排序的一种改进。通过一趟排序将要排序的数据分割成独立的两部分，其中一部分的所有数据
都比另一部分所有的数据都要小，然后再按此方法对这两部分数据分别进行快速排序，整个排序过程可以递归进
行，以此达到整个数据变成有序序列
    2算法描述
快速排序使用分治法来把一个串（list）分为两个子串（sub-lists）。具体算法描述如下：
从数列中挑出一个元素，称为 “基准”（pivot）；
重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。在这个分区退出之后，该基准就处于数列的中间位置。这个称为分区（partition）操作；
递归地（recursive）把小于基准值元素的子数列和大于基准值元素的子数列排序。

 */
public class QuickSort {
    public static void QuickSort(int[] array,int low,int hight){
        //if (array.length < 1 || low < 0 || hight >= array.length || low > hight) return null;
        if(low < hight){
            int privotpos = partition(array,low,hight);
            QuickSort(array,low,privotpos - 1);
            QuickSort(array,privotpos + 1,hight);
        }

    }
    public static int partition(int[] array,int low,int hight) {
        int privot = array[low];
        while (low < hight) {
            while (low < hight && array[hight] >= privot) --hight;
            array[low] = array[hight];
            while (low < hight && array[low] <= privot) ++low;
            array[hight] = array[low];
        }
        array[low] = privot;
        return low;
    }
}
