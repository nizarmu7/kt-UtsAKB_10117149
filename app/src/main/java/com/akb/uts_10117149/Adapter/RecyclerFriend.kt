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
import com.akb.uts_10117149.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_detail_friend.view.*

class RecyclerFriend (inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_detail_friend, parent, false)) {

    fun bind(friend: ModelFriend) {
        itemView.apply {
            txt_nama?.text = friend.nama
            txt_umur?.text = friend.umur
            Picasso.get().load(friend.image).into(img_teman)
        }
    }

}