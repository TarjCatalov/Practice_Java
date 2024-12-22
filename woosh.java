import java.util.*;

public class woosh {
    public int myNum;
    public static void main(String[] args) {
        woosh UI = new woosh();
        UI.run();
    }

    public void run() {
        Scanner keyboard = new Scanner(System.in);
        
        optionChoice(0);

        keyboard.close();
    }

    public void optionChoice(int choice) {
        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.println("option 0");
            System.out.println("option 1");
            System.out.println("option 2");
            System.out.println("option 3");
            System.out.println("option 4");
            System.out.println("option 5");

            choice = keyboard.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("WORKING!!");
                    break;
                case 2:
                    System.out.println("WOOO");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 5:
                    System.out.println("5");
                    break;
                case 0:
                    break;
            }
        } while (choice != 0);

        keyboard.close();
    }

    public int getnum() {
        return myNum;
    }

    public void setNum(int myNum) {
        this.myNum = myNum;
    }
}
