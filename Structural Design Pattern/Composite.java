interface Node {
    long getSize();
}

public class File implements Node {        
    private long size;

    public long getSize() {
        return size;
    }
}

public class Folder implements Node {
    private List<Node> children = new ArrayList<Node>();
    private long size;
  
    public long getSize() {
      long totalSize = this.size;
      for(Node child in children) {
        totalSize += child.getSize();
      }
      return totalSize;
    }
}