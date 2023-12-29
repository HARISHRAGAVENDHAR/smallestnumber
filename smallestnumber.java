package smallestnumber;
import java.util.Scanner;
public class smallestnumber {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int num1 = Scanner.nextInt();
        int num2 = Scanner.nextInt();
        int num3 = Scanner.nextInt();

        int smallest = findSmallest(num1, num2, num3);

        System.out.println("The smallest number is: " + smallest);

        Scanner.close();
    }

    public static int findSmallest(int x, int y, int z) {
        return Math.min(Math.min(x,y), z);


	}

}
