
package AimsProject;
public class Store {
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[100];
    private int itemCount =0;


    // Method to add a DVD to the store
    public void addDVD(DigitalVideoDisc dvd) {
        if (itemCount < 100) {
            itemsInStore[itemCount] = dvd;
            itemCount++;
            System.out.println("DVD added to the store: " + dvd.getTitle());
        } else {
            System.out.println("Store is full. Cannot add more DVDs.");
        }
    }

    // Method to remove a DVD from the store
    public void removeDVD(String title) {
        int index = findDVDIndex(title);

        if (index != -1) {
            System.out.println("DVD removed from the store: " + itemsInStore[index].getTitle());
            // Shift DVDs to fill the gap
            for (int i = index; i < itemCount - 1; i++) {
                itemsInStore[i] = itemsInStore[i + 1];
            }
            itemsInStore[itemCount - 1] = null; // Set the last element to null
            itemCount--;
        } else {
            System.out.println("DVD with title '" + title + "' not found in the store.");
        }
    }

    // Helper method to find the index of a DVD by title
    private int findDVDIndex(String title) {
        for (int i = 0; i < itemCount; i++) {
            if (itemsInStore[i].getTitle().equals(title)) {
                return i;
            }
        }
        return -1; // Return -1 if DVD not found
    }

    // Other methods and properties can be added as needed

    
}


