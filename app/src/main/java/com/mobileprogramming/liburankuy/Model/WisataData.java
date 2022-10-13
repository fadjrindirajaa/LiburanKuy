package com.mobileprogramming.liburankuy.Model;

import android.database.Cursor;

import com.mobileprogramming.liburankuy.Db.DatabaseContract;
import com.mobileprogramming.liburankuy.R;

import java.util.ArrayList;

public class WisataData {
    private static int [] idWisata = {
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20
    };

    private static String [] namaWisata = {
            "Situ Ciburuy",
            "Curug Malela",
            "Puspa Iptek Kota Baru Parahyangan",
            "Sendang Geulis Kahuripan",
            "Puncak Eurad",
            "Curug Tilu Leuwi Opat",
            "Curug Cipanas Nagrak",
            "Lembang Park Zoo",
            "Dusun Bambu",
            "The Greatest Asia Afrika",
            "De Ranch",
            "Farm House Lembang",
            "The Lodge Maribaya",
            "Wisata Grafika Cikole",
            "Gunung Tangkuban Perahu",
            "Orchid Forest",
            "Floating Market Lembang",
            "Bosscha",
            "Taman Begonia",
            "NuArt Sculpture Park"
    };

    private static String [] deskripsiWisata = {
            "Danau yang terletak tidak jauh dari Padalarang, Bandung Barat ini cukup terkenal karena pemandangan alamnya yang menakjubkan. Air danau jernih dengan dikelilingi oleh pepohonan membuatnya tampak asri dan menyejukkan. Di Situ Ciburuy juga kita dapat berkeliling di sekitar danau dengan menaiki perahu.",
            "Curug Malela merupakan salah satu air terjun terbesar di Jawa Barat. Bentuknya yang lebar mirip dengan Air Terjun Niagara di perbatasa Amerika-Kanada membuat curug ini populer dengan sebutan The Little Niagara.",
            "Tempat wisata ini dikenal dengan nama Puspa Iptek Sundial yang merupakan sebuah wahana pendidikan yang terletak di kawasa Kota Baru Parahyangan, Padalarang. Puspa Iptek Sundial ini adalah museum khusus yang dijadikan sebagai tempat peragaan jam matahari.  Di tempat ini terdapat lebih dari 150 buah alat peraga yang bisa dicoba langsung oleh pengunjung.",
            "Sendang Geulis Kahuripan merupakan salah satu mata air yang ada di Kabupaten Bandung Barat. Selain berfungsi sebagai sumber air, tempai ini juga dijadikan tempat berwisata karena pemandangannya yang saat indah.",
            "Puncak Eurad memiliki pemandangan yang mempesona, di sekitarnya terdapat perkebunan teh milik warga yang membuat pemandangan lebih sejuk. Objek wisata ini menawarkan pemandangan alam indah dari ketinggian.",
            "Curug Tilu Leuwi Opat ini merupakan salah satu tempat wisata air terjun di Bandung Barat. Di sini wisatawan dapat berkemah, juga bermain wahana permainan seperti flying fox dan lainnya.",
            "Curug Cipanas Nagrak ini merupakan pemandian air panas, wisatawan dapat menikmati manfaat air panas dari mata air alami. Selain itu, pemandangan di sini sangat menyejukkan mata karena dikelilingi oleh pepohonan yang sejuk.",
            "Objek wisata ini tepat dijadikan sebagai tujuan wisata keluarga, karena dapat mengedukasi anak-anak dengan mengenalkan berbagai satwa. Hewan-hewan yang ada di sini pun beragam mulai dari Indonesia  sampai dari negara lain. Jenis hewannya pun beragam, mulai dari unggas, primata, reptil, hingga mamalia.",
            "Dusun Bambu merupakan salah satu tempat rekreasi keliarga dengan pemandangan yang indah dan asri. Tujuan didirikannya Dusun Bambu Lembang ialah guna menjadi sebuah taman wisata sekaligus sarana edukasi mengenai budaya tradisional pada kehidupan modern bagi pengunjung. Tak hanya berupa taman rekreasi saja, di Dusun Bambu Lembang juga tersedia penginapan dengan suasana yang romantis.",
            "Kawasan wisata ini menawarkan pengalaman menjelajahi beberapa negara di dua benua, selaras dengan namanya. Tempat ini merupakan taman miniatur  yang mencoba memberikan terutama pengalaman kultural dari berbagai negara tanpa perlu beranjak dari Indonesia.",
            "De Ranch Bandung salah satu tempat wisata yang mengusung konsep “Wisata Kuda ala Cowboy”. Didukung dengan suasana tempat yang masih sejuk dan segar, pengunjung juga diberi kesempatan menggunakan atribut cowboy lengkap dan mengelilingi area De Ranch Lembang menggunakan kuda.",
            "Tempat wisata ini menawarkan sebuah kawasan wisata terpadu berkonsep perkebunan dan peternakan ala Eropa. Daya tarik wisata Farm House selanjutnya adalah empat wisata ini terdapat area bangunan para kurcaci atau Rumah Hobbit. Desain bangunannya dibuat semirip mungkin sesuai dengan apa yang biasa anda lihat di film Hobbiton Movie Set yaitu mungil.",
            "The Lodge Maribaya adalah tempat wisata yang berkonsep Instagramable di daerah wisata Lembang Kabupaten Bandung Barat. The Lodge Lembang memiliki pemandangan Alam yang sangat eksotis dengan jejeran pohon pinusnya. Hawanya yang sejuk sangat mendukung kegiatan pariwisata di daerah ini.",
            "Terminal wisata grafika cikole adalah tempat wisata, restoran serta penginapan di Lembang. Udara yang sejuk dengan suhu 20 derajat celcius dan kontur area terminal Wisata Grafika Cikole yang berbukit dikelilingi hutan pinus di area seluas 9 hektar merupakan tempat wisata di bandung lembang yang tepat untuk menyelenggrakan aktifitas outbound bagi keluarga, instansi, sekolah dan keluarga.",
            "Gunung Tangkuban Perahu merupakan salah satu destinasi wisata yang ada di Lembang. Di sini menawarkan keindahan kawah-kawah yang ada di sekitar Gunung Tangkuban Perahu.",
            "Orchid Forest Cikole Lembang sudah berdiri sejak Agustus tahun 2017. Tempat ini merupakan taman anggrek terluas di Indonesia. Spesies Anggreknya tidak hanya berasal dari Indonesia yang memang merupakan negara kedua terbanyak memiliki varian anggrek. Tanaman anggrek di Orchid Forest juga berasal dari negara lain, seperti Venezuela, Argentina, Filipina, Peru, dan Amerika serikat.",
            "Floating Market Lembang merupakan salah satu tempat wisata yang memadukan alam dan buatan dengan konsep unik dan menarik. Lokasi area wisata ini berada di kawasan dataran tinggi. Udara dingin dan sejuk pun menyelimuti kawasan wisata ini. Pasar terapung ini sebenarnya mengusung konsep sederhana dan unik sehingga banyak mengundang wisatawan untuk datang.",
            "Bosscha merupakan tempat pusat penelitian dan ilmu pengetahuan, observatorium yang dibangun dengan tujuan perkembangan ilmu pengetahuan ini menjadi yang terbesar di Indonesia.",
            "Taman Begonia adalah salah satu tempat rekreasi alam di Bandung. Beragam aneka tanaman hias yang tersedia di sini menjadi keunikan tersendiri dalam menarik wisatawan. Bunga Balinea yang berasal dari bali menjadi maskot di kebun ini.",
            "NuArt Sculpture Park ini merupakan galeri seni yang terbuka untuk umum sebagai museum galeri seni patung dan lukisan karya nyoman nuarta di bandung sejak tahun 2000."
    };

