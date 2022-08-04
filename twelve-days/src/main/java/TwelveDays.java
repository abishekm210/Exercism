class TwelveDays {

    String verse(int verseNumber) {
        String day[] = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};
        String sentence[] = {" a Partridge in a Pear Tree.\n", " two Turtle Doves, and", " three French Hens", " four Calling Birds",
                " five Gold Rings", " six Geese-a-Laying", " seven Swans-a-Swimming", " eight Maids-a-Milking",
                " nine Ladies Dancing", " ten Lords-a-Leaping", " eleven Pipers Piping", " twelve Drummers Drumming"};
        String lyric = "On the " + day[verseNumber - 1] + " day of Christmas my true love gave to me:";

        for(int iteration = verseNumber-1 ; iteration >= 0 ; iteration--) {
            lyric += sentence[iteration];
            if (iteration > 1)
                lyric += ',';
        }
        return lyric;
    }

    String verses(int startVerse, int endVerse) {
        String lyrics = "";
        for(int iteration = startVerse ; iteration <= endVerse ; iteration++)
        {
            lyrics += verse(iteration);
            if(iteration < endVerse)
                lyrics += "\n";
        }
        return lyrics;
    }

    String sing() {
        return verses(1,12);
    }
}