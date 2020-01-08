
/**
 * Write a description of class JoshReinRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JoshReinRunner
{
    public static void main (String[] args)
    {
        // create three reindeers
        Reindeer Sven = new Reindeer("Sven", true, 4);
        Reindeer Dasher = new Reindeer("Dasher", false, 1);
        Reindeer Milburn = new Reindeer("Milburn", true, 5);
        // get dashers name
        System.out.println(Dasher.getName());
        // update the name of Sven
        Sven.changeName("NewSven");
        // show if dashers nose glows
        System.out.println(Dasher.doesNoseGlow());
        // get milburns energy level
        System.out.println(Milburn.getEnergyLevel());
        // remove milburns nose ability
        Milburn.setNoseAbility(false);
        // give dasher 2 energy
        Dasher.changeEnergy(2);
        // show all the changes for the three reindeers
        System.out.println(Sven.toString());
        System.out.println(Dasher.toString());
        System.out.println(Milburn.toString());
        // show the team happiness
        Sven.determineTeamHappiness();
        
    }
}
