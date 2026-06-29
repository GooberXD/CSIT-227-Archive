class DataFetcher() {
 // all private fields
  
  public class DataFetcher(String dataType, long limit, String orderBy) {
    // assigned all the private fields
  }
}

class DataFetcherBuilder {
 
  private String dataType;
  private long limit;
  private String orderBy;
  
  public DataFetcherBuilder(String dataType) {
    this.dataType = dataType;
  }
  
  public DataFetcherBuilder limitedBy(long limit) {
    this.limit = limit;
    return this;
  }
  
  public DataFetcherBuilder orderedBy(String orderBy) {
    this.orderBy = orderBy;
    return this;
  }
  
  public DataFetcher create() {
    return new DataFetcher(dataType, limit, orderBy);
  }
}

public class Client() {
  DataFetcher dataFetcher = new DataFetcherBuilder("users").limitedBy(10).orderedBy("username").create();
}