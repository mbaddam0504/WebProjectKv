/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Place;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author S519459
 */
public class Item implements Serializable {
    private String imagePath;
    private String category;
    private String subcategory;
    private double price;
     private double discount;
    private String shortDescription;
    private String longDescription;
    private ArrayList<String>  specifications;

    public Item(String imagePath,String category, String subcategory, double price, double discount, String shortDescription, String longDescription, ArrayList<String> specifications) {
        this.imagePath = imagePath;
        this.category = category;
        this.subcategory = subcategory;
        this.price = price;
        this.discount = discount;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.specifications = specifications;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

   
    

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

  

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public ArrayList<String> getSpecifications() {
        return specifications;
    }

    public void setSpecifications(ArrayList<String> specifications) {
        this.specifications = specifications;
    }

    @Override
    public String toString() {
        return  imagePath + "QWER" + category + "QWER" + subcategory + "QWER" + price + "QWER" + discount + "QWER" + shortDescription + "QWER" + longDescription + "QWER" + specifications + '}';
    }


   
    
}
