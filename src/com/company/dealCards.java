package com.company;

/**
 * Created by mbila on 4/21/15.
 */

import java.util.Random;

public class dealCards {
    private int handSize = 5;
    private int hand1[];
    private int hand2[];

    public void dealHand(int playerNum) {
        for (int i = 0; i <= handSize; i++) {
            int counter = 1;
            System.out.println("Dealing card " + counter);
            final int MAX = 14;
            final int MIN = 2;
            Random rand = new Random();
            int randomNum = rand.nextInt(MAX - MIN) + MIN;
            if (playerNum == 1) {
                hand1[counter] = randomNum;
            } else {
                hand2[counter] = randomNum;
            }
            counter++;
        }
    }

    public void viewHand(int playerNum) {
        int counter = 0;
        if (playerNum == 1) {
            for (int i = 0; i < handSize; i++) {
                CardValue cards = new CardValue();
                System.out.println("Player 1's Hand: ");
                System.out.println(cards.getCardValue(hand1[counter]));
                counter++;
            }
        } else {
            for (int j = 0; j < handSize; j++) {
                CardValue cards = new CardValue();
                System.out.println("Player 2's Hand: ");
                System.out.println(cards.getCardValue(hand2[counter]));
            }
        }
    }

    public void evalHand(int playerNum) {
        int numCardsToPair = 5;

        if (playerNum == 1) {
            int counter = 0;
            int secondCounter = 1;
            for (int i = 0; i <= numCardsToPair; i++) {
                if (hand1[counter] == hand1[secondCounter]) {
                    System.out.println(hand1[counter] + "matches " + hand1[secondCounter]);
                    secondCounter++;
                    //scans through hand matching cards
                }
            }
        } else {
            int counter = 0;
            int secondCounter = 1;
            for (int i = 0; i <= numCardsToPair; i++) {
                if (hand2[counter] == hand2[secondCounter]) {
                    System.out.println(hand2[counter] + "matches " + hand2[secondCounter]);
                    secondCounter++;
                    //couldn't think of another way to check hands
                }
            }
        }
    }
}
