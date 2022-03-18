package sort;

import java.util.Arrays;

/**
 * @author fangzhou
 * @date 2022-03-18 21:37
 */
public class QuickSort {

    public static void main(String[] args) {

        int arr[] = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};

        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));

    }

    public static void quickSort(int[] arr, int left, int right) {

        // 当左边大于于右边的时候直接返回
        if (right <= left) {
            return;
        }
        int key = arr[left];// 进行划分的值
        int i = left, j = right;//
        while (i < j) {

            // 在右边找到第一个比key小的值
            while (i < j && arr[j] >= key) {
                j--;
            }
            // 在左边找到第一个比key大的值
            while (i < j && arr[i] <= key) {
                i++;
            }
            if (i < j) {
                exch(arr, i, j);
            }

        }
        // 这个时候i和j已经是相等的了，j右边的元素都不小于key，所以把key和j所对应的元素直接交换位置就行了，接下来就是将key放到相应的位置。
        exch(arr, left, j);
        quickSort(arr, left, i - 1);
        quickSort(arr, i + 1, right);

    }

    public static void exch(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
