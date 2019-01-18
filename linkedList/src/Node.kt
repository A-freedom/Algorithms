class Node(internal var value: Int, internal var next: Node?){
    fun getNode():Node?{
        return this.next
    }
    fun getValue():Int{
        return this.value
    }
}