package Okul;

public class Ogrenci
{
    public   String OgrenciNo;
    String ad;
    String soyad;
    int Sinif;
    int yas;
    static int numara;

    public Ogrenci(String ad, String soyad, String OgrenciNo, int Yas,int no,int sinif)
    {
        this.ad=ad;
        this.soyad=soyad;
        this.yas=Yas;
        numara++;
        this.OgrenciNo=OgrenciNo();
    }

    public int getYas() {
        return yas;
    }
    public String getAd()
    {
        return ad;
    }
    public String getSoyad()
    {
    return soyad;
    }
    public String getOgrenciNo()
    {
        return soyad;
    }
    public String AdSoyad()
    {
        return ad+" "+soyad;
    }
    public void setSinif(int sinif)
    {
        this.Sinif=sinif;
    }
    public  int getSinif()
    {
       return this.Sinif;
    }
    public String OgrenciNo()
    {
        return ad.substring(0,2).toUpperCase()+soyad.substring(soyad.length()-3,soyad.length()).toUpperCase()+numara;
    }

}
