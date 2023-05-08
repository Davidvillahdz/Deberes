/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.java.ejemplo.ocho.controlador;

/**
 *
 * @author Usuario
 */
public interface IControlador {
    public abstract void create(Object obj);
    public abstract  Object read(Object obj);
    public abstract void update(Object obj);
    public abstract void delete(Object obj);
    public abstract void list();
}
