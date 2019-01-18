import java.util.*

class DynimcStackArray {
    private var top: Int = -1
    private var size = 0
    private var arrayStack: IntArray
    init {
        arrayStack = IntArray(this.size)
    }
    fun push(item: Int) {
        top++
        ensureCapacity(top+1)
        arrayStack[top] = item
    }

    private fun ensureCapacity(minCapacity:Int) {

        if (minCapacity > this.size) {
            val newCapacity =this.size + 20
            arrayStack = Arrays.copyOf(arrayStack,newCapacity)
            this.size = newCapacity
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

    private fun isEmpty(): Boolean {
        return top == -1
    }

    fun getSizeOfItem(): Int {
        return top + 1
    }

    fun getSize(): Int {
        return size
    }

}