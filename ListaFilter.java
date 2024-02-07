import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListaFilter {
    public static void main(String[] args) {
        // Criando a lista de carros
        List<Carro> listaCarros = new ArrayList<>();
        listaCarros.add(new Honda("Civic", 2020, "Sedan"));
        listaCarros.add(new Honda("CR-V", 2021, "SUV"));
        listaCarros.add(new Honda("Fit", 2021, "Compacto"));
        listaCarros.add(new Ford("Mustang", 2020, "Esportivo"));
        listaCarros.add(new Ford("EcoSport", 2021, "SUV"));
        listaCarros.add(new Ford("Focus", 2022, "Hatchback"));
        listaCarros.add(new Chevrolet("Cruze", 2020, "Sedan"));
        listaCarros.add(new Chevrolet("Equinox", 2021, "SUV"));
        listaCarros.add(new Chevrolet("Onix", 2022, "Compacto"));

        // Utilizando a expressão lambda com o método filter para criar uma sublista
        double anoMinimo = 2020;
        List<Carro> sublistaCarros = listaCarros.stream()
                .filter(carro -> carro.getAno() > anoMinimo)
                .collect(Collectors.toList());

        // Exibindo a sublista resultante
        System.out.println("Carros novos! Ano " + anoMinimo + ":");
        for (Carro carro : sublistaCarros) {
            if (carro instanceof Honda) {
                Honda honda = (Honda) carro;
                System.out.println("Marca: " + honda.getMarca() + ", Modelo: " + honda.getModelo() + ", Ano: " + honda.getAno() + ", Tipo: " + honda.getTipo());
            } else if (carro instanceof Ford) {
                Ford ford = (Ford) carro;
                System.out.println("Marca: " + ford.getMarca() + ", Modelo: " + ford.getModelo() + ", Ano: " + ford.getAno() + ", Tipo: " + ford.getTipo());
            } else if (carro instanceof Chevrolet) {
                Chevrolet chevrolet = (Chevrolet) carro;
                System.out.println("Marca: " + chevrolet.getMarca() + ", Modelo: " + chevrolet.getModelo() + ", Ano: " + chevrolet.getAno() + ", Tipo: " + chevrolet.getTipo());
            } else {
                System.out.println("Marca: " + carro.getMarca() + ", Modelo: " + carro.getModelo() + ", Ano: " + carro.getAno());
            }
        }
    }
}
