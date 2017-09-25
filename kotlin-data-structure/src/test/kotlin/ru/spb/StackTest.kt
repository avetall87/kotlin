package ru.spb

import org.junit.*
import org.junit.Test

internal class StackTest {
    private var myStack: Stack? = null
    val item = 1

    init {
        myStack = Stack(10)
    }

    @Test
    fun isEmpty() {
        assert(myStack?.isEmpty()!!)
    }

    @Test
    fun isFull() {
        for ( i in 1..10){
           myStack?.add(i)
        }
        assert(myStack?.isFull()!!)
    }

    @Test
    fun add() {
        for ( i in 1..10){
            myStack?.add(i)
        }
        Assert.assertEquals(9,myStack?.currentSize())
    }

    @Test
    fun pop() {
        myStack?.add(item)
        Assert.assertEquals(item,myStack?.pop())
        Assert.assertEquals(true,myStack?.isEmpty())
    }

    @Test
    fun peek() {
        myStack?.add(item)
        Assert.assertEquals(item,myStack?.peek())
        Assert.assertEquals(false,myStack?.isEmpty())

    }

}