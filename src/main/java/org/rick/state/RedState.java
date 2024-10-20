package org.rick.state;

public class RedState implements TrafficLightState {
    @Override
    public void nextState(TrafficLight trafficLight) {
        trafficLight.setState(new YellowState());
    }

    @Override
    public void displayState() {
        System.out.println("Traffic light is RED.");
    }
}
