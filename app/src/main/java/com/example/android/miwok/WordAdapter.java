package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Gabriel on 09/15/16.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    ArrayList<Word> mWords;

    private int mColorResource;

    public WordAdapter(Context context, ArrayList<Word> words, int colorResourse) {
        super(context, 0, words);
        mWords = words;
        mColorResource = colorResourse;
    }
//    @Override
//    public Word getItem(int position) {
//        return mWords.get(position);
//    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,
                    parent, false);
        }
//        Estoy usando el metodo de la clase padre para conseguir el objeto en cierta posicion
        Word currentWord = getItem(position);

        LinearLayout wordsContainer = (LinearLayout)listItemView.findViewById(R.id.words_container);
        wordsContainer.setBackgroundResource(mColorResource);

        TextView englishTextView = (TextView) listItemView.findViewById(R.id.english);
        englishTextView.setText(currentWord.getEnglishWord());

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok);
        miwokTextView.setText(currentWord.getMiwokWord());

        ImageView image = (ImageView) listItemView.findViewById(R.id.image);

        if (currentWord.getImageResource() == 0) {
            image.setVisibility(View.GONE);
        } else {
            image.setImageResource(currentWord.getImageResource());

        }

        return listItemView;
    }


}
