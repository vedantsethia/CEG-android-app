package com.example.mahi.navigationd;

import java.util.ArrayList;

public class course_list {


    ArrayList<course>courses=new ArrayList<course>();
    String course_name[]={"Java","Python","Sql","hadoop","Machine Learning","Java","Python","Sql","hadoop","Machine Learning","Java","Python","Sql","hadoop","Machine Learning","Java","Python","Sql","hadoop","Machine Learning","Java","Python","Sql","hadoop","Machine Learning","Java","Python","Sql","hadoop","Machine Learning"};
    String imageUri[] = {
            "https://initiate.alphacoders.com/download/wallpaper/430916/images5/jpg/0430164150"
            ,"https://initiate.alphacoders.com/download/wallpaper/679140/images7/png/0430164150"
            ,"https://initiate.alphacoders.com/download/wallpaper/511052/images/jpg/0430164150",
            "https://initiate.alphacoders.com/download/wallpaper/665091/images/jpg/0430164150",
    "https://wallpapercave.com/download/programmer-wallpapers-wp1828995",//python:
    "https://wallpapercave.com/download/programmer-wallpapers-wp1828970",//c++:
    "https://i.ytimg.com/vi/B5IdoY2DjPs/maxresdefault.jpg",//oracle:
    "http://crbtech.in/Java-Training/images/java-powerful-language.jpg",//java:
            "https://cdn-images-1.medium.com/max/1024/1*3CXBOKNql4qS-lRyHT3pqw.png",//microsoft:
    "https://www.cisco.com/c/en_in/about/contacts/_jcr_content/Grid/about/layout-about/widenarrow/WN-Wide-1/hero_panel/image.img.jpg/1510662867940.jpg",//cisco:
    "https://www.cadservices.co.uk/images/autocad-2019-badge.png",//autocaed:
   "https://community-cdn-digitalocean-com.global.ssl.fastly.net/assets/tutorials/images/large/introduction-to-machine-learning_social.png?1510178550",//mal:
    "https://qph.fs.quoracdn.net/main-qimg-92b43fd727e5de99b560a0a331cd6a2b",//and:
    "https://i1.wp.com/freevideolectures.com/wp-content/uploads/2018/03/php-and-mysql.jpg?fit=1073%2C644&ssl=1",//php:
    "http://aadtraining.com/wp-content/uploads/2015/07/Big-Data-and-Hadoop-Administrator.jpg",//bidata:
    "https://1.bp.blogspot.com/-RNa-HGIc_2s/V4YZQqGWqHI/AAAAAAAABp8/ydsRYs0MjA4nd9h9-e4BneLYCGr70SAYACLcB/s1600/RS-CIT%2BOld%2BExam%2BQuestion%2BPapers%2B%2BPrevious%2BPaper%2BExam%2BNotes.jpg",//rscit:
    "https://timesofcloud.com/wp-content/uploads/2016/11/Screen-Shot-2016-11-26-at-4.11.03-pm.png",//cloud:
            "https://wallpapercave.com/download/programmer-wallpapers-wp1828995",//python:
            "https://wallpapercave.com/download/programmer-wallpapers-wp1828970",//c++:
            "https://i.ytimg.com/vi/B5IdoY2DjPs/maxresdefault.jpg",//oracle:
            "http://crbtech.in/Java-Training/images/java-powerful-language.jpg",//java:
            "http://stocknews.com/wp-content/uploads/2017/06/microsoft-msft-building.jpg",//microsoft:
            "https://www.cisco.com/c/en_in/about/contacts/_jcr_content/Grid/about/layout-about/widenarrow/WN-Wide-1/hero_panel/image.img.jpg/1510662867940.jpg",//cisco:
            "https://www.cadservices.co.uk/images/autocad-2019-badge.png",//autocaed:
            "https://cdn-images-1.medium.com/max/1024/1*3CXBOKNql4qS-lRyHT3pqw.png",//ml
            "https://qph.fs.quoracdn.net/main-qimg-92b43fd727e5de99b560a0a331cd6a2b",//and:
            "https://i1.wp.com/freevideolectures.com/wp-content/uploads/2018/03/php-and-mysql.jpg?fit=1073%2C644&ssl=1",//php:
            "http://aadtraining.com/wp-content/uploads/2015/07/Big-Data-and-Hadoop-Administrator.jpg",//bidata:
            "https://1.bp.blogspot.com/-RNa-HGIc_2s/V4YZQqGWqHI/AAAAAAAABp8/ydsRYs0MjA4nd9h9-e4BneLYCGr70SAYACLcB/s1600/RS-CIT%2BOld%2BExam%2BQuestion%2BPapers%2B%2BPrevious%2BPaper%2BExam%2BNotes.jpg"


};
    int []id={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
    int [] inc={R.string.android_include,R.string.ml_include,
            R.string.android_include,R.string.ml_include,
            R.string.android_include,R.string.ml_include,
            R.string.android_include,R.string.ml_include,
            R.string.android_include,R.string.ml_include,
            R.string.android_include,R.string.ml_include,
            R.string.android_include,R.string.ml_include,
            R.string.android_include,R.string.ml_include,
            R.string.android_include,R.string.ml_include,
            R.string.android_include,R.string.ml_include,
            R.string.android_include,R.string.ml_include,R.string.android_include,R.string.ml_include,
            R.string.android_include,R.string.ml_include,
            R.string.android_include,R.string.ml_include,
            R.string.android_include,R.string.ml_include

    };
    int [] des={R.string.android_description,R.string.ml_description,
            R.string.android_description,R.string.ml_description,
            R.string.android_description,R.string.ml_description,
            R.string.android_description,R.string.ml_description,
            R.string.android_description,R.string.ml_description,
            R.string.android_description,R.string.ml_description,
            R.string.android_description,R.string.ml_description,
            R.string.android_description,R.string.ml_description,
            R.string.android_description,R.string.ml_description,
            R.string.android_description,R.string.ml_description,
            R.string.android_description,R.string.ml_description,
            R.string.android_description,R.string.ml_description,
            R.string.android_description,R.string.ml_description


    };
    int [] about={R.string.about_android,R.string.about_ml,
            R.string.about_android,R.string.about_ml,
            R.string.about_android,R.string.about_ml,
            R.string.about_android,R.string.about_ml,
            R.string.about_android,R.string.about_ml,
            R.string.about_android,R.string.about_ml,
            R.string.about_android,R.string.about_ml,
            R.string.about_android,R.string.about_ml,
            R.string.about_android,R.string.about_ml,
            R.string.about_android,R.string.about_ml,
            R.string.about_android,R.string.about_ml,R.string.about_android,R.string.about_ml,
            R.string.about_android,R.string.about_ml,
            R.string.about_android,R.string.about_ml,R.string.about_android,R.string.about_ml



    };
    int [] what={R.string.android_what_i_learn,R.string.ml_what_i_learn,
            R.string.android_what_i_learn,R.string.ml_what_i_learn,
            R.string.android_what_i_learn,R.string.ml_what_i_learn,
            R.string.android_what_i_learn,R.string.ml_what_i_learn,
            R.string.android_what_i_learn,R.string.ml_what_i_learn,
            R.string.android_what_i_learn,R.string.ml_what_i_learn,
            R.string.android_what_i_learn,R.string.ml_what_i_learn,
            R.string.android_what_i_learn,R.string.ml_what_i_learn,R.string.android_what_i_learn,R.string.ml_what_i_learn,
            R.string.android_what_i_learn,R.string.ml_what_i_learn,
            R.string.android_what_i_learn,R.string.ml_what_i_learn,
            R.string.android_what_i_learn,R.string.ml_what_i_learn,
            R.string.android_what_i_learn,R.string.ml_what_i_learn,
            R.string.android_what_i_learn,R.string.ml_what_i_learn,
            R.string.android_what_i_learn,R.string.ml_what_i_learn

    };
    int [] prere={R.string.prerequesite_android,R.string.prerequesite_ml,
            R.string.prerequesite_android,R.string.prerequesite_ml,
            R.string.prerequesite_android,R.string.prerequesite_ml,
            R.string.prerequesite_android,R.string.prerequesite_ml,
            R.string.prerequesite_android,R.string.prerequesite_ml,
            R.string.prerequesite_android,R.string.prerequesite_ml,
            R.string.prerequesite_android,R.string.prerequesite_ml,
            R.string.prerequesite_android,R.string.prerequesite_ml,
            R.string.prerequesite_android,R.string.prerequesite_ml,
            R.string.prerequesite_android,R.string.prerequesite_ml,R.string.prerequesite_android,R.string.prerequesite_ml,
            R.string.prerequesite_android,R.string.prerequesite_ml,
            R.string.prerequesite_android,R.string.prerequesite_ml,
            R.string.prerequesite_android,R.string.prerequesite_ml,
            R.string.prerequesite_android,R.string.prerequesite_ml

    };
        public course_list()
        {
        for(int j=0;j<25;j++ ){
        courses.add(new course(course_name[j], id[j],imageUri[j],prere[j],what[j],inc[j],about[j],des[j]));
    }}

    course getcourse(int i)
    {
        return courses.get(i);
    }



}
