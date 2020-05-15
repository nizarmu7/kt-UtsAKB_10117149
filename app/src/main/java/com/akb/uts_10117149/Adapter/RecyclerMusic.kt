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
import com.akb.uts_10117149.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_detail_music.view.*

class RecyclerMusic (inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_detail_music, parent, false)) {

    fun bind(music: ModelMusic) {
        itemView.apply {
            txt_judul?.text = music.judul
            txt_artist?.text = music.artist
            txt_nomer?.text = music.peringkat
            Picasso.get().load(music.image).into(img_music)
        }
    }
}