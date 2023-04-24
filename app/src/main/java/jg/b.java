package jg;

import android.content.Context;
import com.topstep.fitcloud.pro.shared.data.bean.TokenBean;
import com.topstep.fitcloud.pro.shared.data.bean.UserBean;
import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import eh.f;
import eh.i;
import eh.j;
import gm.l;
import java.util.UUID;
import og.t;
import pg.m;
import yg.b0;
import yg.u;

/* loaded from: classes2.dex */
public final class b implements jg.a {

    /* renamed from: a */
    public final Context f17663a;

    /* renamed from: b */
    public final yg.j f17664b;

    /* renamed from: c */
    public final vg.d f17665c;

    /* renamed from: d */
    public final AppDatabase f17666d;

    /* renamed from: e */
    public final u f17667e;

    /* renamed from: f */
    public final t f17668f;

    /* renamed from: g */
    public volatile a f17669g;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public final int f17670a;

        /* renamed from: b */
        public final TokenBean f17671b;

        /* renamed from: c */
        public final String f17672c;

        public a(int i10, TokenBean tokenBean) {
            this.f17670a = i10;
            this.f17671b = tokenBean;
            String uuid = UUID.randomUUID().toString();
            l.e(uuid, "randomUUID().toString()");
            this.f17672c = uuid;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.auth.AuthManagerImpl", f = "AuthManager.kt", l = {314, 316, 319, 322, 325, 328, 331, 334, 337, 340, 343, 346, 349, 352, 355}, m = "clearAccount")
    /* renamed from: jg.b$b */
    /* loaded from: classes2.dex */
    public static final class C0309b extends zl.c {

        /* renamed from: d */
        public b f17673d;

        /* renamed from: e */
        public long f17674e;

        /* renamed from: f */
        public /* synthetic */ Object f17675f;

        /* renamed from: h */
        public int f17677h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0309b(xl.d<? super C0309b> dVar) {
            super(dVar);
            b.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f17675f = obj;
            this.f17677h |= Integer.MIN_VALUE;
            return b.this.m(0L, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.auth.AuthManagerImpl", f = "AuthManager.kt", l = {304, 305}, m = "deleteAccountByPassword")
    /* loaded from: classes2.dex */
    public static final class c extends zl.c {

        /* renamed from: d */
        public b f17678d;

        /* renamed from: e */
        public long f17679e;

        /* renamed from: f */
        public /* synthetic */ Object f17680f;

        /* renamed from: h */
        public int f17682h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(dVar);
            b.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f17680f = obj;
            this.f17682h |= Integer.MIN_VALUE;
            return b.this.h(0L, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.auth.AuthManagerImpl", f = "AuthManager.kt", l = {309, 310}, m = "deleteAccountByThirdParty")
    /* loaded from: classes2.dex */
    public static final class d extends zl.c {

        /* renamed from: d */
        public b f17683d;

        /* renamed from: e */
        public long f17684e;

        /* renamed from: f */
        public /* synthetic */ Object f17685f;

        /* renamed from: h */
        public int f17687h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(dVar);
            b.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f17685f = obj;
            this.f17687h |= Integer.MIN_VALUE;
            return b.this.d(0L, null, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.auth.AuthManagerImpl", f = "AuthManager.kt", l = {286, 279, 291, 293, 294}, m = "fillUser")
    /* loaded from: classes2.dex */
    public static final class e extends zl.c {

        /* renamed from: d */
        public b f17688d;

        /* renamed from: e */
        public Object f17689e;

        /* renamed from: f */
        public Object f17690f;

        /* renamed from: g */
        public String f17691g;

        /* renamed from: h */
        public String f17692h;

        /* renamed from: i */
        public Integer f17693i;

        /* renamed from: j */
        public String f17694j;

        /* renamed from: k */
        public Float f17695k;

        /* renamed from: l */
        public Float f17696l;

        /* renamed from: m */
        public /* synthetic */ Object f17697m;

        /* renamed from: o */
        public int f17699o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(xl.d<? super e> dVar) {
            super(dVar);
            b.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f17697m = obj;
            this.f17699o |= Integer.MIN_VALUE;
            return b.this.k(null, null, 0, null, 0.0f, 0.0f, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.auth.AuthManagerImpl", f = "AuthManager.kt", l = {156, 157, 158, 159}, m = "getLastUsername")
    /* loaded from: classes2.dex */
    public static final class f extends zl.c {

        /* renamed from: d */
        public b f17700d;

        /* renamed from: e */
        public long f17701e;

        /* renamed from: f */
        public /* synthetic */ Object f17702f;

        /* renamed from: h */
        public int f17704h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(xl.d<? super f> dVar) {
            super(dVar);
            b.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f17702f = obj;
            this.f17704h |= Integer.MIN_VALUE;
            return b.this.e(this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.auth.AuthManagerImpl", f = "AuthManager.kt", l = {235, 246}, m = "requestAuthCode")
    /* loaded from: classes2.dex */
    public static final class g extends zl.c {

        /* renamed from: d */
        public b f17705d;

        /* renamed from: e */
        public String f17706e;

        /* renamed from: f */
        public boolean f17707f;

        /* renamed from: g */
        public /* synthetic */ Object f17708g;

        /* renamed from: i */
        public int f17710i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(xl.d<? super g> dVar) {
            super(dVar);
            b.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f17708g = obj;
            this.f17710i |= Integer.MIN_VALUE;
            return b.this.c(null, false, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.auth.AuthManagerImpl", f = "AuthManager.kt", l = {181, 182, 190, 192, 195, 196, 198}, m = "signIn")
    /* loaded from: classes2.dex */
    public static final class h extends zl.c {

        /* renamed from: d */
        public b f17711d;

        /* renamed from: e */
        public Object f17712e;

        /* renamed from: f */
        public UserBean f17713f;

        /* renamed from: g */
        public int f17714g;

        /* renamed from: h */
        public /* synthetic */ Object f17715h;

        /* renamed from: j */
        public int f17717j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(xl.d<? super h> dVar) {
            super(dVar);
            b.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f17715h = obj;
            this.f17717j |= Integer.MIN_VALUE;
            return b.this.n(0, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.auth.AuthManagerImpl", f = "AuthManager.kt", l = {210, 216, 217}, m = "signInDirectly")
    /* loaded from: classes2.dex */
    public static final class i extends zl.c {

        /* renamed from: d */
        public b f17718d;

        /* renamed from: e */
        public m f17719e;

        /* renamed from: f */
        public /* synthetic */ Object f17720f;

        /* renamed from: h */
        public int f17722h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(xl.d<? super i> dVar) {
            super(dVar);
            b.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f17720f = obj;
            this.f17722h |= Integer.MIN_VALUE;
            return b.this.j(this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.auth.AuthManagerImpl", f = "AuthManager.kt", l = {228}, m = "signUp")
    /* loaded from: classes2.dex */
    public static final class j extends zl.c {

        /* renamed from: d */
        public b f17723d;

        /* renamed from: e */
        public boolean f17724e;

        /* renamed from: f */
        public /* synthetic */ Object f17725f;

        /* renamed from: h */
        public int f17727h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(xl.d<? super j> dVar) {
            super(dVar);
            b.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f17725f = obj;
            this.f17727h |= Integer.MIN_VALUE;
            return b.this.l(null, null, null, false, this);
        }
    }

    public b(Context context, yg.b bVar, vg.d dVar, AppDatabase appDatabase, b0 b0Var, t tVar) {
        l.f(appDatabase, "appDatabase");
        l.f(tVar, "deviceManager");
        this.f17663a = context;
        this.f17664b = bVar;
        this.f17665c = dVar;
        this.f17666d = appDatabase;
        this.f17667e = b0Var;
        this.f17668f = tVar;
    }

    @Override // jg.a
    public final Long a() {
        return this.f17664b.h().getValue();
    }

    @Override // jg.a
    public final Object b(String str, String str2, String str3, f.b bVar) {
        Object i02 = this.f17665c.i0(str, str2, str3, 1, bVar);
        if (i02 == yl.a.COROUTINE_SUSPENDED) {
            return i02;
        }
        return tl.l.f28297a;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0072  */
    @Override // jg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r6, boolean r7, xl.d<? super tl.l> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof jg.b.g
            if (r0 == 0) goto L13
            r0 = r8
            jg.b$g r0 = (jg.b.g) r0
            int r1 = r0.f17710i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17710i = r1
            goto L18
        L13:
            jg.b$g r0 = new jg.b$g
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f17708g
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f17710i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            mf.a0.k(r8)
            goto L8e
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            boolean r7 = r0.f17707f
            java.lang.String r6 = r0.f17706e
            jg.b r2 = r0.f17705d
            mf.a0.k(r8)
            goto L51
        L3c:
            mf.a0.k(r8)
            vg.d r8 = r5.f17665c
            r0.f17705d = r5
            r0.f17706e = r6
            r0.f17707f = r7
            r0.f17710i = r4
            java.lang.Object r8 = r8.q0(r6, r4, r0)
            if (r8 != r1) goto L50
            return r1
        L50:
            r2 = r5
        L51:
            vg.k r8 = (vg.k) r8
            T r8 = r8.f29381c
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r8 != r4) goto L5e
            goto L5f
        L5e:
            r4 = 0
        L5f:
            r8 = 0
            if (r4 == r7) goto L72
            ig.c r6 = new ig.c
            if (r7 == 0) goto L6c
            r7 = 1005(0x3ed, float:1.408E-42)
            r6.<init>(r7, r8)
            throw r6
        L6c:
            r7 = 1004(0x3ec, float:1.407E-42)
            r6.<init>(r7, r8)
            throw r6
        L72:
            android.content.Context r7 = r2.f17663a
            boolean r7 = h7.a.n(r7)
            if (r7 == 0) goto L7d
            java.lang.String r7 = "zh_CN"
            goto L7f
        L7d:
            java.lang.String r7 = "en"
        L7f:
            vg.d r2 = r2.f17665c
            r0.f17705d = r8
            r0.f17706e = r8
            r0.f17710i = r3
            java.lang.Object r6 = r2.b0(r6, r7, r0)
            if (r6 != r1) goto L8e
            return r1
        L8e:
            tl.l r6 = tl.l.f28297a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jg.b.c(java.lang.String, boolean, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005c A[RETURN] */
    @Override // jg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(long r10, java.lang.String r12, java.lang.String r13, xl.d<? super tl.l> r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof jg.b.d
            if (r0 == 0) goto L13
            r0 = r14
            jg.b$d r0 = (jg.b.d) r0
            int r1 = r0.f17687h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17687h = r1
            goto L18
        L13:
            jg.b$d r0 = new jg.b$d
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f17685f
            yl.a r7 = yl.a.COROUTINE_SUSPENDED
            int r1 = r0.f17687h
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 == r2) goto L32
            if (r1 != r8) goto L2a
            mf.a0.k(r14)
            goto L5d
        L2a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L32:
            long r10 = r0.f17684e
            jg.b r12 = r0.f17683d
            mf.a0.k(r14)
            goto L51
        L3a:
            mf.a0.k(r14)
            vg.d r1 = r9.f17665c
            r0.f17683d = r9
            r0.f17684e = r10
            r0.f17687h = r2
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r0
            java.lang.Object r12 = r1.l(r2, r4, r5, r6)
            if (r12 != r7) goto L50
            return r7
        L50:
            r12 = r9
        L51:
            r13 = 0
            r0.f17683d = r13
            r0.f17687h = r8
            java.lang.Object r10 = r12.m(r10, r0)
            if (r10 != r7) goto L5d
            return r7
        L5d:
            tl.l r10 = tl.l.f28297a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: jg.b.d(long, java.lang.String, java.lang.String, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00a2 A[RETURN] */
    @Override // jg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(xl.d<? super java.lang.String> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof jg.b.f
            if (r0 == 0) goto L13
            r0 = r11
            jg.b$f r0 = (jg.b.f) r0
            int r1 = r0.f17704h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17704h = r1
            goto L18
        L13:
            jg.b$f r0 = new jg.b$f
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f17702f
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f17704h
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4b
            if (r2 == r6) goto L45
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            mf.a0.k(r11)
            goto L8f
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L39:
            mf.a0.k(r11)
            goto La1
        L3d:
            long r8 = r0.f17701e
            jg.b r2 = r0.f17700d
            mf.a0.k(r11)
            goto L73
        L45:
            jg.b r2 = r0.f17700d
            mf.a0.k(r11)
            goto L5c
        L4b:
            mf.a0.k(r11)
            yg.j r11 = r10.f17664b
            r0.f17700d = r10
            r0.f17704h = r6
            java.lang.Object r11 = r11.k(r0)
            if (r11 != r1) goto L5b
            return r1
        L5b:
            r2 = r10
        L5c:
            java.lang.Long r11 = (java.lang.Long) r11
            if (r11 == 0) goto La2
            long r8 = r11.longValue()
            yg.j r11 = r2.f17664b
            r0.f17700d = r2
            r0.f17701e = r8
            r0.f17704h = r5
            java.lang.Object r11 = r11.n(r0)
            if (r11 != r1) goto L73
            return r1
        L73:
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            if (r11 == 0) goto L90
            if (r11 == r6) goto L7e
            return r7
        L7e:
            com.topstep.fitcloud.pro.shared.data.db.AppDatabase r11 = r2.f17666d
            mg.hb r11 = r11.H()
            r0.f17700d = r7
            r0.f17704h = r3
            java.lang.Object r11 = r11.f(r8, r0)
            if (r11 != r1) goto L8f
            return r1
        L8f:
            return r11
        L90:
            com.topstep.fitcloud.pro.shared.data.db.AppDatabase r11 = r2.f17666d
            mg.hb r11 = r11.H()
            r0.f17700d = r7
            r0.f17704h = r4
            java.lang.Object r11 = r11.i(r8, r0)
            if (r11 != r1) goto La1
            return r1
        La1:
            return r11
        La2:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: jg.b.e(xl.d):java.lang.Object");
    }

    @Override // jg.a
    public final Object f(xl.d<? super tl.l> dVar) {
        Object u10 = this.f17664b.u(dVar);
        return u10 == yl.a.COROUTINE_SUSPENDED ? u10 : tl.l.f28297a;
    }

    @Override // jg.a
    public final Object g(String str, String str2, boolean z10, i.b bVar) {
        return n(!z10 ? 1 : 0, new jg.c(this, str, str2, null), bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0058 A[RETURN] */
    @Override // jg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(long r6, java.lang.String r8, xl.d<? super tl.l> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof jg.b.c
            if (r0 == 0) goto L13
            r0 = r9
            jg.b$c r0 = (jg.b.c) r0
            int r1 = r0.f17682h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17682h = r1
            goto L18
        L13:
            jg.b$c r0 = new jg.b$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f17680f
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f17682h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            mf.a0.k(r9)
            goto L59
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            long r6 = r0.f17679e
            jg.b r8 = r0.f17678d
            mf.a0.k(r9)
            goto L4d
        L3a:
            mf.a0.k(r9)
            vg.d r9 = r5.f17665c
            r0.f17678d = r5
            r0.f17679e = r6
            r0.f17682h = r4
            java.lang.Object r8 = r9.Q(r6, r8, r0)
            if (r8 != r1) goto L4c
            return r1
        L4c:
            r8 = r5
        L4d:
            r9 = 0
            r0.f17678d = r9
            r0.f17682h = r3
            java.lang.Object r6 = r8.m(r6, r0)
            if (r6 != r1) goto L59
            return r1
        L59:
            tl.l r6 = tl.l.f28297a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jg.b.h(long, java.lang.String, xl.d):java.lang.Object");
    }

    @Override // jg.a
    public final Object i(String str, String str2, j.b bVar) {
        return n(2, new jg.d(this, str, str2, null), bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a3 A[RETURN] */
    @Override // jg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(xl.d<? super jg.a.C0308a> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof jg.b.i
            if (r0 == 0) goto L13
            r0 = r12
            jg.b$i r0 = (jg.b.i) r0
            int r1 = r0.f17722h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17722h = r1
            goto L18
        L13:
            jg.b$i r0 = new jg.b$i
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f17720f
            yl.a r7 = yl.a.COROUTINE_SUSPENDED
            int r1 = r0.f17722h
            r2 = 2
            r3 = 1
            r8 = 3
            r9 = 0
            if (r1 == 0) goto L46
            if (r1 == r3) goto L3f
            if (r1 == r2) goto L37
            if (r1 != r8) goto L2f
            mf.a0.k(r12)
            goto La4
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L37:
            pg.m r1 = r0.f17719e
            jg.b r2 = r0.f17718d
            mf.a0.k(r12)
            goto L8e
        L3f:
            jg.b r1 = r0.f17718d
            mf.a0.k(r12)
            r10 = r1
            goto L62
        L46:
            mf.a0.k(r12)
            r11.f17669g = r9
            com.topstep.fitcloud.pro.shared.data.db.AppDatabase r12 = r11.f17666d
            mg.hb r12 = r12.H()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0.f17718d = r11
            r0.f17722h = r3
            java.lang.Object r12 = r12.e(r4, r0)
            if (r12 != r7) goto L61
            return r7
        L61:
            r10 = r11
        L62:
            pg.m r12 = (pg.m) r12
            if (r12 != 0) goto L75
            jg.b$a r12 = new jg.b$a
            r12.<init>(r8, r9)
            r10.f17669g = r12
            jg.a$a r9 = new jg.a$a
            java.lang.String r12 = r12.f17672c
            r9.<init>(r12)
            goto Lb3
        L75:
            yg.j r1 = r10.f17664b
            long r3 = r12.f24070d
            r5 = 3
            r6 = 0
            r0.f17718d = r10
            r0.f17719e = r12
            r0.f17722h = r2
            r2 = r3
            r4 = r5
            r5 = r6
            r6 = r0
            java.lang.Object r1 = r1.y(r2, r4, r5, r6)
            if (r1 != r7) goto L8c
            return r7
        L8c:
            r1 = r12
            r2 = r10
        L8e:
            yg.u r12 = r2.f17667e
            long r1 = r1.f24070d
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r1)
            r0.f17718d = r9
            r0.f17719e = r9
            r0.f17722h = r8
            java.lang.Object r12 = r12.n(r3, r0)
            if (r12 != r7) goto La4
            return r7
        La4:
            do.a$b r12 = p000do.a.f13275a
            java.lang.String r0 = "AuthManager"
            r12.t(r0)
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "signInDirectly finished"
            r12.p(r1, r0)
        Lb3:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: jg.b.j(xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0157 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x017e A[RETURN] */
    @Override // jg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(java.lang.String r38, java.lang.String r39, int r40, java.lang.String r41, float r42, float r43, java.lang.String r44, xl.d<? super java.lang.Boolean> r45) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jg.b.k(java.lang.String, java.lang.String, int, java.lang.String, float, float, java.lang.String, xl.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0034  */
    @Override // jg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(java.lang.String r11, java.lang.String r12, java.lang.String r13, boolean r14, xl.d<? super jg.a.C0308a> r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof jg.b.j
            if (r0 == 0) goto L13
            r0 = r15
            jg.b$j r0 = (jg.b.j) r0
            int r1 = r0.f17727h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17727h = r1
            goto L18
        L13:
            jg.b$j r0 = new jg.b$j
            r0.<init>(r15)
        L18:
            r8 = r0
            java.lang.Object r15 = r8.f17725f
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r8.f17727h
            r9 = 1
            if (r1 == 0) goto L34
            if (r1 != r9) goto L2c
            boolean r14 = r8.f17724e
            jg.b r11 = r8.f17723d
            mf.a0.k(r15)
            goto L6c
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L34:
            mf.a0.k(r15)
            r15 = 0
            r10.f17669g = r15
            if (r14 == 0) goto L49
            boolean r15 = android.text.TextUtils.isEmpty(r13)
            if (r15 != 0) goto L43
            goto L49
        L43:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>()
            throw r11
        L49:
            vg.d r1 = r10.f17665c
            r8.f17723d = r10
            r8.f17724e = r14
            r8.f17727h = r9
            if (r13 == 0) goto L5c
            int r15 = r13.length()
            if (r15 != 0) goto L5a
            goto L5c
        L5a:
            r15 = 0
            goto L5d
        L5c:
            r15 = 1
        L5d:
            r5 = r15 ^ 1
            r6 = 1
            r7 = 0
            r2 = r11
            r3 = r12
            r4 = r13
            java.lang.Object r15 = r1.g0(r2, r3, r4, r5, r6, r7, r8)
            if (r15 != r0) goto L6b
            return r0
        L6b:
            r11 = r10
        L6c:
            vg.k r15 = (vg.k) r15
            T r12 = r15.f29381c
            com.topstep.fitcloud.pro.shared.data.bean.TokenBean r12 = (com.topstep.fitcloud.pro.shared.data.bean.TokenBean) r12
            jg.b$a r13 = new jg.b$a
            r11.getClass()
            r14 = r14 ^ r9
            r13.<init>(r14, r12)
            r11.f17669g = r13
            jg.a$a r11 = new jg.a$a
            java.lang.String r12 = r13.f17672c
            r11.<init>(r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: jg.b.l(java.lang.String, java.lang.String, java.lang.String, boolean, xl.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|8))|144|6|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x00d2, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x00d3, code lost:
        p000do.a.f13275a.q(r7);
        mf.a0.f(r7);
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x00f2, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x00f3, code lost:
        p000do.a.f13275a.q(r7);
        mf.a0.f(r7);
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0112, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0113, code lost:
        p000do.a.f13275a.q(r7);
        mf.a0.f(r7);
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0132, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0133, code lost:
        p000do.a.f13275a.q(r7);
        mf.a0.f(r7);
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0152, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0153, code lost:
        p000do.a.f13275a.q(r7);
        mf.a0.f(r7);
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0172, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0173, code lost:
        p000do.a.f13275a.q(r7);
        mf.a0.f(r7);
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0193, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0194, code lost:
        p000do.a.f13275a.q(r7);
        mf.a0.f(r7);
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x01b4, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x01b5, code lost:
        p000do.a.f13275a.q(r7);
        mf.a0.f(r7);
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x01d5, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x01d6, code lost:
        p000do.a.f13275a.q(r7);
        mf.a0.f(r7);
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x01f6, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x01f7, code lost:
        p000do.a.f13275a.q(r7);
        mf.a0.f(r7);
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0217, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0218, code lost:
        p000do.a.f13275a.q(r7);
        mf.a0.f(r7);
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0238, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0239, code lost:
        p000do.a.f13275a.q(r7);
        mf.a0.f(r7);
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0259, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x025a, code lost:
        p000do.a.f13275a.q(r7);
        mf.a0.f(r7);
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0279, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x027a, code lost:
        p000do.a.f13275a.q(r5);
        mf.a0.f(r5);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0029 A[Catch: all -> 0x0279, TRY_ENTER, TRY_LEAVE, TryCatch #13 {all -> 0x0279, blocks: (B:185:0x0029, B:325:0x0276, B:322:0x0262), top: B:331:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x00ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x010e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x012e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x014e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x016e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x018f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x01b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x01d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x01f2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0213 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0234 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0255 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0275 A[RETURN] */
    /* JADX WARN: Type inference failed for: r2v100 */
    /* JADX WARN: Type inference failed for: r2v101 */
    /* JADX WARN: Type inference failed for: r2v104 */
    /* JADX WARN: Type inference failed for: r2v105 */
    /* JADX WARN: Type inference failed for: r2v108 */
    /* JADX WARN: Type inference failed for: r2v109 */
    /* JADX WARN: Type inference failed for: r2v14, types: [jg.b] */
    /* JADX WARN: Type inference failed for: r2v15, types: [jg.b] */
    /* JADX WARN: Type inference failed for: r2v17, types: [jg.b] */
    /* JADX WARN: Type inference failed for: r2v19, types: [jg.b] */
    /* JADX WARN: Type inference failed for: r2v21, types: [jg.b] */
    /* JADX WARN: Type inference failed for: r2v23, types: [jg.b] */
    /* JADX WARN: Type inference failed for: r2v25, types: [jg.b] */
    /* JADX WARN: Type inference failed for: r2v27, types: [jg.b] */
    /* JADX WARN: Type inference failed for: r2v29, types: [jg.b] */
    /* JADX WARN: Type inference failed for: r2v31, types: [jg.b] */
    /* JADX WARN: Type inference failed for: r2v33, types: [jg.b] */
    /* JADX WARN: Type inference failed for: r2v35, types: [jg.b] */
    /* JADX WARN: Type inference failed for: r2v37, types: [jg.b] */
    /* JADX WARN: Type inference failed for: r2v45, types: [jg.b] */
    /* JADX WARN: Type inference failed for: r2v46, types: [jg.b] */
    /* JADX WARN: Type inference failed for: r2v47, types: [jg.b] */
    /* JADX WARN: Type inference failed for: r2v48, types: [jg.b] */
    /* JADX WARN: Type inference failed for: r2v49, types: [jg.b] */
    /* JADX WARN: Type inference failed for: r2v50, types: [jg.b] */
    /* JADX WARN: Type inference failed for: r2v51, types: [jg.b] */
    /* JADX WARN: Type inference failed for: r2v52, types: [jg.b] */
    /* JADX WARN: Type inference failed for: r2v53, types: [jg.b] */
    /* JADX WARN: Type inference failed for: r2v54, types: [jg.b] */
    /* JADX WARN: Type inference failed for: r2v55, types: [jg.b] */
    /* JADX WARN: Type inference failed for: r2v56, types: [jg.b] */
    /* JADX WARN: Type inference failed for: r2v57, types: [jg.b] */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r2v64 */
    /* JADX WARN: Type inference failed for: r2v65 */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r2v69 */
    /* JADX WARN: Type inference failed for: r2v72 */
    /* JADX WARN: Type inference failed for: r2v73 */
    /* JADX WARN: Type inference failed for: r2v76 */
    /* JADX WARN: Type inference failed for: r2v77 */
    /* JADX WARN: Type inference failed for: r2v80 */
    /* JADX WARN: Type inference failed for: r2v81 */
    /* JADX WARN: Type inference failed for: r2v84 */
    /* JADX WARN: Type inference failed for: r2v85 */
    /* JADX WARN: Type inference failed for: r2v88 */
    /* JADX WARN: Type inference failed for: r2v89 */
    /* JADX WARN: Type inference failed for: r2v92 */
    /* JADX WARN: Type inference failed for: r2v93 */
    /* JADX WARN: Type inference failed for: r2v96 */
    /* JADX WARN: Type inference failed for: r2v97 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(long r5, xl.d<? super tl.l> r7) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jg.b.m(long, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0153 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x016c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0180 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(int r17, fm.l<? super xl.d<? super com.topstep.fitcloud.pro.shared.data.bean.TokenBean>, ? extends java.lang.Object> r18, xl.d<? super jg.a.C0308a> r19) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jg.b.n(int, fm.l, xl.d):java.lang.Object");
    }
}
