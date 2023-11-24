public class Shikigami {

    private String nome;
    private String exorcizado;
    private String totalidade;
    private String destruido;

    public void mostrarInfos(){
        System.out.println("Nome: "+nome);
        System.out.println("Efeito: "+exorcizado);
        System.out.println("Totalidade: "+totalidade);
        System.out.println("Destruido: "+destruido);
        System.out.println(" ");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getExorcizado() {
        return exorcizado;
    }

    public void setExorcizado(String exorcizado) {
        this.exorcizado = exorcizado;
    }

    public String getTotalidade() {
        return totalidade;
    }

    public void setTotalidade(String totalidade) {
        this.totalidade = totalidade;
    }

    public String getDestruido() {
        return destruido;
    }

    public void setDestruido(String destruido) {
        this.destruido = destruido;
    }
}