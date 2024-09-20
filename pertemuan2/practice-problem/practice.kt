// Izin pak, program ini adalah representasi dari apa yang sudah saya pelajari di materi "Practice Problems: Kotlin Basics"



fun main() {
    // Cetak pesan-pesan dasar menggunakan println()
    println("Use the val keyword when the value doesn't change.")
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it.")
    println("When you call a function, you pass arguments for the parameters.")

    // Menunjukkan penggunaan string template
    val discountPercentage = 20
    val item = "Google Chromecast"
    val offer = "Sale - Up to $discountPercentage% discount off $item! Hurry Up!"
    println(offer)

    // Operasi aritmatika dan string template untuk penjumlahan
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")

    // Membuat fungsi tambah dan kurang
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    println("$firstNumber + $secondNumber = ${add(firstNumber, secondNumber)}")
    println("$firstNumber - $thirdNumber = ${subtract(firstNumber, thirdNumber)}")

    // Menggunakan default parameter
    println(displayAlertMessage(emailId = "your_email@gmail.com"))

    // Fungsi pedometer untuk menghitung kalori
    val steps = 4000
    println("Walking $steps steps burns ${pedometerStepsToCalories(steps)} calories")

    // Fungsi perbandingan waktu
    println("Have I spent more time using my phone today: ${compareTime(300, 250)}")

    // Cetak cuaca untuk berbagai kota
    printWeatherForCity("Ankara", 27, 31, 82)
    printWeatherForCity("Tokyo", 32, 36, 10)
    printWeatherForCity("Cape Town", 59, 64, 2)
    printWeatherForCity("Guatemala City", 50, 55, 7)
}

// Fungsi tambah
fun add(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber
}

// Fungsi kurang
fun subtract(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber - secondNumber
}

// Fungsi menampilkan alert
fun displayAlertMessage(operatingSystem: String = "Unknown OS", emailId: String): String {
    return "There is a new sign-in request on $operatingSystem for your Google Account $emailId."
}

// Fungsi pedometer
fun pedometerStepsToCalories(numberOfSteps: Int): Double {
    val caloriesBurnedForEachStep = 0.04
    return numberOfSteps * caloriesBurnedForEachStep
}

// Fungsi membandingkan waktu
fun compareTime(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}

// Fungsi print cuaca
fun printWeatherForCity(cityName: String, lowTemp: Int, highTemp: Int, chanceOfRain: Int) {
    println("City: $cityName")
    println("Low temperature: $lowTemp, High temperature: $highTemp")
    println("Chance of rain: $chanceOfRain%")
    println()
}
