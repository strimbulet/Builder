public class Director {
    public void constructSpicyBeefFood(Builder builder)
    {
        builder.setCarne("vita");
        builder.setSos("picant");
        builder.setExtra_topping("");
    }

    public void constructSweetChickenFood(Builder builder)
    {
        builder.setCarne("pui");
        /*builder.setSos("dulce");
        builder.setExtra_topping("");*/
    }

    public void constructSweetChickenFoodWithCorn(Builder builder)
    {
        builder.setCarne("pui");
        builder.setSos("dulce");
        builder.setExtra_topping("porumb");
    }

  

}
