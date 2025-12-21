// //ALL PRINCIPLES
// In the game Plants vs Zombies, there are various types of plants. 
// Some are sun-producing like Sunflower and Sun-shroom. Some are attackers 
// like peashooter and puff-shroom. Some are capable of killing zombies instantly 
// like Jalapeno and Squash. 


// Create the following interfaces:

// SunProducer
// This interface is for the plants who are able to produce sun. 
// This only has one method -- **produce_sun()** that returns an integer, 
// which is the number of sun that a plant can generate at a time. When this method is 
// called, also print: name " produces " n " suns"

// Attacker
// This interface is for the plants who are capable to deal damage to zombies. 
// This has two methods -- **attack**() that prints the attack action and returns an 
// integer of the damage dealt with the attack. When this method is called, also print: name " 
// attacks"

// The second method is **rangeType**() which will return an integer of the range 
// capability of the attacker, whether on a single line, or an area-of-effect (AOE), 
// or on a limited range only, or on a free range. You will be the one to decide which 
// integer to represent the following.

// InstantKiller
// This interface is for the plants who can automatically kill zombies with just 
// one hit. This has one method -- **killType**() that will return an integer of the type 
// to which this plant kills, whether instantly like the Jalapeno, or on close contact like 
// Squash. You will be the one to decide which integer to represent the following.

// Note that all InstantKiller has an infinite HP and when an InstantKiller attacks, 
// it dies right after attacking.

// PlantUpgrade
// This interface are used for plants who are upgrades of basic types of plants. 
// This has one method -- **concurrentSunCost**() that will return an integer of the 
// additional sun it would take to buy another one of this plant when the same type exists 
// in the game.

// Upgradable
// This interface is for plants which can be upgraded to stronger versions of themselves. 
// This has one method -- **upgrade()**which will return a new instance of PlantUpgrade object.

// Create the following classes. 
// Plant
// This abstract class is the base class of all plants. This has the following fields: 
// String name, int hp, and int sun_cost. This also has two constructors -- one with hp 
// and one without, since most plants have the same hp anyway which is 6, except for plants 
// like Wall Nut and InstantKiller plants which have infinite hp.

// This class should also have the **isAlive()**method that will return true if its hp is above 0.
// This will also have the **die**() method that returns a String of its name and " dies",
// which will be overridden by InstantKiller classes on whether they die " while exploding" 
// or others. This class will also override the toString method that shall output the name, 
// followed by the hp separated by space enclosed with parentheses, and lastly the sun cost 
// prepended by " - cost: ". Note that if the HP is infinite, print this: ∞ instead to signify 
// infinite.

// Mushroom
// This abstract class will extend from the Plant class since a Mushroom is a Plant. 
// This will have another field -- state which is a Boolean to identify whether this 
// mushroom is asleep or awake. If a mushroom is asleep, it cannot be able to perform tasks.

// This will also have methods: **isAwake**() that will return true if this mushroom is awake. 
// Another method to set it is **awaken**(**CoffeeBean**) which will awaken this mushroom 
// and will use up the given CoffeeBean and will die.

// The following are subclasses of Mushroom:

// SunShroom
// This mushroom is a SunProducer that produces 10 suns when awake, otherwise print: 
// name " is asleep and cannot produce sun". This plant costs 25 suns.

// PuffShroom
// This mushroom is an Attacker that deals 1 damage and has a limited range when awake, 
// otherwise print: name " is asleep and cannot attack". This plant costs 0 suns.

// DoomShroom
// This mushroom is anInstantKiller that could kill instantly and anAttacker that deals 
// 10 damage and dies "while exploding and leaves a crater" and has an AOE when awake, 
// otherwise print: name " is asleep and cannot attack". This plant costs 125 suns.


// The following are subclasses of Plants:

// Sunflower
// This plant is a SunProducer that produces 25 suns. 
// This is also Upgradable that will upgrade into a new TwinSunflower. This plant costs 50 suns.

// TwinSunflower
// This plant is a SunProducer that produces 50 suns. This is also a PlantUpgrade. 
// This plant initially costs 250 suns and has a concurrent sun cost of 50.

// Peashooter
// This plant is an Attacker that deals 1 damage and has a range of a single line. 
// This plant costs 100 suns.

// WallNut
// This plant has an HP of 25 and costs 50 suns.

// Squash
// This plant is anInstantKiller that could kill on contact and an 
// Attacker that deals 3 damage and dies "while squashing zombies" and has a limited range. 
// This plant costs 50 suns.

// Jalapeno
// This plant is anInstantKiller that could kill instantly and anAttacker that deals 5 
// damage and dies "while exploding" and has a range of a single line. This plant costs 125 suns.

// CoffeeBean
// This plant has an infinite hp and a sun cost of 75.

