package com.example.android.metro.Utilities;

import com.example.android.metro.models.ReplaceStation;
import com.example.android.metro.models.Station;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HP on 9/30/2018.
 */

public class LinesUtilities {
  private static List<Station> line1= new ArrayList<>();

    private static List<Station> line2= new ArrayList<>();

    private static List<Station> line3= new ArrayList<>();
    private static List<Station> allStations = new ArrayList<>();

    // all station without Repetition
    private static List<Station> stationsSet = new ArrayList<>();

    private static String[] allnamesOfStations;









    private static void addStationsLine1(){

        line1.add(new Station("Helwan ",1,"محطه مترو حلوان",30.031610,31.237169));
        line1.add(new Station( "Ain Helwan ",1,"محطه مترو عين حلوان",29.867810,31.315620));

        line1.add(new Station("Helwan univesity ",1,"محطه مترو جامعه حلوان",30.031610,31.237169));
        line1.add(new Station("Wady Houf ",1,"محطه مترو وادي حوف",29.879220,31.313461));
        line1.add(new Station("Hadaaq Helwan ",1,"محطه مترو حدائق حلوان",29.897389,31.303951));
        line1.add(new Station("El maasra ",1,"محطه مترو المعصره",29.906103,31.299513));
        line1.add(new Station("Tra ElAsmant ",1,"محطه مترو ترا الاسمنت",29.926170,31.287534));
        line1.add(new Station("Kotaska ",1,"محطه مترو كوتسكا",29.936360, 31.281396));
        line1.add(new Station("Tra ",1,"محطه مترو ترا",29.946959,31.272965));
        line1.add(new Station("Thkanat El Maady ",1,"محطه مترو ثكنات المعادي",29.953308,31.262912));
        line1.add(new Station("El maaady ",1,"محطه مترو العادي",29.960663,31.257634));
        line1.add(new Station("hadaaq El Maaady ",1,"محطه مترو حدائق المعادي",29.969814,31.250931));
        line1.add(new Station("Dar El Slam ",1,"محطه مترو دار السلام",29.982184,31.242069));
        line1.add(new Station("El Zhraa ",1,"محطه مترو الزهراء",29.995624, 31.231128));
        line1.add(new Station("Mar Gerges ",1,"محطه مترو مارجرجس",30.006137,31.229437));
        line1.add(new Station("El Malek El Saleh ",1,"محطه مترو الملك الصالح"));
        line1.add(new Station("El Saiada ",1,"محطه مترو السيده زينب",30.029243,31.235424));
        line1.add(new Station("Saad ",1,"محطه مترو سعد زغلول",30.036999, 31.238342));
        line1.add(new ReplaceStation("Sadat ",1,2,"محطه مترو السادات",30.044708,31.234501));
        line1.add(new Station("Gamal ",1,"محطه مترو جمال عبد الناصر",30.053410, 31.238782));
        line1.add(new Station("Oraby ",1,"محطه مترو احمد عرابي",30.057124,31.242376));
        line1.add(new ReplaceStation("Shohada ",1,2,"محطه مترو الشهداء",30.061275,31.246013));
        line1.add(new Station("Ghamra ",1,"محطه مترو غمره",30.069158,31.264607));
        line1.add(new Station("Demerdash ",1,"محطه مترو الدمرداش",30.077403,31.277814));
        line1.add(new Station("Manshih El Sadr ",1,"محطه مترو منشيه الصدر",30.082110,31.287492));
        line1.add(new Station("Kobry el qoba ",1,"محطه مترو كويري القبه", 30.087262, 31.294144 ));
        line1.add(new Station("Hamamat El qoba ",1,"محطه مترو حمامات القبه", 30.091216, 31.298929 ));
        line1.add(new Station("Sraya El qoba ",1,"محطه مترو سراي القبه", 30.097658, 31.304508 ));
        line1.add(new Station("Hadaaq El Zaton ",1,"محطه مترو حدائق الزيتون", 30.106179, 31.310355 ));
        line1.add(new Station("Helmea ",1,"محطه مترو حلميه الزيتون", 30.113189, 31.313922 ));
        line1.add(new Station("Mataria ",1,"محطه مترو المطريه", 30.121040, 31.313675 ));
        line1.add(new Station("Ain Shams ",1,"محطه مترو عين شمس", 30.131220, 31.318954 ));
        line1.add(new Station("Azbh El Nakhl ",1,"محطه مترو عزبه النخل", 30.139487, 31.324447 ));
        line1.add(new Station("Marg ",1,"محطه مترو المرج", 30.152337, 31.335594 ));
        line1.add(new Station("The new Marg ",1,"محطه مترو المرج الجديده", 30.163704, 31.338407 ));

    }

