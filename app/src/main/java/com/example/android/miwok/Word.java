package com.example.android.miwok;

/**
 * Created by Gabriel on 09/15/16.
 */
public class Word {

    private String mEnglishWord;
    private String mMiwokWord;
    private int mImagResourceId;
    private int mAudioResourceId;

    public Word(String englishWord, String miwokWord, int audioResourceId){
        mEnglishWord = englishWord;
        mMiwokWord = miwokWord;
        mAudioResourceId = audioResourceId;
    }
    public Word(String englishWord, String miwokWord, int imageResourseId, int audioResourceId){
        mEnglishWord = englishWord;
        mMiwokWord = miwokWord;
        mImagResourceId = imageResourseId;
        mAudioResourceId = audioResourceId;
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

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }
    public String toString(){
        return "English word: " + getEnglishWord() + ", Miwok word:  " + getMiwokWord();
    }
}
