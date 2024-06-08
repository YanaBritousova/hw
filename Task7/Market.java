package Task7;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Market {
    private final static int time = 120;
    private final static int maxNumBuyers = 2;

    private final static int numThreads = 4;

    private static Map<String,Integer> makeGoodsMap(){
        Map<String, Integer> goods = new HashMap<>();
        goods.put("Apple", 10);
        goods.put("Orange", 15);
        goods.put("Banana", 20);
        goods.put("Pear", 25);
        return goods;
    }

    public static void main(String[]args){

        ExecutorService executorService = Executors.newFixedThreadPool(numThreads);
        Map<String,Integer> goods = makeGoodsMap();
        for (int i=0;i<time;i++){
            int numBuyers = new Random().nextInt(maxNumBuyers+1);
            for (int j=0; j<numBuyers;j++){
                executorService.submit(()->{
                    Buyer buyer = new Buyer(goods);
                    buyer.start();
                });
            }
        }
        executorService.shutdown();
    }
}
