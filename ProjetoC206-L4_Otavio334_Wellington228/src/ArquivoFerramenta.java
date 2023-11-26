import java.io.*;
import java.util.ArrayList;

public class ArquivoFerramenta {
    public void escrever(FerramentaAmaldicoada ferramenta) {
        // Importando as classes que nos permitirão escrever no Arquivo
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;


        try {
            // Recebe o nome do arquivo
            os = new FileOutputStream("SombraFerramenta.txt", true); // Arquivo

            // Mostra em qual arquivo estaremos escrevendo
            osw = new OutputStreamWriter(os);

            // Permite que escrevamos no arquivo
            bw = new BufferedWriter(osw);

            // Escrevendo os dados no arquivo
            bw.write("--- FERRAMENTA ---\n"); // Flag
            bw.write(ferramenta.getNome() + "\n");
            bw.write(ferramenta.getNivel() + "\n");
            bw.write(ferramenta.getEfeito() + "\n");

        } catch (IOException e) {
            System.out.println("ERRO: " + e);
        } finally {
            // Fechando a entrada de dados
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public ArrayList<FerramentaAmaldicoada> ler() {
        // Criando array list que armazena as ferramentas encontradas no arquivo
        ArrayList<FerramentaAmaldicoada> encontreiNoArquivo = new ArrayList<>();

        // Estruturas que servirão para a leitura dos dados
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        String linhaLer; // Auxiliar que servirá como ponteiro para ler o arquivo

        try {
            is = new FileInputStream("SombraFerramenta.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);


            // Posiciando o cursor no inicio do Arquivo
            linhaLer = br.readLine();

            // Verificando e rodando o código enquanto tiver informações no txt
            while (linhaLer != null) {
                // Verificando se encontramos a flag que indica o início de um livro
                if (linhaLer.contains("--- FERRAMENTA ---")) {
                    // Criando um objeto auxiliar de Livro
                    FerramentaAmaldicoada auxFerramenta = new FerramentaAmaldicoada();
                    auxFerramenta.setNome(br.readLine());
                    auxFerramenta.setNivel(br.readLine());
                    auxFerramenta.setEfeito(br.readLine());

                    // Adicionando a ferramenta ao arrayList, para informar que encontrei a ferramenta
                    encontreiNoArquivo.add(auxFerramenta);
                }
                // Passando para a próxima linha
                linhaLer = br.readLine();
            }
        } catch (java.lang.Exception e) {
            System.out.println("ERRO: " + e);
        } finally {
            try {
                br.close();
            } catch (java.lang.Exception e) {
                System.out.println("ERRO: " + e);
            }
        }
        return encontreiNoArquivo;
    }

    // Método para reescrever a lista de ferramentas no arquivo
    public void reescreverRemover(ArrayList<FerramentaAmaldicoada> listaFerramentas) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("SombraFerramenta.txt"))) {
            for (FerramentaAmaldicoada ferramentaAmaldicoada : listaFerramentas) {
                writer.write("--- FERRAMENTA ---");
                writer.newLine();
                writer.write(ferramentaAmaldicoada.getNome());
                writer.newLine();
                writer.write(ferramentaAmaldicoada.getNivel());
                writer.newLine();
                writer.write(ferramentaAmaldicoada.getEfeito());
                writer.newLine();
            }
            System.out.println("Arquivo atualizado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao reescrever o arquivo: " + e.getMessage());
        }
    }
}
