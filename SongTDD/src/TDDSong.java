import java.util.List;

public class TDDSong {

    public String Song(List<String> animals) {

        if (animals.isEmpty()) return "";

        String resultado = "";

        for (int i = 0; i < animals.size(); i++) {
            String animal = animals.get(i);
            List<String> anteriores = animals.subList(0, i);

            // estrofa i
            resultado += estrofa(animal, anteriores, animals.get(0));

            // línea en blanco entre estrofas (pero no después de la última)
            if (i < animals.size() - 1) {
                resultado += "\n";
            }
        }

        return resultado;
    }

    // frase especial según animal
    private String fraseEspecial(String animal) {
        if (animal.equals("fly")) {
            return "That wriggled and wiggled and tickled inside her.\n";
        }
        return "";
    }



    // línea inicial común (sin punto ni ; todavía)
    private String fraseInicial(String animal) {
        return "There was an old lady who swallowed a " + animal;
    }

    // línea final común: usa el PRIMER animal de la canción
    private String fraseFinal(String primerAnimal) {
        return "I don't know why she swallowed a " + primerAnimal + " - perhaps she'll die!\n";
    }

    private String lineasCatch(String animal, List<String> anteriores) {
        String resultado = "";

        if (anteriores.size() == 1) {
            resultado += "She swallowed the " + animal + " to catch the " + anteriores.get(0) + ";\n";
        }

        if (anteriores.size() == 2) {
            resultado += "She swallowed the " + animal + " to catch the " + anteriores.get(1) + ",\n";
            resultado += "She swallowed the " + anteriores.get(1) + " to catch the " + anteriores.get(0) + ";\n";
        }

        return resultado;
    }

    private String estrofa(String animal, List<String> anteriores, String primerAnimal) {
        String resultado = "";

        // línea inicial: punto en la primera estrofa, ; en las demás
        if (anteriores.isEmpty()) {
            resultado += fraseInicial(animal) + ".\n";
        } else {
            resultado += fraseInicial(animal) + ";\n";
        }

        // primera estrofa → solo línea final
        if (anteriores.isEmpty()) {
            resultado += fraseFinal(primerAnimal);
            return resultado;
        }

        // Frase especial del fly si el animal actual es fly o si fly está en anteriores
        if (animal.equals("fly") || anteriores.contains("fly")) {
            resultado += fraseEspecial("fly");
        }


        // líneas "to catch the ..."
        resultado += lineasCatch(animal, anteriores);

        // línea final
        resultado += fraseFinal(primerAnimal);

        return resultado;
    }
}
