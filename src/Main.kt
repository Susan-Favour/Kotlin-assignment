fun main(){
greeting("Lorna")

    remainder(25,6)

    sum(6, 4, 6, 2)

    interestingFact()
}
fun greeting(name: String) {
    println("Hello" + ' ' + name)
}

fun remainder(num1:Int, num2:Int) {
    var result = num1 % num2
    println(result)
}

fun sum(a:Int, b:Int, c:Int, d:Int){
    var result= a + b + c + d
    println(result)
}

fun interestingFact(){
    var fact= "I'm a great actress"
    println(fact)
}






