class DrumKit (var hasTopHat:Boolean, var hasSnare:Boolean){
    fun playTophat (){
        if (hasTopHat)
        println("ding ding ba-da-bing!")
    }

    fun playSnare (){
        if (hasSnare)
        println("bang bang bang!")
    }
}

fun main (args: Array<String>){
    val d= DrumKit (true, true)
    d.playTophat()
    d.playSnare()
    d.hasSnare=false
    d.playTophat()
    d.playSnare()
}