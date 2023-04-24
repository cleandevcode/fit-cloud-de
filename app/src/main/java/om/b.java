package om;

import fm.p;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class b implements nm.g<lm.j> {

    /* renamed from: a */
    public final CharSequence f23625a;

    /* renamed from: b */
    public final int f23626b;

    /* renamed from: c */
    public final int f23627c;

    /* renamed from: d */
    public final p<CharSequence, Integer, tl.f<Integer, Integer>> f23628d;

    /* loaded from: classes2.dex */
    public static final class a implements Iterator<lm.j>, hm.a {

        /* renamed from: a */
        public int f23629a = -1;

        /* renamed from: b */
        public int f23630b;

        /* renamed from: c */
        public int f23631c;

        /* renamed from: d */
        public lm.j f23632d;

        /* renamed from: e */
        public int f23633e;

        public a() {
            b.this = r5;
            int i10 = r5.f23626b;
            int length = r5.f23625a.length();
            if (length >= 0) {
                if (i10 < 0) {
                    i10 = 0;
                } else if (i10 > length) {
                    i10 = length;
                }
                this.f23630b = i10;
                this.f23631c = i10;
                return;
            }
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + length + " is less than minimum 0.");
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0018, code lost:
            if (r6 < r3) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a() {
            /*
                r7 = this;
                int r0 = r7.f23631c
                r1 = 0
                if (r0 >= 0) goto Lb
                r7.f23629a = r1
                r0 = 0
                r7.f23632d = r0
                goto L7d
            Lb:
                om.b r2 = om.b.this
                int r3 = r2.f23627c
                r4 = -1
                r5 = 1
                if (r3 <= 0) goto L1a
                int r6 = r7.f23633e
                int r6 = r6 + r5
                r7.f23633e = r6
                if (r6 >= r3) goto L22
            L1a:
                java.lang.CharSequence r2 = r2.f23625a
                int r2 = r2.length()
                if (r0 <= r2) goto L36
            L22:
                lm.j r0 = new lm.j
                int r1 = r7.f23630b
                om.b r2 = om.b.this
                java.lang.CharSequence r2 = r2.f23625a
                int r2 = om.l.d0(r2)
                r0.<init>(r1, r2)
            L31:
                r7.f23632d = r0
                r7.f23631c = r4
                goto L7b
            L36:
                om.b r0 = om.b.this
                fm.p<java.lang.CharSequence, java.lang.Integer, tl.f<java.lang.Integer, java.lang.Integer>> r2 = r0.f23628d
                java.lang.CharSequence r0 = r0.f23625a
                int r3 = r7.f23631c
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Object r0 = r2.A(r0, r3)
                tl.f r0 = (tl.f) r0
                if (r0 != 0) goto L5a
                lm.j r0 = new lm.j
                int r1 = r7.f23630b
                om.b r2 = om.b.this
                java.lang.CharSequence r2 = r2.f23625a
                int r2 = om.l.d0(r2)
                r0.<init>(r1, r2)
                goto L31
            L5a:
                A r2 = r0.f28286a
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                B r0 = r0.f28287b
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r3 = r7.f23630b
                lm.j r3 = h7.a.A(r3, r2)
                r7.f23632d = r3
                int r2 = r2 + r0
                r7.f23630b = r2
                if (r0 != 0) goto L78
                r1 = 1
            L78:
                int r2 = r2 + r1
                r7.f23631c = r2
            L7b:
                r7.f23629a = r5
            L7d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: om.b.a.a():void");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f23629a == -1) {
                a();
            }
            return this.f23629a == 1;
        }

        @Override // java.util.Iterator
        public final lm.j next() {
            if (this.f23629a == -1) {
                a();
            }
            if (this.f23629a != 0) {
                lm.j jVar = this.f23632d;
                gm.l.d(jVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f23632d = null;
                this.f23629a = -1;
                return jVar;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(CharSequence charSequence, int i10, int i11, p<? super CharSequence, ? super Integer, tl.f<Integer, Integer>> pVar) {
        gm.l.f(charSequence, "input");
        this.f23625a = charSequence;
        this.f23626b = i10;
        this.f23627c = i11;
        this.f23628d = pVar;
    }

    @Override // nm.g
    public final Iterator<lm.j> iterator() {
        return new a();
    }
}
