/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind;

/**
 *
 * @author Antonio
 */
abstract class Combination {
    
    protected String combination;
    
    protected Combination() {
        this.combination = new String();
    }
    protected abstract void show();
}
