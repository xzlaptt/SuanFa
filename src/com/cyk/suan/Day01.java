package com.cyk.suan;

import java.util.Arrays;

public class Day01 {
	
	public static void main(String[] args) {
		//已知的排序好的数组
		int a[] = {0,0,0,1,1,2,2,3,4,5};
		System.out.println("原来的数组是："+Arrays.toString(a));
	
		int n = remove(a);
//		int m = 1;
//		for (int i=0;i<a.length;i++) {
//			for(int j = i+1;j<a.length;j++){
//				if (a[i]!=a[j]) {
//					m++;
//					for(int n = i+1;n<j;n++){
//						a[n]=a[j];
//					}
//					break;
//				}
//			}
//		}
		System.out.println("改变后的数组长度："+n);
	}
	
	/**
	 * 通过一个数组的两个指针来处理
	 * @param nums
	 * @return
	 */
	public static int  remove(int []nums) {
		if (nums == null||nums.length==0) {
			return 0;
		}
		int p = 0;
		
		for (int q = 1; q < nums.length; q++) {
			if (nums[p] != nums[q]) {
				p++;
				nums[p]= nums[q];
			}
		} 
		return p;
	}

}
