import java.util.Comparator;

public class NumberComparator implements Comparator<Integer>{
    
    @Override
    
    public int compare(Integer o1, Integer o2){
        
        return Integer.compare(Math.abs(o1 - 50), Math.abs(o2 - 50));
        
    }
    
}