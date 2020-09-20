package com.example.quotes;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class QuoteServer {

    String[] getQuotes(){
        String[] quotes = new String[]{
                "Act as if what you do makes a difference. It does.","Never bend your head. Always hold it high. Look the world straight in the eye.",
                "Stay Hungry. Stay Foolish.", "When you have a dream, you've got to grab it and never let go.","No matter what you're going through, there's a light at the end of the tunnel.",
                "Life is like riding a bicycle. To keep your balance, you must keep moving.","Try to be a rainbow in someone else's cloud."
        };
     return quotes;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    String getRandomQuotes(){
        String quote;
        int quoteArrayLen = getQuotes().length;
        int RandomNum = ThreadLocalRandom.current().nextInt(quoteArrayLen);
        quote = getQuotes()[RandomNum];
        return quote;
    }

}
