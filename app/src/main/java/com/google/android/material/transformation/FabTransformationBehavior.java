package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import h9.g;
import h9.h;
import h9.i;
import t0.e;

@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    public final Rect f6924c;

    /* renamed from: d */
    public final RectF f6925d;

    /* renamed from: e */
    public final RectF f6926e;

    /* renamed from: f */
    public final int[] f6927f;

    /* renamed from: g */
    public float f6928g;

    /* renamed from: h */
    public float f6929h;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f6930a;

        /* renamed from: b */
        public final /* synthetic */ View f6931b;

        /* renamed from: c */
        public final /* synthetic */ View f6932c;

        public a(boolean z10, View view, View view2) {
            this.f6930a = z10;
            this.f6931b = view;
            this.f6932c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f6930a) {
                return;
            }
            this.f6931b.setVisibility(4);
            this.f6932c.setAlpha(1.0f);
            this.f6932c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            if (this.f6930a) {
                this.f6931b.setVisibility(0);
                this.f6932c.setAlpha(0.0f);
                this.f6932c.setVisibility(4);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public g f6933a;

        /* renamed from: b */
        public i f6934b;
    }

    public FabTransformationBehavior() {
        this.f6924c = new Rect();
        this.f6925d = new RectF();
        this.f6926e = new RectF();
        this.f6927f = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6924c = new Rect();
        this.f6925d = new RectF();
        this.f6926e = new RectF();
        this.f6927f = new int[2];
    }

    public static Pair u(float f10, float f11, boolean z10, b bVar) {
        h d10;
        g gVar;
        String str;
        int i10;
        if (f10 == 0.0f || f11 == 0.0f) {
            d10 = bVar.f6933a.d("translationXLinear");
            gVar = bVar.f6933a;
            str = "translationYLinear";
        } else if ((!z10 || f11 >= 0.0f) && (z10 || i10 <= 0)) {
            d10 = bVar.f6933a.d("translationXCurveDownwards");
            gVar = bVar.f6933a;
            str = "translationYCurveDownwards";
        } else {
            d10 = bVar.f6933a.d("translationXCurveUpwards");
            gVar = bVar.f6933a;
            str = "translationYCurveUpwards";
        }
        return new Pair(d10, gVar.d(str));
    }

    public static float x(b bVar, h hVar, float f10) {
        long j10 = hVar.f16057a;
        long j11 = hVar.f16058b;
        h d10 = bVar.f6933a.d("expansion");
        float interpolation = hVar.b().getInterpolation(((float) (((d10.f16057a + d10.f16058b) + 17) - j10)) / ((float) j11));
        LinearInterpolator linearInterpolator = h9.a.f16043a;
        return e.a(0.0f, f10, interpolation, f10);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean b(View view, View view2) {
        if (view.getVisibility() != 8) {
            if (view2 instanceof FloatingActionButton) {
                int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
                return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
            }
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void c(CoordinatorLayout.f fVar) {
        if (fVar.f2166h == 0) {
            fVar.f2166h = 80;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03c7 A[LOOP:0: B:219:0x03c5->B:220:0x03c7, LOOP_END] */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.AnimatorSet t(android.view.View r27, android.view.View r28, boolean r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 980
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.t(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    public final float v(View view, View view2, i iVar) {
        RectF rectF = this.f6925d;
        RectF rectF2 = this.f6926e;
        y(view, rectF);
        rectF.offset(this.f6928g, this.f6929h);
        y(view2, rectF2);
        iVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float w(View view, View view2, i iVar) {
        RectF rectF = this.f6925d;
        RectF rectF2 = this.f6926e;
        y(view, rectF);
        rectF.offset(this.f6928g, this.f6929h);
        y(view2, rectF2);
        iVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final void y(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f6927f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract b z(Context context, boolean z10);
}
