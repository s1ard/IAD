package nl.saxion.iad.coin;

import nl.saxion.app.SaxionApp;

public class CoinMain implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new CoinMain());
    }

    public void run() {
        final int NR_OF_TOSSES = 10_000_000;

        //TODO: fill in this method

    }

    /**
     * Toss a coin.
     *
     * @return 0 if heads, 1 if tails
     */
    public int tossCoin() {
        //TODO: implement

    }

    private void printResults(String title, int heads, int tails, double diff, double ratio) {
        SaxionApp.printLine(title + ":");
        SaxionApp.printLine();
        SaxionApp.printLine("Heads: " + heads);
        SaxionApp.printLine("Tails: " + tails);
        SaxionApp.printLine("Difference: " + diff);
        SaxionApp.printLine("Relative difference: " + ratio + "%");
        SaxionApp.printLine();
    }

    /**
     * Toss an unfair coin, larger probability for tails
     *
     * @return 0 if heads, 1 if tails
     */
    public int tossUnfairCoin() {
        //TODO: implement; there are many possibilities

    }
}
