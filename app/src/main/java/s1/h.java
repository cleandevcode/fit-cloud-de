package s1;

/* loaded from: classes.dex */
public final class h<T> {

    /* renamed from: a */
    public static final a f26424a = new a();

    /* loaded from: classes.dex */
    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:56:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0097  */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Throwable, T] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x0085 -> B:69:0x0067). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0088 -> B:69:0x0067). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final java.lang.Object a(s1.h.a r5, java.util.List r6, s1.k r7, xl.d r8) {
            /*
                r5.getClass()
                boolean r0 = r8 instanceof s1.f
                if (r0 == 0) goto L16
                r0 = r8
                s1.f r0 = (s1.f) r0
                int r1 = r0.f26414h
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L16
                int r1 = r1 - r2
                r0.f26414h = r1
                goto L1b
            L16:
                s1.f r0 = new s1.f
                r0.<init>(r5, r8)
            L1b:
                java.lang.Object r5 = r0.f26412f
                yl.a r8 = yl.a.COROUTINE_SUSPENDED
                int r1 = r0.f26414h
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L43
                if (r1 == r2) goto L3b
                if (r1 != r3) goto L33
                java.util.Iterator r6 = r0.f26411e
                java.io.Serializable r7 = r0.f26410d
                gm.a0 r7 = (gm.a0) r7
                mf.a0.k(r5)     // Catch: java.lang.Throwable -> L80
                goto L67
            L33:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L3b:
                java.io.Serializable r6 = r0.f26410d
                java.util.List r6 = (java.util.List) r6
                mf.a0.k(r5)
                goto L5d
            L43:
                mf.a0.k(r5)
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                s1.g r1 = new s1.g
                r4 = 0
                r1.<init>(r6, r5, r4)
                r0.f26410d = r5
                r0.f26414h = r2
                java.lang.Object r6 = r7.a(r1, r0)
                if (r6 != r8) goto L5c
                goto L96
            L5c:
                r6 = r5
            L5d:
                gm.a0 r5 = new gm.a0
                r5.<init>()
                java.util.Iterator r6 = r6.iterator()
                r7 = r5
            L67:
                boolean r5 = r6.hasNext()
                if (r5 == 0) goto L8e
                java.lang.Object r5 = r6.next()
                fm.l r5 = (fm.l) r5
                r0.f26410d = r7     // Catch: java.lang.Throwable -> L80
                r0.f26411e = r6     // Catch: java.lang.Throwable -> L80
                r0.f26414h = r3     // Catch: java.lang.Throwable -> L80
                java.lang.Object r5 = r5.k(r0)     // Catch: java.lang.Throwable -> L80
                if (r5 != r8) goto L67
                goto L96
            L80:
                r5 = move-exception
                T r1 = r7.f15485a
                if (r1 != 0) goto L88
                r7.f15485a = r5
                goto L67
            L88:
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                ih.v.b(r1, r5)
                goto L67
            L8e:
                T r5 = r7.f15485a
                java.lang.Throwable r5 = (java.lang.Throwable) r5
                if (r5 != 0) goto L97
                tl.l r8 = tl.l.f28297a
            L96:
                return r8
            L97:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: s1.h.a.a(s1.h$a, java.util.List, s1.k, xl.d):java.lang.Object");
        }
    }
}
