/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jussi Haapalehto
 */
public class Kertoja {
    private int kerroin;
    
    public Kertoja(int luku) {
        this.kerroin = luku;
    }
    public int kerro(int luku) {
        return luku * this.kerroin;
    }
}
