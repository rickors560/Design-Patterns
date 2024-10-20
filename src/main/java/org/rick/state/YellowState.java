package org.rick.state;

public class YellowState implements TrafficLightState {
    @Override
    public void nextState(TrafficLight trafficLight) {
        trafficLight.setState(new GreenState());
    }

    @Override
    public void displayState() {
        System.out.println("Traffic light is YELLOW.");
    }
}
