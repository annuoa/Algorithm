package Swordfinger;

public class NO38 {
/**
 * 数字在排序数组中出现的次数
 * 统计一个数字在排序数组中出现的次数。
 * 例如输入排序数组{1，2，3，3，3，3，4，5}和数字3，由于3在这个数组中出现了4次，因此输出4
 * 
 * 解题思路：
 * 			1、最简单的方式：通过遍历开始查找，当找到相同的则计数器加一，时间复杂度为o(n)
 * 			2、用二分查找算法，由于待查数k可能出现多次，所以找到的待查数k的左面和右面都有可能出现，所以用二分查找需要注意
 * 			  当查找到待查数字k时，需要判断这个数字是不是第一个or最后一个待查数k
 * @param args
 */
	//解题思路一：第一种方法
	 public int GetNumberOfK1(int [] array , int k) {
		 int num=0;
		 if (array.length==0||array==null||k<array[0]||k>array[array.length-1]) {
			return num;
		}
		 for (int i = 0; i < array.length; i++) {
			if (array[i]==k) {
				num++;
			}
		}
	       return num;
	    }
	 //解题思路二：第二种方法
	 //查找第一个k值
	 public int GetFirstK(int []array,int length,int k,int start,int end){
		 if (start>end) {
			return -1;
		}
		 int middleIndex = (start+end)/2;
		 int middleData = array[middleIndex];
		 if (middleData==k) {
			if ((middleIndex>0&&array[middleIndex-1]!=k)||middleIndex==0) {//找到第一个k
				return middleIndex;
			}else {
				end = middleIndex-1;
			}
		}else if(middleData<k) {
			start=middleIndex+1;
		}else {
			end = middleIndex-1;
		}
		 return GetFirstK(array, length, k, start, end);
	 }
	 //查找最后一个k值
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NO38 no38=new NO38();
		int []array = {1,2,3,3,3,3,4,5};
		System.out.println(no38.GetNumberOfK1(array, -3));
		
	}

}
