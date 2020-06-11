fun main (args: Array<String>){
    println("Hello Kotlin!")


    val x= arrayOf(1,2,3)
    val y=arrayOf(4,5,6)
    val z=arrayOf(7,8,9,10)
    val a=arrayOf(x,y,z)


    val f=a.size
    println(f)
    val k=a.size-1
    println(k)


    for (i in 0..a.size-1) {
        println("Row ${i + 1}")
        //println(a[i][0])
        for (c in 0..a[i].size - 1) {
            print("Column ${c +1} ")
            println("Element: ${a[i][c]}")


        }
    }
//a.forEach { it.forEach { println("Element: $it") } }
}

