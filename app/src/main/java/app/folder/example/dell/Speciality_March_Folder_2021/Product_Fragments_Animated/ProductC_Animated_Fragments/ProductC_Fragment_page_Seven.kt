package app.folder.example.dell.Speciality_March_Folder_2021.Product_Fragments_Animated.ProductC_Animated_Fragments

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
class ProductC_Fragment_page_Seven : Fragment() {
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
        val view = inflater.inflate(R.layout.product_c_fragment_page_7, container, false)
   /*     image_background = view.findViewById<View>(R.id.zolrest_page7_background) as ImageView
        image1 = view.findViewById<View>(R.id.zolrest_page7_image1) as ImageView
        image2 = view.findViewById<View>(R.id.zolrest_page7_image2) as ImageView
        image3 = view.findViewById<View>(R.id.zolrest_page7_image3) as ImageView
        image4 = view.findViewById<View>(R.id.zolrest_page7_image4) as ImageView
        image5 = view.findViewById<View>(R.id.zolrest_page7_image5) as ImageView
        image6 = view.findViewById<View>(R.id.zolrest_page7_image6) as ImageView
        image7 = view.findViewById<View>(R.id.zolrest_page7_image7) as ImageView*/
        //    image8 = (ImageView) view.findViewById(R.id.zolrest_page3_image8);
        //    image9 = (ImageView) view.findViewById(R.id.zolrest_page3_image9);


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
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-ldpi/zolrest_page2_background.png").into(image_background);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-ldpi/zolrest_page7_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-ldpi/zolrest_page7_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-ldpi/zolrest_page7_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-ldpi/zolrest_page7_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-ldpi/zolrest_page7_image5.png").into(image5);
                 Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-ldpi/zolrest_page7_image6.png").into(image6);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-ldpi/zolrest_page7_image7.png").into(image7);
         //       Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-ldpi/zolrest_page3_image8.png").into(image8);
           //      Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-ldpi/zolrest_page3_image9.png").into(image9);

                break;

            case DisplayMetrics.DENSITY_MEDIUM:

                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                    Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-mdpi/zolrest_page2_background.png").into(image_background);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-mdpi/zolrest_page7_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-mdpi/zolrest_page7_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-mdpi/zolrest_page7_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-mdpi/zolrest_page7_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-mdpi/zolrest_page7_image5.png").into(image5);
                 Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-mdpi/zolrest_page7_image6.png").into(image6);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-mdpi/zolrest_page7_image7.png").into(image7);
          //      Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-mdpi/zolrest_page3_image8.png").into(image8);
          //       Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-mdpi/zolrest_page3_image9.png").into(image9);

                break;

            case DisplayMetrics.DENSITY_HIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                   Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-hdpi/zolrest_page2_background.png").into(image_background);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-hdpi/zolrest_page7_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-hdpi/zolrest_page7_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-hdpi/zolrest_page7_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-hdpi/zolrest_page7_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-hdpi/zolrest_page7_image5.png").into(image5);
                 Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-hdpi/zolrest_page7_image6.png").into(image6);
                 Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-hdpi/zolrest_page7_image7.png").into(image7);
         //       Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-hdpi/zolrest_page3_image8.png").into(image8);
         //        Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-hdpi/zolrest_page3_image9.png").into(image9);

                break;

            case DisplayMetrics.DENSITY_XHIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                  Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-xhdpi/zolrest_page2_background.png").into(image_background);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-xhdpi/zolrest_page7_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-xhdpi/zolrest_page7_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-xhdpi/zolrest_page7_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-xhdpi/zolrest_page7_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-xhdpi/zolrest_page7_image5.png").into(image5);
                 Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-xhdpi/zolrest_page7_image6.png").into(image6);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-xhdpi/zolrest_page7_image7.png").into(image7);
           //     Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-xhdpi/zolrest_page3_image8.png").into(image8);
           //      Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-xhdpi/zolrest_page3_image9.png").into(image9);

                break;

            case DisplayMetrics.DENSITY_XXHIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
          Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-xxhdpi/zolrest_page2_background.png").into(image_background);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-xxhdpi/zolrest_page7_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-xxhdpi/zolrest_page7_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-xxhdpi/zolrest_page7_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-xxhdpi/zolrest_page7_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-xxhdpi/zolrest_page7_image5.png").into(image5);
                 Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-xxhdpi/zolrest_page7_image6.png").into(image6);
                 Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-xxhdpi/zolrest_page7_image7.png").into(image7);
           //     Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-xxhdpi/zolrest_page3_image8.png").into(image8);
           //      Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-xxhdpi/zolrest_page3_image9.png").into(image9);

                break;

            case DisplayMetrics.DENSITY_XXXHIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
             Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-xxxhdpi/zolrest_page2_background.png").into(image_background);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-xxxhdpi/zolrest_page7_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-xxxhdpi/zolrest_page7_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-xxxhdpi/zolrest_page7_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-xxxhdpi/zolrest_page7_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-xxxhdpi/zolrest_page7_image5.png").into(image5);
                 Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-xxxhdpi/zolrest_page7_image6.png").into(image6);
                 Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-xxxhdpi/zolrest_page7_image7.png").into(image7);
          //      Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-xxxhdpi/zolrest_page3_image8.png").into(image8);
          //       Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/zolrest/drawable-xxxhdpi/zolrest_page3_image9.png").into(image9);

                break;
        }

        */

        // Animation anim_background = AnimationUtils.loadAnimation(getContext(), R.anim.bounce);
        val animation_image1 = AnimationUtils.loadAnimation(context, R.anim.bounce)
        val animation_image2 = AnimationUtils.loadAnimation(context, R.anim.slide_from_left_one_sec)
        val animation_image3 =
            AnimationUtils.loadAnimation(context, R.anim.slide_from_left_one_n_half_sec)
        val animation_image4 = AnimationUtils.loadAnimation(context, R.anim.slide_from_left_two_sec)
        val animation_image5 = AnimationUtils.loadAnimation(context, R.anim.fade_in_two_sec)
        val animation_image6 = AnimationUtils.loadAnimation(context, R.anim.zoom_in_two_sec)
        //    Animation animation_image7 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in_one_sec);
        //    Animation animation_image8 = AnimationUtils.loadAnimation(getContext(), R.anim.blink_one_n_half_sec);
        //    Animation animation_image9 = AnimationUtils.loadAnimation(getContext(), R.anim.fade_in_two_sec);

        // image_background.startAnimation(anim_background);
        image1!!.startAnimation(animation_image1)
        image2!!.startAnimation(animation_image2)
        image3!!.startAnimation(animation_image3)
        image4!!.startAnimation(animation_image4)
        image5!!.startAnimation(animation_image5)
        image6!!.startAnimation(animation_image6)
        //    image7.startAnimation(animation_image7);
        //     image8.startAnimation(animation_image8);
        //   image9.startAnimation(animation_image9);
        return view
    }
}