          private  static void addStationsLine2(){
     line2.add(new Station("Monib",2,"محطه مترو المنيب", 29.981074, 31.212333 ));
        line2.add(new Station("Saqeh Meki",2,"محطه مترو سقيه مكي", 29.995561, 31.208575 ));
        line2.add(new Station("Doahhi el Giza",2,"محطه مترو ضواحي الجيزه", 30.005466, 31.207856 ));
        line2.add(new Station("Giza",2,"محطه مترو جيزه",  30.010651, 31.207095  ));
        line2.add(new Station("Fassel",2,"محطه مترو فيصل", 30.017442, 31.203747 ));
        line2.add(new Station("Cairo Unversity",2,"محطه مترو جامعه القاهره", 30.025986, 31.201099 ));
              line2.add(new Station("behoth",2,"محطه مترو البحوث", 30.035943, 31.200176 ));
        line2.add(new Station("Dokki",2,"محطه مترو الدقي", 30.038597, 31.212217 ));

        line2.add(new Station("opera",2,"محطه مترو الاويرا", 30.041857, 31.225049 ));
        line2.add(new ReplaceStation("Sadat",2,1,"محطه مترو السادات"));
        line2.add(new Station("Nagib",2,"محطه مترو محمد نجيب", 30.045368, 31.244125 ));
        line2.add(new ReplaceStation("Attaba",2,3,"محطه مترو العتبه", 30.052491, 31.246807 ));
        line2.add(new ReplaceStation("Shohadda",2,1,"محطه مترو الشهداء"));
        line2.add(new Station("Masarh",2,"محطه مترو مسره", 30.070985, 31.245102 ));
        line2.add(new Station("Rod El Farag",2,"محطه مترو روض الفرج", 30.080687, 31.245413 ));
        line2.add(new Station("Santa Traza",2,"محطه مترو سانتا تريزا", 30.087975, 31.245510 ));
        line2.add(new Station("El khalafawy",2,"محطه مترو الخلفاوي", 30.097917, 31.244995 ));
        line2.add(new Station("Mazallat",2,"محطه مترو مظلات", 30.104049, 31.245537 ));
        line2.add(new Station("Kolayt El Zraaah",2,"محطه مترو كليه الزراعه", 30.113766, 31.248760 ));
        line2.add(new Station("Shobra El Khama",2,"محطه مترو شبرا الخيمه", 30.122378, 31.244662 ));




    }

