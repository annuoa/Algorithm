package Swordfinger;

public class NO34 {
/**
 * 题目：求第1500个丑数
 * 丑数的定义，我们把因子只包含2/3/5的数据称为丑数
 * @param args
 */
	public boolean isUgly(int number){
		while (number%2==0) {
			 number/=2;
		}
		while (number%3==0) {
			number/=3;
		}
		while (number%5==0) {
			number/=5;
		}
		if (number==1) {
			return true;
		}else {
			return false;			
		}
	}
	public int getUglyNumber(int index){
		if (index<=0) {
			return 0;
		}
		int number=0;
		int uglyNumber = 0;
		while (uglyNumber<index) {
			number++;
			if (isUgly(number)) {
				uglyNumber++;
			}
			//前面number=1；此处number++
		}
		return number;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NO34 no34 = new NO34();
		System.out.println(no34.getUglyNumber(3));
	}
}
