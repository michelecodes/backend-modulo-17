class Carro {
    
    private String marca;
    private String modelo;
    private double ano;

    public Carro(String marca, String modelo, double ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getAno() {
        return ano;
    }
}
