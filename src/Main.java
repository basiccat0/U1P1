import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// user input stuff
        Scanner scan = new Scanner(System.in);
        System.out.print("Bill Amount: ");
        Double bill = scan.nextDouble();
        System.out.print("Tip Percent: ");
        int tip = scan.nextInt();
        System.out.print("People: ");
        int people = scan.nextInt();
//calculations
        double tipvalue = tip / 100;
        double tipamount = bill * tipvalue;
        Double total = bill + tipamount;
//results
        System.out.print("Total amount is: " + (total + tipamount));
    }
    }
