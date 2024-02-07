class Ford extends Carro {
    private String tipo;

    public Ford(String modelo, double ano, String tipo) {
        super("Ford", modelo, ano);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
