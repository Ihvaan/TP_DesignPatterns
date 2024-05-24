package Prototype_IntelligenceArtificielle;

import java.util.Random;

public class InterfaceAgent extends IntelligentAgent {
    @Override
    public InterfaceAgent clone() {
        return new InterfaceAgent();
    }

    @Override
    public void processRequest() {
        Random rand = new Random();
        System.out.println("Request processed using graphical components: " +
                rand.nextInt(10) + ", " + rand.nextInt(10) + ", " + rand.nextInt(10));
    }
}

