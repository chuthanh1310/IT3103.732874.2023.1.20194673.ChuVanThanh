package aims.media;

public class DigitalVideoDisc extends Disc {
    public DigitalVideoDisc(String title) {
        
        this.title = title;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }
    public boolean isMatch(int id) {
        return id==this.id;
    }
    
    public boolean isMatch(String title) {
        return title.equals(this.title);
    }

    public void print() {
        System.out.println(id + " - " + title + " - " + category + " - " + director + " - " + length + ": " + cost + "$");
    }
}
