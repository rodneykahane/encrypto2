//test3
package encrypto2;

import java.util.Scanner; // Reading from System.in

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
        
        
        for(int i = 0; i < Msg.length(); i++) {
            
            xor = Msg.charAt(i) ^ Key;
            temp = (char)xor;
            CTxt = CTxt + temp;
        }
        
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
            
            xor = Msg.charAt(i) ^ Key;
            temp = (char)xor;
            CTxt = CTxt + temp;
        }
        
        System.out.println(CTxt);
    }
    
   
} //end public class
