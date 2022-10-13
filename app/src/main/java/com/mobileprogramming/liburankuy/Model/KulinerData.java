package com.mobileprogramming.liburankuy.Model;

import com.mobileprogramming.liburankuy.R;

import java.util.ArrayList;

public class KulinerData {

    private static int[] idKuliner = {
      1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19
    };

    private static String [] namaKuliner = {
            "Gubug Makan Mang Engkring",
            "Meja House",
            "Natural Resto and Strawberry Land",
            "The Peak Resort Dining",
            "Burgundy Dine & Wine",
            "Warung Salse",
            "Bale Apung Sangkuriang",
            "Sapulidi Cafe, Resort & Gallery",
            "Balibu Rumah Makan Khas Sunda",
            "Kampung Sawah",
            "Rumah Makan Cikole",
            "Ayam Goreng Ampera Lembang",
            "Saung Pengkolan 1",
            "Kampung Daun",
            "Rumah Makan Katineung Rasa",
            "Rumah Miring",
            "Rumah Makan Ayam Brebes",
            "Dapur Pasta",
            "Kupat Tahu Padalarang"
    };

    private static String [] kulinerDesc = {
            "Gubug Makan Mang Engkring merupakan tempat makan bernuansa saung yang berada di atas danau asri jadi sangat asik buat makan makan bersama keluarga tersayang, rumah makan ini menyajikan aneka masakan khas sunda seperti masakan udang, gurame, kepiting, cumi-cumi, bandeng, kerapu, aneka sayuran dan sambal mantab dan tidak lupa aneka minuman dingin dan panas",
            "Gubug Makan Mang Engkring merupakan tempat makan bernuansa saung yang berada di atas danau asri jadi sangat asik buat makan makan bersama keluarga tersayang, rumah makan ini menyajikan aneka masakan khas sunda seperti masakan udang, gurame, kepiting, cumi-cumi, bandeng, kerapu, aneka sayuran dan sambal mantab dan tidak lupa aneka minuman dingin dan panas",
            "Keberadaan Rumah Stroberry Bandung jawa barat ini semakin membuktikan bahwa kawasan Lembang bandung memang sangat pantas dikatakan sebagai salah satu Surga Tempat Wisata Alam di Bandung yang cantik dan indah. Konsep wisata dari tempat ini sangat mirip dengan Kebun Strawberry di Ciwidey, dimana menawarkan wisata perkebunan strawberry dengan background alam yang masih alami dan indah, dengan suhu udara yang sejuk pastinya",
            "The Peak Resort Dining Bandung adalah resto yang letaknya nggak jauh dari kawasan wisata Lembang dan dekat dengan banyak tempat wisata, seperti Kampung Daun, Sapu Lidi, Dusun Bambu, dan lain-lain. Jadi, nggak heran jika The Peak Resort Dining memiliki udara yang sejuk, juga pemandangan indah.",
            "Tempat yang berlokasi di atas ketinggian bukit dengan suhu udara alam yang masih sangat natural ini diharapkan dapat menimbulkan ketertarikan pelanggan menikmati hidangan dan anggur di Burgundy. Suasananya sangat nyaman.",
            "Salse adalah istirahat, sebuah suasana ketika jam berhenti sejenak. Dirancang cukup lama, melibatkan Baskoro Tedjo dan Hepta sebagai Arsitek, Andre Gunarsa Kidarse dan Ruang Hijau sebagai desainer lanskap. Resort ini dirancang sebagai tempat untuk mengobati keresahan, menghilangkan keletihan, meredakan amarah dan menumbuhkan cinta. ENERGIZING, kata kuncinya.",
            "Bale apung sangkuriang merupakan tempat kuliner hits di atas air yang pertama di daerah Batujajar, Bandung barat. Para pengunjung akan merasakan sensasi yang berbeda saat menyantap berbagai menu kuliner yang unik di tempat wisata kuliner hits Bandung Barat ini. Apabila kalian pernah berkunjung ke tempat wisata kapal titanic bandung barat yang bernama museum galeri bahari batujajar.",
            "Sapu Lidi adalah sebuah Kawasan Wisata Terpadu yang menawarkan konsep Cafe, Resto dan Galery seni dengan jargon ”Makan di Sawah”. Sapu Lidi Lembang adalah objek wisata di lembang Bandung yang berani menawarkan suasana serta sensasi wisata yang berbeda kepada setiap pengunjung yang datang ke sini, yaitu menawarkan penginapan Sapu Lidi Resort/Villa dengan suasana lingkungan yang tenang khas pedesaan yang masih asri,kemudian menyajikan suguhan sensasi wisata kuliner yang lezat serta nikmat",
            "Saung Balibu letaknya di jalan Tangkuban Perahu dan pokoknya gampang dicari. Tempatnya sangat luas dan bersih tentunya. Disini ada area lesehan juga loh ditambah dikelilingi bukit tinggi yang bisa kalian liat langsung sawah-sawah yang hijau banget",
            "Di tempat ini, Anda akan menjumpai wahana rekreasi seperti Waterpark, Kuliner, dan Pemancingan. Wisata kampung sawah sangat cocok untuk tempat berlibur anak-anak sekolah hingga orang dewasa, karena tempat ini sangatlah terjangkau oleh orang menengah ke bawah. Fasilitas kampung sawah terbilang cukup kumplit, dari mulai tempat makan, wahana air, parkiran yang luas, mushola, dan toilet.",
            "Tempat ini menawarkan beberapa fasilitas yang bisa memuaskan pengunjungnya. Di area lahan sekitar 70 hektare ini, tersedia hotel, rumah makan",
            "Ampera ayam goreng cabang lembang menjajakan hidangan ayam goreng di Kabupaten Subang. Tempat ini menyediakan ayam goreng dengan daging yang empuk, bumbu, bahan dan resep pilihan. Tempat ini dapat menjadi pilihan makan bersama teman dan keluarga. Hidangan ditawarkan dengan harga terjangkau dengan rasa terbaik.",
            "Warung nasi saung pengkolan merupakan salah satu rumah makan sunda legendaris yang masih tetap ada sampai dengan saat ini. Rm pengkolan sudah berdiri sejak tahun 1978 dan menjadi salah satu pilihan singgah pavorit para wisatawan keluarga dan rombongan dari berbagai daearah saat berlibur ke lembang bandung.",
            "Kampung Daun Bandung merupakan salah satu resto khas Sunda yang cukup populer di kota Lembang. Dengan berada di daerah dataran tinggi kota Bandung, menjadikan kampung ini sangat sejuk, asri, dan romantis.Suasana saung dikelilingi pepohonan yang rindang dengan sungai kecil dan tebing. Maka setiap pengunjung yang datang ke Kampung Daun akan merasakan suasana yang menyatu dengan alam",
            "Penamaan rumah makan Katineung, bahasa Sunda untuk kata, “Terkenang”. Pelanggan akan selalu mengenang citarasa dari masakan atau makanan yang telah dinikmati selama singgah di Rumah Makan, “Katineung Rasa”. Rumah Makan Katineung Rasa sudah menjalankan bisnisnya sejak 1990 dan hingga hari ini tidak memiliki cabang satu pun. Pendiri pertama adalah bapak dan ibunya Rezza. Awalnya RM. Katineung Rasa hanya berkapasitas untuk menampung 50 orang pengunjung saja.",
            "Cafe Rumah Miring Bandung ini menjadi tempat yang populer terutama bagi muda-mudi kota bandung yang ingin menghabiskan waktu sore dan malam mereka di tempat yang super nyaman, tenang dengan background pemandangan alam yang indah dan udaranya dingin. Di sini, menikmati sajian aneka menu kuliner, baik menu lokal, nusantara dan mancanegara akan serasa berbeda, bukan lagi hanya soal cita rasa, tapi juga suasana yang istimewa.",
            "Rumah makan ayam goreng Brebes adalah Tempat makan yang selalu ramai dikunjungi oleh penikmat kuliner di lembang, menu spesial yang disajikan adalah ayam goreng yang lembut gurih dan sangat pas sekali bumbunya, selain menu ayam goreng juga ada menu spesial lainnya seperti sop, ikan gurame, ikan mas dan sate dan selain itu juga masih banyak menu lainnya.",
            "Pasta adalah makanan olahan yang digunakan pada masakan Italia, yang biasanya terbuat dari adonan tidak beragi berbahan tepung gandum durum (semolina) yang dicampur dengan air atau telur dan dibentuk menjadi lembaran-lembaran atau bentuk-bentuk yang beragam, yang kemudian dimasak dengan cara direbus atau dipanggang. Di Indonesia, jenis pasta yang populer adalah spageti, makaroni dan lasagna. Namun, sebenarnya ada banyak lagi jenis pasta lainnya, seperti vermiseli, fetucini, fusilli, penne, ravioli dan sebagainya.",
            "Salah satu pilihan sarapan biasanya makan ketupat atau opor. Ternyata ketupat atau orang Sunda menyebutnya kupat ini ada banyak sekali jenisnya, beberapa daerah punya makanan khas berupa ketupat.Pada kesempatan kali ini aku coba Kupat Tahu 99 Padalarang. Ini salah satunya adalah ketupat tahu atau kupat tahu khas dari Padalarang, Kabupaten Bandung Barat. Berbeda dengan kupat tahu khas Singaparna, Tasikmalaya yang khas dengan bumbu kacang, kupat tahu Padalarang ini menggunakan kuah rempah-rempah seperti halnya opor ayam. Perbedaan yang kentara ini ditambah dengan penambahan bihun sebagai toping seperti halnya ketoprak atau ketupek sayur khas bukit tinggi"
    };

