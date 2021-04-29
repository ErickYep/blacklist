import java.util.stream.IntStream;

public class Name2 {
    public static void main(String[] args) {
        String text1 = "Kill all humanz";
        String text2 = "Happy new Year";
        char lastChar1 = text1.charAt(text1.length()-1);
        char lastChar2 = text2.charAt(text2.length()-1);
        boolean bool = lastChar1 == lastChar2;
        System.out.println(bool);
    }
}
