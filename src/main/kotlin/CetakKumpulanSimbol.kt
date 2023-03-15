import PlusBintang.ClassCetakPlusBintang
import XBintang.ClassCetakBintangX

fun main() {
    //Cetak Bintang Piramida
    var cetakgambarbintangpiramida = BintangPiramida()
    cetakgambarbintangpiramida.berapabaris(8)
    println()
    //Cetak Bintang Piramida Terbalik
    var cetakgambarbintangpiramidaterbalik = BintangPiramidaTerbalik()
    cetakgambarbintangpiramidaterbalik.berapabaris(8)
    println()
    //Cetak Bintang Belah Ketupat
    var cetakgambarbintangbelahketupat = BintangBelahKetupat()
    cetakgambarbintangbelahketupat.berapabaris(8)
    println()
    //Cetak Bintang X
    var mencetaksimbolx = ClassCetakBintangX.Tampil()
    mencetaksimbolx.menampilkan(8)
    println()
    //Cetak Setengah Piramida
    var cetaksetengahpiramida = BintangSetengahPiramida()
    cetaksetengahpiramida.berapabaris(8)
    println()
    //Cetak Setengah Piramida terbalik
    var cetaksetengahpiramidaterbalik = SetengahBintangPiramidaterbalik()
    cetaksetengahpiramidaterbalik.berapabaris(8)
    println()
    //Cetak Plus Bintang
    var cetakplusbintang = ClassCetakPlusBintang()
    cetakplusbintang.munculbintangsymbolPlus(5)
}