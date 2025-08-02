package lab_2;
import java.util.Scanner;
class Box{
	double len , width ,depth;
	Box(int a,int b,int c){
		len=a;
		width=b;
		depth=c;
	}
	void Volume(){
		System.out.println("Volume = " + (len * width * depth));
	}
}
public class Volume_Box {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.print("Enter the Length :");
		a = sc.nextInt();
		System.out.print("Enter the Width :");
		b = sc.nextInt();
		System.out.print("Enter the Depth :");
		c = sc.nextInt();
		Box d = new Box(a,b,c);
		d.Volume();
	}

}
