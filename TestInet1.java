import java.net.*;

public class TestInet1 {
  public static void main(String argv[]) 
  {
    try {
      InetAddress myip = InetAddress.getLocalHost();

      System.out.println(myip.getHostName());
      System.out.println(myip.getHostAddress());
    } catch (UnknownHostException e) {
      System.out.println("Error: unable to resolve localhost");
    }
  }
}