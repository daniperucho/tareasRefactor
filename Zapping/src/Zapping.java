public class Zapping {

    public static int clics(int canalA, int canalB) {

        int retroceder = (canalB - canalA + 99) % 99;
        int avanzar = (canalA - canalB + 99) % 99;
        return Math.min(avanzar, retroceder);
    }
}
