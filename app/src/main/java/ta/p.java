package ta;

import java.lang.reflect.Type;
import qa.x;
import qa.y;

/* loaded from: classes.dex */
public final class p<T> extends o<T> {

    /* renamed from: a */
    public final qa.r<T> f27905a;

    /* renamed from: b */
    public final qa.k<T> f27906b;

    /* renamed from: c */
    public final qa.h f27907c;

    /* renamed from: d */
    public final xa.a<T> f27908d;

    /* renamed from: e */
    public final y f27909e;

    /* renamed from: f */
    public final boolean f27910f;

    /* renamed from: g */
    public volatile x<T> f27911g;

    /* loaded from: classes.dex */
    public final class a {
    }

    public p(qa.r rVar, qa.k kVar, qa.h hVar, xa.a aVar, boolean z10) {
        new a();
        this.f27905a = rVar;
        this.f27906b = kVar;
        this.f27907c = hVar;
        this.f27908d = aVar;
        this.f27909e = null;
        this.f27910f = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x003b  */
    @Override // qa.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final T a(ya.a r3) {
        /*
            r2 = this;
            qa.k<T> r0 = r2.f27906b
            if (r0 != 0) goto Ld
            qa.x r0 = r2.d()
            java.lang.Object r3 = r0.a(r3)
            return r3
        Ld:
            r3.h0()     // Catch: java.lang.NumberFormatException -> L1c java.io.IOException -> L23 ya.c -> L2a java.io.EOFException -> L31
            r0 = 0
            ta.r$t r1 = ta.r.f27940z     // Catch: java.io.EOFException -> L1a java.lang.NumberFormatException -> L1c java.io.IOException -> L23 ya.c -> L2a
            java.lang.Object r3 = r1.a(r3)     // Catch: java.io.EOFException -> L1a java.lang.NumberFormatException -> L1c java.io.IOException -> L23 ya.c -> L2a
            qa.l r3 = (qa.l) r3     // Catch: java.io.EOFException -> L1a java.lang.NumberFormatException -> L1c java.io.IOException -> L23 ya.c -> L2a
            goto L37
        L1a:
            r3 = move-exception
            goto L33
        L1c:
            r3 = move-exception
            qa.s r0 = new qa.s
            r0.<init>(r3)
            throw r0
        L23:
            r3 = move-exception
            qa.m r0 = new qa.m
            r0.<init>(r3)
            throw r0
        L2a:
            r3 = move-exception
            qa.s r0 = new qa.s
            r0.<init>(r3)
            throw r0
        L31:
            r3 = move-exception
            r0 = 1
        L33:
            if (r0 == 0) goto L4f
            qa.n r3 = qa.n.f24663a
        L37:
            boolean r0 = r2.f27910f
            if (r0 == 0) goto L44
            r3.getClass()
            boolean r3 = r3 instanceof qa.n
            if (r3 == 0) goto L44
            r3 = 0
            return r3
        L44:
            qa.k<T> r3 = r2.f27906b
            xa.a<T> r0 = r2.f27908d
            java.lang.reflect.Type r0 = r0.f30457b
            java.lang.Object r3 = r3.deserialize()
            return r3
        L4f:
            qa.s r0 = new qa.s
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ta.p.a(ya.a):java.lang.Object");
    }

    @Override // qa.x
    public final void b(ya.b bVar, T t10) {
        qa.r<T> rVar = this.f27905a;
        if (rVar == null) {
            d().b(bVar, t10);
        } else if (this.f27910f && t10 == null) {
            bVar.y();
        } else {
            Type type = this.f27908d.f30457b;
            r.f27940z.b(bVar, rVar.serialize());
        }
    }

    @Override // ta.o
    public final x<T> c() {
        return this.f27905a != null ? this : d();
    }

    public final x<T> d() {
        x<T> xVar = this.f27911g;
        if (xVar != null) {
            return xVar;
        }
        x<T> d10 = this.f27907c.d(this.f27909e, this.f27908d);
        this.f27911g = d10;
        return d10;
    }
}
