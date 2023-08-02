
public class Main {
    public static void main(String[] args) {
        A p=new B();
        System.out.println("Programmer salary is:"+ p.salary);
        System.out.println("Payment of all month is:"+ p.allexpent);
        System.out.println( "salary2 remainder is:"+ p.S());

        A n=new A();
        System.out.println(" salary remainder is:"+ n.S());
    }
}
 class A{
 int salary=2000;
 int allexpent= 3600;
 public int S (){
     int result = (salary - allexpent);
     return result;
     }
 }
class B extends A {
    int payment =3500;
    int expand=100;

    @Override
    public int S() {
//        return super.S();
        int result = (salary - (payment+expand));
        return result;
    }
}