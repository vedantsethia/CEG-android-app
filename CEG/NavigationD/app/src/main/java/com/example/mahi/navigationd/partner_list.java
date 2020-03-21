package com.example.mahi.navigationd;

import java.util.ArrayList;

public class partner_list {
    ArrayList<partner> partners=new ArrayList<partner>();
    //String course_name[]={"Java","Python","Sql","hadoop","Machine Learning"};
    String imageUri[] = {"https://wallpapercave.com/download/red-hat-wallpaper-bvAmagH"
            ,"https://images.techhive.com/images/article/2015/08/microsoft-logo-redwest-a-100611028-large.jpeg",
            "https://www.cisco.com/c/en_in/about/contacts/_jcr_content/Grid/about/layout-about/widenarrow/WN-Wide-1/hero_panel/image.img.jpg/1510662867940.jpg",
            "https://i.ytimg.com/vi/B5IdoY2DjPs/maxresdefault.jpg",
            "https://www.cisco.com/c/en_in/about/contacts/_jcr_content/Grid/about/layout-about/widenarrow/WN-Wide-1/hero_panel/image.img.jpg/1510662867940.jpg"
    };
    int []id={1,2,3,4,5};

    public partner_list()
    {
        for(int j=0;j<imageUri.length;j++ ){
            partners.add(new partner(imageUri[j],R.string.about_course_cpp1));

        }}

    partner getpartner(int i)
    {
        return partners.get(i);
    }
}