    private static String [] lokasiWisata = {
            "Desa Pamalayan, Kecamatan Bayongbong, Padalarang.",
            "Kampung Manglid, Desa Cicadas, Kecamatan Rongga-Gununghalu, Kabupaten Bandung Barat, Jawa Barat",
            "Jl. Raya Padalarang No.427, Kertajaya, Padalarang, Kabupaten Bandung Barat, Jawa Barat",
            "Ganjarsari, Kec. Cikalong Wetan, Kabupaten Bandung Barat, Jawa Barat",
            "Capunagara, Lembang, Kabupaten Bandung Barat, Jawa Barat",
            "Jl. Kp. Ciwangun Indah Camp, Cihanjuang Rahayu, Kec. Parongpong, Kabupaten Bandung Barat, Jawa Barat",
            "Jl. Nagrak Tengah, Sukajaya, Lembang, Kabupaten Bandung Barat, Jawa Barat",
            "Jl. Kolonel Masturi No.171, Sukajaya, Lembang, Kabupaten Bandung Barat, Jawa Barat",
            "Jl. Kolonel Masturi No.KM. 11, Kertawangi, Kec. Cisarua, Kabupaten Bandung Barat, Jawa Barat",
            "Jl. Raya Lembang - Bandung No.71, Gudangkahuripan, Lembang, Kabupaten Bandung Barat, Jawa Barat",
            "Jl. Maribaya No.17, Kayuambon, Lembang, Kabupaten Bandung Barat, Jawa Barat",
            "Jalan Raya Lembang No.108, Gudangkahuripan, Lembang, Kabupaten Bandung Barat, Jawa Barat",
            "Jalan Maribaya No. 149/252 RT. 03 / RW. 15 Babakan, Gentong, Cibodas, Lembang, Kabupaten Bandung Barat, Jawa Barat",
            "Jl. Raya Tangkuban Parahu No.KM.8, Cikole, Lembang, Kabupaten Bandung Barat, Jawa Barat",
            "Cikahuripan, Lembang, Kabupaten Bandung Barat, Jawa Barat",
            "Genteng, Cikole, Lembang, Kabupaten Bandung Barat, Jawa Barat",
            "Jl. Grand Hotel No.33E, Lembang, Kabupaten Bandung Barat, Jawa Barat",
            "Jl. Peneropongan Bintang No.45, Lembang, Kabupaten Bandung Barat, Jawa Barat",
            "Jl. Maribaya No.120 A, Langensari, Lembang, Kabupaten Bandung Barat, Jawa Barat",
            "Jl, Setra Duta Raya No.L6, Ciwaruga, Kec. Parongpong, Kabupaten Bandung Barat, Jawa Barat"
    };

