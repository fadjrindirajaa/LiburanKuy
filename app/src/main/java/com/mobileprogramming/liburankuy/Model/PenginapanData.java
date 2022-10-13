package com.mobileprogramming.liburankuy.Model;

import com.mobileprogramming.liburankuy.R;

import java.util.ArrayList;

public class PenginapanData {
    private static int [] idPenginapan = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

    private static String [] namaPenginapan = {
            "Lembang Asri Resort",
            "Imah Seniman",
            "RedDoorz near Kampung Gajah 2",
            "Orchid Guest House Bandung",
            "Bamboo village by Villa Istana Bunga",
            "RedDoorz @ Sersan Bajuri Atas",
            "Villa Roemi",
            "Villa Gardenia",
            "Villa 5CEMARA",
            "Pondok Kahuripan",
            "Hotel Pesona Bamboe Lembang",
            "Trizara Resort",
            "Cemara Asri",
            "JW Homestay Bandung",
            "Dusun Bambu",
            "Hotel & Banquet Panorama Lembang",
            "Puteri Gunung Hotel",
            "Bumi Makmur Indah Hotel & Convention",
            "Takashimaya Hotel Lembang",
            "Grand Paradise Hotel Lembang"
    };

    public static String [] deskripsiPenginapan = {
            "Bertempat di bangunan modern yang dipoles di kaki gunung Tangkuban Perahu, resor santai ini berjarak 3,7 km dari air terjun Curug Cimahi dan 4,8 km dari taman hiburan Kampung Gajah. Kamar simpel memiliki perabotan kayu ringan, plus Wi-Fi gratis, TV layar datar, serta alat pembuat teh dan kopi. Kamar di kelas yang lebih tinggi memiliki balkon (beberapa dengan bak mandi whirlpool). Suite dilengkapi dengan ruang keluarga/kamar dan tempat tidur/kamar tidur tambahan, sedangkan 2 vila memiliki teras.",
            "Sarapan gratis. Ada kafe santai dengan teras, plus restoran simpel yang menawarkan makanan Eropa. Fasilitas meliputi 2 kolam renang outdoor, aula bulu tangkis, dan lapangan tenis.",
            "Dikelilingi oleh area hijau dan udara sejuk yang bersih, Imah Seniman menawarkan akomodasi tepi danau gaya Indonesia tradisional dengan atap jerami.",
            "Di area yang dipenuhi pepohonan di sepanjang jalan utama, guesthouse kuno ini berjarak 7 km dari Farmhouse Susu Lembang, sebuah taman hiburan, dan 11 km dari Bandara Internasional Husein Sastranegara.",
            "Kamar-kamar yang nyaman menyediakan TV layar datar; beberapa memiliki perabotan kayu dan/atau dinding bata ekspos. Layanan kamar tersedia.",
            "Terdapat lounge yang luas dan taman dengan tempat duduk. Fasilitas lainnya terdiri dari Wi-Fi, sarapan dan parkir. Merupakan akomodasi baru yang dibangun pada tahun 2013 dan berjarak 15 menit berkendara dari pasar terapung Lembang. Vila ini menyediakan meja depan 24 jam dan Wi-Fi gratis di area umumnya. Kamar-kamar dilengkapi dengan kipas angin dan menyediakan TV layar datar, meja, dan area tempat duduk. Kamar mandi dalamnya menawarkan fasilitas shower.",
            "Villa Roemi menawarkan peristirahatan liburan dengan tempat parkir pribadi dan layanan tata graha. Rumah liburan ini berjarak 10 menit jalan kaki dari beragam pilihan tempat bersantap lokal, juga memiliki dapur lengkap.  Pusat perbelanjaan Paris Van Java berselang 15 menit berkendara, kawasan Lembang berjarak 20 menit berkendara, dan stasiun kereta api Bandung dapat dicapai dengan 25 menit berkendara dari Villa Roemi. Bandara Husein Sastranegara dapat dijangkau dengan 30 menit berkendara.  Rumah memiliki ruang tamu dengan TV. Semua kamar tidur dilengakpi meja dan lemari, sedangkan kamar tidur utamanya memiliki kamar mandi dalam dengan bathtub dan shower. Anda dapat menikmati sarapan ala Indonesia yang disajikan di ruang makan setiap pagi.",
            "Terletak di taman tropis 5 km dari Air Terjun Cimahi setinggi 72 m, hotel santai ini berjarak 10 km dari Farmhouse Susu Lembang, taman hiburan bergaya Eropa dengan kebun binatang, dan 14 km dari Bandara Internasional Husein Sastranegara.",
            "Vila sederhana dengan 3 dan 4 kamar tidur menawarkan dapur, ruang tamu, dan kamar mandi dalam, serta TV kabel dan akses Wi-Fi. Semua memiliki teras dan parkir pribadi. Kamar simpel dan suite 2 kamar tidur juga tersedia.",
            "Ada kolam renang outdoor dan bak mandi air panas, serta kolam renang anak-anak dengan seluncuran air. Fasilitas lainnya termasuk fasilitas pertemuan dengan ruang hingga 100 tamu.",
            "Di luar jalan raya Nasional 4, hotel santai bergaya Bali ini berjarak 9 menit berjalan kaki dari pedagang di Pasar Terapung Lembang, dan 5 km dari taman hiburan Kampung Gajah Wonderland.",
            "Kamar santai dilengkapi Wi-Fi gratis, TV satelit, teras, serta fasilitas pembuat teh dan kopi. Suite memiliki ruang keluarga terpisah. Menawarkan dinding kayu dekoratif, pondok 2 kamar tidur ini dapat menampung hingga 8 orang dan menyediakan dapur, ruang makan, dan beranda.",
            "Sarapan dan parkir gratis. Fasilitas lainnya termasuk kolam renang luar ruangan di taman halaman, serta taman bermain dan meja biliar.",
            "JW Homestay menawarkan kamar-kamar ber-AC dan taman di Bandung, 7 km dari Cihampelas Walk. Akomodasi ini berjarak sekitar 9 km dari Gedung Sate, 10 km dari Braga City Walk, dan 13 km dari Trans Studio Bandung. Akomodasi ini memiliki resepsionis 24 jam serta Wi-Fi gratis di seluruh areanya. Kamar-kamar di guest house ini memiliki teras. Di JW Homestay, setiap kamar memiliki kamar mandi pribadi dan seprai.",
            "Dusun Bambu sendiri memiliki nama lengkap Dusun Bambu Family Leisure Park. Objek wisata ini terletak di Jalan Kolonel Masturi KM 11, Bandung Barat. Dusun Bambu Family Leisure Park adalah sebuah ecotourism dalam bentuk konservasi bambu dengan konsep 7E yang terdiri dari edukasi, ekonomi, etnologi, etika, estetika, dan entertainment. Dusun Bambu Family Leisure Park menyediakan taman di kaki Gunung Burangrang yang menawarkan layanan pendidikan dan rekreasi.  untuk memfasilitasi wisatawan dari luar daerah yang ingin bermalam, pengelola Dusun Bambu juga tidak lupa menyediakan fasilitas penginapan. Akomodasi di tempat ini mengusung konsep resort, dan diberi nama Kampung Layung. Terletak di area Dusun Bambu, Kampung Layung jelas menawarkan pemandangan pegunungan yang indah dan juga tidak ketinggalan suasana yang tenang dan sejuk.",
            "Hotel simpel di properti yang rindang ini berjarak 2 km dari pusat perbelanjaan di Floating Market Lembang Bandung dan 10 km dari Taman Hutan Raya Djuanda.",
            "Kamar santai berperabotan simpel dilengkapi TV. Kamar di kelas yang lebih tinggi menawarkan area tempat duduk, kulkas mini, serta fasilitas pembuat teh dan kopi. Sebuah pondok dapat menampung hingga 6 orang, dan memiliki ruang tamu serta dapur kecil. Layanan kamar ditawarkan.",
            "Sarapan gratis. Fasilitas lainnya meliputi restoran kasual dan lounge nyaman dengan perapian. Teh disajikan di ruang berjemur yang lapang. Ada juga kolam renang outdoor, spa simpel, dan taman bermain simpel.",
            "Takashimaya Hotel & Convention adalah hotel bintang 3 yang berlokasi di jantung kota Lembang. Kawasan destinasi wisata yang seringkali dikunjungi wisatawan lokal ataupun internasional setiap minggu, serta hari libur tanggal merah. Penginapan dilengkapi dengan fasilitas seperti restoran, kolam renang akan melengkapi masa menginap anda.",
            "Terletak di bangunan berornamen yang terinspirasi arsitektur Yunani kuno, hotel glamor di taman yang rimbun ini berjarak 2 km dari Pasar Terapung Lembang Bandung dan 10 km dari Taman Hutan Raya Djuanda."
    };

