public class Coffee implements BaseDrink{
    String name;
    Coffee(){
        this.name ="Coffee";
    }
    public int getPrice(){
        return 30;
    }
    public String getIngredients(){
        return this.name;
    }
}