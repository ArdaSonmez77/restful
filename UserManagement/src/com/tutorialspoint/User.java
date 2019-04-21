package com.tutorialspoint;

import java.io.Serializable;  
import javax.xml.bind.annotation.XmlElement; 
import javax.xml.bind.annotation.XmlRootElement;  

public class User implements Serializable {  
   private static final long serialVersionUID = 1L; 

   private String Pname; 
   private String Lkey;  
   public User(){} 
    

   
   public String getPname() { 
      return Pname; 
   } 

   public void setPname(String Pname) { 
      this.Pname = Pname; 
   } 
   public String getLkey() { 
      return Lkey; 
   } 
  
   public void setLkey(String Lkey) { 
      this.Lkey = Lkey; 
   }   
} 