    private static String [] alamatPenginapan = {
            "Jl. Kolonel Masturi No.KM, RW.4, Sukajaya, Lembang, Kabupaten Bandung Barat, Jawa Barat 40391",
            "Jl. Kolonel Masturi No. VIII, Gudangkahuripan, Lembang, Kabupaten Bandung Barat, Jawa Barat 40391",
            "Jl. Sersan Bajuri No.108, Cihideung, Kec. Parongpong, Kabupaten Bandung Barat, Jawa Barat 40561",
            "Jl. Raya Cimareme No.243, Cimareme, Kec. Ngamprah, Kabupaten Bandung Barat, Jawa Barat 40552",
            "Komplek Vila Istana Bunga, Jl. Tulip Jl. Kolonel Masturi No.KM.9, Cihanjuang Rahayu, Kec. Parongpong, Kabupaten Bandung Barat, Jawa Barat 40559",
            "Jl. Puspa Raya E1 No. 15, Komplek Graha Puspa, Jl. Sersan Bajuri, Cihideung, Kec. Parongpong, Kabupaten Bandung Barat, Jawa Barat 40391",
            "Jl. Royal Pataya 1 No.47, Cigugur Girang, Kec. Parongpong, Kabupaten Bandung Barat, Jawa Barat 40559",
            "Komp. Triniti Blok L17-L19, Jl. Terusan Sersan Bajuri, Cihideung, Lembang, Cigugur Girang, Kec. Parongpong, Kabupaten Bandung Barat, Jawa Barat 40559",
            "The Peak Giri Indah, Kav.I-20, Karyawangi, Kec. Parongpong, Kabupaten Bandung Barat, Jawa Barat 40559",
            "Jalan Raya Lembang KM. 12,8 No. 77, Gudang Kahuripan, Lembang, Gudangkahuripan, Lembang, Kabupaten Bandung Barat, Jawa Barat 40391",
            "Jl. Raya Lembang No.227, Jayagiri, Lembang, Kabupaten Bandung Barat, Jawa Barat 40391",
            "Jl. Pasir Wangi, Gudangkahuripan, Lembang, Kabupaten Bandung Barat, Jawa Barat 40391",
            "Jl. Grand Hotel No.35A, Lembang, Kabupaten Bandung Barat, Jawa Barat 40391",
            "Jl Bukit Hijau no 8 Bandung (komplek Gegerkalong, Permai, Ciwaruga, Kec. Parongpong, Kabupaten Bandung Barat, Jawa Barat 40559",
            "Jl. Kolonel Masturi No.KM. 11, Kertawangi, Kec. Cisarua, Kabupaten Bandung Barat, Jawa Barat 40551",
            "Jl. Raya Tangkuban Parahu No.29, Jayagiri, Lembang, Kabupaten Bandung Barat, Jawa Barat 40391",
            "Jl. Raya Tangkuban Parahu No.KM 16-17, Cibogo, Lembang, Kabupaten Bandung Barat, Jawa Barat 40391",
            "Jl. Raya Lembang No.224, Lembang, Kabupaten Bandung Barat, Jawa Barat 40391",
            "Jl. Grand Hotel No.35, Lembang, Kabupaten Bandung Barat, Jawa Barat 40391",
            "Jl. Raya Tangkuban Parahu No.50, Kayuambon, Lembang, Kabupaten Bandung Barat, Jawa Barat 40391"
    };

