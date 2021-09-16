package app.folder.example.dell.Speciality_March_Folder_2021.Common

import app.folder.example.dell.Speciality_March_Folder_2021.Remote.RetrofitClient.getClient
import app.folder.example.dell.Speciality_March_Folder_2021.Remote.IMyApi
import app.folder.example.dell.Speciality_March_Folder_2021.Remote.RetrofitClient
import app.folder.example.dell.Speciality_March_Folder_2021.Common.Common

object Common {
    //public static final String BASE_URL = "http://tabadlaekhyal.com/myapi3/";
    const val BASE_URL = "http://work.boschpharmaceutical.com/working/healthcare/"

    /*http://bosch.boschmedicus.com/working/login.php*/
    @JvmStatic
    val aPI: IMyApi
        get() = getClient(BASE_URL)!!.create(IMyApi::class.java)
}