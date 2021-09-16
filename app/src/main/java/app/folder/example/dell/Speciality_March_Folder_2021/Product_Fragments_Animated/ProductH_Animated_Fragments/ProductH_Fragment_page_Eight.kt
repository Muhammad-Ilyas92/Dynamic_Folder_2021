package app.folder.example.dell.Speciality_March_Folder_2021.Product_Fragments_Animated.ProductH_Animated_Fragments

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
class ProductH_Fragment_page_Eight : Fragment() {
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
    var image0: ImageView? = null
    var image8: ImageView? = null
    var image9: ImageView? = null
    var image10: ImageView? = null
    var image11: ImageView? = null
    var img_shine: ImageView? = null
    var touch = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_h_fragment_page_8, container, false)
        image_background = view.findViewById<View>(R.id.penro_page8_background) as ImageView
        image_header1 = view.findViewById<View>(R.id.penro_page8_header) as ImageView
        image1 = view.findViewById<View>(R.id.penro_page8_image1) as ImageView
        image2 = view.findViewById<View>(R.id.penro_page8_image2) as ImageView
        image3 = view.findViewById<View>(R.id.penro_page8_image3) as ImageView


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
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-ldpi/penro_page2_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-ldpi/penro_page2_header.png").into(image_header1);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-ldpi/penro_page8_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-ldpi/penro_page8_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-ldpi/penro_page8_image3.png").into(image3);
            //    Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-ldpi/penro_page6_image4.png").into(image4);
            //    Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-ldpi/penro_page6_image5.png").into(image5);
            //    Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-ldpi/penro_page6_image6.png").into(image6);
             //   Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-ldpi/penro_page6_image7.png").into(image7);
             //   Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-ldpi/penro_page3_image8.png").into(image8);
             //   Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-ldpi/penro_page3_image9.png").into(image9);
            //    Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-ldpi/penro_page8_image10.png").into(image10);


                break;

            case DisplayMetrics.DENSITY_MEDIUM:

                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-mdpi/penro_page2_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-mdpi/penro_page2_header.png").into(image_header1);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-mdpi/penro_page8_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-mdpi/penro_page8_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-mdpi/penro_page8_image3.png").into(image3);
            //    Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-mdpi/penro_page6_image4.png").into(image4);
            //    Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-mdpi/penro_page6_image5.png").into(image5);
            //    Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-mdpi/penro_page6_image6.png").into(image6);
            //    Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-mdpi/penro_page6_image7.png").into(image7);
            //    Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-mdpi/penro_page3_image8.png").into(image8);
            //    Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-mdpi/penro_page3_image9.png").into(image9);
             //   Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-mdpi/penro_page8_image10.png").into(image10);


                break;

            case DisplayMetrics.DENSITY_HIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-hdpi/penro_page2_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-hdpi/penro_page2_header.png").into(image_header1);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-hdpi/penro_page8_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-hdpi/penro_page8_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-hdpi/penro_page8_image3.png").into(image3);
            //    Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-hdpi/penro_page6_image4.png").into(image4);
           //     Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-hdpi/penro_page6_image5.png").into(image5);
           //     Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-hdpi/penro_page6_image6.png").into(image6);
            //    Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-hdpi/penro_page6_image7.png").into(image7);
             //   Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-hdpi/penro_page3_image8.png").into(image8);
             //   Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-hdpi/penro_page3_image9.png").into(image9);
             //   Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-hdpi/penro_page8_image10.png").into(image10);


                break;

            case DisplayMetrics.DENSITY_XHIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-xhdpi/penro_page2_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-xhdpi/penro_page2_header.png").into(image_header1);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-xhdpi/penro_page8_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-xhdpi/penro_page8_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-xhdpi/penro_page8_image3.png").into(image3);
           //     Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-xhdpi/penro_page6_image4.png").into(image4);
          //      Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-xhdpi/penro_page6_image5.png").into(image5);
           //     Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-xhdpi/penro_page6_image6.png").into(image6);
           //     Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-xhdpi/penro_page6_image7.png").into(image7);
            //    Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-xhdpi/penro_page3_image8.png").into(image8);
            //    Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-xhdpi/penro_page3_image9.png").into(image9);
           //     Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-xhdpi/penro_page8_image10.png").into(image10);


                break;

            case DisplayMetrics.DENSITY_XXHIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-xxhdpi/penro_page2_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-xxhdpi/penro_page2_header.png").into(image_header1);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-xxhdpi/penro_page8_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-xxhdpi/penro_page8_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-xxhdpi/penro_page8_image3.png").into(image3);
          //      Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-xxhdpi/penro_page6_image4.png").into(image4);
          //      Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-xxhdpi/penro_page6_image5.png").into(image5);
          //      Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-xxhdpi/penro_page6_image6.png").into(image6);
           //     Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-xxhdpi/penro_page6_image7.png").into(image7);
            //    Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-xxhdpi/penro_page3_image8.png").into(image8);
            //    Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-xxhdpi/penro_page3_image9.png").into(image9);
            //    Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-xxhdpi/penro_page8_image10.png").into(image10);


                break;

            case DisplayMetrics.DENSITY_XXXHIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-xxxhdpi/penro_page2_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-xxxhdpi/penro_page2_header.png").into(image_header1);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-xxxhdpi/penro_page8_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-xxxhdpi/penro_page8_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-xxxhdpi/penro_page8_image3.png").into(image3);
        //        Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-xxxhdpi/penro_page6_image4.png").into(image4);
         //       Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-xxxhdpi/penro_page6_image5.png").into(image5);
         //       Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-xxxhdpi/penro_page6_image6.png").into(image6);
         //       Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-xxxhdpi/penro_page6_image7.png").into(image7);
           //     Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-xxxhdpi/penro_page3_image8.png").into(image8);
           //     Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-xxxhdpi/penro_page3_image9.png").into(image9);
            //    Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_March/penro/drawable-xxxhdpi/penro_page8_image10.png").into(image10);


                break;
        }

