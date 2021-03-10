import java.util.Scanner;

public class SelectionStatementsEx2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double x, y;
        String quadrant;

        System.out.print("Insert the X value: ");
        x = scanner.nextDouble();
        System.out.print("Insert the Y value: ");
        y = scanner.nextDouble();

        if (x == 0) {
            if (y == 0)
                quadrant = "Origin";
            else
                quadrant = "Y Axis";
        }

        else if (y == 0)
            quadrant = "X Axis";
        
        else if (x > 0) {
            if (y > 0)
                quadrant = "Q1";
            else
                quadrant = "Q4";
        }

        else {
            if (y > 0)
                quadrant = "Q2";
            else 
                quadrant = "Q3";
        }
        
        System.out.println("Position in the plane: " + quadrant);
    }
}
