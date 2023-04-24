package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.material.R;
import java.util.Calendar;
import java.util.Iterator;
import k1.o0;

/* loaded from: classes.dex */
public final class MaterialCalendarGridView extends GridView {

    /* renamed from: a */
    public final Calendar f6434a;

    /* renamed from: b */
    public final boolean f6435b;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f6434a = d0.d(null);
        if (p.k1(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.f6435b = p.l1(getContext(), R.attr.nestedScrollable);
        o0.p(this, new o());
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: a */
    public final v getAdapter2() {
        return (v) super.getAdapter();
    }

    public final View b(int i10) {
        return getChildAt(i10 - getFirstVisiblePosition());
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter2().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z10;
        int b10;
        int width;
        int b11;
        int width2;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z11;
        boolean z12;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        v adapter2 = getAdapter2();
        d<?> dVar = adapter2.f6521b;
        c cVar = adapter2.f6523d;
        int max = Math.max(adapter2.b(), getFirstVisiblePosition());
        int min = Math.min(adapter2.d(), getLastVisiblePosition());
        Long item = adapter2.getItem(max);
        Long item2 = adapter2.getItem(min);
        Iterator<j1.c<Long, Long>> it = dVar.n().iterator();
        while (it.hasNext()) {
            j1.c<Long, Long> next = it.next();
            Long l10 = next.f17257a;
            if (l10 != null) {
                if (next.f17258b != null) {
                    long longValue = l10.longValue();
                    long longValue2 = next.f17258b.longValue();
                    Long valueOf = Long.valueOf(longValue);
                    Long valueOf2 = Long.valueOf(longValue2);
                    if (item != null && item2 != null && valueOf != null && valueOf2 != null && valueOf.longValue() <= item2.longValue() && valueOf2.longValue() >= item.longValue()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (!z10) {
                        boolean c10 = z9.r.c(this);
                        if (longValue < item.longValue()) {
                            if (max % adapter2.f6520a.f6515d == 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                width = 0;
                            } else {
                                View b12 = materialCalendarGridView.b(max - 1);
                                if (!c10) {
                                    width = b12.getRight();
                                } else {
                                    width = b12.getLeft();
                                }
                            }
                            b10 = max;
                        } else {
                            materialCalendarGridView.f6434a.setTimeInMillis(longValue);
                            b10 = adapter2.b() + (materialCalendarGridView.f6434a.get(5) - 1);
                            View b13 = materialCalendarGridView.b(b10);
                            width = (b13.getWidth() / 2) + b13.getLeft();
                        }
                        if (longValue2 > item2.longValue()) {
                            if ((min + 1) % adapter2.f6520a.f6515d == 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                width2 = getWidth();
                            } else {
                                View b14 = materialCalendarGridView.b(min);
                                if (!c10) {
                                    width2 = b14.getRight();
                                } else {
                                    width2 = b14.getLeft();
                                }
                            }
                            b11 = min;
                        } else {
                            materialCalendarGridView.f6434a.setTimeInMillis(longValue2);
                            b11 = adapter2.b() + (materialCalendarGridView.f6434a.get(5) - 1);
                            View b15 = materialCalendarGridView.b(b11);
                            width2 = (b15.getWidth() / 2) + b15.getLeft();
                        }
                        int itemId = (int) adapter2.getItemId(b10);
                        int i14 = max;
                        int i15 = min;
                        int itemId2 = (int) adapter2.getItemId(b11);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View b16 = materialCalendarGridView.b(numColumns);
                            int top = b16.getTop() + cVar.f6454a.f6448a.top;
                            v vVar = adapter2;
                            int bottom = b16.getBottom() - cVar.f6454a.f6448a.bottom;
                            if (!c10) {
                                if (numColumns > b10) {
                                    i13 = 0;
                                } else {
                                    i13 = width;
                                }
                                if (b11 > numColumns2) {
                                    i12 = getWidth();
                                } else {
                                    i12 = width2;
                                }
                            } else {
                                if (b11 > numColumns2) {
                                    i10 = 0;
                                } else {
                                    i10 = width2;
                                }
                                if (numColumns > b10) {
                                    i11 = getWidth();
                                } else {
                                    i11 = width;
                                }
                                int i16 = i10;
                                i12 = i11;
                                i13 = i16;
                            }
                            canvas.drawRect(i13, top, i12, bottom, cVar.f6461h);
                            itemId++;
                            materialCalendarGridView = this;
                            it = it;
                            adapter2 = vVar;
                        }
                        materialCalendarGridView = this;
                        max = i14;
                        min = i15;
                    }
                }
            } else {
                materialCalendarGridView = this;
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        int b10;
        if (z10) {
            if (i10 == 33) {
                b10 = getAdapter2().d();
            } else if (i10 == 130) {
                b10 = getAdapter2().b();
            } else {
                super.onFocusChanged(true, i10, rect);
                return;
            }
            setSelection(b10);
            return;
        }
        super.onFocusChanged(false, i10, rect);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (super.onKeyDown(i10, keyEvent)) {
            if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter2().b()) {
                return true;
            }
            if (19 == i10) {
                setSelection(getAdapter2().b());
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (!this.f6435b) {
            super.onMeasure(i10, i11);
            return;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof v)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), v.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i10) {
        if (i10 < getAdapter2().b()) {
            i10 = getAdapter2().b();
        }
        super.setSelection(i10);
    }
}
