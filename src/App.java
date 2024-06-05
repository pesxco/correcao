import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pergunta ao usuário se ele deseja responder ao questionário
        System.out.println("Você gostaria de responder ao questionário? (sim/não)");
        String resposta = scanner.nextLine();

        // Se o usuário responder "sim", o questionário será iniciado
        if (resposta.equalsIgnoreCase("sim")) {
            // Cria um array para armazenar as respostas do usuário
            String[] respostas = new String[5];

            // Faz 5 perguntas ao usuário
            for (int i = 0; i < 5; i++) {
                System.out.println("Digite a resposta para a pergunta " + (i + 1) + ":");
                respostas[i] = scanner.nextLine();
            }

            // Imprime as respostas do usuário
            System.out.println("Suas respostas foram:");
            for (int i = 0; i < 5; i++) {
                System.out.println("Resposta " + (i + 1) + ": " + respostas[i]);
            }
        } else {
            System.out.println("Ok, talvez na próxima vez!");
        }

        // Fecha o scanner
        scanner.close();

    } 
}

