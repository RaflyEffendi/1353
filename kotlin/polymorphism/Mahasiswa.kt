package polymorphism

class Mahasiswa : Orang() {

    var nim: String = ""
    var prodi: String = ""

    fun belajar () {
        println("saya belajar di prodi $prodi")
    }

    override fun perkenalan(){
        println("kenalin nama gue $nama, tinggal di $alamat ")
    }
}