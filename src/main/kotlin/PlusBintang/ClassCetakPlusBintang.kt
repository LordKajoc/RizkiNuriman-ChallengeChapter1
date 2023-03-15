package PlusBintang

class ClassCetakPlusBintang {
    //7. Bintang Simbol Plus (+)
    //Method memunculkan simbol Plus
    fun munculbintangsymbolPlus(baris: Int) {
        if (baris % 2 != 0) {
            jikabarisganjil(baris)
        } else {
            jikabarisgenap(baris)
        }
    }

    //Function menampilkan simbol jika nilai baris = ganjil
    private fun jikabarisganjil(baris: Int) {
        for (i in 1..baris ) {
            //Loop spasi 1
            for (j in 1..baris ) {
                if (i == ((baris / 2) + 1) || j == ((baris/ 2)*2 + 1)) {
                    print(" *")
                } else {
                    print(" ")
                }
            }
            println()
        }
    }

    //Function menampilkan simbol jika nilai baris = genap
    private fun jikabarisgenap(baris: Int) {
        for (i in 1..baris + 1) {
            //Loop spasi 1
            for (j in 1..baris + 1) {
                if (i == ((baris / 2) + 1) || j == ((baris*2 / 2) + 1)) {
                    print(" *")
                } else {
                    print(" ")
                }
            }
            println()
        }
    }
}