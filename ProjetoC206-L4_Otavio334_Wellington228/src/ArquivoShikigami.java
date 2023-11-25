import java.io.*;
import java.util.ArrayList;
public class ArquivoShikigami {
    public void escrever(DezSombras sombra) {
        // Importando as classes que nos permitirão escrever no Arquivo
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try {
            // Recebe o nome do arquivo
            os = new FileOutputStream("SombraShikigami.txt", true); // Arquivo

            // Mostra em qual arquivo estaremos escrevendo
            osw = new OutputStreamWriter(os);

            // Permite que escrevamos no arquivo
            bw = new BufferedWriter(osw);

            // Escrevendo os dados no arquivo
            bw.write("--- SHIKIGAMI ---\n"); // Flag
            bw.write(sombra.shikigami.getNome()+"\n");
            bw.write(sombra.shikigami.getExorcizado()+"\n");
            bw.write(sombra.shikigami.getTotalidade()+"\n");
            bw.write(sombra.shikigami.getDestruido()+"\n");

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

    public ArrayList<DezSombras> ler() {
        // Criando array list que armazena as ferramentas encontradas no arquivo
        ArrayList<DezSombras> encontreiNoArquivo = new ArrayList<>();

        // Estruturas que servirão para a leitura dos dados
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        String linhaLer; // Auxiliar que servirá como ponteiro para ler o arquivo

        try {
            is = new FileInputStream("SombraShikigami.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);


            // Posiciando o cursor no inicio do Arquivo
            linhaLer = br.readLine();

            // Verificando e rodando o código enquanto tiver informações no txt
            while (linhaLer != null) {
                // Verificando se encontramos a flag que indica o início de um livro
                if (linhaLer.contains("--- SHIKIGAMI ---")) {

                    // Criando um objeto auxiliar de Livro
                    DezSombras auxShikigami = new DezSombras();
                    auxShikigami.shikigami.setNome(br.readLine());
                    auxShikigami.shikigami.setExorcizado(br.readLine());
                    auxShikigami.shikigami.setTotalidade(br.readLine());
                    auxShikigami.shikigami.setDestruido(br.readLine());

                    // Adicionando a ferramenta ao arrayList, para informar que encontrei a ferramenta
                    encontreiNoArquivo.add(auxShikigami);
                }
                // Passando para a próxima linha
                linhaLer = br.readLine();
            }
        }catch(java.lang.Exception e){
            System.out.println("ERRO: "+e);
        }finally{
            try{
                br.close();
            }catch(java.lang.Exception e){
                System.out.println("ERRO: "+e);
            }
        }
        return encontreiNoArquivo;
    }

    public void reescreverEditar(DezSombras sombra, String nomeShikigami) throws IOException {
        ArrayList<DezSombras> sombras = ler();
        FileWriter writer = new FileWriter("SombraShikigami.txt");

        for (DezSombras s : sombras) {
            if (s.shikigami.getNome().equalsIgnoreCase(nomeShikigami)) {
                // Se for o shikigami a ser editado, atualize as informações
                s = sombra;
            }
            writer.write("--- SHIKIGAMI ---\n");
            writer.write(s.shikigami.getNome() + "\n");
            writer.write(s.shikigami.getExorcizado() + "\n");
            writer.write(s.shikigami.getTotalidade() + "\n");
            writer.write(s.shikigami.getDestruido() + "\n");
        }

        writer.close();
    }
}
