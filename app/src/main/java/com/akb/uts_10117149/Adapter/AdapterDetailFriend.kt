package com.akb.uts_10117149.Adapter

/*
Tanggal Pengerjaan : Selasa, 12 Mei 2020
Nim : 10117149
Nama : M Nizar Miftahul Ulya
Kelas : IF-4
 */

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.akb.uts_10117149.Model.ModelFriend

class AdapterDetailFriend (private val list: List<ModelFriend>)
    : RecyclerView.Adapter<RecyclerFriend>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerFriend {
        val inflater = LayoutInflater.from(parent.context)
        return RecyclerFriend(inflater, parent)
    }

    override fun onBindViewHolder(holder: RecyclerFriend, position: Int) {
        val kegiatan: ModelFriend = list[position]
        holder.bind(kegiatan)
    }

    override fun getItemCount(): Int = list.size

}