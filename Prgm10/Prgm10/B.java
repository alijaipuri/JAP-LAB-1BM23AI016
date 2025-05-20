package bpack;
import apack.A;
public class B extends A{
  public void display(){
      // System.out.println(defaultVar); Not accessible (different package)
      System.out.println("Protected: " + protectedVar); //Accessible (inherited)
      // System.out.println(privateVar); Not accessible (private)
      System.out.println("Public: " + publicVar); //Accessible
    }

}
  
