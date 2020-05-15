package com.akb.uts_10117149

/*
Tanggal Pengerjaan : Sabtu, 09 Mei 2020
Nim : 10117149
Nama : M Nizar Miftahul Ulya
Kelas : IF-4
 */

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import com.akb.uts_10117149.DetailFragment.DetailDailyFragment
import com.akb.uts_10117149.DetailFragment.DetailFriendFragment


class DailyFragment : Fragment() {

    internal lateinit var cvDaily : CardView
    internal lateinit var cvFriend : CardView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_daily, container, false)
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    @Suppress("DEPRECATION")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        cvDaily = view.findViewById(R.id.cvDetailDaily)
        cvFriend = view.findViewById(R.id.cvDetailFriend)

        cvDaily.setOnClickListener(View.OnClickListener {
            val dailyFragment = DetailDailyFragment()
            val fragmentManager = fragmentManager
            val fragmentTransaction = fragmentManager?.beginTransaction()
            fragmentTransaction!!.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_right, R.anim.enter_from_right, R.anim.exit_to_right)
            fragmentTransaction?.replace(
                R.id.container,
                dailyFragment,
                DetailDailyFragment::class.java.getSimpleName()
            )
            fragmentTransaction?.addToBackStack(null)
            fragmentTransaction?.commit()
        })

        cvFriend.setOnClickListener(View.OnClickListener {
            val dailyFragment = DetailFriendFragment()
            val fragmentManager = fragmentManager
            val fragmentTransaction = fragmentManager?.beginTransaction()
            fragmentTransaction!!.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_right, R.anim.enter_from_right, R.anim.exit_to_right)
            fragmentTransaction?.replace(
                R.id.container,
                dailyFragment,
                DetailFriendFragment::class.java.getSimpleName()
            )
            fragmentTransaction?.addToBackStack(null)
            fragmentTransaction?.commit()
        })
    }
}
