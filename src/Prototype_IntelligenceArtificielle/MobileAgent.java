package Prototype_IntelligenceArtificielle;

import java.util.Random;

public class MobileAgent extends IntelligentAgent {
    @Override
    public MobileAgent clone() {
        return new MobileAgent();
    }

    @Override
    public void processRequest() {
        Random rand = new Random();
        System.out.println("Request processed by computer: " + rand.nextInt(10));
    }
}
