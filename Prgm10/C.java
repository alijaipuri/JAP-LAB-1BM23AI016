package cpack;

import apack.A;

public class C {
    public void display(){
        A obj=new A();
        // System.out.println(obj.defaultVar); Not accessible (different package)
        // System.out.println(obj.protectedVar); Not accessible (not a subclass)
        // System.out.println(obj.privateVar); Not accessible (private)
        System.out.println("Public: " + obj.publicVar); //Accessible
    }
}