// LilyPad
// This plant is an Upgradable that will upgrade into a new Cattail. This plant costs 25 suns.

// Cattail
// This plant is an Attacker that deals 1 damage and has a free range. 
// This is also a PlantUpgrade. This plant initially costs 225 suns and has a 
// concurrent sun cost of 25.


// In the Main method, first get the Game Mode. In the game, 
// the mushrooms are awake when the mode is "Night" or "Fog", and otherwise they are asleep.

// Next, continuously ask the user to Add Plant. Add an instance of this 
// respective plant to the list of plants using the add method. If the plant entered is a 
// Coffee Bean, don't add this to the list, instead search the list of plants for mushrooms 
// and only the first one that is asleep shall be awaken by this coffee bean. If the plant 
// entered is a PlantUpgrade (i.e., TwinSunflower or Cattail), search for its basic type first 
// (i.e., Sunflower or LilyPad, respectively), remove only the first instance using the remove 
// method and replace it at the same position as the removed plant still using the add method.

// Continue to ask for plants until the user enters DONE.


// Next, continuously ask the user to Do something. There are seven String options:

// Produce Sun
// This will call **produce_sun**for all the SunProducers in the list. 
// After doing so, print: n + " sun producers gather " + x + " suns" where 
// n is the number of sun producers whether awake or asleep, and x is the total number 
// of suns produced. If there are no SunProducers, print "You have no sun producers" instead.

// Attack
// This will call attack for all the living Attackers in the list. After doing so, 
// print: n + " attackers dealing " + x + " damage" where n is the number of alive 
// attacker whether awake or asleep, and x is the total number of damage dealt. 
// If there are no living Attackers, print "You have no attackers" instead.

// Instant Kill Status
// This will get the killTypefor all the living InstantKillers in the list. For each plant, 
// print: name + " can kill instantly" or name + " can kill on contact" depending on the killType. 
// If there are no living InstantKillers, print "You have no plants which can kill instantly" instead.

// Attacker Status
// This will get the rangeType for all the living Attackers in the list. For each plant, 
// print: name + " can attack on a single line" or name 
// + " can attack only when enemy is nearby" or name + " can attack using area-of-effect" 
// or name + " can attack any enemies from anywhere" depending on the rangeType. 
// If there are no living Attackers, print "You have no attackers" instead.

// Sort by HP
// This will sort the list of plants, living or dead, by HP in descending order, 
// most hp first, and print them. If they have the same HP, sort by name.

// Sort by Name
// This will alphabetically sort the list of plants, living or dead, by name and print them.

// Sort by Sun Cost
// This will sort the list of plants, living or dead, 
// by sun cost in ascending order, less sun cost first, and print them. 
// If they have the same sun cost, sort by name.

 

// Inputs

// 1. Game Mode
// Day

// Valid Inputs: Day, Night, Pool, Fog, Roof

// 2. List of Plants
// Terminates when DONE is inputted

// Sunflower
// Peashooter
// Peashooter
// Wall Nut
// Sunflower
// DONE

// Valid Inputs: Sunflower, Squash, Twin Sunflower, Lily Pad, 
// Cattail, Peashooter, Sun-shroom, Puff-shroom, Doom-shroom, 
// Jalapeno, Wall Nut, Coffee Bean, DONE

 

// 3. List of Actions
// Terminates when DONE is inputted
// Produce Sun
// DONE