    private static String [] kulinerAlamat = {
            "Jalan Raya Tangkuban Perahu KM.1 No.68, Cibogo, Lembang, Cibogo, Lembang, Kabupaten Bandung Barat",
            "Jln. Sersan Bajuri No.72. Cihideung Bandung, Bandung 40124 Indonesia",
            "Jl. Raya Tangkuban Parahu No.109, Cibogo, Lembang, Kabupaten Bandung Barat, Jawa Barat",
            "Jl. Desa Karawangi No. 388A Komplek Giri Indah, Jl. Gegerkalong Tonggoh Raya, Karyawangi, Kec. Parongpong, Kabupaten Bandung Barat, Jawa Barat",
            "Jl. Maribaya No.163, Langensari, Lembang, Kabupaten Bandung Barat, Jawa Barat",
            "Colaborea Jl. Dago Giri No. 101, Dago Atas, Bandung",
            "Kp Cihurip RT 03/11 desa pangauban.kec.batujajar Bandung barat RT 03/11, Pangauban, Kec. Batujajar, Kabupaten Bandung Barat, Jawa Barat",
            "Kompleks Graha Puspa, Jl. Sersan Bajuri, Cihideung, Parongpong, West Bandung Regency, West Java",
            "Jl. Raya Tangkuban Parahu No.423A, Cibogo, Lembang, Kabupaten Bandung Barat, Jawa Barat",
            "Jalan Gandasari no.152, Soreang, Kabupaten Bandung.",
            "Jl. Raya Tangkuban Perahu No.8, Cikole, Lembang, Kabupaten Bandung Barat, Jawa Barat",
            "Jl jendral sutoyo, Subang, Jawa Barat, Indonesia",
            "KM 12.3 No 35, Jl. Raya Lembang KM.12,3 No.35, Gudangkahuripan, Lembang, Kabupaten Bandung Barat, Jawa Barat",
            "Jl. Villa Triniti, Cigugur Girang, Kec. Parongpong, Kabupaten Bandung Barat, Jawa Barat",
            "Jl. Raya Padalarang No.496 RT 002/14, Kertamulya, Padalarang, Kabupaten Bandung Barat, Jawa Barat",
            "Jl. Dago Giri No.119, Mekarwangi, Lembang, Kabupaten Bandung Barat, Jawa Barat",
            "Jl. Raya Lembang No.272, Lembang, Kabupaten Bandung Barat, Jawa Barat",
            "Kota Baru Parahyangan, Jalan Pita Niaga No.1, Cipeundeuy, Padalarang, Kabupaten Bandung Barat, Jawa Barat",
            "Jl. Raya Padalarang No.593, Kertamulya, Padalarang, Kabupaten Bandung Barat, Jawa Barat"
    };

