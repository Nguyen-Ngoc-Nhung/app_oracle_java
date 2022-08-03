/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author Admin
 */
public class User_POJO {
    String strName , strPass;
    String strTableSpace , strQuota;
    String last;
    String profile;

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }
    public String getStrName() {
        return strName;
    }

    public void setStrName(String strName) {
        this.strName = strName;
    }

    public String getStrPass() {
        return strPass;
    }

    public void setStrPass(String strPass) {
        this.strPass = strPass;
    }

    public String getStrTableSpace() {
        return strTableSpace;
    }

    public void setStrTableSpace(String strTableSpace) {
        this.strTableSpace = strTableSpace;
    }

    public String getStrQuota() {
        return strQuota;
    }

    public void setStrQuota(String strQuota) {
        this.strQuota = strQuota;
    }

    public User_POJO() {
    }

    public User_POJO(String strName, String strPass, String strTableSpace, String strQuota, String last,String pro) {
        this.strName = strName;
        this.strPass = strPass;
        this.strTableSpace = strTableSpace;
        this.strQuota = strQuota;
        this.last = last;
        this.profile=pro;
    }

    
    
}
