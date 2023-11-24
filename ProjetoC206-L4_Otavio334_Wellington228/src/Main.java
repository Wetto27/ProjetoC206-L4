import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {

        // Criando um objeto de Arquivo
        ArquivoShikigami arq1 = new ArquivoShikigami();
        ArquivoFerramenta arq2 = new ArquivoFerramenta();

        ProcuraFerramenta procuraFerramenta1 = new ProcuraFerramenta();
        ProcuraShikigami procuraShikigami1 = new ProcuraShikigami();

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
        dezSombras1.shikigami.setExorcizado("sim");
        dezSombras1.shikigami.setTotalidade("sim");
        dezSombras1.shikigami.setDestruido("nao");
        dezSombras2.shikigami.setNome("Nue");
        dezSombras2.shikigami.setExorcizado("nao");
        dezSombras2.shikigami.setTotalidade("nao");
        dezSombras2.shikigami.setDestruido("nao");
        dezSombras3.shikigami.setNome("Sapo");
        dezSombras3.shikigami.setExorcizado("nao");
        dezSombras3.shikigami.setTotalidade("nao");
        dezSombras3.shikigami.setDestruido("nao");
        dezSombras4.shikigami.setNome("Orochi");
        dezSombras4.shikigami.setExorcizado("nao");
        dezSombras4.shikigami.setTotalidade("nao");
        dezSombras4.shikigami.setDestruido("nao");
        dezSombras5.shikigami.setNome("Elefante abundante");
        dezSombras5.shikigami.setExorcizado("nao");
        dezSombras5.shikigami.setTotalidade("nao");
        dezSombras5.shikigami.setDestruido("nao");
        dezSombras6.shikigami.setNome("Fuga do coelho");
        dezSombras6.shikigami.setExorcizado("nao");
        dezSombras6.shikigami.setTotalidade("nao");
        dezSombras6.shikigami.setDestruido("nao");
        dezSombras7.shikigami.setNome("Cervo circular");
        dezSombras7.shikigami.setExorcizado("nao");
        dezSombras7.shikigami.setTotalidade("nao");
        dezSombras7.shikigami.setDestruido("nao");
        dezSombras8.shikigami.setNome("Tigre mórbido");
        dezSombras8.shikigami.setExorcizado("nao");
        dezSombras8.shikigami.setTotalidade("nao");
        dezSombras8.shikigami.setDestruido("nao");
        dezSombras9.shikigami.setNome("Touro perfurante");
        dezSombras9.shikigami.setExorcizado("nao");
        dezSombras9.shikigami.setTotalidade("nao");
        dezSombras9.shikigami.setDestruido("nao");
        dezSombras10.shikigami.setNome("Espada de oito empunhaduras! Princípio da divergência: General divino Mahoraga");
        dezSombras10.shikigami.setExorcizado("nao");
        dezSombras10.shikigami.setTotalidade("nao");
        dezSombras10.shikigami.setDestruido("nao");

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
            System.out.println("2 - Mostrar ferramentas");
            System.out.println("3 - Remover Ferramenta");
            System.out.println("4 - Mostrar shikigamis");
            System.out.println("5 - Editar Shikigami");
            System.out.println("6 - Sair");

            int op = sc.nextInt();
            sc.nextLine();
            ArrayList<DezSombras> sombraShikigami = arq1.ler();
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
                    System.out.println("Ferramenta a ser removida: ");
                    String remover = sc.nextLine();
                    procuraFerramenta1.removeFerramenta(remover, 1, ",");
                    break;
                case 4:
                    System.out.println("SHIKIGAMIS");
                    for (int i = 0; i < sombraShikigami.size(); i++) {
                        sombraShikigami.get(i).shikigami.mostrarInfos();
                    }
                    break;
                case 5:
                    // Solicitar o nome do shikigami a ser editado
                    System.out.println("Digite o nome do Shikigami a ser editado: ");
                    String nomeShikigami = sc.nextLine();

                    // Buscar o shikigami pelo nome
                    boolean encontrado = false;
                    for (DezSombras sombra : sombraShikigami) {
                        if (sombra.shikigami.getNome().equalsIgnoreCase(nomeShikigami)) {
                            encontrado = true;

                            // Solicitar as novas informações
                            System.out.println("Novo status de 'Exorcizado' (sim/nao): ");
                            String exorcizado = sc.nextLine();
                            if (exorcizado.equals("sim") || exorcizado.equals("nao")) {
                                sombra.shikigami.setExorcizado(exorcizado);
                            } else System.out.println("input invalido!");

                            System.out.println("Novo status de 'Totalidade' (sim/nao): ");
                            String totalidade = sc.nextLine();
                            if (totalidade.equals("sim") || totalidade.equals("nao")) {
                                sombra.shikigami.setTotalidade(totalidade);
                            } else System.out.println("input invalido!");

                            System.out.println("Novo status de 'Destruido' (sim/nao): ");
                            String destruido = sc.nextLine();
                            if (destruido.equals("sim") || destruido.equals("nao")) {
                                sombra.shikigami.setDestruido(destruido);
                            } else System.out.println("input invalido!");

                            // Escrever as mudanças no arquivo
                            arq1.reescrever(sombra, nomeShikigami);
                            System.out.println("Shikigami '" + nomeShikigami + "' atualizado com sucesso!");
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Shikigami não encontrado.");
                    }
                    break;
                case 6:
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