import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What Number are you looking for?: ");
        int num = keyboard.nextInt();
        int[] myArray = {10, 12, 234, 4, 1, 23, 76, 86, 34};
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == num) {
                System.out.println(num+" Is in array");
                break;
            } else if (myArray.length-1 != num) {
                System.out.println(num+" Is not in array");
                break;
            }
        }
        keyboard.close();
    }
}
