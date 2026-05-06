package oop_lecture.week11

fun salam_pembuka(nama: String) {

}

fun String.rubah_huruf_depan_jadi_besar(): String {
    var hasil = this.split(" ").joinToString(" ") {
        it.replaceFirstChar {
                c -> c.uppercase();
        }
    }
    return "Hai $hasil";
}

fun Int.tentukanGrade(namaMhs: String) {
    var hasilGrade = "E";

    if(this >= 80) {
        hasilGrade = "A"
    } else if (this >= 70) {
        hasilGrade = "B"
    } else {
        hasilGrade = "C"
    }

    repeat(3) {
        println(namaMhs + " Grade kamu " + hasilGrade);
    }
}

//function extension - null
fun String?.cekNulldanEmpty(): String {
    if(this == null || this.isEmpty()) {
        return "Username ga boleh null atau empty";
    } else {
        return "Username kamu $this";
    }
}

fun main() {
    var namaSaya = "budi gunawan";
    salam_pembuka(namaSaya);
    println(namaSaya.uppercase());

    //cara panggil function extension - Dasar
    println("udin sedunia".rubah_huruf_depan_jadi_besar());

    //cara panggil function extension - parameter
    71.tentukanGrade(namaMhs = "Eliqrah");

    //cara panggil function extension - null
    var usernameKamu:String? = null;
    println(usernameKamu.cekNulldanEmpty());

    //SCOPE - LET
    var kampusKamu = "UMN";
    kampusKamu.let {
        println("Nama kampus kamu " + it);
        if(it=="UMN") {
            println("Ih keren");
        } else {
            println("Amazing");
        }
    }

    //SCOPE - RUN
    var namaMatkul:String = "OOP";
    namaMatkul.run {
        println("Matkul favorite saya " + this);
    }

    //SCOPE - WITH
    val keputusanLulus = with(70) {
        if(this >= 70) {
            "Lulus"
        } else {
            "Remedial"
        }
    }
    println("kamu $keputusanLulus");
}