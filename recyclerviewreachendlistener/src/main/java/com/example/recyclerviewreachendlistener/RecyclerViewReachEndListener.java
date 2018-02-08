package com.example.recyclerviewreachendlistener;

import android.support.v7.widget.RecyclerView;

/**
 * Created by Farshid on 2/8/2018.
 */

public class RecyclerViewReachEndListener {

    public static void setEndListener(RecyclerView recyclerView, final OnSchoolReachEnd onSchoolReachEnd){


     recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
        @Override
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            super.onScrollStateChanged(recyclerView, newState);

            if (!recyclerView.canScrollVertically(1)) {
                onSchoolReachEnd.OnReachEnd();
            }
        }
    });
}
public interface OnSchoolReachEnd {
    void OnReachEnd();
}
}