    private static String [] htmWisata = {
            "7.500",
            "Rp10.000",
            "Rp10.000 - Rp25.000",
            "Rp10.000",
            "Rp5.000",
            "Rp10.000",
            "Anak: Rp15.000\nDewasa: Rp20.000",
            "Senin-Jumat: Rp50.000\nSabtu-Minggu & Tanggal Merah: Rp60.000",
            "Rp25.000-Rp30.000",
            "Rp50.000",
            "Rp26.000",
            "Rp30.000",
            "Tiket Masuk Paket 1 + Voucher makan Rp40.000 = Rp50.000\nTiket Paket 2 + Voucher makan Rp10.000 + 2 Wahana (Glass Deck + Sky Plane) = Rp50.000\nPaket 3 Jumat-Minggu (Tiket The Lodge Maribaya + Tiket Hutan Menyala) = Rp100.000",
            "Rp20.000",
            "Weekday\nDomestik: Rp25.000\tMancanegara: Rp200.000\nWeekend\nDomestik: Rp30.000\tMancanegara: Rp300.000",
            "Domestik: Rp40.000\nMancanegara: Rp100.000",
            "Rp30.000",
            "Rp15.000-Rp20.000",
            "Domestik: Rp25.000\nMancanegara: Rp30.000",
            "Rp50.000",
    };

    private static String [] jamBukaWisata = {
            "Setiap hari: 24 jam",
            "Setiap hari: 08.00 s.d. 16.00 WIB",
            "Setiap hari: 09.00 s.d. 16.30 WIB",
            "Setiap hari: 07.00 s.d. 18.00 WIB",
            "Setiap hari: 24 jam",
            "Setiap hari: 06.00 s.d. 18.00 WIB",
            "Setiap hari: 07.00 s.d. 17.00 WIB",
            "Senin-Jumat: 09.00 s.d. 17.00 WIB\nSabtu-Minggu: 08.00 s.d. 18.00 WIB",
            "Setiap hari: 10.00 s.d. 20.00 WIB",
            "Setiap hari: 09.00 s.d. 18.00 WIB",
            "Selasa-Minggu: 09.00 s.d. 17.00 WIB",
            "Setiap hari: 08.00 s.d. 20.00 WIB",
            "Setiap hari: 09.00 s.d. 17.00 WIB",
            "Setiap hari: 07.00 s.d. 16.00 WIB",
            "Setiap hari: 08.00 s.d. 17.00 WIB",
            "Setiap hari: 09.00 s.d. 18.00 WIB",
            "Weekday: 09.00 s.d. 18.00 WIB\nWeekend: 08.00 s.d. 19.00 WIB",
            "Kunjungan Siang: 09.00 s.d. 14.00 WIB\nKunjungan Malam: 17.00 s.d. 20.00 WIB",
            "Setiap hari: 08.00 s.d. 17.00 WIB",
            "Weekday: 09.00 s.d. 18.00 WIB\nWeekend: 11.00 s.d. 22.00 WIB"
    };

