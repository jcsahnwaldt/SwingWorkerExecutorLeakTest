import sun.awt.AppContext;

public class Test {
  public static void main(String[] args) {
    var appContext = AppContext.getAppContext();
    System.out.println(appContext);
  }
}
