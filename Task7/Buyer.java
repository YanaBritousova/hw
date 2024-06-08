package Task7;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Buyer extends Thread implements IBuyer,IUseBasket{
    private int number;
    private Basket basket;
    private final Map<String, Integer> goods;


    public Buyer(Map<String,Integer> goods) {
        this.basket = new Basket();
        this.goods = goods;
        this.number = new Random().nextInt(1000);
    }

    @Override
    public void start() {
        enterToMarket();
        takeBasket();
        putGoodsToBasket();
        goOut();
    }

    @Override
    public void enterToMarket() {
        System.out.println("Buyer "+this.number+ " entered to market");
    }

    private String chooseRandomGood(){
        int numGood = new Random().nextInt(this.goods.size());

        return (String) goods.keySet().toArray()[numGood];
    }

    @Override
    public void chooseGoods() {
        try {
            Thread.sleep(new Random().nextInt(1500) + 500);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        int numGoods = new Random().nextInt(4) + 1;
        for (int i=0;i<numGoods;i++){
            String good = chooseRandomGood();
            int price = goods.get(good);
            basket.putGood(good, price);
            System.out.println("Buyer "+this.number+ " chose " + good + " for " + price);

        }
        System.out.println("Buyer "+this.number+" chose goods");

    }

    @Override
    public void goOut() {
        System.out.println("Buyer "+this.number+ " went out");
    }

    @Override
    public void takeBasket() {
        try {
            Thread.sleep(new Random().nextInt(1500) + 500);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Buyer "+this.number+ " took basket");
    }

    @Override
    public void putGoodsToBasket() {
        try {
            Thread.sleep(new Random().nextInt(1500) + 500);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        chooseGoods();

    }
    private class Basket{
        private Map<String,Integer> basketFill=new HashMap<>();

        private void putGood(String good, Integer price){
            basketFill.put(good,price);
        }
    }
}
