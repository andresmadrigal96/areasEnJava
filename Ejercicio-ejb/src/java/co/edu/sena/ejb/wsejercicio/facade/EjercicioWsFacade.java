/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.ejb.wsejercicio.facade;

import co.edu.sena.ejb.wsejercicio.manager.EjercicioWsManager;
import javax.ejb.Stateless;

/**
 *
 * @author cperaltr
 */
@Stateless
public class EjercicioWsFacade implements EjercicioWsFacadeLocal {

    private EjercicioWsManager EjercicioWsManager =
            new EjercicioWsManager();

    @Override
    public float aTriangulo(float base, float altura) {
        return EjercicioWsManager.aTriangulo(base, altura);
    }

    @Override
    public float aCuadrado(float lado) {
        return EjercicioWsManager.aCuadrado(lado);
    }

    @Override
    public float aCirculo(float radio) {
        return EjercicioWsManager.aCirculo(radio);
    }

}
