class LinkedList{
    private var head: Node?
    private var size = 0
    init {
        head = null
    }

    fun add(value: Data) {
        val newNode = Node(value, null)
        if (head == null)
            head = newNode
        else {
            newNode.next = head
            head = newNode
        }
    }

    fun deleteFirst():Boolean{
        head = head!!.next
        if (head == null) return false
        return true
    }


    fun display() {
        /* customer*/
        val out =ArrayList<String>()
        var n = head
        while (n != null) {
            out.add(n.value.getValue())
            n = n.next
        }
        println(out.toList())
    }

    fun getSize():Int{
        var node = this.head
        this.size++
        while (node!!.getNode() != null){
            this.size++
            node = node.next
        }
        return size
    }

    fun search(data: Data,size:Int):String?{
        var n = head
        while (n != null) {
            if (n.getValue().getKey() == data.getKey()){
                return n.value.getValue()
            }
            n = n.next
        }
        return null
    }

    fun search(key:Int):String?{
        var n = head
        while (n != null) {
            if (n.getValue().getKey() == key){
                return n.value.getValue()
            }
            n = n.next
        }
        return null
    }
}