public class Random {
    public static void main(String[] args) {

        java.util.Random random = new java.util.Random();
        int randomInt =700 + random.nextInt(800);
        System.out.println(randomInt);

    }
}
