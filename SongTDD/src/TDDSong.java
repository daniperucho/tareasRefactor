import java.util.List;

public class TDDSong {

    public String Song(List<String> animals) {

        if (animals.isEmpty()) return "";

        String resultado = "";

        for (int i = 0; i < animals.size(); i++) {
            String animal = animals.get(i);
            List<String> anteriores = animals.subList(0, i);

            resultado += estrofa(animal, anteriores, animals.get(0));

            if (i < animals.size() - 1) {
                resultado += "\n";
            }
        }

        return resultado;
    }

    private String fraseEspecial(String animal) {
        if (animal.equals("fly")) {
            return "That wriggled and wiggled and tickled inside her.\n";
        }
        if (animal.equals("bird")) {
            return "How absurd to swallow a bird.\n";
        }
        return "";
    }

    private String fraseInicial(String animal) {
        return "There was an old lady who swallowed a " + animal;
    }

    private String fraseFinal(String primerAnimal) {
        return "I don't know why she swallowed a " + primerAnimal + " - perhaps she'll die!\n";
    }

    private String lineasCatch(String animal, List<String> anteriores) {
        String resultado = "";

        if (anteriores.size() == 1) {
            resultado += "She swallowed the " + animal + " to catch the " + anteriores.get(0) + ".\n";
        }

        if (anteriores.size() == 2) {
            resultado += "She swallowed the " + animal + " to catch the " + anteriores.get(1) + ",\n";
            resultado += "She swallowed the " + anteriores.get(1) + " to catch the " + anteriores.get(0) + ".\n";
        }

        return resultado;
    }

    private String estrofa(String animal, List<String> anteriores, String primerAnimal) {
        String resultado = "";

        // Línea inicial
        if (anteriores.isEmpty()) {
            resultado += fraseInicial(animal) + ".\n";
        } else {
            resultado += fraseInicial(animal) + ".\n";
        }

        // Primera estrofa
        if (anteriores.isEmpty()) {
            resultado += fraseFinal(primerAnimal);
            return resultado;
        }

        // Frase especial del animal actual (solo fly o bird)
        if (animal.equals("fly") || animal.equals("bird")) {
            resultado += fraseEspecial(animal);
        }

        // Frase especial del fly si el anterior inmediato es fly
        if (!anteriores.isEmpty() && anteriores.get(anteriores.size() - 1).equals("fly") && !animal.equals("fly")) {
            resultado += fraseEspecial("fly");
        }

        // Catch
        resultado += lineasCatch(animal, anteriores);

        // Final
        resultado += fraseFinal(primerAnimal);

        return resultado;
    }
}