    private static int [] kulinerMenu = {
            R.drawable.menu_1,
            R.drawable.menu_2,
            R.drawable.menu_3,
            R.drawable.menu_4,
            R.drawable.menu_5,
            R.drawable.menu_6,
            R.drawable.menu_7,
            R.drawable.menu_8,
            R.drawable.menu_9,
            R.drawable.menu_10,
            R.drawable.menu_11,
            R.drawable.menu_12,
            R.drawable.menu_13,
            R.drawable.menu_14,
            R.drawable.menu_15,
            R.drawable.menu_16,
            R.drawable.menu_17,
            R.drawable.menu_18,
            R.drawable.menu_19
    };

    private static String [] kulinerGmaps = {
            "https://www.google.com/maps/dir//Alamat+Gubug+Makan+Mang+Engking+berada+di+Jalan+Raya+Tangkuban+Perahu+KM.1+No.68,+Cibogo,+Lembang,+Cibogo,+Lembang,+Kabupaten+Bandung+Barat/@6.810484,107.55703,12z/data=!3m1!4b1!4m9!4m8!1m1!4e2!1m5!1m1!1s0x2e68e11ca36cb1df:0x146db9ff54edf978!2m2!1d107.6270706!2d-6.810489",
            "https://www.google.com/maps/place/Maja+House/@-6.8317588,107.5928463,17z/data=!3m1!4b1!4m5!3m4!1s0x2e68e6b9de67a86b:0x8d31bd3543ef9424!8m2!3d-6.8317588!4d107.595035?hl=en",
            "https://www.google.com/maps?q=natural+resto+and+strawberry+land&source=lmns&bih=544&biw=1282&hl=en&sa=X&ved=2ahUKEwiqpPHk2t30AhXUR3wKHVKvBg0Q_AUoAXoECAEQAQ",
            "https://www.google.com/maps?q=the+peak+resort+dining&source=lmns&bih=544&biw=1282&hl=en&sa=X&ved=2ahUKEwjMvO3m2930AhWnz6ACHZTPBjUQ_AUoAXoECAEQAQ",
            "https://www.google.com/maps/place/Burgundy+Dine+%26+Wine/@-6.8290443,107.6441959,17z/data=!3m1!4b1!4m5!3m4!1s0x2e68e0b8a9c122e3:0xea3b04188d761a8e!8m2!3d-6.8290443!4d107.6463846?hl=en",
            "https://www.google.com/maps/place/Warung+Salse/@6.8309326,107.0282234,11z/data=!4m9!1m2!2m1!1swarung+salse!3m5!1s0x2e685323fb1bba51:0x25d07250dc2c7ccf!8m2!3d6.8309326!4d107.1378076!15sCgx3YXJ1bmcgc2Fsc2WSAQRjYWZl?hl=en",
            "https://www.google.com/maps/place/Bale+Apung+Sangkuriang/@-6.9011193,107.4384316,17z/data=!3m1!4b1!4m5!3m4!1s0x2e68faea8d0000e7:0xb0c2f104c21d6deb!8m2!3d-6.9011193!4d107.4406203?hl=en",
            "https://www.google.com/maps?q=Sapulidi+Cafe,+Resort+%26+Gallery+menu&source=lmns&bih=601&biw=1282&hl=en&sa=X&ved=2ahUKEwic0ab8-d_0AhUo-zgGHT_dAdwQ_AUoAnoECAEQAg",
            "https://www.google.com/maps/place/Balibu+Rumah+Makan+Khas+Sunda/@-6.8115535,107.6221535,17z/data=!3m1!4b1!4m5!3m4!1s0x2e68e0fdacc2399f:0x2427a5f926c67c57!8m2!3d-6.8115473!4d107.6243305?hl=en",
            "https://www.google.com/maps/place/Kampung+Sawah/@-6.9534649,107.6027235,17z/data=!3m1!4b1!4m5!3m4!1s0x2e68e94aaa55761b:0x16c1f6b37b880380!8m2!3d6.9534575!4d107.604913?hl=en",
            "https://www.google.com/maps/place/RM+Cikole/@6.8031023,107.6323663,14z/data=!4m9!1m2!2m1!1srumah+makan+cikole+lembang!3m5!1s0x2e68e08a0a699d6d:0xe3c05a442b2fe089!8m2!3d6.8031023!4d107.6498758!15sChpydW1haCBtYWthbiBjaWtvbGUgbGVtYmFuZ1ocIhpydW1haCBtYWthbiBjaWtvbGUgbGVtYmFuZ5IBFHN1bmRhbmVzZV9yZXN0YXVyYW50mgEjQ2haRFNVaE5NRzluUzBWSlEwRm5TVU5KWHkxbVpFRjNFQUU",
            "https://www.google.com/maps/place/Ayam+Goreng+Ampera+Lembang/@-6.8756762,107.5564264,12z/data=!4m9!1m2!2m1!1sAyam+Goreng+Ampera+Lembang+deskripsi!3m5!1s0x2e68e1039c0f12cb:0x41e7307b9a866062!8m2!3d-6.8114893!4d107.6165051!15sCiRBeWFtIEdvcmVuZyBBbXBlcmEgTGVtYmFuZyBkZXNrcmlwc2laJiIkYXlhbSBnb3JlbmcgYW1wZXJhIGxlbWJhbmcgZGVza3JpcHNpkgEWZnJpZWRfY2hpY2tlbl90YWtlYXdheQ?hl=en",
            "https://www.google.com/maps/place/Saung+Pengkolan+1/@6.8344391,107.5993226,17z/data=!3m1!4b1!4m5!3m4!1s0x2e68e139b779cdd7:0xb45444a8512427f!8m2!3d6.8344391!4d107.6015113?hl=en",
            "https://www.google.com/maps?q=restoran+kampung+daun&source=lmns&bih=544&biw=1282&hl=en&sa=X&ved=2ahUKEwi-2dbj3N30AhWjM7cAHTxhBskQ_AUoAXoECAEQAQ",
            "https://www.google.com/maps/place/Rumah+Makan+Katineung+Rasa/@6.8439772,107.4844874,17z/data=!3m1!4b1!4m5!3m4!1s0x2e68e3516a8cccd3:0x7cd559ff7c953c1a!8m2!3d6.8439772!4d107.4866761?hl=en",
            "https://www.google.com/maps?q=Alamat+Rumah+Miring+berada+di+Jl.+Dago+Giri+No.119,+Mekarwangi,+Lembang,+Kabupaten+Bandung+Barat,+Jawa+Barat+menu&source=lmns&bih=544&biw=1282&hl=en&sa=X&ved=2ahUKEwi33bLT0t30AhXLjtgFHSkHBr0Q_AUoAXoECAEQAQ",
            "https://www.google.com/maps/place/R.M.+Ayam+Goreng+Brebes/@-6.8118505,107.61411,17z/data=!3m1!4b1!4m5!3m4!1s0x2e68e10384ac4509:0xa3dffdd90c64b062!8m2!3d-6.8118505!4d107.6162987?hl=en",
            "https://www.google.com/maps?q=dapur+pasta+kota+baru+parahyangan&source=lmns&bih=544&biw=1282&hl=en&sa=X&ved=2ahUKEwiB4OLL3t30AhWDHbcAHZbiBqIQ_AUoAnoECAEQAg",
            "https://www.google.com/maps?q=kupat+tahu+padalarang+99+menu&source=lmns&bih=544&biw=1282&hl=en&sa=X&ved=2ahUKEwi-mPPY2d30AhWQ4TgGHVHIDkAQ_AUoAXoECAEQAQ"
    };

