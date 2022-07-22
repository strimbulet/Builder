public class Pizza {
    private String sos;
    private String extra_topping;
    private String carne;

    public Pizza(String sos, String carne) {
        this.sos = sos;
        this.carne = carne;
    }


    public Pizza(String sos, String carne, String extra_topping) {
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

    public String getExtra_topping() {
        return extra_topping;
    }

    public void setExtra_topping(String extra_topping) {
        this.extra_topping = extra_topping;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }
}
