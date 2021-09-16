package app.folder.example.dell.Speciality_March_Folder_2021.Product_Fragments_Animated.ProductF_Animated_Fragments

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
class ProductF_Fragment_page_Four : Fragment() {
    var image_background: ImageView? = null
    var image_header1: ImageView? = null
    var image_header2: ImageView? = null
    var image1: ImageView? = null
    var image2: ImageView? = null
    var image3: ImageView? = null
    var image4: ImageView? = null
    var image5: ImageView? = null
    var image6: ImageView? = null
    var image7: ImageView? = null
    var image8: ImageView? = null
    var image9: ImageView? = null
    var image10: ImageView? = null
    var image11: ImageView? = null
    var image12: ImageView? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_f_fragment_page_4, container, false)
      /*  image_background = view.findViewById<View>(R.id.ticozid_page4_background) as ImageView
        image1 = view.findViewById<View>(R.id.ticozid_page4_image1) as ImageView
        image2 = view.findViewById<View>(R.id.ticozid_page4_image2) as ImageView
        image3 = view.findViewById<View>(R.id.ticozid_page4_image3) as ImageView
        image4 = view.findViewById<View>(R.id.ticozid_page4_image4) as ImageView
        image5 = view.findViewById<View>(R.id.ticozid_page4_image5) as ImageView
        image6 = view.findViewById<View>(R.id.ticozid_page4_image6) as ImageView*/
        //   image7 = (ImageView) view.findViewById(R.id.ticozid_page3_image7);
        //  image8 = (ImageView) view.findViewById(R.id.ticozid_page2_image8);
        //   image9 = (ImageView) view.findViewById(R.id.ticozid_page2_image9);


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
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-ldpi/ticozid_page2_background.png").into(image_background);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-ldpi/ticozid_page4_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-ldpi/ticozid_page4_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-ldpi/ticozid_page4_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-ldpi/ticozid_page4_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-ldpi/ticozid_page4_image5.png").into(image5);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-ldpi/ticozid_page4_image6.png").into(image6);
                //       Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-ldpi/ticozid_page3_image7.png").into(image7);
                //      Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-ldpi/ticozid_page2_image8.png").into(image8);
                //       Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-ldpi/ticozid_page2_image9.png").into(image9);

                break;

            case DisplayMetrics.DENSITY_MEDIUM:

                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-mdpi/ticozid_page2_background.png").into(image_background);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-mdpi/ticozid_page4_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-mdpi/ticozid_page4_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-mdpi/ticozid_page4_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-mdpi/ticozid_page4_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-mdpi/ticozid_page4_image5.png").into(image5);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-mdpi/ticozid_page4_image6.png").into(image6);
                //       Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-mdpi/ticozid_page3_image7.png").into(image7);
                //       Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-mdpi/ticozid_page2_image8.png").into(image8);
                //        Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-mdpi/ticozid_page2_image9.png").into(image9);

                break;

            case DisplayMetrics.DENSITY_HIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-hdpi/ticozid_page2_background.png").into(image_background);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-hdpi/ticozid_page4_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-hdpi/ticozid_page4_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-hdpi/ticozid_page4_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-hdpi/ticozid_page4_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-hdpi/ticozid_page4_image5.png").into(image5);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-hdpi/ticozid_page4_image6.png").into(image6);
                //        Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-hdpi/ticozid_page3_image7.png").into(image7);
                //       Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-hdpi/ticozid_page2_image8.png").into(image8);
                //        Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-hdpi/ticozid_page2_image9.png").into(image9);

                break;

            case DisplayMetrics.DENSITY_XHIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-xhdpi/ticozid_page2_background.png").into(image_background);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-xhdpi/ticozid_page4_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-xhdpi/ticozid_page4_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-xhdpi/ticozid_page4_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-xhdpi/ticozid_page4_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-xhdpi/ticozid_page4_image5.png").into(image5);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-xhdpi/ticozid_page4_image6.png").into(image6);
                //      Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-xhdpi/ticozid_page3_image7.png").into(image7);
                //       Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-xhdpi/ticozid_page2_image8.png").into(image8);
                //        Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-xhdpi/ticozid_page2_image9.png").into(image9);

                break;

            case DisplayMetrics.DENSITY_XXHIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-xxhdpi/ticozid_page2_background.png").into(image_background);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-xxhdpi/ticozid_page4_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-xxhdpi/ticozid_page4_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-xxhdpi/ticozid_page4_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-xxhdpi/ticozid_page4_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-xxhdpi/ticozid_page4_image5.png").into(image5);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-xxhdpi/ticozid_page4_image6.png").into(image6);
                //       Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-xxhdpi/ticozid_page3_image7.png").into(image7);
                //       Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-xxhdpi/ticozid_page2_image8.png").into(image8);
                //        Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-xxhdpi/ticozid_page2_image9.png").into(image9);

                break;

            case DisplayMetrics.DENSITY_XXXHIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-xxxhdpi/ticozid_page2_background.png").into(image_background);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-xxxhdpi/ticozid_page4_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-xxxhdpi/ticozid_page4_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-xxxhdpi/ticozid_page4_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-xxxhdpi/ticozid_page4_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-xxxhdpi/ticozid_page4_image5.png").into(image5);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-xxxhdpi/ticozid_page4_image6.png").into(image6);
                //        Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-xxxhdpi/ticozid_page3_image7.png").into(image7);
                //        Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-xxxhdpi/ticozid_page2_image8.png").into(image8);
                //         Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/ticozid/drawable-xxxhdpi/ticozid_page2_image9.png").into(image9);

                break;
        }

        */


        // Animation anim_background = AnimationUtils.loadAnimation(getContext(), R.anim.bounce);
        val animation_image1 = AnimationUtils.loadAnimation(context, R.anim.slide_down)
        val animation_image2 = AnimationUtils.loadAnimation(context, R.anim.fade_in_one_sec)
        val animation_image3 = AnimationUtils.loadAnimation(context, R.anim.fade_in_one_half_sec)
        val animation_image4 = AnimationUtils.loadAnimation(context, R.anim.zoom_in_one_sec)
        val animation_image5 = AnimationUtils.loadAnimation(context, R.anim.zoom_in_two_sec)
        val animation_image6 = AnimationUtils.loadAnimation(context, R.anim.zoom_in_three_sec)
        //    Animation animation_image7 = AnimationUtils.loadAnimation(getContext(), R.anim.blink_half_sec);
        //    Animation animation_image8 = AnimationUtils.loadAnimation(getContext(), R.anim.fade_in_two_n_half_sec);
        //   Animation animation_image9 = AnimationUtils.loadAnimation(getContext(), R.anim.fade_in_three_sec);


        // image_background.startAnimation(anim_background);
        image1!!.startAnimation(animation_image1)
        image2!!.startAnimation(animation_image2)
        image3!!.startAnimation(animation_image3)
        image4!!.startAnimation(animation_image4)
        image5!!.startAnimation(animation_image5)
        image6!!.startAnimation(animation_image6)
        //   image7.startAnimation(animation_image7);
        //  image8.startAnimation(animation_image8);
        //   image9.startAnimation(animation_image9);
        return view
    }
}