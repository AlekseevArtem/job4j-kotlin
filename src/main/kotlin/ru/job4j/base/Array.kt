package ru.job4j.base

fun defragment(array: Array<String?>) : Array<String?> {
    var notNull = 0
    for ((index, cell) in array.withIndex()) {
        if(cell != null) {
            array[notNull] = cell
            if(notNull++ != index) {
                array[index] = null
            }
        }
    }
    return array
}
