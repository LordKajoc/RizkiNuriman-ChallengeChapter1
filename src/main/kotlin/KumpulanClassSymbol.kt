//parent class abstract
abstract class KumpulanGambar() {
    abstract fun berapabaris(baris: Int)
}

//No 1. Membuat Piramida
open class MethodBintangPiramida : KumpulanGambar() {
    override fun berapabaris(baris: Int) {
        //Function Cetak bintang sesuai dengan pola
        fun cetakbintangpiramida(baris: Int) {
            for (i in 1..baris) {
                //Loop spasi 1
                for (j in baris - 1 downTo i) {
                    print(" ")
                }
                for (k in 1..2 * i - 1) {
                    print("*")
                }
                println()
            }
        }
        cetakbintangpiramida(baris)
    }
}
open class BintangPiramida : MethodBintangPiramida() {
    //1. Bintang Piramida
    override fun berapabaris(baris: Int) {
        super.berapabaris(baris)
    }
}


//No 2. Piramida Terbalik
open class MethodBintangPiramidaTerbalik : KumpulanGambar() {
    override fun berapabaris(baris: Int) {
        //Function Cetak bintang sesuai dengan pola
        fun cetakbintangpiramidaterbalik(baris: Int) {
            for (i in baris downTo 1) {
                //Loop spasi 1
                for (j in baris downTo i + 1) {
                    print(" ")
                }
                //Loop Bintang
                for (k in 1..2 * i - 1) {
                    print("*")
                }
                println()
            }
        }
        cetakbintangpiramidaterbalik(baris)
    }

}
class BintangPiramidaTerbalik() : MethodBintangPiramidaTerbalik() {
    override fun berapabaris(baris: Int) {
        super.berapabaris(baris)
    }
}

//3. Belah Ketupat
// Extend dengan class Bintang Piramida karena dengan mengambil hasil dari class tersebut
// selanjutnya melanjutkan bentuk untuk melengkapi
open class MethodBelahKetupat : BintangPiramida() {
    //method mencetak bintang belah ketupat
    protected fun cetakbelahketupat(baris: Int) {
        for (i in baris - 1 downTo 1) {
            //Loop spasi 1
            for (j in baris - 1 downTo i) {
                print(" ")
            }
            //Loop Bintang
            for (k in 1..2 * i - 1) {
                print("*")
            }
            println()
        }
    }
}
class BintangBelahKetupat : MethodBelahKetupat() {
    override fun berapabaris(baris: Int) {
        super.berapabaris(baris)
        cetakbelahketupat(baris)
    }
}

//4. Setengah Piramida (Segitiga siku-siku)
open class MethodSetengahPiramida : KumpulanGambar() {
    override fun berapabaris(baris: Int) {
        //Function Cetak bintang sesuai dengan pola
        fun cetakbintangsetengahpiramida(baris: Int) {
            for (i in 1..baris) {
                for (j in 1..i) {
                    print("*")
                }
                println()
            }
        }
        cetakbintangsetengahpiramida(baris)
    }
}
class BintangSetengahPiramida : MethodSetengahPiramida() {
    override fun berapabaris(baris: Int) {
        super.berapabaris(baris)
    }
}

//5. Setengah Piramida Terbalik (Segitiga Siku-Siku Terbalik)
open class MethodSetengahPiramidaTerbalik : KumpulanGambar() {
    override fun berapabaris(baris: Int) {
        //Function Cetak bintang sesuai dengan pola
        fun cetakbintangsetengahpiramidaterbalik(baris: Int) {
            for (i in baris downTo 1) {
                for (j in 1..i) {
                    print("*")
                }
                println()
            }
        }
        cetakbintangsetengahpiramidaterbalik(baris)
    }
}
class SetengahBintangPiramidaterbalik : MethodSetengahPiramidaTerbalik() {
    override fun berapabaris(baris: Int) {
        super.berapabaris(baris)
    }
}

