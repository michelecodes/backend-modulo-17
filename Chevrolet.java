class Chevrolet extends Carro {
    private String tipo;

    public Chevrolet(String modelo, double ano, String tipo) {
        super("Chevrolet", modelo, ano);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
