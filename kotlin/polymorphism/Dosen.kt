package polymorphism

class Dosen : Karyawan() {

    var prodi: String = ""

    fun mengajar () {
        println("saya mengajar di prodi $prodi")
    }

    override fun perkenalan(){
        println("Perkenalkan nama saya $nama, alamat saya di $alamat")

    }
}