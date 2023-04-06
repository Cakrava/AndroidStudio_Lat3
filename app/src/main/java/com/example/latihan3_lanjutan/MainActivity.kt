package com.example.latihan3_lanjutan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import  android.widget.TextView
import  android.widget.SeekBar
import android.widget.Spinner
import android.widget.ToggleButton


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        seekbar
        var tvsb = findViewById<TextView>(R.id.tvsb)

        var sek = findViewById<SeekBar>(R.id.sek)
        sek.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(SeekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                tvsb.text = progress.toString()
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

//        variable data data
        val btnkirim = findViewById<Button>(R.id.btnkirim)
        val edi = findViewById<EditText>(R.id.edi)
        val ed2 = findViewById<EditText>(R.id.ed2)
        val ed3 = findViewById<EditText>(R.id.ed3)
        val rb1 = findViewById<RadioButton>(R.id.rb1)
        val rb2 = findViewById<RadioButton>(R.id.rb2)
        val sp = findViewById<Spinner>(R.id.sp)
        val btnbundel = findViewById<Button>(R.id.btnbundel)

        //proses pengiriman data dengan inten
        btnkirim.setOnClickListener() {
            val rb1 = findViewById<RadioButton>(R.id.rb1)
            val rb2 = findViewById<RadioButton>(R.id.rb2)
            val tvps = findViewById<Spinner>(R.id.sp)
            val jurusan = tvps.selectedItem.toString()
            val tgbt = findViewById<ToggleButton>(R.id.tgbt)
            val kelas = if (tgbt.isChecked) "Pagi" else "Sore"
            val umur = tvsb.text.toString()
            val password = ed3.text.toString()
            val email =ed2.text.toString()
            val nama = edi.text.toString()
            val rbPria = findViewById<RadioButton>(R.id.rb1)
            val rbWanita = findViewById<RadioButton>(R.id.rb2)
            val jenisKelamin = if (rbPria.isChecked) {
                "Laki-Laki"
            } else if (rbWanita.isChecked) {
                "Perempuan"
            } else {
                "Belum Dipilih"
            }
            Intent(this, activity_hasil::class.java). also {
                it.putExtra("Extra_Nama", nama)
                it.putExtra("Extra_Email", email)
                it.putExtra("Extra_Pass", password)
                it.putExtra("Extra_Umur", umur)
                it.putExtra("Extra_Kelas", if (tgbt.isChecked) "Pagi" else "Sore")
                it.putExtra("Extra_Jurusan", tvps.selectedItem.toString())
                it.putExtra("EXTRA_JENIS_KELAMIN", jenisKelamin)
                startActivity(it)
            }

        }




//        pengiriman data melalui bundle
        btnbundel.setOnClickListener() {
            val rb1 = findViewById<RadioButton>(R.id.rb1)
            val rb2 = findViewById<RadioButton>(R.id.rb2)
            val tvps = findViewById<Spinner>(R.id.sp)
            val jurusan = tvps.selectedItem.toString()
            val tgbt = findViewById<ToggleButton>(R.id.tgbt)
            val kelas = if (tgbt.isChecked) "Pagi" else "Sore"
            val umur = tvsb.text.toString()
            val password = ed3.text.toString()
            val email =ed2.text.toString()
            val nama = edi.text.toString()
            val rbPria = findViewById<RadioButton>(R.id.rb1)
            val rbWanita = findViewById<RadioButton>(R.id.rb2)
            val jenisKelamin = if (rbPria.isChecked) {
                "Laki-Laki"
            } else if (rbWanita.isChecked) {
                "Perempuan"
            } else {
                "Belum Dipilih"
            }

            val bundle = Bundle()
            bundle.putString("Bundle_Nama", nama)
            bundle.putString("Bundle_Email", email)
            bundle.putString("Bundle_Pass", password)
            bundle.putString("Bundle_Umur", umur)
            bundle.putString("Bundle_Kelas", if (tgbt.isChecked) "Pagi" else "Sore")
            bundle.putString("Bundle_Jurusan", tvps.selectedItem.toString())
            bundle.putString("BUNDLE_JENIS_KELAMIN", jenisKelamin)


            val intent = Intent(this, hasil_bundle::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

    }
}