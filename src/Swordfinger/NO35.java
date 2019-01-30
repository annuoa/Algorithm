package Swordfinger;

import java.util.HashMap;

public class NO35 {
	/**
	 * 在字符串中找出第一个只出现一次的字符，如输入：abaccdeff则输出b
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "abaccdeff";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < string.length(); i++) {
			if (map.get(string.charAt(i)) != null) {
				map.put(string.charAt(i), map.get(string.charAt(i)) + 1);
			} else {
				map.put(string.charAt(i), 1);
			}
		}

		for (int i = 0; i < string.length(); i++) {
			if (map.get(string.charAt(i)) == 1) {
				System.out.println(string.charAt(i));
				break;
			}
		}
	}
}
