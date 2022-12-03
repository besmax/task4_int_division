package task4_int_division;

public class Main {
    static Console console;
    
    public static void main(String[] args) {
        console = new ConsoleImpl();
        
        console.print("¬ведите делимое");
        int dividend = console.read();
        
        console.print("¬ведите делитель");
        int divider = console.read();
        
        console.print(dividend + " " + divider);
    }

}
