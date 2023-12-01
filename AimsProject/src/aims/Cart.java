package aims;
import aims.media.DigitalVideoDisc;
public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private int qtyOrdered;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBER_ORDERED) {
            this.itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("Add success!");
        } else {
            System.out.println("Cart is full. Cannot add more DVDs.");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] != null && itemsOrdered[i].equals(disc)) {
                itemsOrdered[i] = null;
                qtyOrdered--;
                System.out.println("Remove success!");
                return; // exit method after removing the disc
            }
        }
        System.out.println("DVD not found in the cart.");
    }

    public float totalCost() {
        float totalCost = 0.0f;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] != null) {
                totalCost += this.itemsOrdered[i].getCost();
            }
        }
        return totalCost;
    }
    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
        if(qtyOrdered+dvdList.length<=MAX_NUMBER_ORDERED){
            qtyOrdered=qtyOrdered+dvdList.length;
            System.arraycopy(dvdList, 0, this.itemsOrdered, qtyOrdered, dvdList.length);
            System.out.println("The disc has been added.");
        } else {
            System.out.println("The cart is almost full.");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2){
        if(qtyOrdered+2<=MAX_NUMBER_ORDERED){
            this.itemsOrdered[qtyOrdered]=dvd1;
            this.itemsOrdered[qtyOrdered+1]=dvd2;
            qtyOrdered=qtyOrdered+2;
            System.out.println("The disc has been added.");
        } else {
            System.out.println("The cart is almost full.");
        }
    }
    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered items:");
        for(int i = 0; i < qtyOrdered; i++) {
            System.out.println(i + 1 + ". DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + ": " + itemsOrdered[i].getCost() + "$");
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }

    public void isMatch(int id){
        for(int i = 0; i < qtyOrdered; i++) {
            if(itemsOrdered[i].isMatch(id)) {
                itemsOrdered[i].print();
                return;
            }
        }
        System.out.println("Not Found DVD id: "+id);
    }

    public void isMatch(String title){
        for(int i = 0; i < qtyOrdered; i++) {
            if(itemsOrdered[i].isMatch(title)) {
                itemsOrdered[i].print();
                return;
            }
        }
        System.out.println("Not Found DVD title: "+title);
    }

}
