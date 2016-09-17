package com.example.android.miwok;

/**
 * Created by Gabriel on 09/15/16.
 */
public class Word {

    private String mEnglishWord;
    private String mMiwokWord;
    private int mImagResourceId;

    public Word(String englishWord, String miwokWord){
        mEnglishWord = englishWord;
        mMiwokWord = miwokWord;
    }
    public Word(String englishWord, String miwokWord, int imageResourseId){
        mEnglishWord = englishWord;
        mMiwokWord = miwokWord;
        mImagResourceId = imageResourseId;
    }

    public int getImageResource() {
        return mImagResourceId;
    }

    public String getEnglishWord() {
        return mEnglishWord;
    }


    public String getMiwokWord() {
        return mMiwokWord;
    }

}
