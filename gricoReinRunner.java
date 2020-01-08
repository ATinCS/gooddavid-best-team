
public class gricoReinRunner
{
    public static void main(String args[]){
        //initiated first Reindeer and gave him all conditions to fill the constructor
        Reindeer firstReindeer = new Reindeer("bobby", true, 2);
        
        //print out firstReindeer's name, nose glow, and evergy level
        System.out.println("firstReindeer's name, nose glowing abilities, and energy level: ");
        System.out.println(firstReindeer.getName());
        System.out.println(firstReindeer.doesNoseGlow());
        System.out.println(firstReindeer.getEnergyLevel());
        
        //changing name of the first reindeer
        System.out.println("changing the name...");
        firstReindeer.changeName("chad");
        
        //changing the nose ability of the first reindeer
        System.out.println("changing the nose ability...");
        firstReindeer.setNoseAbility(false);
        
        //printing the new nose ability
        System.out.println("new nose ability: ");
        System.out.println(firstReindeer.doesNoseGlow());
        
        //changing first reindeer energy
        System.out.println("changing energy of the first reindeer....");
        firstReindeer.changeEnergy(3);
        
        //printing out the new energy level
        System.out.println("new energy level of the first reindeer: ");
        System.out.println(firstReindeer.getEnergyLevel());
        
        //printing the first reindeer data all together
        System.out.println("all of the information for the first Reindeer: ");
        System.out.println(firstReindeer.toString());
        
        //make other Reindeer
        System.out.println("initiating another reindeer...");
        Reindeer anotherOne = new Reindeer("mark", false, 5);
        
        //print out the information for all the reindeers' happiness
        System.out.println("the happiness for our team of reindeer: ");
        System.out.println(firstReindeer.determineTeamHappiness());
    }
}
