package Algorithm;
/*
    1可以将堆看做是一个完全二叉树。并且，每个结点的值都大于等于其左右孩子结点的值，称为大顶堆；或者
每个结点的值都小于等于其左右孩子结点的值，称为小顶堆。
    2堆排序(Heap Sort)是利用堆进行排序的方法。其基本思想为：将待排序列构造成一个大顶堆(或小顶堆
)，整个序列的最大值(或最小值)就是堆顶的根结点，将根节点的值和堆数组的末尾元素交换，此时末尾元素就
是最大值(或最小值)，然后将剩余的n-1个序列重新构造成一个堆，这样就会得到n个元素中的次大值(或次小值)
，如此反复执行，最终得到一个有序序列。
*/
public class HeapSort {
    public static void heapAdjust(int[] array,int index,int length){
        //保存当前结点的下标
        int max = index;
        //当前节点左子节点的下标
        int lchild = 2*index;
        //当前节点右子节点的下标
        int rchild = 2*index + 1;
        if(length > lchild && array[max] < array[lchild]){
            max = lchild;
        }
        if(length > rchild && array[max] < array[rchild]){
            max = rchild;
        }
        //若此节点比其左右孩子的值小，就将其和最大值交换，并调整堆
        if(max != index){
            int temp = array[index];
            array[index] = array[max];
            array[max] = temp;
            heapAdjust(array,max,length);
        }

    }

    /**
     * 堆排序
     * @param array
     * @return
     */
    public static int[] heapSort(int[] array){
        int len = array.length;
        //初始化堆，构造一个最大堆
        for(int i = (len/2 - 1);i >= 0;i--){
            heapAdjust(array,i,len);
        }
        //将堆顶的元素和最后一个元素交换，并重新调整堆
        for(int i = len - 1;i > 0;i--){
            int temp = array[i];
            array[i] = array[0];
            array[0] = temp;

            heapAdjust(array,0,i);
        }
        return array;
    }

}
