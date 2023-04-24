package zg;

import android.content.Context;
import bi.r;
import gm.l;
import og.t;
import p000do.a;
import tm.j;
import yg.m;

/* loaded from: classes2.dex */
public final class c implements zg.b {

    /* renamed from: a */
    public final Context f32352a;

    /* renamed from: b */
    public final m f32353b;

    /* renamed from: c */
    public final t f32354c;

    /* renamed from: d */
    public final vg.d f32355d;

    /* renamed from: e */
    public final tl.d f32356e;

    /* renamed from: f */
    public Long f32357f;

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.version.VersionRepositoryImpl", f = "VersionRepository.kt", l = {60, 66, 67, 72}, m = "checkVersionUpgradeInfo")
    /* loaded from: classes2.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public Object f32358d;

        /* renamed from: e */
        public Object f32359e;

        /* renamed from: f */
        public /* synthetic */ Object f32360f;

        /* renamed from: h */
        public int f32362h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d<? super a> dVar) {
            super(dVar);
            c.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f32360f = obj;
            this.f32362h |= Integer.MIN_VALUE;
            return c.this.b(this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends gm.m implements fm.a<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(0);
            c.this = r1;
        }

        @Override // fm.a
        public final String m() {
            Context context = c.this.f32352a;
            try {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (Exception e10) {
                a.b bVar = p000do.a.f13275a;
                bVar.t("VersionRepository");
                bVar.q(e10);
                return null;
            }
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.version.VersionRepositoryImpl", f = "VersionRepository.kt", l = {90, 98, 111, 112, 118}, m = "requestVersionUpgradeInfo")
    /* renamed from: zg.c$c */
    /* loaded from: classes2.dex */
    public static final class C0611c extends zl.c {

        /* renamed from: d */
        public Object f32364d;

        /* renamed from: e */
        public Object f32365e;

        /* renamed from: f */
        public Object f32366f;

        /* renamed from: g */
        public boolean f32367g;

        /* renamed from: h */
        public /* synthetic */ Object f32368h;

        /* renamed from: j */
        public int f32370j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0611c(xl.d<? super C0611c> dVar) {
            super(dVar);
            c.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f32368h = obj;
            this.f32370j |= Integer.MIN_VALUE;
            return c.this.e(false, this);
        }
    }

    public c(Context context, m mVar, t tVar, vg.d dVar) {
        l.f(mVar, "publicStorage");
        l.f(tVar, "deviceManager");
        this.f32352a = context;
        this.f32353b = mVar;
        this.f32354c = tVar;
        this.f32355d = dVar;
        this.f32356e = fb.e.a(new b());
    }

    @Override // zg.b
    public final Object a(xl.d<? super eg.b> dVar) {
        return e(false, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0128 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0060  */
    @Override // zg.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(xl.d<? super eg.b> r14) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zg.c.b(xl.d):java.lang.Object");
    }

    public final d c() {
        return new d(this.f32353b.a(), this);
    }

    public final j d() {
        return r.O(this.f32353b.o(), new e(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:322:0x0210, code lost:
        if (om.l.c0(r0.f9855j, r5, false) == false) goto L126;
     */
    /* JADX WARN: Removed duplicated region for block: B:191:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0119 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0129 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0251 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x02ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x02b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:351:0x02d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x02d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(boolean r27, xl.d<? super eg.b> r28) {
        /*
            Method dump skipped, instructions count: 736
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zg.c.e(boolean, xl.d):java.lang.Object");
    }
}
