package com.personage.demo.pojo.programme;

import java.util.Scanner;
/**
 *@ClassName Resume
 *@author ZhangJie
 *@date2019/7/11 11:19
 *@Description TODO
 **/
public class ZingFrontTest2018C1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String t = scanner.nextLine();
		// t 的长度要大于等于s的长度。
		while (t.length() < s.length()) {
			int i;
			int j;
			int w = 0;
			for (i = 0; i <= s.length() - 1; i++) {
				// 从w 开始匹配。
				for (j = w; j <= t.length() - 1; j++) {
					if (s.charAt(i) == t.charAt(j)) {
						// 找到匹配的，w递增1。 内层循环中断，判断下一个。
						w++;
						break;
					}
				}
			}
			// 循环结束，判断w的长度。
			if (w == s.length()) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}
