package com.speedsumm.bu.aboutmegb;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by bu on 15.06.2016.
 */
public class Fragment2 extends Fragment {
    String[] stars;
    Toast myToast;
    String[] skills;
    ArrayList<Skills> arraofSkills = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment2, container, false);

        SkillAdapter adapter = new SkillAdapter(this.getContext(), arraofSkills);
        ListView listView = (ListView) rootView.findViewById(R.id.listView);
        listView.setAdapter(adapter);


        makeArray();

        return rootView;

    }

    private void makeArray() {
        skills = getResources().getStringArray(R.array.skills);
        stars = getResources().getStringArray(R.array.skillsStars);

        for (int i = 0; i < skills.length; i++) {
            Skills user = new Skills(skills[i], Integer.valueOf(stars[i]));
            arraofSkills.add(user);

        }
    }

}
