/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Gabriela Gonzaga
 */
public class AdocaoDTO {
    
    boolean status; 
    String id_animal, id_adotante;
    int id;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getId_animal() {
        return id_animal;
    }

    public void setId_animal(String id_animal) {
        this.id_animal = id_animal;
    }

    public String getId_adotante() {
        return id_adotante;
    }

    public void setId_adotante(String id_adotante) {
        this.id_adotante = id_adotante;
    }
    
}
