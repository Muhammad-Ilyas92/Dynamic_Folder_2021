package app.folder.example.dell.Speciality_March_Folder_2021.Product_Fragments_Animated.ProductB_Animated_Fragments

import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.MediaController
import android.widget.RelativeLayout
import android.widget.VideoView
import app.folder.example.dell.Speciality_March_Folder_2021.R

/**
 * A simple [Fragment] subclass.
 */
class ProductB_Fragment_page_One : Fragment() {
    var image1: ImageView? = null
    var image0: ImageView? = null
    var image2: ImageView? = null
    var image3: ImageView? = null
    var relativeLayout: RelativeLayout? = null
    var constraintLayout: ConstraintLayout? = null
    var videoView: VideoView? = null
    var videoView2: VideoView? = null
    var mediaController: MediaController? = null
    var videopath =
        "android.resource://app.folder.example.dell.Speciality_March_Folder_2021/" + R.raw.btig_title_video_june_2021

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_b_fragment_page_1, container, false)


        // image1 = (ImageView) view.findViewById(R.id.bunail_page1_background);
        constraintLayout = view.findViewById<View>(R.id.btig_page1) as ConstraintLayout
        videoView = view.findViewById<View>(R.id.btig_video) as VideoView
        videoView!!.setBackgroundColor(Color.TRANSPARENT)
        val uri = Uri.parse(videopath)
        videoView!!.setVideoURI(uri)
        videoView!!.requestFocus()
        videoView!!.setZOrderOnTop(true)
        videoView!!.start()
        videoView!!.setOnPreparedListener { mp -> mp.isLooping = true }
        return view
    }
}