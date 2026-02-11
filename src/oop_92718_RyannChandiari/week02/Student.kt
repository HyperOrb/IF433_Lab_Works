package oop_92718_RyannChandiari.week02

class Student(
    val name: String,
    val nim: String,
    var major: String,
    var gpa: Double = 0.0 // Tambahan Checkpoint 5 (Default Argument)
) {
    init {
        // ... (kode init sama seperti sebelumnya, tidak berubah)
        if (nim.length != 5) {
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("LOG: Objek Student $name berhasil dialokasikan di Memory.")
        }
    }

    // Secondary Constructor (Tidak perlu diubah karena gpa punya default value)
    constructor(name: String, nim: String) : this(name, nim, "Non-Matriculated") {
        println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan).")
    }
}