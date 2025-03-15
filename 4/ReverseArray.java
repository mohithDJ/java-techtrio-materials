public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int first=0;
        int last=array.length-1;
        System.out.println(last);
        while(first<last){
            int temp= array[last];
            array[last] = array [first];
            array [first]= temp;
            first++;
            last--;
       }
       for (int i=0;i<array.length;i++){
       System.out.println(array[i]);
    }
}
}
