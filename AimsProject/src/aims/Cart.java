package aims;
import java.util.List;
import java.util.ArrayList;
import aims.media.Media;
public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private List<Media> itemsOrdered = new ArrayList<Media>();
    

    public void addMedia(Media media) {
        if (itemsOrdered.size() < MAX_NUMBER_ORDERED) {
            if(itemsOrdered.contains(media)) {
                System.out.println("The media is already in the cart");
                return;
            }
            itemsOrdered.add(media);
            System.out.println("The media has been added");
        } else {
            System.out.println("The cart is almost full");
        }
    }

    // Method to remove Media from the cart
    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println("The media has been removed");
        } else {
            System.out.println("The media is not in the cart");
        }
    }
    public float totalCost() {
        int totalCost = 0;
    
        for (Media media : itemsOrdered) {
            totalCost += media.getCost();
        }
    
        return totalCost;
    }
    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered items:");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            System.out.println(i + 1 + ". DVD - " + itemsOrdered.get(i).getTitle() + " - "
                    + itemsOrdered.get(i).getCategory() + ": " + itemsOrdered.get(i).getCost() + "$");
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }
    
    public List<Media> getItemOrdered() {
        return itemsOrdered;
    }
    
    public Media Search(String title){
        for(Media media: itemsOrdered){
            if(media.getTitle().equals(title)) return media;
        }
        return null;
    }
    
    

}
