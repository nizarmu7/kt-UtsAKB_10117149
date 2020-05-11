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

import com.akb.uts_10117149.R

/**
 * A simple [Fragment] subclass.
 */
class DetailMusicFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_music, container, false)
    }

}
