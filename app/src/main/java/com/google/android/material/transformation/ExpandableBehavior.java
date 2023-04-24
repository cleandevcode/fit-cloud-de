package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* renamed from: a */
    public int f6918a;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        public final /* synthetic */ View f6919a;

        /* renamed from: b */
        public final /* synthetic */ int f6920b;

        /* renamed from: c */
        public final /* synthetic */ x9.a f6921c;

        public a(View view, int i10, x9.a aVar) {
            ExpandableBehavior.this = r1;
            this.f6919a = view;
            this.f6920b = i10;
            this.f6921c = aVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            this.f6919a.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.f6918a == this.f6920b) {
                x9.a aVar = this.f6921c;
                expandableBehavior.s((View) aVar, this.f6919a, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f6918a = 0;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6918a = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean b(View view, View view2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        boolean z10;
        int i10;
        x9.a aVar = (x9.a) view2;
        int i11 = 2;
        if (!aVar.a() ? this.f6918a != 1 : (i10 = this.f6918a) != 0 && i10 != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return false;
        }
        if (aVar.a()) {
            i11 = 1;
        }
        this.f6918a = i11;
        s((View) aVar, view, aVar.a(), true);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
        x9.a aVar;
        boolean z10;
        int i11;
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        if (!o0.g.c(view)) {
            ArrayList f10 = coordinatorLayout.f(view);
            int size = f10.size();
            int i12 = 0;
            while (true) {
                if (i12 < size) {
                    View view2 = (View) f10.get(i12);
                    if (b(view, view2)) {
                        aVar = (x9.a) view2;
                        break;
                    }
                    i12++;
                } else {
                    aVar = null;
                    break;
                }
            }
            if (aVar != null) {
                int i13 = 2;
                if (!aVar.a() ? this.f6918a != 1 : (i11 = this.f6918a) != 0 && i11 != 2) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    if (aVar.a()) {
                        i13 = 1;
                    }
                    this.f6918a = i13;
                    view.getViewTreeObserver().addOnPreDrawListener(new a(view, i13, aVar));
                }
            }
        }
        return false;
    }

    public abstract void s(View view, View view2, boolean z10, boolean z11);
}
