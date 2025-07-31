package lab_2;
import java.util.Scanner;
class MyCalculator{
	int num1,num2 ;
	MyCalculator(int a,int b){
		num1=a;
		num2=b;
	}
	int Add() {
		return (num1+num2);
	}
	int Subtract() {
		return (num1-num2);
	}
	int Multiply() {
		return (num1*num2);
	}
	double Divide() {
		return (num1/num2);
	}
}
public class Menu_Driven_Calculator {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a,num1,num2;
		System.out.println("-------MENU------- \n1)Add\n2)Subtract\n3)Multiply\n4)Divide");
		a = sc.nextInt();
		System.out.print("Enter the First Number :");
		num1=sc.nextInt();
		System.out.print("Enter the Second Number :");
		num2=sc.nextInt();
		MyCalculator cal = new MyCalculator(num1,num2);
		switch (a) {
			case 1:
				System.out.print(num1 +"+"+num2+"="+ cal.Add());
				break;
			case 2:
				System.out.print(num1 +"-"+num2+"="+ cal.Subtract());
				break;
			case 3:
				System.out.print(num1 +"X"+num2+"="+ cal.Multiply());
				break;
			case 4:
				System.out.print(num1 +"/"+num2+"="+ cal.Divide());
				break;
			
		}

	}

}
