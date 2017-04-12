package com.sd.myFile;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;;
import java.io.Reader;
import java.io.File;

public class FileDemoMain{
  public static void main(String[] args) {
    File readme = null;
    InputStream isReadme = null;
    InputStreamReader isrReadme = null;
    BufferedReader brReadme = null;
    int i;
    char c;
    String str;
    StringBuffer sbuffer = new StringBuffer();
    
    try{
      File myhome = new File(System.getProperty("user.home"));
      System.out.println("myhome is " + myhome);
      
      String cwd=new File( "." ).getCanonicalPath();
      System.out.println("current working dir is " + cwd);
      
      readme = new File(cwd, "hello.txt");
      System.out.println("readme file is " + readme);
      
      isReadme = new FileInputStream(readme);
      System.out.println("Characters printed:");
      while((i=isReadme.read())!=-1){
        c = (char)i;
        System.out.print(c);
      }
    }catch(Exception e){
      e.printStackTrace();
    }finally{
      try{
      if(isReadme != null)
       isReadme.close();
      }catch(Exception e1){
        e1.printStackTrace();
      }
    }
    
    try{
      isReadme = new FileInputStream(readme);
      isrReadme = new InputStreamReader(isReadme,"euc-kr");
      brReadme = new BufferedReader(isrReadme);
      while((str=brReadme.readLine())!=null){
        System.out.println("--"+str);
      }
    }catch(Exception e){
      e.printStackTrace();
    }finally{
       try{
      if(brReadme != null)
       brReadme.close();
      }catch(Exception e1){
        e1.printStackTrace();
      }
    }
  }
}
   
