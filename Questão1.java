/**Questão 1:
 * Deseja-se implementar um sistema para calcular lucros de uma empresa. 
 * A implementação inicial é a seguinte. Cada cliente tem dois tipos de gastos: bebidas e comidas.

public class Lucro{

private int numeroClientes;

public void calcularMediaGastoPorCliente(){

}

public void calcularMediaGeral(){

}

}

a) Implemente o método calcularMediaGastoPorCliente. 
Ele deve exibir a média aritmética simples de gasto por cliente. 
Ele deve se encarregar de fazer a captura de dados usando JOptionPane ou Scanner.

b) Implemente o método calcularMediaGeral. 
Ele deve exibir a média de gastos gerais, de todos os clientes. 
Ele deve se encarregar de fazer a captura de dados usando JOptionPane ou Scanner.

CRITÉRIO: A solução deve utilizar estruturas de repetição em Java, como for, while e/ou do/while. 
Também é necessário fazer a captura de dados via JOptionPane ou Scanner
 */



import java.util.Scanner;

public class Questão1 {
    private int numeroClientes;

    public void calcularMediaGastoPorCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de clientes: ");
        numeroClientes = scanner.nextInt();
        scanner.nextLine();

        int totalGastos = 0;

        for (int i = 0; i < numeroClientes; i++) {
            System.out.print("Digite o gasto em bebidas do cliente " + (i + 1) + ": ");
            int gastoBebidas = scanner.nextInt();

            System.out.print("Digite o gasto em comidas do cliente " + (i + 1) + ": ");
            int gastoComidas = scanner.nextInt();

            int gastoTotalCliente = gastoBebidas + gastoComidas;
            totalGastos += gastoTotalCliente;
        }

        double mediaGastoPorCliente = (double) totalGastos / numeroClientes;
        System.out.println("A média de gasto por cliente é: " + mediaGastoPorCliente);
    
        scanner.close();
    }

    public void calcularMediaGeral() {
        Scanner scanner = new Scanner(System.in);
        int totalGastos = 0;

        for (int i = 0; i < numeroClientes; i++) {
            System.out.print("Digite o gasto em bebidas do cliente " + (i + 1) + ": ");
            int gastoBebidas = scanner.nextInt();

            System.out.print("Digite o gasto em comidas do cliente " + (i + 1) + ": ");
            int gastoComidas = scanner.nextInt();

            int gastoTotalCliente = gastoBebidas + gastoComidas;
            totalGastos += gastoTotalCliente;
        }

        double mediaGeral = (double) totalGastos / numeroClientes;
        System.out.println("A média geral de gastos é: " + mediaGeral);
    
        scanner.close();
    }

    public static void main(String[] args) {
        Questão1 lucro = new Questão1();
        lucro.calcularMediaGastoPorCliente();
        lucro.calcularMediaGeral();
    }
}
