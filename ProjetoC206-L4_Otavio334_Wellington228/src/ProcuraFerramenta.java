import java.io.*;

public class ProcuraFerramenta {
    public static void removeRecord(String removeTerm, int positionOfTerm, String delimiter) {
        String termoRemocao = "Nome:" + removeTerm;
        int position = positionOfTerm - 1;
        String filePath = "SombraFerramenta.txt";
        String tempFile = "tempFerramenta.txt";
        File olfFile = new File(filePath);
        File newFile = new File(tempFile);

        String currentLine;
        String data[];

        try {
            FileWriter fw = new FileWriter(tempFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            while ((currentLine = br.readLine()) != null) {
                data = currentLine.split(",");
                if(!(data[position].equalsIgnoreCase(termoRemocao)))
                {
                    pw.println(currentLine);
                }
            }
                pw.flush();
                pw.close();
                fr.close();
                br.close();
                bw.close();
                fw.close();

                olfFile.delete();
                File dump = new File(filePath);
                newFile.renameTo(dump);
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }
