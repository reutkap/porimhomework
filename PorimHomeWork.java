import java.util.*;
public class PorimHomeWork {
public static Scanner input=new Scanner (System.in);
public static double posAvg(int[][] m){
	int rows = m.length;
	int cols = m[0].length;
int sum = 0; int count=0;
for(int i=0;i<rows;i++) {
	for(int j=0;j<cols;j++) {
		if(m[i][j]>0) {
			sum+=m[i][j];
			count++;
		}
	}

}
return (double)sum/count;
}	
public static double big (int [][]m) {
	int rows = m.length;
	int cols = m[0].length;
	int max=0; int sum=0;
	for(int i=0;i<rows;i++) {
		max=m[i][0];
		for(int j=0;j<cols;j++) {
			if((double)m[i][j]>max) {
				max=m[i][j];
			}
		}
		sum+=max;
	}
	return (double)sum/rows;
}
public static double small (int [][]m) {
	int rows = m.length;
	int cols = m[0].length;
	int min=m[0][0]; int sum=0;
	for(int i=0;i<rows;i++) {
		min=m[i][0];
		for(int j=0;j<cols;j++) {
			if((double)m[i][j]<=min) {
				min=m[i][j];
			}
		}
		sum+=min;
	}
	return (double)sum/rows;
}
	public static void main(String[] args) {
		int [][] a=new int [4][4];
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[0].length;j++) {
		System.out.println("enter a number");
		a[i][j]=input.nextInt();
		}
	}
	System.out.println(small(a));
	}

}
