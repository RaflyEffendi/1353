package polymorphism

fun main() {
    val afrig = Dosen()
    afrig.nama = "Afrig Aminudin"
    afrig.alamat = "Concat"
    afrig.perkenalan()
    afrig.gaji = 1000000
    afrig.bekerja()
    afrig.prodi = "Sistem Informasi"
    afrig.mengajar()

    val rafly = Mahasiswa()
    rafly.nama = "Rafly Yansyah Effendi"
    rafly.alamat = "CondongCatur"
    rafly.perkenalan()
    rafly.prodi = "Sistem Informasi"
    rafly.belajar()

    val andika = Satpam()
    andika.nama = "Andika Aminudin"
    andika.alamat = "Magelang"
    andika.perkenalan()
    andika.gaji = 5000000
    andika.bekerja()
    andika.pos = "Timur"
    andika.menjaga()
}