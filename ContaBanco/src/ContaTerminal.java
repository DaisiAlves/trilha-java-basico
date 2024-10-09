import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o número da conta:");
        int conta = scanner.nextInt();
        
        System.out.println("Digite a agência:");
        int agencia = scanner.nextInt();

        System.out.println("Digite o seu nome:");
        String nome = scanner.next();

        System.out.println("Digite o valor inicial a ser depositado: ");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá," + nome + " obrigado por criar uma conta em nosso banco, sua Agência é " + agencia + " conta " + conta + " e o seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
