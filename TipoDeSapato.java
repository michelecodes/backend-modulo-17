public class TipoDeSapato {
    // Atributos da classe
    private String nome;
    private String material;
    private String genero;

    // Construtor da classe
    public TipoDeSapato(String nome, String material, String genero) {
        this.nome = nome;
        this.material = material;
        this.genero = genero;
    }

    // Métodos para acessar os atributos
    public String getNome() {
        return nome;
    }

    public String getMaterial() {
        return material;
    }

    public String getGenero() {
        return genero;
    }
}
