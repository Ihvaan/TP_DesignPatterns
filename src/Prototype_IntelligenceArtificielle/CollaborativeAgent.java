package Prototype_IntelligenceArtificielle;

import java.util.Random;

public class CollaborativeAgent extends IntelligentAgent {
    @Override
    public CollaborativeAgent clone() {
        return new CollaborativeAgent();
    }

    @Override
    public void processRequest() {
        Random rand = new Random();
        System.out.println("Request processed with contributors: " +
                rand.nextInt(10) + ", " + rand.nextInt(10));
    }
}

