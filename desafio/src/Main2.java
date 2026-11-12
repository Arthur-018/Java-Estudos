import java.sql.SQLOutput;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nomeCliente = "Arthur";
        double saldoCliente = 1500;
        String tipoDeConta = "Corrente";
       /* System.out.println("Nome do cliente " + nomeCliente );
        System.out.println("Saldo do cliente " + saldoCliente);
        System.out.println("Tipo de conta " + tipoDeConta);*/

        System.out.println("""
                Bem vindo!!!!
                Escolha uma opção!
                """);

        int escolha = 0;
        while(true){
            System.out.println("""
             1 - Consultar Saldo
             2 - Receber
             3 - Transferir
             4 - sair
            """);
            escolha = leitura.nextInt();
            if(escolha == 1){
                System.out.println("\nsaldo " + saldoCliente + "\n");
            } else if (escolha == 2) {
                System.out.println("\nDigite o valor a ser recebido!");
                double receber = leitura.nextDouble();
                saldoCliente += receber;
                System.out.println("\nSaldo atual " + saldoCliente + "\n");
            } else if (escolha == 3) {
                System.out.println("Digite o valor a ser transferido!" + "\n");
                double transferir = leitura.nextDouble();
                if(saldoCliente >= transferir){
                    saldoCliente -= transferir;
                    System.out.println("\nSaldo atual " + saldoCliente + "\n");
                } else {
                    System.out.println("Saldo insuficiente!");
                }
            } else if (escolha == 4) {
                break;
            }
        }
    }
}
