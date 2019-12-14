fun main(){
    println("Constate mon animalerie du seigneur : ")
    println("")
    val ajoutetAfficheanimalerie = Animalerie()
    ajoutetAfficheanimalerie.add()
    ajoutetAfficheanimalerie.affiche()
    ajoutetAfficheanimalerie.parler()


}

class Animalerie(){

    fun add() {

        val LesAnimaux  = mutableListOf(Chien(),Chat(),Perroquet())
        LesAnimaux += listOf(Chien())
        println("Les animaux de la ferme sont :"+ LesAnimaux)

        }


    fun affiche(){
        println("")
        println("Présentation des super animaux :")
        println("")
        val chien : Animal = Chien()
        chien.quiSuisJe()
        val chat : Animal = Chat()
        chat.quiSuisJe()
        val perroquet : Animal = Perroquet()
        perroquet.quiSuisJe()
    }

    fun parler(){
        println("")
        println("Et ils s'expriment :")
        println("")
        val chien : Animal = Chien()
        chien.parler()
        val chat : Animal = Chat()
        chat.parler()
        val perroquet : Animal = Perroquet()
        perroquet.parler()
    }
}

interface Animal {
    fun parler()
    fun quiSuisJe()
}

    class Chien : Animal {

        override fun parler() {
            println("Je fais ouaf ouaf")
        }

        override fun quiSuisJe() {
            println("Je suis un Yorkshire de 20kilos et j'adore jouer")
        }
    }

    class Chat : Animal {

        override fun parler() {
            println("Je fais miaou miaou")
        }

        override fun quiSuisJe() {
            println("Je suis un Persan de 10kilos et j'adore jouer")
        }
    }

    class Perroquet : Animal {

        override fun parler() {
            println("Je repete tout ce que dis l'homme")
        }

        override fun quiSuisJe() {
            println("Je suis un Peroquet du désert de 6kilos et j'adore parler")
        }
    }

