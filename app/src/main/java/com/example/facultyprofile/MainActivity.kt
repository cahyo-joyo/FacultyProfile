package com.example.facultyprofile
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = createFac()
        rv_list_main.layoutManager = LinearLayoutManager(this)
        rv_list_main.setHasFixedSize(true)
        rv_list_main.adapter = FacAdapter(data, { onItem: FacData ->
            onItemClicked(onItem) })
    }
    private fun onItemClicked(onItem: FacData) {
        val showDetailActivityIntent = Intent(this, FacDetail::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, onItem.imgFac)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, onItem.nameFac)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, onItem.descFac)
        showDetailActivityIntent.putExtra(Intent.EXTRA_SUBJECT, onItem.descDet)
        startActivity(showDetailActivityIntent)
    }
    private fun createFac(): List<FacData> {
        val rvList = ArrayList<FacData>()
        rvList.add(
                FacData(
                        R.drawable.logo,
                        "Fakultas Ekonomi dan Bisnis",
                        "Fakultas Ekonomi dan Bisnis\n" +
                                "merupakan salah satu dari 7\n" +
                                "Fakultas 'Veteran' Jawa\n" +
                                "Timur. Yang terdiri dari program\n" +
                                "studi: ",
                        "1. Prodi S1 Ekonomi Pembangunan\n" +
                                "2. Prodi S1 Akuntansi\n" +
                                "3. Prodi S1 Manajemen"
                )
        )
        rvList.add(
                FacData(
                        R.drawable.logo,
                        "Fakultas Pertanian",
                        "Fakultas Pertanian\n" +
                                "merupakan salah satu dari 7\n" +
                                "Fakultas 'Veteran' Jawa\n" +
                                "Timur. Yang terdiri dari program\n" +
                                "studi: ",
                        "1. Prodi S1 Agroteknologi\n" +
                                "2. Prodi S1 Agribisnis"
                )
        )
        rvList.add(
                FacData(
                        R.drawable.logo,
                        "Fakultas Teknik",
                        "Fakultas Teknik\n" +
                                "merupakan salah satu dari 7\n" +
                                "Fakultas 'Veteran' Jawa\n" +
                                "Timur. Yang terdiri dari program\n" +
                                "studi: ",
                        "1. Prodi S1 Teknik Kimia\n" +
                                "2. Prodi S1 Teknik Industri\n" +
                                "3. Prodi S1 Teknik Sipil\n" +
                                "4. Prodi S1 Teknik Lingkungan\n" +
                                "5. Prodi S1 Teknologi Pangan"
                )
        )
        rvList.add(
                FacData(
                        R.drawable.logo,
                        "Fakultas Ilmu Komputer",
                        "Fakultas Ilmu Komputer\n" +
                                "adalah satu dari dari 7\n" +
                                "program studi di UPN\n" +
                                "VETERAN JATIM",
                        "1. Prodi S1 Teknik Informatika\n" +
                                "2. Prodi S1 Sistem Informasi"
                )
        )
        rvList.add(
                FacData(
                        R.drawable.aku,
                        "Profil Singkat",
                        "Nama : Cahyo Joyo Prawiro\n"+
                                "Tanggal Lahir : Surabaya, 12 Juni 2000\n" +
                                "Alamat : Jl Tambak Asri, Surabaya\n" +
                                "Nomor HP : 081249016492\n" +
                                "Email : cahyoj6@gmail.com\n" +
                                "Github : https://github.com/cahyo-joyo\n",
                        "Riwayat Pendidikan : \n" +
                                "\t\t 1. MI SALAFIYAH \n" +
                                "\t\t 2. SMPN 5 Surabaya \n" +
                                "\t\t 3. SMA Barunawati \n\n" +
                                "Penghargaan : -"
                )
        )
        return rvList
    }
}
