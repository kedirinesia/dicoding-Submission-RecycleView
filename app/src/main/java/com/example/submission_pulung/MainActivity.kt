package com.example.submission_pulung

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: PlayerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        adapter = PlayerAdapter(getPlayers()) { player ->
            val intent = Intent(this, DetailActivity::class.java).apply {
                putExtra("PLAYER", player)
            }
            startActivity(intent)

        }

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }

    private fun getPlayers(): List<Player> {

        return listOf(
            Player("Cristiano Ronaldo", "Striker", R.drawable.ronaldo,
                "Cristiano Ronaldo dos Santos Aveiro, lebih dikenal sebagai Cristiano Ronaldo, lahir pada 5 Februari 1985 di Funchal, Madeira, Portugal. Ia adalah seorang pesepakbola profesional asal Portugal yang secara luas dianggap sebagai salah satu pemain terbaik sepanjang masa. Sejak kecil, Ronaldo menunjukkan bakat yang luar biasa dalam sepak bola. Dia bergabung dengan tim lokal Andorinha, dan kemudian klub Nacional, sebelum pindah ke Sporting CP untuk mengembangkan kemampuannya di tingkat profesional.\n" +
                        "\n" +
                        "Ronaldo dikenal karena kecepatan, kekuatan fisik, teknik tinggi, dan naluri mencetak gol yang luar biasa. Karier profesionalnya di level tertinggi dimulai ketika ia bergabung dengan Manchester United pada tahun 2003, setelah dilihat oleh Sir Alex Ferguson dalam pertandingan persahabatan melawan Sporting CP. Di United, ia memenangkan tiga gelar Liga Primer Inggris, satu Liga Champions UEFA, dan berbagai penghargaan individu seperti Ballon d'Or pertamanya pada tahun 2008. Ronaldo juga memenangkan FIFA World Player of the Year pada tahun yang sama.\n" +
                        "\n" +
                        "Pada tahun 2009, ia pindah ke Real Madrid dengan nilai transfer €94 juta, yang saat itu menjadi rekor dunia. Di Real Madrid, Ronaldo mengalami masa keemasan, memenangkan empat gelar Liga Champions UEFA, dua gelar La Liga, dan beberapa penghargaan Ballon d'Or tambahan. Selama waktunya di Madrid, ia menjadi pencetak gol terbanyak sepanjang masa klub, mencetak 451 gol dalam 438 pertandingan. Setelah sembilan tahun bersama Real Madrid, Ronaldo bergabung dengan Juventus pada tahun 2018 dengan nilai transfer €100 juta, dan di sana ia memenangkan dua gelar Serie A dan beberapa penghargaan pencetak gol terbanyak.\n" +
                        "\n" +
                        "Di tingkat internasional, Ronaldo telah menjadi kapten tim nasional Portugal sejak 2008. Ia membawa Portugal memenangkan Piala Eropa 2016 dan Liga Negara UEFA 2019, menjadikannya pemain kunci dalam sejarah sepak bola Portugal. Ia juga mencatat rekor sebagai pencetak gol terbanyak sepanjang masa di tingkat internasional, memecahkan rekor gol Ali Daei dari Iran.\n" +
                        "\n" +
                        "Cristiano Ronaldo terkenal dengan dedikasinya terhadap kebugaran fisik dan diet ketat yang memungkinkannya tetap kompetitif meskipun usianya terus bertambah. Pada usia 30-an, ia tetap menjadi salah satu pemain tercepat dan terkuat dalam olahraga ini. Ronaldo juga merupakan ikon global dengan banyak sponsor dan dukungan dari merek besar, seperti Nike, dan memiliki merek fesyen serta parfum dengan namanya.\n" +
                        "\n" +
                        "Dengan kepribadiannya yang ambisius dan tekad yang kuat, Ronaldo memiliki penggemar setia di seluruh dunia dan pengaruh besar di media sosial. Kehadirannya di dunia sepak bola tidak hanya menginspirasi generasi pemain muda tetapi juga membawa dampak besar pada budaya olahraga secara global."),
            Player("Messi", "Attacker MidFielder", R.drawable.messi,
                "Lionel Andrés Messi, lahir pada 24 Juni 1987 di Rosario, Argentina, adalah seorang pesepakbola profesional Argentina yang secara luas dianggap sebagai salah satu pemain terbaik sepanjang masa. Dari masa kecil, Messi sudah menunjukkan bakat luar biasa dalam sepak bola, namun menghadapi tantangan medis ketika didiagnosis dengan kekurangan hormon pertumbuhan pada usia 11 tahun. Barcelona, klub Spanyol, menawarkan untuk membiayai perawatan medis Messi dengan syarat ia pindah ke Spanyol dan bergabung dengan akademi sepak bola mereka, La Masia.\n" +
                        "\n" +
                        "Messi memulai karier profesionalnya di tim utama Barcelona pada tahun 2004, dan sejak itu, ia mengukir sejarah sebagai pencetak gol terbanyak sepanjang masa klub dengan 672 gol dalam 778 pertandingan. Ia memenangkan sepuluh gelar La Liga, tujuh Copa del Rey, dan empat Liga Champions UEFA selama waktunya di Barcelona. Kariernya di Barcelona juga diwarnai dengan berbagai penghargaan individu, termasuk enam Ballon d'Or dan enam Sepatu Emas Eropa, mencerminkan pencapaiannya yang luar biasa di lapangan. Messi dikenal karena kemampuan dribelnya yang lincah, visi permainan yang tajam, serta kemampuannya mencetak gol dari sudut-sudut yang sulit.\n" +
                        "\n" +
                        "Setelah hampir dua dekade di Barcelona, Messi meninggalkan klub pada 2021 karena krisis keuangan yang dialami klub, yang menghalangi Barcelona memperbarui kontraknya sesuai dengan aturan keuangan La Liga. Ia kemudian bergabung dengan Paris Saint-Germain (PSG) di Prancis. Di PSG, ia melanjutkan kariernya bersama beberapa bintang top dunia dan menambah koleksi trofi pribadinya.\n" +
                        "\n" +
                        "Di tingkat internasional, Messi memulai debutnya untuk tim nasional Argentina pada 2005 dan sejak itu telah menjadi pemimpin dan ikon nasional. Ia membawa Argentina memenangkan Copa America pada 2021, gelar besar pertama Argentina dalam 28 tahun, serta Piala Dunia FIFA 2022, di mana ia dianugerahi penghargaan Pemain Terbaik turnamen. Di sepanjang kariernya bersama timnas, ia juga menjadi pencetak gol terbanyak dalam sejarah Argentina.\n" +
                        "\n" +
                        "Messi dikenal karena ketenangannya, fokus, dan kesetiaannya kepada keluarganya. Di luar lapangan, ia memiliki berbagai kontrak sponsor dengan merek-merek besar seperti Adidas dan Pepsi, serta mendirikan yayasan amal untuk membantu anak-anak dalam pendidikan dan kesehatan. Messi juga memiliki ketertarikan pada bisnis, termasuk investasi di properti dan hotel.\n" +
                        "\n" +
                        "Dengan pengaruhnya yang mendunia dan reputasinya yang sangat positif, Messi menginspirasi jutaan orang di seluruh dunia, baik di kalangan penggemar maupun pemain muda. Perjalanannya dari anak kecil di Rosario hingga menjadi salah satu pemain terbesar dalam sejarah sepak bola menunjukkan dedikasi, kerja keras, dan bakat luar biasa yang menjadikannya seorang legenda hidup."),
            Player("Neymar Jr", "Forward", R.drawable.neymar,
                "Neymar da Silva Santos Júnior, lebih dikenal sebagai Neymar, lahir pada 5 Februari 1992 di Mogi das Cruzes, São Paulo, Brasil. Neymar adalah seorang pesepakbola profesional Brasil yang diakui sebagai salah satu pemain paling berbakat dan berpengaruh di dunia. Dikenal karena gaya bermainnya yang flamboyan, kemampuan dribel yang menakjubkan, serta keterampilannya dalam mencetak gol, Neymar menjadi ikon sepak bola global sejak usia muda.\n" +
                        "\n" +
                        "Sejak kecil, Neymar menunjukkan bakat luar biasa dalam sepak bola. Ia memulai kariernya di akademi sepak bola Santos FC, di mana ia mengembangkan keterampilan dribelnya yang khas dan gaya bermain kreatif yang memikat banyak penggemar. Debut profesionalnya dengan Santos pada usia 17 tahun segera membawanya ke perhatian internasional. Di Santos, Neymar memenangkan beberapa gelar domestik dan Copa Libertadores, yang membawa Santos ke kejuaraan Amerika Selatan untuk pertama kalinya sejak era legendaris Pele. Prestasi ini menjadikannya salah satu bintang muda yang paling diburu klub-klub besar Eropa.\n" +
                        "\n" +
                        "Pada tahun 2013, Neymar bergabung dengan Barcelona dalam transfer yang sangat dipublikasikan. Di sana, ia membentuk trio ikonik dengan Lionel Messi dan Luis Suárez, yang dikenal sebagai \"MSN.\" Bersama-sama, mereka memenangkan berbagai gelar, termasuk treble yang terdiri dari La Liga, Copa del Rey, dan Liga Champions UEFA pada musim 2014–2015. Neymar sendiri mencetak gol penting di final Liga Champions dan terus tampil gemilang selama empat musim bersama Barcelona.\n" +
                        "\n" +
                        "Pada tahun 2017, Neymar membuat sejarah dengan pindah ke Paris Saint-Germain (PSG) dengan nilai transfer €222 juta, yang masih menjadi rekor transfer termahal dunia hingga saat ini. Di PSG, Neymar terus tampil mengesankan dengan membantu klub memenangkan berbagai gelar Ligue 1 dan membawa PSG ke final Liga Champions untuk pertama kalinya pada tahun 2020. Meskipun sering mengalami cedera, Neymar tetap menjadi pusat serangan PSG dan salah satu pemain dengan gaji tertinggi di dunia.\n" +
                        "\n" +
                        "Sebagai anggota tim nasional Brasil, Neymar juga memiliki peran sentral sejak debutnya pada 2010. Ia menjadi kapten tim dan membawa Brasil memenangkan medali emas di Olimpiade Rio 2016, sebuah pencapaian bersejarah bagi Brasil. Selain itu, Neymar adalah salah satu pencetak gol terbanyak dalam sejarah tim nasional Brasil, mendekati rekor Pele.\n" +
                        "\n" +
                        "Di luar lapangan, Neymar dikenal dengan kepribadiannya yang energik dan pengaruh besarnya di media sosial. Ia memiliki jutaan pengikut di seluruh platform, menjadikannya salah satu atlet paling terkenal di dunia. Dengan kontrak endorsement besar seperti dengan Puma dan Red Bull, Neymar juga terlibat dalam berbagai kampanye komersial dan memiliki citra global sebagai ikon gaya hidup. \n" +
                        "\n" +
                        "Neymar sering mendapat sorotan, baik karena kemampuannya yang luar biasa maupun gaya hidupnya yang penuh warna. Namun, dia tetap menjadi inspirasi bagi banyak anak muda di Brasil dan di seluruh dunia yang bermimpi menjadi pemain sepak bola profesional. Perjalanan Neymar dari anak muda di Brasil hingga menjadi salah satu pemain terbaik dunia menunjukkan dedikasi, keterampilan, dan semangat yang tak terbantahkan untuk permainan ini."),
            Player("Kylian Mbappe", "Forward", R.drawable.mbappe,
                "Kylian Mbappé Lottin, lebih dikenal sebagai Kylian Mbappé, lahir pada 20 Desember 1998 di Bondy, Paris, Prancis. Mbappé adalah seorang pesepakbola profesional Prancis yang dikenal sebagai salah satu pemain muda terbaik di dunia. Dengan kecepatan luar biasa, keterampilan teknis yang tajam, dan naluri mencetak gol yang memukau, Mbappé telah mengukir namanya sebagai bintang sepak bola global sejak awal kariernya.\n" +
                        "\n" +
                        "Mbappé mulai menunjukkan bakat sepak bolanya sejak kecil, terinspirasi oleh ayahnya yang bekerja sebagai agen pemain dan ibunya yang merupakan mantan pemain handball. Ia bergabung dengan akademi sepak bola lokal AS Bondy sebelum pindah ke klub-klub besar seperti Clairefontaine, akademi sepak bola nasional Prancis. Di usia remaja, Mbappé bergabung dengan AS Monaco, di mana ia memulai karier profesionalnya pada tahun 2015.\n" +
                        "\n" +
                        "Pada musim 2016-2017, Mbappé mencetak nama besar dengan tampil luar biasa di Monaco, membantu timnya memenangkan gelar Ligue 1 pertama mereka dalam 17 tahun dan mencapai semifinal Liga Champions UEFA. Dengan penampilan gemilangnya, Mbappé menarik perhatian klub-klub besar Eropa, dan pada 2017 ia bergabung dengan Paris Saint-Germain (PSG) dengan status pinjaman yang kemudian permanen pada tahun 2018. Transfer ini mengukuhkan Mbappé sebagai salah satu pemain muda paling berharga di dunia, dengan nilai transfer yang dilaporkan mencapai €180 juta, menjadikannya pemain termahal kedua dalam sejarah saat itu.\n" +
                        "\n" +
                        "Di PSG, Mbappé segera menjadi bintang utama, memenangkan berbagai gelar Ligue 1, Coupe de France, dan Coupe de la Ligue. Ia juga menjadi pencetak gol terbanyak di Ligue 1 pada beberapa musim dan terus menambah jumlah trofinya, termasuk meraih penghargaan Pemain Terbaik Ligue 1 dan Sepatu Emas Eropa. Kecepatan dan kemampuan dribelnya yang memukau serta visi permainan yang luar biasa menjadikannya pemain yang sulit dihentikan di lapangan.\n" +
                        "\n" +
                        "Di level internasional, Mbappé mencetak sejarah dengan tim nasional Prancis. Ia memulai debutnya pada 2017 dan menjadi bagian penting dalam kemenangan Prancis di Piala Dunia 2018 di Rusia, di mana ia mencetak gol di final melawan Kroasia dan memenangkan penghargaan Pemain Muda Terbaik Turnamen. Kemenangan ini membuat Mbappé menjadi salah satu pemain termuda dalam sejarah yang memenangkan Piala Dunia, dan ia dianggap sebagai penerus bintang-bintang sepak bola legendaris Prancis.\n" +
                        "\n" +
                        "Selain prestasi di lapangan, Mbappé dikenal dengan sikap rendah hati, dedikasi, dan kecintaannya pada keluarga serta masyarakat. Ia sering terlibat dalam kegiatan amal, membantu anak-anak dan keluarga yang kurang beruntung di Prancis dan di seluruh dunia. Dengan kepribadian yang santai namun penuh ambisi, Mbappé menjadi ikon di luar lapangan, terutama bagi generasi muda yang mengidolakan perjalanan kariernya.\n" +
                        "\n" +
                        "Pada usia yang masih sangat muda, Mbappé telah mencatatkan banyak rekor dan meraih berbagai penghargaan, menjadikannya salah satu pemain sepak bola terbaik di dunia saat ini. Kecepatan, keterampilan teknis, dan kemampuannya untuk tampil di momen-momen penting menjadikannya pemain yang dipandang sebagai penerus bagi pemain-pemain legendaris seperti Pele dan Messi. Dengan banyak pencapaian yang sudah diraih dan masih banyak yang bisa dicapai, Mbappé berada di puncak dunia sepak bola dan berpotensi untuk terus meraih kesuksesan di masa depan."),
            Player("Kevin De Bruyne", "Midfielder", R.drawable.de_bruyne,
                "Kevin De Bruyne, yang sering disingkat KDB, lahir pada 28 Juni 1991 di Ghent, Belgia. Ia adalah seorang pesepakbola profesional Belgia yang dikenal sebagai salah satu gelandang terbaik dunia, dengan kemampuan teknis luar biasa, visi permainan yang tajam, dan kemampuan untuk menciptakan peluang gol bagi rekan setimnya. De Bruyne dikenal karena umpan-umpannya yang akurat, tendangan jarak jauh yang mematikan, dan gaya bermain yang penuh kreativitas.\n" +
                        "\n" +
                        "De Bruyne memulai karier sepak bolanya di akademi Genk, klub Belgia, di mana ia mulai mendapatkan perhatian berkat kemampuannya yang menonjol. Setelah debut profesionalnya dengan Genk, ia menunjukkan potensi besar yang membawanya pindah ke Chelsea pada 2012. Namun, waktu De Bruyne di Chelsea tidak berlangsung lama, karena ia kesulitan mendapatkan tempat utama di tim. Setelah dipinjamkan ke Werder Bremen di Bundesliga Jerman selama satu musim, De Bruyne menunjukkan kualitas terbaiknya dengan menjadi salah satu gelandang terbaik di liga tersebut.\n" +
                        "\n" +
                        "Pada 2014, setelah tampil mengesankan di Jerman, De Bruyne bergabung dengan VfL Wolfsburg di Bundesliga, di mana ia berkembang pesat. Di Wolfsburg, De Bruyne menjadi pusat serangan tim, mencetak gol dan memberikan assist dalam jumlah besar. Penampilannya yang brilian di sana menarik perhatian klub-klub besar, dan pada 2015, ia pindah ke Manchester City dengan nilai transfer yang mencatatkan rekor untuk klub tersebut. Di City, De Bruyne menemukan tempat yang tepat untuk mengembangkan permainannya lebih jauh, di bawah manajer Pep Guardiola.\n" +
                        "\n" +
                        "Sejak bergabung dengan Manchester City, De Bruyne menjadi pemain kunci dalam sistem permainan Guardiola. Ia membantu City meraih berbagai gelar domestik, termasuk empat gelar Liga Premier Inggris, dua Piala FA, dan lima Piala Liga Inggris. De Bruyne dikenal sebagai pengatur permainan yang sempurna, dengan umpan-umpan silang dan long pass yang sangat akurat, serta visi luar biasa yang memungkinkan dia menciptakan peluang gol bagi rekan setimnya. Ia juga beberapa kali meraih penghargaan Pemain Terbaik Liga Inggris dan masuk dalam tim terbaik Liga Premier.\n" +
                        "\n" +
                        "Di tingkat internasional, De Bruyne adalah pemain penting bagi tim nasional Belgia. Ia debut bersama Belgia pada 2010 dan telah menjadi bagian integral dari \"Generasi Emas\" Belgia yang telah mencapai kesuksesan besar di turnamen internasional. De Bruyne berperan besar dalam perjalanan Belgia menuju posisi ketiga di Piala Dunia 2018, dan ia terus menjadi salah satu pemain terbaik dalam skuad Belgia, dikenal dengan kemampuannya untuk mengatur aliran permainan dan memberikan assist yang luar biasa.\n" +
                        "\n" +
                        "De Bruyne juga dikenal dengan kepribadiannya yang rendah hati dan kecintaannya pada keluarga. Meskipun statusnya sebagai salah satu pemain sepak bola terbaik dunia, ia tetap sederhana dan fokus pada pengembangan diri di dalam dan luar lapangan. Di luar sepak bola, De Bruyne terlibat dalam berbagai kegiatan amal dan memiliki minat besar terhadap dunia teknologi dan game.\n" +
                        "\n" +
                        "Dengan kemampuan teknis, kecerdasan di lapangan, dan kontribusi luar biasa dalam kesuksesan Manchester City dan Belgia, Kevin De Bruyne telah mengukuhkan dirinya sebagai salah satu gelandang terbaik di dunia sepak bola. Keahliannya dalam mengatur permainan dan menciptakan peluang membuatnya menjadi pemain yang sangat dihormati oleh penggemar sepak bola di seluruh dunia."),

            Player("Virgil van Dijk", "Defender", R.drawable.van_dijk,
                "Virgil van Dijk, lahir pada 8 Juli 1991 di Breda, Belanda, adalah seorang pesepakbola profesional Belanda yang diakui sebagai salah satu bek tengah terbaik dunia. Dikenal karena kekuatan fisiknya, kemampuan duelnya yang sangat baik, serta kemampuannya dalam membaca permainan, Van Dijk telah menjadi pilar utama dalam pertahanan tim Liverpool dan tim nasional Belanda. Selain itu, ia juga memiliki kemampuan untuk mencetak gol lewat sundulan kepala yang mematikan dan kemampuan dalam membawa bola ke depan.\n" +
                        "\n" +
                        "Van Dijk memulai karier sepak bolanya di akademi Willem II di Belanda, tempat ia mengembangkan keterampilan dasar yang akhirnya membawanya ke tim utama klub tersebut. Setelah beberapa musim di Willem II, Van Dijk pindah ke FC Groningen di 2011, di mana performanya yang solid menarik perhatian klub-klub besar di Eropa. Kepindahannya ke skuat utama Celtic pada 2013 menjadi langkah penting dalam kariernya, di mana ia berkembang pesat di bawah manajer Neil Lennon dan memenangkan beberapa gelar domestik di Skotlandia, termasuk gelar Premiership Skotlandia.\n" +
                        "\n" +
                        "Pada 2015, Van Dijk bergabung dengan Southampton di Liga Premier Inggris. Di sana, ia semakin menunjukkan kualitasnya sebagai bek tengah yang luar biasa, membuktikan diri sebagai salah satu bek terbaik di liga. Kehebatannya dalam duel udara, kemampuan mengorganisasi lini belakang, dan ketenangannya saat menguasai bola menjadikannya sosok yang sulit dilewati oleh penyerang lawan. Performanya di Southampton menarik perhatian banyak klub besar, dan pada Januari 2018, ia pindah ke Liverpool dengan nilai transfer yang memecahkan rekor untuk bek pada saat itu.\n" +
                        "\n" +
                        "Di Liverpool, Van Dijk segera menjadi pemain kunci dalam pertahanan tim. Dengan kemampuannya yang luar biasa dalam bertahan, ia membantu mengubah lini belakang Liverpool menjadi salah satu yang terkuat di dunia. Kepemimpinan dan ketenangannya membuatnya menjadi sosok yang tak tergantikan dalam skema permainan Jurgen Klopp. Van Dijk berperan penting dalam kesuksesan Liverpool, termasuk memenangkan Liga Champions UEFA pada 2019, serta meraih gelar Liga Premier Inggris pada musim 2019-2020, trofi pertama liga utama Liverpool dalam 30 tahun. Ia juga membantu Liverpool menjuarai Piala Dunia Antarklub FIFA dan Super Eropa.\n" +
                        "\n" +
                        "Van Dijk juga menjadi pemain penting di tim nasional Belanda, yang ia bela sejak 2015. Ia menjabat sebagai kapten tim nasional dan berperan dalam membawa Belanda ke final Liga Negara UEFA pada 2019, meski akhirnya kalah dari Portugal. Sebagai pemimpin tim, Van Dijk dikenal memiliki pengaruh besar di luar lapangan, dengan sikap tenang dan kepemimpinan yang menginspirasi rekan-rekannya.\n" +
                        "\n" +
                        "Di luar lapangan, Van Dijk dikenal dengan sikap rendah hati dan dedikasinya terhadap keluarga. Ia juga terlibat dalam berbagai kegiatan amal dan sosial, khususnya yang berkaitan dengan anak-anak dan pendidikan. Meskipun memiliki karier yang cemerlang, ia tetap menjaga privasi dan fokus pada permainan.\n" +
                        "\n" +
                        "Dengan prestasi yang gemilang, Van Dijk telah membuktikan dirinya sebagai salah satu bek terbaik dalam sejarah sepak bola. Perjalanannya dari pemain muda yang kurang dikenal di Belanda hingga menjadi pemimpin pertahanan Liverpool dan tim nasional Belanda menunjukkan dedikasi, kerja keras, dan kualitas yang luar biasa. Van Dijk tidak hanya diakui karena kemampuannya dalam bertahan, tetapi juga karena sikapnya yang profesional dan kontribusinya yang besar di lapangan."),
            Player("Mohamed Salah", "Forward", R.drawable.salah,
                "Mohamed Salah, yang lebih dikenal dengan Mo Salah, lahir pada 15 Juni 1992 di Nagrig, Mesir. Salah adalah seorang pesepakbola profesional Mesir yang dikenal sebagai salah satu penyerang paling mematikan di dunia sepak bola. Dikenal karena kecepatan luar biasa, kemampuan dribelnya yang cerdas, dan naluri mencetak gol yang tajam, Salah telah menjadi ikon global, baik di klub maupun di level internasional, terutama setelah bergabung dengan Liverpool FC.\n" +
                        "\n" +
                        "Salah memulai karier sepak bolanya di klub lokal El Mokawloon, di Mesir, sebelum pindah ke Eropa pada 2012, bergabung dengan FC Basel di Swiss. Di Basel, Salah mulai menarik perhatian dengan gaya bermainnya yang mengesankan dan kemampuan mencetak gol yang brilian. Keberhasilan di Basel membuatnya mendapatkan kontrak dengan Chelsea pada 2014, meski di Chelsea ia kesulitan mendapatkan waktu bermain yang konsisten. Setelah masa pinjaman ke klub-klub seperti Fiorentina dan AS Roma di Italia, Salah menemukan kesuksesan besar di Serie A.\n" +
                        "\n" +
                        "Di AS Roma, Salah berkembang menjadi salah satu penyerang terbaik di liga tersebut, mencetak gol-gol penting dan menciptakan peluang bagi rekan-rekannya. Penampilannya yang luar biasa di Roma membuka jalan baginya untuk bergabung dengan Liverpool pada 2017, dengan transfer yang kemudian terbukti menjadi salah satu yang paling menguntungkan dalam sejarah klub. Di Liverpool, Salah langsung menunjukkan kemampuannya dengan mencetak gol-gol spektakuler dan membawa tim meraih berbagai gelar penting.\n" +
                        "\n" +
                        "Salah menjadi pahlawan utama Liverpool dalam meraih Liga Champions UEFA pada 2019, mencetak gol penalti penting di final melawan Tottenham Hotspur. Ia juga memainkan peran kunci dalam membantu Liverpool memenangkan gelar Liga Premier Inggris pada 2020, mengakhiri penantian 30 tahun untuk trofi liga utama. Selain itu, Salah telah membantu Liverpool meraih Piala Dunia Antarklub FIFA, Super Eropa, dan Piala Liga Inggris.\n" +
                        "\n" +
                        "Di level internasional, Salah adalah kapten tim nasional Mesir dan menjadi pahlawan bagi negaranya. Ia memimpin Mesir ke final Piala Afrika 2017 dan membawa tim ke Piala Dunia FIFA 2018, yang menjadi pencapaian besar bagi sepak bola Mesir. Meskipun menghadapi tantangan dan cedera di beberapa kesempatan, Salah tetap menjadi sosok penting dalam tim nasional, dikenal dengan kemampuannya untuk mencetak gol-gol krusial dan kepemimpinan di luar lapangan.\n" +
                        "\n" +
                        "Di luar lapangan, Salah dikenal dengan kepeduliannya terhadap masyarakat, khususnya dalam bidang amal. Ia sering terlibat dalam berbagai proyek sosial di Mesir, termasuk sumbangan untuk membangun rumah sakit dan fasilitas pendidikan. Salah juga dikenal dengan sikap rendah hatinya, meskipun telah mencapai banyak kesuksesan besar di dunia sepak bola.\n" +
                        "\n" +
                        "Dengan kemampuan teknis yang luar biasa, dedikasi yang tinggi, dan mentalitas juara, Mohamed Salah telah menjadi salah satu pemain sepak bola terbaik di dunia. Perjalanan kariernya dari seorang anak muda di Mesir hingga menjadi bintang dunia di Liverpool dan tim nasional Mesir menunjukkan kerja keras, ketekunan, dan komitmen untuk mencapai impian. Salah tidak hanya diakui karena kemampuannya di lapangan, tetapi juga karena sikap positif dan kontribusinya yang besar kepada masyarakat."),
            Player("Robert Lewandowski", "Striker", R.drawable.lewandowski,
                "Robert Lewandowski, lahir pada 21 Agustus 1988 di Warsawa, Polandia, adalah salah satu penyerang terbaik dan paling produktif dalam sejarah sepak bola. Dikenal dengan kemampuan mencetak gol yang luar biasa, kemampuan teknik yang brilian, dan fisik yang kuat, Lewandowski telah menjadi simbol ketangguhan dan dedikasi dalam dunia sepak bola. Dengan naluri mencetak gol yang mematikan, ia dikenal sebagai salah satu striker paling lengkap dan konsisten di level klub dan internasional.\n" +
                        "\n" +
                        "Lewandowski memulai karier sepak bolanya di akademi sepak bola lokal, Znicz Pruszków, sebelum pindah ke Lech Poznań, klub besar di Polandia, pada 2008. Di sana, ia mulai menunjukkan bakat luar biasa yang membawa perhatian dari klub-klub top Eropa. Penampilannya yang menonjol di Lech Poznań membuatnya bergabung dengan Borussia Dortmund di Bundesliga Jerman pada 2010, di bawah arahan manajer Jürgen Klopp.\n" +
                        "\n" +
                        "Di Borussia Dortmund, Lewandowski berkembang menjadi salah satu penyerang terbaik di Eropa, membantu tim meraih dua gelar Bundesliga berturut-turut pada 2011 dan 2012. Lewandowski memainkan peran kunci dalam kesuksesan Dortmund, termasuk penampilan luar biasa di Liga Champions UEFA, di mana ia mencetak gol-gol spektakuler dan membawa Dortmund ke final 2013, meskipun akhirnya kalah dari Bayern Munich.\n" +
                        "\n" +
                        "Pada 2014, Lewandowski pindah ke Bayern Munich dengan status bebas transfer. Di Bayern, Lewandowski menjelma menjadi mesin pencetak gol yang tak terbendung. Ia memecahkan rekor demi rekor, termasuk menjadi pencetak gol terbanyak dalam sejarah Bundesliga dan mencatatkan jumlah gol yang luar biasa di setiap musim. Lewandowski telah membantu Bayern memenangkan banyak gelar, termasuk delapan gelar Bundesliga berturut-turut, Liga Champions UEFA 2020, serta berbagai trofi domestik lainnya seperti Piala DFB dan Piala Super Eropa.\n" +
                        "\n" +
                        "Lewandowski dikenal karena kemampuannya mencetak gol dari berbagai cara, baik dengan kaki kanan, kiri, atau kepala, serta kemampuannya untuk membaca permainan dan berada di tempat yang tepat. Kecepatan dan kekuatannya dalam duel udara menjadikannya penyerang yang sangat sulit dihentikan oleh bek lawan. Ia juga memiliki kecerdasan dalam mengatur alur serangan dan sering memberikan assist bagi rekan setimnya.\n" +
                        "\n" +
                        "Di level internasional, Lewandowski adalah kapten tim nasional Polandia dan menjadi pencetak gol terbanyak sepanjang masa untuk negaranya. Ia telah mewakili Polandia di banyak turnamen besar, termasuk Piala Dunia dan Piala Eropa, dan memainkan peran penting dalam membimbing timnya ke berbagai tahap penting dalam kompetisi internasional. Lewandowski adalah simbol kebanggaan bagi Polandia dan dianggap sebagai salah satu pemain terbaik yang pernah dimiliki negara tersebut.\n" +
                        "\n" +
                        "Di luar lapangan, Lewandowski dikenal dengan sikap rendah hati dan dedikasinya terhadap olahraga dan keluarga. Ia sangat terlibat dalam berbagai kegiatan amal, terutama yang berkaitan dengan pendidikan dan pemberdayaan anak-anak. Lewandowski juga memiliki minat di luar sepak bola, termasuk di dunia bisnis, dan sering terlibat dalam proyek-proyek yang bertujuan untuk meningkatkan kualitas hidup di Polandia.\n" +
                        "\n" +
                        "Lewandowski telah mendapatkan banyak penghargaan individu, termasuk Pemain Terbaik Bundesliga, Pemain Terbaik Eropa, dan banyak penghargaan lainnya yang mengakui kontribusinya luar biasa dalam dunia sepak bola. Dengan dedikasi, konsistensi, dan kemampuan mencetak gol yang tak terbantahkan, Robert Lewandowski telah mengukuhkan dirinya sebagai salah satu striker terbaik sepanjang masa."),
            Player("Sergio Ramos", "Defender", R.drawable.sergioramos,
                "Sergio Ramos, lahir pada 30 Maret 1986 di Camas, Spanyol, adalah salah satu bek tengah paling terkenal dan berpengaruh dalam sejarah sepak bola. Dikenal karena keberanian, kepemimpinan, dan kemampuan bertahannya yang luar biasa, Ramos telah menjadi ikon baik di klub maupun tim nasional. Dengan naluri gol yang tak terduga untuk seorang bek dan sikap agresifnya, Ramos telah memenangkan banyak trofi penting, menjadikannya salah satu pemain yang paling dihormati dalam dunia sepak bola.\n" +
                        "\n" +
                        "Ramos memulai karier sepak bolanya di akademi Sevilla FC, tempat ia mengembangkan bakatnya sebagai bek muda. Debut profesionalnya dengan Sevilla terjadi pada 2004, dan ia segera menunjukkan potensi besar yang membuatnya menjadi bek muda yang diperhitungkan di Spanyol. Setelah hanya dua musim di Sevilla, Ramos pindah ke Real Madrid pada 2005 dengan transfer yang memecahkan rekor untuk seorang bek pada saat itu. Kepindahannya ke Madrid menandai dimulainya salah satu karier paling sukses dalam sejarah sepak bola.\n" +
                        "\n" +
                        "Di Real Madrid, Ramos langsung menjadi pemain inti, memainkan peran penting dalam pertahanan klub. Selama hampir dua dekade, ia menjadi simbol kekuatan, ketangguhan, dan semangat juang di lini belakang Madrid. Ramos dikenal dengan kemampuannya dalam duel udara, kepemimpinan yang luar biasa, serta ketenangannya dalam situasi krisis. Selain itu, ia juga memiliki insting untuk mencetak gol, terutama dalam situasi-situasi penting, dan sering mencetak gol melalui sundulan kepala yang mematikan. Ramos telah mencetak lebih dari 100 gol untuk Madrid, sebuah prestasi yang sangat jarang dilakukan oleh seorang bek.\n" +
                        "\n" +
                        "Ramos telah memenangkan banyak trofi bersama Real Madrid, termasuk lima gelar La Liga, empat Liga Champions UEFA, serta trofi domestik dan internasional lainnya. Salah satu momen paling bersejarah dalam kariernya adalah gol penyama kedudukan yang dia cetak di menit-menit terakhir pada final Liga Champions 2014 melawan Atletico Madrid, yang akhirnya membawa Madrid meraih trofi setelah kemenangan 4-1 di perpanjangan waktu. Ramos juga dikenal dengan kemampuannya membawa timnya meraih kemenangan di pertandingan besar dan sebagai kapten yang memimpin dengan teladan.\n" +
                        "\n" +
                        "Di level internasional, Ramos adalah salah satu pemain terpenting dalam sejarah tim nasional Spanyol. Sejak debutnya pada 2005, Ramos telah menjadi bagian integral dari generasi emas Spanyol yang memenangkan Piala Dunia 2010 dan dua gelar Kejuaraan Eropa (2008 dan 2012). Sebagai kapten, Ramos memainkan peran penting dalam keberhasilan Spanyol dan merupakan simbol stabilitas dan kepemimpinan di pertahanan. Ramos juga menjadi salah satu pemain dengan jumlah caps terbanyak untuk tim nasional Spanyol.\n" +
                        "\n" +
                        "Di luar lapangan, Ramos dikenal dengan kepribadiannya yang karismatik dan kehidupannya yang sangat publik, terutama hubungannya dengan keluarga dan peranannya sebagai figur yang sangat dihormati dalam sepak bola. Selain itu, Ramos terlibat dalam berbagai kegiatan amal dan sosial, khususnya yang berhubungan dengan anak-anak dan pendidikan.\n" +
                        "\n" +
                        "Dengan lebih dari 180 gol yang dicetak untuk klub dan negara, serta berbagai gelar yang telah diraihnya, Sergio Ramos telah membuktikan dirinya sebagai salah satu bek terbaik yang pernah ada. Kekuatan fisiknya, ketajaman nalurinya, dan kepemimpinan yang luar biasa menjadikannya seorang legenda dalam sejarah sepak bola."),
            Player("Eden Hazard", "Winger", R.drawable.hazard,
                "Eden Hazard, lahir pada 7 Januari 1991 di La Louvière, Belgia, adalah salah satu pemain sepak bola paling berbakat dan dinamis dalam dunia sepak bola. Dikenal dengan keterampilan dribbling yang luar biasa, visi permainan yang brilian, dan kemampuannya untuk menciptakan peluang, Hazard telah menjadi pemain kunci di berbagai klub besar Eropa dan tim nasional Belgia. Dengan gaya bermain yang lincah dan kecepatan yang mengesankan, ia telah menjadikan dirinya sebagai salah satu pemain sayap terbaik di dunia.\n" +
                        "\n" +
                        "Hazard memulai karier sepak bolanya di akademi sepak bola lokal di Belgia, R. Olympique Mouscron, sebelum pindah ke Lille OSC di Prancis pada usia 14 tahun. Di Lille, ia segera menunjukkan bakatnya dan membuat debut profesionalnya pada 2007. Hazard menjadi bintang muda di Ligue 1, di mana ia mencatatkan sejumlah penampilan mengesankan dan membantu Lille meraih gelar Liga Prancis (Ligue 1) pada 2011, serta Piala Prancis dan Piala Liga Prancis pada tahun yang sama. Penampilan luar biasa ini membawanya menjadi salah satu pemain muda terbaik di Eropa, dengan banyak klub top Eropa tertarik untuk mendapatkan jasanya.\n" +
                        "\n" +
                        "Pada 2012, Hazard bergabung dengan Chelsea FC di Liga Premier Inggris, di mana ia segera menunjukkan kualitasnya. Di Chelsea, Hazard berkembang menjadi salah satu pemain paling berpengaruh di klub. Dengan kemampuan dribbling yang mengesankan, ketajaman dalam mencetak gol, dan kecerdasannya dalam memberi assist, Hazard menjadi pemain kunci dalam meraih berbagai gelar untuk Chelsea, termasuk dua gelar Premier League, dua Piala FA, dan Liga Europa pada 2013 dan 2019. Salah satu pencapaian terbesar Hazard di Chelsea adalah menjadi Pemain Terbaik Liga Premier pada musim 2014-2015, setelah memimpin Chelsea meraih gelar liga.\n" +
                        "\n" +
                        "Kemampuan Hazard untuk beradaptasi dengan berbagai peran di lini serang – baik sebagai sayap kiri, gelandang serang, maupun penyerang – membuatnya menjadi pemain yang sangat fleksibel dan sulit diprediksi oleh lawan. Dia memiliki kemampuan luar biasa dalam menggiring bola melewati pemain lawan, serta ketajaman dalam mencetak gol dari berbagai posisi. Tak jarang, dia juga menjadi sosok yang mengubah jalannya pertandingan dengan aksi individu atau assist brilian untuk rekannya.\n" +
                        "\n" +
                        "Pada 2019, setelah memenangi berbagai trofi bersama Chelsea, Hazard pindah ke Real Madrid dengan biaya transfer yang memecahkan rekor untuk klub Spanyol pada saat itu. Meskipun mengalami masa-masa sulit akibat cedera di awal kariernya di Madrid, Hazard tetap dianggap sebagai salah satu pemain dengan potensi besar untuk sukses di Spanyol. Meski cedera mengganggu sebagian besar kariernya di Madrid, Hazard tetap menunjukkan bahwa ia memiliki keterampilan dan kualitas untuk bersaing di level tertinggi.\n" +
                        "\n" +
                        "Di level internasional, Hazard adalah pemain penting bagi tim nasional Belgia. Sejak debutnya pada 2008, ia telah menjadi pemain kunci bagi \"Setan Merah\", memimpin mereka ke semifinal Piala Dunia 2018 dan meraih peringkat ketiga, pencapaian terbaik mereka dalam sejarah Piala Dunia. Hazard juga merupakan pemimpin tim nasional Belgia dan berperan penting dalam kesuksesan mereka di berbagai turnamen internasional, termasuk Kejuaraan Eropa dan Liga Negara UEFA.\n" +
                        "\n" +
                        "Di luar lapangan, Hazard dikenal dengan sikap rendah hati dan fokus pada keluarga. Ia juga memiliki minat dalam kegiatan amal, terutama yang berkaitan dengan anak-anak dan kesejahteraan sosial. Dengan gaya hidup yang sederhana, Hazard lebih memilih untuk menjaga privasi keluarganya dan tetap mengutamakan sepak bola di atas segalanya.\n" +
                        "\n" +
                        "Hazard memiliki banyak penghargaan individual sepanjang kariernya, termasuk Pemain Terbaik Liga Premier, Pemain Terbaik Belgia, dan berbagai penghargaan lainnya yang mengakui kontribusinya di lapangan. Walaupun mengalami beberapa masalah cedera dalam beberapa tahun terakhir, Eden Hazard tetap menjadi pemain yang dihormati dan dikenang karena keterampilannya yang luar biasa, etos kerja yang tinggi, dan kontribusinya yang besar untuk klub dan negaranya."),
            )

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.about_page -> {
                startActivity(Intent(this, AboutActivity::class.java))
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
