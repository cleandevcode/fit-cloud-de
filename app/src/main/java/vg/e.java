package vg;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.InputStream;
import java.util.UUID;
import java.util.logging.Logger;
import ln.n;
import ln.o;
import mf.a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000do.a;
import zm.p;
import zm.s;
import zm.t;
import zm.z;

/* loaded from: classes2.dex */
public final class e {

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.net.ApiServiceKt", f = "ApiService.kt", l = {972}, m = "convertAvatar")
    /* loaded from: classes2.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public String f29349d;

        /* renamed from: e */
        public /* synthetic */ Object f29350e;

        /* renamed from: f */
        public int f29351f;

        public a(xl.d<? super a> dVar) {
            super(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f29350e = obj;
            this.f29351f |= Integer.MIN_VALUE;
            return e.a(null, null, null, this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends z {

        /* renamed from: b */
        public final /* synthetic */ String f29352b;

        /* renamed from: c */
        public final /* synthetic */ Context f29353c;

        /* renamed from: d */
        public final /* synthetic */ Uri f29354d;

        public b(Context context, Uri uri, String str) {
            this.f29352b = str;
            this.f29353c = context;
            this.f29354d = uri;
        }

        @Override // zm.z
        public final s b() {
            s.a aVar = s.f32677f;
            String str = this.f29352b;
            aVar.getClass();
            gm.l.f(str, "$this$toMediaTypeOrNull");
            try {
                return s.a.a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @Override // zm.z
        public final void c(ln.f fVar) {
            InputStream openInputStream = this.f29353c.getContentResolver().openInputStream(this.f29354d);
            if (openInputStream != null) {
                Logger logger = o.f20118a;
                n nVar = new n(openInputStream, new ln.z());
                try {
                    fVar.B(nVar);
                    a0.d(nVar, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        a0.d(nVar, th2);
                        throw th3;
                    }
                }
            }
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.net.ApiServiceKt", f = "ApiService.kt", l = {1039}, m = "userGetDeviceBind")
    /* loaded from: classes2.dex */
    public static final class c extends zl.c {

        /* renamed from: d */
        public long f29355d;

        /* renamed from: e */
        public /* synthetic */ Object f29356e;

        /* renamed from: f */
        public int f29357f;

        public c(xl.d<? super c> dVar) {
            super(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f29356e = obj;
            this.f29357f |= Integer.MIN_VALUE;
            return e.e(null, 0L, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.net.ApiServiceKt", f = "ApiService.kt", l = {1067}, m = "userGetExerciseGoal")
    /* loaded from: classes2.dex */
    public static final class d extends zl.c {

        /* renamed from: d */
        public long f29358d;

        /* renamed from: e */
        public /* synthetic */ Object f29359e;

        /* renamed from: f */
        public int f29360f;

        public d(xl.d<? super d> dVar) {
            super(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f29359e = obj;
            this.f29360f |= Integer.MIN_VALUE;
            return e.f(null, 0L, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.net.ApiServiceKt", f = "ApiService.kt", l = {996}, m = "userGetInfo")
    /* renamed from: vg.e$e */
    /* loaded from: classes2.dex */
    public static final class C0531e extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f29361d;

        /* renamed from: e */
        public int f29362e;

        public C0531e(xl.d<? super C0531e> dVar) {
            super(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f29361d = obj;
            this.f29362e |= Integer.MIN_VALUE;
            return e.g(null, 0L, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.net.ApiServiceKt", f = "ApiService.kt", l = {1019}, m = "userGetUnitConfig")
    /* loaded from: classes2.dex */
    public static final class f extends zl.c {

        /* renamed from: d */
        public long f29363d;

        /* renamed from: e */
        public /* synthetic */ Object f29364e;

        /* renamed from: f */
        public int f29365f;

        public f(xl.d<? super f> dVar) {
            super(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f29364e = obj;
            this.f29365f |= Integer.MIN_VALUE;
            return e.h(null, 0L, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.net.ApiServiceKt", f = "ApiService.kt", l = {1053}, m = "userUpdateDeviceBind")
    /* loaded from: classes2.dex */
    public static final class g extends zl.c {

        /* renamed from: d */
        public long f29366d;

        /* renamed from: e */
        public /* synthetic */ Object f29367e;

        /* renamed from: f */
        public int f29368f;

        public g(xl.d<? super g> dVar) {
            super(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f29367e = obj;
            this.f29368f |= Integer.MIN_VALUE;
            return e.i(null, 0L, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.net.ApiServiceKt", f = "ApiService.kt", l = {1074}, m = "userUpdateExerciseGoal")
    /* loaded from: classes2.dex */
    public static final class h extends zl.c {

        /* renamed from: d */
        public long f29369d;

        /* renamed from: e */
        public /* synthetic */ Object f29370e;

        /* renamed from: f */
        public int f29371f;

        public h(xl.d<? super h> dVar) {
            super(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f29370e = obj;
            this.f29371f |= Integer.MIN_VALUE;
            return e.j(null, 0L, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.net.ApiServiceKt", f = "ApiService.kt", l = {1003}, m = "userUpdateInfo")
    /* loaded from: classes2.dex */
    public static final class i extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f29372d;

        /* renamed from: e */
        public int f29373e;

        public i(xl.d<? super i> dVar) {
            super(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f29372d = obj;
            this.f29373e |= Integer.MIN_VALUE;
            return e.k(null, 0L, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.net.ApiServiceKt", f = "ApiService.kt", l = {1026}, m = "userUpdateUnitConfig")
    /* loaded from: classes2.dex */
    public static final class j extends zl.c {

        /* renamed from: d */
        public long f29374d;

        /* renamed from: e */
        public /* synthetic */ Object f29375e;

        /* renamed from: f */
        public int f29376f;

        public j(xl.d<? super j> dVar) {
            super(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f29375e = obj;
            this.f29376f |= Integer.MIN_VALUE;
            return e.l(null, 0L, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(vg.d r7, android.content.Context r8, java.lang.String r9, xl.d<? super java.lang.String> r10) {
        /*
            boolean r0 = r10 instanceof vg.e.a
            if (r0 == 0) goto L13
            r0 = r10
            vg.e$a r0 = (vg.e.a) r0
            int r1 = r0.f29351f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29351f = r1
            goto L18
        L13:
            vg.e$a r0 = new vg.e$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f29350e
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f29351f
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r9 = r0.f29349d
            mf.a0.k(r10)     // Catch: java.lang.Exception -> L77
            goto L6f
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            mf.a0.k(r10)
            r10 = 0
            r2 = 0
            if (r9 == 0) goto L61
            int r4 = r9.length()
            if (r4 != 0) goto L40
            r4 = 1
            goto L41
        L40:
            r4 = 0
        L41:
            if (r4 == 0) goto L44
            goto L61
        L44:
            android.net.Uri r4 = android.net.Uri.parse(r9)
            java.lang.String r5 = r4.getScheme()
            java.lang.String r6 = "content"
            boolean r5 = gm.l.a(r5, r6)
            if (r5 != 0) goto L60
            java.lang.String r5 = r4.getScheme()
            java.lang.String r6 = "file"
            boolean r5 = gm.l.a(r5, r6)
            if (r5 == 0) goto L61
        L60:
            r10 = r4
        L61:
            if (r10 != 0) goto L64
            goto L82
        L64:
            r0.f29349d = r9     // Catch: java.lang.Exception -> L77
            r0.f29351f = r3     // Catch: java.lang.Exception -> L77
            java.lang.Object r10 = d(r7, r8, r2, r10, r0)     // Catch: java.lang.Exception -> L77
            if (r10 != r1) goto L6f
            return r1
        L6f:
            vg.k r10 = (vg.k) r10     // Catch: java.lang.Exception -> L77
            T r7 = r10.f29381c     // Catch: java.lang.Exception -> L77
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L77
            r9 = r7
            goto L82
        L77:
            r7 = move-exception
            do.a$b r8 = p000do.a.f13275a
            java.lang.String r10 = "ApiService"
            r8.t(r10)
            r8.q(r7)
        L82:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: vg.e.a(vg.d, android.content.Context, java.lang.String, xl.d):java.lang.Object");
    }

    public static final long b(pg.j jVar) {
        long currentTimeMillis = System.currentTimeMillis();
        if (jVar.f24053b != 2 && jVar.a() <= currentTimeMillis) {
            return jVar.a();
        }
        return currentTimeMillis;
    }

    public static final String c(String str) {
        gm.l.f(str, "accessToken");
        return "Bearer " + str;
    }

    public static final Object d(vg.d dVar, Context context, int i10, Uri uri, xl.d<? super k<String>> dVar2) {
        String uuid = UUID.randomUUID().toString();
        gm.l.e(uuid, "randomUUID().toString()");
        String type = context.getContentResolver().getType(uri);
        if (type == null) {
            if (i10 != 0 && i10 != 1) {
                if (i10 == 2) {
                    type = DfuBaseService.MIME_TYPE_ZIP;
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                type = "image/jpeg";
            }
        }
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(type);
        a.b bVar = p000do.a.f13275a;
        bVar.t("ApiService");
        bVar.b("fileName=%s mediaType=%s fileExt=%s", uuid, type, extensionFromMimeType);
        if (!TextUtils.isEmpty(extensionFromMimeType)) {
            uuid = uuid + '.' + extensionFromMimeType;
        }
        b bVar2 = new b(context, uri, type);
        t.c.f32693c.getClass();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("form-data; name=");
        s sVar = t.f32681f;
        t.b.a(sb2, "file");
        if (uuid != null) {
            sb2.append("; filename=");
            t.b.a(sb2, uuid);
        }
        String sb3 = sb2.toString();
        gm.l.e(sb3, "StringBuilder().apply(builderAction).toString()");
        p.a aVar = new p.a();
        p.f32652b.getClass();
        p.b.a("Content-Disposition");
        aVar.b("Content-Disposition", sb3);
        return dVar.o0(i10, t.c.a.a(aVar.c(), bVar2), dVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(vg.d r11, long r12, xl.d<? super pg.d> r14) {
        /*
            boolean r0 = r14 instanceof vg.e.c
            if (r0 == 0) goto L13
            r0 = r14
            vg.e$c r0 = (vg.e.c) r0
            int r1 = r0.f29357f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29357f = r1
            goto L18
        L13:
            vg.e$c r0 = new vg.e$c
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f29356e
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f29357f
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            long r12 = r0.f29355d
            mf.a0.k(r14)
            goto L3f
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            mf.a0.k(r14)
            r0.f29355d = r12
            r0.f29357f = r3
            java.lang.Object r14 = r11.d(r12, r0)
            if (r14 != r1) goto L3f
            return r1
        L3f:
            r3 = r12
            vg.l r14 = (vg.l) r14
            java.lang.Object r11 = r14.a()
            com.topstep.fitcloud.pro.shared.data.bean.DeviceBindBean r11 = (com.topstep.fitcloud.pro.shared.data.bean.DeviceBindBean) r11
            if (r11 == 0) goto L5b
            pg.d r12 = new pg.d
            java.lang.String r5 = r11.f9761a
            java.lang.String r6 = r11.f9762b
            java.lang.String r7 = r11.f9763c
            int r8 = r11.f9764d
            long r9 = r11.f9765e
            r2 = r12
            r2.<init>(r3, r5, r6, r7, r8, r9)
            goto L67
        L5b:
            pg.d r12 = new pg.d
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 1
            r9 = 0
            r2 = r12
            r2.<init>(r3, r5, r6, r7, r8, r9)
        L67:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: vg.e.e(vg.d, long, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(vg.d r10, long r11, xl.d<? super pg.f> r13) {
        /*
            boolean r0 = r13 instanceof vg.e.d
            if (r0 == 0) goto L13
            r0 = r13
            vg.e$d r0 = (vg.e.d) r0
            int r1 = r0.f29360f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29360f = r1
            goto L18
        L13:
            vg.e$d r0 = new vg.e$d
            r0.<init>(r13)
        L18:
            r9 = r0
            java.lang.Object r13 = r9.f29359e
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r9.f29360f
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            long r11 = r9.f29358d
            mf.a0.k(r13)
            goto L47
        L2a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L32:
            mf.a0.k(r13)
            r7 = 0
            r9.f29358d = r11
            r9.f29360f = r2
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r10
            r2 = r11
            java.lang.Object r13 = r1.T(r2, r4, r5, r6, r7, r9)
            if (r13 != r0) goto L47
            return r0
        L47:
            r2 = r11
            vg.k r13 = (vg.k) r13
            T r10 = r13.f29381c
            com.topstep.fitcloud.pro.shared.data.bean.ExerciseGoalBean r10 = (com.topstep.fitcloud.pro.shared.data.bean.ExerciseGoalBean) r10
            pg.f r11 = new pg.f
            int r4 = r10.f9801a
            float r5 = r10.f9802b
            int r6 = r10.f9803c
            long r7 = r10.f9804d
            r1 = r11
            r1.<init>(r2, r4, r5, r6, r7)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: vg.e.f(vg.d, long, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g(vg.d r14, long r15, xl.d<? super pg.m> r17) {
        /*
            r0 = r17
            boolean r1 = r0 instanceof vg.e.C0531e
            if (r1 == 0) goto L15
            r1 = r0
            vg.e$e r1 = (vg.e.C0531e) r1
            int r2 = r1.f29362e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f29362e = r2
            goto L1a
        L15:
            vg.e$e r1 = new vg.e$e
            r1.<init>(r0)
        L1a:
            r13 = r1
            java.lang.Object r0 = r13.f29361d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r13.f29362e
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            mf.a0.k(r0)
            goto L48
        L2a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L32:
            mf.a0.k(r0)
            r11 = 0
            r13.f29362e = r3
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r2 = r14
            r3 = r15
            java.lang.Object r0 = r2.r(r3, r5, r6, r7, r8, r9, r10, r11, r13)
            if (r0 != r1) goto L48
            return r1
        L48:
            vg.k r0 = (vg.k) r0
            T r0 = r0.f29381c
            com.topstep.fitcloud.pro.shared.data.bean.UserBean r0 = (com.topstep.fitcloud.pro.shared.data.bean.UserBean) r0
            pg.m r0 = r0.b()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vg.e.g(vg.d, long, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(vg.d r10, long r11, xl.d<? super pg.k> r13) {
        /*
            boolean r0 = r13 instanceof vg.e.f
            if (r0 == 0) goto L13
            r0 = r13
            vg.e$f r0 = (vg.e.f) r0
            int r1 = r0.f29365f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29365f = r1
            goto L18
        L13:
            vg.e$f r0 = new vg.e$f
            r0.<init>(r13)
        L18:
            r9 = r0
            java.lang.Object r13 = r9.f29364e
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r9.f29365f
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            long r11 = r9.f29363d
            mf.a0.k(r13)
            goto L47
        L2a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L32:
            mf.a0.k(r13)
            r7 = 0
            r9.f29363d = r11
            r9.f29365f = r2
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r10
            r2 = r11
            java.lang.Object r13 = r1.X(r2, r4, r5, r6, r7, r9)
            if (r13 != r0) goto L47
            return r0
        L47:
            r2 = r11
            vg.k r13 = (vg.k) r13
            T r10 = r13.f29381c
            com.topstep.fitcloud.pro.shared.data.bean.UnitConfigBean r10 = (com.topstep.fitcloud.pro.shared.data.bean.UnitConfigBean) r10
            pg.k r11 = new pg.k
            int r4 = r10.f9819a
            int r5 = r10.f9820b
            int r6 = r10.f9821c
            long r7 = r10.f9822d
            r1 = r11
            r1.<init>(r2, r4, r5, r6, r7)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: vg.e.h(vg.d, long, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object i(vg.d r11, long r12, pg.d r14, xl.d<? super pg.d> r15) {
        /*
            boolean r0 = r15 instanceof vg.e.g
            if (r0 == 0) goto L13
            r0 = r15
            vg.e$g r0 = (vg.e.g) r0
            int r1 = r0.f29368f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29368f = r1
            goto L18
        L13:
            vg.e$g r0 = new vg.e$g
            r0.<init>(r15)
        L18:
            r10 = r0
            java.lang.Object r15 = r10.f29367e
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r10.f29368f
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            long r12 = r10.f29366d
            mf.a0.k(r15)
            goto L4e
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            mf.a0.k(r15)
            java.lang.String r4 = r14.f24028e
            java.lang.String r5 = r14.f24029f
            java.lang.String r6 = r14.f24030g
            int r7 = r14.f24031h
            long r8 = b(r14)
            r10.f29366d = r12
            r10.f29368f = r2
            r1 = r11
            r2 = r12
            java.lang.Object r15 = r1.C(r2, r4, r5, r6, r7, r8, r10)
            if (r15 != r0) goto L4e
            return r0
        L4e:
            r2 = r12
            vg.k r15 = (vg.k) r15
            T r11 = r15.f29381c
            com.topstep.fitcloud.pro.shared.data.bean.DeviceBindBean r11 = (com.topstep.fitcloud.pro.shared.data.bean.DeviceBindBean) r11
            pg.d r12 = new pg.d
            java.lang.String r4 = r11.f9761a
            java.lang.String r5 = r11.f9762b
            java.lang.String r6 = r11.f9763c
            int r7 = r11.f9764d
            long r8 = r11.f9765e
            r1 = r12
            r1.<init>(r2, r4, r5, r6, r7, r8)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: vg.e.i(vg.d, long, pg.d, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j(vg.d r10, long r11, pg.f r13, xl.d<? super pg.f> r14) {
        /*
            boolean r0 = r14 instanceof vg.e.h
            if (r0 == 0) goto L13
            r0 = r14
            vg.e$h r0 = (vg.e.h) r0
            int r1 = r0.f29371f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29371f = r1
            goto L18
        L13:
            vg.e$h r0 = new vg.e$h
            r0.<init>(r14)
        L18:
            r9 = r0
            java.lang.Object r14 = r9.f29370e
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r9.f29371f
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            long r11 = r9.f29369d
            mf.a0.k(r14)
            goto L4c
        L2a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L32:
            mf.a0.k(r14)
            int r4 = r13.f24037e
            float r5 = r13.f24038f
            int r6 = r13.f24039g
            long r7 = b(r13)
            r9.f29369d = r11
            r9.f29371f = r2
            r1 = r10
            r2 = r11
            java.lang.Object r14 = r1.T(r2, r4, r5, r6, r7, r9)
            if (r14 != r0) goto L4c
            return r0
        L4c:
            r2 = r11
            vg.k r14 = (vg.k) r14
            T r10 = r14.f29381c
            com.topstep.fitcloud.pro.shared.data.bean.ExerciseGoalBean r10 = (com.topstep.fitcloud.pro.shared.data.bean.ExerciseGoalBean) r10
            pg.f r11 = new pg.f
            int r4 = r10.f9801a
            float r5 = r10.f9802b
            int r6 = r10.f9803c
            long r7 = r10.f9804d
            r1 = r11
            r1.<init>(r2, r4, r5, r6, r7)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: vg.e.j(vg.d, long, pg.f, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object k(vg.d r15, long r16, pg.m r18, xl.d<? super pg.m> r19) {
        /*
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof vg.e.i
            if (r2 == 0) goto L17
            r2 = r1
            vg.e$i r2 = (vg.e.i) r2
            int r3 = r2.f29373e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f29373e = r3
            goto L1c
        L17:
            vg.e$i r2 = new vg.e$i
            r2.<init>(r1)
        L1c:
            r14 = r2
            java.lang.Object r1 = r14.f29372d
            yl.a r2 = yl.a.COROUTINE_SUSPENDED
            int r3 = r14.f29373e
            r4 = 1
            if (r3 == 0) goto L34
            if (r3 != r4) goto L2c
            mf.a0.k(r1)
            goto L62
        L2c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L34:
            mf.a0.k(r1)
            java.lang.String r6 = r0.f24073g
            int r1 = r0.f24074h
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r1)
            java.lang.String r8 = r0.f24075i
            float r1 = r0.f24076j
            java.lang.Float r9 = new java.lang.Float
            r9.<init>(r1)
            float r1 = r0.f24077k
            java.lang.Float r10 = new java.lang.Float
            r10.<init>(r1)
            java.lang.String r11 = r0.f24078l
            long r12 = b(r18)
            r14.f29373e = r4
            r3 = r15
            r4 = r16
            java.lang.Object r1 = r3.r(r4, r6, r7, r8, r9, r10, r11, r12, r14)
            if (r1 != r2) goto L62
            return r2
        L62:
            vg.k r1 = (vg.k) r1
            T r0 = r1.f29381c
            com.topstep.fitcloud.pro.shared.data.bean.UserBean r0 = (com.topstep.fitcloud.pro.shared.data.bean.UserBean) r0
            pg.m r0 = r0.b()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vg.e.k(vg.d, long, pg.m, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object l(vg.d r10, long r11, pg.k r13, xl.d<? super pg.k> r14) {
        /*
            boolean r0 = r14 instanceof vg.e.j
            if (r0 == 0) goto L13
            r0 = r14
            vg.e$j r0 = (vg.e.j) r0
            int r1 = r0.f29376f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29376f = r1
            goto L18
        L13:
            vg.e$j r0 = new vg.e$j
            r0.<init>(r14)
        L18:
            r9 = r0
            java.lang.Object r14 = r9.f29375e
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r9.f29376f
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            long r11 = r9.f29374d
            mf.a0.k(r14)
            goto L4c
        L2a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L32:
            mf.a0.k(r14)
            int r4 = r13.f24056e
            int r5 = r13.f24057f
            int r6 = r13.f24058g
            long r7 = b(r13)
            r9.f29374d = r11
            r9.f29376f = r2
            r1 = r10
            r2 = r11
            java.lang.Object r14 = r1.X(r2, r4, r5, r6, r7, r9)
            if (r14 != r0) goto L4c
            return r0
        L4c:
            r2 = r11
            vg.k r14 = (vg.k) r14
            T r10 = r14.f29381c
            com.topstep.fitcloud.pro.shared.data.bean.UnitConfigBean r10 = (com.topstep.fitcloud.pro.shared.data.bean.UnitConfigBean) r10
            pg.k r11 = new pg.k
            int r4 = r10.f9819a
            int r5 = r10.f9820b
            int r6 = r10.f9821c
            long r7 = r10.f9822d
            r1 = r11
            r1.<init>(r2, r4, r5, r6, r7)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: vg.e.l(vg.d, long, pg.k, xl.d):java.lang.Object");
    }
}
