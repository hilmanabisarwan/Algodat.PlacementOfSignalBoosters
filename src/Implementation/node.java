/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementation;

/**
 *
 * @author Windows 8
 */
public class node {
    //paket data terlihat anggota
    int element;
    node left;
    node right;
    //konstruktor
    public node(){
    }
    public node(int theElement){
        element = theElement;
    }
    public node(int theElement, node theleftChild, node therightChild){
        element = theElement;
        left = theleftChild;
        right = theleftChild;
    }
}
