package LightCode;

import java.util.Scanner;

public class RunNian {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input the year:");
		int year = 0;
		Scanner scanner=new Scanner(System.in);
		year=scanner.nextInt();
		if(year <0||year>9999){
			System.out.println("The year is wrong,please cheak!");
		}
		if((year %4==0)&& (year%100!=0)){
			System.out.println("It is a RUN year!");
		}
		else{
			System.out.println("It is not a RUN year!");
		}

	}

}

