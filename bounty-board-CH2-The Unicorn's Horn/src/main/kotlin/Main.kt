const val HERO_NAME = "Madrigal"


fun main() {
    var hasSteed = false
    var namePUB = "Unicorn's Horn"
    var namePublican = "Tod"
    var gold = 0
    var drinkList = arrayOf("mead", "wine", "LaCroix")


    println("The hero announces her presence to the world.")
    println("The hero Madrigal arrives at a pub known as $namePUB. The publican asks, \"Do you need to stable a steed?\"")
    println("\"No,\" Madrigal replies, \"I have no steed. But I do have $gold gold, and I would like a drink.\"")
    println("\"Excellent,\" says the publican. \"I have ${drinkList.joinToString()}. What will you have?\"")

    println(HERO_NAME)
    var playerLevel = 4
    println(playerLevel)

    println("The hero embarks on her journey to locate the enchanted sword.")
    playerLevel += 1
    println(playerLevel)
}