package com;

public class yanghui {
	public static void main(String[] args) {
		
		int [][] yangHui = new int [10][];
		for(int i =0; i<yangHui.length;i++) {
			yangHui[i]= new int [i+1];
			yangHui[i][0]=1;
			yangHui[i][i]=1;
			//if(i>1) {
				for(int j =1;j<yangHui[i].length-1;j++) {
				    yangHui[i][j]= yangHui[i-1][j-1]+yangHui[i-1][j];
				    //给每行的首末元素赋值
				}
			}
		//}
		for(int i =0;i<yangHui.length;i++) {123
			for(int j =0; j<yangHui[i].length;j++) {
				System.out.print(yangHui[i][j]+" ");
			}
			System.out.println();
		}
	}
}
