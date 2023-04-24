package z7;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

/* loaded from: classes.dex */
public class b extends c {

    /* renamed from: g */
    public w7.a f32018g;

    /* renamed from: h */
    public RectF f32019h;

    /* renamed from: i */
    public q7.a[] f32020i;

    /* renamed from: j */
    public Paint f32021j;

    /* renamed from: k */
    public Paint f32022k;

    /* renamed from: l */
    public RectF f32023l;

    public b(w7.a aVar, p7.a aVar2, a8.g gVar) {
        super(aVar2, gVar);
        this.f32019h = new RectF();
        this.f32023l = new RectF();
        this.f32018g = aVar;
        Paint paint = new Paint(1);
        this.f32031d = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f32031d.setColor(Color.rgb(0, 0, 0));
        this.f32031d.setAlpha(120);
        Paint paint2 = new Paint(1);
        this.f32021j = paint2;
        paint2.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint(1);
        this.f32022k = paint3;
        paint3.setStyle(Paint.Style.STROKE);
    }

    @Override // z7.d
    public final void e(Canvas canvas) {
        t7.a barData = this.f32018g.getBarData();
        for (int i10 = 0; i10 < barData.d(); i10++) {
            x7.a aVar = (x7.a) barData.c(i10);
            if (aVar.isVisible()) {
                m(canvas, aVar, i10);
            }
        }
    }

