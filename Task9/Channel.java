package Task9;

import java.util.ArrayList;
import java.util.List;

public class Channel {

    private List<Subscriber> subscribers;
    private List<Article> articles;

    public Channel(){
        this.subscribers=new ArrayList<>();
        this.articles=new ArrayList<>();
    }

    public void addSubscriber(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(Article article){
        for (Subscriber subscriber: subscribers){
            subscriber.update(article);
        }
    }

    public void addArticle(Article article){
        articles.add(article);
        notifySubscribers(article);
    }
}
