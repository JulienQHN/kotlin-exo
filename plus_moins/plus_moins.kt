fun main() {
    print("Perssone 1 entre un nombre: ")
    val number = readLine()?.toInt()
    print("Perssone 2 entre un nombre: ")
    val number2 = readLine()?.toInt()
    if(number2!! == number!!) {
        println("C'est gagné")
    } else {

do {

    if(number2 > number) {
        println("C'est trop grand")
        print("Perssone 2 entre un nombre: ")
    }
    if(number2 < number) {
        println("C'est trop petit")
        print("Perssone 2 entre un nombre: ")
    }
    val number2 = readLine()?.toInt()
}

while(number != number2)

    println("C'est gagné")
}}














