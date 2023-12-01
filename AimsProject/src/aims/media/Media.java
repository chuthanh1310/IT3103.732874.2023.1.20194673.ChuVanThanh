package aims.media;

public abstract class Media {
    protected int id;
    protected String title;
    protected String category;
    protected float cost;

    protected Media() {
        super();
    }
    protected Media(String title) {
        this();
        this.title = title;
    }
    protected Media(String title, String category) {
        this(title);
        this.category = category;
    }

    protected Media(String title, String category, float cost) {
        this(title, category);
        this.cost = cost;
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public float getCost() {
        return cost;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
}
