import java.util.Scanner;

public class SecondDegreeEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap he so a: ");
        double a = input.nextDouble();

        System.out.println("Nhap he so b: ");
        double b = input.nextDouble();

        System.out.println("Nhap he so c: ");
        double c = input.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("co 2 nghiem:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("CO 1 nghiem kep:");
            System.out.println("x = " + x);
        } else {
            System.out.println("Vo nghiem");
        }
    }
}
