package ex2;

import java.util.Date;

public class guitar {
    private  final String m_brand;

    public Date getD() {
        return d;
    }

    public void setD(Date d) {
        this.d = d;
    }

    private Date d ;
    private  int  numLines;
    private String  name ;
    public  guitar(String mBrand, String  name , int  nl )
    {
        this.d  = new Date();
        m_brand = mBrand;
        this.name = name;
        this.numLines = nl;
    }

    public guitar(String mBrand) {
        m_brand = mBrand;
    }
    public String getM_brand()
    {
        return this.m_brand;
    }
}
