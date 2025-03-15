import java.util.*;

public class FavoriteColors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();  

        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");

        System.out.println("Favorite Colors:");
        for (String color : colors) {
            System.out.println(color);  
        }
    }
}
