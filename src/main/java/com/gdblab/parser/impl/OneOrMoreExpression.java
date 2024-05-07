/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gdblab.parser.impl;

/**
 *
 * @author 
 */
public class OneOrMoreExpression extends UnaryRPQExpression{
    private final String restrictor;
    
    public OneOrMoreExpression(RPQExpression child, String restrictor) {
        super(child);
        this.restrictor = restrictor;
    }

    public String getRestrictor() {
        return restrictor;
    }
    
}
