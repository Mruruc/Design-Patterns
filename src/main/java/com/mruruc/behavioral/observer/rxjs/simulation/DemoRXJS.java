package com.mruruc.behavioral.observer.rxjs.simulation;

public class DemoRXJS {
    public static void main(String[] args) {

        final var serverStream = new SimpleObservable<String>();

        // 2. Define the Subscriber (The Observer)
        Observer<String> angularComponent = new Observer<>() {
            @Override
            public void next(String data) {
                System.out.println("COMPONENT: Received data -> " + data);
            }

            @Override
            public void error(Exception e) {
                System.out.println("COMPONENT: ALERT! Something went wrong: " + e.getMessage());
            }

            @Override
            public void complete() {
                System.out.println("COMPONENT: Stream is over. Hiding loading spinner.");
            }
        };

        final var anotherComp = new Observer<String>() {

            @Override
            public void next(String data) {
                System.out.println("Another Component received data: " + data);
            }

            @Override
            public void error(Exception exception) {

            }

            @Override
            public void complete() {

            }
        };

        // 3. Connect them
        System.out.println("--- Subscribing ---");
        serverStream.subscribe(angularComponent);
        serverStream.subscribe(anotherComp);

        // 4. Simulate data flow
        serverStream.next("User Mruruc logged in");
        serverStream.next("Loading Dashboard...");

        // 5. Simulate completion
        serverStream.complete();

        System.out.println("--- Trying to send data after complete ---");
        serverStream.next("This data will be ignored because isCompleted = true");
    }
}
