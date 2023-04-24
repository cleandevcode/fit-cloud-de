package s1;

import bi.m0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import pm.e0;
import sm.g1;
import sm.u0;

/* loaded from: classes.dex */
public final class q<T> implements s1.i<T> {

    /* renamed from: k */
    public static final LinkedHashSet f26437k = new LinkedHashSet();

    /* renamed from: l */
    public static final Object f26438l = new Object();

    /* renamed from: a */
    public final fm.a<File> f26439a;

    /* renamed from: b */
    public final m<T> f26440b;

    /* renamed from: c */
    public final s1.b<T> f26441c;

    /* renamed from: d */
    public final e0 f26442d;

    /* renamed from: e */
    public final u0 f26443e;

    /* renamed from: f */
    public final String f26444f;

    /* renamed from: g */
    public final tl.i f26445g;

    /* renamed from: h */
    public final g1 f26446h;

    /* renamed from: i */
    public List<? extends fm.p<? super k<T>, ? super xl.d<? super tl.l>, ? extends Object>> f26447i;

    /* renamed from: j */
    public final p<a<T>> f26448j;

    /* loaded from: classes.dex */
    public static abstract class a<T> {

        /* renamed from: s1.q$a$a */
        /* loaded from: classes.dex */
        public static final class C0466a<T> extends a<T> {

            /* renamed from: a */
            public final b0<T> f26449a;

            public C0466a(b0<T> b0Var) {
                this.f26449a = b0Var;
            }
        }

        /* loaded from: classes.dex */
        public static final class b<T> extends a<T> {

            /* renamed from: a */
            public final fm.p<T, xl.d<? super T>, Object> f26450a;

            /* renamed from: b */
            public final pm.q<T> f26451b;

            /* renamed from: c */
            public final b0<T> f26452c;

            /* renamed from: d */
            public final xl.f f26453d;

            public b(fm.p pVar, pm.r rVar, b0 b0Var, xl.f fVar) {
                gm.l.f(fVar, "callerContext");
                this.f26450a = pVar;
                this.f26451b = rVar;
                this.f26452c = b0Var;
                this.f26453d = fVar;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends OutputStream {

        /* renamed from: a */
        public final FileOutputStream f26454a;

        public b(FileOutputStream fileOutputStream) {
            this.f26454a = fileOutputStream;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
            this.f26454a.flush();
        }

        @Override // java.io.OutputStream
        public final void write(int i10) {
            this.f26454a.write(i10);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) {
            gm.l.f(bArr, "b");
            this.f26454a.write(bArr);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i10, int i11) {
            gm.l.f(bArr, "bytes");
            this.f26454a.write(bArr, i10, i11);
        }
    }

    @zl.e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {322, 348, 505}, m = "readAndInit")
    /* loaded from: classes.dex */
    public static final class c extends zl.c {

        /* renamed from: d */
        public q f26455d;

        /* renamed from: e */
        public Object f26456e;

        /* renamed from: f */
        public Serializable f26457f;

        /* renamed from: g */
        public Object f26458g;

        /* renamed from: h */
        public d f26459h;

        /* renamed from: i */
        public Iterator f26460i;

        /* renamed from: j */
        public /* synthetic */ Object f26461j;

        /* renamed from: k */
        public final /* synthetic */ q<T> f26462k;

