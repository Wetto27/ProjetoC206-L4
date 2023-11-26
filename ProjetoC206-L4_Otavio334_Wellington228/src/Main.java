import exceptions.NivelInvalidoException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {

        FerramentaAmaldicoada ferramenta = new FerramentaAmaldicoada();
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
        dezSombras1.shikigami.setExorcizado("Sim");
        dezSombras1.shikigami.setTotalidade("Sim");
        dezSombras1.shikigami.setDestruido("Não");
        dezSombras2.shikigami.setNome("Nue");
        dezSombras2.shikigami.setExorcizado("Não");
        dezSombras2.shikigami.setTotalidade("Não");
        dezSombras2.shikigami.setDestruido("Não");
        dezSombras3.shikigami.setNome("Sapo");
        dezSombras3.shikigami.setExorcizado("Não");
        dezSombras3.shikigami.setTotalidade("Não");
        dezSombras3.shikigami.setDestruido("Não");
        dezSombras4.shikigami.setNome("Orochi");
        dezSombras4.shikigami.setExorcizado("Não");
        dezSombras4.shikigami.setTotalidade("Não");
        dezSombras4.shikigami.setDestruido("Não");
        dezSombras5.shikigami.setNome("Elefante abundante");
        dezSombras5.shikigami.setExorcizado("Não");
        dezSombras5.shikigami.setTotalidade("Não");
        dezSombras5.shikigami.setDestruido("Não");
        dezSombras6.shikigami.setNome("Fuga do coelho");
        dezSombras6.shikigami.setExorcizado("Não");
        dezSombras6.shikigami.setTotalidade("Não");
        dezSombras6.shikigami.setDestruido("Não");
        dezSombras7.shikigami.setNome("Cervo circular");
        dezSombras7.shikigami.setExorcizado("Não");
        dezSombras7.shikigami.setTotalidade("Não");
        dezSombras7.shikigami.setDestruido("Não");
        dezSombras8.shikigami.setNome("Tigre mórbido");
        dezSombras8.shikigami.setExorcizado("Não");
        dezSombras8.shikigami.setTotalidade("Não");
        dezSombras8.shikigami.setDestruido("Não");
        dezSombras9.shikigami.setNome("Touro perfurante");
        dezSombras9.shikigami.setExorcizado("Não");
        dezSombras9.shikigami.setTotalidade("Não");
        dezSombras9.shikigami.setDestruido("Não");
        dezSombras10.shikigami.setNome("Espada de oito empunhaduras! Princípio da divergência: General divino Mahoraga");
        dezSombras10.shikigami.setExorcizado("Não");
        dezSombras10.shikigami.setTotalidade("Não");
        dezSombras10.shikigami.setDestruido("Não");


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
            ArrayList<FerramentaAmaldicoada> sombraFerramenta = arq2.ler();
            // Menu
            switch (op) {
                case 1 -> {
                    // Coletando as informações da ferramenta
                    System.out.println("Nome: ");
                    ferramenta.setNome(sc.nextLine());
                    try {
                        System.out.println("Nível (Desconhecido, 4, 3, 2, 1, Especial): ");
                        ferramenta.setNivel(sc.nextLine());
                        if (!ferramenta.getNivel().equals("Desconhecido") && !ferramenta.getNivel().equals("4") && !ferramenta.getNivel().equals("3") && !ferramenta.getNivel().equals("2") && !ferramenta.getNivel().equals("1") && !ferramenta.getNivel().equals("Especial")) {
                            throw new NivelInvalidoException();
                        }
                    } catch (Exception e) {
                        break; // Parando a execução de salvar os valores
                    }
                    System.out.println("Efeito: ");
                    ferramenta.setEfeito(sc.nextLine());
                    // Escrevendo a ferramenta no arquivo
                    arq2.escrever(ferramenta);
                }
                case 2 -> {
                    // Executar o método de leitura
                    System.out.println("INFORMAÇÕES DAS FERRAMENTAS");
                    for (int i = 0; i < sombraFerramenta.size(); i++) {
                        sombraFerramenta.get(i).mostrarInfos();
                    }
                }
                case 3 -> {
                    // Coletando o nome da ferramenta a ser removida
                    System.out.println("Digite o nome da ferramenta a ser removida: ");
                    String nomeFerramentaRemover = sc.nextLine();

                    // Procurando e removendo a ferramenta pelo nome
                    boolean ferramentaEncontrada = false;
                    for (int i = 0; i < sombraFerramenta.size(); i++) {
                        if (sombraFerramenta.get(i).getNome().equalsIgnoreCase(nomeFerramentaRemover)) {
                            sombraFerramenta.remove(i);
                            ferramentaEncontrada = true;
                            System.out.println("Ferramenta '" + nomeFerramentaRemover + "' removida com sucesso!");
                            break;
                        }
                    }

                    // Reescrevendo o arquivo após a remoção
                    if (ferramentaEncontrada) {
                        arq2.reescreverRemover(sombraFerramenta);
                    } else {
                        System.out.println("Ferramenta não encontrada.");
                    }
                }
                case 4 -> {
                    System.out.println("SHIKIGAMIS");
                    for (DezSombras sombras : sombraShikigami) {
                        sombras.shikigami.mostrarInfos();
                    }
                }
                case 5 -> {
                    // Solicitar o nome do shikigami a ser editado
                    System.out.println("Digite o nome do Shikigami a ser editado: ");
                    String nomeShikigami = sc.nextLine();

                    // Buscar o shikigami pelo nome
                    boolean encontrado = false;
                    for (DezSombras sombra : sombraShikigami) {
                        if (sombra.shikigami.getNome().equalsIgnoreCase(nomeShikigami)) {
                            encontrado = true;

                            // Solicitar as novas informações
                            System.out.println("Novo status de 'Exorcizado' (Sim/Não): ");
                            String exorcizado = sc.nextLine();
                            if (exorcizado.equals("Sim") || exorcizado.equals("Não")) {
                                sombra.shikigami.setExorcizado(exorcizado);
                            } else System.out.println("input invalido!");

                            System.out.println("Novo status de 'Totalidade' (Sim/Não): ");
                            String totalidade = sc.nextLine();
                            if (totalidade.equals("Sim") || totalidade.equals("Não")) {
                                sombra.shikigami.setTotalidade(totalidade);
                            } else System.out.println("input invalido!");

                            System.out.println("Novo status de 'Destruido' (Sim/Não): ");
                            String destruido = sc.nextLine();
                            if (destruido.equals("Sim") || destruido.equals("Não")) {
                                sombra.shikigami.setDestruido(destruido);
                            } else System.out.println("input invalido!");

                            // Escrever as mudanças no arquivo
                            arq1.reescreverEditar(sombra, nomeShikigami);
                            System.out.println("Shikigami '" + nomeShikigami + "' atualizado com sucesso!");
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Shikigami não encontrado.");
                    }
                }
                case 6 ->
                    // Sair do menu
                        executando = false;
                default -> System.out.println("Opção inválida");
            }
        }
    }
}