import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of your array - ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter the " + (i + 1) + " number of your array");
            array[i] = scanner.nextInt();
        }
        System.out.print("your array is - ");
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
        boolean answer = almostIncreasingSequence(array);
        System.out.println(answer);
    }

    public static boolean almostIncreasingSequence(int[] sequence) {
        int size = sequence.length;
        int count = 0;
        for (int pos = 0; pos < size - 1; pos++) {
            if (sequence[pos + 1] <= sequence[pos]) {
                count++;
                boolean skipNeighbor = pos + 2 < size && sequence[pos + 2] <= sequence[pos];
                boolean skipBack = pos - 1 >= 0 && sequence[pos + 1] <= sequence[pos - 1];
                if (skipNeighbor && skipBack || count > 1) {
                    return false;
                }
            }
        }
        return true;
    }
}


