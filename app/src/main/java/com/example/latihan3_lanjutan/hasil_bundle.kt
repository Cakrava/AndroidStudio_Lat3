package com.example.latihan3_lanjutan
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class hasil_bundle : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)

//        hasil dari pengiriman bundle
        val hasil = findViewById<TextView>(R.id.tvhasil)
//
        val bundle = intent.extras

        val nm = bundle?.getString("Bundle_Nama")
        val em = bundle?.getString("Bundle_Email")
        val pw = bundle?.getString("Bundle_Pass")
        val um = bundle?.getString("Bundle_Umur")
        val jk = bundle?.getString("BUNDLE_JENIS_KELAMIN")
        val kl = bundle?.getString("Bundle_Kelas")
        val jr = bundle?.getString("Bundle_Jurusan")
        val jd="Ini adalah bundle"
        val hd = "Nama         : $nm \n" +
                "Email        : $em \n" +
                "Password : $pw\n" +
                "Umur         : $um tahun \n" +
                "Jenis Kelamin : $jk \n" +
                "Kelas         : $kl \n" +
                "Jurusan     : $jr"
//        tvjudul.text = jd
        hasil.text = hd


    }
}

