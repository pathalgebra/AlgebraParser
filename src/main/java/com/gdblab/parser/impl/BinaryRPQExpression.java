/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gdblab.parser.impl;

/**
 *
 * @author 
 */
public abstract class BinaryRPQExpression extends RPQExpression{
    protected final RPQExpression leftChild;
    protected final RPQExpression rightChild;

    public BinaryRPQExpression(RPQExpression leftChild, RPQExpression rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public RPQExpression getLeftChild() {
        return leftChild;
    }

    public RPQExpression getRightChild() {
        return rightChild;
    }

    
    
    
}
