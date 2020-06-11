
abstract class Pet (var name:String)
class Cat (name: String): Pet(name)
class Doggy (name: String): Pet (name)
class Fish (name: String):Pet (name)

class Vetty <T:Pet>{
    fun treat (t:T){
        println("Treat Pet ${t.name}")
    }
}

class Contest <T:Pet> (var vet: Vetty<in T>) {
    val scores: MutableMap<T, Int> = mutableMapOf()
    fun addScore (t:T, score:Int=0){
        if (score>=0) scores.put(t, score)
    }

    fun getWinners():MutableSet<T>{
        val highScore=scores.values.max()
        val winners:MutableSet<T> = mutableSetOf()
        for ((t,score) in scores){
            if (score==highScore) winners.add(t)
        }
        return winners
    }
}

interface Retailer<out T>{
    fun sell():T
}

class CatRetailer: Retailer<Cat>{
    override fun sell(): Cat {
        println("Sell Cat")
        return Cat("")
    }
}

class DogRetailer: Retailer<Doggy> {
    override fun sell():Doggy{
        println("Sell Dog")
        return Doggy ("")
    }
}

class FishRetailer: Retailer<Fish>{
    override fun sell():Fish{
        println("Sell Fish")
        return Fish("")
    }
}


fun main (args: Array<String>){
    val catFuzz= Cat("Fuzz Lightyeahr")
    val catKatsu= Cat ("Katsu")
    val fishFinny=Fish("Finny McGraw")

    val catVet=Vetty<Cat>()
    val fishVet=Vetty<Fish>()
    val petVet=Vetty<Pet>()

    catVet.treat(catFuzz)
    petVet.treat(catKatsu)
    petVet.treat(fishFinny)


    val catContest=Contest<Cat>(catVet)
    catContest.addScore(catFuzz,50)
    catContest.addScore(catKatsu,45)
    val topCat=catContest.getWinners().first()
    println("Cat contest winner is ${topCat.name}")

    val petContest=Contest<Pet>(petVet)
    petContest.addScore(catFuzz,50)
    petContest.addScore(fishFinny,56)
    val topPet=petContest.getWinners().first()
    println("Pet contest winner is ${topPet.name}")

    val fishContest=Contest<Fish>(petVet)

    val dogRetailer: Retailer<Doggy> = DogRetailer()
    val catRetailer:Retailer<Cat> = CatRetailer()
    val petRetailer: Retailer<Pet> = CatRetailer()
    petRetailer.sell()

}