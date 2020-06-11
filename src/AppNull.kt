class Kitty {
    var hunger=10
    val food ="meat"

    fun eat (){
        println ("The Kitty is eating $food")
    }
}

class MyKitty {
    val kitty: Kitty?=Kitty()

    fun myFunction (){
        kitty?.eat()
    }
}

fun getAlphaKitty():Kitty? {
    return Kitty()
}

fun main (args: Array<String>){
    var k: Kitty?=Kitty()
    if (k!=null) {
        k.eat()
    }

    var x=k?.hunger
    println("The value of k is $x")

    var y=k?.hunger?:-1
    println("The value of y is $y")

    var myKitty: MyKitty?=MyKitty()

    myKitty?.kitty?.hunger=8
    println("The value of myKitty?.kitty?.hunger is ${myKitty?.kitty?.hunger}")

    var myArray=arrayOf("Hi", "Hippo", null)
    for (item in myArray){
        item?.let { println(it)}
    }
    getAlphaKitty()?.let { it.eat() }

    k=null
    var z=k!!.hunger
}