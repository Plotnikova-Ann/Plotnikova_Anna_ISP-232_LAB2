//fun main() {
//    print("Введите первое число: ")
//    val number1 = readln().toInt()
//    print("Введите второе число: ")
//    val number2 = readln().toInt()
//    if (number1 > number2) {
//        println("Число $number1 больше чем число $number2")
//    } else {
//        println("Число $number2 больше чем число $number1")
//    }
//    val max = if (number1 > number2) number1 else number2
//    println("Максимальное число - $max")
//    print("Введите ваш возраст: ")
//    val age = readln().toInt()
//    val status = if (age >= 18) "Взрослый" else "Ребёнок"
//    println(status)
//    print("Введите урон: ")
//    val damage = readln().toInt()
//    print("Щит активен? (введите да или нет): ")
//    val shieldActive = readln().lowercase() == "да"
//    val finalDamage = if (shieldActive) damage / 2 else damage
//    println("Полученный урон: $finalDamage")
//    print("Введите ваш уровень: ")
//    val level = readln().toInt()
//    print("У вас есть VIP-статус? (true/false): ")
//    val hasVIP = readln().toBoolean()
//    if ((level >= 30 && hasVIP) || level >= 50) {
//        println("Доступ разрешен!")
//    } else {
//        println("Доступ запрещен!")
//    }
//}