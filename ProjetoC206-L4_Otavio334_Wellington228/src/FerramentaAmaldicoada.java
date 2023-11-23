public class FerramentaAmaldicoada  {
    private String nome;
    private String efeito;
    private String nivel;

    public void mostrarInfos(){
        System.out.println("Nome: "+nome);
        System.out.println("Nível: "+ nivel);
        System.out.println("Efeito: "+ efeito);
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
}
