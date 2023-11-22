public class FerramentaAmaldicoada extends Comparable<FerramentaAmaldicoada> {
    private String nome;
    private String efeito;
    private String nivel;
    private int id;

    @Override
    public int compareTo(FerramentaAmaldicoada ferramentaAmaldicoadaComparado) {
        return 0;
    }

    public void mostrarInfos(){
        System.out.println("Nome: "+nome);
        System.out.println("Propriedade mágica: "+ efeito);
        System.out.println("Nível: "+ nivel);
        System.out.println("ID: "+id);
        System.out.println(" ");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEfeito() {
        return efeito;
    }

    public void setEfeito(String efeito) {
        this.efeito = efeito;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
