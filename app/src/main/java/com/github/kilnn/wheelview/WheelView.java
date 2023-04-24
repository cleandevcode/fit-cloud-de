package com.github.kilnn.wheelview;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.Scroller;
import java.util.LinkedList;
import java.util.List;
import n7.e;

/* loaded from: classes.dex */
public class WheelView extends View {

    /* renamed from: a */
    public final Paint f5963a;

    /* renamed from: b */
    public final PorterDuffXfermode f5964b;

    /* renamed from: c */
    public final LinearLayout f5965c;

    /* renamed from: d */
    public int f5966d;

    /* renamed from: e */
    public boolean f5967e;

    /* renamed from: f */
    public boolean f5968f;

    /* renamed from: g */
    public o7.a f5969g;

    /* renamed from: h */
    public int f5970h;

    /* renamed from: i */
    public int f5971i;

    /* renamed from: j */
    public final e f5972j;

    /* renamed from: k */
    public final LinkedList f5973k;

    /* renamed from: l */
    public final LinkedList f5974l;

    /* renamed from: m */
    public final LinkedList f5975m;

    /* renamed from: n */
    public Drawable f5976n;

    /* renamed from: o */
    public Drawable f5977o;

    /* renamed from: p */
    public boolean f5978p;

    /* renamed from: q */
    public GradientDrawable f5979q;

    /* renamed from: r */
    public GradientDrawable f5980r;

    /* renamed from: s */
    public Drawable f5981s;

    /* renamed from: t */
    public final b f5982t;

    /* renamed from: u */
    public boolean f5983u;

    /* renamed from: v */
    public int f5984v;

    /* renamed from: w */
    public int f5985w;

    /* renamed from: x */
    public final Rect f5986x;

    /* renamed from: y */
    public final a f5987y;

