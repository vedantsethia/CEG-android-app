package com.example.mahi.navigationd;

public class partner {
    String img_uri;
    int text_id;

    public partner(String img_uri,int text_id){
        this.img_uri=img_uri;
        this.text_id=text_id;
    }
   String getImg_uri(){
        return img_uri;
    }
    int getText_id(){
        return text_id;
    }

}
