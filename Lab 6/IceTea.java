public class IceTea implements BaseDrink{
    String name;
    IceTea(){
        this.name= "Ice Tea";
    }
    public int getPrice(){
        return 40;
    }
    public String getIngredients(){
        return this.name;
    }
}