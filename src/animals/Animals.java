package animals;

public class Animals {

    public static void main(String[] args) {
        Dog myDog = new Dog();//initaized new Dog
        Cat myCat = new Cat();//initaized new Cat
        Snake mySnake = new Snake();//initaized new Snake
        
        myDog.playSound();//called method
        myDog.FollowPerson();//called method
        
        mySnake.ChaseRat();//called method
        mySnake.Spit();//called method
        mySnake.eatRabbit();//called method
        
        myCat.ChaseRat();//called method
        myCat.bite();//called method
        myCat.FollowPerson();//called method
        

    }
    
}
