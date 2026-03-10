/** 
 * (a) Write what would be printed after the main method is executed
 * (b) On line 28, we set level equal to 50. What level do we mean? An instance variable of the
Pokemon class? The local variable containing the parameter to the change method? The local
variable in the main method? Something else?
 (c) If we were to call Pokemon.printStats() at the end of our main method, what would happen? */

public class Pokemon {
    public String name;
    public int level;
    public static String trainer = "Ash";
    public static int partySize = 0;

    public Pokemon(String name, int level) {
        this.name = name;
        this.level = level;
        this.partySize += 1;
     }

     public static void main(String[] args) {
         Pokemon p = new Pokemon("Pikachu", 17);
         Pokemon j = new Pokemon("Jolteon", 99);
         System.out.println("Party size: " + Pokemon.partySize);
         p.printStats();
         int level = 18;
         Pokemon.change(p, level);
         p.printStats();
         Pokemon.trainer = "Ash";
         j.trainer = "Brock";
         p.printStats();
     }

     public static void change(Pokemon poke, int level) {
         poke.level = level;
         level = 50;
         poke = new Pokemon("Voltorb", 1);
         poke.trainer = "Team Rocket";
     }

     public void printStats() {
         System.out.print(name + " " + level + " " + trainer);
     }

 }
