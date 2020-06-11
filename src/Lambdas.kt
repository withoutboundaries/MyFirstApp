typealias DoubleConversion= (Double)->Double

fun convert(
    x: Double,
    converter: DoubleConversion
): Double {
    val result=converter(x)
    println("$x is converted into $result")
    return result
}

fun getConversionLambda (str: String): DoubleConversion {
    if (str=="CentigradaToFarenheit"){
        return {it*1.8+32}
    } else if (str=="KgToPounds") {
        return {it*2.204623}
    } else if (str=="PoundsToUSTons"){
        return {it/2000.0}
    } else {
        return {it}
    }
}

fun combine (lambda1: DoubleConversion,
             lambda2: DoubleConversion) : DoubleConversion {
    return { x: Double -> lambda2(lambda1(x)) }
}


fun main(args: Array<String>) {

    //Convert 2.5kg to pounds
    println("Convert 2.5kg to Pounds: ${getConversionLambda("KgToPounds")(2.5) }")

    //Define two conversion lambdas
    val kgToPoundsLambda=getConversionLambda("KgToPounds")
    val poundsToUSTonsLambda=getConversionLambda("PoundsToUSTons")

    //Combine the two lambdas to create a new one
    val kgToUSTonsLambda = combine(kgToPoundsLambda,poundsToUSTonsLambda)

    //Use the new lambda to convert 17.4 to US tons
    val value=17.4
    println("$value kgs is ${convert (value, kgToUSTonsLambda)} US tons")
}