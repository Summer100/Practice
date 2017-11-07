package LightCode;

import java.util.Scanner;

public class Scores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input:");
		double score;
		Scanner scanner=new Scanner(System.in);
		score=scanner.nextDouble();
		if(score<0||score>100){
			System.out.println("Wrong input!");
		}
		else if(score>=90){
			System.out.println("A");
		}
		else if(score>=80){
			System.out.println("B");
		}
		else if(score>=70){
			System.out.println("C");
		}
		else if(score>=60){
			System.out.print("D");
		}
		else{
			System.out.println("F");
		}
						

	}
	

}
