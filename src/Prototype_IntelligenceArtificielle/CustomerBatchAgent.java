package Prototype_IntelligenceArtificielle;

import java.util.ArrayList;
import java.util.List;

public class CustomerBatchAgent {
    private List<IntelligentAgent> agents = new ArrayList<>();

    public void addAgent(IntelligentAgent agent) {
        agents.add(agent.clone());
    }

    public List<IntelligentAgent> getAgents() {
        return agents;
    }
}

