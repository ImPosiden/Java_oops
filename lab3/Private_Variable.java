package lab3;
import java.util.Scanner;
class demo{
	private int a = 1;
	public int geta(){
		return a;
	}
	public void seta(int a) {
		this.a=a;
	}
	void printdemo() {
		System.out.println(a);
	}
}
public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		demo d1 = new demo();
/*		System.out.print("print private Variable from class :");
		d1.printdemo();
		System.out.print("print private Variable from Main :");
		System.out.println(d1.geta());
*/
		System.out.print("Enter a number to set the private variable :");
		int c=sc.nextInt();
		d1.seta(c);
		System.out.print("print private Variable from class :");
		d1.printdemo();
		System.out.print("print private Variable from Main :");
		System.out.println(d1.geta());
	}

}
