package info.hijoyprogmob.Search;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

import info.hijoyprogmob.Account.Account;
import info.hijoyprogmob.Favorite.Favorite;
import info.hijoyprogmob.Home.Home;
import info.hijoyprogmob.News.News;
import info.hijoyprogmob.R;

public class Search extends AppCompatActivity{

    List<Produk> listProduk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        getListProduk();

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_grid);
        RecyclerViewGridAdapter myAdapter = new RecyclerViewGridAdapter(this, listProduk);
        myrv.setLayoutManager(new GridLayoutManager(this,2));
        myrv.setAdapter(myAdapter);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.search);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), Home.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.search:
                        return true;
                    case R.id.favorit:
                        startActivity(new Intent(getApplicationContext(), Favorite.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.news:
                        startActivity(new Intent(getApplicationContext(), News.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.account:
                        startActivity(new Intent(getApplicationContext(), Account.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

    }

    public void onCustomToogleClick(View view) {
        Toast.makeText(this,"Added to Favorite !", Toast.LENGTH_SHORT);
    }

    private void getListProduk() {

        listProduk = new ArrayList<>();
        listProduk.add(new Produk(
                " Canon PowerShot SX430 IS",
                "\t\t\t\tTarif Sewa:\n" +
                        "1 jam         = Rp 10.000\n" +
                        "8 jam         = Rp 60.000\n" +
                        "12 jam       = Rp 110.000\n" +
                        "1 hari        = Rp 130.000\n" +
                        "2 hari        = Rp 260.000\n" +
                        "3 hari        = Rp 320.000\n\n" +
                        "Kelengkapan\n" +
                        "•\t1 pcs - Canon PowerShot SX430 IS \n" +
                        "•\t1 pcs - Wrist Strap WS-DC12\n" +
                        "•\t1 pcs - Battery Pack NB-11LH \n" +
                        "•\t1 pcs - Battery Charger CB-2LFE \n" +
                        "•\t1 pcs - AC Cable 1 pcs - Lens Cap \n" +
                        "•\t1 pcs - User Manual Kit Canon PowerShot SX430 IS \n\n" +
                        "Spesifikasi;\n" +
                        "•\tCanon PowerShot SX430 IS dengan mudah menangkap detail cantik dengan kamera digital mini yang punya 45x zoom serta mudah dibawa kemana saja. \n" +
                        "•\tHasil Foto luar biasa dan pengambilan film HD pun mudah dengan Smart Auto dan cukup bagikan Aplikasi Canon Connect yang mudah di hubungkan pada smartphone menggunakan Wi-Fi dan NFC. \n" +
                        "•\tBig 45x zoom Tangkap setiap detail yang jauh menggunakan kamera Canon PowerShot SX430 IS mungil ini dengan zoom optik 45x yang besar. \n" +
                        "•\tMudah dibawa dan nyaman dipegang, Brilliant quality Nikmati gambar kenangan terbaik Anda yang luar biasa, berkat 20,0 Megapixels dan intelligent Image Stabilizer yang membuat stills photography Anda tetap tajam dan hasil film tetap steady. \n" +
                        "•\tsmart device sebagai remote yang mudah untuk menggunakan aplikasi Canon Connect. \n" +
                        "•\tmode kreatif yang mudah.\n" +
                        "•\t date stamp untuk melihat kapan moment tersebut diambil. Fun, easy HD movies Dengan mudah merekam film HD (720p) yang menyenangkan dan sharable dengan satu sentuhan tombol. \n\n"+
                        "Data Diri Seller\n" +
                        "•  Nama Seller    : Makkapa Stibisa\n" +
                        "•  Alamat Seller  : Jln Ke;uar disana, Gang Panjang , Peguyangan Kaja\n" +
                        "•  No. Hp         : 087543765234\n" +
                        "•  Email Seller   : Stibisa@gmail.com\n"
                 ,R.drawable.kamera1));
        listProduk.add(new Produk(
                "Lensa Nikon AF-S 18-105mm",
                "\t\t\t\tTarif Sewa:\n"+
                        "1 jam         = Rp 15.000\n" +
                        "8 jam         = Rp 50.000\n" +
                        "12 jam       = Rp 70.000\n" +
                        "1 hari        = Rp 120.000\n" +
                        "2 hari        = Rp 235.000\n" +
                        "3 hari        = Rp 350.000\n\n" +
                        "Nikon lensa 18-105 memiliki rentang panjang fokal lensa yang lebih jauh dibandingkan lensa 18-55mm. Tentunya ini menjadikan lensa ini salah satu lensa all around yang paling nyaman untuk diajak jalan-jalan. Rentang fokal lensanya setara 27-157,5mm di format full frame. Beberapa kelebihan lensa ini adalah tersedianya fitur VR yang mampu meredam getaran tangan saat memotret, serta elemen lensa ED yang memastikan kualitas foto lebih tajam.\n" +
                        "\n" +
                        "Spesifikasi :\n" +
                        "•\t5.8x Wide-angle to telephoto zoom\n" +
                        "•\tVibration Reduction\n" +
                        "•\tSilent Wave Motor\n" +
                        "•\tED (Extra-Low Dispersion) Glass\n" +
                        "•\tIF Lens\n" +
                        "\n" +
                        "Data Diri Seller :\n" +
                        "Nama seller       : Chicilia Paramitha\n" +
                        "Alamat seller     : Jln Pahlawan, Perum Bumi Ayu, Kediri, Tabanan\n" +
                        "Nomor hp          : 082367635899\n" +
                        "Email seller      :chicilia123@yahoo.com",
                R.drawable.lens1));
        listProduk.add(new Produk(
                "Tripod Weifeng WT-3150",
                "\t\t\t\tTarif Sewa:\n"+
                        "1 jam         = Rp10.000\n" +
                        "8 jam         = Rp50.000\n" +
                        "12 jam       = Rp100.000\n" +
                        "1 hari        = Rp150.000\n" +
                        "2 hari        = Rp250.000\n" +
                        "3 hari        = Rp300.000\n\n"+
                        "Tripod Weifeng WT-3150 merupakan tripod yang dapat digunakan secara mudah dan cepat karena ketinggian kaki yang dimiliki cukup optimal, sehingga mampu untuk menghemat banyak waktu ketika penggunaannya. Tripod ini sangat cocok untuk digunakan pada kamera DSLR, Mirrorless, Pocket, dan Camcorder. Kelebihan lainnya pada tripod ini yaitu mampu untuk menopang berat yang lumayan sehingga menjadikan tripod ini cocok untuk digunakan oleh banyak kamera DSLR.\n" +
                        "\n" +
                        "Spesifikasi dan fitur dari Tripod Weifeng WT-3150\n" +
                        "•\t3-way pan head dengan removable quick release plate\n" +
                        "•\t90 degree vertical plate\n" +
                        "•\tKolom tengah dioperasikan dengan crank handle untuk mengendalikannya naik turun\n" +
                        "•\tQuick release flip lock, non-slip rubber feet\n" +
                        "•\tCocok untuk semua Kamera dan Camcorder\n" +
                        "•\tTinggi Maksimal: 1290mm / 4.23ft\n" +
                        "•\tPanjang Terlipat: 445mm / 1.46ft\n" +
                        "•\tTinggi Minimal: 420mm / 1.38ft\n" +
                        "•\tDiameter kaki ( L x W ): 19.8mm\n" +
                        "•\tKapasitas  beban: 2.5 kg\n" +
                        "•\tMaterial: Aluminium Alloy\n" +
                        "\n" +
                        "Data Diri Seller\n" +
                        "•\tNama Seller     : Reza Theano\n" +
                        "•\tAlamat Seller   : Jln Mawar, Gang III, Denpasar Selatan\n" +
                        "•\tNo. Hp          : 087654345789\n" +
                        "•\tEmail Seller    : reza234@gmail.com",
                R.drawable.tripod1));
        listProduk.add(new Produk(
                "Baterai Olympus LI-90B",
                "\t\t\t\tTarif Sewa:\n"+
                        "1 jam         = Rp 10.000\n" +
                        "8 jam         = Rp 60.000\n" +
                        "12 jam       = Rp 110.000\n" +
                        "1 hari        = Rp 130.000\n" +
                        "2 hari        = Rp 260.000\n" +
                        "3 hari        = Rp 320.000\n\n"+
                        "Spesifikasi :\n" +
                        "•\tBerat : 100gr\n" +
                        "•\tAsuransi : Opsional\n" +
                        "•\tKondisi : Baru\n" +
                        "•\tPemesanan Min. : 1\n" +
                        "\n" +
                        "Data Diri Seller\n" +
                        "•\tNama Seller     : sasai\n" +
                        "•\tAlamat Seller   : Jln Nangka, Gang IV, Denpasar barat\n" +
                        "•\tNo. Hp               : 087644345765\n" +
                        "•\tEmail Seller      : sasai@gmail.com",
                R.drawable.baterai1));
        listProduk.add(new Produk(
                "Memory Card TCF 400x 8GB3",
                "\t\t\t\tTarif Sewa:\n"+
                        "1 jam         = Rp 5.000\n" +
                        "8 jam         = Rp 20.000\n" +
                        "12 jam       = Rp 30.000\n" +
                        "1 hari        = Rp 50.000\n" +
                        "2 hari        = Rp 70.000\n" +
                        "3 hari        = Rp 100.000\n\n"+
                        "Memory card Transcend CompactFlash 400X dengan UDMA7 yang merupakan interface tercepat yang ada pada teknologi memory card CF ini dan VPG-20 yang mampu memberikan jaminan peforma constant video recording pada 20MB/s tanpa dropping frames. Transfer speed read hingga 90MB/s dan write hingga 45MB/s. Transcend CompactFlash 400X UDM7 – VPG-20 ini tersedia kapasitas 16GB, 32GB, dan 64GB.\n" +
                        "\n" +
                        "Spesifikasi Transcend CompactFlash 400x 8GB\n" +
                        "•\tMemory Card Transcend CompactFlash 400X 8GB – Premium\n" +
                        "•\tUltra DMA (UDMA) Transfer Mode 7\n" +
                        "•\tRead up to 90 MB/s; Write up to 45 MB/s\n" +
                        "•\tVPG-20, Contant video recording at 20MB/s without dropping frames.\n" +
                        "•\tSmooth Full HD, 3D, and 4K (2160P) video recording performance\n" +
                        "•\tIdeal for use with mid-range DSLR cameras and camcorders\n" +
                        "•\tManufactured with brand-name MLC NAND Flash chips\n" +
                        "•\tBuilt-in Error Correcting Code (ECC)\n" +
                        "•\tLow Power Consumption\n" +
                        "•\tLimited Lifetime Warranty\n" +
                        "\n" +
                        "Data Diri Seller\n" +
                        "Nama seller       : Globa Kamera\n" +
                        "Alamat seller     : jl. Pantai Brawa, Kuta, Badung\n" +
                        "Nomor hp          : 082367635888\n" +
                        "Email seller      : global.kamera@yahoo.com",
                R.drawable.memory1));
        listProduk.add(new Produk(
                "Flash Yongnuo YN685 TTL",
                "\t\t\t\tTarif Sewa:\n"+
                        "1 jam         = Rp 10.000\n" +
                        "8 jam         = Rp 50.000\n" +
                        "12 jam       = Rp 80.000\n" +
                        "1 hari        = Rp 120.000\n" +
                        "2 hari        = Rp 200.000\n" +
                        "3 hari        = Rp 270.000\n\n"+
                        "Yongnuo YN685 TTL Speedlite for Nikon merupakan flash untuk kamera Nikon yang sudah built-in YN-622N transceiver radio, Yongnuo YN685 TTL Speedlite for Nikon menawarkan fungsionalitas radio slave lengkap yang bekerja dengan baik pada YN-622N dan sistem radio RF-603 / YN-560 untuk kompatibilitas maksimum dengan gear yang ada. Yongnuo YN685 TTL Speedlite for Nikon memiliki Manfaat yang lain karena dari kekuatannya yang menghasilkan rentang zoom wide yang nantinya akan mencakup 20-200mm di full frame, dan sudah built-in diffuser untuk lensa wide angle. Selain itu flash ini juga memiliki bounce penuh dengan kemiringan hingga 90 ° dan rotasi 180 ° ke kiri atau kanan.\n" +
                        "\n" +
                        "Spesifikasi dan fitur :\n" +
                        "•\tGHz Radio Slave System\n" +
                        "•\tSupport untuk YN-622N dan RF-603/YN-560\n" +
                        "•\tKompatibel dengan Nikon i-TTL\n" +
                        "•\tGuide Number: 197′ (60m) pada ISO 100 dan 200mm\n" +
                        "•\tZoom Range: 20-200mm\n" +
                        "•\tRecycle Time: 3 Seconds at Full Power\n" +
                        "•\tHigh-Speed, 1st dan 2nd Curtain Sync\n" +
                        "\n" +
                        "Data Diri Seller\n" +
                        "•\tNama Seller     : Wayan Kembang\n" +
                        "•\tAlamat Seller   : Panjer, Denpasar\n" +
                        "•\tNo. Hp          : 089880345112\n" +
                        "•\tEmail Seller    : wayan21@gmail.com",
                R.drawable.flash1));
        listProduk.add(new Produk(
                "Green L Filter CPL 52mm",
                "\t\t\t\tTarif Sewa:\n"+
                        "1 jam         = Rp 3.000\n" +
                        "8 jam         = Rp 20.000\n" +
                        "12 jam       = Rp 35.000\n" +
                        "1 hari        = Rp 60.000\n" +
                        "2 hari        = Rp 100.000\n" +
                        "3 hari        = Rp 140.000\n\n"+
                        "Green L Filter CPL 52mm adalah aksesori untuk lensa kamera Anda. Filter ini mampu meningkatkan kontras dan saturasi foto Anda, terutama untuk langit, awan, tanaman, bunga, dan sebagainya. Sinar cahaya yang dipantulkan oleh permukaan benda apa pun dan menjadi polarisasi. Filter Circular Polarizing (CPL) digunakan untuk memilih sinar cahaya yang dapat dimasukkan ke kamera atau lensa Anda. Memungkinkan Anda untuk menghapus pantulan yang tidak diinginkan dari permukaan benda non-logam seperti air atau kaca.Filter CPL ini terbuat dari bahan logam yang tahan lama, memiliki ukuran 52mm, filter optik kristal kualitas tinggi, serta pemasangan yang mudah ke lensa Anda. Kompatibel dengan kamera DSLR, kamera mirrorless, lensa camcorder DV.\n" +
                        "\n" +
                        "Spesifikasi Green Filter L CPL 52mm\n" +
                        "•\tFilter CPL\n" +
                        "•\tUkuran 52mm\n" +
                        "•\tMaterial logam\n" +
                        "•\tOptik kristal berkualitas\n" +
                        "•\tPemasangan mudah\n" +
                        "\n" +
                        "Data Diri Seller\n" +
                        "Nama seller       : Globa Kamera\n" +
                        "Alamat seller     : jl. Pantai Brawa, Kuta, Badung\n" +
                        "Nomor hp           : 082367635888\n" +
                        "Email seller        :global.kamera@yahoo.com",
                R.drawable.filter1));
        listProduk.add(new Produk(
                "Tas Ransel Kamera Canon ",
                "\t\t\t\tTarif Sewa:\n"+
                        "1 jam         = Rp 10.000\n" +
                        "8 jam         = Rp 50.000\n" +
                        "12 jam       = Rp 90.000\n" +
                        "1 hari        = Rp 100.000\n" +
                        "2 hari        = Rp 200.000\n" +
                        "3 hari        = Rp 300.000\n\n"+
                        "Spesifikasi:\n" +
                        "•\tMaterial D300Barang\n" +
                        "•\tTas Selempang Kamera\n" +
                        "•\tKompartemen Laptop 12 Inch\n" +
                        "•\tDesain Menarik\n" +
                        "•\tRain Coat\n" +
                        "\n" +
                        "Data Diri Seller\n" +
                        "•\tNama Seller     : Reza Theano\n" +
                        "•\tAlamat Seller   : Jln Mawar, Gang III, Denpasar Selatan\n" +
                        "•\tNo. Hp          : 087654345789\n" +
                        "•\tEmail Seller    : reza234@gmail.com",
                R.drawable.tas1));
        listProduk.add(new Produk(
                "APT Remote AP-TR2N",
                "\t\t\t\tTarif Sewa:\n"+
                        "1 jam         = Rp 10.000\n" +
                        "8 jam         = Rp 80.000\n" +
                        "12 jam       = Rp 100.000\n" +
                        "1 hari        = Rp 150.000\n" +
                        "2 hari        = Rp 200.000\n" +
                        "3 hari        = Rp 250.000\n\n"+
                        "Aputure Digital Timer Remote Cord adalah intervalometer yang didesain untuk kontrol presisi selang waktu eksposur. Hal ini memungkinkan pengguna untuk mengatur self timer, long exposure, frekuensi atau interval, dan picture count. Bisa juga pengambilan gambar secara terus menerus dengan eksposur. Waktu dapat diatur dari 1 detik sampai 99 jam. Sebuah tombol kontrol memudahkan pengguna memasukkan pengaturan numerik dan panel LCD backlight ketika malam hari untuk kenyamanan menembak atau shut.\n" +
                        "\n" +
                        "Spesifikasi dan fitur :\n" +
                        "•\tDigitally accurate time controls via LCD display\n" +
                        "•\tDelay, long exposure and interval time management functions\n" +
                        "•\tMulti photo numbering setting\n" +
                        "•\tMechanical shutter release mechanism works w/wo battery\n" +
                        "•\tLow power consumption\n" +
                        "•\tLCD panel can be illuminated in dark environments\n" +
                        "•\tDimension: 15.4cm (L) x 4cm (W) x 1.8 cm (D) (cord excluded)\n" +
                        "•\tDisplay: 1.2″ LCD Screen\n" +
                        "•\tColor: Black\n" +
                        "•\tCord Length: 80cm\n" +
                        "•\tPower Supply: One lithium CR2032 (3V) button battery\n" +
                        "•\tWeight: 105g\n" +
                        "\n" +
                        "Data Diri Seller\n" +
                        "•\tNama Seller\t    : Calista Rannia\n" +
                        "•\tAlamat Seller   : Perumahan Genta, Uluwatu Jimbaran\n" +
                        "•\tNo. Hp               : 089778562111\n" +
                        "•\tEmail Seller      : calisran@gmail.com",
                R.drawable.aksesoris1));
        listProduk.add(new Produk(
                "Penutup Lensa Kamera 49mm",
                "\t\t\t\tTarif Sewa:\n"+
                        "1 jam         = Rp 2.000\n" +
                        "8 jam         = Rp 8.000\n" +
                        "12 jam       = Rp 10.000\n" +
                        "1 hari        = Rp 20.000\n" +
                        "2 hari        = Rp 25.000\n" +
                        "3 hari        = Rp 30.000\n\n"+
                        "Lens Cap / Tutup Lensa Kamera ukuran 49mm dengan logo Canon bisa dipakai di semua tipe lensa dengan ukuran yang sama.\n" +
                        "Cocok Untuk Lensa Canon :\n" +
                        "- Kit 18-55mm\n" +
                        "- 50mm F1.4 USM\n" +
                        "- 85mm F1.8 USM\n" +
                        "\n" +
                        "Data Diri Seller\n" +
                        "•  Nama Seller    : Kiki\n" +
                        "•  Alamat Seller  : Jln Merak, Denpasar Barat\n" +
                        "•  No. Hp              : 081456783456\n" +
                        "•  Email Seller     : kik21ky@gmail.com",
                R.drawable.aksesoris2));
        listProduk.add(new Produk(
                "Kamera Canon DSLR 200D",
                "\t\t\t\tTarif Sewa:\n"+
                        "1 jam         = Rp 100.000\n" +
                        "8 jam         = Rp 120.000\n" +
                        "12 jam       = Rp 210.000\n" +
                        "1 hari        = Rp 240.000\n" +
                        "2 hari        = Rp 480.000\n" +
                        "3 hari        = Rp 500.000\n\n"+
                        "Kelengkapannya :\n" +
                        "•\tUnit\n" +
                        "•\tLensa\n" +
                        "•\tMemory\n" +
                        "•\tDus\n" +
                        "•\tBuku Manual\n" +
                        "•\tCD Driver\n" +
                        "•\tBaterai\n" +
                        "•\tCharger\n" +
                        "•\tKabel Power\n" +
                        "•\tBodycup\n" +
                        "•\tLensrear\n" +
                        "•\tUv Filter\n" +
                        "•\tTali Kamera\n" +
                        "•\tTutup Lensa\n\n"+
                        "Data Diri Seller\n" +
                        "•  Nama Seller     : Sulaiman Putri\n" +
                        "•  Alamat Seller   : Jln Nusa Indah, Gang AB, Ubung Kaja\n" +
                        "•  No. Hp               : 807654321345\n" +
                        "•  Email Seller      : Putri@gmail.com\"",
                R.drawable.kamera2));
        listProduk.add(new Produk(
                "Lensa Nikon AF-S 16-85mm",
                "\t\t\t\tTarif Sewa:\n"+
                        "1 jam         = Rp 20.000\n" +
                        "8 jam         = Rp 60.000\n" +
                        "12 jam       = Rp 80.000\n" +
                        "1 hari        = Rp 130.000\n" +
                        "2 hari        = Rp 245.000\n" +
                        "3 hari        = Rp 360.000\n\n"+
                        "Nikon AF-S 16-85mm f/3.5-5.6G ED DX VR memiliki rentang fokal mulai dari 16mm (lebih lebar dari rata-rata lensa kit 18mm), serta mencapai mid tele di 85mm (setara 127,5mm di kamera full frame). Kelebihan lensa ini adalah kemampuan VR generasi ke II yang dimilikinya, mampu menghasilkan foto tetap stabil di shutter speed rendah,  2 elemen lensa ED juga menjamin keunggulan hasil foto nantinya.\n" +
                        "\n" +
                        "Spesifikasi\n" +
                        "•\tLensa Kamera\n" +
                        "•\tTelephoto\n" +
                        "•\tJarak Minimum Focal : 16mm\n" +
                        "•\tJarak Maksimum Focal : 85mm\n" +
                        "•\tKompatibel : Nikon DSLR\n\n"+
                        "Data Diri Seller :\n" +
                        "Nama seller       : Siska Dewi\n" +
                        "Alamat seller     : Br. Cepaka, Kediri, Tabanan\n" +
                        "Nomor hp               :085342324522\n" +
                        "Email seller        : siskadewi@gmail.com\"",
                R.drawable.lens2));
        listProduk.add(new Produk(
                "Takara VIT-283 Tripod",
                "\t\t\t\tTarif Sewa:\n"+
                        "1 jam         = Rp 10.000\n" +
                        "8 jam         = Rp 60.000\n" +
                        "12 jam       = Rp 115.000\n" +
                        "1 hari        = Rp 170.000\n" +
                        "2 hari        = Rp 280.000\n" +
                        "3 hari        = Rp 350.000\n\n"+
                        "Takara VIT-283 Video Tripod merupakan tripod yang terbuat dari material aluminium + ABS Plastic, sehingga menjadikan tripod ini kokoh. Tripod Video ini sudah termasuk dengan Pan dan Spirit level di pan headnya, serta juga telah dilengkapi kaki yang lebih kuat dengan desain flip-lock dan Quick release plate yang mudah digunakan yang membantu memudahkan ketika dalam keadaan menyeimbangkan kamera.\n" +
                        "\n" +
                        "Spesifikasi dan fitur:\n" +
                        "•\t3 Way Pan Head\n" +
                        "•\tKaki yang lebih kuat dengan desain flip-lock\n" +
                        "•\tSudah termasuk Spirit level di pan head\n" +
                        "•\tQuick release plate yang mudah digunakan\n" +
                        "•\tTinggi Maksimal : 1710mm\n" +
                        "•\tKapasitas Beban : 3kg\n" +
                        "•\tSections : 3\n\n"+
                        "Data Diri Seller:\n" +
                        "•\tNama Seller     : Nuca Agasta\n" +
                        "•\tAlamat Seller   : Jln Sudirman, Gang IV, Tabanan\n" +
                        "•\tNo. Hp               : 085678990001\n" +
                        "•\tEmail Seller      : nucaagas@gmail.com\"",
                R.drawable.tripod2));
        listProduk.add(new Produk(
                "Baterai Kamera LP-E10",
                "\t\t\t\tTarif Sewa:\n"+
                        "1 jam         = Rp 10.000\n" +
                        "8 jam         = Rp 50.000\n" +
                        "12 jam       = Rp 120.000\n" +
                        "1 hari        = Rp 170.000\n" +
                        "2 hari        = Rp 230.000\n" +
                        "3 hari        = Rp 310.000\n\n"+
                        "Spesifikasi :\n" +
                        "- Replacement battery for Canon EOS 1100D 1200D 1300D Rebel T3 T5 T6 Kiss X50 X70\n" +
                        "- Pengganti baterai kamera Canon yang sudah rusak atau sebagai cadangan.\n" +
                        "- Dengan baterai ini Anda tidak perlu khawatir kehabisan daya baterai kamera pada saat pemotretan atau bepergian.\n\n"+
                        "Data Diri Seller\n" +
                        "•\tNama Seller     : sasa\n" +
                        "•\tAlamat Seller   : Jln Bengkuang, Gang G, Denpasar barat\n" +
                        "•\tNo. Hp               : 085434345789\n" +
                        "•\tEmail Seller      : sasa234@gmail.com",
                R.drawable.baterai2));
        listProduk.add(new Produk(
                "Transcend MicroSDHC 8 Gb",
                "\t\t\t\tTarif Sewa:\n"+
                        "1 jam         = Rp 7.000\n" +
                        "8 jam         = Rp 25.000\n" +
                        "12 jam       = Rp 35.000\n" +
                        "1 hari        = Rp 50.000\n" +
                        "2 hari        = Rp 80.000\n" +
                        "3 hari        = Rp 100.000\n\n"+
                        "Memory card Transcend microsdhc 8GB 300X ini sangat ideal untuk actioncam (Gopro/Yicam/BPro), smartphone, tablet, dan kamera digital. Dengan class 10 dan UHS-I (Ultra High Speed Class 1 Specification) mampu melakukan transfer speed read dan write hingga 45MB/s dengan minimum speed 10MB/s. Transcend MicroSDHC 300X Premium ini tersedia kapasitas 8GB, 16GB, dan 32GB.\n" +
                        "\n" +
                        "Spesifikasi :\n" +
                        "•\tTranscend Micro SDHC 8GB 600X Class 10 – Ultimate\n" +
                        "•\tSupport UHS-I (Ultra High Speed Class 1)\n" +
                        "•\tUp to 90MB/s\n" +
                        "•\tIdeal for actioncam, smartphones, tablets, and other mobile device users\n" +
                        "•\tSmooth Full HD video recording performance\n" +
                        "•\tCompatible with devices with microSD, microSDHC and microSDXC slot\n" +
                        "•\tExclusive RecoveRx photo recovery software\n" +
                        "•\tEasy to use, plug-and-play operation\n" +
                        "•\tFully compatible with SD 3.01 standards\n" +
                        "•\tBuilt-in Error Correcting Code (ECC) to detect and correct transfer errors\n\n"+
                        "Data Diri Seller\n" +
                        "Nama seller     : Terry Krist\n" +
                        "Alamat seller   : Br. Dualang, Kediri, Tabanan\n" +
                        "Nomor hp            :0855467824522\n" +
                        "Email seller      : kristterry@gmail.com",
                R.drawable.memory2));
        listProduk.add(new Produk(
                "Canon 600EX-RT Speedlite",
                "\t\t\t\tTarif Sewa:\n"+
                        "1 jam         = Rp 20.000\n" +
                        "8 jam         = Rp 150.000\n" +
                        "12 jam       = Rp 200.000\n" +
                        "1 hari        = Rp 250.000\n" +
                        "2 hari        = Rp 350.000\n" +
                        "3 hari        = Rp 400.000\n\n"+
                        "Canon 600EX-RT Speedlite Flash menawarkan berbagai zoom range dan Guide Number yang tinggi, ditambah ada beberapa perbaikan atas pendahulunya dari segi pengoperasian dan nuansa. Dilengkapi fitur panel LCD dot-matrix baru yang mampu menampilkan semua shooting information yang terkait, ditambah kontrol backlit dengan generator suara internal dan color filter holder baru yang membantu menjaga warna yang akurat dalam berbagai kondisi cahaya ambient.\n" +
                        "\n" +
                        "Spesifikasi dan fitur :\n" +
                        "•\tGHz Wireless Radio Transmission\n" +
                        "•\tKompatible untuk Canon E-TTL / E-TTL II\n" +
                        "•\tGuide Number: 197′ (60.05 m) pada ISO 100 dan 200mm\n" +
                        "•\tRecycle Time: 0.1-5.5 Seconds\n" +
                        "•\tSupport High-Speed, 1st dan 2nd Curtain Sync\n\n"+
                        "Data Diri Seller\n" +
                        "•\tNama Seller     : Galang Arabani\n" +
                        "•\tAlamat Seller   : Denpasar Barat\n" +
                        "•\tNo. Hp               : 081678901234\n" +
                        "•\tEmail Seller      : arbani456@gmail.com",
                R.drawable.flash2));
        listProduk.add(new Produk(
                "Marumi FitSlim 52mm Filter",
                "\t\t\t\tTarif Sewa:\n"+
                        "1 jam         = Rp 1.000\n" +
                        "8 jam         = Rp 5.000\n" +
                        "12 jam       = Rp 9.000\n" +
                        "1 hari        = Rp 15.000\n" +
                        "2 hari        = Rp 30.000\n" +
                        "3 hari        = Rp 40.000",
                R.drawable.filter2));
        listProduk.add(new Produk(
                "Tas Segitiga Mirrorless",
                "\t\t\t\tTarif Sewa:\n"+
                        "1 jam         = Rp 10.000\n" +
                        "8 jam         = Rp 50.000\n" +
                        "12 jam       = Rp 100.000\n" +
                        "1 hari        = Rp 150.000\n" +
                        "2 hari        = Rp 250.000\n" +
                        "3 hari        = Rp 300.000\n\n"+
                        "Spesifikasi:\n" +
                        "•\tCocok digunakan bagi anda yang ingin bepergian tanpa repot membawa backpack.\n" +
                        "•\tSangat simple dan mudah dibawa, dapat memuat 1 buah body DSLR dengan lensa kit standar terpasang.Ditambah 2 wadah tambahan di sisi samping yang dapat memuat aksesoris tambahan seperti batere, memory card, dll.\n" +
                        "•\tukuran :\n" +
                        "    - p x l x t = 15 x 10 x 20 cm\n" +
                        "•\tTerdiri dari :\n" +
                        "    - 1 kantong utama,\n" +
                        "    - 2 kantong samping (1 kiri, 1 kanan),\n" +
                        "    - 1 kantong jaring depan\n" +
                        "•\tTersedia warna\n" +
                        "    - Merah\n" +
                        "    - Kuning\n\n"+
                        "Data Diri Seller\n" +
                        "•\tNama Seller\t    : Ririn Nur\n" +
                        "•\tAlamat Seller   : Jln Kosong, Gang III, Denpasar Selatan\n" +
                        "•\tNo. Hp               : 087656378268\n" +
                        "•\tEmail Seller      : nuririn@gmail.com",
                R.drawable.tas2));
        listProduk.add(new Produk(
                "Zhiyun Remote Control",
                "\t\t\t\tTarif Sewa:\n"+
                        "1 jam         = Rp 15.000\n" +
                        "8 jam         = Rp 100.000\n" +
                        "12 jam       = Rp 150.000\n" +
                        "1 hari        = Rp 260.000\n" +
                        "2 hari        = Rp 320.000\n" +
                        "3 hari        = Rp 400.000\n\n"+
                        "Zhiyun Remote Control for Crane-2 merupakan remote control yang dilengkapi dengan wireless control dengan teknologi 2.4GHz jarak jauh hingga 10 meter dan High-precision follow focus dengan tombol putar, mencapai kontrol yang tepat dengan merasakan sedikit variasi sudut, White marking ring dirancang dengan material luminous yang mendukung untuk mengarahkan pemotretan pengguna di malam hari. Selain itu, Zhiyun Remote Control for Crane-2 juga memiliki runtime 25 jam dengan Parameter yang divisualisasikan ditampilkan pada layar OLED intuitif seperti mode gimbal, tingkat baterai, dan bluetooth status.\n" +
                        "\n" +
                        "Spesifikasi dan fitur :\n" +
                        "•\tOperating Distance\t: Up to 33′ / 10 m\n" +
                        "•\tBattery: Li-Ion: 900 mAh\n" +
                        "•\tOperating Time: Approx. 25 hours\n" +
                        "•\tCharging Current: 1500 mAh\n" +
                        "•\tCharging Voltage: 5 VDC\n" +
                        "•\tCharging Time: Approx. 1.5 hours\n" +
                        "•\tConnection Type: Wired: USB, Wireless: Bluetooth\n" +
                        "•\tDimensions\t6.5 x 1 x 2.5″ / 16.5 x 2.5 x 6.4 cm\n" +
                        "•\tWeight\t12 oz / 340 g\n\n"+
                        "Data Diri Seller\n" +
                        "•\tNama Seller\t    : Morgan Keenan\n" +
                        "•\tAlamat Seller   : Denpasar\n" +
                        "•\tNo. Hp               : 081234678990\n" +
                        "•\tEmail Seller      : morgaan@gmail.com",
                R.drawable.aksesoris3));
        listProduk.add(new Produk(
                "Digital Remote AP-TR3L",
                "\t\t\t\tTarif Sewa:\n"+
                        "1 jam         = Rp 10.000\n" +
                        "8 jam         = Rp 80.000\n" +
                        "12 jam       = Rp 100.000\n" +
                        "1 hari        = Rp 150.000\n" +
                        "2 hari        = Rp 200.000\n" +
                        "3 hari        = Rp 250.000\n\n"+
                        "Aputure Digital Timer Remote Cord adalah intervalometer yang didesain untuk kontrol presisi selang waktu eksposur. Hal ini memungkinkan pengguna untuk mengatur self timer, long exposure, frekuensi atau interval, dan picture count. Bisa juga pengambilan gambar secara terus menerus dengan eksposur. Waktu dapat diatur dari 1 detik sampai 99 jam. Sebuah tombol kontrol memudahkan pengguna memasukkan pengaturan numerik dan panel LCD backlight ketika malam hari untuk kenyamanan menembak atau shut.\n" +
                        "\n" +
                        "Spesifikasi dan fitur :\n" +
                        "•\tDimension: 15.4cm (L) x 4cm (W) x 1.8 cm (D) (cord excluded)\n" +
                        "•\tDisplay: 1.2″ LCD Screen\n" +
                        "•\tColor: Black\n" +
                        "•\tCord Length: 80cm\n" +
                        "•\tPower Supply: One lithium CR2032 (3V) button battery\n" +
                        "•\tWeight: 105g\n\n"+
                        "Data Diri Seller\n" +
                        "•\tNama Seller\t    : Dode Angkasa\n" +
                        "•\tAlamat Seller   : Perumahan Taman Asri, Denpasar\n" +
                        "•\tNo. Hp               : 087890909881\n" +
                        "•\tEmail Seller      : cdode@gmail.com",
                R.drawable.aksesoris4));
        listProduk.add(new Produk(
                "Kamera Canon DSLR E50",
                "\t\t\t\tTarif Sewa:\n"+
                        "1 jam         = Rp 50.000\n" +
                        "8 jam         = Rp 70.000\n" +
                        "12 jam       = Rp 80.000\n" +
                        "1 hari        = Rp 120.000\n" +
                        "2 hari        = Rp 180.000\n" +
                        "3 hari        = Rp 230.000\n\n"+
                        "Spesifikasi:\n" +
                        "•\tKamera berfungsi baik\n" +
                        "•\tFlash nyala\n" +
                        "•\tOptik aman bersih.\n" +
                        "•\tKondisi sesuai gambar\n" +
                        "•\tKaret usb ada normal\n" +
                        "•\tTombol responsif\n" +
                        "•\tLcd terang normal\n" +
                        "•\tLensa normal af mf normal diagfrahma klik\n" +
                        "•\tBersih bebas jamur\n" +
                        "\n" +
                        "Kelengkapan :\n" +
                        "•\tUnit kamera\n" +
                        "•\tLensa\n" +
                        "•\tCap\n" +
                        "•\tBaterai.\n" +
                        "•\tCharger.\n" +
                        "•\tTali\n\n"+
                        "Data Diri Seller\n" +
                        "•  Nama Seller     : Koko Mia\n" +
                        "•  Alamat Seller   : Jln Jalak Bali, Gang Katak, Kuta Utara\n" +
                        "•  No. Hp               : 089765456765\n" +
                        "•  Email Seller      : KokoM@gmail.com",
                R.drawable.kamera3));
        listProduk.add(new Produk(
                "Lensa Olympus 75-300mm",
                "\t\t\t\tTarif Sewa:\n"+
                        "1 jam         = Rp 30.000\n" +
                        "8 jam         = Rp 70.000\n" +
                        "12 jam       = Rp 90.000\n" +
                        "1 hari        = Rp 150.000\n" +
                        "2 hari        = Rp 300.000\n" +
                        "3 hari        = Rp 430.000\n\n"+
                        "Olympus Lensa 75-300mm II f/4.8-6.7 merupakan Lensa Kamera dengan tipe lensa Micro Four Thirds yang memiliki jarak focal minimal f/22 dan maksimal f/4.8 - 6.7, Focal Length yaitu 75 - 300mm, minimun focus yaitu 2.95 inch(90 cm). Lensa kamera ini dilengkapi dengan fitur one Super ED (extra-low dispersion) dan two ED lens elements, Three HR (high-refractive index) elements, dan ZERO (Zuiko Extra-Low Reflection Optical).\n" +
                        "Spesifikasi :\n" +
                        "•\tTipe lensa : Micro Four Thirds\n" +
                        "•\tJarak focal : minimal f/22 dan maksimal f/4.8 - 6.7\n" +
                        "•\tOne Super ED (extra-low dispersion) dan two ED lens elements\n" +
                        "•\tThree HR (high-refractive index) elements\n" +
                        "•\tZERO (Zuiko Extra-Low Reflection Optical)\n\n"+
                        "Data Diri Seller :\n" +
                        "Nama seller       : Putu Rina Yanti\n" +
                        "Alamat seller     : Perumahan Graha Anyar, Jimbaran\n" +
                        "Nomor hp               :081526637234\n" +
                        "Email seller        : putu.rina065@yahoo.com",
                R.drawable.lens3));
        listProduk.add(new Produk(
                "Tripod Q555 Locking Leg",
                "\t\t\t\tTarif Sewa:\n"+
                        "1 jam         = Rp 20.000\n" +
                        "8 jam         = Rp 150.000\n" +
                        "12 jam       = Rp 250.000\n" +
                        "1 hari        = Rp 350.000\n" +
                        "2 hari        = Rp 400.000\n" +
                        "3 hari        = Rp 450.000\n\n"+
                        "Tripod Beike Q555 Locking Leg merupakan tripod kamera DSLR yang cocok digunakan untuk segala merk kamera seperti Canon, Nikon, Sony, Olympus dan banyak lainnya. Desain dan build quality yang sangat baik menjadikan tripod ini kokoh kuat dan stabil saat digunakan dalam pengambilan foto. Tripod kamera ini berbahan alumunium alloy yang kuat namun tetap ringan sehingga memudahkan jika dibawa bepergian. Panjang saat dilipat hanya 35cm sehingga mudah dibawa karena bisa masuk kedalam tas. Kaki tripod ini juga bisa dijadikan monopod dengan cara melepas salah satu kaki dan ballhead tripod ini.\n" +
                        "\n" +
                        "Spesifikasi dan fitur:\n" +
                        "•\tTinggi maksimal: 1440mm\n" +
                        "•\tTinggi minimal: 440mm\n" +
                        "•\tMax kapasitas beban: 8 kg\n" +
                        "•\tDilipat panjang: 350mm\n\n"+
                        "Data Diri Seller:\n" +
                        "•\tNama Seller\t    : Leo Andika\n" +
                        "•\tAlamat Seller   : Jln. Jaya Sakti, Gianyar\n" +
                        "•\tNo. Hp               : 082345611234\n" +
                        "•\tEmail Seller      : elelo@gmail.com",
                R.drawable.tripod3));
        listProduk.add(new Produk(
                "Charger Nikon MH-23",
                "\t\t\t\tTarif Sewa:\n"+
                        "1 jam         = Rp 10.000\n" +
                        "8 jam         = Rp 50.000\n" +
                        "12 jam       = Rp 900.000\n" +
                        "1 hari        = Rp 170.000\n" +
                        "2 hari        = Rp 210.000\n" +
                        "3 hari        = Rp 310.000\n\n"+
                        "Charger Nikon MH-23 For Baterai Nikon EN-EL9/EN-EL9A Kamera Nikon D40 D40X D60 D3000 D5000)\n" +
                        "    Kelengkapan Paket :\n" +
                        "    - 1x Charger Nikon MH-23\n" +
                        "    - 1x Kabel AC\n" +
                        "    - 1x Pacing/Dus Standar\n" +
                        "\n" +
                        "Spesifikasi :\n" +
                        "•\tModel : Nikon MH-23\n" +
                        "•\tInput : 100-240V~50/60Hz 0.18-0.105A\n" +
                        "•\tOutput : 8.4V - 0.9A\n\n"+
                        "Data Diri Seller\n" +
                        "•\tNama Seller     : Joko\n" +
                        "•\tAlamat Seller   : Jln Pisang, Gang III, Denpasar barat\n" +
                        "•\tNo. Hp               : 0876443458765\n" +
                        "•\tEmail Seller      : jokowiw@gmail.com",
                R.drawable.baterai3));
        listProduk.add(new Produk(
                "Lexar SDHC UHS-I 633x",
                "\t\t\t\tTarif Sewa:\n"+
                        "1 jam         = Rp 10.000\n" +
                        "8 jam         = Rp 30.000\n" +
                        "12 jam       = Rp 50.000\n" +
                        "1 hari        = Rp 70.000\n" +
                        "2 hari        = Rp 120.000\n" +
                        "3 hari        = Rp 150.000\n\n"+
                        "Performa kecepatan tinggi Lexar Professional 633x SDHC/SDXC UHS-I card secara dramatis mempercepat alur kerja Anda dari awal hingga akhir, sehingga Anda dapat menghemat waktu dan kembali ke bisnis fotografi. Semua kartu memori Lexar Professional dilengkapi dengan garansi limited lifetime dan didukung oleh dukungan teknis ahli. Semua desain produk Lexar menjalani pengujian ekstensif di Lexar Quality Labs, fasilitas dengan lebih dari 1.100 perangkat digital, untuk memastikan kinerja, kualitas, kompatibilitas, dan keandalan.\n" +
                        "\n" +
                        "Spesifikasi Lexar SDHC UHS-I 633x (95Mbps) 16GB\n" +
                        "•\tHigh-speed, Class 10 UHS-I technology (U1 atau U3 berdasar kapasitas), read transfer speed hingga 633x (95MB/s)\n" +
                        "•\tTangkap gambar berkualitas tinggi dan panjang video 1080p full-HD, 3D, dan 4K yang menakjubkan dengan kamera DSLR, camcorder HD, atau kamera 3D\n" +
                        "•\tTransfer file berkecepatan tinggi dari kartu ke komputer untuk secara dramatis mempercepat alur kerja\n" +
                        "•\tDidukung oleh dukungan teknis ahli dan garansi limited lifetime\n\n"+
                        "Data Diri Seller\n" +
                        "Nama seller       : RilaYanti\n" +
                        "Alamat seller     : Goa Gong, Jimbaran\n" +
                        "Nomor hp           :081526637265\n" +
                        "Email seller        : rilayanti5@yahoo.com",
                R.drawable.memory3));
        listProduk.add(new Produk(
                "Godox Speedlite TT-685",
                "\t\t\t\tTarif Sewa:\n"+
                        "1 jam         = Rp 20.000\n" +
                        "8 jam         = Rp 160.000\n" +
                        "12 jam       = Rp 210.000\n" +
                        "1 hari        = Rp 240.000\n" +
                        "2 hari        = Rp 350.000\n" +
                        "3 hari        = Rp 400.000\n\n"+
                        "Godox Speedlite TT-685 Canon merupakan flash TTL untuk Kamera Canon dengan fitur lengkap seperti sudah HSS, support Mode TTL, ada radio receiver 2.4GHz, dan fitur unggulan lainnya. Flash Godox TT-685 Canon merupakan solusi Flash TTL dengan harga murah. Flash Godox Speedlite TT-685 Canon memiliki GN60 (m ISO 100, @200mm). 22 step dari 1/1 to 1/128, konsistensi jepretan Cahaya Flash yang stabil dan suhu warna yang baik untuk pencahayaan.\n" +
                        "\n" +
                        "Spesifikasi dan fitur :\n" +
                        "•\tGN 60 (m ISO 100)\n" +
                        "•\tHasil Jepretan Flash di Klaim lebih Stabil\n" +
                        "•\tDilengkapi HSS to 1/8000th\n" +
                        "•\tDilengkapi Flash Mode TTL /Manual / Multi\n" +
                        "•\tRecycle Time yang cepat, 2.6 Second hingga full power\n" +
                        "•\tGaransi Resmi 1 Tahun yang mudah di Klaim\n" +
                        "•\tKompatibel dengan Kamera DSLR Canon Series: Canon 1300D, Canon 700D, Mirrorless Canon M3 dan Canon M5\n\n"+
                        "Data Diri Seller\n" +
                        "•\tNama Seller     : Jessica Stephani\n" +
                        "•\tAlamat Seller   : Ubud\n" +
                        "•\tNo. Hp               : 083178301234\n" +
                        "•\tEmail Seller      : jejesss@gmail.com",
                R.drawable.flash3));
        listProduk.add(new Produk(
                "Green L Filter ND8 52mm",
                "\t\t\t\tTarif Sewa:\n"+
                        "1 jam         = Rp 3.000\n" +
                        "8 jam         = Rp 20.000\n" +
                        "12 jam       = Rp 35.000\n" +
                        "1 hari        = Rp 60.000\n" +
                        "2 hari        = Rp 100.000\n" +
                        "3 hari        = Rp 140.000",
                R.drawable.filter3));
        listProduk.add(new Produk(
                "Tas Ransel Kamera DSLR",
                "\t\t\t\tTarif Sewa:\n"+
                        "1 jam         = Rp 10.000\n" +
                        "8 jam         = Rp 50.000\n" +
                        "12 jam       = Rp 100.000\n" +
                        "1 hari        = Rp 150.000\n" +
                        "2 hari        = Rp 250.000\n" +
                        "3 hari        = Rp 300.000\n\n"+
                        "Spesifikasi:\n" +
                        "•\tAnti air.\n" +
                        "•\tDilengkapi tali jinjingan yang diperkuat.\n" +
                        "•\tResleting yang tersembunyi, sehingga aman dari hujan maupun debu.\n\n"+
                        "Data Diri Seller\n" +
                        "•\tNama Seller     : Theano\n" +
                        "•\tAlamat Seller   : Jln Mawar, Gang III, Denpasar Selatan\n" +
                        "•\tNo. Hp               : 082434345789\n" +
                        "•\tEmail Seller      : 234@gmail.com",
                R.drawable.tas3));
        listProduk.add(new Produk(
                "Charger Canon LC-E17",
                "\t\t\t\tTarif Sewa:\n"+
                        "1 jam         = Rp 4.000\n" +
                        "8 jam         = Rp 30.000\n" +
                        "12 jam       = Rp 35.000\n" +
                        "1 hari        = Rp 50.000\n" +
                        "2 hari        = Rp 75.000\n" +
                        "3 hari        = Rp 100.000\n\n"+
                        "Kompetibel for Kamera Canon :\n" +
                        "            750D, 760D, M3, M5 and others\n\n" +
                        "Data Diri Seller\n" +
                        "•  Nama Seller    : Santini\n" +
                        "•  Alamat Seller  : Jl. Bukit Agung No 3, Denpasar\n" +
                        "•  No. Hp              : 08345765336\n" +
                        "•  Email Seller     : santiniaris@gmail.com",
                R.drawable.aksesoris5));
        listProduk.add(new Produk(
                "Wired Remote Switch AP-R1S",
                "\t\t\t\tTarif Sewa:\n"+
                        "1 jam         = Rp 10.000\n" +
                        "8 jam         = Rp 75.000\n" +
                        "12 jam       = Rp 115.000\n" +
                        "1 hari        = Rp 235.000\n" +
                        "2 hari        = Rp 300.000\n" +
                        "3 hari        = Rp 350.000\n\n"+
                        "Aputure AP-R1S adalah remote Kabel untuk kamera Sony tipe A500/A550/A850/A900/A380/A200 yang memungkinkan pengguna untuk me-remote kamera tanpa shaking atau guncangan, dan lebih mudah untuk mengambil gambar. Remote ini juga sangat berguna untuk mengambil selfportrait, dan mengambil gambar dengan long exposure. Aputure AP-R1S ini memiliki 2 mode atau stage release button, yang pertama half-press atau setengah shutter untuk mencari focus, fully-press atau full shutter untuk megambil gambar.\n" +
                        "\n" +
                        "Spesifikasi dan fitur :\n" +
                        "•\tUntuk kamera Sony A500/A550/A850/A900/A380/A200\n" +
                        "•\t1 meter cable\n" +
                        "•\tSingle Shoot to continuous\n" +
                        "•\tBulb / Long exposure\n\n"+
                        "Data Diri Seller\n" +
                        "•\tNama Seller\t    : Budiman Santoso\n" +
                        "•\tAlamat Seller   : Tabanan\n" +
                        "•\tNo. Hp               : 083456789009\n" +
                        "•\tEmail Seller    : budimann@gmail.com",
                R.drawable.aksesoris6));
    }
}
