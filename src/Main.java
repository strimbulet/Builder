public class Main {

    public static void main(String[] args) {

        Director director=new Director();
        PizzaBuilder pizzaBuilder=new PizzaBuilder();
        director.constructSpicyBeefFood(pizzaBuilder);

        Pizza pizza=pizzaBuilder.getResult();
        System.out.println("pizza cu carne "+pizza.getCarne()+" sos: "+pizza.getSos());

        director.constructSweetChickenFoodWithCorn(pizzaBuilder);
        pizza=pizzaBuilder.getResult();

        System.out.println("pizza cucarne "+pizza.getCarne()+" sos: "+pizza.getSos()+" extra topping "+pizza.getExtra_topping());

        BurgerBuilder burgerBuilder=new BurgerBuilder();
        director.constructSweetChickenFood(burgerBuilder);

        Burger burger=burgerBuilder.getResult();

        System.out.println("burger cu carne "+burger.getCarne()+" sos: "+burger.getSos()+" extra topping "+burger.getExtra_topping());



    }
}
