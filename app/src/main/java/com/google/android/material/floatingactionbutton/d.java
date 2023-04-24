package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import b1.a;
import com.google.android.material.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import ga.m;
import java.util.ArrayList;
import java.util.Iterator;
import s.h1;
import z9.j;

/* loaded from: classes.dex */
public class d {
    public static final c2.a C = h9.a.f16045c;
    public static final int[] D = {16842919, 16842910};
    public static final int[] E = {16843623, 16842908, 16842910};
    public static final int[] F = {16842908, 16842910};
    public static final int[] G = {16843623, 16842910};
    public static final int[] H = {16842910};
    public static final int[] I = new int[0];
    public y9.c B;

    /* renamed from: a */
    public ga.i f6575a;

    /* renamed from: b */
    public ga.f f6576b;

    /* renamed from: c */
    public Drawable f6577c;

    /* renamed from: d */
    public y9.a f6578d;

    /* renamed from: e */
    public LayerDrawable f6579e;

    /* renamed from: f */
    public boolean f6580f;

    /* renamed from: h */
    public float f6582h;

    /* renamed from: i */
    public float f6583i;

    /* renamed from: j */
    public float f6584j;

    /* renamed from: k */
    public int f6585k;

    /* renamed from: l */
    public Animator f6586l;

    /* renamed from: m */
    public h9.g f6587m;

    /* renamed from: n */
    public h9.g f6588n;

    /* renamed from: o */
    public float f6589o;

    /* renamed from: q */
    public int f6591q;

    /* renamed from: s */
    public ArrayList<Animator.AnimatorListener> f6593s;

    /* renamed from: t */
    public ArrayList<Animator.AnimatorListener> f6594t;

    /* renamed from: u */
    public ArrayList<f> f6595u;

    /* renamed from: v */
    public final FloatingActionButton f6596v;

    /* renamed from: w */
    public final fa.b f6597w;

    /* renamed from: g */
    public boolean f6581g = true;

    /* renamed from: p */
    public float f6590p = 1.0f;

    /* renamed from: r */
    public int f6592r = 0;

    /* renamed from: x */
    public final Rect f6598x = new Rect();

    /* renamed from: y */
    public final RectF f6599y = new RectF();

    /* renamed from: z */
    public final RectF f6600z = new RectF();
    public final Matrix A = new Matrix();

    /* loaded from: classes.dex */
    public class a extends h9.f {
        public a() {
            d.this = r1;
        }

        @Override // android.animation.TypeEvaluator
        public final Matrix evaluate(float f10, Matrix matrix, Matrix matrix2) {
            d.this.f6590p = f10;
            matrix.getValues(this.f16052a);
            matrix2.getValues(this.f16053b);
            for (int i10 = 0; i10 < 9; i10++) {
                float[] fArr = this.f16053b;
                float f11 = fArr[i10];
                float f12 = this.f16052a[i10];
                fArr[i10] = t0.e.a(f11, f12, f10, f12);
            }
            this.f16054c.setValues(this.f16053b);
            return this.f16054c;
        }
    }

    /* loaded from: classes.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ float f6602a;

        /* renamed from: b */
        public final /* synthetic */ float f6603b;

        /* renamed from: c */
        public final /* synthetic */ float f6604c;

        /* renamed from: d */
        public final /* synthetic */ float f6605d;

        /* renamed from: e */
        public final /* synthetic */ float f6606e;

        /* renamed from: f */
        public final /* synthetic */ float f6607f;

        /* renamed from: g */
        public final /* synthetic */ float f6608g;

        /* renamed from: h */
        public final /* synthetic */ Matrix f6609h;

