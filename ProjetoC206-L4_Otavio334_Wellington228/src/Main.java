import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Criando um objeto de Arquivo
        Arquivo arq = new Arquivo();

        // Criando uma estrutura para entrada de dados
        Scanner sc = new Scanner(System.in);

        // Controladora do menu
        boolean executando = true;

        int id = 0;
        // Criando um objeto de ferramenta
        FerramentaAmaldicoada ferramentaAmaldicoada = new FerramentaAmaldicoada();

        while (executando) {
            // Menu de informações
            System.out.println("--- BEM VINDO AO MENU DAS 10 SOMBRAS ---");
            System.out.println("1 - Colocar ferramenta");
            System.out.println("2 - Mostrar ferramenta");
            System.out.println("3 - Editar ferramenta");
            System.out.println("4 - Remover ferramenta");
            System.out.println("5 - Sair");

            int op = sc.nextInt();
            sc.nextLine();
            ArrayList<FerramentaAmaldicoada> ferramentas = arq.ler();
            // Menu
            switch (op) {

                case 1:
                    // Coletando as informações da ferramenta
                    System.out.println("Nome: ");
                    ferramentaAmaldicoada.setNome(sc.nextLine());
                    try {
                        System.out.println("Nível (Desconhecido, 4, 3, 2, 1, Especial): ");
                        ferramentaAmaldicoada.setNivel(sc.nextLine());
                        if (!ferramentaAmaldicoada.getNivel().equals("Desconhecido") && !ferramentaAmaldicoada.getNivel().equals("4") && !ferramentaAmaldicoada.getNivel().equals("3") && !ferramentaAmaldicoada.getNivel().equals("2") && !ferramentaAmaldicoada.getNivel().equals("1") && !ferramentaAmaldicoada.getNivel().equals("Especial")) {
                            throw new DadoInvalidoException();
                        }
                    } catch (java.lang.Exception e) {
                        break; // Parando a execução de salvar os valores
                    }
                    id += 1;
                    ferramentaAmaldicoada.setId(id);
                    System.out.println("Efeito: ");
                    ferramentaAmaldicoada.setEfeito(sc.nextLine());
                    // Escrevendo a ferramenta no arquivo
                    arq.escrever(ferramentaAmaldicoada);
                    break;
                case 2:
                    // Executar o método de leitura
                    System.out.println("INFORMAÇÕES DAS FERRAMENTAS");
                    for (int i = 0; i < ferramentas.size(); i++) {
                        ferramentas.get(i).mostrarInfos();
                    }
                    break;
                case 3:
                    String nomeBusca;
                    System.out.println("Nome da ferramenta a ser buscada: ");
                    nomeBusca = sc.nextLine();
                    for (int i = 0; i < ferramentas.size(); i++) {
                        if (ferramentas.get(i).getNome().equals(nomeBusca)) {
                            System.out.println("Nome: ");
                            ferramentas.get(i).setNome(sc.nextLine());
                            System.out.println("Efeito: ");
                            ferramentas.get(i).setEfeito(sc.nextLine());
                            try {
                                System.out.println("Nível (Desconhecido, 4, 3, 2, 1, Especial): ");
                                ferramentas.get(i).setNivel(sc.nextLine());
                                if (!ferramentaAmaldicoada.getNivel().equals("Desconhecido") && !ferramentaAmaldicoada.getNivel().equals("4") && !ferramentaAmaldicoada.getNivel().equals("3") && !ferramentaAmaldicoada.getNivel().equals("2") && !ferramentaAmaldicoada.getNivel().equals("1") && !ferramentaAmaldicoada.getNivel().equals("Especial")) {
                                    throw new DadoInvalidoException();
                                }
                            } catch (java.lang.Exception e) {
                                break; // Parando a execução de salvar os valores
                            }
                        }
                    }

                    break;
                case 4:

                    break;
                case 5:
                    // Sair do menu
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}