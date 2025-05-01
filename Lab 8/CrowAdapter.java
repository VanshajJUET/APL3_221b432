public class CrowAdapter implements Swan{
    private Crow crow;
    CrowAdapter(Crow crow){
        this.crow = crow;
    }
    public void eat(){
        crow.eat();
    }
    public void sing(){
        crow.cry();
    }
    public void swim(){
        crow.fly();
    }
}