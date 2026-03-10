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
         // partySize is 1, p is created
         Pokemon j = new Pokemon("Jolteon", 99);
         // partySize is 2, j i s created
         System.out.println("Party size: " + Pokemon.partySize);
         // print#1 'Party size: 2'\n
         p.printStats();
         // print#2'Pikachu 17 Ash'
         int level = 18;
         Pokemon.change(p, level);
         // change function is a static method o.O
        // i think it sets p level to be 18. then it
        // creates some object and stores it in poke, but it 'loses' that scope.
        // i dont think it changes p? but it might change all trainers to Team Rocket?
        // so the weirdness is this: it doesnt change poke in main. but
        // it does get access to the static variable trainer and changes it
        // FOR ALL POKEMON
         p.printStats();
        // p still points to Pikachu, 18, Ash? XXXXXXXXXXXXXXXXXXXXX
        // correction, p points to Pikachu, 18, and the static variable is
        // set to "Team Rocket" everrytime change is called. ffs
        // print#3 'Pikachu 18 Team Rocket'
         Pokemon.trainer = "Ash"; // sets the class variable to 'Ash'
         j.trainer = "Brock"; // sets the class variable to 'Brock'
         p.printStats();
        // print#4 'Pikachu 18 Brock'
        // question c: if we did Pokemon.printstats() we would compiler error
        // cant call non-static method from class or something
         /** Pokemon.printStats(); */
        // Pokemon.java:49: error: non-static method printStats() cannot be referenced from a static context
     }

     public static void change(Pokemon poke, int level) {
         poke.level = level;
         // sets the pokemons level to arg#2
         level = 50;
         // sets local copy of leevl to 50... whatever
        // "the local variable containing the parameter to the change method"
         poke = new Pokemon("Voltorb", 1);
        // creates Pokemon object, stores it in poke variable (locally-not in
        // the ambient space)
         poke.trainer = "Team Rocket";
        //sets the class variable trainer to be "Team Rocket". weird imho
     }

     public void printStats() {
         System.out.print(name + " " + level + " " + trainer);
     }

 }
