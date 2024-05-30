public class Card {

    private String palo;
    private String color;
    private String valor;



    public Card(int i) {
        this.palo = palo;
        this.color = color;
        this.valor = valor;

    }

    public Card(String palo, String color, String valor) {
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

}
