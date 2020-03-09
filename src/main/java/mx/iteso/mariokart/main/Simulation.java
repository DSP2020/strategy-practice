package mx.iteso.mariokart.main;

import mx.iteso.mariokart.characters.Bowser;
import mx.iteso.mariokart.characters.DryBones;
import mx.iteso.mariokart.characters.PeachPrincess;

public class Simulation {
    public static void main(String[] args) {
        Bowser bowser = new Bowser();
        DryBones dryBones = new DryBones();
        PeachPrincess peachPrincess = new PeachPrincess();

        int time = 3000;
        int i = 0;

        for (i = 0; i < time; i++) {
            bowser.setTotalMeters(bowser.getTotalMeters() + bowser.getActualAcceleration().getAccelerationValue());
            dryBones.setTotalMeters(dryBones.getTotalMeters() + dryBones.getActualAcceleration().getAccelerationValue());
            peachPrincess.setTotalMeters(dryBones.getTotalMeters() + dryBones.getActualAcceleration().getAccelerationValue());
        }
        System.out.println("Total " + bowser.getTotalMeters());
        System.out.println("Total " + dryBones.getTotalMeters());
        System.out.println("Total " + peachPrincess.getTotalMeters());


    }
}
