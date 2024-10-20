package org.rick.state;

public class GreenState implements TrafficLightState {
    @Override
    public void nextState(TrafficLight trafficLight) {
        trafficLight.setState(new RedState());
    }

    @Override
    public void displayState() {
        System.out.println("Traffic light is GREEN.");
    }
}
