package oops;

public class Calculator {
    // for integer primitive data type the interger default value is 0
    int i;
    int j;
    public Calculator(){
        System.out.printf("Default Constructor");
    }
    public Calculator(int param1, int param2){
        i=param1;
        j=param2;
        System.out.println("Values are "+param1+" second "+param2);
    }
    public Calculator(int param1){
        i=param1;
        System.out.println("Value is "+param1);
    }

}
