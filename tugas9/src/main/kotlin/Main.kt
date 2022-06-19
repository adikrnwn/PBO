fun main(args: Array<String>) {
    hitungJam()

}

fun hitungJam(){
    println("Masukkan detik :")
    var awal = readln().toInt()
    var jam:Int = awal / 3600
    var menit:Int = (awal % 3600)/60
    var detik:Int = awal % 60
    print(jam)
    print(":")
    print(menit)
    print(":")
    print(detik)
}