    private static String []  hargaPenginapan = {
            "Rp1.231.200,00 / hari",
            "RP1.148.359 / hari",
            "Rp145.133,00 / hari",
            "Rp112.700,00 / hari",
            "Rp200.000,00 / hari",
            "Rp250.705,00 / hari",
            "Rp537.778,00 / hari",
            "Rp1.626.505,00 / hari",
            "Rp1.480.000,00 / hari",
            "Rp198.896,00 / hari",
            "Rp446.320,00 / hari",
            "Rp1.410.813,00 / hari",
            "Rp190.491,00 / hari",
            "Rp450.000,00 / hari",
            "Rp2.214.000,00 / hari",
            "Rp548.361,00 / hari",
            "Rp427.680,00 / hari",
            "Rp214.607,00 / hari",
            "Rp229.350,00 / hari",
            "Rp252.000,00 / hari"
    };

    private static float [] jarakPenginapan = {
            (float) 0.2,
            (float) 1.3,
            (float) 1.7,
            (float) 1.5,
            (float)0.8,
            2,
            (float) 1.6,
            1,
            (float) 1.1,
            (float) 1.8,
            (float) 1.9,
            2,
            2,
            (float) 1.5,
            (float) 1.7,
            (float) 1.9,
            (float)  1.2,
            1,
            (float) 0.5,
            1
    };

