package com.example.android.sunshine;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by George Spiridakis <george@codeburrow.com>
 * on 4/29/2016.
 * ====================================================
 * CODEBURROW
 */

/**
 * Cache of the children views for a forecast list item.
 */
public class ForecastItemViewHolder {
    public final ImageView iconView;
    public final TextView dateView;
    public final TextView descriptionView;
    public final TextView highTempView;
    public final TextView lowTempView;

    public ForecastItemViewHolder(View view) {
        iconView = (ImageView) view.findViewById(R.id.list_item_icon);
        dateView = (TextView) view.findViewById(R.id.list_item_date_textview);
        descriptionView = (TextView) view.findViewById(R.id.list_item_forecast_textview);
        highTempView = (TextView) view.findViewById(R.id.list_item_high_textview);
        lowTempView = (TextView) view.findViewById(R.id.list_item_low_textview);
    }
}
