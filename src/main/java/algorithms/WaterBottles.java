package algorithms;

public class WaterBottles {

    public static int numWaterBottles(int numBottles, int numExchange) {

        // drink
        int ans = numBottles;

        // while we can exchange for a full bottle
        while (numBottles >= numExchange) {
            // exchange and drink
            ans += numBottles / numExchange;
            numBottles = numBottles / numExchange + numBottles % numExchange;
        }

        return ans;
    }
}
