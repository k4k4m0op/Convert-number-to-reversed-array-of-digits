import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = Math.abs(random.nextInt()) +1;
        int numberOfDigits = String.valueOf(randomNumber).length();
        int[] numbers = new int[numberOfDigits];

        System.out.println(randomNumber);

        int index = 0;
        while (randomNumber > 0){
            int number = randomNumber % 10;
            numbers[index] = number;
            randomNumber = randomNumber / 10;
            index++;
        }

        System.out.println(Arrays.toString(numbers));



    }
}
