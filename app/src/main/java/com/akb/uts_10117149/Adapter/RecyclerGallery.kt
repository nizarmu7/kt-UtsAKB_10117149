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
import com.akb.uts_10117149.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_detail_gallery.view.*

class RecyclerGallery (inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_detail_gallery, parent, false)) {

    fun bind(Picture: ModelGallery, pos: Int, listener: (Int) -> Unit) {
        super.itemView
        itemView.setTag(this)
        itemView.apply {
            namaPicture?.text = Picture.nama
            Picasso.get().load(Picture.image).into(picture)
            itemView.setOnClickListener {
            }
        }
    }
}