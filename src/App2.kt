fun main (args: Array<String>){
    var a= arrayOf(
        1,
        2,
        3,
        4,
        5
    )

    var b =arrayOf(6,7,8,9,10)
    val c=arrayOf(a,b)

   var d=c.size
    println("Size of val c is $d")

    for (i in 0..c.size-1){
//println(c[i][1])

        for (f in 0 ..c[i].size-1){
            println(c[i][f])
        }
    }

}