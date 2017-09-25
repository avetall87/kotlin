package ru.spb

class Stack (private val maxSize: Int){
    private val stackArray: IntArray = kotlin.IntArray(maxSize)
    private var top: Int = -1

    fun isEmpty():Boolean = top == -1

    fun isFull():Boolean = top == (maxSize-1)

    fun add(item: Int){
        top++
        stackArray[top]=item
    }

    fun currentSize():Int = top

    /**
     * Отнимает по 1 элемента умассива
     */
    fun pop(): Int = stackArray[top--]

    /**
     * Возвращает верхнее значнение массива
     */
    fun peek():Int = stackArray[top]



}
