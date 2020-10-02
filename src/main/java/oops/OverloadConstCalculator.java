package oops;

public class OverloadConstCalculator {
    public static void main(String[] args) {
        Calculator c1= new Calculator();
        Calculator c2= new Calculator(100);
        Calculator c3= new Calculator(10,20);
    }
}
