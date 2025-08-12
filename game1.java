import java.util.random.*;
import java.util.Random;
import java.util.Scanner;
class game{
    Scanner sc = new Scanner(System.in);
    Random num = new Random();
    int number;
    int input;
    int count;
    public game(){
         number = num.nextInt(1,10);  
    }
    public void userinput(){
        System.out.println("Enter a number between 1-10: ");
        while (input!=number) {
           input = sc.nextInt(); 
        if(input<number){
        System.out.println("You number is smaller");
    }
        else if(input>number){
        System.out.println("Your number is bigger");
    }
        else{
        System.out.println("You guessed right number: "+number);
    }
    count++;
        }     
    }
    int trial(){
        return count;
    }
}
public class game1 {
        public static void main(String[] args) {
        
            game obj = new game();
            obj.userinput();
            System.out.println("Number of trials you used: "+obj.count);

    }
}