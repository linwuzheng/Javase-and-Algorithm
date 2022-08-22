package Algorithm;
/*冒泡排序（降序）
    1 它重复地走访过要排序的元素列，依次比较两个相邻的元素，如果顺序（如从大到小、首字母从Z到A）错误
就把他们交换过来
    2实现原理
比较相邻的元素。如果第一个比第二个大，就交换他们两个。
对每一对相邻元素做同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
针对所有的元素重复以上的步骤，除了最后一个。
持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[]  Array=new int[]{8,6,4,1,9,3,7,0,2,5};
            for (int i = 0;i < Array.length; i++)
                for (int j = 0; j < Array.length -i -1; j++) {
                    if (Array[j + 1] > Array[j]) {
                        int temp = Array[j + 1];
                        Array[j + 1] = Array[j];
                        Array[j] = temp;
                    }
                    System.out.println("------------");
                    //PrintArray.print(nums);
                    for (int k = 0; k < Array.length; k++) {
                        System.out.print(" "+Array[k]);
                    }
                    System.out.println();
                }

        }
    }

