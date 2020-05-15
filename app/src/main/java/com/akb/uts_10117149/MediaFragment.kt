package com.akb.uts_10117149

/*
Tanggal Pengerjaan : Sabtu, 09 Mei 2020
Nim : 10117149
Nama : M Nizar Miftahul Ulya
Kelas : IF-4
 */

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import com.akb.uts_10117149.DetailFragment.DetailGalleryFragment
import com.akb.uts_10117149.DetailFragment.DetailMusicFragment
import com.akb.uts_10117149.DetailFragment.DetailVideoFragment

class MediaFragment : Fragment() {

    internal lateinit var cvGallery : CardView
    internal lateinit var cvMusic : CardView
    internal lateinit var cvVideo : CardView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_media, container, false)
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }
    @Suppress("DEPRECATION")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        cvGallery = view.findViewById(R.id.cvDetailGallery)
        cvMusic = view.findViewById(R.id.cvDetailMusic)
        cvVideo = view.findViewById(R.id.cvDetailVideo)

        cvGallery.setOnClickListener(View.OnClickListener {
            val dailyFragment = DetailGalleryFragment()
            val fragmentManager = fragmentManager
            val fragmentTransaction = fragmentManager?.beginTransaction()
            fragmentTransaction!!.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_right, R.anim.enter_from_right, R.anim.exit_to_right)
            fragmentTransaction?.replace(
                R.id.container,
                dailyFragment,
                DetailGalleryFragment::class.java.getSimpleName()
            )
            fragmentTransaction?.addToBackStack(null)
            fragmentTransaction?.commit()
        })

        cvMusic.setOnClickListener(View.OnClickListener {
            val dailyFragment = DetailMusicFragment()
            val fragmentManager = fragmentManager
            val fragmentTransaction = fragmentManager?.beginTransaction()
            fragmentTransaction!!.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_right, R.anim.enter_from_right, R.anim.exit_to_right)
            fragmentTransaction?.replace(
                R.id.container,
                dailyFragment,
                DetailMusicFragment::class.java.getSimpleName()
            )
            fragmentTransaction?.addToBackStack(null)
            fragmentTransaction?.commit()
        })

        cvVideo.setOnClickListener(View.OnClickListener {
            val dailyFragment = DetailVideoFragment()
            val fragmentManager = fragmentManager
            val fragmentTransaction = fragmentManager?.beginTransaction()
            fragmentTransaction!!.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_right, R.anim.enter_from_right, R.anim.exit_to_right)
            fragmentTransaction?.replace(
                R.id.container,
                dailyFragment,
                DetailVideoFragment::class.java.getSimpleName()
            )
            fragmentTransaction?.addToBackStack(null)
            fragmentTransaction?.commit()
        })
    }
}