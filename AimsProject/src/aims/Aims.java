package aims;
import aims.media.DigitalVideoDisc;
public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Lion King","Animation","Roger Allers",87,2f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Animation","George Lucas",87,9f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",10f);
        anOrder.addDigitalVideoDisc(dvd3);

        System.out.println("Total Cost:");
        System.err.println(anOrder.totalCost());

        anOrder.removeDigitalVideoDisc(dvd3);

        System.out.println("Total Cost:");
        System.err.println(anOrder.totalCost());
    }
}
