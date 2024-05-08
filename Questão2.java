/**Imagine que você está desenvolvendo um programa de software para uma loja online. O programa precisa calcular o valor total de uma compra com base nos itens selecionados pelo cliente e aplicar descontos especiais, se aplicáveis.

Como você usaria instruções de seleção (if) para resolver esse problema?
a) Descreva como você identificaria os itens selecionados pelo cliente e como aplicaria os descontos.
b) Mostre trechos de código de acordo com sua proposta. Utilize a linguagem de programação usada pelo professor durante as aulas presenciais ou online.
c) Discuta qualquer consideração importante que você teria ao usar instruções de seleção nesse contexto e como garantiria que o programa seja confiável para lidar com diferentes cenários de compra. */

import java.util.Scanner;

public class Questão2 {
    public static double calcularTotalCompra(double[] precos, int[] quantidades, String[] nomes) {
        double total = 0.0;
        for (int i = 0; i < quantidades.length; i++) {
            total += precos[i] * quantidades[i];
        }

        if (total > 100.0) {
            total *= 0.10; // Aplica desconto de 10%
        }

        return total;
    
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] precos = new double[4];
        int[] quantidades = new int[4];
        String[] nomes = new String[4];

        for (int i = 0; i < precos.length; i++) {
            System.out.print("Qual o nome do " + (i + 1) + "º item que você quer no carrinho? ");
            nomes[i] = scanner.nextLine(); // Lê o nome do item
            System.out.print("Digite o preço do item " + (i + 1) + ": ");
            precos[i] = Double.parseDouble(scanner.nextLine()); // Converte para double
            System.out.print("Digite a quantidade do item " + (i + 1) + ": ");
            quantidades[i] = Integer.parseInt(scanner.nextLine()); // Converte para int
        }

        double totalCompra = calcularTotalCompra(precos, quantidades, nomes);
        System.out.printf("Total da compra: R$ %.2f%n", totalCompra);

        scanner.close();
    }
}
