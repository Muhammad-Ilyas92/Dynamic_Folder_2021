package app.folder.example.dell.Speciality_March_Folder_2021.Product_Fragments_Animated.ProductB_Animated_Fragments

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
class ProductB_Fragment_page_Five : Fragment() {
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
        val view = inflater.inflate(R.layout.product_b_fragment_page_5, container, false)

       /* image_background = view.findViewById<View>(R.id.btig_page5_background) as ImageView
        image_header1 = view.findViewById<View>(R.id.btig_page5_header) as ImageView
        image1 = view.findViewById<View>(R.id.btig_page5_image1) as ImageView
        image2 = view.findViewById<View>(R.id.btig_page5_image2) as ImageView
        image3 = view.findViewById<View>(R.id.btig_page5_image3) as ImageView
        image4 = view.findViewById<View>(R.id.btig_page5_image4) as ImageView
        image5 = view.findViewById<View>(R.id.btig_page5_image5) as ImageView
        image6 = view.findViewById<View>(R.id.btig_page5_image6) as ImageView
        image7 = view.findViewById<View>(R.id.btig_page5_image7) as ImageView
        image8 = view.findViewById<View>(R.id.btig_page5_image8) as ImageView
*/

/*        int width = getResources().getConfiguration().screenWidthDp;
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

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-ldpi/btig_page5_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-ldpi/btig_page5_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-ldpi/btig_page5_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-ldpi/btig_page5_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-ldpi/btig_page5_image5.png").into(image5);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-ldpi/btig_page5_image6.png").into(image6);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-ldpi/btig_page5_image7.png").into(image7);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-ldpi/btig_page5_image8.png").into(image8);

                break;

            case DisplayMetrics.DENSITY_MEDIUM:

                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-mdpi/btig_page2_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-mdpi/btig_page2_header.png").into(image_header1);


                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-mdpi/btig_page5_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-mdpi/btig_page5_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-mdpi/btig_page5_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-mdpi/btig_page5_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-mdpi/btig_page5_image5.png").into(image5);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-mdpi/btig_page5_image6.png").into(image6);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-mdpi/btig_page5_image7.png").into(image7);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-mdpi/btig_page5_image8.png").into(image8);

                break;

            case DisplayMetrics.DENSITY_HIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-hdpi/btig_page2_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-hdpi/btig_page2_header.png").into(image_header1);


                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-hdpi/btig_page5_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-hdpi/btig_page5_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-hdpi/btig_page5_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-hdpi/btig_page5_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-hdpi/btig_page5_image5.png").into(image5);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-hdpi/btig_page5_image6.png").into(image6);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-hdpi/btig_page5_image7.png").into(image7);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-hdpi/btig_page5_image8.png").into(image8);

                break;

            case DisplayMetrics.DENSITY_XHIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xhdpi/btig_page2_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xhdpi/btig_page2_header.png").into(image_header1);


                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xhdpi/btig_page5_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xhdpi/btig_page5_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xhdpi/btig_page5_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xhdpi/btig_page5_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xhdpi/btig_page5_image5.png").into(image5);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xhdpi/btig_page5_image6.png").into(image6);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xhdpi/btig_page5_image7.png").into(image7);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xhdpi/btig_page5_image8.png").into(image8);

                break;

            case DisplayMetrics.DENSITY_XXHIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xxhdpi/btig_page2_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xxhdpi/btig_page2_header.png").into(image_header1);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xxhdpi/btig_page5_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xxhdpi/btig_page5_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xxhdpi/btig_page5_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xxhdpi/btig_page5_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xxhdpi/btig_page5_image5.png").into(image5);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xxhdpi/btig_page5_image6.png").into(image6);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xxhdpi/btig_page5_image7.png").into(image7);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xxhdpi/btig_page5_image8.png").into(image8);


                break;

            case DisplayMetrics.DENSITY_XXXHIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xxxhdpi/btig_page2_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xxxhdpi/btig_page2_header.png").into(image_header1);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xxxhdpi/btig_page5_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xxxhdpi/btig_page5_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xxxhdpi/btig_page5_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xxxhdpi/btig_page5_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xxxhdpi/btig_page5_image5.png").into(image5);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xxxhdpi/btig_page5_image6.png").into(image6);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xxxhdpi/btig_page5_image7.png").into(image7);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_May/btig/drawable-xxxhdpi/btig_page5_image8.png").into(image8);


                break;
        }*/


        // Animation anim_background = AnimationUtils.loadAnimation(getContext(), R.anim.bounce);
        val animation_header1 = AnimationUtils.loadAnimation(context, R.anim.fade_in_one_sec)
        val animation_image1 = AnimationUtils.loadAnimation(context, R.anim.blink)
        val animation_image2 = AnimationUtils.loadAnimation(context, R.anim.fade_in_one_sec)
        val animation_image3 = AnimationUtils.loadAnimation(context, R.anim.slide_down_one_secnd)
        val animation_image4 =
            AnimationUtils.loadAnimation(context, R.anim.slide_down_one_n_half_sec)
        val animation_image5 = AnimationUtils.loadAnimation(context, R.anim.slide_down_two_sec)
        val animation_image6 =
            AnimationUtils.loadAnimation(context, R.anim.slide_down_two_n_half_sec)
        val animation_image7 =
            AnimationUtils.loadAnimation(context, R.anim.move_up_one_n_half_second)
        val animation_image8 = AnimationUtils.loadAnimation(context, R.anim.move_up_two_second)


        // image_background.startAnimation(anim_background);
        image_header1!!.startAnimation(animation_header1)
        image1!!.startAnimation(animation_image1)
        image2!!.startAnimation(animation_image2)
        image3!!.startAnimation(animation_image3)
        image4!!.startAnimation(animation_image4)
        image5!!.startAnimation(animation_image5)
        image6!!.startAnimation(animation_image6)
        image7!!.startAnimation(animation_image7)
        image8!!.startAnimation(animation_image8)
        return view
    }
}