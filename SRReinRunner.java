

public class SRReinRunner
{
    public static void main(String args [])
    {
        //Initiating the reindeers
        Reindeer testS = new Reindeer("Sam", true, 100);
        Reindeer testG = new Reindeer("Grace", false, 20);
        Reindeer testA = new Reindeer("Aven", true, 95);
        Reindeer testJ = new Reindeer("Josh", true, 110);

        //Test methods
        //getName
        System.out.println("testS Reindeer name is: " + testS.getName());
        
        //doesNoseGlow
        System.out.println("testG Reindeer nose glow: " + testG.doesNoseGlow());
        
        //getEnergyLevel
        System.out.println("testA Reindeer energy level is: " + testA.getEnergyLevel());
        
        //changeName
        System.out.println("testJ Reindeer name is: " + testJ.getName());
        testJ.changeName("Joshua");
        System.out.println("testJ Reindeer name is now: " + testJ.getName());
        
        //setNoseAbility
        System.out.println("testG Reindeer nose glow is: " + testG.doesNoseGlow());
        testG.setNoseAbility(true);
        System.out.println("testG Reindeer nose glow is now: " + testS.doesNoseGlow());
        
        //changeEnergy
        testA.changeEnergy(100);
        System.out.println("testA Reindeer energy level is now: " + testA.getEnergyLevel());
        
        //toString
        System.out.println(testJ.toString());
        
        //determineTeamHappiness
        System.out.println("Team happiness: " + testS.determineTeamHappiness());
        
        
    }
}
