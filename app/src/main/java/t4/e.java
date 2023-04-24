package t4;

import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.List;
import t4.h;
import x4.n;

/* loaded from: classes.dex */
public final class e implements h, d.a<Object> {

    /* renamed from: a */
    public final List<r4.f> f27585a;

    /* renamed from: b */
    public final i<?> f27586b;

    /* renamed from: c */
    public final h.a f27587c;

    /* renamed from: d */
    public int f27588d = -1;

    /* renamed from: e */
    public r4.f f27589e;

    /* renamed from: f */
    public List<x4.n<File, ?>> f27590f;

    /* renamed from: g */
    public int f27591g;

    /* renamed from: h */
    public volatile n.a<?> f27592h;

    /* renamed from: i */
    public File f27593i;

    public e(List<r4.f> list, i<?> iVar, h.a aVar) {
        this.f27585a = list;
        this.f27586b = iVar;
        this.f27587c = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0014, code lost:
        r8.f27592h = null;
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0018, code lost:
        if (r0 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0022, code lost:
        if (r8.f27591g >= r8.f27590f.size()) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0024, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0026, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0027, code lost:
        if (r3 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0029, code lost:
        r3 = r8.f27590f;
        r4 = r8.f27591g;
        r8.f27591g = r4 + 1;
        r4 = r8.f27593i;
        r5 = r8.f27586b;
        r8.f27592h = r3.get(r4).b(r4, r5.f27603e, r5.f27604f, r5.f27607i);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0049, code lost:
        if (r8.f27592h == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0059, code lost:
        if (r8.f27586b.c(r8.f27592h.f30237c.a()) == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x005b, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x005d, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x005e, code lost:
        if (r3 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0060, code lost:
        r8.f27592h.f30237c.e(r8.f27586b.f27613o, r8);
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x006d, code lost:
        return r0;
     */
    @Override // t4.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b() {
        /*
            r8 = this;
        L0:
            java.util.List<x4.n<java.io.File, ?>> r0 = r8.f27590f     // Catch: java.lang.Throwable -> Lb3
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L6e
            int r3 = r8.f27591g     // Catch: java.lang.Throwable -> Lb3
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Lb3
            if (r3 >= r0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 != 0) goto L14
            goto L6e
        L14:
            r0 = 0
            r8.f27592h = r0     // Catch: java.lang.Throwable -> Lb3
            r0 = 0
        L18:
            if (r0 != 0) goto L6d
            int r3 = r8.f27591g     // Catch: java.lang.Throwable -> Lb3
            java.util.List<x4.n<java.io.File, ?>> r4 = r8.f27590f     // Catch: java.lang.Throwable -> Lb3
            int r4 = r4.size()     // Catch: java.lang.Throwable -> Lb3
            if (r3 >= r4) goto L26
            r3 = 1
            goto L27
        L26:
            r3 = 0
        L27:
            if (r3 == 0) goto L6d
            java.util.List<x4.n<java.io.File, ?>> r3 = r8.f27590f     // Catch: java.lang.Throwable -> Lb3
            int r4 = r8.f27591g     // Catch: java.lang.Throwable -> Lb3
            int r5 = r4 + 1
            r8.f27591g = r5     // Catch: java.lang.Throwable -> Lb3
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> Lb3
            x4.n r3 = (x4.n) r3     // Catch: java.lang.Throwable -> Lb3
            java.io.File r4 = r8.f27593i     // Catch: java.lang.Throwable -> Lb3
            t4.i<?> r5 = r8.f27586b     // Catch: java.lang.Throwable -> Lb3
            int r6 = r5.f27603e     // Catch: java.lang.Throwable -> Lb3
            int r7 = r5.f27604f     // Catch: java.lang.Throwable -> Lb3
            r4.h r5 = r5.f27607i     // Catch: java.lang.Throwable -> Lb3
            x4.n$a r3 = r3.b(r4, r6, r7, r5)     // Catch: java.lang.Throwable -> Lb3
            r8.f27592h = r3     // Catch: java.lang.Throwable -> Lb3
            x4.n$a<?> r3 = r8.f27592h     // Catch: java.lang.Throwable -> Lb3
            if (r3 == 0) goto L18
            t4.i<?> r3 = r8.f27586b     // Catch: java.lang.Throwable -> Lb3
            x4.n$a<?> r4 = r8.f27592h     // Catch: java.lang.Throwable -> Lb3
            com.bumptech.glide.load.data.d<Data> r4 = r4.f30237c     // Catch: java.lang.Throwable -> Lb3
            java.lang.Class r4 = r4.a()     // Catch: java.lang.Throwable -> Lb3
            t4.v r3 = r3.c(r4)     // Catch: java.lang.Throwable -> Lb3
            if (r3 == 0) goto L5d
            r3 = 1
            goto L5e
        L5d:
            r3 = 0
        L5e:
            if (r3 == 0) goto L18
            x4.n$a<?> r0 = r8.f27592h     // Catch: java.lang.Throwable -> Lb3
            com.bumptech.glide.load.data.d<Data> r0 = r0.f30237c     // Catch: java.lang.Throwable -> Lb3
            t4.i<?> r3 = r8.f27586b     // Catch: java.lang.Throwable -> Lb3
            com.bumptech.glide.j r3 = r3.f27613o     // Catch: java.lang.Throwable -> Lb3
            r0.e(r3, r8)     // Catch: java.lang.Throwable -> Lb3
            r0 = 1
            goto L18
        L6d:
            return r0
        L6e:
            int r0 = r8.f27588d     // Catch: java.lang.Throwable -> Lb3
            int r0 = r0 + r2
            r8.f27588d = r0     // Catch: java.lang.Throwable -> Lb3
            java.util.List<r4.f> r2 = r8.f27585a     // Catch: java.lang.Throwable -> Lb3
            int r2 = r2.size()     // Catch: java.lang.Throwable -> Lb3
            if (r0 < r2) goto L7c
            return r1
        L7c:
            java.util.List<r4.f> r0 = r8.f27585a     // Catch: java.lang.Throwable -> Lb3
            int r2 = r8.f27588d     // Catch: java.lang.Throwable -> Lb3
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> Lb3
            r4.f r0 = (r4.f) r0     // Catch: java.lang.Throwable -> Lb3
            t4.f r2 = new t4.f     // Catch: java.lang.Throwable -> Lb3
            t4.i<?> r3 = r8.f27586b     // Catch: java.lang.Throwable -> Lb3
            r4.f r4 = r3.f27612n     // Catch: java.lang.Throwable -> Lb3
            r2.<init>(r0, r4)     // Catch: java.lang.Throwable -> Lb3
            t4.j$d r3 = r3.f27606h     // Catch: java.lang.Throwable -> Lb3
            t4.o$c r3 = (t4.o.c) r3     // Catch: java.lang.Throwable -> Lb3
            v4.a r3 = r3.a()     // Catch: java.lang.Throwable -> Lb3
            java.io.File r2 = r3.a(r2)     // Catch: java.lang.Throwable -> Lb3
            r8.f27593i = r2     // Catch: java.lang.Throwable -> Lb3
            if (r2 == 0) goto L0
            r8.f27589e = r0     // Catch: java.lang.Throwable -> Lb3
            t4.i<?> r0 = r8.f27586b     // Catch: java.lang.Throwable -> Lb3
            com.bumptech.glide.h r0 = r0.f27601c     // Catch: java.lang.Throwable -> Lb3
            com.bumptech.glide.k r0 = r0.a()     // Catch: java.lang.Throwable -> Lb3
            java.util.List r0 = r0.e(r2)     // Catch: java.lang.Throwable -> Lb3
            r8.f27590f = r0     // Catch: java.lang.Throwable -> Lb3
            r8.f27591g = r1     // Catch: java.lang.Throwable -> Lb3
            goto L0
        Lb3:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.e.b():boolean");
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void c(Exception exc) {
        this.f27587c.d(this.f27589e, exc, this.f27592h.f30237c, r4.a.DATA_DISK_CACHE);
    }

    @Override // t4.h
    public final void cancel() {
        n.a<?> aVar = this.f27592h;
        if (aVar != null) {
            aVar.f30237c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void f(Object obj) {
        this.f27587c.a(this.f27589e, obj, this.f27592h.f30237c, r4.a.DATA_DISK_CACHE, this.f27589e);
    }
}
