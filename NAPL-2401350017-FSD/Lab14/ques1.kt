fun main() {

    println("===== MUTABLE AND READ-ONLY COLLECTIONS =====")

    // Mutable List
    val mutableList = mutableListOf(10, 20, 30)
    mutableList.add(40)
    mutableList.remove(20)
    println("Mutable List: $mutableList")
    println("Contains 30: ${mutableList.contains(30)}")

    // Read-only List
    val readOnlyList = listOf(10, 20, 30)
    println("Read-only List: $readOnlyList")
    println("Element at index 1: ${readOnlyList.get(1)}")

    // Mutable Set
    val mutableSet = mutableSetOf(1, 2, 3)
    mutableSet.add(4)
    mutableSet.remove(2)
    println("Mutable Set: $mutableSet")
    println("Contains 3: ${mutableSet.contains(3)}")

    // Read-only Set
    val readOnlySet = setOf(1, 2, 3, 4)
    println("Read-only Set: $readOnlySet")

    // Mutable Map
    val mutableMap = mutableMapOf("A" to 10, "B" to 20)
    mutableMap["C"] = 30
    mutableMap.remove("B")
    println("Mutable Map: $mutableMap")
    println("Value of A: ${mutableMap.get("A")}")

    // Read-only Map
    val readOnlyMap = mapOf("A" to 10, "B" to 20)
    println("Read-only Map: $readOnlyMap")
    println("Value of B: ${readOnlyMap.get("B")}")


    println("\n===== MAP, FILTER AND REDUCE =====")

    val numbers = listOf(1, 2, 3, 4, 5)

    // Map: multiply every number by 2
    val mapped = numbers.map { it * 2 }
    println("Map: $mapped")

    // Filter: select even numbers
    val filtered = numbers.filter { it % 2 == 0 }
    println("Filter: $filtered")

    // Reduce: calculate sum
    val reduced = numbers.reduce { sum, num -> sum + num }
    println("Reduce: $reduced")


    println("\n===== SORTING AND GROUPING STUDENTS =====")

    data class Student(val name: String, val percentage: Int)

    val students = listOf(
        Student("Aman", 85),
        Student("Rahul", 65),
        Student("Neha", 92),
        Student("Karan", 75),
        Student("Priya", 55)
    )

    // Sort students by percentage
    val sortedStudents = students.sortedBy { it.percentage }

    println("Sorted Students:")
    sortedStudents.forEach {
        println("${it.name} - ${it.percentage}%")
    }

    // Group students based on percentage
    val groupedStudents = students.groupBy {
        when {
            it.percentage >= 80 -> "Excellent"
            it.percentage >= 60 -> "Good"
            else -> "Needs Improvement"
        }
    }

    println("\nGrouped Students:")
    groupedStudents.forEach { (category, studentList) ->
        println("$category: ${studentList.map { it.name }}")
    }
}