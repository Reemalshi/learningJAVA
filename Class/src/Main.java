public class Main {
    public static void main(String[] args) {


////        using OR, AND , NOT
        System.out.println(true && true || true || true && false);
        System.out.println(!(true && true) || false && true || !true);
        System.out.println(!(!(true && false) || false) || true && false || true);

    }
}