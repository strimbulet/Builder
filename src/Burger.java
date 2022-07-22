public class Burger {

    private String sos;

    private String carne;

    private String extra_topping;

    public Burger(String sos, String carne) {
        this.sos = sos;
        this.carne = carne;
    }


    public Burger(String sos, String carne, String extra_topping) {
        this.sos = sos;
        this.carne = carne;
        this.extra_topping=extra_topping;
    }

    public String getSos() {
        return sos;
    }

    public void setSos(String sos) {
        this.sos = sos;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getExtra_topping() {
        return extra_topping;
    }

    public void setExtra_topping(String extra_topping) {
        this.extra_topping = extra_topping;
    }
}
