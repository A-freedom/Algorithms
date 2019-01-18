class BinaryTree(headValue: Data) {
    var head:Node = Node(null,headValue,null)

    fun add(value: Data): Boolean {
        fun addNode(value:Data,roodExplorer:Node?): Boolean {
            when {
                value.getKey() < roodExplorer?.value!!.getKey() -> return if (roodExplorer.left == null){
                    roodExplorer.left = Node(null,value,null)
                    true

                }else{
                    addNode(value,roodExplorer.left)
                }
                value.getKey() > roodExplorer.value.getKey() -> return if (roodExplorer.right == null){
                    roodExplorer.right = Node(null,value,null)
                    true
                }else{
                    addNode(value,roodExplorer.right)
                }
                else -> println("the item is already exist !! key [${value.getKey()}] ")
            }
            return false
        }
        return addNode(value,head)
    }
    fun search(value: Int): Data? {
        fun search(value:Int,roodExplorer:Node?): Data? {
            if (roodExplorer != null){
                return when {
                    value < roodExplorer.value.getKey() -> search(value,roodExplorer.left)
                    value > roodExplorer.value.getKey() -> search(value,roodExplorer.right)
                    else -> roodExplorer.value
                }
            }
            return null
        }
        return search(value,head)
    }

    fun isKeyExist(key: Int): Boolean {
        fun isKeyExist(value:Int, roodExplorer:Node?): Boolean {
            if (roodExplorer == null){return false}
            return when {
                value < roodExplorer.value.getKey() -> isKeyExist(value,roodExplorer.left)
                value > roodExplorer.value.getKey() -> isKeyExist(value,roodExplorer.right)
                else -> true
            }
        }
        return isKeyExist(key,head)
    }




}