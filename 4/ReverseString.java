public class ReverseString {
    public static void main(String[] args) {
        String name = "MohithDaltonJeyaramS";
        String temp = "";
        int pointer = name.length() - 1;
        
        while (pointer >= 0) {
            temp += name.charAt(pointer);
            pointer--;
        }
        System.out.println(temp);
    }
}
