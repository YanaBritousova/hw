package Task9;

public class SubscriberA implements Subscriber{
    private String name;

    public SubscriberA(String name) {
        this.name = name;
    }

    @Override
    public void update(Article article) {
        System.out.println(String.format("Hello, %s! Channel has new article: %s",this.name, article.getName()));
    }
}
