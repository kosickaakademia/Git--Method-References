package sk.it.third_type;

public class Example {
    public static void main(String[] args) {
        MyInterface myInterface = MyClass::new;
        myInterface.execute("HELLO");
    }
}
