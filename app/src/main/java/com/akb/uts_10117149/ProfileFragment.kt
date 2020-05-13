package com.akb.uts_10117149

/*
Tanggal Pengerjaan : Rabu, 13 Mei 2020
Nim : 10117149
Nama : M Nizar Miftahul Ulya
Kelas : IF-4
 */

import android.app.Dialog
import android.content.ActivityNotFoundException
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import de.hdodenhof.circleimageview.CircleImageView

/**
 * A simple [Fragment] subclass.
 */
class ProfileFragment : Fragment() {

    internal lateinit var mDialog : Dialog
    internal lateinit var view : View
    internal lateinit var IG : ConstraintLayout
    internal lateinit var Telephone : ConstraintLayout
    internal lateinit var Maps : ConstraintLayout
    internal lateinit var About : ConstraintLayout

    fun ProfileFragment(){
        // Required empty public constructor
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_profile, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mDialog = activity?.let { Dialog(it) }!!
        IG = view.findViewById(R.id.constraintIG)
        Telephone = view.findViewById(R.id.constraintContact)
        Maps = view.findViewById(R.id.constraintFind)
        About = view.findViewById(R.id.About)

        Telephone.setOnClickListener(View.OnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:089514522850")
            startActivity(intent)
        })

        Maps.setOnClickListener(View.OnClickListener {
            val uri = Uri.parse("https://goo.gl/maps/mEegti27eMU6Qduf8")
            val likeIng = Intent(Intent.ACTION_VIEW, uri)

            likeIng.setPackage("com.google.android.apps.maps")

            try {
                startActivity(likeIng)
            } catch (e: ActivityNotFoundException) {
                startActivity(Intent(Intent.ACTION_VIEW,
                    Uri.parse(
                        ""+uri
                    )))
            }
        })

        IG.setOnClickListener(View.OnClickListener {
            val uri = Uri.parse("https://www.instagram.com/nizar_miftahul/")
            val likeIng = Intent(Intent.ACTION_VIEW, uri)

            likeIng.setPackage("com.instagram.android")

            try {
                startActivity(likeIng)
            } catch (e:ActivityNotFoundException) {
                startActivity(Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.instagram.com/nizar_miftahul/")))
            }
        })

        About.setOnClickListener(View.OnClickListener {
            val btnClose: CircleImageView

            mDialog.setContentView(R.layout.item_about)
            btnClose = mDialog.findViewById(R.id.btnCloseDialog)
            btnClose.setOnClickListener(View.OnClickListener { mDialog.dismiss() })
            mDialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            mDialog.show()
        })
    }

    companion object {
        fun newInstance(): DailyFragment = DailyFragment()
    }

}
