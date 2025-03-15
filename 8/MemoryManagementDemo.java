import java.util.*;

public class MemoryManagementDemo {
    public static void main(String[] args) {
        ArrayList<int[]> memoryLeakList = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            int[] largeArray = new int[1000];
            memoryLeakList.add(largeArray);
            if (i % 10000 == 0) {
                System.out.println("Added " + (i + 1) + " objects to the list.");
            }
        }
        System.out.println("Simulation completed. Observe memory usage using monitoring tools.");
    }
}
