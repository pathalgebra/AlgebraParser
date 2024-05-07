/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gdblab.parser.impl;

/**
 *
 * @author 
 */
public class LabelExpression extends NullaryRPQExpression{
    
    private final String label;

    public LabelExpression(final String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
    
}
