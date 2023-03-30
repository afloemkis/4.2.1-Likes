fun main() {
    var likes = 4
    printLikes(likes)

    likes = 21
    printLikes(likes)

    likes = 1111
    printLikes(likes)

}

fun printLikes(likes: Int) {
    val word: String
    if ((likes % 10 == 1) && ((likes - 11) % 100 != 0)) {
        word = "человеку"
    } else {
        word = "людям"
    }
    println("Понравилось $likes $word")

}