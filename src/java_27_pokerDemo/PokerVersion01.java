package java_27_pokerDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PokerVersion01 {

    /**
     * 利用程序模拟斗地主，洗牌，发牌，看牌
     */

    /**创建新牌*/
    public static ArrayList<String> createCards() {

        ArrayList<String> pokers = new ArrayList<>();
        String[] colors = {"♥", "♠", "♦", "♣"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        for (String number : numbers) {
            for (String color : colors) {
                pokers.add(color + number);
            }
        }

        pokers.add("大王");
        pokers.add("小王");

        return pokers;

    }


    /**洗牌*/
    public static ArrayList<String> shuffleCards(ArrayList<String> pokers) {

        Collections.shuffle(pokers);
        return pokers;

    }


    /**发牌*/
    public static HashMap<String, ArrayList<String>> distributeCards(ArrayList<String> pokers) {

        HashMap<String, ArrayList<String>> playerCards = new HashMap<>();

        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dp = new ArrayList<>();

        for (int i = 0; i < pokers.size(); i++) {


            String poker = pokers.get(i);
            if (i >= pokers.size() - 3) {
                dp.add(poker);
            } else if (i % 3 == 0) {
                player1.add(poker);
            } else if (i % 3 == 1) {
                player2.add(poker);
            } else {
                player3.add(poker);
            }
        }

        playerCards.put("孙悟空",player1);
        playerCards.put("猪八戒",player2);
        playerCards.put("沙和尚",player3);
        playerCards.put("底牌",dp);


        return playerCards;
    }


    /**看牌*/
    public static void lookCards(HashMap<String, ArrayList<String>> playersCards) {

        for (Map.Entry<String, ArrayList<String>> entry : playersCards.entrySet()) {
            if(entry.getKey().equals("底牌")){
                System.out.print(entry.getKey() + "是：");
            }else {
                System.out.print(entry.getKey() + "的牌是：");
            }
            for (String card : entry.getValue()) {
                System.out.print(card + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {




        // 创建新牌
        ArrayList<String> pokers = createCards();
        // 洗牌
        ArrayList<String> cards = shuffleCards(pokers);
        // 发牌
        HashMap<String, ArrayList<String>> playersCards = distributeCards(cards);
        // 看牌
        lookCards(playersCards);

    }

}

