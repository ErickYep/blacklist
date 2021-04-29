import java.util.Random;
import java.util.Scanner;

public class Name1 {
    public static void main(String[] args) {
        float f = 7.1f;
        System.out.println("enter your text");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int irandom = random.nextInt();
        String value = scanner.nextLine();
        System.out.println(value);
        System.out.println(irandom);
    }
}
