package com.akb.uts_10117149.DetailFragment

/*
Tanggal Pengerjaan : Kamis, 14 Mei 2020
Nim : 10117149
Nama : M Nizar Miftahul Ulya
Kelas : IF-4
 */

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.akb.uts_10117149.Adapter.AdapterDetailMusic
import com.akb.uts_10117149.Model.ModelMusic
import com.akb.uts_10117149.R
import kotlinx.android.synthetic.main.fragment_detail_music.*


/**
 * A simple [Fragment] subclass.
 */
class DetailMusicFragment : Fragment() {

    private val item = listOf(
        ModelMusic("death bed", "Powfu, beabadoobee", "#1", R.drawable.music2),
        ModelMusic("Pura Pura Lupa", "Mahen", "#2", R.drawable.music2),
        ModelMusic("Rindu Dalam Hati", "Arsy Widianto, Brisia Jodie", "#3", R.drawable.music2),
        ModelMusic("Yummy", "Justin Bieber", "#4", R.drawable.music2),
        ModelMusic("Kumau Dia", "Andmesh", "#5", R.drawable.music2),
        ModelMusic("Any Song", "ZICO", "#6", R.drawable.music2),
        ModelMusic("Nyaman", "Andmesh", "#7", R.drawable.music2),
        ModelMusic("Make You Mine", "Public", "#8", R.drawable.music2),
        ModelMusic("Awas Jatuh Cinta", "Armada", "#9", R.drawable.music2),
        ModelMusic("Memories", "Maroon 5", "#10", R.drawable.music2)
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
        return inflater.inflate(R.layout.fragment_detail_music, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // RecyclerView node initialized here
        recycler_music.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(activity)
            // set the custom adapter to the RecyclerView
            adapter = AdapterDetailMusic(item)
        }
    }

    companion object {
        fun newInstance(): DetailMusicFragment = DetailMusicFragment()
    }

}
