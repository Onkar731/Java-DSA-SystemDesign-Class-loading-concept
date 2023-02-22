/** 
 Program to demonstrate concept of class loading, static variables, static methods and static block 
*/

/**
 While loading a class Java follows some steps such as :
 1. class loading
 2. linking
 3. initialization 

 1. Class loading :
                    In this step jvm loads all the necessary packages that has to be execute.
                    example, lang package, io package, sql package.

 2. Linking :
                    Linking has three steps such as :
                    1. Verifying structure of code
                    2. Prepare
                    3. Resolve

                    Firstly it varifies structure of java code, then prepare the variables to initialze with its
                    default value. 
 3. Initialization :
                    It will initialize data members of the class with the given values provided in static block or initializer block or constructor.
*/

class StaticDemo {
    // creating non static variables
    int nonStaticVar1, nonStaticVar2;

    // creating static variables
    static int staticVar1, staticVar2;

    // creating static block
    static {
        staticVar1 = 10;
        staticVar2 = 20;
        System.out.println("In Static Block : " + staticVar1 + " " + staticVar2);
    }

    // creating initializer block
    {
        nonStaticVar1 = 100;
        nonStaticVar2 = 200;
        System.out.println("In Initializer Block : " + nonStaticVar1 + " " + staticVar2);
    }

    // defining static method
    static void staticMethod() {
        System.out.println("In Static Method");
    }

    // defining Instance method
    void instanceMethod() {
        System.out.println("In Instance Method");
    }
}

public class StaticInJava {
    public static void main(String[] args) {
        // calling static method
        StaticDemo.staticMethod();

        // creating object of StaticDemo class
        StaticDemo sd = new StaticDemo();

        // calling instance method
        sd.instanceMethod();
    }
}