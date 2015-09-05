/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webusage;

import static jdk.nashorn.internal.objects.NativeString.indexOf;

/**
 *
 * @author Robert
 */
public class WebAccess {
    private int UserID;
    private String site;
    private int bytes;
    
    public WebAccess(int uid, String si,int by){UserID=uid; site=si; bytes=by;};
    
    public int getUserID(){return UserID;}
    
    public String getSite(){return site;}
    
    public int getBytes(){return bytes;}
    
    public String toString()
    { //int pos=indexOf(site,".");
    String newSite=site.substring(0,site.indexOf("."));
    return newSite+"    "+getUserID()+"   "+Integer.toString(bytes);  
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }
    
}