    private static String [] fasilitas = {
            "free wifi - free breakfast - free parking - Accessible - outdoor pool - laundry service",
            "free wifi - free breakfast - free parking - outdoor pool - laundry service",
            "Free wifi",
            "Free wifi",
            "breakfast - outdoor pool - laundry service - kid friendly",
            "Free wifi - Free parking - air-conditioned - kitchens in some rooms",
            "Free wifi",
            "free wifi - free breakfast - free parking - outdoor pool - pet-friendly - room service",
            "free wifi - parking",
            "Laundry service - pet friendly - kid-friendly",
            "free wifi - free breakfast - free parking - outdoor pool - outdoor pool - air conditioned",
            "free wifi - free breakfast - free parking -  room service",
            "wifi - breakfast - free parking - kid friendly",
            "free wifi - parking - kid-friendly - airport shuttle",
            "free wifi - free breakfast - free parking - pool - room service",
            "free wifi - free breakfast - free parking - outdoor pool - air-conditioned - laundry service",
            "free wifi - free breakfast - free parking -  outdoor pool - air-conditioned - Accessible",
            "Free wifi - paid breakfast - free parking",
            "free wifi - free breakfast - Lundry service - outdoor pool - air-conditioned - Accessible",
            "free wifi - free breakfast - Lundry service - outdoor and indoor pool"
    };

    private static String [] gmaps = {
            "https://g.page/LembangAsriResort?share",
            "https://g.page/imahsenimanlembang?share",
            "https://goo.gl/maps/LwUYvVBhvzaN2jcFA",
            "https://goo.gl/maps/QGSQkT6rGcDkX4CH8",
            "https://goo.gl/maps/5N4EXtnyqHfPkhAx8",
            "https://goo.gl/maps/VRcFEDVj7MxYHpTN6",
            "https://goo.gl/maps/bNFvPyyCzbTUUssU7",
            "https://goo.gl/maps/MwWAD9byyk8HksTz6",
            "https://goo.gl/maps/CwZ4tV2hfEzq33ar5",
            "https://goo.gl/maps/sN9sqEzgp295QZq69",
            "https://goo.gl/maps/1aiHaouk1SZSSU156",
            "https://g.page/Trizaraglamping?share",
            "https://goo.gl/maps/VFQ2MN32cwCfrq5KA",
            "https://goo.gl/maps/eMYD2JsvH7rYhPN79",
            "https://goo.gl/maps/4U6BQ5bduoCDB26E8",
            "https://goo.gl/maps/Er8hGhVfRXtRLd7s5",
            "https://goo.gl/maps/2BTupj3sQn7BNKxQ9",
            "https://goo.gl/maps/6tjNh1bGCBV5RHLo8",
            "https://goo.gl/maps/D7UQosYHnuAp8yhf8",
            "https://goo.gl/maps/Z3B3PF9R7ARTBPmS6"
    };

