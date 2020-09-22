package com.flowz.testingwordsreadingtimeestimatinglibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dev.minread.Minread
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val historyOfCars = "In 1769 the first steam-powered automobile capable of human transportation was built by Nicolas-Joseph Cugnot.[1][2] \n" +
                "In 1803, Hayden Wischett designed the first car powered by the de Rivaz engine, an early internal combustion engine that was fueled by hydrogen. \n" +
                "In 1823 English engineer Samuel Brown invented the first industrially applied internal combustion engine. \n" +
                "In 1870 Siegfried Marcus built his first combustion engine powered pushcart, followed by four progressively more sophisticated combustion-engine cars over a 10-to-15-year span that influenced later cars. Marcus created the two-cycle combustion engine.[citation needed] The car's second incarnation in 1880 introduced a four-cycle, gasoline-powered engine, an ingenious carburetor design and magneto ignition. He created an additional two models further refining his design with steering, a clutch and a brake. \n" +
                "The four-stroke petrol internal combustion engine that still constitutes the most prevalent form of modern automotive propulsion was patented by Nicolaus Otto. The similar four-stroke diesel engine was invented by Rudolf Diesel. The hydrogen fuel cell, one of the technologies hailed as a replacement for gasoline as an energy source for cars, was discovered in principle by Christian Friedrich Schönbein in 1838. The battery electric car owes its beginnings to Ányos Jedlik, one of the inventors of the electric motor, and Gaston Planté, who invented the lead–acid battery in 1859.[citation needed] \n" +
                "In 1882 the Italian Enrico Bernardi created the first petrol-powered vehicle, a tricycle for his son Louis. He drove it through the street of a village near the Italian city of Verona.[citation needed] \n" +
                "In 1885, Karl Benz developed a petrol or gasoline-powered automobile.[3] This is also considered to be the first \"production\" vehicle as Benz made several identical copies. The automobile was powered by a single cylinder four-stroke engine[citation needed]. \n" +
                "In 1908, the Ford Model T, created by the Ford Motor Company, began production and would become the first automobile to be mass-produced on a moving assembly line.[4] From 1913 to 1927, Ford produced over 15,000,000 Model T automobiles.[4] 17th and 18th centuries[edit]\n" +
                " \n" +
                "\n" +
                "Cugnot's steam wagon, the second (1771) version\n" +
                "Ferdinand Verbiest, a member of a Jesuit mission in China, built a steam-powered vehicle around 1672 as a toy for the Kangxi Emperor. It was small-scale and could not carry a driver but it was, quite possibly, the first working steam-powered vehicle ('auto-mobile').[5][6] \n" +
                "Steam-powered self-propelled vehicles large enough to transport people and cargo were first devised in the late 18th century. Nicolas-Joseph Cugnot demonstrated his fardier à vapeur (\"steam dray\"), an experimental steam-driven artillery tractor, in 1770 and 1771. As Cugnot's design proved to be impractical, his invention was not developed in his native France. The center of innovation shifted to Great Britain. By 1784, William Murdoch had built a working model of a steam carriage in Redruth [7] and in 1801 Richard Trevithick was running a full-sized vehicle on the roads in Camborne. The first automobile patent in the United States was granted to Oliver Evans on May 3, 1789. \n" +
                "19th century[edit]\n" +
                " \n" +
                "\n" +
                "A replica of Richard Trevithick's 1801 road locomotive 'Puffing Devil'\n" +
                "During the 19th century attempts were made to introduce practical steam-powered vehicles. Innovations such as hand brakes, multi-speed transmissions and better steering developed. Some commercially successful vehicles provided mass transit until a backlash against these large vehicles resulted in the passage of legislation such as the United Kingdom Locomotive Act (1865), which required many self-propelled vehicles on public roads to be preceded by a man on foot waving a red flag and blowing a horn. This effectively halted road auto development in the UK for most of the rest of the 19th century; inventors and engineers shifted their efforts to improvements in railway locomotives. The law was not repealed until 1896, although the need for the red flag was removed in 1878. \n" +
                "In 1816, a professor at Prague Polytechnic, Josef Bozek, built an oil-fired steam car.[8]:p.27 Walter Hancock, builder and operator of London steam buses, in 1838 built a 2-seated car phaeton.[8]:p27 \n" +
                "In 1867, Canadian jeweller Henry Seth Taylor demonstrated his 4-wheeled \"steam buggy\" at the Stanstead Fair in Stanstead, Quebec and again the following year.[9] The basis of the buggy, which he began building in 1865, was a high-wheeled carriage with bracing to support a two-cylinder steam engine mounted on the floor.[10] \n" +
                "One of the first \"real\" automobiles was produced in 1873 by Frenchman Amédée Bollée in Le Mans, who built self-propelled steam road vehicles to transport groups of passengers. \n" +
                "The first automobile suitable for use on existing wagon roads in the United States was a steam-powered vehicle invented in 1871 by Dr. J.W. Carhart, a minister of the Methodist Episcopal Church, in Racine, Wisconsin.[1][11][self-published source] It induced the State of Wisconsin in 1875 to offer a \$10,000 award to the first to produce a practical substitute for the use of horses and other animals. They stipulated that the vehicle would have to maintain an average speed of more than 5 miles per hour (8 km/h) over a 200-mile (320 km) course. The offer led to the first city to city automobile race in the United States, starting on 16 July 1878 in Green Bay, Wisconsin, and ending in Madison, Wisconsin, via Appleton, Oshkosh, Waupun, Watertown, Fort Atkinson, and Janesville. While seven vehicles were registered, only two started to compete: the entries from Green Bay and Oshkosh. The vehicle from Green Bay was faster, but broke down before completing the race. The Oshkosh finished the 201-mile (323 km) course in 33 hours and 27 minutes, and posted an average speed of six miles per hour. In 1879, the legislature awarded half the prize.[12][13][14] \n" +
                "20th century[edit]\n" +
                "Pre WWII\n" +
                " \n" +
                "\n" +
                "1924 Doble Model E\n" +
                "Steam-powered road vehicles, both cars and wagons, reached the peak of their development in the early 1930s with fast-steaming lightweight boilers and efficient engine designs. Internal combustion engines also developed greatly during WWI, becoming simpler to operate and more reliable. The development of the high-speed diesel engine from 1930 began to replace them for wagons, accelerated in the UK by tax changes making steam wagons uneconomic overnight. Although a few designers continued to advocate steam power, no significant developments in production steam cars took place after Doble in 1931. \n" +
                "Post-WWII\n" +
                "Whether steam cars will ever be reborn in later technological eras remains to be seen. Magazines such as Light Steam Power continued to describe them into the 1980s. The 1950s saw interest in steam-turbine cars powered by small nuclear reactors[citation needed] (this was also true of aircraft), but the dangers inherent in nuclear fission technology soon killed these ideas. \n" +
                "\n" +
                "Electric automobiles[edit]\n" +
                " \n" +
                "\n" +
                "German Flocken Elektrowagen of 1888, perhaps the first electric car of the world[15]\n" +
                "See also: History of the electric vehicle\n" +
                "19th century[edit]\n" +
                "In 1828, Ányos Jedlik, a Hungarian who invented an early type of electric motor, created a tiny model car powered by his new motor.[16] In 1834, Vermont blacksmith Thomas Davenport, the inventor of the first American DC electric motor, installed his motor in a small model car, which he operated on a short circular electrified track.[17] In 1835, Professor Sibrandus Stratingh of Groningen, the Netherlands and his assistant Christopher Becker created a small-scale electrical car, powered by non-rechargeable primary cells.[18] In 1838, Scotsman Robert Davidson built an electric locomotive that attained a speed of 4 miles per hour (6 km/h). In England, a patent was granted in 1840 for the use of tracks as conductors of electric current, and similar American patents were issued to Lilley and Colten in 1847. \n" +
                "Sources point to different creations as the first electric car. Between 1832 and 1839 (the exact year is uncertain) Robert Anderson of Scotland invented a crude electric carriage, powered by non-rechargeable primary cells. In November 1881, French inventor Gustave Trouvé demonstrated a working three-wheeled car powered by electricity at the International Exposition of Electricity, Paris.[19] English inventor Thomas Parker, who was responsible for innovations such as electrifying the London Underground, overhead tramways in Liverpool and Birmingham, and the smokeless fuel coalite, built the first production electric car in London in 1884, using his own specially designed high-capacity rechargeable batteries.[20] However, others regard the Flocken Elektrowagen of 1888 by German inventor Andreas Flocken as the first true electric car.[15] \n" +
                "20th century[edit]\n" +
                "Electric cars enjoyed popularity between the late 19th century and early 20th century, when electricity was among the preferred methods for automobile propulsion, providing a level of comfort and ease of operation that could not be achieved by the gasoline cars of the time. Advances in internal combustion technology, especially the electric starter, soon rendered this advantage moot; the greater range of gasoline cars, quicker refueling times, and growing petroleum infrastructure, along with the mass production of gasoline vehicles by companies such as the Ford Motor Company, which reduced prices of gasoline cars to less than half that of equivalent electric cars, led to a decline in the use of electric propulsion, effectively removing it from important markets such as the United States by the 1930s. 1997 saw the Toyota RAV4 EV and the Nissan Altra, the first production battery electric cars to use NiMH and Li-ion batteries (instead of heavier lead acid) respectively. \n" +
                "21st century[edit]\n" +
                "However, in recent years, increased concerns over the environmental impact of gasoline cars, higher gasoline prices, improvements in battery technology, and the prospect of peak oil, have brought about renewed interest in electric cars, which are perceived to be more environmentally friendly and cheaper to maintain and run, despite high initial costs. \n" +
                "Internal combustion engines[edit]"

        val noOfWords = Minread.wordcount(historyOfCars).toString()+ " Words"

        noOfWordsInarticle.setText(noOfWords)

        reading_time_estimate.text = Minread.readtime(historyOfCars)

//        using custom message
        reading_time_estimate.text = Minread.custome_readtime(historyOfCars, "min read")

        actualArticle.setText(historyOfCars)



    }
}
