import java.io.*;
import java.util.ArrayList;
public class Arquivo {
    public void escrever(FerramentaAmaldicoada ferramentaAmaldicoada) {
        // Importando as classes que nos permitirão escrever no Arquivo
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;


        try {
            // Recebe o nome do arquivo
            os = new FileOutputStream("SOMBRA.txt", true); // Arquivo

            // Mostra em qual arquivo estaremos escrevendo
            osw = new OutputStreamWriter(os);

            // Permite que escrevamos no arquivo
            bw = new BufferedWriter(osw);

            // Escrevendo os dados no arquivo
            bw.write("--- SOMBRA ---\n"); // Flag
            bw.write(ferramentaAmaldicoada.getNome()+"\n");
            bw.write(ferramentaAmaldicoada.getEfeito()+"\n");
            bw.write(ferramentaAmaldicoada.getNivel()+"\n");
            bw.write(ferramentaAmaldicoada.getId()+"\n");

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
            is = new FileInputStream("SOMBRA.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);


            // Posiciando o cursor no inicio do Arquivo
            linhaLer = br.readLine();

            // Verificando e rodando o código enquanto tiver informações no txt
            while (linhaLer != null) {
                // Verificando se encontramos a flag que indica o início de um livro
                if (linhaLer.contains("--- SOMBRA ---")) {

                    // Criando um objeto auxiliar de Livro
                    FerramentaAmaldicoada auxFerramentaAmaldicoada = new FerramentaAmaldicoada();
                    auxLivro.setTitulo(br.readLine());
                    auxLivro.setGenLiterario(br.readLine());
                    auxLivro.setEditora(br.readLine());
                    auxLivro.setQtdFolhas(Integer.parseInt(br.readLine()));
                    auxLivro.setAnoLancamento(Integer.parseInt(br.readLine()));
                    auxLivro.setPreco(Double.parseDouble(br.readLine()));

                    // Adicionando a ferramenta ao arrayList, para informar que encontrei a ferramenta
                    encontreiNoArquivo.add(auxFerramentaAmaldicoada);
                }
                // Passando para a próxima linha
                linhaLer = br.readLine();
            }
        }catch(Exception e){
            System.out.println("ERRO: "+e);
        }finally{
            try{
                br.close();
            }catch(Exception e){
                System.out.println("ERRO: "+e);
            }
        }
        return encontreiNoArquivo;
    }
}
