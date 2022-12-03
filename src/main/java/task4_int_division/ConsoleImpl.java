package task4_int_division;

import java.util.Scanner;

public class ConsoleImpl implements Console {
    
    private Scanner scan;

    public void print(String stringForPrint) {
        System.out.println(stringForPrint);
        
    }
    
    public void print(int stringForPrint) {
        System.out.println(stringForPrint);
        
    }

    public int read() {
        scan = new Scanner(System.in);
        int result = 0;
        try {
            result = scan.nextInt();
        } catch(Exception e) {
            print("неверно введено число");
        } finally {
            scan.close();
        }
        return result;
        
    }
    
   
}
