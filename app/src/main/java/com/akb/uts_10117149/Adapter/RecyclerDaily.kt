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
import com.akb.uts_10117149.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_detail_daily.view.*

class RecyclerDaily (inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_detail_daily, parent, false)) {

    fun bind(jadwal: ModelDaily) {
        itemView.apply {
            txt_title_daily?.text = jadwal.title
            txt_desc_daily?.text = jadwal.desc
            txt_waktu_daily?.text = jadwal.waktu
            Picasso.get().load(jadwal.image).into(img_daily)
        }
    }

}