package com.company;

import java.util.ArrayList;
import java.util.Collections;


public class Main {

    public static void main(String[] args) {


        ikiliBosluk(toBinary(9));

    }
    public static void ikiliBosluk(ArrayList<Integer> rakamlar)
    {   // iki tane 1 arasında kalan sıfırların sayılarını bir araya toplamak için   bu diziyi oluşturdum
        ArrayList<Integer> birlerarasıuzaklık=new ArrayList<>();
        int ikiliBos;
        int baslangic;
       for(int i=0;i<rakamlar.size();i++)
       {
           // iilk 1 i tutup sonraki  basamakları tarayıp başka  bir var mı diye kontrol ettim
           if(rakamlar.get(i)==1)
           {
              // başka bir varsa bunu tutum ve indexlerini birbirinden çıkardım ayriyeten -1 demem gerekti
               for(int j=i+1;j<rakamlar.size();j++)
               {
                   if (rakamlar.get(j)==1)
                   {
                       ikiliBos=j-i-1;
                       System.out.println(ikiliBos);
                       // her iki bir arasındaki  sıfırların sayısını diziye attım
                       birlerarasıuzaklık.add(ikiliBos);
                       break;
                   }
               }
           }
       }
       // diziyi sıralayıp son elemanı  aldım
       Collections.sort(birlerarasıuzaklık);
       // ve yazdırdım 
       System.out.println(" uzak ikili: "+birlerarasıuzaklık.get(birlerarasıuzaklık.size()-1));
    }
    public static ArrayList<Integer>  toBinary(int num)
    {
        ArrayList<Integer> numbers=new ArrayList<>();
        int bölüm;
        int kalan;
       while(true)
       {
           bölüm=num/2;
           kalan=num%2;
           // burda numbers listesine  kalanı ve en son  bölümü attım
           if(bölüm<2)
           {
               numbers.add(kalan);
               numbers.add(bölüm);
               System.out.println(reverseOrder(numbers));
               return reverseOrder(numbers);
           }else {

               numbers.add(kalan);
               num = bölüm;
           }
       }
    }
    // bu metotda da numbers  diziisni tersten ten yazdrdım çünkü yukarıda kalan sayılar 2 lik sistemde yazılışın tersi şeklinde atılıyordu
    public static ArrayList<Integer> reverseOrder(ArrayList<Integer> rakamlar)
    {
        ArrayList<Integer> rakams=new ArrayList<>();
        for(int i=rakamlar.size()-1;i>=0 ; i--)
        {
            rakams.add(rakamlar.get(i));
        }
        return rakams;
    }
}
