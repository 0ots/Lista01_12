import java.util.Scanner;

import java.lang.Math;

public class Exercicio_12 {

    public static void main(String[] args) throws Exception {

        double altura, pesoideal, pesoidealarredondado;

        Scanner input;

        input = new Scanner(System.in);

        System.out.println("Digite sua altura: ");

        altura = input.nextDouble();

        input.close();

        pesoideal = (72.7 * altura) - 58; 

        pesoidealarredondado = Math.ceil(pesoideal * 100) / 100;

        System.out.print("Seu peso ideal é: " + pesoidealarredondado);

    }
    
}
