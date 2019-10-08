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
        //String[][] data = {
          //  {        "a", "b", "c", "d"       }, 
            //{        "a", "b", "c", "d"       }
        //} ;
        //Get Information in first then work the matrix
        if (option.equals("Pokedex")) {
            System.out.println("Okay, now what is the name of the Pokemon you wish to search for?");
            String name = kb.nextLine();
            if (name.equals("Bulbasaur")) {
                //System.out.print(data[0][])
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
            else if (name.equals("Raichu")) {
                System.out.print("Number 26, Raichu, the Mouse Pokemon. This pokemon is an electric type. When its electricity builds, its muscles are stimulated, and it becomes more agressive than usual.");
            }
            else if (name.equals("Sandshrew")) {
                System.out.println("Number 27, Sandshrew, the Mouse Pokemon. This pokemon is a ground type. To protect itself from attackers, it curls up into a ball. It lives in arid regions with minimal rainfall.");
            }
            else if (name.equals("Sandslash")) {
                System.out.println("Number 28, Sandslash, the Mouse Pokemon. This pokemon is a ground type. It is adept at attacking with the spines on its back and its sharp claws while quickly scurrying about.");
            }
            else if (name.equals("Nidoran")) {
                System.out.println("Which gender of Nidoran are you referring to?");
                String gender = kb.nextLine();
                if (gender.equals("Male")) {
                    System.out.println("Number 32, Nidoran, the Poison Pin Pokemon. This pokemon is a poison type. It scans its surroundings by raising its ears out of the grass. Its toxic horn is for protection.");
                }
                else if (gender.equals("Female")) {
                    System.out.println("Number 29, Nidoran, the Poison Pin Pokemon. This pokemon is a poison type. Small and very docile, it protects itself with its small, poisonous hornn when attacked.");
                }
                else {
                    System.out.println("That's not a gender silly!");
                }
            }
            else if (name.equals("Nidorina")) {
                System.out.println("Number 30, Nidorina, the Poison Pin Pokemon. This pokemon is a poison type. The female has a gentle temperament. It emits ultrasonic cries that have the power to befuddle foes.");
            }
            else if (name.equals("Nidoqueen")) {
                System.out.println("Number 31, Nidoqueen, the Drill Pokemon. This pokemon is a poison and ground type. Its entire body is armored with hard scales. It will protect the young in its burrow with its life.");
            }
            else if (name.equals("Nidorino")) {
                System.out.println("Number 33, Nidorino, the Poison Pin Pokemon. This pokemon is a poison type. Quick to anger, it stabs enemies with its horn to inject a powerful poison when it becomes agitated.");
            }
            else if (name.equals("Nidoking")) {
                System.out.println("Number 34, Nidoking, the Drill Pokemon. This pokemon is a poison and ground type. It uses its powerful tail in battle to smash, constrict, then break the prey's bones.");
            }
            else if (name.equals("Clefairy")) {
                System.out.println("Number 35, Clefairy, the Fairy Pokemon. This pokemon is a fairy type. They're popular, but they're rare. Trainers who show them off recklessly may be targeted by thieves.");
            }
            else if (name.equals("Clefable")) {
                System.out.println("Number 36, Clefable, the Fairy Pokemon. This pokemon is a fairy type. It can't help but hear a pin drop from over a half a mile away, so it lives deep in the mountains where there aren't many people or pokemon.");
            }
            else if (name.equals("Vulpix")) {
                System.out.println("Number 37, Vulpix, the Fox Pokemon. This pokemon is a fire type. At the time of its birth, Vulpix has one white tail. The tail separates into six if this pokemon recieves planty of love from its trainer. The six tails become magnificently curled.");
            }
            else if (name.equals("Ninetails")) {
                System.out.println("Number 38, Ninetails, the Fox Pokemon. This pokemon is a fire type. It is vindictive and relentless by nature. Those who cross it even once will be cursed for a thousand years, along with their descendants.");
            }
            else if (name.equals("Jigglypuff")) {
                System.out.println("Number 39, Jigglypuff, the Balloon Pokemon. This pokemon is a normal and fairy type. If it inflates to sing a lullaby, it can perform longer and cause sure drowsiness in its audience.");
            }
            else if (name.equals("Wigglytuff")) {
                System.out.println("Number 40, Wigglytuff, the Balloon Pokemon. This pokemon is a normal and fairy type. Thanks to its bouncy body and fine fur, this pokemon is sought after. Holding one in your arms while you fall asleep feels great.");
            }
            else if (name.equals("Zubat")) {
                System.out.println("Number 41, Zubat, the Bat Pokemon. This pokemon is a poison and flying type. Even though it has no eyes, it can sense obstacles using ultrasonic waves it emits from its mouth.");
            }
            else if (name.equals("Golbat")) {
                System.out.println("Number 42, Golbat, the Bat Pokemon. This pokemon is a poison and flying type. Flitting around in the dead of night, it sinks its fangs into its prey and drains a nearly fatal amount of blood.");
            }
            else if (name.equals("Oddish")) {
                System.out.print("Number 43, Oddish, the Weed Pokemon. This pokemon is a grass and poison type. During the day it keeps its face buried in the ground. At night, it wanders around sowing its seeds.");
            }
            else if (name.equals("Gloom")) {
                System.out.println("Number 44, Gloom, the Weed Pokemon. This pokemon is a grass and poison type. The honey it drools from its mouth smells so atrocious, it can curl noses more than a mile away.");
            }
            else if (name.equals("Vileplume")) {
                System.out.println(" Number 45, Vileplume, the Flower Pokemon. This pokemon is a grass and poison type. The larger its petals, the more toxic pollen it contains. Its big head it heavy and hard to hold up.");
            }
            else if (name.equals("Paras")) {
                System.out.println("Number 46, Paras, the Mushroom Pokemon. This pokemon is a bug and grass type. It burrows under the ground to gnaw on tree roots. The mushrooms on it's back absorb most of the nutrition.");
            }
            else if (name.equals("Parasect")) {
                System.out.println("Number 47, Parasect, the Mushroom Pokemon. This pokemon is a bug and grass type. The bug is mostly dead, with the mushroom on its back having become the main body. If the mushroom comes off, the bug stops moving.");
            }
            else if (name.equals("Venonat")) {
                System.out.println("Number 48, Venonat, the Insect Pokemon. This pokemon is a bug and poison type. Its eyes funtion as radar units. It catches and eats small bugs that hide in darkness.");
            }
            else if (name.equals("Venomoth")) {
                System.out.println("Number 49, Venomoth, the Poison Moth Pokemon. This pokemon is a bug and poison type. When it attacks, it flaps its large wings violently to scatter its poisonous powder all around.");
            }
            else if (name.equals("Diglett")) {
                System.out.println("Number 50, Diglett, the Mole Pokemon. This pokemon is a ground type. If a diglett digs through a field, it leaves the soil perfectly tilled and ideal for planting crops.");
            }
            else if (name.equals("Dugtrio")) {
                System.out.println("Number 51, Dugtrio, the Mole Pokemon. This pokemon is a ground type. A team of Diglett triplets. It triggers huge earthquakes by burrowing 60 miles underground.");
            }
            else if (name.equals("Meowth")) {
                System.out.println("Number 52, Meowth, the Scratch Cat Pokemon. This pokemon is a normal type. Meowth withdraw their sharp claws into their paws to silently sneak about. For some reason, this pokemon loves shiny coins that glitter with light.");
            }
            else if (name.equals("Persian")) {
                System.out.println("Number 53, Persian, the Classy Cat Pokemon. This pokemon is a normal type. Its lithe muscles allow it to walk without making a sound. It attacks in an instant.");
            }
            else if (name.equals("Psyduck")) {
                System.out.println("Number 54, Psyduck, the Duck Pokemon. This pokemon is a water type. Using psychokinesis gives it a headache, so it normally passes the time spacing out and doing as little as possible.");
            }
            else if (name.equals("Golduck")) {
                System.out.println("Number 55, Golduck, the Duck Pokemon. This pokemon is a watwer type. Even fast-swimming fish pokemon can be disabled by Golduck. It brings them to a standstill and freezes them.");
            }
            else if (name.equals("Mankey")) {
                System.out.println("Number 56, Mankey, the Pig Monkey Pokemon. This pokemon is a fighting type. The smallest of things could cause it to lose its temper. Because it doesn't hold in its stress, this pokemon can live a long time.");
            }
            else if (name.equals("Primeape")) {
                System.out.println("Number 57, Primeape, the Pig Monkey Pokemon. This pokemon is a fighting type. It will never forgive opponents who have angered it. Even after it has beaten them down until they can't move, it never ever forgives.");
            }
            else if (name.equals("Growlithe")) {
                System.out.println("");
            }
            else if (name.equals("Arcanine")) {
                System.out.println("");
            }
            else if (name.equals("Poliwag")) {
                System.out.println("");
            }
            else if (name.equals("Poliwhirl")) {
                System.out.println("");
            }
            else if (name.equals("Poliwrath")) {
                System.out.println("");
            }
            else if (name.equals("Abra")) {
                System.out.println("");
            }
            else if (name.equals("Kadabra")) {
                System.out.println("");
            }
            else if (name.equals("Alakazam")) {
                System.out.println("");
            }
            else if (name.equals("Machop")) {
                System.out.println("");
            }
            else if (name.equals("Machoke")) {
                System.out.println("");
            }
            else if (name.equals("Machamp")) {
                System.out.println("");
            }
            else if (name.equals("Bellsprout")) {
                System.out.println("");
            }
            else if (name.equals("Weepinbell")) {
                System.out.println("");
            }
            else if (name.equals("Victreebell")) {
                System.out.println("");
            }
            else if (name.equals("Tentacool")) {
                System.out.println("");
            }
            else if (name.equals("Tentacruel")) {
                System.out.println("");
            }
            else if (name.equals("Geodude")) {
                System.out.println("");
            }
            else if (name.equals("Graveler")) {
                System.out.println("");
            }
            else if (name.equals("Golem")) {
                System.out.println("");
            }
            else if (name.equals("Ponyta")) {
                System.out.println("");
            }
            else if (name.equals("Rapidash")) {
                System.out.println("");
            }
            else if (name.equals("Slowpoke")) {
                System.out.println("");
            }
            else if (name.equals("Slowbro")) {
                System.out.println("");
            }
            else if (name.equals("Magnemite")) {
                System.out.println("");
            }
            else if (name.equals("Magneton")) {
                System.out.println("");
            }
            else if (name.equals("Farfetch'd")) {
                System.out.println("");
            }
            else if (name.equals("Doduo")) {
                System.out.println("");
            }
            else if (name.equals("Dodrio")) {
                System.out.println("");
            }
            else if (name.equals("Seel")) {
                System.out.println("");
            }
            else if (name.equals("Dewgong")) {
                System.out.println("");
            }
            else if (name.equals("Grimer")) {
                System.out.println("");
            }
            else if (name.equals("Muk")) {
                System.out.println("");
            }
            else if (name.equals("Shellder")) {
                System.out.println("");
            }
            else if (name.equals("Cloyster")) {
                System.out.println("");
            }
            else if (name.equals("Gastly")) {
                System.out.println("");
            }
            else if (name.equals("Haunter")) {
                System.out.println("");
            }
            else if (name.equals("Gengar")) {
                System.out.println("");
            }
            else if (name.equals("Onix")) {
                System.out.println("");
            }
            else if (name.equals("Drowzee")) {
                System.out.println("");
            }
            else if (name.equals("Hypno")) {
                System.out.println("");
            }
            else if (name.equals("Krabby")) {
                System.out.println("");
            }
            else if (name.equals("Kingler")) {
                System.out.println("");
            }
            else if (name.equals("Voltorb")) {
                System.out.println("");
            }
            else if (name.equals("Electrode")) {
                System.out.println("");
            }
            else if (name.equals("Exeggcute")) {
                System.out.println("");
            }
             else {
                System.out.println("That pokemon is not identified yet.");
                System.exit(0);
        }
        }
        // TODO code application logic here
    }
    
}
