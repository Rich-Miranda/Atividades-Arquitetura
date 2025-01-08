import java.util.*;

public class Loop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe A: ");
        double a = sc.nextDouble();

        System.out.println("Informe B: ");
        double b = sc.nextDouble();

        System.out.println("Informe C: ");
        double c = sc.nextDouble();

        double bc = b + c;
        double retangul = (Math.pow(b, 2) + Math.pow(c, 2));
        double obst = (Math.pow(b, 2) + Math.pow(c, 2));
        double acutan = (Math.pow(b, 2) + Math.pow(c, 2));

        if (a >= bc) {
            System.out.println("NAO FORMA TRIANGULO");
        }
        if (Math.pow(a, 2) == retangul) {
            System.out.println(" TRIANGULO RETANGULO");
        }
        if (Math.pow(a, 2) > obst) {
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        if (Math.pow(a, 2) < acutan) {
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if (a == b && b == c && c == a) {
            System.out.println("TRIANGULO EQUILATERO");
        }
        if (a != b && a == c) {
            System.out.println("TRIANGULO ISOSCELES");
        }







    }

}
