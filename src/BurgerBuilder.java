public class BurgerBuilder implements Builder{
    private String carne;
    private String sos;

    private String extra_topping;

    @Override
    public void setCarne(String carne) {
        this.carne=carne;
    }

    @Override
    public void setSos(String sos) {
        this.sos=sos;
    }

    @Override
    public void setExtra_topping(String extra_topping) {
        this.extra_topping=extra_topping;
    }

    public Burger getResult(){
        return new Burger(sos,carne,extra_topping);
    }
}
