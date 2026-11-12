import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = scanner.nextLine();

        System.out.println("Digite o ano de lançamento do filme");
        int anoLancamento = scanner.nextInt();
        System.out.println("Diga sua avaliação para o filme");
        double avalicao = scanner.nextDouble();


        System.out.println(filme);
        System.out.println(anoLancamento);
        System.out.println(avalicao);


    }
}
