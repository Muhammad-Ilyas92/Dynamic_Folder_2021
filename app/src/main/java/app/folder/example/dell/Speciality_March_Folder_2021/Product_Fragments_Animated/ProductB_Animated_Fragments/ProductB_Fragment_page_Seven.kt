package app.folder.example.dell.Speciality_March_Folder_2021.Product_Fragments_Animated.ProductB_Animated_Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import app.folder.example.dell.Speciality_March_Folder_2021.R

/**
 * A simple [Fragment] subclass.
 */
class ProductB_Fragment_page_Seven : Fragment() {
    var image0: ImageView? = null
    var image01: ImageView? = null
    var image1: ImageView? = null
    var image2: ImageView? = null
    var image3: ImageView? = null
    var image4: ImageView? = null
    var image5: ImageView? = null
    var image6: ImageView? = null
    var image7: ImageView? = null
    var image_header1: ImageView? = null
    var image_background: ImageView? = null
    var image_header2: ImageView? = null
    var image8: ImageView? = null
    var touch = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_b_fragment_page_7, container, false)
       /* image_background = view.findViewById<View>(R.id.btig_page7_background) as ImageView
        image_header1 = view.findViewById<View>(R.id.btig_page7_header) as ImageView
        image1 = view.findViewById<View>(R.id.btig_page7_image1) as ImageView
        image2 = view.findViewById<View>(R.id.btig_page7_image2) as ImageView
        image3 = view.findViewById<View>(R.id.btig_page7_image3) as ImageView
        image4 = view.findViewById<View>(R.id.btig_page7_image4) as ImageView
        image5 = view.findViewById<View>(R.id.btig_page7_image5) as ImageView
        image6 = view.findViewById<View>(R.id.btig_page7_image6) as ImageView
        image7 = view.findViewById<View>(R.id.btig_page7_image7) as ImageView*/


/*
        int width = getResources().getConfiguration().screenWidthDp;
        DisplayMetrics metrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(metrics);

        float yInches = metrics.heightPixels / metrics.ydpi;
        float xInches = metrics.widthPixels / metrics.xdpi;
        double diagonalInches = Math.sqrt(xInches * xInches + yInches * yInches);


        int density = getResources().getDisplayMetrics().densityDpi;
        // smaller device

        switch (density) {
            case DisplayMetrics.DENSITY_LOW:
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-ldpi/btig_page2_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-ldpi/btig_page2_header.png").into(image_header1);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-ldpi/btig_page7_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-ldpi/btig_page7_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-ldpi/btig_page7_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-ldpi/btig_page7_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-ldpi/btig_page7_image5.png").into(image5);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-ldpi/btig_page7_image6.png").into(image6);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-ldpi/btig_page7_image7.png").into(image7);

                break;

            case DisplayMetrics.DENSITY_MEDIUM:

                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-mdpi/btig_page2_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-mdpi/btig_page2_header.png").into(image_header1);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-mdpi/btig_page7_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-mdpi/btig_page7_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-mdpi/btig_page7_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-mdpi/btig_page7_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-mdpi/btig_page7_image5.png").into(image5);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-mdpi/btig_page7_image6.png").into(image6);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-mdpi/btig_page7_image7.png").into(image7);

                break;

            case DisplayMetrics.DENSITY_HIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-hdpi/btig_page2_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-hdpi/btig_page2_header.png").into(image_header1);


                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-hdpi/btig_page7_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-hdpi/btig_page7_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-hdpi/btig_page7_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-hdpi/btig_page7_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-hdpi/btig_page7_image5.png").into(image5);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-hdpi/btig_page7_image6.png").into(image6);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-hdpi/btig_page7_image7.png").into(image7);

                break;

            case DisplayMetrics.DENSITY_XHIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xhdpi/btig_page2_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xhdpi/btig_page2_header.png").into(image_header1);


                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xhdpi/btig_page7_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xhdpi/btig_page7_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xhdpi/btig_page7_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xhdpi/btig_page7_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xhdpi/btig_page7_image5.png").into(image5);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xhdpi/btig_page7_image6.png").into(image6);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xhdpi/btig_page7_image7.png").into(image7);

                break;

            case DisplayMetrics.DENSITY_XXHIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xxhdpi/btig_page2_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xxhdpi/btig_page2_header.png").into(image_header1);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xxhdpi/btig_page7_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xxhdpi/btig_page7_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xxhdpi/btig_page7_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xxhdpi/btig_page7_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xxhdpi/btig_page7_image5.png").into(image5);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xxhdpi/btig_page7_image6.png").into(image6);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xxhdpi/btig_page7_image7.png").into(image7);

                break;

            case DisplayMetrics.DENSITY_XXXHIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xxxhdpi/btig_page2_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xxxhdpi/btig_page2_header.png").into(image_header1);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xxxhdpi/btig_page7_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xxxhdpi/btig_page7_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xxxhdpi/btig_page7_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xxxhdpi/btig_page7_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xxxhdpi/btig_page7_image5.png").into(image5);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xxxhdpi/btig_page7_image6.png").into(image6);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xxxhdpi/btig_page7_image7.png").into(image7);

                break;
        }

*/

        // Animation anim_background = AnimationUtils.loadAnimation(getContext(), R.anim.bounce);
        val animation_header1 = AnimationUtils.loadAnimation(context, R.anim.fade_in_one_sec)


        // image_background.startAnimation(anim_background);
        image_header1!!.startAnimation(animation_header1)
        image1!!.visibility = View.INVISIBLE
        image2!!.visibility = View.INVISIBLE
        image3!!.visibility = View.INVISIBLE
        image4!!.visibility = View.INVISIBLE
        image5!!.visibility = View.INVISIBLE
        image6!!.visibility = View.INVISIBLE
        view.setOnTouchListener { v, event ->
            if (event.action == MotionEvent.ACTION_UP) {
                //do something
                touch++
                if (touch == 1) {
                    val animation_image1 =
                        AnimationUtils.loadAnimation(context, R.anim.slide_down_half_sec)
                    image1!!.visibility = View.VISIBLE
                    image1!!.startAnimation(animation_image1)
                } else if (touch == 2) {
                    val animation_image2 =
                        AnimationUtils.loadAnimation(context, R.anim.slide_down_half_sec)
                    image2!!.visibility = View.VISIBLE
                    image2!!.startAnimation(animation_image2)
                } else if (touch == 3) {
                    val animation_image3 =
                        AnimationUtils.loadAnimation(context, R.anim.slide_down_half_sec)
                    image3!!.visibility = View.VISIBLE
                    image3!!.startAnimation(animation_image3)
                } else if (touch == 4) {
                    val animation_image4 =
                        AnimationUtils.loadAnimation(context, R.anim.slide_down_half_sec)
                    image4!!.visibility = View.VISIBLE
                    image4!!.startAnimation(animation_image4)
                } else if (touch == 5) {
                    val animation_image5 =
                        AnimationUtils.loadAnimation(context, R.anim.zoom_in_one_sec)
                    image5!!.visibility = View.VISIBLE
                    image5!!.startAnimation(animation_image5)
                    val animation_image6 =
                        AnimationUtils.loadAnimation(context, R.anim.blink_one_sec)
                    image6!!.visibility = View.VISIBLE
                    image6!!.startAnimation(animation_image6)
                }
            }
            true
        }
        return view
    }
}