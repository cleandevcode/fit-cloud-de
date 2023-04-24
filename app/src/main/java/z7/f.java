package z7;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import s.c0;
import t7.k;
import t7.l;
import z7.c;

/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: h */
    public w7.d f32039h;

    /* renamed from: i */
    public Paint f32040i;

    /* renamed from: j */
    public WeakReference<Bitmap> f32041j;

    /* renamed from: k */
    public Canvas f32042k;

    /* renamed from: l */
    public Bitmap.Config f32043l;

    /* renamed from: m */
    public Path f32044m;

    /* renamed from: n */
    public float[] f32045n;

    /* renamed from: o */
    public HashMap<x7.d, a> f32046o;

    /* renamed from: p */
    public float[] f32047p;

    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a */
        public Path f32048a = new Path();

        /* renamed from: b */
        public Bitmap[] f32049b;

        public a() {
            f.this = r1;
        }
    }

    public f(w7.d dVar, p7.a aVar, a8.g gVar) {
        super(aVar, gVar);
        this.f32043l = Bitmap.Config.ARGB_8888;
        this.f32044m = new Path();
        new Path();
        this.f32045n = new float[4];
        new Path();
        this.f32046o = new HashMap<>();
        this.f32047p = new float[2];
        this.f32039h = dVar;
        Paint paint = new Paint(1);
        this.f32040i = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f32040i.setColor(-1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v16, types: [t7.k, t7.g] */
    /* JADX WARN: Type inference failed for: r14v10, types: [t7.k, t7.g] */
    /* JADX WARN: Type inference failed for: r14v32, types: [t7.k, t7.g] */
    /* JADX WARN: Type inference failed for: r14v5, types: [t7.k, t7.g] */
    /* JADX WARN: Type inference failed for: r15v15, types: [t7.k, t7.g] */
    /* JADX WARN: Type inference failed for: r5v23, types: [t7.k, t7.g] */
    /* JADX WARN: Type inference failed for: r7v13, types: [t7.k, t7.g] */
    /* JADX WARN: Type inference failed for: r8v7, types: [t7.k, t7.g] */
    @Override // z7.d
    public final void e(Canvas canvas) {
        Bitmap bitmap;
        boolean z10;
        int i10;
        a8.g gVar = (a8.g) this.f28477a;
        int i11 = (int) gVar.f398c;
        int i12 = (int) gVar.f399d;
        WeakReference<Bitmap> weakReference = this.f32041j;
        PathEffect pathEffect = null;
        if (weakReference == null) {
            bitmap = null;
        } else {
            bitmap = weakReference.get();
        }
        if (bitmap == null || bitmap.getWidth() != i11 || bitmap.getHeight() != i12) {
            if (i11 > 0 && i12 > 0) {
                bitmap = Bitmap.createBitmap(i11, i12, this.f32043l);
                this.f32041j = new WeakReference<>(bitmap);
                this.f32042k = new Canvas(bitmap);
            } else {
                return;
            }
        }
        int i13 = 0;
        bitmap.eraseColor(0);
        for (T t10 : ((r7.c) this.f32039h).getLineData().f27831i) {
            if (t10.isVisible() && t10.Y() >= 1) {
                this.f32030c.setStrokeWidth(t10.e());
                Paint paint = this.f32030c;
                t10.s();
                paint.setPathEffect(pathEffect);
                int b10 = c0.b(t10.v());
                if (b10 != 2) {
                    if (b10 != 3) {
                        int Y = t10.Y();
                        if (t10.v() == 2) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            i10 = 4;
                        } else {
                            i10 = 2;
                        }
                        a8.e c10 = ((r7.a) this.f32039h).c(t10.X());
                        this.f32029b.getClass();
                        this.f32030c.setStyle(Paint.Style.STROKE);
                        t10.i();
                        this.f32024f.a(this.f32039h, t10);
                        t10.z();
                        if (t10.J().size() > 1) {
                            int i14 = i10 * 2;
                            if (this.f32045n.length <= i14) {
                                this.f32045n = new float[i10 * 4];
                            }
                            int i15 = this.f32024f.f32025a;
                            while (true) {
                                c.a aVar = this.f32024f;
                                if (i15 > aVar.f32027c + aVar.f32025a) {
                                    break;
                                }
                                ?? x10 = t10.x(i15);
                                if (x10 != 0) {
                                    this.f32045n[i13] = x10.b();
                                    this.f32045n[1] = x10.a() * 1.0f;
                                    if (i15 < this.f32024f.f32026b) {
                                        ?? x11 = t10.x(i15 + 1);
                                        if (x11 == 0) {
                                            break;
                                        }
                                        float[] fArr = this.f32045n;
                                        float b11 = x11.b();
                                        if (z10) {
                                            fArr[2] = b11;
                                            float[] fArr2 = this.f32045n;
                                            float f10 = fArr2[1];
                                            fArr2[3] = f10;
                                            fArr2[4] = fArr2[2];
                                            fArr2[5] = f10;
                                            fArr2[6] = x11.b();
                                            this.f32045n[7] = x11.a() * 1.0f;
                                        } else {
                                            fArr[2] = b11;
                                            this.f32045n[3] = x11.a() * 1.0f;
                                        }
                                    } else {
                                        float[] fArr3 = this.f32045n;
                                        fArr3[2] = fArr3[i13];
                                        fArr3[3] = fArr3[1];
                                    }
                                    c10.f(this.f32045n);
                                    if (!((a8.g) this.f28477a).f(this.f32045n[i13])) {
                                        break;
                                    } else if (((a8.g) this.f28477a).e(this.f32045n[2]) && (((a8.g) this.f28477a).g(this.f32045n[1]) || ((a8.g) this.f28477a).d(this.f32045n[3]))) {
                                        this.f32030c.setColor(t10.C(i15));
                                        canvas.drawLines(this.f32045n, i13, i14, this.f32030c);
                                    }
                                }
                                i15++;
                            }
                        } else {
                            int i16 = Y * i10;
                            if (this.f32045n.length < Math.max(i16, i10) * 2) {
                                this.f32045n = new float[Math.max(i16, i10) * 4];
                            }
                            if (t10.x(this.f32024f.f32025a) != 0) {
                                int i17 = this.f32024f.f32025a;
                                int i18 = 0;
                                while (true) {
                                    c.a aVar2 = this.f32024f;
                                    if (i17 > aVar2.f32027c + aVar2.f32025a) {
                                        break;
                                    }
                                    ?? x12 = t10.x(i17 == 0 ? 0 : i17 - 1);
                                    ?? x13 = t10.x(i17);
                                    if (x12 != 0 && x13 != 0) {
                                        int i19 = i18 + 1;
                                        this.f32045n[i18] = x12.b();
                                        int i20 = i19 + 1;
                                        this.f32045n[i19] = x12.a() * 1.0f;
                                        if (z10) {
                                            int i21 = i20 + 1;
                                            this.f32045n[i20] = x13.b();
                                            int i22 = i21 + 1;
                                            this.f32045n[i21] = x12.a() * 1.0f;
                                            int i23 = i22 + 1;
                                            this.f32045n[i22] = x13.b();
                                            i20 = i23 + 1;
                                            this.f32045n[i23] = x12.a() * 1.0f;
                                        }
                                        int i24 = i20 + 1;
                                        this.f32045n[i20] = x13.b();
                                        i18 = i24 + 1;
                                        this.f32045n[i24] = x13.a() * 1.0f;
                                    }
                                    i17++;
                                }
                                if (i18 > 0) {
                                    c10.f(this.f32045n);
                                    this.f32030c.setColor(t10.a0());
                                    canvas.drawLines(this.f32045n, 0, Math.max((this.f32024f.f32027c + 1) * i10, i10) * 2, this.f32030c);
                                }
                            }
                        }
                        pathEffect = null;
                        this.f32030c.setPathEffect(null);
                    } else {
                        this.f32029b.getClass();
                        a8.e c11 = ((r7.a) this.f32039h).c(t10.X());
                        this.f32024f.a(this.f32039h, t10);
                        this.f32044m.reset();
                        c.a aVar3 = this.f32024f;
                        if (aVar3.f32027c >= 1) {
                            ?? x14 = t10.x(aVar3.f32025a);
                            this.f32044m.moveTo(x14.b(), x14.a() * 1.0f);
                            int i25 = this.f32024f.f32025a + 1;
                            k kVar = x14;
                            while (true) {
                                c.a aVar4 = this.f32024f;
                                if (i25 > aVar4.f32027c + aVar4.f32025a) {
                                    break;
                                }
                                ?? x15 = t10.x(i25);
                                float b12 = ((x15.b() - kVar.b()) / 2.0f) + kVar.b();
                                this.f32044m.cubicTo(b12, kVar.a() * 1.0f, b12, x15.a() * 1.0f, x15.b(), x15.a() * 1.0f);
                                i25++;
                                kVar = x15;
                            }
                        }
                        t10.z();
                        this.f32030c.setColor(t10.a0());
                        this.f32030c.setStyle(Paint.Style.STROKE);
                        c11.d(this.f32044m);
                        this.f32042k.drawPath(this.f32044m, this.f32030c);
                        pathEffect = null;
                        this.f32030c.setPathEffect(null);
                    }
                } else {
                    this.f32029b.getClass();
                    a8.e c12 = ((r7.a) this.f32039h).c(t10.X());
                    this.f32024f.a(this.f32039h, t10);
                    float q10 = t10.q();
                    this.f32044m.reset();
                    c.a aVar5 = this.f32024f;
                    if (aVar5.f32027c >= 1) {
                        int i26 = aVar5.f32025a + 1;
                        T x16 = t10.x(Math.max(i26 - 2, 0));
                        ?? x17 = t10.x(Math.max(i26 - 1, 0));
                        if (x17 == 0) {
                            pathEffect = null;
                        } else {
                            this.f32044m.moveTo(x17.b(), x17.a() * 1.0f);
                            int i27 = -1;
                            int i28 = this.f32024f.f32025a + 1;
                            k kVar2 = x17;
                            k kVar3 = x17;
                            k kVar4 = x16;
                            while (true) {
                                c.a aVar6 = this.f32024f;
                                k kVar5 = kVar3;
                                if (i28 > aVar6.f32027c + aVar6.f32025a) {
                                    break;
                                }
                                if (i27 != i28) {
                                    kVar5 = t10.x(i28);
                                }
                                int i29 = i28 + 1;
                                if (i29 < t10.Y()) {
                                    i28 = i29;
                                }
                                ?? x18 = t10.x(i28);
                                this.f32044m.cubicTo(kVar2.b() + ((kVar5.b() - kVar4.b()) * q10), (kVar2.a() + ((kVar5.a() - kVar4.a()) * q10)) * 1.0f, kVar5.b() - ((x18.b() - kVar2.b()) * q10), (kVar5.a() - ((x18.a() - kVar2.a()) * q10)) * 1.0f, kVar5.b(), kVar5.a() * 1.0f);
                                kVar4 = kVar2;
                                kVar2 = kVar5;
                                kVar3 = x18;
                                int i30 = i28;
                                i28 = i29;
                                i27 = i30;
                            }
                        }
                    }
                    t10.z();
                    this.f32030c.setColor(t10.a0());
                    this.f32030c.setStyle(Paint.Style.STROKE);
                    c12.d(this.f32044m);
                    this.f32042k.drawPath(this.f32044m, this.f32030c);
                    pathEffect = null;
                    this.f32030c.setPathEffect(null);
                }
                this.f32030c.setPathEffect(pathEffect);
            }
            i13 = 0;
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f32030c);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0131  */
    /* JADX WARN: Type inference failed for: r5v4, types: [t7.k, t7.g] */
    @Override // z7.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(android.graphics.Canvas r20) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.f.f(android.graphics.Canvas):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [t7.k, t7.g] */
    @Override // z7.d
    public final void g(Canvas canvas, v7.c[] cVarArr) {
        l lineData = ((r7.c) this.f32039h).getLineData();
        for (v7.c cVar : cVarArr) {
            x7.e eVar = (x7.e) lineData.c(cVar.f29161f);
            if (eVar != null && eVar.c0()) {
                ?? h10 = eVar.h(cVar.f29156a, cVar.f29157b);
                if (k(h10, eVar)) {
                    a8.e c10 = ((r7.a) this.f32039h).c(eVar.X());
                    float b10 = h10.b();
                    float a10 = h10.a();
                    this.f32029b.getClass();
                    a8.b a11 = c10.a(b10, a10 * 1.0f);
                    float f10 = (float) a11.f367b;
                    float f11 = (float) a11.f368c;
                    cVar.f29164i = f10;
                    cVar.f29165j = f11;
                    this.f32031d.setColor(eVar.U());
                    this.f32031d.setStrokeWidth(eVar.o());
                    this.f32031d.setPathEffect(eVar.I());
                    if (eVar.d0()) {
                        this.f32051g.reset();
                        this.f32051g.moveTo(f10, ((a8.g) this.f28477a).f397b.top);
                        this.f32051g.lineTo(f10, ((a8.g) this.f28477a).f397b.bottom);
                        canvas.drawPath(this.f32051g, this.f32031d);
                    }
                    if (eVar.f0()) {
                        this.f32051g.reset();
                        this.f32051g.moveTo(((a8.g) this.f28477a).f397b.left, f11);
                        this.f32051g.lineTo(((a8.g) this.f28477a).f397b.right, f11);
                        canvas.drawPath(this.f32051g, this.f32031d);
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r12v14, types: [t7.k, t7.g] */
    /* JADX WARN: Type inference failed for: r13v3, types: [t7.k, t7.g, java.lang.Object] */
    @Override // z7.d
    public final void h(Canvas canvas) {
        if (j(this.f32039h)) {
            List<T> list = ((r7.c) this.f32039h).getLineData().f27831i;
            for (int i10 = 0; i10 < list.size(); i10++) {
                x7.e eVar = (x7.e) list.get(i10);
                if (c.l(eVar) && eVar.Y() >= 1) {
                    d(eVar);
                    a8.e c10 = ((r7.a) this.f32039h).c(eVar.X());
                    int y10 = (int) (eVar.y() * 1.75f);
                    if (!eVar.b0()) {
                        y10 /= 2;
                    }
                    this.f32024f.a(this.f32039h, eVar);
                    this.f32029b.getClass();
                    this.f32029b.getClass();
                    c.a aVar = this.f32024f;
                    int i11 = aVar.f32025a;
                    int i12 = (((int) ((aVar.f32026b - i11) * 1.0f)) + 1) * 2;
                    if (c10.f383d.length != i12) {
                        c10.f383d = new float[i12];
                    }
                    float[] fArr = c10.f383d;
                    for (int i13 = 0; i13 < i12; i13 += 2) {
                        ?? x10 = eVar.x((i13 / 2) + i11);
                        if (x10 != 0) {
                            fArr[i13] = x10.b();
                            fArr[i13 + 1] = x10.a() * 1.0f;
                        } else {
                            fArr[i13] = 0.0f;
                            fArr[i13 + 1] = 0.0f;
                        }
                    }
                    c10.f386g.set(c10.f380a);
                    c10.f386g.postConcat(c10.f382c.f396a);
                    c10.f386g.postConcat(c10.f381b);
                    c10.f386g.mapPoints(fArr);
                    u7.c u10 = eVar.u();
                    a8.c c11 = a8.c.c(eVar.Z());
                    c11.f370b = a8.f.c(c11.f370b);
                    c11.f371c = a8.f.c(c11.f371c);
                    for (int i14 = 0; i14 < fArr.length; i14 += 2) {
                        float f10 = fArr[i14];
                        float f11 = fArr[i14 + 1];
                        if (!((a8.g) this.f28477a).f(f10)) {
                            break;
                        }
                        if (((a8.g) this.f28477a).e(f10) && ((a8.g) this.f28477a).i(f11)) {
                            int i15 = i14 / 2;
                            ?? x11 = eVar.x(this.f32024f.f32025a + i15);
                            if (eVar.R()) {
                                u10.getClass();
                                this.f32032e.setColor(eVar.H(i15));
                                canvas.drawText(u10.a(x11.a()), f10, f11 - y10, this.f32032e);
                            }
                            x11.getClass();
                        }
                    }
                    a8.c.d(c11);
                }
            }
        }
    }

    @Override // z7.d
    public final void i() {
    }
}
