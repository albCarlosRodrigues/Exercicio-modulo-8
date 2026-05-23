import java.util.Scanner;

public class exercicioModuloOito {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nomeUsuario = sc.nextLine();

        System.out.print("Digite um número positivo: ");
        int numeroDoUsuario = sc.nextInt();

        while (numeroDoUsuario <= 0) {
            System.out.print("Número inválido. Digite um número positivo: ");
            numeroDoUsuario = sc.nextInt();
        }

        numeroCrescenteDecrescente(numeroDoUsuario);
        exibirNome(nomeUsuario);

        sc.close();
    }

    public static void numeroCrescenteDecrescente(int numeroDoUsuario) {

        for (int m = 0; m <= numeroDoUsuario; m++) {
            System.out.println("Seu número de forma crescente: " + m);
        }

        System.out.println();

        for (int n = numeroDoUsuario; n >= 0; n--) {
            System.out.println("Seu número de forma decrescente: " + n);
        }

        System.out.println();
    }

    public static void exibirNome(String nomeUsuario) {

        int contagemDoNome = nomeUsuario.length();

        if (contagemDoNome > 6) {
            for (int n = contagemDoNome; n > 6; n--) {
                System.out.println(nomeUsuario);
            }
        } else {
            System.out.println(nomeUsuario);
        }
    }
}