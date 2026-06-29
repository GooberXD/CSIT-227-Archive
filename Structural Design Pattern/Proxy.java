interface Image {
  void display();
}

public class RealImage implements Image {   
  public RealImage(URL url) {
    loadImage(url);   
  }   
  
  public void display() {} 
  
  private void loadImage(URL url)  {
    //do resource intensive operation to load image  
  }
}

public class ProxyImage implements Image {    
  private URL url;     
  public ProxyImage(URL url) {
    this.url = url;    
  }    
  
  public void display() {
    RealImage real = new RealImage(url);
    real.display();    
  }
}