// Valid Inputs: Produce Sun, Attack, Instant Kill Status, 
// Attacker Status, Sort by HP, Sort by Name, Sort by Sun Cost, DONE


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        List<Plant> plants = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Game Mode: ");
        String mode = sc.nextLine();
        
        String input;
        do {
            System.out.print("Add a plant: ");
            input = sc.nextLine();
            boolean isAwake;
            switch (input) {
                case "DONE":
                    break;
                case "Wall Nut":
                    plants.add(new Plant.WallNut());
                    break;
                case "Sunflower":
                    plants.add(new Plant.SunFlower());
                    break;
                    
                case "Twin Sunflower":
                    for(Plant p : plants){
                        if(p instanceof Plant.SunFlower){
                            int i = plants.indexOf(p);
                            plants.add(i, new Plant.TwinSunFlower());
                            plants.remove(i + 1);
                            break;
                        }
                    }
                    break;
                    
                case "Peashooter":
                    plants.add(new Plant.PeaShooter());
                    break;
                case "Lily Pad":
                    plants.add(new Plant.LilyPad());
                    break;
                
                case "Cattail":
                    for(Plant p : plants){
                        if(p instanceof Plant.LilyPad){
                            
                            int i = plants.indexOf(p);
                            plants.add(i, new Plant.Cattail());
                            plants.remove(i + 1);
                            break;
                        }
                    }
                    break;
                    
                case "Sun-shroom":
                    isAwake = "Night".equals(mode) || "Fog".equals(mode);
                    plants.add(new Mushroom.SunShroom(isAwake));
                    break;
                case "Puff-shroom":
                    isAwake = "Night".equals(mode) || "Fog".equals(mode);
                    plants.add(new Mushroom.PuffShroom(isAwake));
                    break;
                case "Doom-shroom":
                    isAwake = "Night".equals(mode) || "Fog".equals(mode);
                    plants.add(new Mushroom.DoomShroom(isAwake));
                    break;
                case "Coffee Bean": {
                    for(Plant p : plants){
                        if(p instanceof Mushroom m && m.getState() == false){
                                m.awaken(new Plant.CoffeeBean());
                                System.out.println("Coffee Bean dies");
                                break;

                        }
                    }
                    break;
                }
                case "Jalapeno":
                    plants.add(new Plant.Jalapeno());
                    break;
                case "Squash":
                    plants.add(new Plant.Squash());
                    break;
                    
                    
                default:
                    System.out.println(input + " is not a plant");
            }
        } while (!input.equals("DONE"));
        

        do {
            System.out.print("Do something: ");
            input = sc.nextLine();
            switch (input) {
                case "DONE":
                    break;
                    
                case "Produce Sun":
                    // add implementation here
                    int sunCount = 0;
                    int plantctr = 0;
                    for(Plant p : plants){
                        if(p instanceof SunProducer s){
                            sunCount += s.produce_sun();
                            plantctr++;
                            
                        }
                    }
                    
                    if(plantctr == 0){
                        System.out.printf("You have no sun producers\n");
                    }
                    else{
                         System.out.printf(plantctr + " sun producers gather " + sunCount + " suns\n");
                    }
                   
                    
                    
                    break;
                    
                case "Attack":
                    // add implementation here
                    int plantattackctr = 0;
                    int damage = 0;
                    for(Plant p : plants){
                        if(p instanceof Attacker a && p.getHP() > 0){
                            damage += a.attack();
                            plantattackctr++;
                        }
                            
                    }
                    if(plantattackctr == 0){
                        System.out.printf("You have no attackers\n");
                    }
                    else{
                         System.out.printf(plantattackctr + " attackers dealing " + damage + " damage\n");
                    }
                    
                    break;
                    
                    
                case "Attacker Status":
                    // add implementation here
                    for(Plant p : plants){
                        if(p instanceof Attacker && p.getHP() > 0){
                            Attacker a = (Attacker) p;
                            switch(a.rangeType()){
                                
                                case 1:
                                    System.out.println(p.getName() + " can attack on a single line");
                                    break;
                                case 2:
                                    System.out.println(p.getName() + " can attack only when enemy is nearby");
                                    break;
                                case 3:
                                    System.out.println(p.getName() + " can attack using area-of-effect");
                                    break;
                                case 100:
                                    System.out.println(p.getName() + " can attack any enemies from anywhere");
                                    break;
                            }
                        }
                            
                    }
             
                    break;    
                    
                    
                case "Instant Kill Status":
                    // add implementation here
                    int k = 0;
                    for(Plant p : plants){
                        if(p instanceof InstantKiller && p.getHP() > 0){
                            InstantKiller a = (InstantKiller) p;
                            switch(a.killType()){
                                
                                case 1:
                                    System.out.println(p.getName() + " can kill instantly");
                                    k++;
                                    break;
                                case 2:
                                    System.out.println(p.getName() + " can kill on contact");
                                    k++;
                                    break;
                                case 3:
                                    System.out.println(p.getName() + " can attack using area-of-effect");
                                    k++;
                                    break;
                                case 100:
                                    System.out.println(p.getName() + " can attack any enemies from anywhere");
                                    k++;
                                    break;
                            }
                        }
                            
                    }
                    
                    if(k == 0){
                        System.out.printf("You have no plants which can kill instantly\n");
                    }
                
                    break;
                    
                    
                    case "Sort by HP":
                        plants.sort(new Plant.HPComp());
                        
                        
                        for(Plant p : plants){
                            System.out.println(p.toString());
                        }
                        
                    break;
                    
                    case "Sort by Name":
                        plants.sort(new Plant.nameComp());
                        
                        
                        for(Plant p : plants){
                            System.out.println(p.toString());
                        }
                        
                    break;
                    
                    case "Sort by Sun Cost":
                        plants.sort(new Plant.costComp());
                        
                        
                        for(Plant p : plants){
                            System.out.println(p.toString());
                        }
                        
                    break;
                        
                // add more cases here
                default:
                    System.out.println("Unknown action: " + input);
            }
        } while (!input.equals("DONE"));
    }
}