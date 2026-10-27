import java.util.*;
public class FizzBuzz {
   public static void main(String[] args) {
    Scanner scn =new Scanner(System.in);
    int n=scn.nextInt();
    ArrayList<String> result=fizzbuzz(n);

    System.out.print(result);
   }
   static ArrayList<String> fizzbuzz(int n){
    ArrayList<String> arr=new ArrayList<>();

    for(int i=1; i<=n; i++){
        if(i%3==0 && i%5==0){
            arr.add("FizzBuzz");
        }
        else if(i%3==0){
            arr.add("Fizz");
        }
        else if(i%5==0){
            arr.add("Buzz");
        }
        else{
            arr.add(Integer.toString(i));
        }

    }
    return arr;

   }
}
