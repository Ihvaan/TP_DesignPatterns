package Prototype_IntelligenceArtificielle;

public class InformationAgent extends IntelligentAgent {
    @Override
    public InformationAgent clone() {
        return new InformationAgent();
    }

    @Override
    public void processRequest() {
        System.out.println("Request processed using various information sources.");
    }
}

