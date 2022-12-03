package task4_int_division;

public class Division {
    
    private int dividend;
    private int divider;
    private int dividendAbsValue;
    private int dividerAbsValue;
    private StringBuilder result = new StringBuilder("");
    
    public Division(int dividend, int divider) {
        this.dividend = dividend;
        this.divider = divider;
    }
    
    public StringBuilder run() {
        dividendAbsValue = getAbsValue(dividend);
        dividerAbsValue = getAbsValue(divider);
        
        
        return null;
        
    }
        
    
    
    public int getAbsValue(int number) {
        return Math.abs(number);
    }
    
    public int trimNumber(int number, int digits) {
        return (int) (number/Math.pow(10, digits));
        
    }
    
    public int getNumberLength(int number) {
        return (int) (Math.log10(number) + 1);
    }

}
