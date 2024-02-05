// Método principal para testar a classe
public static void main(String[] args) {
        // Exemplo de criação de objetos
        TipoDeSapato tenis = new TipoDeSapato("Tênis", "lona", "unissex");
        TipoDeSapato saltoAlto = new TipoDeSapato("Salto Alto", "verniz", "feminino");

        // Exemplo de utilização dos métodos
        System.out.println("Tipo: " + tenis.getNome());
        System.out.println("Material: " + tenis.getMaterial());
        System.out.println("Gênero: " + tenis.getGenero());

        System.out.println();

        System.out.println("Tipo: " + saltoAlto.getNome());
        System.out.println("Material: " + saltoAlto.getMaterial());
        System.out.println("Gênero: " + saltoAlto.getGenero());
    }
}
