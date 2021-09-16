package app.folder.example.dell.Speciality_March_Folder_2021.Product_Fragments_Animated.ProductI_Animated_Fragments

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
class ProductI_Fragment_page_Three : Fragment() {
    var image_background: ImageView? = null
    var image1: ImageView? = null
    var image2: ImageView? = null
    var image3: ImageView? = null
    var image4: ImageView? = null
    var image5: ImageView? = null
    var image6: ImageView? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_i_fragment_page_3, container, false)
     //   image_background = view.findViewById<View>(R.id.vinjec_page3_background) as ImageView
        //image_header1 = (ImageView) view.findViewById(R.id.vinjec_page2_header);
    //    image1 = view.findViewById<View>(R.id.vinjec_page3_image1) as ImageView
   //     image2 = view.findViewById<View>(R.id.vinjec_page3_image2) as ImageView
   //     image3 = view.findViewById<View>(R.id.vinjec_page3_image3) as ImageView
   //     image4 = view.findViewById<View>(R.id.vinjec_page3_image4) as ImageView
   //     image5 = view.findViewById<View>(R.id.vinjec_page3_image5) as ImageView
  //      image6 = view.findViewById<View>(R.id.vinjec_page3_image6) as ImageView


        /*  int width = getResources().getConfiguration().screenWidthDp;
        DisplayMetrics metrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(metrics);

        float yInches = metrics.heightPixels / metrics.ydpi;
        float xInches = metrics.widthPixels / metrics.xdpi;
        double diagonalInches = Math.sqrt(xInches * xInches + yInches * yInches);


        int density = getResources().getDisplayMetrics().densityDpi;
        // smaller device

        switch (density) {
            case DisplayMetrics.DENSITY_LOW:
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-ldpi/vinjec_page2_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-ldpi/vinjec_page2_header.png").into(image_header1);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-ldpi/vinjec_page3_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-ldpi/vinjec_page3_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-ldpi/vinjec_page3_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-ldpi/vinjec_page3_image4.png").into(image4);
            //   Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-ldpi/vinjec_page2_image5.png").into(image5);
            //    Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-ldpi/vinjec_page2_image6.png").into(image6);
             //   Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-ldpi/vinjec_page2_image7.png").into(image7);
             //   Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-ldpi/vinjec_page2_image8.png").into(image8);
             //   Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-ldpi/vinjec_page2_image9.png").into(image9);
             //   Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-ldpi/vinjec_page2_image10.png").into(image10);

                break;

            case DisplayMetrics.DENSITY_MEDIUM:

                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-mdpi/vinjec_page2_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-mdpi/vinjec_page2_header.png").into(image_header1);


                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-mdpi/vinjec_page3_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-mdpi/vinjec_page3_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-mdpi/vinjec_page3_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-mdpi/vinjec_page3_image4.png").into(image4);
             //   Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-mdpi/vinjec_page2_image5.png").into(image5);
           //     Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-mdpi/vinjec_page2_image6.png").into(image6);
            //    Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-mdpi/vinjec_page2_image7.png").into(image7);
            //    Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-mdpi/vinjec_page2_image8.png").into(image8);
            //    Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-mdpi/vinjec_page2_image9.png").into(image9);
            //    Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-mdpi/vinjec_page2_image10.png").into(image10);

                break;

            case DisplayMetrics.DENSITY_HIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-hdpi/vinjec_page2_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-hdpi/vinjec_page2_header.png").into(image_header1);


                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-hdpi/vinjec_page3_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-hdpi/vinjec_page3_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-hdpi/vinjec_page3_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-hdpi/vinjec_page3_image4.png").into(image4);
           //     Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-hdpi/vinjec_page2_image5.png").into(image5);
           //     Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-hdpi/vinjec_page2_image6.png").into(image6);
            //    Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-hdpi/vinjec_page2_image7.png").into(image7);
            //    Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-hdpi/vinjec_page2_image8.png").into(image8);
            //    Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-hdpi/vinjec_page2_image9.png").into(image9);
            //    Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-hdpi/vinjec_page2_image10.png").into(image10);

                break;

            case DisplayMetrics.DENSITY_XHIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-xhdpi/vinjec_page2_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-xhdpi/vinjec_page2_header.png").into(image_header1);


                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-xhdpi/vinjec_page3_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-xhdpi/vinjec_page3_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-xhdpi/vinjec_page3_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-xhdpi/vinjec_page3_image4.png").into(image4);
            //    Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-xhdpi/vinjec_page2_image5.png").into(image5);
            //    Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-xhdpi/vinjec_page2_image6.png").into(image6);
            //    Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-xhdpi/vinjec_page2_image7.png").into(image7);
            //    Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-xhdpi/vinjec_page2_image8.png").into(image8);
            //    Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-xhdpi/vinjec_page2_image9.png").into(image9);
             //   Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-xhdpi/vinjec_page2_image10.png").into(image10);

                break;

            case DisplayMetrics.DENSITY_XXHIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-xxhdpi/vinjec_page2_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-xxhdpi/vinjec_page2_header.png").into(image_header1);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-xxhdpi/vinjec_page3_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-xxhdpi/vinjec_page3_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-xxhdpi/vinjec_page3_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-xxhdpi/vinjec_page3_image4.png").into(image4);
            //    Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-xxhdpi/vinjec_page2_image5.png").into(image5);
             //   Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-xxhdpi/vinjec_page2_image6.png").into(image6);
             //   Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-xxhdpi/vinjec_page2_image7.png").into(image7);
            //    Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-xxhdpi/vinjec_page2_image8.png").into(image8);
            //    Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-xxhdpi/vinjec_page2_image9.png").into(image9);
            //    Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-xxhdpi/vinjec_page2_image10.png").into(image10);


                break;

            case DisplayMetrics.DENSITY_XXXHIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-xxxhdpi/vinjec_page2_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-xxxhdpi/vinjec_page2_header.png").into(image_header1);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-xxxhdpi/vinjec_page3_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-xxxhdpi/vinjec_page3_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-xxxhdpi/vinjec_page3_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-xxxhdpi/vinjec_page3_image4.png").into(image4);
            //    Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-xxxhdpi/vinjec_page2_image5.png").into(image5);
            //    Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-xxxhdpi/vinjec_page2_image6.png").into(image6);
            //    Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-xxxhdpi/vinjec_page2_image7.png").into(image7);
            //    Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-xxxhdpi/vinjec_page2_image8.png").into(image8);
            //    Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-xxxhdpi/vinjec_page2_image9.png").into(image9);
            //    Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_December/vinjec/drawable-xxxhdpi/vinjec_page2_image10.png").into(image10);

                break;
        }*/
        val animation_background = AnimationUtils.loadAnimation(context, R.anim.blink)
        // Animation animation_header1 = AnimationUtils.loadAnimation(getContext(), R.anim.blink_half_sec);
        val animation_image1 = AnimationUtils.loadAnimation(context, R.anim.move_from_left_half_sec)
        val animation_image2 = AnimationUtils.loadAnimation(context, R.anim.fade_in_one_sec)
        val animation_image3 = AnimationUtils.loadAnimation(context, R.anim.fade_in_one_half_sec)
        val animation_image4 = AnimationUtils.loadAnimation(context, R.anim.fade_in_two_sec)
        val animation_image5 = AnimationUtils.loadAnimation(context, R.anim.fade_in_three_sec)
        val animation_image6 = AnimationUtils.loadAnimation(context, R.anim.move_up_two_second)


//        image_background.startAnimation(animation_background);
        //image_header1.startAnimation(animation_header1);
        image1!!.startAnimation(animation_image1)
        image2!!.startAnimation(animation_image2)
        image3!!.startAnimation(animation_image3)
        image4!!.startAnimation(animation_image4)
        image5!!.startAnimation(animation_image5)
        image6!!.startAnimation(animation_image6)
        return view
    }
}