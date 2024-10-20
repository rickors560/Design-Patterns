package org.rick.state;

public interface TrafficLightState {
    void nextState(TrafficLight trafficLight);

    void displayState();
}
