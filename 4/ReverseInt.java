public class ReverseInt{
    public static void main(String[] args) {
        int num=12345;
        int reminder=0;
        int ans=0;
        while (num>0){
            reminder = num%10;
            num /= 10;
            ans = ans*10 + reminder;
        }
        System.out.println(ans);

    }
}
