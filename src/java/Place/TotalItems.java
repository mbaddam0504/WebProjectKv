/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Place;

import java.util.ArrayList;

/**
 *
 * @author S519459
 */
public class TotalItems
{
    public static  ArrayList<Item> list;

    public ArrayList<Item> getList() {
        return list;
    }

    public void setList(ArrayList<Item> list) {
        this.list = list;
    }
    
public static ArrayList<Item> totalItems()
{
list=new ArrayList<>();
 list.add(new Item("images/slide1.jpg","Sports","basketball-1",50.0,10.0,"Spalding NBA Zi/O Excel Basketball" ,"Indoor/outdoor  composite leather basketball-Deep channel design for better dribble control-Foam backing under the full-ball pebbling for precise ball handling-Official NBA size and weight-Intermediate play size 28.5 inches",null));
 list.add(new Item("images/basketball.jpg","Sports","basketball-3",70.0,10.0,"Wilson Evolution Indoor Game Basketball Official" ,"Composite-Imported-Cushion Core Technology features low-density sponge and butyl rubber-High-definition pebble surface improves grip, feel, and performance-3-ply nylon thread winding; air tight butyl rubber valve-Thermal-molded rubber bladder",null));
list.add(new Item("images/slide2.JPG","Sports","basketball-2",30.0,3.5,"Spalding NBA Neverflat Indoor/Outdoor Basketball","Holds air 10 times longer than traditional basketballs-Provides consistent NBA Game Ball bounce height for at least one year-Redesigned valve with cap eliminates leaks and keeps dirt out-Advanced membrane and NitroFlate air technology virtually eliminates air&apos;s ability to escape-Made from high-performance composite leather, for soft, grippy feel",null));
 list.add(new Item("images/slide3.jpg","Sports","basketball-4",50.0,10.0,"Franklin Sports Night Lightning Basketball" ,"Extremely bright, glow in the dark rubber-Official size and weight, Pro width channels improve feel and performance-Rubber cover provides superior grip and ball handling-Polyester winding provides superior shape retention and bounce, long lasting air retention bladder-Official B7 size is 29.5, circumference, Recommended age 13-High school, college and pro",null));

 System.out.println(" total size "+list.size());
    System.out.println(list); 
 return list;
}
}
