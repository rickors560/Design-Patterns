package org.rick.state;

public class StatePattern {
    // allows an object to alter its behavior when its internal state changes.
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        for (int i = 0; i < 10; i++) {
            trafficLight.changeState();
            trafficLight.displayState();
        }
    }
}