    private static int  [] kulinerThumbnail = {
            R.drawable.pos_a,
            R.drawable.pos_b,
            R.drawable.pos_c,
            R.drawable.pos_d,
            R.drawable.pos_e,
            R.drawable.pos_f,
            R.drawable.pos_g,
            R.drawable.pos_h,
            R.drawable.pos_i,
            R.drawable.pos_j,
            R.drawable.pos_k,
            R.drawable.pos_l,
            R.drawable.pos_m,
            R.drawable.pos_n,
            R.drawable.pos_o,
            R.drawable.pos_p,
            R.drawable.pos_q,
            R.drawable.pos_r,
            R.drawable.pos_s
    };

    private static int [] kulinerPoster = {
            R.drawable.thumb_foto1,
            R.drawable.thumb_foto2,
            R.drawable.thumb_foto3,
            R.drawable.thumb_foto4,
            R.drawable.thumb_foto5,
            R.drawable.thumb_foto6,
            R.drawable.thumb_foto7,
            R.drawable.thumb_foto8,
            R.drawable.thumb_foto9,
            R.drawable.thumb_foto10,
            R.drawable.thumb_foto11,
            R.drawable.thumb_foto12,
            R.drawable.thumb_foto13,
            R.drawable.thumb_foto14,
            R.drawable.thumb_foto15,
            R.drawable.thumb_foto16,
            R.drawable.thumb_foto17,
            R.drawable.thumb_foto18,
            R.drawable.thumb_foto19
    };

    public static ArrayList<Kuliner> getListDataKuliner(){
        ArrayList<Kuliner> list = new ArrayList<>();
        for (int position = 0; position < namaKuliner.length; position++){
            Kuliner kuliner = new Kuliner();
            kuliner.setId(idKuliner[position]);
            kuliner.setNama_kuliner(namaKuliner[position]);
            kuliner.setDeskripsi(kulinerDesc[position]);
            kuliner.setAlamat(kulinerAlamat[position]);
            kuliner.setMenu(kulinerMenu[position]);
            kuliner.setGmaps(kulinerGmaps[position]);
            kuliner.setPhotoThumbnail(kulinerThumbnail[position]);
            kuliner.setFotoPoster(kulinerPoster[position]);
            list.add(kuliner);
        }
        return list;
    }
}
