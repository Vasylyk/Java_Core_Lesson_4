package task1;

public class Robot {

    public void work(Robot r){
        System.out.println("Я Robot – я просто працюю");
    }
    public void work(RobotCoocker rc){
        System.out.println("Я RobotCoocker – я просто готую");
    }
    public void work(RobotDancer rd){
        System.out.println("Я RobotDancer – я просто танцюю");
    }
    public void work(CoffeRobot cr){
        System.out.println("Я CoffeRobot – я варю каву");
    }

}
