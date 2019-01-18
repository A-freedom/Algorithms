class HashArray {
    private var hashArray:Array<LinkedList>
    private var size:Int
    constructor(size:Int){
        this.size =size
        hashArray  = Array(size) { LinkedList() }
    }


    fun add(data: Data){
        val hash =HashAlgorithms(this.size).getSimpleHash(data.getKey())
        hashArray[hash].add(data)
    }

    fun deleteFirstByHash(hash:Int):Boolean{
        return hashArray[hash].deleteFirst()
    }

    fun getItem(key: Int): String? {
        val hash = HashAlgorithms(this.size).getSimpleHash(key)
        return hashArray[hash].search(key)
    }

    fun getItem(data: Data){
        //TODO create this fun
    }

    fun display(){
        for (i in 0 until hashArray.size){
            print("the hash (${i+1}) !")
            hashArray[i].display()
        }
    }
}