package v7;

import s7.j;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public float f29156a;

    /* renamed from: b */
    public float f29157b;

    /* renamed from: c */
    public float f29158c;

    /* renamed from: d */
    public float f29159d;

    /* renamed from: e */
    public int f29160e;

    /* renamed from: f */
    public int f29161f;

    /* renamed from: g */
    public int f29162g;

    /* renamed from: h */
    public j.a f29163h;

    /* renamed from: i */
    public float f29164i;

    /* renamed from: j */
    public float f29165j;

    public c(float f10, float f11, float f12, float f13, int i10, int i11, j.a aVar) {
        this(f10, f11, f12, f13, i10, aVar);
        this.f29162g = i11;
    }

    public c(float f10, float f11, float f12, float f13, int i10, j.a aVar) {
        this.f29160e = -1;
        this.f29162g = -1;
        this.f29156a = f10;
        this.f29157b = f11;
        this.f29158c = f12;
        this.f29159d = f13;
        this.f29161f = i10;
        this.f29163h = aVar;
    }

    public final boolean a(c cVar) {
        return cVar != null && this.f29161f == cVar.f29161f && this.f29156a == cVar.f29156a && this.f29162g == cVar.f29162g && this.f29160e == cVar.f29160e;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("Highlight, x: ");
        a10.append(this.f29156a);
        a10.append(", y: ");
        a10.append(this.f29157b);
        a10.append(", dataSetIndex: ");
        a10.append(this.f29161f);
        a10.append(", stackIndex (only stacked barentry): ");
        a10.append(this.f29162g);
        return a10.toString();
    }
}
