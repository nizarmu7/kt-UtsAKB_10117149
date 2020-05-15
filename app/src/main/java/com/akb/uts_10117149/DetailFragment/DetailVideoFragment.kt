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
import kr.co.prnd.YouTubePlayerView

import com.akb.uts_10117149.R

/**
 * A simple [Fragment] subclass.
 */
class DetailVideoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_video, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val youTubePlayerView =
            view?.findViewById<YouTubePlayerView>(R.id.you_tube_player_view)
        youTubePlayerView?.play(VIDEO_ID)

    }

    companion object {
        fun newInstance() = DetailVideoFragment()
        private const val VIDEO_ID = "Nt9L1jCKGnE"
    }

}
