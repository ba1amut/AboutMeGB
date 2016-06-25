package com.speedsumm.bu.aboutmegb;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

/**
 * Created by bu on 18.06.2016.
 */
public class TimePickDialog extends AppCompatDialogFragment implements TimePickerDialog.OnTimeSetListener{

    @Override
    public Dialog onCreateDialog (Bundle saveInstanceState){
    final Calendar calendar = Calendar.getInstance();
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        TimePickerDialog tpg = new TimePickerDialog(getActivity(),this,hourOfDay,minute,true);
        tpg.setTitle("Введите новое время");
        return tpg;

    }


    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        TextView timeText = (TextView)getActivity().findViewById(R.id.textView4);
        timeText.setText(hourOfDay + " часов, "+minute+" минут.");



    }
}
