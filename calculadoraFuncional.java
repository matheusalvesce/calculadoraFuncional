import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class calculadoraFuncional {

public static void main(String[] args) {
    double valorX, valorY;
    int opcao;

        Scanner input = new Scanner(System.in);
        System.out.println("Insira o primeiro numero:");
        valorX = input.nextDouble();
        System.out.println("Insira o segundo numero:");
        valorY = input.nextDouble();
        System.out.println("Qual operacao deseja fazer 1. Soma 2. Subtracao 3. Multiplicacao 4. Divisao");
        opcao = input.nextInt();
        if (opcao == 1){
            System.out.println(valorX+valorY);
        } else
        if (opcao == 2){
            System.out.println(valorX-valorY);
        } else
        if (opcao == 3){
            System.out.println(valorX*valorY);
        } else
        if (opcao == 4){
            System.out.println(valorX/valorY);
        } 
    }
}