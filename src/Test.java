import programmers.step2.Programmers_42587;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Word word = new Word();
        word.setWord("aaa");
        System.out.println("word 생성객체: " + word);
        System.out.println("word 생성단어: " + word.getWord());
        changeWord(word);
        System.out.println("changeWord() 호출후 객체 : " + word);
        System.out.println("changeWord() 호출후 단어  : " + word.getWord());
    }

    static void changeWord(Word word) {
        word = new Word();
        word.setWord("bbb");
        System.out.println("changeWord() word 객체 : " + word);
        System.out.println("changeWord() word 단어 : " + word.getWord());
    }

