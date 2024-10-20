package org.rick.state;

public class TrafficLight {
    private TrafficLightState state;

    public TrafficLight() {
        state = new RedState();
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void changeState() {
        state.nextState(this);
    }

    public void displayState() {
        state.displayState();
    }
}
