public class FerramentaAmaldicoada implements Comparable<FerramentaAmaldicoada>{
    private String nome;
    private String efeito;
    private String nivel;

    public void mostrarInfos(){
        System.out.println("Nome: " + nome);
        System.out.println("Efeito: " + efeito);
        System.out.println("Nivel: " + nivel + "\n");
    }

    @Override
    public int compareTo(FerramentaAmaldicoada ferramenta) {
        return this.nivel.compareTo(ferramenta.getNivel());
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
}
