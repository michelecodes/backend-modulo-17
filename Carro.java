// Enum para representar os tipos de carros
enum TipoCarro {
    MINIVAN, SEDA, ESPORTIVO, SUV, PERUA, PICAPES, FURGAO
}

// Classe base para representar um carro
class Carro {
    private String nome;
    private int anoLancamento;
    private String marca;
    private TipoCarro tipo;

    public Carro(String nome, int anoLancamento, String marca, TipoCarro tipo) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.marca = marca;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", anoLancamento=" + anoLancamento +
                ", marca='" + marca + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}