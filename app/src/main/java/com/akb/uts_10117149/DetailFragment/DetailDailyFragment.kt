package com.akb.uts_10117149.DetailFragment

/*
Tanggal Pengerjaan : Senin, 11 Mei 2020
Nim : 10117149
Nama : M Nizar Miftahul Ulya
Kelas : IF-4
 */

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.akb.uts_10117149.Adapter.AdapterDetailDaily
import com.akb.uts_10117149.Model.ModelDaily
import com.akb.uts_10117149.R
import kotlinx.android.synthetic.main.fragment_detail_daily.*


/**
 * A simple [Fragment] subclass.
 */
class DetailDailyFragment : Fragment() {

    private val item = listOf(
        ModelDaily("Sahur", "Sahur Untuk Berpuasa", "03.30", R.drawable.nasi),
        ModelDaily("Sholat Subuh", "Beribadah Wajib Setiap Subuh", "04.30", R.drawable.mosque),
        ModelDaily("Bermain HP", "Melihat Social Media", "05.00", R.drawable.smartphone),
        ModelDaily("Merawat Burung", "Memberikan Makan & Minum", "6.30", R.drawable.burung),
        ModelDaily("Bermain HP & Komputer", "Belajar & Melihat Social Media", "07.00", R.drawable.multipledevices),
        ModelDaily("Sholat Dzuhur", "Beribadah Wajib Setiap Dzuhur", "11.45", R.drawable.mosque),
        ModelDaily("Bermain HP & Komputer", "Belajar & Melihat Social Media", "12.15", R.drawable.multipledevices),
        ModelDaily("Sholat Ashar", "Beribadah Wajib Setiap Ashar", "15.10", R.drawable.mosque),
        ModelDaily("Bermain HP & Komputer", "Belajar & Melihat Social Media", "15.40", R.drawable.multipledevices),
        ModelDaily("Buka Puasa", "Berbuka Puasa Setelah Berpuasa ", "17.45", R.drawable.nasi),
        ModelDaily("Sholat Maghrib", "Beribadah wajib setiap maghrib", "18.10", R.drawable.mosque),
        ModelDaily("Sholat Isya & Tarawih", "Beribadah Wajib Setiap Isya dan Sholat Tarawih", "18.55", R.drawable.mosque),
        ModelDaily("Bermain HP & Komputer", "Belajar & Melihat Social Media", "20.00", R.drawable.multipledevices),
        ModelDaily("Tidur", "Beristirahat Setelah Beraktivitas", "23.30", R.drawable.tidur)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_daily, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // RecyclerView node initialized here
        recycler_daily.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(activity)
            // set the custom adapter to the RecyclerView
            adapter = AdapterDetailDaily(item)
        }
    }

    companion object {
        fun newInstance(): DetailDailyFragment = DetailDailyFragment()
    }

}