    @Override // z7.d
    public final void f(Canvas canvas) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0059, code lost:
        if (r0 != false) goto L15;
     */
    @Override // z7.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(android.graphics.Canvas r12, v7.c[] r13) {
        /*
            r11 = this;
            w7.a r0 = r11.f32018g
            t7.a r6 = r0.getBarData()
            int r7 = r13.length
            r8 = 0
            r9 = 0
        L9:
            if (r9 >= r7) goto L9c
            r10 = r13[r9]
            int r0 = r10.f29161f
            x7.d r0 = r6.c(r0)
            x7.a r0 = (x7.a) r0
            if (r0 == 0) goto L98
            boolean r1 = r0.c0()
            if (r1 != 0) goto L1f
            goto L98
        L1f:
            float r1 = r10.f29156a
            float r2 = r10.f29157b
            t7.k r1 = r0.h(r1, r2)
            t7.c r1 = (t7.c) r1
            boolean r2 = r11.k(r1, r0)
            if (r2 != 0) goto L31
            goto L98
        L31:
            w7.a r2 = r11.f32018g
            s7.j$a r3 = r0.X()
            a8.e r5 = r2.c(r3)
            android.graphics.Paint r2 = r11.f32031d
            int r3 = r0.U()
            r2.setColor(r3)
            android.graphics.Paint r2 = r11.f32031d
            int r0 = r0.N()
            r2.setAlpha(r0)
            int r0 = r10.f29162g
            r2 = 1
            if (r0 < 0) goto L5c
            float[] r0 = r1.f27802d
            if (r0 == 0) goto L58
            r0 = 1
            goto L59
        L58:
            r0 = 0
        L59:
            if (r0 == 0) goto L5c
            goto L5d
        L5c:
            r2 = 0
        L5d:
            if (r2 == 0) goto L7b
            w7.a r0 = r11.f32018g
            boolean r0 = r0.d()
            if (r0 == 0) goto L6f
            float r0 = r1.f27805g
            float r2 = r1.f27804f
            float r2 = -r2
            r3 = r2
            r2 = r0
            goto L80
        L6f:
            v7.e[] r0 = r1.f27803e
            int r2 = r10.f29162g
            r0 = r0[r2]
            float r2 = r0.f29166a
            float r0 = r0.f29167b
            r3 = r0
            goto L80
        L7b:
            float r0 = r1.f27821a
            r2 = 0
            r2 = r0
            r3 = 0
        L80:
            float r1 = r1.f27841c
            float r0 = r6.f27796j
            r4 = 1073741824(0x40000000, float:2.0)
            float r4 = r0 / r4
            r0 = r11
            r0.o(r1, r2, r3, r4, r5)
            android.graphics.RectF r0 = r11.f32019h
            r11.p(r10, r0)
            android.graphics.RectF r0 = r11.f32019h
            android.graphics.Paint r1 = r11.f32031d
            r12.drawRect(r0, r1)
        L98:
            int r9 = r9 + 1
            goto L9
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.b.g(android.graphics.Canvas, v7.c[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:245:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02ac  */
    @Override // z7.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(android.graphics.Canvas r33) {
        /*
            Method dump skipped, instructions count: 717
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.b.h(android.graphics.Canvas):void");
    }

    @Override // z7.d
    public void i() {
        t7.a barData = this.f32018g.getBarData();
        this.f32020i = new q7.a[barData.d()];
        for (int i10 = 0; i10 < this.f32020i.length; i10++) {
            x7.a aVar = (x7.a) barData.c(i10);
            q7.a[] aVarArr = this.f32020i;
            int Y = aVar.Y() * 4;
            int K = aVar.Q() ? aVar.K() : 1;
            barData.d();
            aVarArr[i10] = new q7.a(Y * K, aVar.Q());
        }
    }

    public void m(Canvas canvas, x7.a aVar, int i10) {
        a8.e c10 = this.f32018g.c(aVar.X());
        this.f32022k.setColor(aVar.f());
        Paint paint = this.f32022k;
        aVar.m();
        paint.setStrokeWidth(a8.f.c(0.0f));
        aVar.m();
        this.f32029b.getClass();
        this.f32029b.getClass();
        int i11 = 0;
        if (this.f32018g.a()) {
            this.f32021j.setColor(aVar.E());
            float f10 = this.f32018g.getBarData().f27796j / 2.0f;
            int min = Math.min((int) Math.ceil(aVar.Y() * 1.0f), aVar.Y());
            for (int i12 = 0; i12 < min; i12++) {
                float f11 = ((t7.c) aVar.x(i12)).f27841c;
                RectF rectF = this.f32023l;
                rectF.left = f11 - f10;
                rectF.right = f11 + f10;
                c10.f380a.mapRect(rectF);
                c10.f382c.f396a.mapRect(rectF);
                c10.f381b.mapRect(rectF);
                if (((a8.g) this.f28477a).e(this.f32023l.right)) {
                    if (!((a8.g) this.f28477a).f(this.f32023l.left)) {
                        break;
                    }
                    RectF rectF2 = this.f32023l;
                    RectF rectF3 = ((a8.g) this.f28477a).f397b;
                    rectF2.top = rectF3.top;
                    rectF2.bottom = rectF3.bottom;
                    canvas.drawRect(rectF2, this.f32021j);
                }
            }
        }
        q7.a aVar2 = this.f32020i[i10];
        aVar2.f24631c = 1.0f;
        aVar2.f24632d = 1.0f;
        this.f32018g.e(aVar.X());
        aVar2.f24634f = false;
        aVar2.f24635g = this.f32018g.getBarData().f27796j;
        aVar2.b(aVar);
        c10.f(aVar2.f24630b);
        boolean z10 = true;
        if (aVar.J().size() != 1) {
            z10 = false;
        }
        if (z10) {
            this.f32030c.setColor(aVar.a0());
        }
        while (true) {
            float[] fArr = aVar2.f24630b;
            if (i11 < fArr.length) {
                int i13 = i11 + 2;
                if (((a8.g) this.f28477a).e(fArr[i13])) {
                    if (((a8.g) this.f28477a).f(aVar2.f24630b[i11])) {
                        if (!z10) {
                            this.f32030c.setColor(aVar.C(i11 / 4));
                        }
                        aVar.r();
                        aVar.O();
                        float[] fArr2 = aVar2.f24630b;
                        canvas.drawRect(fArr2[i11], fArr2[i11 + 1], fArr2[i13], fArr2[i11 + 3], this.f32030c);
                    } else {
                        return;
                    }
                }
                i11 += 4;
            } else {
                return;
            }
        }
    }

    public void n(Canvas canvas, String str, float f10, float f11, int i10) {
        this.f32032e.setColor(i10);
        canvas.drawText(str, f10, f11, this.f32032e);
    }

    public void o(float f10, float f11, float f12, float f13, a8.e eVar) {
        this.f32019h.set(f10 - f13, f11, f10 + f13, f12);
        RectF rectF = this.f32019h;
        this.f32029b.getClass();
        eVar.getClass();
        rectF.top *= 1.0f;
        rectF.bottom *= 1.0f;
        eVar.f380a.mapRect(rectF);
        eVar.f382c.f396a.mapRect(rectF);
        eVar.f381b.mapRect(rectF);
    }

    public void p(v7.c cVar, RectF rectF) {
        float centerX = rectF.centerX();
        float f10 = rectF.top;
        cVar.f29164i = centerX;
        cVar.f29165j = f10;
    }
}
