package ch;

import com.topstep.fitcloud.pro.model.location.LocationInfo;
import com.topstep.fitcloud.pro.model.weather.WeatherInfo;
import com.topstep.fitcloud.pro.shared.data.bean.WeatherBean;
import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import gm.l;
import ih.v;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class d implements ch.c {

    /* renamed from: a */
    public final vg.d f4676a;

    /* renamed from: b */
    public final AppDatabase f4677b;

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.work.WeatherRepositoryImpl", f = "WeatherRepository.kt", l = {150, 151}, m = "apiCity")
    /* loaded from: classes2.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public Object f4678d;

        /* renamed from: e */
        public List f4679e;

        /* renamed from: f */
        public LocationInfo f4680f;

        /* renamed from: g */
        public /* synthetic */ Object f4681g;

        /* renamed from: i */
        public int f4683i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d<? super a> dVar) {
            super(dVar);
            d.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f4681g = obj;
            this.f4683i |= Integer.MIN_VALUE;
            return d.this.e(null, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.work.WeatherRepositoryImpl", f = "WeatherRepository.kt", l = {46}, m = "getCacheCity")
    /* loaded from: classes2.dex */
    public static final class b extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f4684d;

        /* renamed from: f */
        public int f4686f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(dVar);
            d.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f4684d = obj;
            this.f4686f |= Integer.MIN_VALUE;
            return d.this.c(null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.work.WeatherRepositoryImpl", f = "WeatherRepository.kt", l = {51, 51}, m = "requestCity")
    /* loaded from: classes2.dex */
    public static final class c extends zl.c {

        /* renamed from: d */
        public d f4687d;

        /* renamed from: e */
        public LocationInfo f4688e;

        /* renamed from: f */
        public ArrayList f4689f;

        /* renamed from: g */
        public /* synthetic */ Object f4690g;

        /* renamed from: i */
        public int f4692i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(dVar);
            d.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f4690g = obj;
            this.f4692i |= Integer.MIN_VALUE;
            return d.this.d(null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.work.WeatherRepositoryImpl", f = "WeatherRepository.kt", l = {73, 77, 79, 121}, m = "requestWeather")
    /* renamed from: ch.d$d */
    /* loaded from: classes2.dex */
    public static final class C0073d extends zl.c {

        /* renamed from: d */
        public Object f4693d;

        /* renamed from: e */
        public fg.a f4694e;

        /* renamed from: f */
        public WeatherBean f4695f;

        /* renamed from: g */
        public /* synthetic */ Object f4696g;

        /* renamed from: i */
        public int f4698i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0073d(xl.d<? super C0073d> dVar) {
            super(dVar);
            d.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f4696g = obj;
            this.f4698i |= Integer.MIN_VALUE;
            return d.this.a(null, false, this);
        }
    }

    public d(vg.d dVar, AppDatabase appDatabase) {
        l.f(appDatabase, "appDatabase");
        this.f4676a = dVar;
        this.f4677b = appDatabase;
    }

    public static ArrayList f(LocationInfo locationInfo) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        ArrayList arrayList = new ArrayList(2);
        String str = locationInfo.f9708d;
        boolean z14 = false;
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            String str2 = locationInfo.f9709e;
            if (str2 != null && str2.length() != 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11) {
                String str3 = locationInfo.f9711g;
                if (str3 != null && str3.length() != 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (!z12) {
                    StringBuilder sb2 = new StringBuilder();
                    String[] strArr = {locationInfo.f9708d, locationInfo.f9709e};
                    for (int i10 = 0; i10 < 2; i10++) {
                        sb2.append(strArr[i10]);
                    }
                    String str4 = locationInfo.f9710f;
                    if (str4 != null && str4.length() != 0) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    if (!z13) {
                        sb2.append(locationInfo.f9710f);
                    }
                    sb2.append(locationInfo.f9711g);
                    String str5 = locationInfo.f9712h;
                    if (!((str5 == null || str5.length() == 0) ? true : true)) {
                        sb2.append(locationInfo.f9712h);
                    }
                    arrayList.add(sb2.toString());
                }
            }
        }
        double d10 = 100;
        StringBuilder sb3 = new StringBuilder();
        sb3.append((int) (locationInfo.f9705a * d10));
        sb3.append(',');
        sb3.append((int) (locationInfo.f9706b * d10));
        arrayList.add(sb3.toString());
        return arrayList;
    }

    public static int g(String str) {
        int i10 = 0;
        if (str == null || str.length() == 0) {
            return 0;
        }
        try {
            try {
                return Integer.parseInt(str);
            } catch (Exception unused) {
                i10 = v.o(Float.parseFloat(str));
                return i10;
            }
        } catch (Exception unused2) {
            return i10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0080 A[Catch: Exception -> 0x018e, TryCatch #0 {Exception -> 0x018e, blocks: (B:90:0x0038, B:95:0x004d, B:124:0x00bf, B:127:0x00c4, B:129:0x00d1, B:131:0x00d8, B:133:0x00fc, B:135:0x010a, B:139:0x0141, B:98:0x0058, B:109:0x0076, B:111:0x0080, B:114:0x0087, B:117:0x009e, B:119:0x00a2, B:101:0x005f, B:105:0x0068), top: B:147:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0087 A[Catch: Exception -> 0x018e, TryCatch #0 {Exception -> 0x018e, blocks: (B:90:0x0038, B:95:0x004d, B:124:0x00bf, B:127:0x00c4, B:129:0x00d1, B:131:0x00d8, B:133:0x00fc, B:135:0x010a, B:139:0x0141, B:98:0x0058, B:109:0x0076, B:111:0x0080, B:114:0x0087, B:117:0x009e, B:119:0x00a2, B:101:0x005f, B:105:0x0068), top: B:147:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x009e A[Catch: Exception -> 0x018e, TryCatch #0 {Exception -> 0x018e, blocks: (B:90:0x0038, B:95:0x004d, B:124:0x00bf, B:127:0x00c4, B:129:0x00d1, B:131:0x00d8, B:133:0x00fc, B:135:0x010a, B:139:0x0141, B:98:0x0058, B:109:0x0076, B:111:0x0080, B:114:0x0087, B:117:0x009e, B:119:0x00a2, B:101:0x005f, B:105:0x0068), top: B:147:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00c4 A[Catch: Exception -> 0x018e, TryCatch #0 {Exception -> 0x018e, blocks: (B:90:0x0038, B:95:0x004d, B:124:0x00bf, B:127:0x00c4, B:129:0x00d1, B:131:0x00d8, B:133:0x00fc, B:135:0x010a, B:139:0x0141, B:98:0x0058, B:109:0x0076, B:111:0x0080, B:114:0x0087, B:117:0x009e, B:119:0x00a2, B:101:0x005f, B:105:0x0068), top: B:147:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x002c  */
    @Override // ch.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(fg.a r27, boolean r28, xl.d<? super com.topstep.fitcloud.pro.model.weather.WeatherInfo> r29) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.d.a(fg.a, boolean, xl.d):java.lang.Object");
    }

    @Override // ch.c
    public final Object b(xl.d<? super WeatherInfo> dVar) {
        return this.f4677b.E().f(dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0049 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004b  */
    @Override // ch.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(com.topstep.fitcloud.pro.model.location.LocationInfo r5, xl.d<? super fg.a> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ch.d.b
            if (r0 == 0) goto L13
            r0 = r6
            ch.d$b r0 = (ch.d.b) r0
            int r1 = r0.f4686f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4686f = r1
            goto L18
        L13:
            ch.d$b r0 = new ch.d$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f4684d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f4686f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            mf.a0.k(r6)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            mf.a0.k(r6)
            java.util.ArrayList r5 = f(r5)
            com.topstep.fitcloud.pro.shared.data.db.AppDatabase r6 = r4.f4677b
            mg.j0 r6 = r6.s()
            r0.f4686f = r3
            java.lang.Object r6 = r6.j(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            pg.b r6 = (pg.b) r6
            if (r6 != 0) goto L4b
            r5 = 0
            goto L56
        L4b:
            fg.a r5 = new fg.a
            java.lang.String r0 = r6.f24019a
            java.lang.String r1 = r6.f24020b
            int r6 = r6.f24023e
            r5.<init>(r0, r1, r6)
        L56:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.d.c(com.topstep.fitcloud.pro.model.location.LocationInfo, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // ch.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(com.topstep.fitcloud.pro.model.location.LocationInfo r8, xl.d<? super fg.a> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ch.d.c
            if (r0 == 0) goto L13
            r0 = r9
            ch.d$c r0 = (ch.d.c) r0
            int r1 = r0.f4692i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4692i = r1
            goto L18
        L13:
            ch.d$c r0 = new ch.d$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f4690g
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f4692i
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            mf.a0.k(r9)
            goto L71
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            java.util.ArrayList r8 = r0.f4689f
            com.topstep.fitcloud.pro.model.location.LocationInfo r2 = r0.f4688e
            ch.d r4 = r0.f4687d
            mf.a0.k(r9)
            goto L5e
        L3d:
            mf.a0.k(r9)
            java.util.ArrayList r9 = f(r8)
            com.topstep.fitcloud.pro.shared.data.db.AppDatabase r2 = r7.f4677b
            mg.j0 r2 = r2.s()
            r0.f4687d = r7
            r0.f4688e = r8
            r0.f4689f = r9
            r0.f4692i = r4
            java.lang.Object r2 = r2.j(r9, r0)
            if (r2 != r1) goto L59
            return r1
        L59:
            r4 = r7
            r6 = r2
            r2 = r8
            r8 = r9
            r9 = r6
        L5e:
            pg.b r9 = (pg.b) r9
            if (r9 != 0) goto L73
            r0.f4687d = r5
            r0.f4688e = r5
            r0.f4689f = r5
            r0.f4692i = r3
            java.lang.Object r9 = r4.e(r8, r2, r0)
            if (r9 != r1) goto L71
            return r1
        L71:
            pg.b r9 = (pg.b) r9
        L73:
            if (r9 != 0) goto L76
            goto L81
        L76:
            fg.a r5 = new fg.a
            java.lang.String r8 = r9.f24019a
            java.lang.String r0 = r9.f24020b
            int r9 = r9.f24023e
            r5.<init>(r8, r0, r9)
        L81:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.d.d(com.topstep.fitcloud.pro.model.location.LocationInfo, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(java.util.List<java.lang.String> r9, com.topstep.fitcloud.pro.model.location.LocationInfo r10, xl.d<? super pg.b> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof ch.d.a
            if (r0 == 0) goto L13
            r0 = r11
            ch.d$a r0 = (ch.d.a) r0
            int r1 = r0.f4683i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4683i = r1
            goto L18
        L13:
            ch.d$a r0 = new ch.d$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f4681g
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f4683i
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L44
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r9 = r0.f4678d
            pg.b r9 = (pg.b) r9
            mf.a0.k(r11)     // Catch: java.lang.Exception -> L92
            r5 = r9
            goto L9d
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            com.topstep.fitcloud.pro.model.location.LocationInfo r10 = r0.f4680f
            java.util.List r9 = r0.f4679e
            java.lang.Object r2 = r0.f4678d
            ch.d r2 = (ch.d) r2
            mf.a0.k(r11)     // Catch: java.lang.Exception -> L92
            goto L71
        L44:
            mf.a0.k(r11)
            vg.d r11 = r8.f4676a     // Catch: java.lang.Exception -> L92
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L92
            r2.<init>()     // Catch: java.lang.Exception -> L92
            double r6 = r10.f9706b     // Catch: java.lang.Exception -> L92
            r2.append(r6)     // Catch: java.lang.Exception -> L92
            r6 = 44
            r2.append(r6)     // Catch: java.lang.Exception -> L92
            double r6 = r10.f9705a     // Catch: java.lang.Exception -> L92
            r2.append(r6)     // Catch: java.lang.Exception -> L92
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L92
            r0.f4678d = r8     // Catch: java.lang.Exception -> L92
            r0.f4679e = r9     // Catch: java.lang.Exception -> L92
            r0.f4680f = r10     // Catch: java.lang.Exception -> L92
            r0.f4683i = r4     // Catch: java.lang.Exception -> L92
            java.lang.Object r11 = r11.w(r2, r0)     // Catch: java.lang.Exception -> L92
            if (r11 != r1) goto L70
            return r1
        L70:
            r2 = r8
        L71:
            vg.k r11 = (vg.k) r11     // Catch: java.lang.Exception -> L92
            T r11 = r11.f29381c     // Catch: java.lang.Exception -> L92
            com.topstep.fitcloud.pro.shared.data.bean.CityBean r11 = (com.topstep.fitcloud.pro.shared.data.bean.CityBean) r11     // Catch: java.lang.Exception -> L92
            pg.b r10 = r11.a(r10)     // Catch: java.lang.Exception -> L92
            com.topstep.fitcloud.pro.shared.data.db.AppDatabase r11 = r2.f4677b     // Catch: java.lang.Exception -> L92
            mg.j0 r11 = r11.s()     // Catch: java.lang.Exception -> L92
            r0.f4678d = r10     // Catch: java.lang.Exception -> L92
            r0.f4679e = r5     // Catch: java.lang.Exception -> L92
            r0.f4680f = r5     // Catch: java.lang.Exception -> L92
            r0.f4683i = r3     // Catch: java.lang.Exception -> L92
            java.lang.Object r9 = r11.l(r10, r9, r0)     // Catch: java.lang.Exception -> L92
            if (r9 != r1) goto L90
            return r1
        L90:
            r5 = r10
            goto L9d
        L92:
            r9 = move-exception
            do.a$b r10 = p000do.a.f13275a
            java.lang.String r11 = "Weather"
            r10.t(r11)
            r10.q(r9)
        L9d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.d.e(java.util.List, com.topstep.fitcloud.pro.model.location.LocationInfo, xl.d):java.lang.Object");
    }
}
