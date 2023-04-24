package com.mob.tools.gui;

import android.content.Context;
import android.view.View;
import android.widget.AbsListView;
import android.widget.GridView;
import android.widget.ListAdapter;

/* loaded from: classes.dex */
public abstract class PullToRequestGridAdapter extends PullToRequestBaseListAdapter {
    private PullToRequestBaseAdapter adapter;
    private boolean fling;
    private ScrollableGridView gridView;
    private OnListStopScrollListener osListener;
    private boolean pullUpReady;

    public PullToRequestGridAdapter(PullToRequestView pullToRequestView) {
        super(pullToRequestView);
        ScrollableGridView onNewGridView = onNewGridView(getContext());
        this.gridView = onNewGridView;
        onNewGridView.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: com.mob.tools.gui.PullToRequestGridAdapter.1
            private int firstVisibleItem;
            private int visibleItemCount;

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
                this.firstVisibleItem = i10;
                this.visibleItemCount = i11;
                View childAt = absListView.getChildAt(i11 - 1);
                PullToRequestGridAdapter.this.pullUpReady = i10 + i11 == i12 && childAt != null && childAt.getBottom() <= absListView.getBottom();
                PullToRequestGridAdapter pullToRequestGridAdapter = PullToRequestGridAdapter.this;
                pullToRequestGridAdapter.onScroll(pullToRequestGridAdapter.gridView, i10, i11, i12);
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(AbsListView absListView, int i10) {
                PullToRequestGridAdapter.this.fling = i10 == 2;
                if (i10 == 0) {
                    if (PullToRequestGridAdapter.this.osListener != null) {
                        PullToRequestGridAdapter.this.osListener.onListStopScrolling(this.firstVisibleItem, this.visibleItemCount);
                    } else if (PullToRequestGridAdapter.this.adapter != null) {
                        PullToRequestGridAdapter.this.adapter.notifyDataSetChanged();
                    }
                }
            }
        });
        PullToRequestBaseAdapter pullToRequestBaseAdapter = new PullToRequestBaseAdapter(this);
        this.adapter = pullToRequestBaseAdapter;
        this.gridView.setAdapter((ListAdapter) pullToRequestBaseAdapter);
    }

    @Override // com.mob.tools.gui.PullToRequestAdatper
    public Scrollable getBodyView() {
        return this.gridView;
    }

    public GridView getGridView() {
        return this.gridView;
    }

    @Override // com.mob.tools.gui.PullToRequestBaseListAdapter
    public boolean isFling() {
        return this.fling;
    }

    @Override // com.mob.tools.gui.PullToRequestAdatper
    public boolean isPullDownReady() {
        return this.gridView.isReadyToPull();
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

    public ScrollableGridView onNewGridView(Context context) {
        return new ScrollableGridView(context);
    }

    @Override // com.mob.tools.gui.PullToRequestBaseListAdapter
    public void onScroll(Scrollable scrollable, int i10, int i11, int i12) {
    }

    public void setColumnWidth(int i10) {
        this.gridView.setColumnWidth(i10);
    }

    public void setHorizontalSpacing(int i10) {
        this.gridView.setHorizontalSpacing(i10);
    }

    public void setNumColumns(int i10) {
        this.gridView.setNumColumns(i10);
    }

    public void setStretchMode(int i10) {
        this.gridView.setStretchMode(i10);
    }

    public void setVerticalSpacing(int i10) {
        this.gridView.setVerticalSpacing(i10);
    }
}
