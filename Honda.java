class Honda extends Carro {
    private String tipo;

    public Honda(String modelo, double ano, String tipo) {
        super("Honda", modelo, ano);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
