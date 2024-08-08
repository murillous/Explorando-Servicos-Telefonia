import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem vindo a Operadora DIO");
        System.out.println("Hoje, nossos serviços disponiveis são movel, fixa, banda larga, tv");
        // Entrada do serviço a ser verificado
        System.out.println("Qual serviço deseja verificar?");
        String servico = scanner.nextLine().trim();
        
        System.out.println("Digite o seu nome e os serviços contratados separados por vírgula");
        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();
        scanner.close();
        
        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;
        
        for(int i = 0; i < partes.length; i++){
            if (partes[i].equals(servico)) {
                contratado = true;
            }
        }

        System.out.printf("O(a) cliente %s contratou o serviço %s: %b", nomeCliente, servico, contratado);        
    }
}