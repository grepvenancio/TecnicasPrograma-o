package br.edu.fatec.controleversao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int operação;
        double num1,num2, resultado = 0;

        Porcentagem porcento = new Porcentagem();
        Calculadora calc = new Calculadora();
        Scanner ler = new Scanner(System.in);
        while(true) {
            System.out.println("Digite a operação: \n 1- soma \n 2- divisão \n 3- multiplica \n 4- subtração \n 5- sair");
            operação = ler.nextInt();
            if (operação == 5)
                break;
            System.out.println("Digite o primeiro valor: ");
            num1 = ler.nextDouble();
            System.out.println("Digite o segundo valor: ");
            num2 = ler.nextDouble();


            switch(operação) {
                case 1:
                    resultado = calc.soma(num1, num2);
                    break;
                case 2:
                    resultado = calc.dividi(num1, num2);
                    break;
                case 3:
                    resultado = calc.multiplica(num1, num2);
                    break;
                case 4:
                    resultado = calc.subtrai(num1, num2);
                    break;
            }
            System.out.println(resultado);
        }
        System.out.println(porcento.regratres(100,100,50));

    }
}