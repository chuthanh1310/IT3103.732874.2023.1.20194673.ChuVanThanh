package aims.media;

import java.util.List;
import java.util.ArrayList;
public class Book extends Media {
    private List<String> authors = new ArrayList<>();
    public Book(){
        super();
    }
    public void addAuthor(String authorName) {
        // Ensure that the author is not already in the List before adding
        if (!authors.contains(authorName)) {
            authors.add(authorName);
            System.out.println(authorName + " added as an author to " + title);
        } else {
            System.out.println(authorName + " is already an author of " + title);
        }
    }

    public void removeAuthor(String authorName) {
        // Ensure that the author is present in the List before removing
        if (authors.contains(authorName)) {
            authors.remove(authorName);
            System.out.println(authorName + " removed as an author from " + title);
        } else {
            System.out.println(authorName + " is not an author of " + title);
        }
    }
    public void printAuthors() {
        System.out.println("Authors:");
        for (String author : authors) {
            System.out.println(author);
        }
    }
}