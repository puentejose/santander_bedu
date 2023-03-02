public class IntegerToBinary {
    public static void main(String[] args) {
        int decimalNumber = 10;

        String binaryNumber = Integer.toBinaryString(decimalNumber);

        System.out.println("La representacion binaria de " + decimalNumber + " es: " + binaryNumber);
    }
}
