package com.example.dss;

public class AppData {

    public String data;
    public String id;
    public String pass;
    public String comment;

    public AppData()
    {
        this.data = "";
        this.id = "";
        this.pass = "";
        this.comment = "";
    }

    public String getData() {
        return data;
    }
    public void setData(String id, String pass, String comment)
    {
        StringBuffer tempData =new StringBuffer(this.data);
        tempData.append("ID: " + id + "\nPassword: " + pass + "\nComment: " + comment + "\n");
        this.data = tempData.toString();
    }

    public void setId(String id)
    {
        this.id = id;
    }
    public void setPass(String pass)
    {
        this.pass = pass;
    }
    public void setComment(String comment)
    {
        this.comment = comment;
    }

    public String getId()
    {
        return id;
    }
    public String getPass()
    {
        return pass;
    }
    public String getComment()
    {
        return getComment();
    }
}
