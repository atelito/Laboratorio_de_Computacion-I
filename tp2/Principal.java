/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

import java.util.Date;

/**
 *
 * @author axelp
 */
public class Principal {
    
    
    public static void main(String[] args) {
        Date fechaHoraEj17 = new Date();

        FuncionesPrograma.getFechaString(fechaHoraEj17);
        FuncionesPrograma.getFechaDate(1, 0, 2020);
    }
}
