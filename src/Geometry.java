import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        System.out.println("Welcome to Geometry");
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the values of x1,x2,y1,y2");
        Integer x1 = obj.nextInt();
        Integer x2 = obj.nextInt();
        Integer y1 = obj.nextInt();
        Integer y2 = obj.nextInt();
        double LengthOfLine = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Length of 2 points (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") =" + LengthOfLine);
    }
}
