
import java.util.*;

import static java.lang.Boolean.TRUE;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a hexadecimal number: ");
        String input = scan.next();
        long output = 0;
        int num;
        int i = 0;
        if (input.startsWith("0x")== TRUE) {
            //To skip the '0x', we move index forward by 2
            i = 2;
        }
        int j = i;

            while( j < input.length()){
                //Go through input character by character
                char hexVal = input.charAt(j);

                //Assigning values to letters A-F
                if (hexVal == 'A' || hexVal == 'a'){
                     num = 10;
                }
                else if (hexVal == 'B' || hexVal == 'b'){
                     num = 11;
                }
                else if (hexVal == 'C' || hexVal == 'c'){
                     num = 12;
                }
                else if (hexVal == 'D' || hexVal == 'd'){
                     num = 13;
                }
                else if (hexVal == 'E' || hexVal == 'e'){
                     num = 14;
                }
                else if (hexVal == 'F' || hexVal == 'f'){
                     num = 15;
                }
                else{
                    num = (int)hexVal-48;//Accounting for ASCII values being 48 above
                }
                //Math functions
                output = (long) (output + num*Math.pow(16, input.length()-(j+1)));
                //Just to help see what the output is. NOT FOR FINAL CODE
                j++;
            }
            System.out.println("Your number is " + output + " in decimal\n");

            }
}
