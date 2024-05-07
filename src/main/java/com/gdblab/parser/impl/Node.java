/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gdblab.parser.impl;

/**
 *
 * @author 
 */
public class Node {
    private final String var;
    private final String label;
    private final String condition;

    public Node(final String var, final String label, final String condition) {
        this.var = var;
        this.label = label;
        this.condition = condition;
    }

    public String getVar() {
        return var;
    }
    

    public String getLabel() {
        return label;
    }

    public String getCondition() {
        return condition;
    }
    
}
