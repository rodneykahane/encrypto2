package encrypto2;

import static java.lang.Integer.toBinaryString;
import java.util.Scanner; // Reading from System.in
import java.util.*;

public class Encrypto2 {

    public static void main(String[] args) {
        
        int choice=0;
                
        while (choice !=3) {
        
            System.out.println("Welcome to encrypto!");
            System.out.println("  press 1 to encrypt");
            System.out.println("  press 2 to decrypt");
            System.out.println("  press 3 to exit");
            System.out.print("Selection: ");
            Scanner choiceScan = new Scanner(System.in);
            choice = choiceScan.nextInt();    
            
                if (choice == 1) {

                   encryptString();

                } else if (choice == 2){

                    decryptString();
            
                } //end if
        } //end while
        
        
    } //end main
    
        
   public static void encryptString(){
        
        String Msg = "";
        char Key = 'a';
        String CTxt = "";
        int xor;
        char temp;
        
        System.out.print("Enter something to encrypt: ");
        Scanner string2encrypt = new Scanner(System.in);
        Msg = string2encrypt.nextLine();
        System.out.print("Enter the cipher key: ");
        Scanner encryptKey = new Scanner(System.in);
        Key = encryptKey.next().charAt(0);
        
        
        /*
        //using char foo = (char) bar, where bar is an int, the value of bar must be between 65&90ish (ascii values) 
        int a=66;
        char b= (char)a;        
        System.out.println("b is "+b);
        */
        
        /*
        //test code
        String a = "abcde";
        String b = "vwxyz";
          for (int i = 0; i < b.length(); i++) {
            System.out.printf("xoring <%s> [%s] with <%s> [%s]\n", a.charAt(0), toBinaryString(a.charAt(0)), b.charAt(i), toBinaryString(b.charAt(i)));
            int c = 65+(a.charAt(0) ^ b.charAt(i));
            System.out.printf("c is %d ... result is <%s> [%s]\n", c, (char) c, toBinaryString(c));
            
        }
        */
        
        
        for(int i = 0; i < Msg.length(); i++) {
           // System.out.println("key is "+ Key);
          //  System.out.println("Msg.charAt("+i+") is "+Msg.charAt(i));
          
            xor = (Msg.charAt(i) ^ Key)+65; //65 is padding to get numbers into ascii range
            temp = (char)xor;
            CTxt = CTxt + temp;

            //System.out.println("xor is " + xor + " temp is " + temp + " and CTxt is "+ CTxt);
            
        }//end for
        
        System.out.println(CTxt);
   } //end encryptString
      
   public static void decryptString() {
       
        String Msg = "";
        char Key = 'k';
        String CTxt = "";
        int xor;
        char temp;
        
        System.out.print("Enter something to decrypt: ");
        Scanner string2encrypt = new Scanner(System.in);
        Msg = string2encrypt.nextLine();
        System.out.print("Enter the cipher key: ");
        Scanner encryptKey = new Scanner(System.in);
        Key = encryptKey.next().charAt(0);
        
        for(int i = 0; i < Msg.length(); i++) {
            
            xor = (Msg.charAt(i) ^ Key); //65 is padding to get numbers into ascii range
            temp = (char)xor;
            CTxt = CTxt + temp;
        }
        
        System.out.println(CTxt);
    }
    
   
} //end public class
