public interface Prototype extends Cloneable {
  public AccessControl clone() throws CloneNotSupportedException;
}

public class AccessControl implements Prototype{
  private final String controlLevel;
  private String access;
  
  public AccessControl(String controlLevel,String access){
    this.controlLevel = controlLevel;
    this.access = access;
  }
  
  @Override
  public AccessControl clone(){
    try {
      return (AccessControl) super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return null;
  }

  public String getControlLevel(){
    return controlLevel;
  }

  public String getAccess() {
    return access;
  }

  public void setAccess(String access) {
    this.access = access;
  }
}

public class AccessControlProvider {
  private static Map<String, AccessControl>map = new HashMap<String, AccessControl>();

  static{
    map.put("USER", new AccessControl("USER","DO_WORK"));
    map.put("ADMIN", new AccessControl("ADMIN","ADD/REMOVE USERS"));
    map.put("AUDITOR", new AccessControl("ADMIN","READ REPORTS"));
  }

  public static AccessControl getAccessControlObject(String controlLevel){
    AccessControl ac = null;
    ac = map.get(controlLevel);
    if(ac != null) {
      return ac.clone();
    }
    return null;
  }
}
