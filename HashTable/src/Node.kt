class Node(internal var value: Data, internal var next: Node?){
    fun getNode():Node?{
        return this.next
    }
    fun getValue(): Data {
        return this.value
    }
}