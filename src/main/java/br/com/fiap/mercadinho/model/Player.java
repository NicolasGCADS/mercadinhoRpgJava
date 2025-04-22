package br.com.fiap.mercadinho.model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Player {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "campo obrigatório")
    @Size(min = 3, message = "deve ter pelo menos 3 caracteres")
    private String name;
    
    @NotBlank(message = "campo obrigatório")
    @Pattern(regexp = "^[A-Z].*", message = "Classes devem ser guerreiro, mago ou arqueiro e para escolher digite o nome em minuscula")
    private String classe;

    private int level;
    private Double money;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getClasse() {
        return classe;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public Double getMoney() {
        return money;
    }
    public void setMoney(Double money) {
        this.money = money;
    }
    public Player(Long id, String name, String classe, int level, Double money) {
        this.id = id;
        this.name = name;
        this.classe = classe;
        this.level = level;
        this.money = money;
    }


    @Override
    public String toString() {
        return "Player [id=" + id + ", name=" + name + ", classe=" + classe + ", level=" + level + ", money=" + money + "]";
    }

    
    
}
