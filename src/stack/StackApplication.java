package stack;
import java.util.Scanner;
/**
 * Created by Tom on 09/10/2015.
 */
public class StackApplication {

    public static void main(String[] args){

        Stack<String> s = new ArrayStack<>();
        Stack<String> t = new LinkedStack<>();
        int debug = 0;
        int x  = 1;
        int choice = 0;
        String text = "";
        Scanner kboard = new Scanner(System.in);
        while (x == 1){
           if (debug == 1){
               System.out.println(s.toString());
               System.out.println(t.toString());
           }
            System.out.println("\nPlease pick from one of the options below\n");
            System.out.println("1. Add  String");
            System.out.println("2. Remove String");
            System.out.println("3. Print Top");
            System.out.println("4. Exit");
            System.out.println("5. Debug Mode");

            choice = kboard.nextInt();

            if (choice == 1){//Add String
                System.out.println("Please enter a new String to add to both Stacks");
                text = kboard.next();

                s.push(text);
                t.push(text);



            }else if(choice ==2){//Remove Top
                System.out.println("Removing top from each stack");
                s.pop();
                t.pop();

            }else if(choice == 3){//Print Top
               System.out.println("Top of ArrayStack contains: " + s.top()) ;
               System.out.println("Top of LinkedStack contains: " + t.top()) ;
            }else if(choice == 4){//Exit
                System.exit(0);
            } else if(choice == 5){ //Debug Mode
                System.out.println("Debug mode now toggled");
                debug = 1;
            } else{
                System.out.println("Please only pick from the options listed");
            }
        }



    }
}
