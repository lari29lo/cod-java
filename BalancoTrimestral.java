/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package balancotrimestral.balancotrimestral;

/**
 *
 * @author larissa.lorraine
 */
public class BalancoTrimestral {

    public static void main(String[] args) {
        float jan = 15.000f;
        float fev = 23.000f;
        float mar = 17.000f;
        
        float gastostrimestrais = jan + fev + mar;
        System.out.println(gastostrimestrais);
        if (gastostrimestrais > 50.000f)
        System.out.println("estouro de orçamento");
    }
}
