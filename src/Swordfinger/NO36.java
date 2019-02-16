package Swordfinger;

import java.util.Arrays;
/**
 * 
 * @author Annuoa
 * 数组中的逆序对
 * 在数组中的两个数字，如果前面数字大于后面的数字，则这两个数字组成一个逆序对，输入一个数组，求出这个数组的逆序对的总数
 * 例如：{7,5,6,4}中，一共存在5个逆序对分别是(7,6)(7,5)(7,4)(6,4)(5,4)
 *解题思路：1、暴力解决法，直接两次for循环；
 *		  2、利用归并排序来解决,归并排序的时间复杂度为nlogn，此时在排序的过程中记录了出现逆序的次数
 */
public class NO36 {
	private static int num = 0;
	private static int[] temp;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {  0, 6, 5, 4, 3, 2, 1 };
		temp = new int[arr.length];
		sort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
		System.out.println("num is\t" + num);
	}

	public static void sort(int[] array, int begin, int end) {
		System.out.println(begin+"\t"+end);
		if (begin >= end) {
			return;
		}
		int mid = begin + (end - begin) / 2;
		sort(array, begin, mid);
		sort(array, mid + 1, end);
		merge(array, begin, mid, end);
	}

	public static void merge(int[] array, int begin, int mid, int end) {
		System.out.println("merge\t"+begin+"\t"+end);
		for (int i = begin; i <= end; i++) {
			temp[i] = array[i];
		}
		int i = begin, j = mid + 1, k = begin;
		while (i <= mid && j <= end) {
			if (temp[i] < temp[j]) {
				array[k++] = temp[i++];
			} else {
				num += mid - i + 1;//和归并排序不一样的地方，但凡i位置的数据大于j了，则从i到mid之间的数就都大于j，所以要统计一下
				array[k++] = temp[j++];
			}
		}
		while (i <= mid) {
			array[k++] = temp[i++];
		}

		while (j <= end) {
			array[k++] = temp[j++];
		}
	}

}
