//import java.util.*;

public class undead {
    String type;
    String colour;
    int health;

    private undead() {
        type = "Walker";
        colour = "Green";
        health = 10;
    }
    public static void main(String[] args) {
        undead[] zombie = new undead[10];
        for (int i = 0; i < 10; i++) {
            zombie[i] = new undead();
            zombie[2].type = "SPRINTER";
            System.out.println((1+i)+" "+zombie[i].type+" "+zombie[i].colour+" "+zombie[i].health+"HP");
        }
    }
}