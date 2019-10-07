/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokémonknowledge;

import java.util.Scanner;

/**
 *
 * @author 734260
 */
public class PokémonKnowledge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        System.out.println("Hello trainer! Which of my lovely feature would you like to use?");
        System.out.println("\t1. Pokédex \t2. Type Counters");
        String option = kb.nextLine();
        
        if (option.equals("Pokedex")) {
            System.out.println("Okay, now what is the name of the Pokemon you wish to search for?");
            String name = kb.nextLine();
            if (name.equals("Bulbasaur")) {
                System.out.println("Number 1, Bulbasaur, the Seed Pokemon. This pokemon is a grass and poison type. A strange seed was planted on its back at birth. The plant sprouts and grows with this pokemon.");
            }
            else if (name.equals("Ivysaur")) {
                System.out.println("Number 2, Ivysaur, the Seed Pokemon. This pokemon is a grass and poison type. Exposure to sunlight adds to its strength. Sunlight a;so makes the bud on its back grow larger.");
            }
            else if (name.equals("Venusaur")) {
                System.out.println("Number 3, Venusaur, the Seed Pokemon. This pokemon is a grass and poison type. By spreading the broad petals of its flower and catching the sun's rays, it fills its body with power.");
            }
            else if (name.equals("Charmander")) {
                System.out.println("Number 4, Charmander, the Lizard Pokemon. This pokemon is a fire type. The fire on the tip of its tail is a measure of its life. If healthy, its tail burns intensely.");   
            }
            else if (name.equals("Charmeleon")) {
                System.out.println("Number 5, Charmeleon, the Flame Pokemon. This pokemon is a fire type. When it swings its burning tail, it elevates the air temperature to unbearably high levels.");
            }
            else if (name.equals("Charizard")) {
                System.out.println("Number 6, Charizard, the Flame Pokemon. This pokemon is a fire and flying type. When expelling a blast of superhot fire, the red flame at the tip of its tail burns more intensely.");
            }
            else if (name.equals("Squirtle")) {
                System.out.println("Number 7, Squirtle, the Tiny Turtle Pokemon. This pokemon is a water type. It shelters itself in its shell, then strikes back with spouts of water at every opportunity.");
            }
            else if (name.equals("Wartortle")) {
                System.out.println("Number 8, Wartortle, the Turtle Pokemon. This pokemon is a water type. It often hides in water to stalk unwary prey. For last swimming, it moves its ears to maintain balance.");
            }
            else if (name.equals("Blastoise")) {
                System.out.println("Number 9, Blastoise, the Shellfish Pokemon. This pokemon is a water type. The pressurized water jets on this brutal Pokemon's shell are used for high-speed tackles.");
            }
            else if (name.equals("Caterpie")) {
                System.out.println("Number 10, Caterpie, the Worm Pokemon. This pokemon is a bug type. It is covered with green skin. When it grows, it sheds the skin, covers itself with silk, and becomes a cocoon.");
            }
            else if (name.equals("Metapod")) {
                System.out.println("Number 11, Metapod, the Cocoon Pokemon. This pokemon is a bug type. Its shell os hard as an iron slab. A Metapod does not move very much because its preparing its soft innards for evolution inside the shell.");
            }
            else if (name.equals("Butterfree")) {
                System.out.println("Number 12, Butterfree, the Butterfly Pokemon. This pokemon is a bug and flying type. Its wings are covered in toxic scales. If it finds bird pokemon going after Caterpie, Butterfree sprinkles its scales on them to drive them off.");
            }
            else if (name.equals("Weedle")) {
                System.out.println("Number 13, Weedle, the Hairy Bug Pokemon. This pokemon is a bug and poison type. Its poison stinger is very powerful. Its bright-colored body is intended to ward off its enemies.");
            }
            else if (name.equals("Kakuna")) {
                System.out.println("Number 14, Kakuna, the Cocoon Pokemon. This pokemon is a bug and poison type. Almost incapable of moving, this pokemon can only harden its shell to protect itself when it is in danger.");
            }
            else if (name.equals("Beedrill")) {
                System.out.println("Number 15, Beedrill, the Poison Bee Pokemon. This pokemon is a bug and poison type. It can take down any opponent with its powerful poison stingers. It sometimes attacks in swarms.");
            }
            else if (name.equals("Pidgey")) {
                System.out.println("Number 16, Pidgey, the Tiny Bird Pokemon. This pokemon is a normal and flying type. It is docile and prefers to avoid conflict. If disturbed, however, it can ferociously strike back.");
            }
            else if (name.equals("Pidgeotto")) {
                System.out.println("Number 17, Pidgeotto, the Bird Pokemon. This pokemon is a normal and flying type. The claws on its feet are well developed. It can carry prey such as an Exeggcute to its nest over 60 miles away.");
            }
            else if (name.equals("Pidgeot")) {
                System.out.println("Number 18, Pidgeot, the Bird Pokemon. This pokemon is a normal and flying type. By flapping its wings with all its might, Pidgeot can make a gust of wind capable of bending tall trees.");
            }
            else if (name.equals("Rattata")) {
                System.out.println("Number 19, Rattata, the Mosue Pokemon. This pokemon is a normal type. Living wherever there is food available, it ceaselessly scavenges for edibles the entire day.");
            }
            else if (name.equals("Raticate")) {
                System.out.println("Number 20, Raticate, the Mouse Pokemon. This pokemon is a normal type. With its long fangs, this surprisingly violent pokemon can gnaw away even thick concrete with ease.");
            }
            else if (name.equals("Spearow")) {
                System.out.println("Number 21, Spearow, the Tiny Bird Pokemon. This pokemon is a normal and flying type. Its reckless nature leads it to stand up to others, even large Pokemon, if it has to protect its territory.");
            }
            else if (name.equals("Fearow")) {
                System.out.println("Number 22, Fearow, the Beak Pokemon. This pokemon is a normal and flying type. It has the stamina to fly all day on its broad wings. It fights by using its sharp beak.");
            }
            else if (name.equals("Ekans")) {
                System.out.println("Number 23, Ekans, the Snake Pokemon. This pokemon is a poison type. Moving silently and stealthily, it eats the eggs of birds, such as Pidgey and Spearow, whole.");
            }
            else if (name.equals("Arbok")) {
                System.out.println("Number 24, Arbok, the Cobra Pokemon. This pokemon is a poison type. The pattern on its belly appears to be a frightening face. Weak foes will flee just at the sight of the pattern.");
            }
            else if (name.equals("Pikachu")) {
                System.out.println("Number 25, Pikachu, the Mouse Pokemon. This pokemon is an electric type. It has sacs on both its cheeks. If threatened, it looses electric charges from the sacs.");
            }
            
            else {
                System.out.println("That pokemon is not identified yet.");
                System.exit(0);
        }
        }
        // TODO code application logic here
    }
    
}
