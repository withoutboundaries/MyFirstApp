class Song (val title:String, val artist: String){
    fun play(){
        println("Playing the song $title by $artist")
    }

    fun stop(){
        println("Stop playing $title")
    }
}

fun main (args: Array<String>){
    val songOne=Song ("The Mesopotamins", "They might be giants")
    val songTwo=Song ("Going Underground", "The Jam")
    val songThree=Song ("Make me smile", "Steve Harley")
    songTwo.play()
    songTwo.stop()
    songThree.play()
}