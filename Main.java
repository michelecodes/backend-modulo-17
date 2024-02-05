import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando uma lista para armazenar carros
        List<Carro> listaDeCarros = new ArrayList<>();

        // Adicionando carros à lista
        listaDeCarros.add(new Carro("Carro1", 2020, "Marca1", TipoCarro.MINIVAN));
        listaDeCarros.add(new Carro("Carro2", 2019, "Marca2", TipoCarro.SEDA));
        listaDeCarros.add(new Carro("Carro3", 2021, "Marca3", TipoCarro.ESPORTIVO));
        listaDeCarros.add(new Carro("Carro4", 2022, "Marca4", TipoCarro.SUV));
        listaDeCarros.add(new Carro("Carro5", 2018, "Marca5", TipoCarro.PERUA));
        listaDeCarros.add(new Carro("Carro6", 2023, "Marca6", TipoCarro.PICAPES));
        listaDeCarros.add(new Carro("Carro7", 2017, "Marca7", TipoCarro.FURGAO));

        // Iterando pela lista e exibindo informações sobre os carros
        for (Carro carro : listaDeCarros) {
            System.out.println(carro);
        }
    }
}
