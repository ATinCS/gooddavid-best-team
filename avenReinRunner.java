
public class avenReinRunner
{
    public static void main(String[] args)
    {
        Reindeer aven = new Reindeer("Aven", false, 999);
        Reindeer josh = new Reindeer("Josh", true, 1);
        Reindeer grace = new Reindeer("Grace", true, 5000000);
        Reindeer sam = new Reindeer("sam", true, 10);
        sam.changeName("Sam");
        System.out.println(sam.getName());
        aven.setNoseAbility(true);
        System.out.println(aven.getNoseGlow());
        grace.changeEnergy(-4999999);
        System.out.println(grace.getEnergyLevel());
        System.out.println(josh.toString());
        System.out.println(aven.determineTeamHappiness());

    }
}