    /* loaded from: classes.dex */
    public class a extends DataSetObserver {
        public a() {
            WheelView.this = r1;
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            WheelView.this.d(false);
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            WheelView.this.d(true);
        }
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f5971i = 0;
        this.f5972j = new e(this);
        this.f5973k = new LinkedList();
        this.f5974l = new LinkedList();
        this.f5975m = new LinkedList();
        this.f5985w = 0;
        this.f5986x = new Rect();
        this.f5987y = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.WheelView, 0, 0);
        this.f5966d = obtainStyledAttributes.getInt(R.styleable.WheelView_visible_items, 5);
        this.f5967e = obtainStyledAttributes.getBoolean(R.styleable.WheelView_is_cyclic, false);
        this.f5968f = obtainStyledAttributes.getBoolean(R.styleable.WheelView_draw_highlight, false);
        int color = obtainStyledAttributes.getColor(R.styleable.WheelView_highlight_color, -1);
        this.f5976n = obtainStyledAttributes.getDrawable(R.styleable.WheelView_center_background);
        this.f5977o = obtainStyledAttributes.getDrawable(R.styleable.WheelView_center_foreground);
        this.f5978p = obtainStyledAttributes.getBoolean(R.styleable.WheelView_is_draw_shadows, true);
        setShadowColor(obtainStyledAttributes.getColor(R.styleable.WheelView_shadows_color, -1));
        this.f5981s = obtainStyledAttributes.getDrawable(R.styleable.WheelView_divider);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f5963a = paint;
        paint.setColor(color);
        this.f5964b = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        this.f5982t = new b(getContext(), new c(this));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f5965c = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }

    public static void a(WheelView wheelView, int i10) {
        wheelView.f5984v += i10;
        int itemHeight = wheelView.getItemHeight();
        int i11 = wheelView.f5984v / itemHeight;
        int i12 = wheelView.f5971i - i11;
        int e10 = wheelView.f5969g.e();
        int i13 = wheelView.f5984v % itemHeight;
        if (Math.abs(i13) <= itemHeight / 2) {
            i13 = 0;
        }
        if (wheelView.f5967e && e10 > 0) {
            if (i13 > 0) {
                i12--;
                i11++;
            } else if (i13 < 0) {
                i12++;
                i11--;
            }
            while (i12 < 0) {
                i12 += e10;
            }
            i12 %= e10;
        } else if (i12 < 0) {
            i11 = wheelView.f5971i;
            i12 = 0;
        } else if (i12 >= e10) {
            i11 = (wheelView.f5971i - e10) + 1;
            i12 = e10 - 1;
        } else if (i12 > 0 && i13 > 0) {
            i12--;
            i11++;
        } else if (i12 < e10 - 1 && i13 < 0) {
            i12++;
            i11--;
        }
        int i14 = wheelView.f5984v;
        if (i12 != wheelView.f5971i) {
            wheelView.e(i12);
        } else {
            wheelView.invalidate();
        }
        int i15 = i14 - (i11 * itemHeight);
        wheelView.f5984v = i15;
        if (i15 > wheelView.getHeight()) {
            wheelView.f5984v = wheelView.getHeight() + (wheelView.f5984v % wheelView.getHeight());
        }
    }

    private int getItemHeight() {
        int i10 = this.f5985w;
        if (i10 != 0) {
            return i10;
        }
        View childAt = this.f5965c.getChildAt(0);
        if (childAt != null) {
            int measuredHeight = childAt.getMeasuredHeight();
            this.f5985w = measuredHeight;
            return measuredHeight;
        }
        return ((getHeight() - getPaddingTop()) - getPaddingBottom()) / this.f5966d;
    }

    private n7.a getItemsRange() {
        if (getItemHeight() == 0) {
            return null;
        }
        int i10 = this.f5971i;
        int i11 = 1;
        while (getItemHeight() * i11 < getHeight()) {
            i10--;
            i11 += 2;
        }
        int i12 = this.f5984v;
        if (i12 != 0) {
            if (i12 > 0) {
                i10--;
            }
            int itemHeight = i12 / getItemHeight();
            i10 -= itemHeight;
            i11 = (int) (Math.asin(itemHeight) + i11 + 1);
        }
        return new n7.a(i10, i11);
    }

    private int getPaddingLeftCompat() {
        return getPaddingStart();
    }

    private int getPaddingRightCompat() {
        return getPaddingEnd();
    }

    public final boolean b(int i10, boolean z10) {
        boolean z11;
        o7.a aVar = this.f5969g;
        View view = null;
        if (aVar != null && aVar.e() != 0) {
            int e10 = this.f5969g.e();
            o7.a aVar2 = this.f5969g;
            if (aVar2 != null && aVar2.e() > 0 && (this.f5967e || (i10 >= 0 && i10 < this.f5969g.e()))) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                o7.a aVar3 = this.f5969g;
                List<View> list = this.f5972j.f22196c;
                if (list != null && list.size() > 0) {
                    list.get(0);
                    list.remove(0);
                }
                aVar3.b();
            } else {
                while (i10 < 0) {
                    i10 += e10;
                }
                int i11 = i10 % e10;
                o7.a aVar4 = this.f5969g;
                List<View> list2 = this.f5972j.f22195b;
                if (list2 != null && list2.size() > 0) {
                    view = list2.get(0);
                    list2.remove(0);
                }
                view = aVar4.d(i11, view, this.f5965c);
            }
        }
        if (view == null) {
            return false;
        }
        if (z10) {
            this.f5965c.addView(view, 0);
        } else {
            this.f5965c.addView(view);
        }
        return true;
    }

    public final int c(int i10, int i11) {
        this.f5965c.measure(View.MeasureSpec.makeMeasureSpec(i10, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = this.f5965c.getMeasuredWidth();
        int paddingLeftCompat = getPaddingLeftCompat() + getPaddingRightCompat();
        if (i11 != 1073741824) {
            int max = Math.max(measuredWidth + paddingLeftCompat, getSuggestedMinimumWidth());
            if (i11 != Integer.MIN_VALUE || i10 >= max) {
                i10 = max;
            }
        }
        this.f5965c.measure(View.MeasureSpec.makeMeasureSpec(i10 - paddingLeftCompat, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        return i10;
    }

    public final void d(boolean z10) {
        if (z10) {
            e eVar = this.f5972j;
            List<View> list = eVar.f22195b;
            if (list != null) {
                list.clear();
            }
            List<View> list2 = eVar.f22196c;
            if (list2 != null) {
                list2.clear();
            }
            this.f5965c.removeAllViews();
            this.f5984v = 0;
        } else {
            this.f5972j.a(this.f5965c, this.f5970h, new n7.a(0, 0));
        }
        invalidate();
    }

    public final void e(int i10) {
        o7.a aVar = this.f5969g;
        if (aVar != null && aVar.e() != 0) {
            int e10 = this.f5969g.e();
            if (i10 < 0 || i10 >= e10) {
                if (this.f5967e) {
                    while (i10 < 0) {
                        i10 += e10;
                    }
                    i10 %= e10;
                } else {
                    return;
                }
            }
            if (i10 != this.f5971i) {
                this.f5984v = 0;
                this.f5971i = i10;
                for (n7.b bVar : this.f5973k) {
                    bVar.a(this);
                }
                invalidate();
            }
        }
    }

    public int getCurrentItem() {
        return this.f5971i;
    }

    public o7.a getViewAdapter() {
        return this.f5969g;
    }

    public int getVisibleItems() {
        return this.f5966d;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z10;
        super.onDraw(canvas);
        int height = (getHeight() / 2) - (getItemHeight() / 2);
        int itemHeight = (getItemHeight() / 2) + (getHeight() / 2);
        int paddingLeftCompat = getPaddingLeftCompat();
        int width = getWidth() - getPaddingRightCompat();
        int paddingTop = getPaddingTop();
        int height2 = getHeight() - getPaddingBottom();
        o7.a aVar = this.f5969g;
        if (aVar != null && aVar.e() > 0) {
            n7.a itemsRange = getItemsRange();
            if (itemsRange == null) {
                z10 = false;
            } else {
                int a10 = this.f5972j.a(this.f5965c, this.f5970h, itemsRange);
                if (this.f5970h != a10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f5970h = a10;
                if (!z10) {
                    if (a10 == itemsRange.f22192a && this.f5965c.getChildCount() == itemsRange.f22193b) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                }
                int i10 = this.f5970h;
                int i11 = itemsRange.f22192a;
                if (i10 > i11 && i10 <= (itemsRange.f22193b + i11) - 1) {
                    for (int i12 = i10 - 1; i12 >= itemsRange.f22192a && b(i12, true); i12--) {
                        this.f5970h = i12;
                    }
                } else {
                    this.f5970h = i11;
                }
                int i13 = this.f5970h;
                for (int childCount = this.f5965c.getChildCount(); childCount < itemsRange.f22193b; childCount++) {
                    if (!b(this.f5970h + childCount, false) && this.f5965c.getChildCount() == 0) {
                        i13++;
                    }
                }
                this.f5970h = i13;
            }
            if (z10) {
                c(getWidth(), 1073741824);
                this.f5965c.layout(0, 0, (getWidth() - getPaddingLeftCompat()) - getPaddingRightCompat(), (getHeight() - getPaddingTop()) - getPaddingBottom());
            }
            if (this.f5976n != null) {
                this.f5986x.set(paddingLeftCompat, height, width, itemHeight);
                this.f5976n.setBounds(this.f5986x);
                this.f5976n.draw(canvas);
            }
            float f10 = paddingLeftCompat;
            int saveLayer = canvas.saveLayer(f10, paddingTop, width, height2, this.f5963a, 31);
            this.f5963a.setXfermode(null);
            canvas.save();
            canvas.translate(f10, (-(((getItemHeight() - getHeight()) / 2) + ((this.f5971i - this.f5970h) * getItemHeight()))) + this.f5984v);
            this.f5965c.draw(canvas);
            canvas.restore();
            if (this.f5968f) {
                this.f5963a.setXfermode(this.f5964b);
                this.f5986x.set(paddingLeftCompat, height, width, itemHeight);
                canvas.clipRect(this.f5986x);
                canvas.drawRect(this.f5986x, this.f5963a);
                this.f5963a.setXfermode(null);
            }
            canvas.restoreToCount(saveLayer);
            Drawable drawable = this.f5981s;
            if (drawable != null) {
                this.f5986x.set(paddingLeftCompat, height, width, drawable.getIntrinsicHeight() + height);
                this.f5981s.setBounds(this.f5986x);
                this.f5981s.draw(canvas);
                this.f5986x.set(paddingLeftCompat, itemHeight - this.f5981s.getIntrinsicHeight(), width, itemHeight);
                this.f5981s.setBounds(this.f5986x);
                this.f5981s.draw(canvas);
            }
            if (this.f5977o != null) {
                this.f5986x.set(paddingLeftCompat, height, width, itemHeight);
                this.f5977o.setBounds(this.f5986x);
                this.f5977o.draw(canvas);
            }
        }
        if (this.f5978p) {
            this.f5979q.setBounds(paddingLeftCompat, paddingTop, width, height);
            this.f5979q.draw(canvas);
            this.f5980r.setBounds(paddingLeftCompat, itemHeight, width, height2);
            this.f5980r.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f5965c.layout(0, 0, ((i12 - i10) - getPaddingLeftCompat()) - getPaddingRightCompat(), ((i13 - i11) - getPaddingTop()) - getPaddingBottom());
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.f5972j.a(this.f5965c, this.f5970h, new n7.a(0, 0));
        int i12 = this.f5966d / 2;
        for (int i13 = this.f5971i + i12; i13 >= this.f5971i - i12; i13--) {
            if (b(i13, true)) {
                this.f5970h = i13;
            }
        }
        int c10 = c(size, mode);
        if (mode2 != 1073741824) {
            View childAt = this.f5965c.getChildAt(0);
            if (childAt != null) {
                this.f5985w = childAt.getMeasuredHeight();
            }
            int max = Math.max(getPaddingBottom() + getPaddingTop() + (this.f5985w * this.f5966d), getSuggestedMinimumHeight());
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(max, size2);
            } else {
                size2 = max;
            }
        }
        setMeasuredDimension(c10, size2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        boolean z10;
        int y10;
        if (isEnabled() && getViewAdapter() != null) {
            int action = motionEvent.getAction();
            if (action != 1) {
                if (action == 2 && getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            } else if (!this.f5983u) {
                int y11 = ((int) motionEvent.getY()) - (getHeight() / 2);
                int itemHeight = getItemHeight() / 2;
                if (y11 > 0) {
                    i10 = itemHeight + y11;
                } else {
                    i10 = y11 - itemHeight;
                }
                int itemHeight2 = i10 / getItemHeight();
                if (itemHeight2 != 0) {
                    int i11 = this.f5971i + itemHeight2;
                    o7.a aVar = this.f5969g;
                    if (aVar != null && aVar.e() > 0 && (this.f5967e || (i11 >= 0 && i11 < this.f5969g.e()))) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        for (n7.c cVar : this.f5975m) {
                            cVar.a();
                        }
                    }
                }
            }
            b bVar = this.f5982t;
            bVar.getClass();
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                if (action2 == 2 && (y10 = (int) (motionEvent.getY() - bVar.f5995f)) != 0) {
                    bVar.c();
                    ((c) bVar.f5991b).a(y10);
                    bVar.f5995f = motionEvent.getY();
                }
            } else {
                bVar.f5995f = motionEvent.getY();
                bVar.f5993d.forceFinished(true);
                bVar.f5997h.removeMessages(0);
                bVar.f5997h.removeMessages(1);
            }
            if (!bVar.f5992c.onTouchEvent(motionEvent) && motionEvent.getAction() == 1) {
                bVar.a();
            }
        }
        return true;
    }

    public void setCenterBackground(Drawable drawable) {
        this.f5976n = drawable;
    }

    public void setCenterForeground(Drawable drawable) {
        this.f5977o = drawable;
    }

    public void setCurrentItem(int i10) {
        e(i10);
    }

    public void setCyclic(boolean z10) {
        this.f5967e = z10;
    }

    public void setDivider(Drawable drawable) {
        this.f5981s = drawable;
    }

    public void setDrawHighlight(boolean z10) {
        this.f5968f = z10;
    }

    public void setDrawShadows(boolean z10) {
        this.f5978p = z10;
    }

    public void setHighlightColor(int i10) {
        this.f5963a.setColor(i10);
    }

    public void setInterpolator(Interpolator interpolator) {
        b bVar = this.f5982t;
        bVar.f5993d.forceFinished(true);
        bVar.f5993d = new Scroller(bVar.f5990a, interpolator);
    }

    public void setShadowColor(int i10) {
        int red = Color.red(i10);
        int green = Color.green(i10);
        int blue = Color.blue(i10);
        double alpha = Color.alpha(i10);
        int[] iArr = {Color.argb((int) (0.9d * alpha), red, green, blue), Color.argb((int) (0.75d * alpha), red, green, blue), Color.argb((int) (alpha * 0.6d), red, green, blue)};
        this.f5979q = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArr);
        this.f5980r = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, iArr);
    }

    public void setViewAdapter(o7.a aVar) {
        o7.a aVar2 = this.f5969g;
        if (aVar2 != null) {
            aVar2.c(this.f5987y);
        }
        this.f5969g = aVar;
        if (aVar != null) {
            aVar.a(this.f5987y);
        }
        d(true);
    }

    public void setVisibleItems(int i10) {
        this.f5966d = i10;
    }
}
