package com.personage.demo.pojo.programme;

import java.util.Scanner;

public class ZingFrontTest2018C2 {


	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int devivingInt = DevivingInt(k);
		if (devivingInt == 0) {
			System.out.println("没有任何分解组合");
		} else {
			System.out.println("共找到" + devivingInt + "种拆分方法");
		}
	}

	public static int DevivingInt(int num) {
		// count记录拆分方法总数，
		int count = 0;
		//相加的结果
		int sum = 0;
		//start是满足拆分的起始值
		int start;
		//end是结束值
		int end;
		//获取最小值
		for (int i = 1; i <= num / 2; i++) {
			start = i;
			sum = 0;
			end = 0;
			//获取最大值
			for (int j = start; j <= num; j++) {
				if ((sum + j) < num) {
					sum += j;

				} else if (sum + j == num) { 
					
					end = j;
					// 打印拆分
					print(start, end);
					count++;

				} else {
					break;
				}
			}

		}
		return count;
	}

	public static void print(int start, int end) {
		StringBuilder sb = new StringBuilder();
		while (start < end) {
			sb.append(start + " ");
			start++;
		}
		if (start == end) {
			sb.append(start + " ");
		}
		System.out.println(sb);

	}

}
