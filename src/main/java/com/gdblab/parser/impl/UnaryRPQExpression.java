/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gdblab.parser.impl;

/**
 *
 * @author 
 */
public abstract class UnaryRPQExpression extends RPQExpression{
    protected final RPQExpression child;

    public UnaryRPQExpression(RPQExpression child) {
        this.child = child;
    }

    public RPQExpression getChild() {
        return child;
    }
    
    
}
