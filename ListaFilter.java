import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListaFilter {
    public static void main(String[] args) {
        // Criando a lista de carros
        List<Carro> listaCarros = new ArrayList<>();
        listaCarros.add(new Carro("Toyota", "Corolla", 2020));
        listaCarros.add(new Carro("Honda", "Civic", 2020));
        listaCarros.add(new Carro("Ford", "Focus", 2021));
        listaCarros.add(new Carro("Chevrolet", "Cruze", 2022));

        // Utilizando a expressão lambda com o método filter para criar uma sublista
        double anoMinimo = 2020;
        List<Carro> sublistaCarros = listaCarros.stream()
                .filter(carro -> carro.getAno() > anoMinimo)
                .collect(Collectors.toList());

        // Exibindo a sublista resultante
        System.out.println("Carros novos! Ano" + anoMinimo + ":");
        for (Carro carro : sublistaCarros) {
            System.out.println("Marca: " + carro.getMarca() + ", Modelo: " + carro.getModelo() + ", Ano: " + carro.getAno());
        }
    }
}
