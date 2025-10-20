package epn.edu.ec.git.calculator;

public class CalculatorExecute {
    public static void main (String[] args){
        System.out.println("**Calculator Execute**");

        Calculator c = new Calculator();
        int addition=c.addition(8,3);
        System.out.println("c.addition (8,3) = "+addition);

        int subtraction=c.subtraction(9,5);
        System.out.println("c.substraction (9,5) = "+subtraction);

        System.out.println("\n== ¡¡ Este es un nuevo cambio !! ==");
        int multiplication=c.multiplication(25,25);
        System.out.println("MULTIPLICAR 25 * 25 = "+multiplication);
    }
}
