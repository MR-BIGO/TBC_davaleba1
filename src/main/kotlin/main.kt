fun main(){
    sum()
}


fun sum(){
    println("შეიყვანეთ X -> ")
    val x = readln().toInt()
    println("შეიყვანეთ Y -> ")
    val y = readln().toInt()
    val z = x + y
    println("X და Y ჯამი არის: $z")

    println("გსურთ პროგრამის ხელახლა დაწყება <Y/N>?")
    val answer = readln()
    if (answer.lowercase() == "y" || answer.lowercase() == "yes") return sum()
}