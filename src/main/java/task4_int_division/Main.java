package task4_int_division;

public class Main {
    
    

    public static void main(String[] args) {
        Console console = new ConsoleImpl();
        console.print("¬ведите делимое");
        int dividend = console.read();
        console.print(dividend);
    }

}
