import java.awt.geom.QuadCurve2D

class Dog (val name:String, weight_param:Int, breed_param:String){
    init {
        print("Dog $name has been created.")
    }

    var activities= arrayOf("Walks")
    val breed=breed_param.toUpperCase()
    init {
        println ("The breed is $breed")
    }
    var weight=weight_param
    set (value){
        if (value>0) field=value
    }

    val weightInKgs: Double
    get ()=weight/2.2

    fun bark (){
        println( if (weight<20) "Yip!" else "Woof!")
    }

    var temperament ="Kholerik"
}

fun main (args: Array<String>){
    val myDog=Dog("Fido", 70, "Mixed")
    myDog.bark()
    myDog.weight=75
    println("Weight in Kgs is ${myDog.weightInKgs}")
    myDog.weight=-2
    println("Weight is ${myDog.weight}")
    myDog.activities= arrayOf("Walks", "Fetching balls", "Frisbee")
    for (item in myDog.activities) {
        println("My dog enjoys $item")
    }

    val dogs=arrayOf(Dog ("Kelpie", 20, "Westie"), Dog ("Ripper", 10, "Poodle"))
    dogs[1].bark()
    dogs[1].weight=15
    println ("Weight for ${dogs[1].name} is ${dogs[1].weight}")
    println("Temperament of ${dogs[0].name} is ${dogs[0].temperament}")
}