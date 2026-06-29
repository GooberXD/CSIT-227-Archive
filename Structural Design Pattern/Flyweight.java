public interface LineFlyweight {
  public Color getColor();
  public void draw(Point location);
}

public class Line implements LineFlyweight {
  private Color color; 
  
  public Line(Color c) {
    color = c;
  }
  
  public Color getColor() {
    return color;
  }
  
  public void draw(Point location) {
    // draws
  }
}

public class LineFlyweightFactory {
  private List<LineFlyweight> pool; 
  
  public LineFlyweightFactory() {
    pool = new ArrayList<LineFlyweight>();
  }
  
  public LineFlyweight getLine(Color c) { 
    //check if we've already created a line with this color 
    for(LineFlyweight line: pool) {
      if(line.getColor().equals(c)) {
        return line;
      }
    }
    //if not, create one and save it to the poolLineFlyweight 
    line = new Line(c);
    pool.add(line);
    return line;
  }
}

LineFlyweightFactory factory = new LineFlyweightFactory();
LineFlyweight line = factory.getLine(Color.RED); 
LineFlyweight line2 = factory.getLine(Color.RED); 
// can use the lines independently
line.draw(new Point(100, 100));
line2.draw(new Point(200, 100));