*/


        //   Animation animation_background = AnimationUtils.loadAnimation(getContext(),R.anim.blink);
        val animation_header = AnimationUtils.loadAnimation(context, R.anim.bounce)
        val animation_image1 = AnimationUtils.loadAnimation(context, R.anim.bounce)
        val animation_image2 = AnimationUtils.loadAnimation(context, R.anim.move_from_left_one_sec)
        val animation_image3 = AnimationUtils.loadAnimation(context, R.anim.blink_one_sec)

        //   Animation animation_image4 = AnimationUtils.loadAnimation(getContext(), R.anim.slide_down_one_n_half_sec);
        //   Animation animation_image5 = AnimationUtils.loadAnimation(getContext(), R.anim.slide_down_two_sec);
        //   Animation animation_image6 = AnimationUtils.loadAnimation(getContext(), R.anim.slide_down_two_n_half_sec);
        //    Animation animation_image7 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in_two_sec);
        //    Animation animation_image8 = AnimationUtils.loadAnimation(getContext(), R.anim.blink_one_n_half_sec);
        //   Animation animation_image9 = AnimationUtils.loadAnimation(getContext(), R.anim.move_from_left_one_n_half_sec);
        //   Animation animation_image10 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in_two_sec);


        //   image_background.startAnimation(animation_background);
        image_header1!!.startAnimation(animation_header)
        image1!!.startAnimation(animation_image1)
        image2!!.startAnimation(animation_image2)
        image3!!.startAnimation(animation_image3)
        //  image4.startAnimation(animation_image4);
        //   image5.startAnimation(animation_image5);
        //   image6.startAnimation(animation_image6);
        //  image7.startAnimation(animation_image7);
        //    image8.startAnimation(animation_image8);
        //    image9.startAnimation(animation_image9);
        //    image10.startAnimation(animation_image10);
        return view
    }
}