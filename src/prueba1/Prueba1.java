package prueba1;

import java.util.Scanner;

public class Prueba1 {

    public static void main(String[] args) {

        int n1;
        int n2;
        int resultado = 0;
        //
        Scanner consola = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        n1 = Integer.parseInt(consola.nextLine());
        System.out.print("Digite otro numero: ");
        n2 = Integer.parseInt(consola.nextLine());
        System.out.print("Que Operacion deseas Realizar: ");
        String respuesta = consola.nextLine();

        switch (respuesta) {
            case "+":
                resultado = (n1 + n2);
                System.out.println("respuesta = " + resultado);
                break;
            case "-":
                resultado = (n1 - n2);
                System.out.println("respuesta = " + resultado);
                break;
            case "*":
                resultado = (n1 * n2);
                System.out.println("respuesta = " + resultado);
                break;
            case "/":
                resultado = (n1 / n2);
                System.out.println("respuesta = " + resultado);
                break;
                
            

        }

    }

}
