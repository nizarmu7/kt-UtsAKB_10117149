package com.akb.uts_10117149.DetailFragment

/*
Tanggal Pengerjaan : Selasa, 12 Mei 2020
Nim : 10117149
Nama : M Nizar Miftahul Ulya
Kelas : IF-4
 */

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.akb.uts_10117149.R
import androidx.recyclerview.widget.LinearLayoutManager
import com.akb.uts_10117149.Model.ModelFriend
import com.akb.uts_10117149.Adapter.AdapterDetailFriend
import com.akb.uts_10117149.DailyFragment
import kotlinx.android.synthetic.main.fragment_detail_friend.*

/**
 * A simple [Fragment] subclass.
 */
class DetailFriendFragment : Fragment() {

    private val item2 = listOf(
        ModelFriend("Ananda Marwanaya P", "20 Tahun",  R.drawable.ananda),
        ModelFriend("Ari Sumardi", "20 Tahun",  R.drawable.ari),
        ModelFriend("Dimas Arestu P", "20 Tahun",  R.drawable.dimas),
        ModelFriend("Muhammad Farhaan", "20 Tahun",  R.drawable.farhan)
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
        return inflater.inflate(R.layout.fragment_detail_friend, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // RecyclerView node initialized here

        recycler_friend.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL ,false)
            // set the custom adapter to the RecyclerView
            adapter = AdapterDetailFriend(item2)
        }

    }

    companion object {
        fun newInstance(): DailyFragment = DailyFragment()
    }

}
