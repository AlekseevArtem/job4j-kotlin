package ru.job4j.base

fun draw(size: Int) {
    var row = 0
    for(cell in 1 .. size*size){
        if((cell - row) % size == 1 || (cell + row) % size == 0) {
            print("X")
        } else {
            print(" ")
        }
        if(cell % size == 0) {
            println()
            row++
        }
    }
}

fun main() {
    draw(100)
}