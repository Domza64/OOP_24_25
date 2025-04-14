package pckg_snd;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        String filePath = "DATA_STRUCTURES/src/pckg_snd/quotes.txt";
//        AUX_CLS.readFromFile(filePath);

        List<String[]> quotes = AUX_CLS.readQuotes(filePath);
//        AUX_CLS.listArrayListElements(quotes);

        Map<String, ArrayList<String>> quotesMap = AUX_CLS.linkAuthorAndQuotes(quotes);

        AUX_CLS.addNewQuote("Albert Einstein", "Some new quote", quotesMap);

//        AUX_CLS.readAuthorAndQuotes(quotesMap);

        AUX_CLS.writeQuotesToFile("DATA_STRUCTURES/src/pckg_snd/quotes_2.txt", quotesMap);

        AUX_CLS.analyzeAuthorQuotes(quotesMap);
    }
}
