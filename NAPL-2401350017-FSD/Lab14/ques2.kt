fun main() {

    println("===== NULL SAFETY IN KOTLIN =====")

    // 1. Nullable and Non-nullable variables
    var nullableName: String? = null
    var nonNullableName: String = "vipul"

    nullableName = "Rahul"

    println("Nullable Name: $nullableName")
    println("Non-nullable Name: $nonNullableName")

    // Non-nullable variable cannot store null
    // nonNullableName = null  // Compilation error


    println("\n===== SAFE CALL OPERATOR =====")

    var name: String? = "Kotlin"

    println("Length: ${name?.length}")

    name = null

    println("Length when null: ${name?.length}")


    println("\n===== ELVIS OPERATOR =====")

    val username: String? = null

    val result = username ?: "Guest"

    println("Username: $result")


    println("\n===== NOT-NULL ASSERTION OPERATOR =====")

    val value: String? = null

    try {
        println(value!!.length)
    } catch (e: NullPointerException) {
        println("Exception caught: ${e.message}")
    }

    println("Program continues safely.")
}