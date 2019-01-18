fun main(args: Array<String>) {
    val hash = HashArray(50)
    for (i in 0..684){
        hash.add(Data(i,"$i"))
    }
    while (hash.deleteFirstByHash(2)){}
    hash.display()


}