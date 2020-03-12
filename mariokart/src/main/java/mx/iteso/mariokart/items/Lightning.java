/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.iteso.mariokart.items;
import mx.iteso.mariokart.Item;
/**
 *
 * @author coque
 */
public class Lightning extends Item {
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    */
    static final String ITEM_NAME = "Lightning";
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    */
    private String name = ITEM_NAME;
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    * @return El número de ítems (números aleatorios) de que consta la serie
    */
    @Override
    public String getName() {
        return this.name;
    }
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    *@param nameParam El parámetro numeroItems define el número de elementos
    *que va a tener la serie aleatoria
    */
    public void setName(final String nameParam) {
        this.name = nameParam;
    }
}
