import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Supplier<String> supplier = () -> "Hello Aldo Tamaris";
        String string = supplier.get();
        System.out.println("String = " + string);
        string = supplier.get() + "JOdido ";
        System.out.println("String = " + string);
    }



}