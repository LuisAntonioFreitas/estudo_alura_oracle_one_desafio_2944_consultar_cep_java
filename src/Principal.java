import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);

        String opcaoMenu = "0";
        while (Integer.valueOf(opcaoMenu) != 2) {
            menu.Opcoes();

            opcaoMenu = scanner.nextLine();

            switch (Integer.valueOf(opcaoMenu)) {
                case 1:
                    // Consultar CEP
                    System.out.println("Digite o CEP: ");
                    String cep = scanner.nextLine();
                    try {
                        ConsultarCep consultarCep = new ConsultarCep();
                        Endereco endereco = consultarCep.Buscar(cep);
                        if (endereco != null) {
                            System.out.println(endereco + "\n");
                            SalvarArquivo salvarArquivo = new SalvarArquivo();
                            salvarArquivo.FormatoJson(endereco);
                        }
                    } catch (Exception ignored) {};
                    break;
                case 2:
                    // Sair;
                    break;
                default:
                    // Opção inválida
                    System.out.println("Opção inválida\n");
                    break;
            }

        }
        scanner.close();

    }
}
