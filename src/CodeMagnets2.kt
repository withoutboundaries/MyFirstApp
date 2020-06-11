class BadException2:Exception ()
fun myFunction2 (test2: String) {
    try {
        print ("t")
        print("h")
        riskyCode2(test2)
        print("o")
    }
        catch (e: BadException) {
            print("a")
        }
    finally {
        print ("w")
        print("s")
    }
} fun riskyCode2 (test2:String) {
    if (test2 == "Yes") {
        throw BadException()
    }
        print("r")

}