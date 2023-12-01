package test;
import aims.Store;
import aims.media.DigitalVideoDisc;
public class StoreTest {
    public static void main(String[] args) {
        // Example usage of the Store class
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);;
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);;
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);
        Store dvdStore = new Store();
        dvdStore.addDVD(dvd1);
        dvdStore.addDVD(dvd2);
        dvdStore.addDVD(dvd3);
        dvdStore.removeDVD("The Lion King");
        dvdStore.removeDVD("Movie 3"); 
    }
}
