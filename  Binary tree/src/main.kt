fun main(args: Array<String>) {
    val binaryTree = BinaryTree(Data(0,"A"))
    for (i in  -100..100) {
        binaryTree.add(Data(i, "Ali $i"))
    }

}