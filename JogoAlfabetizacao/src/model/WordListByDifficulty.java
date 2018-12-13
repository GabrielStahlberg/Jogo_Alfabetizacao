/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author gabri
 */
public class WordListByDifficulty {
    Map<Difficulties, List<String>> wordList;
    
    public WordListByDifficulty(){
        this.wordList = new HashMap<>();
    }

    public Map<Difficulties, List<String>> getWordList() {
        return wordList;
    }
    
    public void addWords(Difficulties d, List<String> words){
        this.wordList.put(d, words);
    }
}
