/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.rest;

/**
 *
 * @author jespinoza
 */
public class CustomPrincipal implements java.security.Principal{

    @Override
    public String getName() {
        return "user";
    }
    
}
