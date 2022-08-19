package com.company;

public class Mars<landing, Landing> {

    public static void main(String[] args) throws InterruptedException {
        String colonyName = " Nomnom ";
        int shipPopulation = 300;
        double shipFood = 4000.00;
        boolean landing = true;
        System.out.println(colonyName);
        System.out.println(shipPopulation);
        System.out.println(shipFood);
        System.out.println(landing);

        shipFood = shipFood - (shipFood * 0.75);
        shipFood = shipFood - (shipFood * 0.75);
        System.out.println(shipFood);

        shipFood = shipFood + (shipFood * .5);
        System.out.println(shipFood);

        shipPopulation += 5;
        System.out.println(shipPopulation);

        String LandingLocation = " The Ocean ";
        System.out.println(LandingLocation);

        if (LandingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bbzzz Landing on the Plain");

        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");

        }

        landing = landingCheck(100);


        new GuessingGame();
        new MarsExpedition();
        new FindingsLists();
    }


    private static boolean landingCheck(int loops) throws InterruptedException {
        for (int i = 0; i <= loops; i++) {
            if (((i % 3) == 0 && (i % 5) == 0)) {
                System.out.println("“Keep Center");
            } else if ((i % 5) == 0) {
                System.out.println("Right");
            } else if ((i % 3) == 0) {
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;
    }
}