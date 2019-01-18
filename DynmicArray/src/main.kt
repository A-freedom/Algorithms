fun main(args: Array<String>) {
    var dynamicArray =DynamicArray()
    for (i in 1..100) {
        dynamicArray.setItem(i)
        println("size Items ${dynamicArray.size} \t the mine size ${dynamicArray.getSizeOfArray()}")
    }
    println(dynamicArray.getAll())
}