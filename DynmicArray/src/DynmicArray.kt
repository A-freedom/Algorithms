import java.util.Arrays



class DynamicArray{
    private var data:IntArray
    var size:Int = 0

    init {
        this.data = IntArray(0)
    }
    fun getItem(index:Int):Int{
        return data[index]
    }

    fun setItem(item:Int){
        ensureCapacity(size+1)
        data[size++] = item

    }

    private fun ensureCapacity(minCapacity: Int) {
        val oldCapacity = getSizeOfArray()
        if (minCapacity > oldCapacity) {
            var newCapacity = oldCapacity * 2
            if (newCapacity < minCapacity)
                newCapacity = minCapacity
            data = Arrays.copyOf(data, newCapacity)
        }
    }
    fun getSizeOfArray():Int{
        return data.size
    }

    fun getAll(): List<Int> {
        return data.toList()
    }

}