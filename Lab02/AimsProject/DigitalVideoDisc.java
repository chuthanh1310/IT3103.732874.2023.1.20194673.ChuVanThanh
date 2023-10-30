
public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    public String getTitle() {
        return title;
    }
    
    public String getCategory() {
        return category;
    }
   
    public String getDirector() {
        return director;
    }
    
    public int getLength() {
        return length;
    }
    public float getCost() {
        return cost;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {

        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }
 
public class Cart{
    
    public static final int MAX_NUMBERS_ORDERED =20;   
    
    private int count;
    private DigitalVideoDisc[]  itemsOrdered;
    private int qtyOrdered;
    public Cart() {
        itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED]; 
        
        count = 0; 
        qtyOrdered=0;
    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc discs) {
        if (disc != null ) {
            if (count < discs.length) {
                discs[count] = disc;
                
                count++;
            } else {
                System.out.println("Cart is full. Cannot add more DVDs.");
            }
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc discs, int quantity) {
        for (int i = 0; i < count; i++) {
            if (discs[i] != null && discs[i].equals(disc)) {
                if (quantities[i] <= quantity) {
                    discs[i] = null;
                    quantities[i] = 0;
                    count--;
                } else {
                    quantities[i] -= quantity;
                }
            }
        }
    }

    public float totalCost() {
        float totalCost = 0.0f;
        for (int i = 0; i < count; i++) {
            if (discs[i] != null) {
                totalCost += discs[i].getCost() * quantities[i];
            }
        }
        return totalCost;
    }
}
public static void main(String[] args) {
    Cart anOrder =new Cart();
    DigitalVideoDisc dvd1= new DigitalVideoDisc("The Lion King","Animation","Roger Allers", 87, 19.95f);
    DigitalVideoDisc dvd2= new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas", 87, 24.95f);
    DigitalVideoDisc dvd3= new DigitalVideoDisc("Aladin","Animation", "",87, 19.95f);
    anOrder.addDigitalVideoDisc(dvd);
    System.out.println("Total cost is");
    System.out.println(anOrder.totalCost());
}
}

