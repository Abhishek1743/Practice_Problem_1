import java.util.Scanner;
class week{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		switch(n){
			case 0:
				System.out.println("zero");
				break;
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
			case 6:
				System.out.println("Six");
				break;
			case 7:
				System.out.println("Seven");
				break;
			case 8:
				System.out.println("Eight");
				break;
			case 9:
				System.out.println("Nine");
				break;
			default:
				System.out.println("Wrong number entered");
		}
	}
}
