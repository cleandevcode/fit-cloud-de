package com.mob.tools.gui;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class PullToRequestBaseListAdapter extends PullToRequestAdatper {
    public PullToRequestBaseListAdapter(PullToRequestView pullToRequestView) {
        super(pullToRequestView);
    }

    public abstract int getCount();

    public abstract Object getItem(int i10);

    public abstract long getItemId(int i10);

    public int getItemViewType(int i10) {
        return 0;
    }

    public abstract View getView(int i10, View view, ViewGroup viewGroup);

    public int getViewTypeCount() {
        return 1;
    }

    public abstract boolean isFling();

    public abstract void onScroll(Scrollable scrollable, int i10, int i11, int i12);
}
