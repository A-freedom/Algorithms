fun main(args: Array<String>) {
//    val stackArray = StackArray(100)
    var stackArray = DynimcStackArray()
    for (i in 0..200) {
        stackArray.push(i)
    }


    println("SizeOfItem : ${stackArray.getSizeOfItem()}")
    println("Size : ${stackArray.getSize()}")
    stackArray.clear()
    println("SizeOfItem : ${stackArray.getSizeOfItem()}")
    println("Size : ${stackArray.getSize()}")


}