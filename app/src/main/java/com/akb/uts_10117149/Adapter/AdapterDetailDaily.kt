package com.akb.uts_10117149.Adapter

/*
Tanggal Pengerjaan : Senin, 11 Mei 2020
Nim : 10117149
Nama : M Nizar Miftahul Ulya
Kelas : IF-4
 */

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.akb.uts_10117149.Model.ModelDaily

class AdapterDetailDaily(private val list: List<ModelDaily>)
    : RecyclerView.Adapter<RecyclerDaily>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerDaily {
        val inflater = LayoutInflater.from(parent.context)
        return RecyclerDaily(inflater, parent)
    }

    override fun onBindViewHolder(holder: RecyclerDaily, position: Int) {
        val kegiatan: ModelDaily = list[position]
        holder.bind(kegiatan)
    }

    override fun getItemCount(): Int = list.size

}