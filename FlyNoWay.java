package duck;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raam
 */
public class FlyNoWay implements FlyBehavior{
    @Override 
    public void fly() {
         System.out.println("tidak terbanglah");
     }
}
