package aula05;
import java.util.ArrayList;
import  java.util.List;

public class Imobiliaria {
    
    private List<Property> properties;
    private int id;

    public Imobiliaria(){
        properties = new ArrayList<>();
        id = 1000;
    }

    public void newProperty(int quartos,String localidade, double preco){
        properties.add(new Property(id++, quartos, localidade, preco));
    }

    private Property findProperty(int id) {
        for (Property property : properties) {
            if (property.getId() == id) {
                return property;
            }
        }
        return null;
    }

    public void sell(int id) {
        Property property = findProperty(id);
        if (property != null) {
            if (property.isAvailable()) {
                System.out.println("Imóvel " + id + " vendido.");
                property.setAvailable(false);
            } else {
                System.out.println("Imóvel " + id + " não está disponível.");
            }
        } else {
            System.out.println("Imóvel " + id + " não existe.");
        }
    }

    public void setAuction(int id, DateYMD startDate, int duration) {
        Property property = findProperty(id);
        if (property != null) {
            property.setAuction(startDate, duration);
        } else {
            System.out.println("Imóvel " + id + " não existe.");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Propriedades:\n");
        for (Property property : properties) {
            sb.append(property.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}

class Property{

    private int id, quartos, auctionDuration;
    private double preco;
    private String localidade;
    private boolean available;
    private DateYMD auctionStartDate;

    public Property(int id, int quartos, String localidade, double preco){
        this.id = id;
        this.quartos = quartos;
        this.localidade = localidade;
        this.preco = preco;
        this.available = true;
    }

    public int getId() {
        return id;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAuction(DateYMD startDate, int duration) {
        this.auctionStartDate = startDate;
        this.auctionDuration = duration;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Imóvel: ").append(id).append("; ");
        sb.append("quartos: ").append(quartos).append("; ");
        sb.append("localidade: ").append(localidade).append("; ");
        sb.append("preço: ").append(preco).append("; ");
        sb.append("disponível: ").append(available ? "sim" : "não");
        if (auctionStartDate != null) {
            sb.append("; leilão ");
            sb.append("início: ").append(auctionStartDate).append("; ");
            sb.append("duração: ").append(auctionDuration).append(" dias");
        }
        return sb.toString();
    }
}
