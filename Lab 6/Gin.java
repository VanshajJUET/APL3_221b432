class Gin extends Decorator{
    public Gin(BaseDrink decoratorDrink){
        super(decoratorDrink);
    }
    @Override
    public String getIngredients(){
        return this.base.getIngredients()+ "with Gin";
    }
    public int getPrice(){
        return this.base.getPrice()+ 105;
    }
    
}