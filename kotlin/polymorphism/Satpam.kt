package polymorphism

class Satpam : Karyawan() {

    var pos: String = ""

    fun menjaga () {
        println("saya menjaga di pos $pos")
    }

    override fun perkenalan() {
        println("siap ndan, saya $nama, dari $alamat")
    }
}