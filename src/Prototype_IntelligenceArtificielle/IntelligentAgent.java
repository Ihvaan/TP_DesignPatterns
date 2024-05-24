package Prototype_IntelligenceArtificielle;

abstract class IntelligentAgent implements Cloneable {
    public abstract IntelligentAgent clone();
    public abstract void processRequest();
}

