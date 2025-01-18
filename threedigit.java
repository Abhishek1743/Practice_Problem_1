import java.util.Scanner;
class threedigit{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first 3 digit number");
		int a=sc.nextInt();
		System.out.println("Enter second 3 digit number");
		int b=sc.nextInt();
		System.out.println("Enter third 3 digit number");
		int c=sc.nextInt();
		System.out.println("Enter fourth 3 digit number");
		int d=sc.nextInt();
		System.out.println("Enter fifth 3 digit number");
		int e=sc.nextInt();
		System.out.println("Minimum number is " + Math.min(Math.min(a,b), Math.min(Math.min(c,d),e)));
		System.out.println("Maximum number is " + Math.max(Math.max(a,b), Math.max(Math.max(c,d),e)));
	}
}
