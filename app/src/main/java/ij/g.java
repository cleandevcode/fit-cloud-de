package ij;

import android.net.Uri;
import ij.c;
import java.io.File;

/* loaded from: classes2.dex */
public final class g extends gm.m implements fm.l<Uri, tk.t<? extends File>> {

    /* renamed from: b */
    public final /* synthetic */ c f17053b;

    /* renamed from: c */
    public final /* synthetic */ int f17054c;

    /* renamed from: d */
    public final /* synthetic */ int f17055d;

    /* renamed from: e */
    public final /* synthetic */ byte f17056e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(c cVar, int i10, int i11, byte b10) {
        super(1);
        this.f17053b = cVar;
        this.f17054c = i10;
        this.f17055d = i11;
        this.f17056e = b10;
    }

    @Override // fm.l
    public final tk.t<? extends File> k(Uri uri) {
        final Uri uri2 = uri;
        this.f17053b.f17042i.b(new c.a(3, -1));
        c cVar = this.f17053b;
        Object obj = cVar.f17039f;
        if (obj == null) {
            obj = new s(cVar.f17041h, cVar.f17037d);
        }
        final int i10 = this.f17054c;
        final int i11 = this.f17055d;
        gm.l.e(uri2, "it");
        final byte b10 = this.f17056e;
        final s sVar = (s) obj;
        gm.k.b(i10, "dfuMode");
        gm.k.b(i11, "dfuType");
        return new gl.b(new tk.s() { // from class: ij.r
            @Override // tk.s
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void a(gl.b.a r13) {
                /*
                    r12 = this;
                    int r0 = r1
                    android.net.Uri r1 = r2
                    byte r2 = r3
                    int r3 = r4
                    ij.s r4 = r5
                    java.lang.String r5 = "$dfuType"
                    gm.k.b(r0, r5)
                    java.lang.String r5 = "$uri"
                    gm.l.f(r1, r5)
                    java.lang.String r5 = "$dfuMode"
                    gm.k.b(r3, r5)
                    java.lang.String r5 = "this$0"
                    gm.l.f(r4, r5)
                    do.a$b r5 = p000do.a.f13275a
                    java.lang.String r6 = "file prepare dfuType:"
                    java.lang.StringBuilder r6 = android.support.v4.media.d.a(r6)
                    java.lang.String r7 = a0.q0.c(r0)
                    r6.append(r7)
                    java.lang.String r7 = " uri:"
                    r6.append(r7)
                    r6.append(r1)
                    java.lang.String r7 = " binFlag:"
                    r6.append(r7)
                    r6.append(r2)
                    java.lang.String r6 = r6.toString()
                    r7 = 0
                    java.lang.Object[] r8 = new java.lang.Object[r7]
                    r5.h(r6, r8)
                    java.lang.String r5 = r1.getScheme()
                    r6 = 3
                    r8 = 1
                    if (r2 == 0) goto L6b
                    int[] r9 = ij.s.a.f17078a
                    int r10 = s.c0.b(r3)
                    r9 = r9[r10]
                    r10 = 2
                    if (r9 == r8) goto L65
                    if (r9 != r10) goto L5f
                    if (r0 != r6) goto L6b
                    goto L69
                L5f:
                    qa.p r13 = new qa.p
                    r13.<init>()
                    throw r13
                L65:
                    if (r0 == r8) goto L6b
                    if (r0 == r10) goto L6b
                L69:
                    r9 = 1
                    goto L6c
                L6b:
                    r9 = 0
                L6c:
                    java.lang.String r10 = "content"
                    boolean r10 = gm.l.a(r10, r5)     // Catch: java.lang.Exception -> Lb4
                    if (r10 == 0) goto L7b
                    java.io.File r1 = r4.a(r1)     // Catch: java.lang.Exception -> Lb4
                    if (r9 == 0) goto Lad
                    goto Laa
                L7b:
                    r10 = 0
                    java.lang.String r11 = "file"
                    boolean r5 = gm.l.a(r5, r11)     // Catch: java.lang.Exception -> Lb4
                    if (r5 == 0) goto L88
                    java.lang.String r10 = r1.getPath()     // Catch: java.lang.Exception -> Lb4
                L88:
                    if (r10 == 0) goto L92
                    int r5 = r10.length()     // Catch: java.lang.Exception -> Lb4
                    if (r5 != 0) goto L91
                    goto L92
                L91:
                    r8 = 0
                L92:
                    if (r8 == 0) goto L9f
                    java.io.File r5 = new java.io.File     // Catch: java.lang.Exception -> Lb4
                    java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> Lb4
                    r5.<init>(r1)     // Catch: java.lang.Exception -> Lb4
                    r1 = r5
                    goto La4
                L9f:
                    java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> Lb4
                    r1.<init>(r10)     // Catch: java.lang.Exception -> Lb4
                La4:
                    if (r9 == 0) goto Lad
                    java.io.File r1 = r4.e(r1)     // Catch: java.lang.Exception -> Lb4
                Laa:
                    ij.s.c(r1, r3, r0, r2)     // Catch: java.lang.Exception -> Lb4
                Lad:
                    ij.s.d(r1)     // Catch: java.lang.Exception -> Lb4
                    r13.a(r1)     // Catch: java.lang.Exception -> Lb4
                    goto Lc3
                Lb4:
                    r0 = move-exception
                    boolean r1 = r0 instanceof yi.c
                    if (r1 == 0) goto Lba
                    goto Lc0
                Lba:
                    yi.c$a r1 = yi.c.f31771d
                    yi.c r0 = yi.c.a.b(r7, r0, r6)
                Lc0:
                    r13.b(r0)
                Lc3:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ij.r.a(gl.b$a):void");
            }
        });
    }
}
