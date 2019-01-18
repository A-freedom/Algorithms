class StackArray(private var size: Int) {
    private var top: Int = -1
    private var arrayStack: IntArray = IntArray(this.size)

    fun push(item: Int) {
        if (isFull()) {
            top++
            arrayStack[top] = item
        } else {
            println("this class is overflow maybe you need to resize this class")
        }
    }


    fun pop(): Any?{
        var it: Int? = null
        if (!isEmpty()) {
            it = arrayStack[top]
            arrayStack[top] = 0
            top--
        }
        return it
    }

    fun clear() {
        for (i in 0..top) {
            pop()
        }
    }

    fun isFull(): Boolean {
        return top < size
    }

    fun isEmpty(): Boolean {
        return top == -1
    }

    fun getSizeOfItem(): Int {
        return top + 1
    }

    fun getSize(): Int {
        return size
    }

}