
package duck;

/**
 *
 * @author raam
 */
public abstract class Duck {
    
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    
    public Duck() {
    
    }
    
    public static void main(String[] args) {
        Duck a = new MallardDuck();
        a.performQuack();
        a.performFly();
        a.display();
        a.swim();
        
        FlyNoWay setMallardNoFly = new FlyNoWay();
        a.setFlyBehavior(setMallardNoFly);
        a.performFly();
        
        Duck b = new DecoyDuck();
        b.performQuack();
        b.display();
        
    }
    
    public void performQuack(){
        quackBehavior.quack();
    }
    
    public void swim(){
        System.out.println("All duck can swim");
    }
    
    public abstract void display();
    
    public void performFly(){
        flyBehavior.fly();
    }
    
    public void setFlyBehavior(FlyBehavior f){
        flyBehavior = f;
    }
    
    public void setQuackBehavior(QuackBehavior q){
        quackBehavior = q;
    }
}
