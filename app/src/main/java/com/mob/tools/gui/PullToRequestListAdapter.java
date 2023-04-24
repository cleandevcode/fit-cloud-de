package com.mob.tools.gui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;

/* loaded from: classes.dex */
public abstract class PullToRequestListAdapter extends PullToRequestBaseListAdapter {
    private PullToRequestBaseAdapter adapter;
    private boolean fling;
    private ScrollableListView listView;
    private OnListStopScrollListener osListener;
    private boolean pullUpReady;

    public PullToRequestListAdapter(PullToRequestView pullToRequestView) {
        super(pullToRequestView);
        ScrollableListView onNewListView = onNewListView(getContext());
        this.listView = onNewListView;
        onNewListView.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: com.mob.tools.gui.PullToRequestListAdapter.1
            private int firstVisibleItem;
            private int visibleItemCount;

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
                this.firstVisibleItem = i10;
                this.visibleItemCount = i11;
                View childAt = absListView.getChildAt(i11 - 1);
                PullToRequestListAdapter.this.pullUpReady = i10 + i11 == i12 && childAt != null && childAt.getBottom() <= absListView.getBottom();
                PullToRequestListAdapter pullToRequestListAdapter = PullToRequestListAdapter.this;
                pullToRequestListAdapter.onScroll(pullToRequestListAdapter.listView, i10, i11, i12);
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(AbsListView absListView, int i10) {
                PullToRequestListAdapter.this.fling = i10 == 2;
                if (i10 == 0) {
                    if (PullToRequestListAdapter.this.osListener != null) {
                        PullToRequestListAdapter.this.osListener.onListStopScrolling(this.firstVisibleItem, this.visibleItemCount);
                    } else if (PullToRequestListAdapter.this.adapter != null) {
                        PullToRequestListAdapter.this.adapter.notifyDataSetChanged();
                    }
                }
            }
        });
        PullToRequestBaseAdapter pullToRequestBaseAdapter = new PullToRequestBaseAdapter(this);
        this.adapter = pullToRequestBaseAdapter;
        this.listView.setAdapter((ListAdapter) pullToRequestBaseAdapter);
    }

    @Override // com.mob.tools.gui.PullToRequestAdatper
    public Scrollable getBodyView() {
        return this.listView;
    }

    public ListView getListView() {
        return this.listView;
    }

    @Override // com.mob.tools.gui.PullToRequestBaseListAdapter
    public boolean isFling() {
        return this.fling;
    }

    @Override // com.mob.tools.gui.PullToRequestAdatper
    public boolean isPullDownReady() {
        return this.listView.isReadyToPull();
    }

    @Override // com.mob.tools.gui.PullToRequestAdatper
    public boolean isPullUpReady() {
        return this.pullUpReady;
    }

    @Override // com.mob.tools.gui.PullToRequestAdatper
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.adapter.notifyDataSetChanged();
    }

    public ScrollableListView onNewListView(Context context) {
        return new ScrollableListView(context);
    }

    @Override // com.mob.tools.gui.PullToRequestBaseListAdapter
    public void onScroll(Scrollable scrollable, int i10, int i11, int i12) {
    }

    public void setDivider(Drawable drawable) {
        this.listView.setDivider(drawable);
    }

    public void setDividerHeight(int i10) {
        this.listView.setDividerHeight(i10);
    }
}
