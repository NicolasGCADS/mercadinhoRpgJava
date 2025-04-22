package br.com.fiap.mercadinho.model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "campo obrigatório")
    @Size(min = 3, message = "deve ter pelo menos 3 caracteres")
    private String nameItem;

    @NotBlank(message = "campo obrigatório")
    @Size(min = 3, message = "deve ter pelo menos 3 caracteres")
    private String type;

    @NotBlank(message = "campo obrigatório")
    @Pattern(regexp = "^[A-Z].*", message = "As raridades são comum, raro, epico, lendario,deve começar com minuscula")

    private String rarity;
    private Double price;
    private String donor;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNameItem() {
        return nameItem;
    }
    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getRarity() {
        return rarity;
    }
    public void setRarity(String rarity) {
        this.rarity = rarity;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public String getDonor() {
        return donor;
    }
    public void setDonor(String donor) {
        this.donor = donor;
    }
    public Item(Long id, String nameItem, String type, String rarity, Double price, String donor) {
        this.id = id;
        this.nameItem = nameItem;
        this.type = type;
        this.rarity = rarity;
        this.price = price;
        this.donor = donor;
    }

    
    
    
}
