package inheritance

import polymorphism.Karyawan

class Dosen : Karyawan() {

    var prodi: String = ""

    fun mengajar () {
        println("saya mengajar di prodi $prodi")
    }
}