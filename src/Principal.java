//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual é o seu nome?");
        String cliente = entrada.nextLine();
        System.out.println("Qual é a sua agência?");
        String agencia = entrada.nextLine();
        System.out.println("Qual é o número?");
        int numero = entrada.nextInt();
        float saldoAtual = 237.48F;
        //System.out.println("O seu saldo é: "+saldoAtual);
        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + ", e seu saldo de " + saldoAtual + " já está disponível para saque.");

    }


}

