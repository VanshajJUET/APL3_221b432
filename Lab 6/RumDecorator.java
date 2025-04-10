class RumDecorator extends Decorator{
    public RumDecorator(BaseDrink decoratorDrink){
        super(decoratorDrink);
    }
    @Override
    public String getIngredients(){
        return this.base.getIngredients()+ "with Rum";
    }
    public int getPrice(){
        return this.base.getPrice()+ 35;
    }
    
}