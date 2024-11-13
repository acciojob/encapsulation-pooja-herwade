package com.driver;

public class Main {
    RWOnly ob=new RWOnly();
    //ob.name="Pooja";
  //'nm' has private access in 'RWOnly'
    ob.setname("Pooja");
    System.out.println(ob.getname());
}
