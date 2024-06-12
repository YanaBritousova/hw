package Task9;

public class App {

    public static void main(String[]args){
        Channel channel = new Channel();
        channel.addSubscriber(new SubscriberA("Alice"));
        channel.addSubscriber(new SubscriberA("Nick"));

        channel.addArticle(new Article("SOLID"));
    }
}
