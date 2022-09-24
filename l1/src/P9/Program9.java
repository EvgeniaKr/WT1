package P9;
import java.util.ArrayList;
public class Program9 {
    public static void main(String[] args) {
        Ball ball1 = new Ball(20.45, "Blue");
        Ball ball2 = new Ball(30.45, "Black");
        Ball ball3 = new Ball(40.45, "White");
        Ball ball4 = new Ball(50.45, "Blue");
        Basket basket = new Basket();
        basket.AddBall(ball1);
        basket.AddBall(ball2);
        basket.AddBall(ball3);
        basket.AddBall(ball4);
        System.out.println("Вес мячиков: " + basket.AllWeight());
        System.out.println("Синих мячиков: " + basket.BlueBalls());
    }
}
class Ball{
    private double weight;
    private String color;
    Ball(double weight, String color)
    {
        this.weight = weight;
        this.color = color;
    }
    public double getWeight() { return weight; }
    public String getColor() { return color; }
}
class Basket{
    public void AddBall(Ball ball){
        BallAll.add(ball);
    }
    public double AllWeight(){
        double weight = 0;
        for (Ball b : BallAll){
            weight = weight + b.getWeight();
        }
        return weight;
    }
    public int BlueBalls(){
        int i = 0;
        for (Ball b : BallAll){
            if (b.getColor() == "Blue"){
                i++;
            }
        }
        return i;
    }
    private ArrayList<Ball> BallAll = new ArrayList<Ball>();
}

