package app.folder.example.dell.Speciality_March_Folder_2021.Product_Fragments_Animated.ProductC_Animated_Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import app.folder.example.dell.Speciality_March_Folder_2021.R
import com.squareup.picasso.Picasso

/**
 * A simple [Fragment] subclass.
 */
class ProductC_Fragment_page_Eight : Fragment() {
    var touch = 0
    var image_background: ImageView? = null
    var image: ImageView? = null
    var image1: ImageView? = null
    var image2: ImageView? = null
    var image3: ImageView? = null
    var image4: ImageView? = null
    var image5: ImageView? = null
    var image6: ImageView? = null
    var image8: ImageView? = null
    var image7: ImageView? = null
    var header_image: ImageView? = null
    var header_image1: ImageView? = null
    var header_image2: ImageView? = null
    var header_image3: ImageView? = null
    var header_image4: ImageView? = null
    var header_image5: ImageView? = null
    var header_image6: ImageView? = null
    var header_image7: ImageView? = null
    var header_image8: ImageView? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_c_fragment_page_8, container, false)
        image_background = view.findViewById<View>(R.id.bofalgan_page8_background) as ImageView
        header_image = view.findViewById<View>(R.id.bofalgan_page8_header) as ImageView
        header_image1 = view.findViewById<View>(R.id.bofalgan_page8_header1) as ImageView
        header_image2 = view.findViewById<View>(R.id.bofalgan_page8_header2) as ImageView
        header_image3 = view.findViewById<View>(R.id.bofalgan_page8_header3) as ImageView
        header_image4 = view.findViewById<View>(R.id.bofalgan_page8_header4) as ImageView
        header_image5 = view.findViewById<View>(R.id.bofalgan_page8_header5) as ImageView
        header_image6 = view.findViewById<View>(R.id.bofalgan_page8_header6) as ImageView
        header_image7 = view.findViewById<View>(R.id.bofalgan_page8_header7) as ImageView
        header_image8 = view.findViewById<View>(R.id.bofalgan_page8_header8) as ImageView
        image1 = view.findViewById<View>(R.id.bofalgan_page8_image1) as ImageView
        image2 = view.findViewById<View>(R.id.bofalgan_page8_image2) as ImageView
        image3 = view.findViewById<View>(R.id.bofalgan_page8_image3) as ImageView
        image4 = view.findViewById<View>(R.id.bofalgan_page8_image4) as ImageView
        val width = resources.configuration.screenWidthDp
        val metrics = DisplayMetrics()
        activity!!.windowManager.defaultDisplay.getMetrics(metrics)
        val yInches = metrics.heightPixels / metrics.ydpi
        val xInches = metrics.widthPixels / metrics.xdpi
        val diagonalInches = Math.sqrt((xInches * xInches + yInches * yInches).toDouble())
        val density = resources.displayMetrics.densityDpi
        when (density) {
            DisplayMetrics.DENSITY_LOW -> {
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-ldpi/bofalgan_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-ldpi/bofalgan_page2_header.png")
                    .into(header_image)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-ldpi/bofalgan_page2_header1.png")
                    .into(header_image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-ldpi/bofalgan_page2_header2.png")
                    .into(header_image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-ldpi/bofalgan_page2_header3.png")
                    .into(header_image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-ldpi/bofalgan_page2_header4.png")
                    .into(header_image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-ldpi/bofalgan_page2_header5.png")
                    .into(header_image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-ldpi/bofalgan_page2_header6.png")
                    .into(header_image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-ldpi/bofalgan_page2_header7.png")
                    .into(header_image7)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-ldpi/bofalgan_page2_header8.png")
                    .into(header_image8)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-ldpi/bofalgan_page8_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-ldpi/bofalgan_page8_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-ldpi/bofalgan_page8_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-ldpi/bofalgan_page8_image4.png")
                    .into(image4)
            }
            DisplayMetrics.DENSITY_MEDIUM -> {

                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-mdpi/bofalgan_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-mdpi/bofalgan_page2_header.png")
                    .into(header_image)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-mdpi/bofalgan_page2_header1.png")
                    .into(header_image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-mdpi/bofalgan_page2_header2.png")
                    .into(header_image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-mdpi/bofalgan_page2_header3.png")
                    .into(header_image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-mdpi/bofalgan_page2_header4.png")
                    .into(header_image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-mdpi/bofalgan_page2_header5.png")
                    .into(header_image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-mdpi/bofalgan_page2_header6.png")
                    .into(header_image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-mdpi/bofalgan_page2_header7.png")
                    .into(header_image7)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-mdpi/bofalgan_page2_header8.png")
                    .into(header_image8)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-mdpi/bofalgan_page8_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-mdpi/bofalgan_page8_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-mdpi/bofalgan_page8_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-mdpi/bofalgan_page8_image4.png")
                    .into(image4)
            }
            DisplayMetrics.DENSITY_HIGH -> {
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-hdpi/bofalgan_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-hdpi/bofalgan_page2_header.png")
                    .into(header_image)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-hdpi/bofalgan_page2_header1.png")
                    .into(header_image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-hdpi/bofalgan_page2_header2.png")
                    .into(header_image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-hdpi/bofalgan_page2_header3.png")
                    .into(header_image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-hdpi/bofalgan_page2_header4.png")
                    .into(header_image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-hdpi/bofalgan_page2_header5.png")
                    .into(header_image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-hdpi/bofalgan_page2_header6.png")
                    .into(header_image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-hdpi/bofalgan_page2_header7.png")
                    .into(header_image7)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-hdpi/bofalgan_page2_header8.png")
                    .into(header_image8)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-hdpi/bofalgan_page8_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-hdpi/bofalgan_page8_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-hdpi/bofalgan_page8_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-hdpi/bofalgan_page8_image4.png")
                    .into(image4)
            }
            DisplayMetrics.DENSITY_XHIGH -> {
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xhdpi/bofalgan_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xhdpi/bofalgan_page2_header.png")
                    .into(header_image)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xhdpi/bofalgan_page2_header1.png")
                    .into(header_image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xhdpi/bofalgan_page2_header2.png")
                    .into(header_image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xhdpi/bofalgan_page2_header3.png")
                    .into(header_image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xhdpi/bofalgan_page2_header4.png")
                    .into(header_image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xhdpi/bofalgan_page2_header5.png")
                    .into(header_image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xhdpi/bofalgan_page2_header6.png")
                    .into(header_image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xhdpi/bofalgan_page2_header7.png")
                    .into(header_image7)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xhdpi/bofalgan_page2_header8.png")
                    .into(header_image8)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xhdpi/bofalgan_page8_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xhdpi/bofalgan_page8_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xhdpi/bofalgan_page8_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xhdpi/bofalgan_page8_image4.png")
                    .into(image4)
            }
            DisplayMetrics.DENSITY_XXHIGH -> {
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxhdpi/bofalgan_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxhdpi/bofalgan_page2_header.png")
                    .into(header_image)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxhdpi/bofalgan_page2_header1.png")
                    .into(header_image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxhdpi/bofalgan_page2_header2.png")
                    .into(header_image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxhdpi/bofalgan_page2_header3.png")
                    .into(header_image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxhdpi/bofalgan_page2_header4.png")
                    .into(header_image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxhdpi/bofalgan_page2_header5.png")
                    .into(header_image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxhdpi/bofalgan_page2_header6.png")
                    .into(header_image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxhdpi/bofalgan_page2_header7.png")
                    .into(header_image7)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxhdpi/bofalgan_page2_header8.png")
                    .into(header_image8)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxhdpi/bofalgan_page8_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxhdpi/bofalgan_page8_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxhdpi/bofalgan_page8_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxhdpi/bofalgan_page8_image4.png")
                    .into(image4)
            }
            DisplayMetrics.DENSITY_XXXHIGH -> {
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxxhdpi/bofalgan_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxxhdpi/bofalgan_page2_header.png")
                    .into(header_image)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxxhdpi/bofalgan_page2_header1.png")
                    .into(header_image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxxhdpi/bofalgan_page2_header2.png")
                    .into(header_image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxxhdpi/bofalgan_page2_header3.png")
                    .into(header_image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxxhdpi/bofalgan_page2_header4.png")
                    .into(header_image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxxhdpi/bofalgan_page2_header5.png")
                    .into(header_image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxxhdpi/bofalgan_page2_header6.png")
                    .into(header_image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxxhdpi/bofalgan_page2_header7.png")
                    .into(header_image7)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxxhdpi/bofalgan_page2_header8.png")
                    .into(header_image8)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxxhdpi/bofalgan_page8_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxxhdpi/bofalgan_page8_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxxhdpi/bofalgan_page8_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxxhdpi/bofalgan_page8_image4.png")
                    .into(image4)
            }
        }
        val animation_header = AnimationUtils.loadAnimation(context, R.anim.fade_in)
        val animation_header1 = AnimationUtils.loadAnimation(context, R.anim.blink_quarter_sec)
        val animation_header2 = AnimationUtils.loadAnimation(context, R.anim.blink_quarter_sec)
        val animation_header3 =
            AnimationUtils.loadAnimation(context, R.anim.blink_thirtyfive_millisecond)
        val animation_header4 = AnimationUtils.loadAnimation(context, R.anim.blink_half_sec)
        val animation_header5 =
            AnimationUtils.loadAnimation(context, R.anim.blink_sixty_millisecond)
        val animation_header6 =
            AnimationUtils.loadAnimation(context, R.anim.blink_threefourth_second)
        val animation_header7 =
            AnimationUtils.loadAnimation(context, R.anim.blink_nineteen_millisecond)
        val animation_header8 = AnimationUtils.loadAnimation(context, R.anim.blink)
        val animation_image1 = AnimationUtils.loadAnimation(context, R.anim.fade_in)
        val animation_image2 = AnimationUtils.loadAnimation(context, R.anim.slide_down)
        val animation_image3 =
            AnimationUtils.loadAnimation(context, R.anim.slide_down_one_n_half_sec)
        val animation_image4 =
            AnimationUtils.loadAnimation(context, R.anim.slide_down_two_n_half_sec)
        // Animation animation_image5 = AnimationUtils.loadAnimation(getContext(),R.anim.zoom_in_two_sec);
        //   Animation animation_image6 = AnimationUtils.loadAnimation(getContext(),R.anim.move_from_right_one_n_half_second);
        header_image!!.startAnimation(animation_header)
        header_image1!!.startAnimation(animation_header1)
        header_image2!!.startAnimation(animation_header2)
        header_image3!!.startAnimation(animation_header3)
        header_image4!!.startAnimation(animation_header4)
        header_image5!!.startAnimation(animation_header5)
        header_image6!!.startAnimation(animation_header6)
        header_image7!!.startAnimation(animation_header7)
        header_image8!!.startAnimation(animation_header8)
        image1!!.startAnimation(animation_image1)
        image2!!.startAnimation(animation_image2)
        image3!!.startAnimation(animation_image3)
        image4!!.startAnimation(animation_image4)
        //  image5.startAnimation(animation_image5);
        //    image6.startAnimation(animation_image6);


/*

        image1.setVisibility(View.INVISIBLE);
        image2.setVisibility(View.INVISIBLE);
        image3.setVisibility(View.INVISIBLE);
        image4.setVisibility(View.INVISIBLE);
        image5.setVisibility(View.INVISIBLE);
        image6.setVisibility(View.INVISIBLE);



        view.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_UP) {
                    //do something
                    touch++;
                    if (touch == 1) {
                        Animation animation_image1 = AnimationUtils.loadAnimation(getContext(), R.anim.slide_down_half_sec);
                        image1.setVisibility(View.VISIBLE);
                        image1.startAnimation(animation_image1);

                    }
                    else if (touch == 2) {
                        Animation animation_image2 = AnimationUtils.loadAnimation(getContext(), R.anim.slide_down_half_sec);
                        image2.setVisibility(View.VISIBLE);
                        image2.startAnimation(animation_image2);
                    }
                    else if (touch == 3) {
                        Animation animation_image3 = AnimationUtils.loadAnimation(getContext(), R.anim.slide_down_half_sec);
                        image3.setVisibility(View.VISIBLE);
                        image3.startAnimation(animation_image3);

                    }
                    else if (touch == 4) {
                        Animation animation_image4 = AnimationUtils.loadAnimation(getContext(), R.anim.slide_down_half_sec);
                        image4.setVisibility(View.VISIBLE);
                        image4.startAnimation(animation_image4);
                    }
                    else if (touch == 5) {
                        Animation animation_image5 = AnimationUtils.loadAnimation(getContext(), R.anim.slide_down_half_sec);
                        image5.setVisibility(View.VISIBLE);
                        image5.startAnimation(animation_image5);
                    }
                    else if (touch == 6) {
                        Animation animation_image6 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in_one_sec);
                        image6.setVisibility(View.VISIBLE);
                        image6.startAnimation(animation_image6);

                    }

                }

                return true;
            }
        });
*/return view
    }
}