import javax.xml.bind.annotation.XmlElement;

public class Data {
	 private String Pname; 
	   private String Lkey;  
	   public Data(){} 
	    
	   public Data(String Pname, String Lkey){  
	    
	      this.Pname = Pname; 
	      this.Lkey = Lkey; 
	   }  
	  
	   
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

