package com.akb.uts_10117149.DetailFragment

/*
Tanggal Pengerjaan : Jum'at, 15 Mei 2020
Nim : 10117149
Nama : M Nizar Miftahul Ulya
Kelas : IF-4
 */

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.akb.uts_10117149.Adapter.AdapterDetailGallery
import com.akb.uts_10117149.Model.ModelGallery
import com.akb.uts_10117149.Adapter.RecyclerGallery
import com.akb.uts_10117149.DailyFragment
import com.akb.uts_10117149.R
import kotlinx.android.synthetic.main.fragment_detail_gallery.*
import kotlinx.android.synthetic.main.item_detail_gallery.*


/**
 * A simple [Fragment] subclass.
 */
class DetailGalleryFragment : Fragment() {

    private val item3 = listOf(
        ModelGallery("Ananda",R.drawable.ananda),
        ModelGallery("Ari",R.drawable.ari),
        ModelGallery("Dimas",R.drawable.dimas),
        ModelGallery("Farhaan",R.drawable.farhan),
        ModelGallery("Nizar",R.drawable.nizar7),
        ModelGallery("Miftahul",R.drawable.nizar)
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
        return inflater.inflate(R.layout.fragment_detail_gallery, container, false)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // RecyclerView node initialized here

        recycler_picture.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = GridLayoutManager(activity, 2)
            // set the custom adapter to the RecyclerView
            adapter = AdapterDetailGallery(item3){

            }
            //openGalleryForImage()
        }

    }


    companion object {
        fun newInstance(): DailyFragment = DailyFragment()
    }

}
