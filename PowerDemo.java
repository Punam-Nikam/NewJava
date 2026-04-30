import java.util.Scanner;

// Functional Interface
interface Power {
int calculate(int x, int y);
}

public class PowerDemo {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter base (x): ");
    int x = sc.nextInt();

    System.out.print("Enter power (y): ");
    int y = sc.nextInt();

    Power p = (a, b) ->  (int) Math.pow(a,b);

    int result = p.calculate(x, y);

    System.out.println("Power is : " + result);
}


}
