package com.akb.uts_10117149.Adapter

/*
Tanggal Pengerjaan : Jum'at, 15 Mei 2020
Nim : 10117149
Nama : M Nizar Miftahul Ulya
Kelas : IF-4
 */

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.akb.uts_10117149.Model.ModelGallery

class AdapterDetailGallery (private val list: List<ModelGallery>, val listener: (Int) -> Unit)
    : RecyclerView.Adapter<RecyclerGallery>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerGallery {
        val inflater = LayoutInflater.from(parent.context)
        return RecyclerGallery(inflater, parent)
    }

    override fun onBindViewHolder(holder: RecyclerGallery, position: Int) {
        holder.bind(list[position], position, listener)
    }

    override fun getItemCount(): Int = list.size
}