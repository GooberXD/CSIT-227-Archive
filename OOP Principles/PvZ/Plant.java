import java.util.Comparator;
public abstract class Plant {
    public static final int INFINITE = Integer.MAX_VALUE;

    String name;
    int hp;
    int sun_cost;
    
    

    public Plant(String name, int sun_cost) {
        this.name = name;
        this.hp = 6;
        this.sun_cost = sun_cost;
    }

    public Plant(String name, int hp, int sun_cost) {
        this.name = name;
        this.hp = hp;
        this.sun_cost = sun_cost;
    }
    
    public String getName(){
        return name;
    }
    
    public int getHP(){
        return hp;
    }
    
    public int getSun_Cost(){
        return sun_cost;
    }

    public boolean isAlive() {
        if(hp > 0){
            return true;
        }
        
        else{
            return false;
        }
    }

    public String die() {
        hp = 0;
        return name + " dies";
    }

    @Override
    public String toString() {
        // // TODO implementation
        // return super.toString();
        
        if(hp == INFINITE){
            return getName() + " (?) - cost: " + getSun_Cost();
        }
        
        return getName() + " (" + getHP() + ") - cost: " + getSun_Cost();
    }

    // Add Plant subclasses here, and
    // Hint: You can also add Comparator inner classes here
    // WallNut and CoffeeBean given for free
    
    
    public static class WallNut extends Plant{
        public WallNut() {
            super("Wall Nut", 25, 50);
        }
    }
    
    public static class Jalapeno extends Plant implements InstantKiller, Attacker{
        public Jalapeno() {
            super("Jalapeno", INFINITE, 125);
        }
        
        
        @Override
        public int attack(){ 
            if(getHP() <= 0){
                return 0;
            }
            
            System.out.println(getName() + " attacks");
            System.out.println(die() + " while exploding");
            return 5;
        }
        
        @Override
        public int killType(){
            return 1;
        }
        
        @Override
        public int rangeType(){
            return 1;
        }
        
    }
    
    public static class Squash extends Plant implements InstantKiller, Attacker {
        public Squash() {
            super("Squash", INFINITE, 50);
        }
        
        @Override
        
        public int attack(){
            if(getHP() <= 0){
                return 0;
            }
            
            System.out.println(getName() + " attacks");
            System.out.println(die() + " while squashing zombies");
            return 3;
        }
        
        @Override
        public int killType(){
            return 2;
        }
        
        @Override
        public int rangeType(){
            return 2;
        }
    }
        
        
        
    
    
    public static class LilyPad extends Plant implements Upgradable{
        public LilyPad() {
            super("Lily Pad", 25);
        }
        
        @Override
        public PlantUpgrade upgrade(){
            return new Cattail();
        }
    }
    
    
    
    public static class Cattail extends Plant implements Attacker, PlantUpgrade{
        public Cattail() {
            super("Cattail", 225);
        }
        
        @Override
        public int attack(){
            System.out.println(getName() + " attacks");
            return 1;
        }
        
        @Override
        public int rangeType(){
            return 100;
        }
        
        @Override
        public int concurrentSunCost(){
            return 25;
        }
    }
    
    public static class SunFlower extends Plant implements SunProducer, Upgradable{
        public SunFlower() {
            super("Sunflower", 50);
        }
        
        public SunFlower(String name, int cost) {
            super(name, cost);
        }
        
        @Override
        public int produce_sun(){
            System.out.println(getName() + " produces 25 suns");
            return 25;
        }
        
        @Override
        public PlantUpgrade upgrade(){
            return new TwinSunFlower();
        }
        

        
    }
    
    public static class TwinSunFlower extends SunFlower implements PlantUpgrade{
        public TwinSunFlower() {
            super("Twin Sunflower", 250);
        }
        
        @Override
        public int concurrentSunCost(){
            return 50;
        }

        
        @Override
        public int produce_sun(){
            int prod = concurrentSunCost();
            System.out.println(getName() + " produces 50 suns");
            return prod;
        }
        

        
    }
    
    public static class PeaShooter extends Plant implements Attacker{
        public PeaShooter() {
            super("Peashooter", 100);
        }
        
        @Override
        public int rangeType(){
            return 1;
        }
        
        @Override
        public int attack(){
            System.out.println(getName() + " attacks");
            return 1;
        }
        
    }


    public static class CoffeeBean extends Plant{
        public CoffeeBean() {
            super("Coffee Bean", INFINITE, 75);
        }
    }
    
    
    public static class HPComp implements Comparator<Plant>{
        @Override
        public int compare(Plant p1, Plant p2){
            int hpcom = Integer.compare(p2.getHP(), p1.getHP());
            
            if(hpcom != 0){
                return hpcom;
            }
            
            return p1.getName().compareTo(p2.getName());
        }
    }
    
    public static class nameComp implements Comparator<Plant>{
        @Override
        public int compare(Plant p1, Plant p2){
            return p1.getName().compareTo(p2.getName());
        }
    }
    
    public static class costComp implements Comparator<Plant>{
        @Override
        public int compare(Plant p1, Plant p2){
            int hpcom = Integer.compare(p2.getSun_Cost(), p1.getSun_Cost());
            
            if(hpcom != 0){
                return hpcom;
            }
            
            return p1.getName().compareTo(p2.getName());
        }
    }
    
    
}