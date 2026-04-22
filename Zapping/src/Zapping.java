public class Zapping {

    public static int clics(int canalA, int canalB) {

        int retroceder = (canalA - canalB + 99) % 99;
        int avanzar = (canalB - canalA + 99) % 99;
        return Math.min(avanzar, retroceder);
    }
}
