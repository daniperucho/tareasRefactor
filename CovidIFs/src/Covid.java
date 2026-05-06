public static String covid(float bodyTemperature, boolean difficultyBreathing,
                          boolean diabetes, boolean cancer, boolean isPregnant,
                          boolean isOver60yearsold, boolean hepatic,
                          boolean kidnevDisease, boolean respiratoryDisease, boolean sintomasSi,
                           String provincia) {

    boolean riesgo = diabetes || cancer || isPregnant || isOver60yearsold ||
            hepatic || kidnevDisease || respiratoryDisease;

    if (bodyTemperature >= 38 && difficultyBreathing) {
        sintomasSi = true;
    }




    if (sintomasSi || (bodyTemperature >= 38 && riesgo)){
        return "/diagnostico/" + provincia;
    } else if (bodyTemperature >= 38) {
        return "/cuarentena/";
    } else {
        return "/diagnostico_bueno/";
    }
}

void main() {
}