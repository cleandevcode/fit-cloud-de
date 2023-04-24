package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.google.android.material.circularreveal.b;

/* loaded from: classes.dex */
public interface c extends b.a {

    /* loaded from: classes.dex */
    public static class a implements TypeEvaluator<d> {

        /* renamed from: b */
        public static final a f6427b = new a();

        /* renamed from: a */
        public final d f6428a = new d();

        @Override // android.animation.TypeEvaluator
        public final d evaluate(float f10, d dVar, d dVar2) {
            d dVar3 = dVar;
            d dVar4 = dVar2;
            d dVar5 = this.f6428a;
            float f11 = dVar3.f6431a;
            float f12 = 1.0f - f10;
            float f13 = (dVar4.f6431a * f10) + (f11 * f12);
            float f14 = dVar3.f6432b;
            float f15 = dVar4.f6432b * f10;
            float f16 = dVar3.f6433c;
            float f17 = f10 * dVar4.f6433c;
            dVar5.f6431a = f13;
            dVar5.f6432b = f15 + (f14 * f12);
            dVar5.f6433c = f17 + (f12 * f16);
            return dVar5;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends Property<c, d> {

        /* renamed from: a */
        public static final b f6429a = new b();

        public b() {
            super(d.class, "circularReveal");
        }

        @Override // android.util.Property
        public final d get(c cVar) {
            return cVar.getRevealInfo();
        }

        @Override // android.util.Property
        public final void set(c cVar, d dVar) {
            cVar.setRevealInfo(dVar);
        }
    }

    /* renamed from: com.google.android.material.circularreveal.c$c */
    /* loaded from: classes.dex */
    public static class C0092c extends Property<c, Integer> {

        /* renamed from: a */
        public static final C0092c f6430a = new C0092c();

        public C0092c() {
            super(Integer.class, "circularRevealScrimColor");
        }

        @Override // android.util.Property
        public final Integer get(c cVar) {
            return Integer.valueOf(cVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        public final void set(c cVar, Integer num) {
            cVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public float f6431a;

        /* renamed from: b */
        public float f6432b;

        /* renamed from: c */
        public float f6433c;

        public d() {
        }

        public d(float f10, float f11, float f12) {
            this.f6431a = f10;
            this.f6432b = f11;
            this.f6433c = f12;
        }

        public d(d dVar) {
            this(dVar.f6431a, dVar.f6432b, dVar.f6433c);
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    d getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i10);

    void setRevealInfo(d dVar);
}
