/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrotiadoqueijo;

/**
 *
 * @author DSANTOS
 */
public class Cliente {
    
    private String nome;
    
        private String numero;

    public static final String PROP_NUMERO = "numero";

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        String oldNumero = this.numero;
        this.numero = numero;
        propertyChangeSupport.firePropertyChange(PROP_NUMERO, oldNumero, numero);
    }

    
    public static final String PROP_NOME = "nome";

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        propertyChangeSupport.firePropertyChange(PROP_NOME, oldNome, nome);
    }

    private transient final java.beans.PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    public void addPropertyChangeListener(java.beans.PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(java.beans.PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    
}
