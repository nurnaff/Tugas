package com.example.andinurnaf.tugaspemula;

import java.util.ArrayList;

public class PresidentData {
    public static String[][] data = new String[][]{
            {"Soekarno", "Presiden Pertama RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/Presiden_Sukarno.jpg/418px-Presiden_Sukarno.jpg","Presiden yang Hebat","18 Agustus 1945","12 Maret 1967"},
            {"Soeharto", "Presiden Kedua RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/President_Suharto%2C_1993.jpg/468px-President_Suharto%2C_1993.jpg","Presiden yang juga Bapak Koperasi","12 Maret 1967","21 Mei 1998"},
            {"Bacharuddin Jusuf Habibie", "Presiden Ketiga RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f1/Bacharuddin_Jusuf_Habibie_official_portrait.jpg/520px-Bacharuddin_Jusuf_Habibie_official_portrait.jpg","Presiden yang Pintar dan ahli membuat pesawat","21 Mei 1998","22 Oktober 1999"},
            {"Abdurrahman Wahid", "Presiden Keempat RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/35/President_Abdurrahman_Wahid_-_Indonesia.jpg/486px-President_Abdurrahman_Wahid_-_Indonesia.jpg","Presiden dari ulama","20 Oktober 1999","23 Juli 2001"},
            {"Megawati Soekarnoputri", "Presiden Kelima RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/88/President_Megawati_Sukarnoputri_-_Indonesia.jpg/540px-President_Megawati_Sukarnoputri_-_Indonesia.jpg","Presiden Prempuan Pertama","23 Juli 2001","20 Oktober 2004"},
            {"Susilo Bambang Yudhoyono", "Presiden Keenam RI", "https://upload.wikimedia.org/wikipedia/commons/5/58/Presiden_Susilo_Bambang_Yudhoyono.png","Presiden Indonesia Bersatu","20 Oktober 2004","20 Oktober 2014"},
            {"Joko Widodo", "Presiden Ketujuh RI", "https://upload.wikimedia.org/wikipedia/commons/1/1c/Joko_Widodo_2014_official_portrait.jpg","Presiden Kerja","20 Oktober 2014","Sekarang"}
    };

    public static ArrayList<President> getListData(){
        President presiden = null;
        ArrayList<President> list = new ArrayList<>();
        for (int i = 0; i<data.length; i++){
            presiden = new President();
            presiden.setName(data[i][0]);
            presiden.setRemarks(data[i][1]);
            presiden.setPhoto(data[i][2]);
            presiden.setDeskripsi(data[i][3]);
            presiden.setLahir(data[i][4]);
            presiden.setWafat(data[i][5]);

            list.add(presiden);
        }

        return list;
    }
}
