import java.util.HashMap;
import java.util.Map;

class TwelveDays {

//    private final static Map<Integer, String> twelveDaysLyrics = new HashMap<Integer, String>() {{
//    twelveDaysLyrics.put(1,"On the first day of Christmas my true love gave to me: " + "a Partridge in a Pear Tree.\n");
//    twelveDaysLyrics.put(2,"On the second day of Christmas my true love gave to me: " + "two Turtle Doves, and a Partridge in a Pear Tree.\n");
//    twelveDaysLyrics.put(3,"On the third day of Christmas my true love gave to me: " + "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
//    twelveDaysLyrics.put(4,"On the fourth day of Christmas my true love gave to me: four " + "Calling Birds, three French Hens, two Turtle Doves, " + "and a Partridge in a Pear Tree.\n");
//    twelveDaysLyrics.put(5,"On the fifth day of Christmas my true love gave to me: five Gold " + "Rings, four Calling Birds, three French Hens, two Turtle " + "Doves, and a Partridge in a Pear Tree.\n");
//    twelveDaysLyrics.put(6,"On the sixth day of Christmas my true love gave to me: six Geese-a-Laying,  " + "five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves,  " + "and a Partridge in a Pear Tree.\n");
//    twelveDaysLyrics.put(7,"On the seventh day of Christmas my true love gave to me: " + "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings,  " + "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
//    twelveDaysLyrics.put(8,"On the eighth day of Christmas my true love gave to me:  " + "eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying,  " + "five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves,  " + "and a Partridge in a Pear Tree.\n");
//    twelveDaysLyrics.put(9,"On the ninth day of Christmas my true love gave to me:  " + "nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming,  " + "six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens,  " + "two Turtle Doves, and a Partridge in a Pear Tree.\n");
//    twelveDaysLyrics.put(10,"On the tenth day of Christmas my true love gave to me: ten  " + "Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven  " + "Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three  " + "French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
//    twelveDaysLyrics.put(11,"On the eleventh day of Christmas my true love gave to me:  " + "eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight  " + "Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings,  " + "four Calling Birds, three French Hens, two Turtle Doves,  " + "and a Partridge in a Pear Tree.\n");
//    twelveDaysLyrics.put(12,"On the twelfth day of Christmas my true love gave to me:  " + "twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping,  " + "nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying,  " + "five Gold Rings, four Calling Birds, three French Hens, two Turtle  " + "Doves, and a Partridge in a Pear Tree.\n");
//    }};
    public static String[] twelveDaysLyrics = {
        "On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.\n",
        "On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree.\n",
        "On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n",
        "On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n",
        "On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n",
        "On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n",
        "On the seventh day of Christmas my true love gave to me: seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n",
        "On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n",
        "On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n",
        "On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n",
        "On the eleventh day of Christmas my true love gave to me: eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n",
        "On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n"
};
    String verse(int verseNumber) {
        return twelveDaysLyrics[verseNumber-1];
    }

    String verses(int startVerse, int endVerse) {
        StringBuilder lyrics = new StringBuilder();
        for(int i = startVerse ; i <= endVerse ; i++)
        {
            lyrics.append(verse(i));
            if(i < endVerse)
                lyrics.append("\n");
        }
        return lyrics.toString();
    }
    
    String sing() {
        return verses(1,12);
    }
}
