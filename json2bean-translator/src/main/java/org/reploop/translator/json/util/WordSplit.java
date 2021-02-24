package org.reploop.translator.json.util;

import java.util.ArrayList;
import java.util.List;

public interface WordSplit {
    default List<String> parseWords(List<String> words) {
        List<String> splits = new ArrayList<>();
        for (String word : words) {
            splits.addAll(parseWords(word));
        }
        return splits;
    }

    List<String> parseWords(String org);
}
