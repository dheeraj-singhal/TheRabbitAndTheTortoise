package main;

import thread.rabbit.Rabbit;
import thread.tortoise.Tortoise;

import javax.swing.*;

import static java.lang.Thread.sleep;

public class Race {
    public static void main(String[] args) throws InterruptedException {
        Rabbit rabbit = new Rabbit();
        rabbit.getRabbit().start();
        Tortoise tortoise = new Tortoise();
        tortoise.getTortoise().start();
        String resultOfRace;
        // sleep is added to wait for some time so that all the players can complete the race in the mean time and the result can be announced.
        sleep(25000L);
        System.out.println("Rabbit takes " + rabbit.getTimeTakenByRabbitToCompleteTheRace() + " sec to complete the Race!");
        System.out.println("Tortoise takes " + tortoise.getTimeTakenByTortoiseToCompleteTheRace() + " sec to complete the Race!");
        if (tortoise.getTimeTakenByTortoiseToCompleteTheRace() > rabbit.getTimeTakenByRabbitToCompleteTheRace()) {
            resultOfRace = "Rabbit wins the race!";
        } else if (tortoise.getTimeTakenByTortoiseToCompleteTheRace() < rabbit.getTimeTakenByRabbitToCompleteTheRace()) {
            resultOfRace = "Tortoise wins the race!";
        } else {
            resultOfRace = "No ones wins the race";
        }
        JOptionPane.showConfirmDialog(null, resultOfRace, "Result", JOptionPane.OK_CANCEL_OPTION);
    }
}
