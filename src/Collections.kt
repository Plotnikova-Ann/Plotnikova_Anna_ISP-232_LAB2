//fun main() {
//    val languages = listOf("Python", "Kotlin", "C#", "C++", "Java")
//    println("Первый элемент: ${languages[0]}")
//    println("Размер списка: ${languages.size}")
//    println("Есть ли Kotlin в списке: ${"Kotlin" in languages}")
//    val daysInMonth = listOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
//    print("Введите номер месяца (1-12): ")
//    val input = readln().toInt()
//    if (input in 1..12) {
//        val days = daysInMonth[input - 1]
//        println("В этом месяце $days дней.")
//    } else {
//        println("Некорректный номер месяца.")
//    }
//    println("\nВсе языки программирования:")
//    for (language in languages) {
//        println("- $language")
//    }
//}