    private static String [] key = {
            "situ curug taman farm bosscha floating the",
            "situ puncak puspa farm bosscha floating the",
            "situ gunung puncak farm the floating bosscha",
            "curug puspa sendang puncak then orchid",
            "sendang puncak lembang dusun",
            "lembang the de farm garika situ",
            "lembang the de farm dusun orchid dusun grafika situ",
            "farm the grafika gunung situ",
            "the grafika orchid gunung situ ",
            "gunung orchid floating bosscha grafika",
            "floating bosscha gunung taman dusun orchid grafika",
            "nuart taman bosscha lembang the de dusun orchid",
            "de nuart floating taman lembang dusun orchid curug",
            "curug bosscha nuart taman",
            "nuart taman situ curug puspa",
            "nuart puspa de puncak curug",
            "puncak floating lembang curug puspa sendang",
            "puspa sendang de dusun grafika curug",
            "sendang puspa grafika de orchid taman",
            "orchid nuart booscha floating sendang "
    };

    private static int [] photoThumbnail = {
            R.drawable.lar_thumbnail,
            R.drawable.is_thumbnail,
            R.drawable.kg_thumbnail,
            R.drawable.ogh_thumbnail,
            R.drawable.bv_thumbnail,
            R.drawable.sb_thumbnail,
            R.drawable.vr_thumbnail,
            R.drawable.vg_thumbnail,
            R.drawable.v5c_thumbnail,
            R.drawable.pgh_thumbnail,
            R.drawable.pbl_thumbnail,
            R.drawable.tr_thumbnail,
            R.drawable.ca_thumbnail,
            R.drawable.jwh_thumbnail,
            R.drawable.db_thumbnail,
            R.drawable.bpl_thumbnail,
            R.drawable.pgh_thumbnail,
            R.drawable.bmi_thumbnail,
            R.drawable.thl_thumbnail,
            R.drawable.gp_thumbnail
    };

    private static int [] photoPoster = {
            R.drawable.lar_poster,
            R.drawable.is_poster,
            R.drawable.kg_poster,
            R.drawable.ogh_poster,
            R.drawable.bv_poster,
            R.drawable.sb_poster,
            R.drawable.vr_poster,
            R.drawable.vg_poster,
            R.drawable.v5c_poster,
            R.drawable.ph_poster,
            R.drawable.pbl_poster,
            R.drawable.tr_poster,
            R.drawable.ca_poster,
            R.drawable.jwh_poster,
            R.drawable.db_poster,
            R.drawable.bpl_poster,
            R.drawable.pgh_poster,
            R.drawable.bmi_poster,
            R.drawable.thl_poster,
            R.drawable.gp_poster
    };

    public static ArrayList<Penginapan> getListDataPenginapan(){
        ArrayList<Penginapan> list = new ArrayList<>();
        for(int position = 0; position < idPenginapan.length; position++){
            Penginapan penginapan = new Penginapan();
            penginapan.setNo(idPenginapan[position]);
            penginapan.setNama(namaPenginapan[position]);
            penginapan.setDeskripsi(deskripsiPenginapan[position]);
            penginapan.setAlamat(alamatPenginapan[position]);
            penginapan.setHarga(hargaPenginapan[position]);
            penginapan.setFasilitas(fasilitas[position]);
            penginapan.setGmaps(gmaps[position]);
            penginapan.setJarak(jarakPenginapan[position]);
            penginapan.setKey(key[position]);
            penginapan.setPhoto_thumbnail(photoThumbnail[position]);
            penginapan.setPhoto_poster(photoPoster[position]);
            list.add(penginapan);
        }
        return list;
    }

}
