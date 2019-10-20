package task1;

public class Application {
    public static void main(String[] args) {
        Robot r = new Robot();
        CoffeRobot cr = new CoffeRobot();
        RobotDancer rd = new RobotDancer();
        RobotCoocker rc = new RobotCoocker();
        r.work(r);
        r.work(cr);
        r.work(rd);
        r.work(rc);
        Robot robots[]= {r,cr,rd,rc};
        for (int i = 0; i <robots.length ; i++) {
            r.work(robots[i]);
        }
    }
}
