package inheritance

class Mahasiswa : Orang() {

    var nim: String = ""
    var prodi: String = ""

    fun belajar () {
        println("saya belajar di prodi $prodi")
    }
}