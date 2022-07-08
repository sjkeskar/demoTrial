
public class Abc {
    public static void main(String[] args) {
        System.out.println("Hello Everybody");
        Calc c1= new Calc();
        System.out.println("Add "+c1.add(10, 20));
        System.out.println("Sub "+c1.sub(30, 20));
        System.out.println("Mul "+c1.mul(400, 20));
        System.out.println("Div "+c1.div(10, 20));
        System.out.println("Add "+c1.add(100, 20));
        System.out.println("Sub "+c1.sub(100, 50));
    }
}