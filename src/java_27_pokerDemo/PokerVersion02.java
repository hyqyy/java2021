package java_27_pokerDemo;

import java.util.*;

public class PokerVersion02 {
    /**
     * 利用程序模拟斗地主，洗牌，发牌，看牌(实现排序)
     */

    /**
     * 创建新牌
     */
    public static HashMap<Integer, String> createCards() {

        HashMap<Integer, String> pokers = new HashMap<>();
        String[] colors = {"♥", "♠", "♦", "♣"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        Integer i = 0;

        for (String number : numbers) {
            for (String color : colors) {
                String poker = color + number;
                pokers.put(i, poker);
                i++;
            }
        }

        pokers.put(52, "小王");
        pokers.put(53, "大王");
        return pokers;

    }


    /**
     * 洗牌
     */
    public static ArrayList<Integer> shuffleCards() {

        ArrayList<Integer> keys = new ArrayList<>();

        for (int i = 0; i < 54; i++) {
            keys.add(i);
        }

        Collections.shuffle(keys);
        return keys;

    }


    /**
     * 发牌
     */
    public static HashMap<String, TreeSet<Integer>> distributeCards(ArrayList<Integer> keys) {

        HashMap<String, TreeSet<Integer>> playerCards = new HashMap<>();

        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
        TreeSet<Integer> dp = new TreeSet<>();


        for (int index = 0; index < keys.size(); index++) {
            if (index >= keys.size() - 3) {
                dp.add(keys.get(index));
            } else if (index % 3 == 0) {
                player1.add(keys.get(index));
            } else if (index % 3 == 1) {
                player2.add(keys.get(index));
            } else {
                player3.add(keys.get(index));
            }

        }

        playerCards.put("孙悟空", player1);
        playerCards.put("猪八戒", player2);
        playerCards.put("沙和尚", player3);
        playerCards.put("底牌", dp);


        return playerCards;
    }


    /**
     * 看牌
     */
    public static void lookCards(HashMap<String, TreeSet<Integer>> playersCards, HashMap<Integer, String> pokers) {

        for (Map.Entry<String, TreeSet<Integer>> entry : playersCards.entrySet()) {
            if (entry.getKey().equals("底牌")) {
                System.out.print(entry.getKey() + "是：");
                System.out.println();
            } else {
                System.out.print(entry.getKey() + "的牌是：");
                System.out.println();
            }
            for (Integer card : entry.getValue()) {
                System.out.print(pokers.get(card) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        //创建新牌
        HashMap<Integer, String> pokers = createCards();
        System.out.println("新牌：" + pokers);
        System.out.println();
        //洗牌
        ArrayList<Integer> keys = shuffleCards();
        System.out.println("洗牌后：" + keys);
        System.out.println();
        // 发牌
        HashMap<String, TreeSet<Integer>> playersCards = distributeCards(keys);
        System.out.println("发牌：" + playersCards);
        System.out.println();
        // 看牌
        lookCards(playersCards, pokers);

    }

}
