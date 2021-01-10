package inheritance

import polymorphism.Karyawan

class Satpam : Karyawan() {

    var pos: String = ""

    fun menjaga () {
        println("saya menjaga di pos $pos")
    }
}