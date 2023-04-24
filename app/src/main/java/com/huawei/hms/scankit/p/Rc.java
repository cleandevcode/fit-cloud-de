package com.huawei.hms.scankit.p;

import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class Rc {

    /* renamed from: a */
    private static final Object f7680a = new Object();

    /* renamed from: d */
    private int f7683d;

    /* renamed from: e */
    private long f7684e;

    /* renamed from: f */
    private boolean f7685f;

    /* renamed from: g */
    private float f7686g;

    /* renamed from: h */
    private int[] f7687h;

    /* renamed from: i */
    private int f7688i;

    /* renamed from: j */
    private int f7689j;

    /* renamed from: k */
    private int f7690k;

    /* renamed from: l */
    private int f7691l;

    /* renamed from: m */
    private int f7692m;

    /* renamed from: o */
    private Path f7694o;

    /* renamed from: p */
    private PathMeasure f7695p;

    /* renamed from: b */
    private final ArrayList<Pc> f7681b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<Pc> f7682c = new ArrayList<>();

    /* renamed from: n */
    private boolean f7693n = false;

    /* renamed from: q */
    private Uc f7696q = new Uc();

    /* renamed from: r */
    private Wc f7697r = new Wc();

    public Rc(int i10, long j10) {
        a(i10, j10);
        a((Bitmap) null);
    }

    private int a(int i10, int i11) {
        return i10 == i11 ? i10 : i10 < i11 ? Yc.a(i11 - i10) + i10 : Yc.a(i10 - i11) + i11;
    }

    private void a(int i10) {
        synchronized (f7680a) {
            this.f7688i = 0;
        }
        this.f7686g = i10 / 1000.0f;
        this.f7685f = true;
    }

    private void a(int i10, long j10) {
        this.f7687h = new int[2];
        this.f7683d = i10;
        this.f7684e = j10;
    }

    private void a(Bitmap bitmap) {
        for (int i10 = 0; i10 < this.f7683d; i10++) {
            this.f7681b.add(new Pc(bitmap));
        }
    }

    private void a(Rect rect) {
        int i10 = rect.left - this.f7687h[0];
        this.f7690k = i10;
        this.f7689j = rect.width() + i10;
        int i11 = rect.top - this.f7687h[1];
        this.f7692m = i11;
        this.f7691l = rect.height() + i11;
    }

    private void a(Sc sc2) {
        if (this.f7696q == null) {
            this.f7696q = new Uc();
        }
        this.f7696q.a(sc2);
    }

    private void a(Vc vc2) {
        if (this.f7697r == null) {
            this.f7697r = new Wc();
        }
        this.f7697r.a(vc2);
    }

    private void b(long j10) {
        int a10;
        int a11;
        PathMeasure pathMeasure;
        Pc remove = this.f7681b.remove(0);
        this.f7697r.a(remove);
        if (!this.f7693n || (pathMeasure = this.f7695p) == null) {
            a10 = a(this.f7690k, this.f7689j);
            a11 = a(this.f7692m, this.f7691l);
        } else {
            float[] b10 = b(0.0f, pathMeasure.getLength());
            a10 = (int) b10[0];
            a11 = (int) b10[1];
        }
        remove.a(this.f7684e, a10, a11, j10, this.f7696q);
        synchronized (f7680a) {
            this.f7682c.add(remove);
            this.f7688i++;
        }
    }

    private float[] b(float f10, float f11) {
        float a10 = Float.compare(f10, f11) <= 0 ? Yc.a(f11 - f10) + f10 : f11 + Yc.a(f10 - f11);
        if (this.f7695p == null) {
            this.f7695p = new PathMeasure(this.f7694o, true);
        }
        this.f7695p.getPosTan(a10, r5, null);
        float f12 = r5[0];
        int[] iArr = this.f7687h;
        float[] fArr = {f12 - iArr[0], fArr[1] - iArr[1]};
        return fArr;
    }

    private void c() {
        ArrayList arrayList;
        synchronized (f7680a) {
            arrayList = new ArrayList(this.f7682c);
        }
        this.f7681b.addAll(arrayList);
    }

    public Rc a(float f10, float f11) {
        a(new Xc(f10, f11));
        return this;
    }

    public Rc a(int i10, int i11, long j10, long j11, Interpolator interpolator) {
        a(new Tc(i10, i11, j10, j11, interpolator));
        return this;
    }

    public void a() {
        c();
    }

    public void a(long j10) {
        boolean z10 = this.f7685f;
        float f10 = this.f7686g * ((float) j10);
        ArrayList arrayList = new ArrayList();
        synchronized (f7680a) {
            while (z10) {
                if (this.f7681b.isEmpty() || this.f7688i >= f10) {
                    break;
                }
                b(j10);
            }
            Iterator<Pc> it = this.f7682c.iterator();
            while (it.hasNext()) {
                Pc next = it.next();
                if (!next.a(j10)) {
                    it.remove();
                    arrayList.add(next);
                }
            }
        }
        this.f7681b.addAll(arrayList);
    }

    public void a(Rect rect, int i10) {
        a(rect);
        a(i10);
    }

    public List<Pc> b() {
        List<Pc> unmodifiableList;
        synchronized (f7680a) {
            unmodifiableList = Collections.unmodifiableList(this.f7682c);
        }
        return unmodifiableList;
    }
}
