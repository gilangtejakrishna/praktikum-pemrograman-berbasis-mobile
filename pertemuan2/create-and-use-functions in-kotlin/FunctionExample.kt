// Izin pak, program ini adalah representasi dari apa yang sudah saya pelajari di materi "Create and use functions in Kotlin"
// Saya membuat program ini agar tidak mengulang program yang sudah ada di materi, agar saya bisa belajar lebih


// Fungsi sederhana tanpa parameter
fun greet() {
    println("Halo, selamat belajar Kotlin!")
}

// Fungsi dengan satu parameter
fun greetPerson(name: String) {
    println("Halo, $name! Selamat datang di dunia Kotlin!")
}

// Fungsi dengan dua parameter dan pengembalian nilai
fun addNumbers(a: Int, b: Int): Int {
    return a + b
}

// Fungsi dengan parameter default
fun multiplyNumbers(a: Int, b: Int = 2): Int {
    return a * b
}

// Fungsi dengan parameter tipe data berbeda
fun describePerson(name: String, age: Int) {
    println("$name berumur $age tahun.")
}

// Fungsi dengan return unit (void)
fun printDivider() {
    println("=================================")
}

// Fungsi utama
fun main() {
    // Memanggil fungsi tanpa parameter
    greet()

    // Memanggil fungsi dengan satu parameter
    greetPerson("Gilang")

    // Memanggil fungsi dengan dua parameter
    val sum = addNumbers(10, 20)
    println("Hasil penjumlahan: $sum")

    // Memanggil fungsi dengan parameter default
    val product = multiplyNumbers(5)
    println("Hasil perkalian (default): $product")

    // Memanggil fungsi dengan dua argumen
    val productWithArgs = multiplyNumbers(5, 3)
    println("Hasil perkalian dengan argumen: $productWithArgs")

    // Memanggil fungsi dengan tipe data berbeda
    describePerson("Gilang", 21)

    // Memanggil fungsi tanpa return value (void)
    printDivider()
}


// Output
// Halo, selamat belajar Kotlin!
// Halo, Gilang! Selamat datang di dunia Kotlin!
// Hasil penjumlahan: 30
// Hasil perkalian (default): 10
// Hasil perkalian dengan argumen: 15
// Gilang berumur 21 tahun.
// =================================