    private static String [] gmapsWisata = {
            "https://maps.app.goo.gl/XDhvULmCdb6pnRm" +
                    "S7",
            "https://goo.gl/maps/f1GdrA8ZXtpBrKrw5",
            "https://g.page/TheBiggestSundial?share",
            "https://goo.gl/maps/vCzZPgbNPudFZKwS6",
            "https://goo.gl/maps/V4GGJarmmyUB8dNW6",
            "https://goo.gl/maps/nSgKu5Rb4nzKjoqq8",
            "https://g.page/Powlstudio?share",
            "https://goo.gl/maps/mnxtkroMg41Kd5QU6",
            "https://goo.gl/maps/87VYojf36D93ewSA9",
            "https://g.page/TGAA-LEMBANG?share",
            "https://goo.gl/maps/qr594ayY2fhcJELdA",
            "https://goo.gl/maps/MVbL3L7DRrYCnVt5A",
            "https://g.page/thelodgemaribaya?share",
            "https://g.page/terminal-wisata-grafika-cikole?share",
            "https://goo.gl/maps/RySm6K8tYYFdg8dr8",
            "https://goo.gl/maps/e5sGCiMzBzw1RU9TA",
            "https://goo.gl/maps/3Uty1x9jFqfsTvLA7",
            "https://g.page/bosschaobservatory?share",
            "https://goo.gl/maps/jPjSGybm48757pit6",
            "https://goo.gl/maps/h1i3D3rHBPYVp6VCA"
    };



    private static int [] wisataThumbnailImage = {
            R.drawable.situ_ciburuy_thumb,
            R.drawable.curug_malela_thumb,
            R.drawable.puspa_iptek_thumb,
            R.drawable.sendang_geulis_thumb,
            R.drawable.puncak_eurad_thumb,
            R.drawable.curug_tilu_thumb,
            R.drawable.curug_cipanas_thumb,
            R.drawable.lembang_park_thumb,
            R.drawable.dusun_bambu_thumb,
            R.drawable.asia_afrika_thumb,
            R.drawable.de_ranch_thumb,
            R.drawable.farm_house_thumb,
            R.drawable.the_lodge_thumb,
            R.drawable.wisata_grafika_thumb,
            R.drawable.gunung_tangkuban_thumb,
            R.drawable.orchird_forest_thumb,
            R.drawable.floating_market_thumb,
            R.drawable.bosscha_thumb,
            R.drawable.taman_begonia_thumb,
            R.drawable.nu_art_thumb
    };

    private static int [] wisataPosterImage = {
            R.drawable.situ_ciburuy_pos,
            R.drawable.curug_malela_pos,
            R.drawable.puspa_iptek_pos,
            R.drawable.sendang_geulis_pos,
            R.drawable.puncak_eurad_pos,
            R.drawable.curug_tilu_pos,
            R.drawable.curug_cipanas_pos,
            R.drawable.lembang_park_pos,
            R.drawable.dusun_bambu_pos,
            R.drawable.asia_afrika_pos,
            R.drawable.de_ranch_pos,
            R.drawable.farm_house_pos,
            R.drawable.the_lodge_pos,
            R.drawable.wisata_grafika_pos,
            R.drawable.gunung_tangkuban_pos,
            R.drawable.orchird_forest_pos,
            R.drawable.floating_market_pos,
            R.drawable.bosscha_pos,
            R.drawable.taman_begonia_pos,
            R.drawable.nu_art_pos
    };

    public static ArrayList<Wisata> getListData(){
        ArrayList<Wisata> list = new ArrayList<>();
        for(int position = 0; position < namaWisata.length; position++){
            Wisata wisata = new Wisata();
            wisata.setId_wisata(idWisata[position]);
            wisata.setNama_wisata(namaWisata[position]);
            wisata.setDesc_wisata(deskripsiWisata[position]);
            wisata.setAlamat_wisata(lokasiWisata[position]);
            wisata.setHtm_wisata(htmWisata[position]);
            wisata.setJamBuka_wisata(jamBukaWisata[position]);
            wisata.setGmaps_wisata(gmapsWisata[position]);
            wisata.setPhotoThumbnail(wisataThumbnailImage[position]);
            wisata.setPhotoPoster(wisataPosterImage[position]);
            list.add(wisata);
        }
        return list;
    }

}
