package com.example.mahi.navigationd;

public class course {
   private String course_name;
   private int id;
   private String uri;
   private int prere_id;
    private int what_id;
    private int inc_id;
    private int about_id;
    private int des_id;


   public course(String course_name,int img_id,String uri,int prere_id,int what_id,int inc_id,int about_id,int des_id)
   {
       this.course_name=course_name;
       this.id=img_id;
       this.uri=uri;
       this.prere_id=prere_id;
       this.what_id=what_id;
       this.inc_id=inc_id;
       this.about_id=about_id;
       this.inc_id=inc_id;
       this.des_id=des_id;
   }

   public String getCourse_name(){
       return course_name;
   }
   public int getImageid()
   {
       return id;
   }
   public String getUri()
   {
       return uri;
   }

   public int getPrere_id(){
       return prere_id;
   }
   public int getWhat_id()
   {
       return what_id;
   }
   public int getInc_id(){return inc_id;}
   public int getAbout_id(){return about_id;}
   public int getDes_id(){return des_id;}


}
