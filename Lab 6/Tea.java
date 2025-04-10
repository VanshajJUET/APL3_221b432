public class Tea implements BaseDrink{
    String name;
    Tea(){
        this.name = "Tea";
    }
    public int getPrice(){
        return 10;
    }
    public String getIngredients(){
        return this.name;
    }
}