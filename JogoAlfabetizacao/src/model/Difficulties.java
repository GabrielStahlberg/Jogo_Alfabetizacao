/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author gabri
 */
public enum Difficulties {
    EASY("Fácil"),
    MEDIUM("Médio"),
    HARD("Difícil");
    
    private final String description;

    Difficulties(String description) {
        this.description = description;
    }
    public String getDescription(){
        return description;
    }    
}