        public b(float f10, float f11, float f12, float f13, float f14, float f15, float f16, Matrix matrix) {
            d.this = r1;
            this.f6602a = f10;
            this.f6603b = f11;
            this.f6604c = f12;
            this.f6605d = f13;
            this.f6606e = f14;
            this.f6607f = f15;
            this.f6608g = f16;
            this.f6609h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            d.this.f6596v.setAlpha(h9.a.a(this.f6602a, this.f6603b, 0.0f, 0.2f, floatValue));
            FloatingActionButton floatingActionButton = d.this.f6596v;
            float f10 = this.f6604c;
            floatingActionButton.setScaleX(((this.f6605d - f10) * floatValue) + f10);
            FloatingActionButton floatingActionButton2 = d.this.f6596v;
            float f11 = this.f6606e;
            floatingActionButton2.setScaleY(((this.f6605d - f11) * floatValue) + f11);
            d dVar = d.this;
            float f12 = this.f6607f;
            float f13 = this.f6608g;
            dVar.f6590p = t0.e.a(f13, f12, floatValue, f12);
            dVar.a(t0.e.a(f13, f12, floatValue, f12), this.f6609h);
            d.this.f6596v.setImageMatrix(this.f6609h);
        }
    }

    /* loaded from: classes.dex */
    public class c extends i {
        public c(y9.d dVar) {
            super(dVar);
        }

        @Override // com.google.android.material.floatingactionbutton.d.i
        public final float a() {
            return 0.0f;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$d */
    /* loaded from: classes.dex */
    public class C0094d extends i {

        /* renamed from: e */
        public final /* synthetic */ d f6611e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0094d(y9.d dVar) {
            super(dVar);
            this.f6611e = dVar;
        }

        @Override // com.google.android.material.floatingactionbutton.d.i
        public final float a() {
            d dVar = this.f6611e;
            return dVar.f6582h + dVar.f6583i;
        }
    }

    /* loaded from: classes.dex */
    public class e extends i {

        /* renamed from: e */
        public final /* synthetic */ d f6612e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(y9.d dVar) {
            super(dVar);
            this.f6612e = dVar;
        }

        @Override // com.google.android.material.floatingactionbutton.d.i
        public final float a() {
            d dVar = this.f6612e;
            return dVar.f6582h + dVar.f6584j;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void a();

        void b();
    }

    /* loaded from: classes.dex */
    public interface g {
    }

    /* loaded from: classes.dex */
    public class h extends i {

        /* renamed from: e */
        public final /* synthetic */ d f6613e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(y9.d dVar) {
            super(dVar);
            this.f6613e = dVar;
        }

        @Override // com.google.android.material.floatingactionbutton.d.i
        public final float a() {
            return this.f6613e.f6582h;
        }
    }

    /* loaded from: classes.dex */
    public abstract class i extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public boolean f6614a;

        /* renamed from: b */
        public float f6615b;

        /* renamed from: c */
        public float f6616c;

        /* renamed from: d */
        public final /* synthetic */ d f6617d;

        public i(y9.d dVar) {
            this.f6617d = dVar;
        }

        public abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            d dVar = this.f6617d;
            float f10 = (int) this.f6616c;
            ga.f fVar = dVar.f6576b;
            if (fVar != null) {
                fVar.j(f10);
            }
            this.f6614a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f10;
            if (!this.f6614a) {
                ga.f fVar = this.f6617d.f6576b;
                if (fVar == null) {
                    f10 = 0.0f;
                } else {
                    f10 = fVar.f15069a.f15106n;
                }
                this.f6615b = f10;
                this.f6616c = a();
                this.f6614a = true;
            }
            d dVar = this.f6617d;
            float f11 = this.f6615b;
            float animatedFraction = (int) ((valueAnimator.getAnimatedFraction() * (this.f6616c - f11)) + f11);
            ga.f fVar2 = dVar.f6576b;
            if (fVar2 != null) {
                fVar2.j(animatedFraction);
            }
        }
    }

    public d(FloatingActionButton floatingActionButton, FloatingActionButton.b bVar) {
        this.f6596v = floatingActionButton;
        this.f6597w = bVar;
        j jVar = new j();
        y9.d dVar = (y9.d) this;
        jVar.a(D, d(new e(dVar)));
        jVar.a(E, d(new C0094d(dVar)));
        jVar.a(F, d(new C0094d(dVar)));
        jVar.a(G, d(new C0094d(dVar)));
        jVar.a(H, d(new h(dVar)));
        jVar.a(I, d(new c(dVar)));
        this.f6589o = floatingActionButton.getRotation();
    }

    public static ValueAnimator d(i iVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(C);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(iVar);
        valueAnimator.addUpdateListener(iVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public final void a(float f10, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f6596v.getDrawable();
        if (drawable == null || this.f6591q == 0) {
            return;
        }
        RectF rectF = this.f6599y;
        RectF rectF2 = this.f6600z;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int i10 = this.f6591q;
        rectF2.set(0.0f, 0.0f, i10, i10);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i11 = this.f6591q;
        matrix.postScale(f10, f10, i11 / 2.0f, i11 / 2.0f);
    }

    public final AnimatorSet b(h9.g gVar, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f6596v, View.ALPHA, f10);
        gVar.d("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f6596v, View.SCALE_X, f11);
        gVar.d("scale").a(ofFloat2);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 26) {
            ofFloat2.setEvaluator(new y9.b());
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f6596v, View.SCALE_Y, f11);
        gVar.d("scale").a(ofFloat3);
        if (i10 == 26) {
            ofFloat3.setEvaluator(new y9.b());
        }
        arrayList.add(ofFloat3);
        a(f12, this.A);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f6596v, new h9.e(), new a(), new Matrix(this.A));
        gVar.d("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        tb.a.l(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(float f10, float f11, float f12) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new b(this.f6596v.getAlpha(), f10, this.f6596v.getScaleX(), f11, this.f6596v.getScaleY(), this.f6590p, f12, new Matrix(this.A)));
        arrayList.add(ofFloat);
        tb.a.l(animatorSet, arrayList);
        Context context = this.f6596v.getContext();
        int i10 = R.attr.motionDurationLong1;
        int integer = this.f6596v.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1);
        TypedValue a10 = da.b.a(context, i10);
        if (a10 != null && a10.type == 16) {
            integer = a10.data;
        }
        animatorSet.setDuration(integer);
        animatorSet.setInterpolator(aa.a.c(this.f6596v.getContext(), R.attr.motionEasingStandard, h9.a.f16044b));
        return animatorSet;
    }

    public float e() {
        throw null;
    }

    public void f(Rect rect) {
        int sizeDimension = this.f6580f ? (this.f6585k - this.f6596v.getSizeDimension()) / 2 : 0;
        float e10 = this.f6581g ? e() + this.f6584j : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil(e10));
        int max2 = Math.max(sizeDimension, (int) Math.ceil(e10 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    public void g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        throw null;
    }

    public void h() {
        throw null;
    }

    public void i() {
        throw null;
    }

    public void j(int[] iArr) {
        throw null;
    }

    public void k(float f10, float f11, float f12) {
        throw null;
    }

    public final void l() {
        ArrayList<f> arrayList = this.f6595u;
        if (arrayList != null) {
            Iterator<f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public void m(ColorStateList colorStateList) {
        Drawable drawable = this.f6577c;
        if (drawable != null) {
            a.b.h(drawable, ea.b.c(colorStateList));
        }
    }

    public final void n(ga.i iVar) {
        this.f6575a = iVar;
        ga.f fVar = this.f6576b;
        if (fVar != null) {
            fVar.setShapeAppearanceModel(iVar);
        }
        Drawable drawable = this.f6577c;
        if (drawable instanceof m) {
            ((m) drawable).setShapeAppearanceModel(iVar);
        }
        y9.a aVar = this.f6578d;
        if (aVar != null) {
            aVar.f31242o = iVar;
            aVar.invalidateSelf();
        }
    }

    public boolean o() {
        throw null;
    }

    public void p() {
        throw null;
    }

    public final void q() {
        fa.b bVar;
        Drawable drawable;
        Rect rect = this.f6598x;
        f(rect);
        h1.i(this.f6579e, "Didn't initialize content background");
        if (o()) {
            drawable = new InsetDrawable((Drawable) this.f6579e, rect.left, rect.top, rect.right, rect.bottom);
            bVar = this.f6597w;
        } else {
            bVar = this.f6597w;
            drawable = this.f6579e;
        }
        FloatingActionButton.b bVar2 = (FloatingActionButton.b) bVar;
        if (drawable != null) {
            super/*android.widget.ImageButton*/.setBackgroundDrawable(drawable);
        } else {
            bVar2.getClass();
        }
        fa.b bVar3 = this.f6597w;
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = rect.right;
        int i13 = rect.bottom;
        FloatingActionButton.b bVar4 = (FloatingActionButton.b) bVar3;
        FloatingActionButton.this.f6556m.set(i10, i11, i12, i13);
        FloatingActionButton floatingActionButton = FloatingActionButton.this;
        int i14 = floatingActionButton.f6553j;
        floatingActionButton.setPadding(i10 + i14, i11 + i14, i12 + i14, i13 + i14);
    }
}
