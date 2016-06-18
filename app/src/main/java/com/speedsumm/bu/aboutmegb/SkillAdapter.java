package com.speedsumm.bu.aboutmegb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

/**
 * Created by bu on 25.05.2016.
 */
public class SkillAdapter extends ArrayAdapter<Skills> {
    public SkillAdapter(Context context, List<Skills> skillsList) {
        super(context, 0, skillsList);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Skills skillsName = getItem(position);
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.skills_list, parent, false);

        TextView firstText = (TextView) convertView.findViewById(R.id.MainTextView);
        RatingBar stars = (RatingBar) convertView.findViewById(R.id.ratingBar);
        firstText.setText(skillsName.skillName);
        stars.setRating(skillsName.stars);
        return convertView;


    }
}
