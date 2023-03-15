package XBintang

import com.sun.source.tree.NewClassTree

class ClassCetakBintangX() {
    //6. Bintang Simbol X
    //method memunculkan simbol X
    interface TampilkanSimbol{
        fun CetakSimbolX (baris: Int)
    }

    class BagianAtas:TampilkanSimbol{
        override fun CetakSimbolX(baris: Int) {
            for (i in 1..baris) {
                for (j in 1..baris) {
                    if (i == j) {
                        print("*")
                    } else {
                        print(" ")
                    }
                }
                for (j in baris - 1 downTo 1) {
                    if (i == j) {
                        print("*")
                    } else {
                        print(" ")
                    }
                }
                println()
            }
        }
    }

    class BagianBawah:TampilkanSimbol{
        override fun CetakSimbolX(baris: Int) {
                for (i in baris - 1 downTo 1) {
                    for (j in 1..baris - 1) {
                        if (i == j) {
                            print("*")
                        } else {
                            print(" ")
                        }
                    }
                    for (j in baris downTo 1) {
                        if (i == j) {
                            print("*")
                        } else {
                            print(" ")
                        }
                    }
                    println()
                }
        }
    }

    class Tampil{
        var bagianatas1 :TampilkanSimbol = BagianAtas()
        var bagianBawah1 :TampilkanSimbol = BagianBawah()
        fun menampilkan(baris: Int){
            bagianatas1.CetakSimbolX(baris)
            bagianBawah1.CetakSimbolX(baris)
        }
    }
}