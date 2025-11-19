import java.util.*;

public class calculosSumeSub {
    public static int sub(int n1, int n2 ){
        return n1 - n2;

    }
    public static void main(String[] args) {
        int resultado = sub(10, 10);
        System.out.println(resultado);
        int resultado = sum(10, 10);
        System.out.println(resultado);
        sum(10, 10);
    }

    public static int sum(int n1, int n2) {
        return n1 + n2;
    }
}