package oops;

public class DefaultConstCalucalatorMain {
    public static void main(String[] args) {
        Calculator calculator1=new Calculator();
        //System.out.println(calculator.hashCode());
        System.out.println(calculator1.i);

        Calculator calculator2=new Calculator();
        calculator2.i=100;
        calculator2.j=200;
        //System.out.println(calculator.hashCode());
        System.out.println(calculator2.i);

        System.out.println(calculator1==calculator2);

        Calculator calculator3=new Calculator();
        //System.out.println(calculator.hashCode());
        System.out.println(calculator3.i);

        System.out.println(calculator2==calculator3);

    }
}
