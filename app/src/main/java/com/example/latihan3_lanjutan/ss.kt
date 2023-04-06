package com.example.latihan3_lanjutan
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TargetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)

        val tvhasil =findViewById<TextView> (R.id.tvhasil)
        val nama = intent.getStringExtra("Extra_Nama")
        val email = intent.getStringExtra("Extra_Email")
        val pas = intent.getStringExtra("Extra_Pass")
        val jenis1 = intent.getStringExtra("Extra_jenis1")
        val jenis2 = intent.getStringExtra("Extra_jenis2")
        val hasilData = "Nama Anda adalah $nama \n" +
                "email Anda adalah        $email \n" + "dan"
                "Password anda             $pas\n+" +
                "jenis kelamin anda adalah $jenis1"+ "$jenis2"

        tvhasil.text=hasilData
    }
}