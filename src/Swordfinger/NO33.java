package Swordfinger;

import java.util.Arrays;
import java.util.Comparator;


public class NO33 {
	/**
	 * @author Annuoa
	 * @param numbers
	 * @return
	 * 题目：33，把数组排成最小的数
	 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
	 * 解题思路：
	 * 数组中的所有的数据进行拼接，可能会大于整数的范围，所以要用字符串来进行处理
	 * 需要找到一个排序规则，然后将数字按照排序规则从小到大进行排序，最后顺序输出
	 * 
	 * 根据题目的要求，两个数字m和n能拼成数字mn和nm。如果mn<nm，那么我们应该打印出mn，即m应该排在n的前面，我们此时定义m小于n；反之，如果nm<mn，我们定义n小于m。如果mn=nm，我们定义m等于n。（注：符号的<，>, =是常规意义的数值大小，而文字的“大于”，“小于”，“等于”表示我们新定义的大小关系）。
	 */
    public String PrintMinNumber(int [] numbers) {
    	String string = "";
    	if (numbers==null||numbers.length<0) {
			return string;
		}
    	Integer [] num = new Integer[numbers.length];
    	for (int i = 0; i < numbers.length; i++) {
			num[i]=numbers[i];
		}
    	Arrays.sort(num, new Comparator<Integer>() {
    		@Override
    		public int compare(Integer o1, Integer o2) {
    			// TODO Auto-generated method stub
    			return (o1+""+o2).compareTo(o2+""+o1);
    		}
		});
    	for (int i = 0; i < num.length; i++) {
			string+=num[i];
		}
    	return string;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr={3,32,321};
		NO33 no33 = new NO33();
		System.out.println(no33.PrintMinNumber(arr));
	}

}
