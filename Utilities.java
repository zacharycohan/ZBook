package zbook;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zack
 */
public class Utilities {
    
    protected static int obtainPasswordHash(char[] arr){
        String str = "";
        for(char c : arr){
            str += c;
        }
        return str.hashCode();
    }
}
