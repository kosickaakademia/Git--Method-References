package sk.it.third_type;

public class Example {
    public static void main(String[] args) {
        MyInterface myInterfaceX = MyClass::new;
        myInterfaceX.execute("HELLO WORLD");
    }
}
