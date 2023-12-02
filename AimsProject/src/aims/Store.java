package aims;

import java.util.ArrayList;

import aims.media.Media;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();
    
    // Method to add Media to the store
    public void addMedia(Media media) {
        itemsInStore.add(media);
        System.out.println("Added " + media.getTitle() + " to the store.");
    }

    // Method to remove Media from the store
    public void removeMedia(Media media) {
        if (itemsInStore.remove(media)) {
            System.out.println("Removed " + media.getTitle() + " from the store.");
        } else {
            System.out.println(media.getTitle() + " not found in the store.");
        }
    }
    public void printStore(){
        System.out.println("*******************************Store*******************************");
        for(Media media:itemsInStore){
            System.out.println(media.toString());
        }
        System.out.println("*******************************************************************");
    }
    public Media searchStore(String title){
        for(Media media: itemsInStore){
        	if(media.getTitle() != null) {
        		if(media.getTitle().equals(title)) return media;
        	}
        }
        return null;
    }
}
