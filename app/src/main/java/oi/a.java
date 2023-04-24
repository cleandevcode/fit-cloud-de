package oi;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p000do.a;

/* loaded from: classes2.dex */
public final class a extends RecyclerView.l {

    /* renamed from: e */
    public static final int[] f23556e = {16843284};

    /* renamed from: a */
    public Drawable f23557a;

    /* renamed from: b */
    public int f23558b;

    /* renamed from: c */
    public final Rect f23559c = new Rect();

    /* renamed from: d */
    public boolean f23560d;

    public a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f23556e);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.f23557a = drawable;
        if (drawable == null) {
            a.b bVar = p000do.a.f13275a;
            bVar.t("DividerItem");
            bVar.p("@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()", new Object[0]);
        }
        obtainStyledAttributes.recycle();
        this.f23558b = 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void f(Rect rect, View view, RecyclerView recyclerView) {
        Drawable drawable = this.f23557a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f23558b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int i10;
        int childCount;
        int width;
        int i11;
        int childCount2;
        if (recyclerView.getLayoutManager() != null && this.f23557a != null) {
            int i12 = 0;
            if (this.f23558b == 1) {
                canvas.save();
                if (recyclerView.getClipToPadding()) {
                    i11 = recyclerView.getPaddingLeft();
                    width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    canvas.clipRect(i11, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                } else {
                    width = recyclerView.getWidth();
                    i11 = 0;
                }
                if (this.f23560d) {
                    childCount2 = recyclerView.getChildCount() - 1;
                } else {
                    childCount2 = recyclerView.getChildCount();
                }
                while (i12 < childCount2) {
                    View childAt = recyclerView.getChildAt(i12);
                    RecyclerView.K(childAt, this.f23559c);
                    int round = Math.round(childAt.getTranslationY()) + this.f23559c.bottom;
                    this.f23557a.setBounds(i11, round - this.f23557a.getIntrinsicHeight(), width, round);
                    this.f23557a.draw(canvas);
                    i12++;
                }
                canvas.restore();
                return;
            }
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                i10 = recyclerView.getPaddingTop();
                height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                canvas.clipRect(recyclerView.getPaddingLeft(), i10, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
            } else {
                height = recyclerView.getHeight();
                i10 = 0;
            }
            if (this.f23560d) {
                childCount = recyclerView.getChildCount() - 1;
            } else {
                childCount = recyclerView.getChildCount();
            }
            while (i12 < childCount) {
                View childAt2 = recyclerView.getChildAt(i12);
                RecyclerView.m layoutManager = recyclerView.getLayoutManager();
                Rect rect = this.f23559c;
                layoutManager.getClass();
                RecyclerView.K(childAt2, rect);
                int round2 = Math.round(childAt2.getTranslationX()) + this.f23559c.right;
                this.f23557a.setBounds(round2 - this.f23557a.getIntrinsicWidth(), i10, round2, height);
                this.f23557a.draw(canvas);
                i12++;
            }
            canvas.restore();
        }
    }
}
