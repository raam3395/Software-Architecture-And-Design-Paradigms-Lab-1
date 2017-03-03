/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duck;

/**
 *
 * @author raam
 */
public class DecoyDuck extends Duck {

    public DecoyDuck(){
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }
    
    public void display(){
        System.out.println("Looks like a decoyduck");
    }
    
}
