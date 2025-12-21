public abstract class Mushroom extends Plant{
    boolean state;
    
    public Mushroom(String name, int sun_cost, boolean state) {
        super(name, sun_cost);
        this.state = state;
    }
    
    public boolean getState(){
        return state;
    }

    public boolean isAwake() {
        return state;
    }
    

    public void awaken(CoffeeBean coffeeBean) {
        state = true;
    }

    // an example given for free
    public static class SunShroom extends Mushroom implements SunProducer {

        public SunShroom(boolean state) {
            super("Sun-shroom", 25, state);
        }

        @Override
        public int produce_sun() {
            if (isAwake()) {
                System.out.println(name + " produces 10 suns");
                return 10;
            }
            else{
                System.out.println(name + " is asleep and cannot produce sun");
                return 0;
            }
            
        }
    }
    
    public static class PuffShroom extends Mushroom implements Attacker{

        public PuffShroom(boolean state) {
            super("Puff-shroom", 0, state);
        }

        @Override
        public int rangeType(){
            return 2;
        }
        
        @Override
        public int attack(){
            if (!isAwake()) {
                System.out.println(getName() + " is asleep and cannot attack");
                return 0;
            }
            
            System.out.println(getName() + " attacks");
            return 1;
        }
    }
    
    
    
    
    
    public static class DoomShroom extends Mushroom implements InstantKiller, Attacker {

        public DoomShroom(boolean state) {
            super("Doom-shroom", 125, state);
        }

        
        @Override
        public int killType(){
            return 1;
        }
        
        @Override
        public int rangeType(){
            return 3;
        }
        
        @Override
        public int attack(){
            if (!isAwake()) {
                System.out.println(getName() + " is asleep and cannot attack");
                return 0;
            }
            if(getHP()<= 0){
                return 0;
            }
            System.out.println(getName() + " attacks");
            System.out.println(die() + " while exploding and leaves a crater");
            return 10;
        }
        
    }
    
    
    

    // Add more mushroom subclasses here
}