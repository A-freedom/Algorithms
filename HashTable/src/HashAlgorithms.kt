class HashAlgorithms{
    private val size:Int
    constructor(size:Int){
        this.size = size
    }
    fun getSimpleHash(key:Int): Int {
        return key%this.size
    }
}