class LinkedListU{
    private var head: Node?
    private var size = 0
    init {
        head = null
    }

    fun add(value: Int) {
        val newNode = Node(value, null)
        if (head == null)
            head = newNode
        else {
            newNode.next = head
            head = newNode
        }
        this.size ++
    }

    fun delete() {
        head = head!!.next
        this.size --
    }

    fun removeAt(value: Int): Boolean {
        var last:Node? = head
        var head:Node? = head
        var next:Node? = head

        while (head != null){
            if (head.value !=  value){
                last =  head
                head = head.next
                next = head?.next
            }else{
                last?.next = next
                this.size --
                return true
            }
        }
        return false
    }

    fun display() {
        var n = head
        while (n != null) {
            println(n.value)
            n = n.next
        }
    }

    fun getSize():Int{
        return this.size
    }

    fun removeAll(list: List<Int>): Boolean {
        for (i in list){
            removeAt(i)
        }
        return true
    }
    fun addAll(list: List<Int>): Boolean {
        for (i in list){
            add(i)
        }
        return true
    }

}