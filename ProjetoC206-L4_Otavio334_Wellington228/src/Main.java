import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Criando um objeto de Arquivo
        ArquivoShikigami arq1 = new ArquivoShikigami();
        ArquivoFerramenta arq2 = new ArquivoFerramenta();

        //Criando objetos de DezSombras
        DezSombras dezSombras = new DezSombras();
        DezSombras dezSombras1 = new DezSombras();
        DezSombras dezSombras2 = new DezSombras();
        DezSombras dezSombras3 = new DezSombras();
        DezSombras dezSombras4 = new DezSombras();
        DezSombras dezSombras5 = new DezSombras();
        DezSombras dezSombras6 = new DezSombras();
        DezSombras dezSombras7 = new DezSombras();
        DezSombras dezSombras8 = new DezSombras();
        DezSombras dezSombras9 = new DezSombras();
        DezSombras dezSombras10 = new DezSombras();

        // Criando shikigamis
        dezSombras1.shikigami.setNome("Cães divinos");
        dezSombras1.shikigami.setExorcizado(true);
        dezSombras1.shikigami.setTotalidade(true);
        dezSombras2.shikigami.setNome("Nue");
        dezSombras2.shikigami.setExorcizado(false);
        dezSombras2.shikigami.setTotalidade(false);
        dezSombras3.shikigami.setNome("Sapo");
        dezSombras3.shikigami.setExorcizado(false);
        dezSombras3.shikigami.setTotalidade(false);
        dezSombras4.shikigami.setNome("Orochi");
        dezSombras4.shikigami.setExorcizado(false);
        dezSombras4.shikigami.setTotalidade(false);
        dezSombras5.shikigami.setNome("Elefante abundante");
        dezSombras5.shikigami.setExorcizado(false);
        dezSombras5.shikigami.setTotalidade(false);
        dezSombras6.shikigami.setNome("Fuga do coelho");
        dezSombras6.shikigami.setExorcizado(false);
        dezSombras6.shikigami.setTotalidade(false);
        dezSombras7.shikigami.setNome("Cervo circular");
        dezSombras7.shikigami.setExorcizado(false);
        dezSombras7.shikigami.setTotalidade(false);
        dezSombras8.shikigami.setNome("Tigre mórbido");
        dezSombras8.shikigami.setExorcizado(false);
        dezSombras8.shikigami.setTotalidade(false);
        dezSombras9.shikigami.setNome("Espada de oito empunhaduras! Princípio da divergência: General divino Mahoraga");
        dezSombras9.shikigami.setExorcizado(false);
        dezSombras9.shikigami.setTotalidade(false);

        // Escrevendo os shikigamis no arquivo
        arq1.escrever(dezSombras1);
        arq1.escrever(dezSombras2);
        arq1.escrever(dezSombras3);
        arq1.escrever(dezSombras4);
        arq1.escrever(dezSombras5);
        arq1.escrever(dezSombras6);
        arq1.escrever(dezSombras7);
        arq1.escrever(dezSombras8);
        arq1.escrever(dezSombras9);
        arq1.escrever(dezSombras10);

        // Criando uma estrutura para entrada de dados
        Scanner sc = new Scanner(System.in);

        // Controladora do menu
        boolean executando = true;

        int id = 0;

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
            ArrayList<DezSombras> sombras = arq2.ler();
            // Menu
            switch (op) {

                case 1:
                    // Coletando as informações da ferramenta
                    System.out.println("Nome: ");
                    dezSombras.ferramentaAmaldicoada.setNome(sc.nextLine());
                    try {
                        System.out.println("Nível (Desconhecido, 4, 3, 2, 1, Especial): ");
                        dezSombras.ferramentaAmaldicoada.setNivel(sc.nextLine());
                        if (!dezSombras.ferramentaAmaldicoada.getNivel().equals("Desconhecido") && !dezSombras.ferramentaAmaldicoada.getNivel().equals("4") && !dezSombras.ferramentaAmaldicoada.getNivel().equals("3") && !dezSombras.ferramentaAmaldicoada.getNivel().equals("2") && !dezSombras.ferramentaAmaldicoada.getNivel().equals("1") && !dezSombras.ferramentaAmaldicoada.getNivel().equals("Especial")) {
                            throw new DadoInvalidoException();
                        }
                    } catch (java.lang.Exception e) {
                        break; // Parando a execução de salvar os valores
                    }
                    System.out.println("Efeito: ");
                    dezSombras.ferramentaAmaldicoada.setEfeito(sc.nextLine());
                    // Escrevendo a ferramenta no arquivo
                    arq2.escrever(dezSombras);
                    break;
                case 2:
                    // Executar o método de leitura
                    System.out.println("INFORMAÇÕES DAS FERRAMENTAS");
                    for (int i = 0; i < sombras.size(); i++) {
                        sombras.get(i).ferramentaAmaldicoada.mostrarInfos();
                    }
                    break;
                case 3:
                    String nomeBusca;
                    System.out.println("Nome da ferramenta a ser buscada: ");
                    nomeBusca = sc.nextLine();
                    for (int i = 0; i < sombras.size(); i++) {
                        if (sombras.get(i).ferramentaAmaldicoada.getNome().equals(nomeBusca)) {
                            System.out.println("Nome: ");
                            sombras.get(i).ferramentaAmaldicoada.setNome(sc.nextLine());
                            System.out.println("Efeito: ");
                            sombras.get(i).ferramentaAmaldicoada.setEfeito(sc.nextLine());
                            try {
                                System.out.println("Nível (Desconhecido, 4, 3, 2, 1, Especial): ");
                                sombras.get(i).ferramentaAmaldicoada.setNivel(sc.nextLine());
                                if (!dezSombras.ferramentaAmaldicoada.getNivel().equals("Desconhecido") && !dezSombras.ferramentaAmaldicoada.getNivel().equals("4") && !dezSombras.ferramentaAmaldicoada.getNivel().equals("3") && !dezSombras.ferramentaAmaldicoada.getNivel().equals("2") && !dezSombras.ferramentaAmaldicoada.getNivel().equals("1") && !dezSombras.ferramentaAmaldicoada.getNivel().equals("Especial")) {
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