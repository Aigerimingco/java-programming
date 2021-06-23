package day56_abstraction.greeting;

import day56_abstraction.greeting.Greeting;

public class Japanese implements Greeting {
    @Override
    public void hi() {
        System.out.println("salam");
    }

    @Override
    public void bye() {
        System.out.println("jakshy kal");
    }
}
