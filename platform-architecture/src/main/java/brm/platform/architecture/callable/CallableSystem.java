package brm.platform.architecture.callable;
import java.util.concurrent.Callable;


/**
 * Callable system details.
 * @author Gregory
 */
public class CallableSystem implements Callable<String> {
  public CallableSystem() {
  }

  @Override
  public String call() throws Exception {
    String osname = System.getProperty("os.name");
    String osarch = System.getProperty("os.arch");
    String osvers = System.getProperty("os.version");
    String s = String.format("%s (%s) version %s", osname, osarch, osvers);
    return String.format("OPERATING SYSTEM:\n  %s", s);
  }
}
