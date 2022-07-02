package com.devcation.sseum.item;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.devcation.sseum.R;
import com.devcation.sseum.data.SsuemData;

public class SsuemItem extends RecyclerView.ViewHolder {
    TextView textViewToday;    // 오늘의 글감
    TextView textViewTag;
    TextView textViewDate;

    public SsuemItem(@NonNull View itemView) {
        super(itemView);

        textViewToday = itemView.findViewById(R.id.bestTag);
        textViewTag = itemView.findViewById(R.id.tag);
        textViewDate = itemView.findViewById(R.id.textViewdate);

    }

    public void setItem(SsuemData data) {
        textViewToday.setText(data.getToday());
        textViewTag.setText(data.getTag());
        textViewDate.setText(data.getDate());
    }

}