    private  static void addStationsLine3() {
        Station station;
         line3.add(new Station("Ahram",3,"محطه مترو الاهرام", 30.091584, 31.326518 ));

        line3.add(new Station("Kolayt El Banat",3,"محطه مترو كليه البنات", 30.084498, 31.329107 ));

        line3.add(new Station("Stad",3,"محطه الاستاد", 30.073503, 31.317975 ));
        line3.add(new Station("Maared",3,"محطه امترو المعرض", 30.073133, 31.300630 ));
        line3.add(new Station("Abasia",3,"محطه مترو العباسيه", 30.072360, 31.283689 ));
        line3.add(new Station("AbdoBasha",3,"محطه مترو عبدو باشا", 30.064988, 31.274773 ));
        line3.add(new Station("El Gesh",3,"محطه مترو الجيش", 30.061859, 31.266834 ));
        line3.add(new Station("Bab El Shearia",3,"محطه مترو باب الشعريه", 30.054002, 31.255998 ));
        line3.add(new ReplaceStation("Attaba",3,2,"محطه مترو العتبه"));
    }
    private static void addAll(){
        allStations.add(new Station("Helwan ",1));
        allStations.add(new Station( "Ain Helwan ",1));

        allStations.add(new Station("Helwan univesity ",1));
        allStations.add(new Station("Wady Houf ",1));
        allStations.add(new Station("Hadaaq Helwan ",1));
        allStations.add(new Station("El maasra ",1));
        allStations.add(new Station("Tra ElAsmant ",1));
        allStations.add(new Station("Kotaska ",1));
        allStations.add(new Station("Tra ",1));
        allStations.add(new Station("Thkanat El Maady ",1));
        allStations.add(new Station("El maaady ",1));
        allStations.add(new Station("hadaaq El Maaady ",1));
        allStations.add(new Station("Dar El Slam ",1));
        allStations.add(new Station("El Zhraa ",1));
        allStations.add(new Station("Mar Gerges ",1));
        allStations.add(new Station("El Malek El Saleh ",1));
        allStations.add(new Station("El Saiada ",1));
        allStations.add(new Station("Saad ",1));
        allStations.add(new ReplaceStation("Sadat ",1,2));//18
        allStations.add(new Station("Gamal ",1));
        allStations.add(new Station("Oraby ",1));
        allStations.add(new ReplaceStation("Shohada ",1,2));//21
        allStations.add(new Station("Ghamra ",1));
        allStations.add(new Station("Demerdash ",1));
        allStations.add(new Station("Manshih El Sadr ",1));
        allStations.add(new Station("Kobry el qoba ",1));
        allStations.add(new Station("Hamamat El qoba ",1));
        allStations.add(new Station("Sraya El qoba ",1));
        allStations.add(new Station("Hadaaq El Zaton ",1));
        allStations.add(new Station("Helmea ",1));
        allStations.add(new Station("Mataria ",1));
        allStations.add(new Station("Ain Shams ",1));
        allStations.add(new Station("Azbh El Nakhl ",1));
        allStations.add(new Station("Marg ",1));
        allStations.add(new Station("The new Marg ",1));

        allStations.add(new Station("Saqeh Meki",2));  //35
        allStations.add(new Station("Doahhi el Giza",2));
        allStations.add(new Station("Giza",2));
        allStations.add(new Station("Fassel",2));
        allStations.add(new Station("Cairo Unversity",2));
        allStations.add(new Station("behoth",2));
        allStations.add(new Station("Dokki",2));
        allStations.add(new Station("opera",2));
        allStations.add(new ReplaceStation("Sadat",2,1));//43
        allStations.add(new Station("Nagib",2));
        allStations.add(new ReplaceStation("Attaba",2,3));  //45
        allStations.add(new ReplaceStation("Shohadda",2,1)); //46
        allStations.add(new Station("Massara",2));
        allStations.add(new Station("Rod El Farag",2));
        allStations.add(new Station("Santa Traza",2));
        allStations.add(new Station("El khalafawy",2));
        allStations.add(new Station("Mazallat",2));
        allStations.add(new Station("Kolayt El Zraaah",2));
        allStations.add(new Station("Shobra El Khama",2));

        allStations.add(new Station("Ahram",3));//54
        allStations.add(new Station("Kolayt El Banat",3));
        allStations.add(new Station("Stad",3));
        allStations.add(new Station("Maared",3));
        allStations.add(new Station("Abasia",3));
        allStations.add(new Station("AbdoBasha",3));
        allStations.add(new Station("El Gesh",3));
        allStations.add(new Station("Bab El Shearia",3));
        allStations.add(new ReplaceStation("Attaba",3,2));//62




    }
    private static void addAllWithoutRepetition(){


        stationsSet.add(new Station("Helwan ",1,"محطه مترو حلوان",30.031610,31.237169));
        stationsSet.add(new Station( "Ain Helwan ",1,"محطه مترو عين حلوان",29.867810,31.315620));

        stationsSet.add(new Station("Helwan univesity ",1,"محطه مترو جامعه حلوان",30.031610,31.237169));
        stationsSet.add(new Station("Wady Houf ",1,"محطه مترو وادي حوف",29.879220,31.313461));
        stationsSet.add(new Station("Hadaaq Helwan ",1,"محطه مترو حدائق حلوان",29.897389,31.303951));
        stationsSet.add(new Station("El maasra ",1,"محطه مترو المعصره",29.906103,31.299513));
        stationsSet.add(new Station("Tra ElAsmant ",1,"محطه مترو ترا الاسمنت",29.926170,31.287534));
        stationsSet.add(new Station("Kotaska ",1,"محطه مترو كوتسكا",29.936360, 31.281396));
        stationsSet.add(new Station("Tra ",1,"محطه مترو ترا",29.946959,31.272965));
        stationsSet.add(new Station("Thkanat El Maady ",1,"محطه مترو ثكنات المعادي",29.953308,31.262912));
        stationsSet.add(new Station("El maaady ",1,"محطه مترو العادي",29.960663,31.257634));
        stationsSet.add(new Station("hadaaq El Maaady ",1,"محطه مترو حدائق المعادي",29.969814,31.250931));
        stationsSet.add(new Station("Dar El Slam ",1,"محطه مترو دار السلام",29.982184,31.242069));
        stationsSet.add(new Station("El Zhraa ",1,"محطه مترو الزهراء",29.995624, 31.231128));
        stationsSet.add(new Station("Mar Gerges ",1,"محطه مترو مارجرجس",30.006137,31.229437));
        stationsSet.add(new Station("El Malek El Saleh ",1,"محطه مترو الملك الصالح", 30.015931, 31.230744 ));
        stationsSet.add(new Station("El Saiada ",1,"محطه مترو السيده زينب",30.029243,31.235424));
        stationsSet.add(new Station("Saad ",1,"محطه مترو سعد زغلول",30.036999, 31.238342));
        stationsSet.add(new ReplaceStation("Sadat ",1,2,"محطه مترو السادات",30.044708,31.234501));
        stationsSet.add(new Station("Gamal ",1,"محطه مترو جمال عبد الناصر",30.053410, 31.238782));
        stationsSet.add(new Station("Oraby ",1,"محطه مترو احمد عرابي",30.057124,31.242376));
        stationsSet.add(new ReplaceStation("Shohada ",1,2,"محطه مترو الشهداء",30.061275,31.246013));
        stationsSet.add(new Station("Ghamra ",1,"محطه مترو غمره",30.069158,31.264607));
        stationsSet.add(new Station("Demerdash ",1,"محطه مترو الدمرداش",30.077403,31.277814));
        stationsSet.add(new Station("Manshih El Sadr ",1,"محطه مترو منشيه الصدر",30.082110,31.287492));
        stationsSet.add(new Station("Kobry el qoba ",1,"محطه مترو كويري القبه", 30.087262, 31.294144 ));
        stationsSet.add(new Station("Hamamat El qoba ",1,"محطه مترو حمامات القبه", 30.091216, 31.298929 ));
        stationsSet.add(new Station("Sraya El qoba ",1,"محطه مترو سراي القبه", 30.097658, 31.304508 ));
        stationsSet.add(new Station("Hadaaq El Zaton ",1,"محطه مترو حدائق الزيتون", 30.106179, 31.310355 ));
        stationsSet.add(new Station("Helmea ",1,"محطه مترو حلميه الزيتون", 30.113189, 31.313922 ));
        stationsSet.add(new Station("Mataria ",1,"محطه مترو المطريه", 30.121040, 31.313675 ));
        stationsSet.add(new Station("Ain Shams ",1,"محطه مترو عين شمس", 30.131220, 31.318954 ));
        stationsSet.add(new Station("Azbh El Nakhl ",1,"محطه مترو عزبه النخل", 30.139487, 31.324447 ));
        stationsSet.add(new Station("Marg ",1,"محطه مترو المرج", 30.152337, 31.335594 ));
        stationsSet.add(new Station("The new Marg ",1,"محطه مترو المرج الجديده", 30.163704, 31.338407 ));
        stationsSet.add(new Station("Monib",2,"محطه مترو المنيب", 29.981074, 31.212333 ));
        stationsSet.add(new Station("Saqeh Meki",2,"محطه مترو سقيه مكي", 29.995561, 31.208575 ));
        stationsSet.add(new Station("Doahhi el Giza",2,"محطه مترو ضواحي الجيزه", 30.005466, 31.207856 ));
        stationsSet.add(new Station("Giza",2,"محطه مترو جيزه",  30.010651, 31.207095  ));
        stationsSet.add(new Station("Fassel",2,"محطه مترو فيصل", 30.017442, 31.203747 ));
        stationsSet.add(new Station("Cairo Unversity",2,"محطه مترو جامعه القاهره", 30.025986, 31.201099 ));
        stationsSet.add(new Station("behoth",2,"محطه مترو البحوث", 30.035943, 31.200176 ));
        stationsSet.add(new Station("Dokki",2,"محطه مترو الدقي", 30.038597, 31.212217 ));
        stationsSet.add(new Station("opera",2,"محطه مترو الاويرا", 30.041857, 31.225049 ));
        stationsSet.add(new Station("Nagib",2,"محطه مترو محمد نجيب", 30.045368, 31.244125 ));
        stationsSet.add(new ReplaceStation("Attaba",2,3,"محطه مترو العتبه", 30.052491, 31.246807 ));
        stationsSet.add(new Station("Masarh",2,"محطه مترو مسره", 30.070985, 31.245102 ));
        stationsSet.add(new Station("Rod El Farag",2,"محطه مترو روض الفرج", 30.080687, 31.245413 ));
        stationsSet.add(new Station("Santa Traza",2,"محطه مترو سانتا تريزا", 30.087975, 31.245510 ));
        stationsSet.add(new Station("El khalafawy",2,"محطه مترو الخلفاوي", 30.097917, 31.244995 ));
        stationsSet.add(new Station("Mazallat",2,"محطه مترو مظلات", 30.104049, 31.245537 ));
        stationsSet.add(new Station("Kolayt El Zraaah",2,"محطه مترو كليه الزراعه", 30.113766, 31.248760 ));
        stationsSet.add(new Station("Shobra El Khama",2,"محطه مترو شبرا الخيمه", 30.122378, 31.244662 ));
        stationsSet.add(new Station("Ahram",3,"محطه مترو الاهرام", 30.091584, 31.326518 ));
        stationsSet.add(new Station("Kolayt El Banat",3,"محطه مترو كليه البنات", 30.084498, 31.329107 ));
        stationsSet.add(new Station("Stad",3,"محطه الاستاد", 30.073503, 31.317975 ));
        stationsSet.add(new Station("Maared",3,"محطه امترو المعرض", 30.073133, 31.300630 ));
        stationsSet.add(new Station("Abasia",3,"محطه مترو العباسيه", 30.072360, 31.283689 ));
        stationsSet.add(new Station("AbdoBasha",3,"محطه مترو عبدو باشا", 30.064988, 31.274773 ));
        stationsSet.add(new Station("El Gesh",3,"محطه مترو الجيش", 30.061859, 31.266834 ));
        stationsSet.add(new Station("Bab El Shearia",3,"محطه مترو باب الشعريه", 30.054002, 31.255998 ));


    }
    public static List<Station> getLine1(){
        addStationsLine1();
        return line1;

    }
    public static List<Station> getLine2(){
        addStationsLine2();
        return line2;

    }
    public static List<Station> getLine3(){
        addStationsLine3();
        return line3;

    }
    private static void arrayConfigration(){
        addAll();
        allnamesOfStations =new String[allStations.size()];

        for(int i = 0; i< allnamesOfStations.length; i++){

           allnamesOfStations[i]=allStations.get(i).getName();
        }


    }
    public static String[] getAllnamesOfStations(){

        arrayConfigration();
        return  allnamesOfStations;

    }
    public static List<Station> getStationsSet(){
        addAllWithoutRepetition();
        return stationsSet;

    }






}
