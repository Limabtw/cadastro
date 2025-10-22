import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Seja bem vindo!!");
        System.out.println("Por favor digite os dados solicitados");

        System.out.println("Nome:");
        String nome = scanner.nextLine();

        System.out.println("cpf:");
        String cpf = scanner.nextLine();

        System.out.println("Idade:");
        int idade = scanner.nextInt();

        System.out.println("Peso:");
        double peso = scanner.nextDouble();

        System.out.println("Altura:");
        double altura = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Estado civil:");
        String estadocivil = scanner.nextLine();


        System.out.println("Muito obrigado");

        System.out.println("Seu nome é:"+ nome + ";" + "cpf:"+ cpf + ";" + "Idade:"+ idade + ";" + "Peso:"+ peso + ";" + "Altura:"+ altura + ";" + "Estado civil:"+ estadocivil + ";");

        System.out.println("Finalizar cadastro?");
        String finalizarcadastro = scanner.nextLine();

        System.out.println("Cadastro finalizado!");

        scanner.close();

    }

}
