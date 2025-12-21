import java.util.Comparator;

public class NumberComparator implements Comparator<Integer>{
    
    
    int n;
    
    public NumberComparator(int n){
        this.n = n;
    }
    
    @Override
    
    public int compare(Integer o1, Integer o2){
        
        
        return Integer.compare(Math.abs(o1 - n), Math.abs(o2 - n));
        
    }
    
}