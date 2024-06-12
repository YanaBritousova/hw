package Task9;

public class Article {

    private String name;

    private String text;

    public String getName() {
        return name;
    }

    public Article(String name) {
        this.name = name;
    }

    public Article(String name, String text) {
        this.name = name;
        this.text = text;
    }
}