        /* renamed from: l */
        public int f26463l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(q<T> qVar, xl.d<? super c> dVar) {
            super(dVar);
            this.f26462k = qVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f26461j = obj;
            this.f26463l |= Integer.MIN_VALUE;
            q<T> qVar = this.f26462k;
            LinkedHashSet linkedHashSet = q.f26437k;
            return qVar.d(this);
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements k<T> {

        /* renamed from: a */
        public final /* synthetic */ ym.b f26464a;

        /* renamed from: b */
        public final /* synthetic */ gm.x f26465b;

        /* renamed from: c */
        public final /* synthetic */ gm.a0<T> f26466c;

        /* renamed from: d */
        public final /* synthetic */ q<T> f26467d;

        public d(ym.b bVar, gm.x xVar, gm.a0<T> a0Var, q<T> qVar) {
            this.f26464a = bVar;
            this.f26465b = xVar;
            this.f26466c = a0Var;
            this.f26467d = qVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:103:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x00d6 A[Catch: all -> 0x00d4, TRY_ENTER, TryCatch #0 {all -> 0x00d4, blocks: (B:90:0x008f, B:92:0x0093, B:111:0x00d6, B:112:0x00dd), top: B:115:0x008f }] */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0093 A[Catch: all -> 0x00d4, TRY_LEAVE, TryCatch #0 {all -> 0x00d4, blocks: (B:90:0x008f, B:92:0x0093, B:111:0x00d6, B:112:0x00dd), top: B:115:0x008f }] */
        /* JADX WARN: Removed duplicated region for block: B:98:0x00b3 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:81:0x0050, B:96:0x00ab, B:98:0x00b3), top: B:116:0x0050 }] */
        @Override // s1.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(s1.g r11, xl.d r12) {
            /*
                Method dump skipped, instructions count: 226
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: s1.q.d.a(s1.g, xl.d):java.lang.Object");
        }
    }

    @zl.e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {302}, m = "readAndInitOrPropagateAndThrowFailure")
    /* loaded from: classes.dex */
    public static final class e extends zl.c {

        /* renamed from: d */
        public q f26468d;

        /* renamed from: e */
        public /* synthetic */ Object f26469e;

        /* renamed from: f */
        public final /* synthetic */ q<T> f26470f;

        /* renamed from: g */
        public int f26471g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(q<T> qVar, xl.d<? super e> dVar) {
            super(dVar);
            this.f26470f = qVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f26469e = obj;
            this.f26471g |= Integer.MIN_VALUE;
            q<T> qVar = this.f26470f;
            LinkedHashSet linkedHashSet = q.f26437k;
            return qVar.e(this);
        }
    }

    @zl.e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {311}, m = "readAndInitOrPropagateFailure")
    /* loaded from: classes.dex */
    public static final class f extends zl.c {

        /* renamed from: d */
        public q f26472d;

        /* renamed from: e */
        public /* synthetic */ Object f26473e;

        /* renamed from: f */
        public final /* synthetic */ q<T> f26474f;

        /* renamed from: g */
        public int f26475g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(q<T> qVar, xl.d<? super f> dVar) {
            super(dVar);
            this.f26474f = qVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f26473e = obj;
            this.f26475g |= Integer.MIN_VALUE;
            q<T> qVar = this.f26474f;
            LinkedHashSet linkedHashSet = q.f26437k;
            return qVar.f(this);
        }
    }

    @zl.e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {381}, m = "readData")
    /* loaded from: classes.dex */
    public static final class g extends zl.c {

        /* renamed from: d */
        public q f26476d;

        /* renamed from: e */
        public FileInputStream f26477e;

        /* renamed from: f */
        public /* synthetic */ Object f26478f;

        /* renamed from: g */
        public final /* synthetic */ q<T> f26479g;

        /* renamed from: h */
        public int f26480h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(q<T> qVar, xl.d<? super g> dVar) {
            super(dVar);
            this.f26479g = qVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f26478f = obj;
            this.f26480h |= Integer.MIN_VALUE;
            q<T> qVar = this.f26479g;
            LinkedHashSet linkedHashSet = q.f26437k;
            return qVar.g(this);
        }
    }

    @zl.e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {359, 362, 365}, m = "readDataOrHandleCorruption")
    /* loaded from: classes.dex */
    public static final class h extends zl.c {

        /* renamed from: d */
        public Object f26481d;

        /* renamed from: e */
        public Object f26482e;

        /* renamed from: f */
        public /* synthetic */ Object f26483f;

        /* renamed from: g */
        public final /* synthetic */ q<T> f26484g;

        /* renamed from: h */
        public int f26485h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(q<T> qVar, xl.d<? super h> dVar) {
            super(dVar);
            this.f26484g = qVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f26483f = obj;
            this.f26485h |= Integer.MIN_VALUE;
            q<T> qVar = this.f26484g;
            LinkedHashSet linkedHashSet = q.f26437k;
            return qVar.h(this);
        }
    }

    @zl.e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {426}, m = "writeData$datastore_core")
    /* loaded from: classes.dex */
    public static final class i extends zl.c {

