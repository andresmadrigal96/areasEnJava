/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.ejb.wsejercicio.manager;

/**
 *
 * @author USER
 */
public class EjercicioWsManager {
    
    public float aTriangulo(float base, float altura){
        return (base*altura)/2;
    }
    
    public float aCuadrado(float lado){
        return lado * lado;
    }
    
    public float aCirculo(float radio){
        return (float) (Math.PI * Math.pow(radio,2));
    }
}
