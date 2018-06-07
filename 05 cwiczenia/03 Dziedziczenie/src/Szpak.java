public class Szpak extends Ptak {
    @Override
    public String toString() {
        return "Jestem szpakiem";
    }

    @Override
    public void poruszajSie() {
        System.out.println("Lecę!!!");
    }
}