        /* renamed from: d */
        public q f26486d;

        /* renamed from: e */
        public File f26487e;

        /* renamed from: f */
        public FileOutputStream f26488f;

        /* renamed from: g */
        public FileOutputStream f26489g;

        /* renamed from: h */
        public /* synthetic */ Object f26490h;

        /* renamed from: i */
        public final /* synthetic */ q<T> f26491i;

        /* renamed from: j */
        public int f26492j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(q<T> qVar, xl.d<? super i> dVar) {
            super(dVar);
            this.f26491i = qVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f26490h = obj;
            this.f26492j |= Integer.MIN_VALUE;
            return this.f26491i.j(null, this);
        }
    }

    public q(v1.c cVar, List list, hh.c cVar2, e0 e0Var) {
        v1.f fVar = v1.f.f28990a;
        this.f26439a = cVar;
        this.f26440b = fVar;
        this.f26441c = cVar2;
        this.f26442d = e0Var;
        this.f26443e = new u0(new u(this, null));
        this.f26444f = ".tmp";
        this.f26445g = new tl.i(new w(this));
        this.f26446h = bi.r.c(c0.f26406a);
        this.f26447i = ul.q.Y(list);
        this.f26448j = new p<>(e0Var, new r(this), new t(this, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x004d  */
    /* JADX WARN: Type inference failed for: r8v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(s1.q r8, s1.q.a.b r9, xl.d r10) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.q.b(s1.q, s1.q$a$b, xl.d):java.lang.Object");
    }

    @Override // s1.i
    public final Object a(fm.p<? super T, ? super xl.d<? super T>, ? extends Object> pVar, xl.d<? super T> dVar) {
        pm.r a10 = m0.a();
        this.f26448j.a(new a.b(pVar, a10, (b0) this.f26446h.getValue(), dVar.e()));
        return a10.x0(dVar);
    }

    public final File c() {
        return (File) this.f26445g.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00fe A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00cd  */
    /* JADX WARN: Type inference failed for: r11v6, types: [ym.b] */
    /* JADX WARN: Type inference failed for: r13v0, types: [s1.q, s1.q<T>] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [ym.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(xl.d<? super tl.l> r14) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.q.d(xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(xl.d<? super tl.l> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof s1.q.e
            if (r0 == 0) goto L13
            r0 = r5
            s1.q$e r0 = (s1.q.e) r0
            int r1 = r0.f26471g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26471g = r1
            goto L18
        L13:
            s1.q$e r0 = new s1.q$e
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f26469e
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f26471g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            s1.q r0 = r0.f26468d
            mf.a0.k(r5)     // Catch: java.lang.Throwable -> L29
            goto L41
        L29:
            r5 = move-exception
            goto L46
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            mf.a0.k(r5)
            r0.f26468d = r4     // Catch: java.lang.Throwable -> L44
            r0.f26471g = r3     // Catch: java.lang.Throwable -> L44
            java.lang.Object r5 = r4.d(r0)     // Catch: java.lang.Throwable -> L44
            if (r5 != r1) goto L41
            return r1
        L41:
            tl.l r5 = tl.l.f28297a
            return r5
        L44:
            r5 = move-exception
            r0 = r4
        L46:
            sm.g1 r0 = r0.f26446h
            s1.l r1 = new s1.l
            r1.<init>(r5)
            r0.setValue(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.q.e(xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(xl.d<? super tl.l> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof s1.q.f
            if (r0 == 0) goto L13
            r0 = r5
            s1.q$f r0 = (s1.q.f) r0
            int r1 = r0.f26475g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26475g = r1
            goto L18
        L13:
            s1.q$f r0 = new s1.q$f
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f26473e
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f26475g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            s1.q r0 = r0.f26472d
            mf.a0.k(r5)     // Catch: java.lang.Throwable -> L29
            goto L4d
        L29:
            r5 = move-exception
            goto L43
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            mf.a0.k(r5)
            r0.f26472d = r4     // Catch: java.lang.Throwable -> L41
            r0.f26475g = r3     // Catch: java.lang.Throwable -> L41
            java.lang.Object r5 = r4.d(r0)     // Catch: java.lang.Throwable -> L41
            if (r5 != r1) goto L4d
            return r1
        L41:
            r5 = move-exception
            r0 = r4
        L43:
            sm.g1 r0 = r0.f26446h
            s1.l r1 = new s1.l
            r1.<init>(r5)
            r0.setValue(r1)
        L4d:
            tl.l r5 = tl.l.f28297a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.q.f(xl.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0035  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2, types: [s1.q$g] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(xl.d<? super T> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof s1.q.g
            if (r0 == 0) goto L13
            r0 = r5
            s1.q$g r0 = (s1.q.g) r0
            int r1 = r0.f26480h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26480h = r1
            goto L18
        L13:
            s1.q$g r0 = new s1.q$g
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f26478f
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f26480h
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.io.FileInputStream r1 = r0.f26477e
            s1.q r0 = r0.f26476d
            mf.a0.k(r5)     // Catch: java.lang.Throwable -> L2b
            goto L53
        L2b:
            r5 = move-exception
            goto L5e
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            mf.a0.k(r5)
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L64
            java.io.File r2 = r4.c()     // Catch: java.io.FileNotFoundException -> L64
            r5.<init>(r2)     // Catch: java.io.FileNotFoundException -> L64
            s1.m<T> r2 = r4.f26440b     // Catch: java.lang.Throwable -> L5a
            r0.f26476d = r4     // Catch: java.lang.Throwable -> L5a
            r0.f26477e = r5     // Catch: java.lang.Throwable -> L5a
            r0.f26480h = r3     // Catch: java.lang.Throwable -> L5a
            v1.a r0 = r2.b(r5)     // Catch: java.lang.Throwable -> L5a
            if (r0 != r1) goto L50
            return r1
        L50:
            r1 = r5
            r5 = r0
            r0 = r4
        L53:
            r2 = 0
            mf.a0.d(r1, r2)     // Catch: java.io.FileNotFoundException -> L58
            return r5
        L58:
            r5 = move-exception
            goto L66
        L5a:
            r0 = move-exception
            r1 = r5
            r5 = r0
            r0 = r4
        L5e:
            throw r5     // Catch: java.lang.Throwable -> L5f
        L5f:
            r2 = move-exception
            mf.a0.d(r1, r5)     // Catch: java.io.FileNotFoundException -> L58
            throw r2     // Catch: java.io.FileNotFoundException -> L58
        L64:
            r5 = move-exception
            r0 = r4
        L66:
            java.io.File r1 = r0.c()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L77
            s1.m<T> r5 = r0.f26440b
            v1.a r5 = r5.a()
            return r5
        L77:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.q.g(xl.d):java.lang.Object");
    }

    @Override // s1.i
    public final sm.f<T> getData() {
        return this.f26443e;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(xl.d<? super T> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof s1.q.h
            if (r0 == 0) goto L13
            r0 = r8
            s1.q$h r0 = (s1.q.h) r0
            int r1 = r0.f26485h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26485h = r1
            goto L18
        L13:
            s1.q$h r0 = new s1.q$h
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f26483f
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f26485h
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L53
            if (r2 == r5) goto L49
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r1 = r0.f26482e
            java.lang.Object r0 = r0.f26481d
            s1.a r0 = (s1.a) r0
            mf.a0.k(r8)     // Catch: java.io.IOException -> L33
            goto L85
        L33:
            r8 = move-exception
            goto L88
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3d:
            java.lang.Object r2 = r0.f26482e
            s1.a r2 = (s1.a) r2
            java.lang.Object r4 = r0.f26481d
            s1.q r4 = (s1.q) r4
            mf.a0.k(r8)
            goto L77
        L49:
            java.lang.Object r2 = r0.f26481d
            s1.q r2 = (s1.q) r2
            mf.a0.k(r8)     // Catch: s1.a -> L51
            goto L61
        L51:
            r8 = move-exception
            goto L64
        L53:
            mf.a0.k(r8)
            r0.f26481d = r7     // Catch: s1.a -> L62
            r0.f26485h = r5     // Catch: s1.a -> L62
            java.lang.Object r8 = r7.g(r0)     // Catch: s1.a -> L62
            if (r8 != r1) goto L61
            return r1
        L61:
            return r8
        L62:
            r8 = move-exception
            r2 = r7
        L64:
            s1.b<T> r5 = r2.f26441c
            r0.f26481d = r2
            r0.f26482e = r8
            r0.f26485h = r4
            java.lang.Object r4 = r5.a(r8)
            if (r4 != r1) goto L73
            return r1
        L73:
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L77:
            r0.f26481d = r2     // Catch: java.io.IOException -> L86
            r0.f26482e = r8     // Catch: java.io.IOException -> L86
            r0.f26485h = r3     // Catch: java.io.IOException -> L86
            java.lang.Object r0 = r4.j(r8, r0)     // Catch: java.io.IOException -> L86
            if (r0 != r1) goto L84
            return r1
        L84:
            r1 = r8
        L85:
            return r1
        L86:
            r8 = move-exception
            r0 = r2
        L88:
            ih.v.b(r0, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.q.h(xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(xl.d r8, xl.f r9, fm.p r10) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof s1.z
            if (r0 == 0) goto L13
            r0 = r8
            s1.z r0 = (s1.z) r0
            int r1 = r0.f26527i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26527i = r1
            goto L18
        L13:
            s1.z r0 = new s1.z
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f26525g
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f26527i
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r9 = r0.f26523e
            s1.q r10 = r0.f26522d
            mf.a0.k(r8)
            goto L86
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            java.lang.Object r9 = r0.f26524f
            java.lang.Object r10 = r0.f26523e
            s1.c r10 = (s1.c) r10
            s1.q r2 = r0.f26522d
            mf.a0.k(r8)
            goto L6b
        L43:
            mf.a0.k(r8)
            sm.g1 r8 = r7.f26446h
            java.lang.Object r8 = r8.getValue()
            s1.c r8 = (s1.c) r8
            r8.a()
            T r2 = r8.f26404a
            s1.a0 r6 = new s1.a0
            r6.<init>(r2, r3, r10)
            r0.f26522d = r7
            r0.f26523e = r8
            r0.f26524f = r2
            r0.f26527i = r5
            java.lang.Object r9 = bi.z0.s(r0, r9, r6)
            if (r9 != r1) goto L67
            return r1
        L67:
            r10 = r8
            r8 = r9
            r9 = r2
            r2 = r7
        L6b:
            r10.a()
            boolean r10 = gm.l.a(r9, r8)
            if (r10 == 0) goto L75
            goto L98
        L75:
            r0.f26522d = r2
            r0.f26523e = r8
            r0.f26524f = r3
            r0.f26527i = r4
            java.lang.Object r9 = r2.j(r8, r0)
            if (r9 != r1) goto L84
            return r1
        L84:
            r9 = r8
            r10 = r2
        L86:
            sm.g1 r8 = r10.f26446h
            s1.c r10 = new s1.c
            if (r9 == 0) goto L91
            int r0 = r9.hashCode()
            goto L92
        L91:
            r0 = 0
        L92:
            r10.<init>(r0, r9)
            r8.setValue(r10)
        L98:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.q.i(xl.d, xl.f, fm.p):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00a2 A[Catch: IOException -> 0x00be, TRY_ENTER, TryCatch #2 {IOException -> 0x00be, blocks: (B:87:0x0092, B:91:0x00a2, B:92:0x00bd, B:80:0x0068, B:97:0x00c3), top: B:109:0x0068 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(T r7, xl.d<? super tl.l> r8) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.q.j(java.lang.Object, xl.d):java.lang.Object");
    }
}
