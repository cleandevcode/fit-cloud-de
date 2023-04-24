package c7;

import android.content.Context;
import android.os.Build;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import c7.j;

/* loaded from: classes.dex */
public final class b implements j.a {

    /* renamed from: a */
    public final boolean f4545a;

    /* renamed from: b */
    public final f f4546b;

    /* renamed from: c */
    public final j f4547c;

    /* renamed from: d */
    public final a0<Integer> f4548d;

    /* renamed from: e */
    public final a f4549e;

    /* JADX WARN: Type inference failed for: r3v6, types: [c7.a] */
    public b(Context context) {
        j qVar;
        gm.l.f(context, "context");
        this.f4545a = true;
        Context applicationContext = context.getApplicationContext();
        gm.l.e(applicationContext, "context.applicationContext");
        f fVar = new f(applicationContext);
        this.f4546b = fVar;
        if (Build.VERSION.SDK_INT >= 24) {
            qVar = new p(fVar.f4553b);
        } else {
            qVar = new q(fVar.f4553b);
        }
        this.f4547c = qVar;
        this.f4548d = new a0<>();
        this.f4549e = new b0() { // from class: c7.a
            @Override // androidx.lifecycle.b0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void a(java.lang.Object r12) {
                /*
                    r11 = this;
                    c7.b r0 = c7.b.this
                    java.lang.Integer r12 = (java.lang.Integer) r12
                    java.lang.String r1 = "this$0"
                    gm.l.f(r0, r1)
                    r1 = -3
                    if (r12 != 0) goto Ld
                    goto L16
                Ld:
                    int r2 = r12.intValue()
                    r3 = -5
                    if (r2 != r3) goto L16
                    goto L94
                L16:
                    r2 = -4
                    r3 = 1
                    r4 = 0
                    if (r12 != 0) goto L1c
                    goto L23
                L1c:
                    int r5 = r12.intValue()
                    if (r5 != r2) goto L23
                    goto L2c
                L23:
                    if (r12 != 0) goto L26
                    goto L2e
                L26:
                    int r2 = r12.intValue()
                    if (r2 != r1) goto L2e
                L2c:
                    r1 = 1
                    goto L2f
                L2e:
                    r1 = 0
                L2f:
                    r2 = -2
                    if (r1 == 0) goto L39
                    androidx.lifecycle.a0<java.lang.Integer> r12 = r0.f4548d
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
                    goto L9a
                L39:
                    r1 = -1
                    if (r12 != 0) goto L3d
                    goto L44
                L3d:
                    int r5 = r12.intValue()
                    if (r5 != r2) goto L44
                    goto L4d
                L44:
                    if (r12 != 0) goto L47
                    goto L4f
                L47:
                    int r12 = r12.intValue()
                    if (r12 != r1) goto L4f
                L4d:
                    r12 = 1
                    goto L50
                L4f:
                    r12 = 0
                L50:
                    if (r12 == 0) goto L9d
                    c7.j r12 = r0.f4547c
                    c7.j$a r2 = r12.f4571c
                    if (r2 != 0) goto L79
                    boolean r2 = r12.a()
                    if (r2 == 0) goto L77
                    android.location.LocationManager r5 = r12.f4569a
                    long r7 = r12.f4574f
                    boolean r2 = r12.f4570b
                    if (r2 == 0) goto L6b
                    r2 = 1069547520(0x3fc00000, float:1.5)
                    r9 = 1069547520(0x3fc00000, float:1.5)
                    goto L6f
                L6b:
                    r2 = 1077936128(0x40400000, float:3.0)
                    r9 = 1077936128(0x40400000, float:3.0)
                L6f:
                    c7.k r10 = r12.f4575g
                    java.lang.String r6 = "gps"
                    r5.requestLocationUpdates(r6, r7, r9, r10)
                    goto L79
                L77:
                    r3 = 0
                    goto L7b
                L79:
                    r12.f4571c = r0
                L7b:
                    if (r3 == 0) goto L94
                    androidx.lifecycle.a0<java.lang.Integer> r12 = r0.f4548d
                    java.lang.Object r12 = r12.d()
                    java.lang.Integer r12 = (java.lang.Integer) r12
                    if (r12 == 0) goto L8d
                    int r12 = r12.intValue()
                    if (r12 >= 0) goto L9d
                L8d:
                    androidx.lifecycle.a0<java.lang.Integer> r12 = r0.f4548d
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
                    goto L9a
                L94:
                    androidx.lifecycle.a0<java.lang.Integer> r12 = r0.f4548d
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
                L9a:
                    r12.j(r0)
                L9d:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: c7.a.a(java.lang.Object):void");
            }
        };
    }

    @Override // c7.j.a
    public final void a(int i10) {
        this.f4548d.k(Integer.valueOf(i10));
    }
}
