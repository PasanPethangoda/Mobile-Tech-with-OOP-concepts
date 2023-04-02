/**
 *
 * @author ASUS
 */
public class Phone {
    //create variables 
     private String pBrand;
     private String pName;
     private String pCategory;

     //constructor
    public Phone(String pBrand, String pName, String pCategory) {
     this.pBrand = pBrand;
     this.pName = pName;
     this.pCategory = pCategory;
    }
  
     // getters and setters
    public String getpBrand() {
        return pBrand;
    }

    public void setpBrand(String pBrand) {
        this.pBrand = pBrand;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpCategory() {
        return pCategory;
    }

    public void setpCategory(String pCategory) {
        this.pCategory = pCategory;
    }
     
     
    
}
