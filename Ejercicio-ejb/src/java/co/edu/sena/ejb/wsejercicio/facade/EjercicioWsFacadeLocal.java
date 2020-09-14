/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.ejb.wsejercicio.facade;

import javax.ejb.Local;

/**
 *
 * @author cperaltr
 */
@Local
public interface EjercicioWsFacadeLocal {

    public float aTriangulo(float base, float altura);

    public float aCuadrado(float lado);

    public float aCirculo(float radio);

}
