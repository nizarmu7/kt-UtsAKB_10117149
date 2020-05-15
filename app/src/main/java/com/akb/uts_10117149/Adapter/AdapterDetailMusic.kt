package com.akb.uts_10117149.Adapter

/*
Tanggal Pengerjaan : Kamis, 14 Mei 2020
Nim : 10117149
Nama : M Nizar Miftahul Ulya
Kelas : IF-4
 */

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.akb.uts_10117149.Model.ModelMusic

class AdapterDetailMusic (private val list: List<ModelMusic>)
    : RecyclerView.Adapter<RecyclerMusic>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerMusic {
        val inflater = LayoutInflater.from(parent.context)
        return RecyclerMusic(inflater, parent)
    }

    override fun onBindViewHolder(holder: RecyclerMusic, position: Int) {
        val listmusic: ModelMusic = list[position]
        holder.bind(listmusic)
    }

    override fun getItemCount(): Int = list.size
}