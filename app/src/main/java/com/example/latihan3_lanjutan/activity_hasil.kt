package com.example.latihan3_lanjutan
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class activity_hasil : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)
//pengiriman melalui inten
        val tvhasil =findViewById<TextView> (R.id.tvhasil)
        val judul =findViewById<TextView> (R.id.dd)
        val nama = intent.getStringExtra("Extra_Nama")
        val email = intent.getStringExtra("Extra_Email")
        val pas = intent.getStringExtra("Extra_Pass")
        val umur  = intent.getStringExtra("Extra_Umur")
        val jeniskelamin = intent.getStringExtra("EXTRA_JENIS_KELAMIN")
        val kelas  = intent.getStringExtra("Extra_Kelas")
        val jurusan  = intent.getStringExtra("Extra_Jurusan")
        val judulnya="ini Inten"
        val hasilData = "Nama         : $nama \n" +
                "Email        : $email \n" +
                "Password : $pas\n" +
                "Umur         : $umur tahun \n" +
                "Jenis Kelamin : $jeniskelamin \n" +
                "Kelas         : $kelas \n" +
                "Jurusan     : $jurusan"
//        judul.text=judulnya
        tvhasil.text=hasilData


    }
}

