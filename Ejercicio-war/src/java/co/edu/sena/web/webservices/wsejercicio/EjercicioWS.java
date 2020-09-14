/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.web.webservices.wsejercicio;

import co.edu.sena.ejb.wsejercicio.facade.EjercicioWsFacadeLocal;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author USER
 */
@WebService(serviceName = "EjercicioWS")
public class EjercicioWS {
    
    @EJB
    private EjercicioWsFacadeLocal ejercicioWsFacadeLocal;
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "aTriangulo")
    public float aTriangulo(
            @WebParam(name = "base") float base,
            @WebParam(name = "altura") float altura) {
        return ejercicioWsFacadeLocal.aTriangulo(base, altura);
    }
    
    @WebMethod(operationName = "aCuadrado")
    public float aCuadrado(
            @WebParam(name = "lado") float lado) {
        return ejercicioWsFacadeLocal.aCuadrado(lado);
    }
    
    @WebMethod(operationName = "aCirculo")
    public float aCirculo(
            @WebParam(name = "radio") float radio) {
        return ejercicioWsFacadeLocal.aCirculo(radio);
    }
}
