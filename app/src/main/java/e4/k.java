package e4;

import java.io.Closeable;

/* loaded from: classes.dex */
public abstract class k implements Cloneable, Closeable {

    /* renamed from: a */
    public boolean f13423a;

    /* renamed from: b */
    public int f13424b = -1;

    /* renamed from: c */
    public char f13425c;

    /* renamed from: d */
    public Boolean f13426d;

    /* loaded from: classes.dex */
    public static class a extends k {

        /* renamed from: e */
        public final String f13427e;

        public a(String str) {
            this.f13427e = str;
            h();
            v();
        }

        @Override // e4.k
        public final void h() {
            int i10 = this.f13424b + 1;
            this.f13424b = i10;
            if (i10 < this.f13427e.length()) {
                this.f13425c = this.f13427e.charAt(this.f13424b);
                return;
            }
            this.f13425c = (char) 0;
            this.f13423a = true;
        }
    }

    public static final boolean b(char c10) {
        return c10 == ' ' || c10 == '\t' || c10 == '\r' || c10 == '\n' || c10 == '\f' || c10 == '\b';
    }

    /* JADX WARN: Code restructure failed: missing block: B:352:0x019e, code lost:
        if (r0 <= '9') goto L149;
     */
    /* JADX WARN: Removed duplicated region for block: B:263:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x00c3 A[EDGE_INSN: B:398:0x00c3->B:272:0x00c3 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x01e7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a() {
        /*
            Method dump skipped, instructions count: 552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.k.a():boolean");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public abstract void h();

    public final void v() {
        while (b(this.f13425c)) {
            h();
        }
    }
}
