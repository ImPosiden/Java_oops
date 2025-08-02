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
		int True=1;
		while (True==1) {
			Scanner sc =new Scanner(System.in);
			int a,num1,num2;
			System.out.print("Enter the First Number :");
			num1=sc.nextInt();
			System.out.print("Enter the Second Number :");
			num2=sc.nextInt();
			System.out.println("-------MENU------- \n1)Add\n2)Subtract\n3)Multiply\n4)Divide\n5)Exit\nEnter your Choice (eg : 1,2,3,4,5)");
			a = sc.nextInt();
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
				case 5:
					True=2;
					break;
				default:
					System.out.println("Invalid Operation");
			}
		}
	}

}
