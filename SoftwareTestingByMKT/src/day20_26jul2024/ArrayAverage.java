package day20_26jul2024;

public class ArrayAverage {

	public static void main(String[] args) {
		int nos[]=new int[4];
		nos[0]=17;
		nos[1]=35;
		nos[2]=81;
		nos[3]=42;
		double sum=0;
		for(int i=0;i<nos.length;i++) {
			sum=sum+nos[i];
		}
		double average = sum/4;
		System.out.println(average);
	}

	}