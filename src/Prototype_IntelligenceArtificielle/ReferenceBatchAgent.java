package Prototype_IntelligenceArtificielle;

import java.util.ArrayList;
import java.util.List;

public class ReferenceBatchAgent {
    private static ReferenceBatchAgent instance;
    private List<IntelligentAgent> agents = new ArrayList<>();

    private ReferenceBatchAgent() {
        agents.add(new MobileAgent());
        agents.add(new InformationAgent());
        agents.add(new InterfaceAgent());
        agents.add(new CollaborativeAgent());
    }

    public static synchronized ReferenceBatchAgent getInstance() {
        if (instance == null) {
            instance = new ReferenceBatchAgent();
        }
        return instance;
    }

    public List<IntelligentAgent> getAgents() {
        return agents;
    }
}

