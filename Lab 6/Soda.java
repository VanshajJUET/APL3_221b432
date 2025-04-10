class Soda extends Decorator{
    public Soda(BaseDrink decoratorDrink){
        super(decoratorDrink);
    }
    @Override
    public String getIngredients(){
        return this.base.getIngredients()+ "with Soda";
    }
    public int getPrice(){
        return this.base.getPrice()+ 20;
    }
    
}