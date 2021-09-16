package app.folder.example.dell.Speciality_March_Folder_2021.Product_Fragments_Animated.ProductA_Animated_Fragments

import android.media.Image
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import app.folder.example.dell.Speciality_March_Folder_2021.R

/**
 * A simple [Fragment] subclass.
 */
class ProductA_Fragment_page_Three : Fragment() {
    var image_header1: ImageView? = null
    var image_header2: ImageView? = null
    var image_background_header: ImageView? = null
    var header1: ImageView? = null
    var header2: ImageView? = null
    var image_background: ImageView? = null
    var image1: ImageView? = null
    var image2: ImageView? = null
    var image3: ImageView? = null
    var image4: ImageView? = null
    var image5: ImageView? = null
    var image6: ImageView? = null
    var image8: ImageView? = null
    var image7: ImageView? = null
    var image9: ImageView? = null
    var image10: ImageView? = null
    var image11: ImageView? = null
    var image12: ImageView? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_a_fragment_page_3, container, false)


        image_background = view.findViewById<View>(R.id.qbal_page3_background) as ImageView
        image_header1 = view.findViewById<View>(R.id.qbal_page3_header1) as ImageView
        image_header2 = view.findViewById<View>(R.id.qbal_page3_header2) as ImageView
        image1 = view.findViewById<View>(R.id.qbal_page3_image1) as ImageView
        image2 = view.findViewById<View>(R.id.qbal_page3_image2) as ImageView
        image3 = view.findViewById<View>(R.id.qbal_page3_image3) as ImageView
        image4 = view.findViewById<View>(R.id.qbal_page3_image4) as ImageView
       // image5 = view.findViewById<View>(R.id.qbal_page2_image5) as ImageView
       // image6 = view.findViewById<View>(R.id.qbal_page2_image6) as ImageView


/*
        val width = resources.configuration.screenWidthDp
        val metrics = DisplayMetrics()
        activity!!.windowManager.defaultDisplay.getMetrics(metrics)
        val yInches = metrics.heightPixels / metrics.ydpi
        val xInches = metrics.widthPixels / metrics.xdpi
        val diagonalInches = Math.sqrt((xInches * xInches + yInches * yInches).toDouble())
        val density = resources.displayMetrics.densityDpi
        when (density) {
            DisplayMetrics.DENSITY_LOW -> Toast.makeText(activity, " ", Toast.LENGTH_LONG).show()
            DisplayMetrics.DENSITY_MEDIUM -> Toast.makeText(activity, " ", Toast.LENGTH_LONG)
                .show()
            DisplayMetrics.DENSITY_HIGH -> Toast.makeText(activity, " ", Toast.LENGTH_LONG)
                .show()
            DisplayMetrics.DENSITY_XHIGH -> {
                Toast.makeText(activity, "xhdpi", Toast.LENGTH_LONG).show()
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xhdpi/tanzo_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xhdpi/tanzo_page2_header1.png")
                    .into(image_header1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xhdpi/tanzo_page2_header2.png")
                    .into(image_header2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xhdpi/tanzo_page2_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xhdpi/tanzo_page2_image2.png")
                    .into(image2)
            }
            DisplayMetrics.DENSITY_XXHIGH -> Toast.makeText(activity, "xxhdpi", Toast.LENGTH_LONG)
                .show()
            DisplayMetrics.DENSITY_XXXHIGH -> Toast.makeText(activity, "xxxhdpi", Toast.LENGTH_LONG)
                .show()
        }
        */


        val animation_header1 = AnimationUtils.loadAnimation(context, R.anim.fade_in)
        val animation_header2 = AnimationUtils.loadAnimation(context, R.anim.rotate)

        val animation_image1 = AnimationUtils.loadAnimation(context, R.anim.fade_in)
        val animation_image2 = AnimationUtils.loadAnimation(context, R.anim.rotate_one_sec)
        val animation_image3 = AnimationUtils.loadAnimation(context, R.anim.fade_in_two_sec)
        val animation_image4 = AnimationUtils.loadAnimation(context, R.anim.move_up_two_second)
     //   val animation_image5 = AnimationUtils.loadAnimation(context, R.anim.blink_two_sec)
     //   val animation_image6 = AnimationUtils.loadAnimation(context, R.anim.move_up_two_second)

        image_header1!!.startAnimation(animation_header1)
        image_header2!!.startAnimation(animation_header2)

        image1!!.startAnimation(animation_image1)
        image2!!.startAnimation(animation_image2)
        image3!!.startAnimation(animation_image3)
        image4!!.startAnimation(animation_image4)

     //   image5!!.startAnimation(animation_image5)
     //   image6!!.startAnimation(animation_image6)


        return view
    }
}