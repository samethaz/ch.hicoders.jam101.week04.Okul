import Okul.Ogrenci;
import corejava.compare.AgeSorter;
import javax.print.DocFlavor;
import java.util.*;
import java.util.Collection;
import java.util.Scanner;
public class Main
{
    public static ArrayList<Ogrenci> Liste = new ArrayList();  //ogrenciler Araylistte satatic olarak tutuluyor
    public static void main(String[] args)
    {
        Kayit();  // kayıtlar alınıyor
        Atama();  //araylist yaşa göre sıralanıp daha sonra sınıflara atama yapılıyor
        Listele();  //kayıtlar listeleniyor
    }
    public static void  Kayit()
    {
        Scanner girdi= new Scanner(System.in);
        System.out.println("10 Kayıt için isim ve telefon giriniz");
        for (int i = 0; i < 10; i++) //10 Adet bilgi almak için for döngüsü
        {
            System.out.print(i + 1 + ". kişinin ismini girin:");
            String isim =  girdi.nextLine();
            System.out.print(i + 1 + ". kişinin Soyadı girin:");
            String Soyad =   girdi.nextLine();
            System.out.print(i + 1 + ". kişinin Yaşını girin:");
            int Yas=Integer.parseInt(girdi.nextLine());
            Ogrenci ogr1=new Ogrenci(isim,Soyad,"",Yas,i,-1);
            Liste.add(i,ogr1);
        }

    }
    public  static void Atama()
    {
        Collections.sort(Liste, new AgeSorter()); // Array list yasa göre sıralanır
        int sinif=0;
        for(int i =0;i<Liste.size();i++)
        {   sinif++;
            Liste.get(i).setSinif(sinif);
            Liste.get(i+1).setSinif(sinif);   // Yasa göre sınıflara atama yapılır
            i++;
        }
    }
    public static void  Listele()
    {
        for(Ogrenci ogrenci:Liste)
        {
        System.out.println(ogrenci.AdSoyad()+"   "+ogrenci.getYas()+"   "+ogrenci.OgrenciNo+" "+ogrenci.getSinif()+" sınıf");
        }
    }

}
