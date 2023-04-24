package lg;

import android.content.Context;
import bi.z0;
import com.topstep.fitcloud.pro.model.data.BloodPressureRealtime;
import com.topstep.fitcloud.pro.model.data.EcgRecord;
import com.topstep.fitcloud.pro.model.data.HeartRateRealtime;
import com.topstep.fitcloud.pro.model.data.OxygenRealtime;
import com.topstep.fitcloud.pro.model.data.PressureRealtime;
import com.topstep.fitcloud.pro.model.data.TemperatureRealtime;
import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import mg.d9;
import mg.h1;
import no.nordicsemi.android.dfu.DfuBaseService;
import ph.b0;
import pm.g1;
import pm.z1;

/* loaded from: classes2.dex */
public final class d implements lg.c {

    /* renamed from: a */
    public final Context f19483a;

    /* renamed from: b */
    public final yg.j f19484b;

    /* renamed from: c */
    public final AppDatabase f19485c;

    /* renamed from: d */
    public final pm.e0 f19486d;

    /* renamed from: e */
    public final yg.u f19487e;

    /* renamed from: f */
    public final vg.d f19488f;

    /* renamed from: g */
    public final mf.h0 f19489g;

    /* renamed from: h */
    public g1 f19490h;

    /* renamed from: i */
    public g1 f19491i;

    /* renamed from: j */
    public g1 f19492j;

    /* renamed from: k */
    public g1 f19493k;

    /* renamed from: l */
    public g1 f19494l;

    /* renamed from: m */
    public g1 f19495m;

    /* renamed from: n */
    public g1 f19496n;

    /* renamed from: o */
    public g1 f19497o;

    /* loaded from: classes2.dex */
    public static final class a {
        public static final Date a() {
            Calendar calendar = Calendar.getInstance();
            gm.l.e(calendar, "getInstance()");
            calendar.setTime(new Date());
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(5, calendar.get(5) - 7);
            Date time = calendar.getTime();
            gm.l.e(time, "calendar.time");
            return time;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl$saveAllRealtime$1", f = "DataRepository.kt", l = {295}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a0 extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f19498e;

        /* renamed from: g */
        public final /* synthetic */ long f19500g;

        /* renamed from: h */
        public final /* synthetic */ vf.a f19501h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(long j10, vf.a aVar, xl.d<? super a0> dVar) {
            super(2, dVar);
            d.this = r1;
            this.f19500g = j10;
            this.f19501h = aVar;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((a0) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new a0(this.f19500g, this.f19501h, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f19498e;
            if (i10 != 0) {
                if (i10 == 1) {
                    mf.a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                mf.a0.k(obj);
                d9 E = d.this.f19485c.E();
                long j10 = this.f19500g;
                vf.a aVar2 = this.f19501h;
                this.f19498e = 1;
                if (E.j(j10, aVar2, this) == aVar) {
                    return aVar;
                }
            }
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl$checkBloodPressureUpdate$1", f = "DataRepository.kt", l = {672, 678, 684, 686}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public long f19502e;

        /* renamed from: f */
        public int f19503f;

        /* renamed from: h */
        public final /* synthetic */ long f19505h;

        /* renamed from: i */
        public final /* synthetic */ Date f19506i;

        /* renamed from: j */
        public final /* synthetic */ Date f19507j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, Date date, Date date2, xl.d<? super b> dVar) {
            super(2, dVar);
            d.this = r1;
            this.f19505h = j10;
            this.f19506i = date;
            this.f19507j = date2;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new b(this.f19505h, this.f19506i, this.f19507j, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:74:0x00b0 A[Catch: Exception -> 0x00dc, TryCatch #0 {Exception -> 0x00dc, blocks: (B:52:0x0018, B:57:0x0027, B:80:0x00c9, B:60:0x002e, B:72:0x00a8, B:74:0x00b0, B:61:0x0036, B:67:0x004e, B:69:0x007f, B:64:0x003f), top: B:87:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x00db A[RETURN] */
        @Override // zl.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object t(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 229
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: lg.d.b.t(java.lang.Object):java.lang.Object");
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl$saveBloodPressureRealtime$2", f = "DataRepository.kt", l = {573}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b0 extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f19508e;

        /* renamed from: g */
        public final /* synthetic */ long f19510g;

        /* renamed from: h */
        public final /* synthetic */ BloodPressureRealtime f19511h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(long j10, BloodPressureRealtime bloodPressureRealtime, xl.d<? super b0> dVar) {
            super(2, dVar);
            d.this = r1;
            this.f19510g = j10;
            this.f19511h = bloodPressureRealtime;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((b0) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new b0(this.f19510g, this.f19511h, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f19508e;
            if (i10 != 0) {
                if (i10 == 1) {
                    mf.a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                mf.a0.k(obj);
                d dVar = d.this;
                long j10 = this.f19510g;
                BloodPressureRealtime bloodPressureRealtime = this.f19511h;
                this.f19508e = 1;
                Object k10 = dVar.f19485c.E().k(j10, bloodPressureRealtime, this);
                if (k10 != aVar) {
                    k10 = tl.l.f28297a;
                }
                if (k10 == aVar) {
                    return aVar;
                }
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends gm.m implements fm.l<Throwable, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c() {
            super(1);
            d.this = r1;
        }

        @Override // fm.l
        public final tl.l k(Throwable th2) {
            d.this.f19494l = null;
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl$saveEcg$1", f = "DataRepository.kt", l = {1004}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c0 extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f19513e;

        /* renamed from: g */
        public final /* synthetic */ EcgRecord f19515g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(EcgRecord ecgRecord, xl.d<? super c0> dVar) {
            super(2, dVar);
            d.this = r1;
            this.f19515g = ecgRecord;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((c0) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new c0(this.f19515g, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f19513e;
            if (i10 != 0) {
                if (i10 == 1) {
                    mf.a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                mf.a0.k(obj);
                Long b10 = yg.l.b(d.this.f19484b);
                if (b10 != null) {
                    long longValue = b10.longValue();
                    h1 v10 = d.this.f19485c.v();
                    EcgRecord ecgRecord = this.f19515g;
                    gm.l.f(ecgRecord, "<this>");
                    List<rg.d> p10 = h7.a.p(new rg.d(longValue, ecgRecord.getEcgId(), ecgRecord.getTime(), ecgRecord.getType(), ecgRecord.getSampleBase(), ecgRecord.getScaleValue(), System.currentTimeMillis(), ecgRecord.getDeviceAddress(), ecgRecord.getDetail(), ecgRecord.getReports(), 0, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED));
                    this.f19513e = 1;
                    if (v10.i(longValue, p10, this) == aVar) {
                        return aVar;
                    }
                } else {
                    return tl.l.f28297a;
                }
            }
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl$checkEcgUpdate$1", f = "DataRepository.kt", l = {1044, 1050, 1055, 1057}, m = "invokeSuspend")
    /* renamed from: lg.d$d */
    /* loaded from: classes2.dex */
    public static final class C0352d extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public long f19516e;

        /* renamed from: f */
        public int f19517f;

        /* renamed from: h */
        public final /* synthetic */ long f19519h;

        /* renamed from: i */
        public final /* synthetic */ Date f19520i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0352d(long j10, Date date, xl.d<? super C0352d> dVar) {
            super(2, dVar);
            d.this = r1;
            this.f19519h = j10;
            this.f19520i = date;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((C0352d) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new C0352d(this.f19519h, this.f19520i, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:74:0x00ad A[Catch: Exception -> 0x00d9, TryCatch #0 {Exception -> 0x00d9, blocks: (B:52:0x0018, B:57:0x0027, B:80:0x00c6, B:60:0x002e, B:72:0x00a5, B:74:0x00ad, B:61:0x0035, B:67:0x004d, B:69:0x007e, B:64:0x003e), top: B:87:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x00d8 A[RETURN] */
        @Override // zl.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object t(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 226
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: lg.d.C0352d.t(java.lang.Object):java.lang.Object");
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl$saveHeartRateRealtime$2", f = "DataRepository.kt", l = {307}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d0 extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f19521e;

        /* renamed from: g */
        public final /* synthetic */ long f19523g;

        /* renamed from: h */
        public final /* synthetic */ HeartRateRealtime f19524h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(long j10, HeartRateRealtime heartRateRealtime, xl.d<? super d0> dVar) {
            super(2, dVar);
            d.this = r1;
            this.f19523g = j10;
            this.f19524h = heartRateRealtime;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((d0) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new d0(this.f19523g, this.f19524h, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f19521e;
            if (i10 != 0) {
                if (i10 == 1) {
                    mf.a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                mf.a0.k(obj);
                d dVar = d.this;
                long j10 = this.f19523g;
                HeartRateRealtime heartRateRealtime = this.f19524h;
                this.f19521e = 1;
                Object l10 = dVar.f19485c.E().l(j10, heartRateRealtime, this);
                if (l10 != aVar) {
                    l10 = tl.l.f28297a;
                }
                if (l10 == aVar) {
                    return aVar;
                }
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends gm.m implements fm.l<Throwable, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e() {
            super(1);
            d.this = r1;
        }

        @Override // fm.l
        public final tl.l k(Throwable th2) {
            d.this.f19497o = null;
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl$saveOxygenRealtime$2", f = "DataRepository.kt", l = {440}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e0 extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f19526e;

        /* renamed from: g */
        public final /* synthetic */ long f19528g;

        /* renamed from: h */
        public final /* synthetic */ OxygenRealtime f19529h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(long j10, OxygenRealtime oxygenRealtime, xl.d<? super e0> dVar) {
            super(2, dVar);
            d.this = r1;
            this.f19528g = j10;
            this.f19529h = oxygenRealtime;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((e0) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new e0(this.f19528g, this.f19529h, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f19526e;
            if (i10 != 0) {
                if (i10 == 1) {
                    mf.a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                mf.a0.k(obj);
                d dVar = d.this;
                long j10 = this.f19528g;
                OxygenRealtime oxygenRealtime = this.f19529h;
                this.f19526e = 1;
                Object n10 = dVar.f19485c.E().n(j10, oxygenRealtime, this);
                if (n10 != aVar) {
                    n10 = tl.l.f28297a;
                }
                if (n10 == aVar) {
                    return aVar;
                }
            }
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl$checkHeartRateUpdate$1", f = "DataRepository.kt", l = {406, 412, 418, 420}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public long f19530e;

        /* renamed from: f */
        public int f19531f;

        /* renamed from: h */
        public final /* synthetic */ long f19533h;

        /* renamed from: i */
        public final /* synthetic */ Date f19534i;

        /* renamed from: j */
        public final /* synthetic */ Date f19535j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(long j10, Date date, Date date2, xl.d<? super f> dVar) {
            super(2, dVar);
            d.this = r1;
            this.f19533h = j10;
            this.f19534i = date;
            this.f19535j = date2;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((f) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new f(this.f19533h, this.f19534i, this.f19535j, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:74:0x00b0 A[Catch: Exception -> 0x00dc, TryCatch #0 {Exception -> 0x00dc, blocks: (B:52:0x0018, B:57:0x0027, B:80:0x00c9, B:60:0x002e, B:72:0x00a8, B:74:0x00b0, B:61:0x0036, B:67:0x004e, B:69:0x007f, B:64:0x003f), top: B:87:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x00db A[RETURN] */
        @Override // zl.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object t(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 229
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: lg.d.f.t(java.lang.Object):java.lang.Object");
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl$savePressureRealtime$2", f = "DataRepository.kt", l = {839}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f0 extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f19536e;

        /* renamed from: g */
        public final /* synthetic */ long f19538g;

        /* renamed from: h */
        public final /* synthetic */ PressureRealtime f19539h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(long j10, PressureRealtime pressureRealtime, xl.d<? super f0> dVar) {
            super(2, dVar);
            d.this = r1;
            this.f19538g = j10;
            this.f19539h = pressureRealtime;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((f0) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new f0(this.f19538g, this.f19539h, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f19536e;
            if (i10 != 0) {
                if (i10 == 1) {
                    mf.a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                mf.a0.k(obj);
                d dVar = d.this;
                long j10 = this.f19538g;
                PressureRealtime pressureRealtime = this.f19539h;
                this.f19536e = 1;
                Object o10 = dVar.f19485c.E().o(j10, pressureRealtime, this);
                if (o10 != aVar) {
                    o10 = tl.l.f28297a;
                }
                if (o10 == aVar) {
                    return aVar;
                }
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends gm.m implements fm.l<Throwable, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g() {
            super(1);
            d.this = r1;
        }

        @Override // fm.l
        public final tl.l k(Throwable th2) {
            d.this.f19492j = null;
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl", f = "DataRepository.kt", l = {273}, m = "saveSleepDeviceData")
    /* loaded from: classes2.dex */
    public static final class g0 extends zl.c {

        /* renamed from: d */
        public d f19541d;

        /* renamed from: e */
        public Iterator f19542e;

        /* renamed from: f */
        public long f19543f;

        /* renamed from: g */
        public /* synthetic */ Object f19544g;

        /* renamed from: i */
        public int f19546i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(xl.d<? super g0> dVar) {
            super(dVar);
            d.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f19544g = obj;
            this.f19546i |= Integer.MIN_VALUE;
            return d.this.P(0L, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl$checkOxygenUpdate$1", f = "DataRepository.kt", l = {539, 545, 551, 553}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public long f19547e;

        /* renamed from: f */
        public int f19548f;

        /* renamed from: h */
        public final /* synthetic */ long f19550h;

        /* renamed from: i */
        public final /* synthetic */ Date f19551i;

        /* renamed from: j */
        public final /* synthetic */ Date f19552j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(long j10, Date date, Date date2, xl.d<? super h> dVar) {
            super(2, dVar);
            d.this = r1;
            this.f19550h = j10;
            this.f19551i = date;
            this.f19552j = date2;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((h) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new h(this.f19550h, this.f19551i, this.f19552j, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:74:0x00b0 A[Catch: Exception -> 0x00dc, TryCatch #0 {Exception -> 0x00dc, blocks: (B:52:0x0018, B:57:0x0027, B:80:0x00c9, B:60:0x002e, B:72:0x00a8, B:74:0x00b0, B:61:0x0036, B:67:0x004e, B:69:0x007f, B:64:0x003f), top: B:87:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x00db A[RETURN] */
        @Override // zl.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object t(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 229
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: lg.d.h.t(java.lang.Object):java.lang.Object");
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl$saveTemperatureRealtime$2", f = "DataRepository.kt", l = {706}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h0 extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f19553e;

        /* renamed from: g */
        public final /* synthetic */ long f19555g;

        /* renamed from: h */
        public final /* synthetic */ TemperatureRealtime f19556h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(long j10, TemperatureRealtime temperatureRealtime, xl.d<? super h0> dVar) {
            super(2, dVar);
            d.this = r1;
            this.f19555g = j10;
            this.f19556h = temperatureRealtime;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((h0) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new h0(this.f19555g, this.f19556h, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f19553e;
            if (i10 != 0) {
                if (i10 == 1) {
                    mf.a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                mf.a0.k(obj);
                d dVar = d.this;
                long j10 = this.f19555g;
                TemperatureRealtime temperatureRealtime = this.f19556h;
                this.f19553e = 1;
                Object r10 = dVar.f19485c.E().r(j10, temperatureRealtime, this);
                if (r10 != aVar) {
                    r10 = tl.l.f28297a;
                }
                if (r10 == aVar) {
                    return aVar;
                }
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends gm.m implements fm.l<Throwable, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i() {
            super(1);
            d.this = r1;
        }

        @Override // fm.l
        public final tl.l k(Throwable th2) {
            d.this.f19493k = null;
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl", f = "DataRepository.kt", l = {1199, 1202, 1213, 1216}, m = "uploadBloodPressure")
    /* loaded from: classes2.dex */
    public static final class i0 extends zl.c {

        /* renamed from: d */
        public d f19558d;

        /* renamed from: e */
        public Object f19559e;

        /* renamed from: f */
        public Object f19560f;

        /* renamed from: g */
        public Iterator f19561g;

        /* renamed from: h */
        public long f19562h;

        /* renamed from: i */
        public int f19563i;

        /* renamed from: j */
        public /* synthetic */ Object f19564j;

        /* renamed from: l */
        public int f19566l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i0(xl.d<? super i0> dVar) {
            super(dVar);
            d.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f19564j = obj;
            this.f19566l |= Integer.MIN_VALUE;
            return d.this.Q(0L, null, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl$checkPressureUpdate$1", f = "DataRepository.kt", l = {938, 944, 950, 952}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public long f19567e;

        /* renamed from: f */
        public int f19568f;

        /* renamed from: h */
        public final /* synthetic */ long f19570h;

        /* renamed from: i */
        public final /* synthetic */ Date f19571i;

        /* renamed from: j */
        public final /* synthetic */ Date f19572j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(long j10, Date date, Date date2, xl.d<? super j> dVar) {
            super(2, dVar);
            d.this = r1;
            this.f19570h = j10;
            this.f19571i = date;
            this.f19572j = date2;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((j) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new j(this.f19570h, this.f19571i, this.f19572j, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:74:0x00b0 A[Catch: Exception -> 0x00dc, TryCatch #0 {Exception -> 0x00dc, blocks: (B:52:0x0018, B:57:0x0027, B:80:0x00c9, B:60:0x002e, B:72:0x00a8, B:74:0x00b0, B:61:0x0036, B:67:0x004e, B:69:0x007f, B:64:0x003f), top: B:87:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x00db A[RETURN] */
        @Override // zl.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object t(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 229
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: lg.d.j.t(java.lang.Object):java.lang.Object");
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl", f = "DataRepository.kt", l = {1088, 1089, 1090, 1091, 1092, 1093, 1094, 1095}, m = "uploadData")
    /* loaded from: classes2.dex */
    public static final class j0 extends zl.c {

        /* renamed from: d */
        public d f19573d;

        /* renamed from: e */
        public Object f19574e;

        /* renamed from: f */
        public Date f19575f;

        /* renamed from: g */
        public long f19576g;

        /* renamed from: h */
        public /* synthetic */ Object f19577h;

        /* renamed from: j */
        public int f19579j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(xl.d<? super j0> dVar) {
            super(dVar);
            d.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f19577h = obj;
            this.f19579j |= Integer.MIN_VALUE;
            return d.this.R(0L, this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends gm.m implements fm.l<Throwable, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k() {
            super(1);
            d.this = r1;
        }

        @Override // fm.l
        public final tl.l k(Throwable th2) {
            d.this.f19496n = null;
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl", f = "DataRepository.kt", l = {1274, 1282, 1285}, m = "uploadEcg")
    /* loaded from: classes2.dex */
    public static final class k0 extends zl.c {

        /* renamed from: d */
        public d f19581d;

        /* renamed from: e */
        public mf.t f19582e;

        /* renamed from: f */
        public Iterator f19583f;

        /* renamed from: g */
        public Object f19584g;

        /* renamed from: h */
        public long f19585h;

        /* renamed from: i */
        public /* synthetic */ Object f19586i;

        /* renamed from: k */
        public int f19588k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(xl.d<? super k0> dVar) {
            super(dVar);
            d.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f19586i = obj;
            this.f19588k |= Integer.MIN_VALUE;
            return d.this.S(0L, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl$checkSleepUpdate$1", f = "DataRepository.kt", l = {245, 251, 257, 259}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class l extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public long f19589e;

        /* renamed from: f */
        public int f19590f;

        /* renamed from: h */
        public final /* synthetic */ long f19592h;

        /* renamed from: i */
        public final /* synthetic */ Date f19593i;

        /* renamed from: j */
        public final /* synthetic */ Date f19594j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(long j10, Date date, Date date2, xl.d<? super l> dVar) {
            super(2, dVar);
            d.this = r1;
            this.f19592h = j10;
            this.f19593i = date;
            this.f19594j = date2;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((l) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new l(this.f19592h, this.f19593i, this.f19594j, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:74:0x00b0 A[Catch: Exception -> 0x00dc, TryCatch #0 {Exception -> 0x00dc, blocks: (B:52:0x0018, B:57:0x0027, B:80:0x00c9, B:60:0x002e, B:72:0x00a8, B:74:0x00b0, B:61:0x0036, B:67:0x004e, B:69:0x007f, B:64:0x003f), top: B:87:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x00db A[RETURN] */
        @Override // zl.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object t(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 229
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: lg.d.l.t(java.lang.Object):java.lang.Object");
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl", f = "DataRepository.kt", l = {1149, 1152, 1163, 1166}, m = "uploadHeartRate")
    /* loaded from: classes2.dex */
    public static final class l0 extends zl.c {

        /* renamed from: d */
        public d f19595d;

        /* renamed from: e */
        public Object f19596e;

        /* renamed from: f */
        public Object f19597f;

        /* renamed from: g */
        public Iterator f19598g;

        /* renamed from: h */
        public long f19599h;

        /* renamed from: i */
        public int f19600i;

        /* renamed from: j */
        public /* synthetic */ Object f19601j;

        /* renamed from: l */
        public int f19603l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l0(xl.d<? super l0> dVar) {
            super(dVar);
            d.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f19601j = obj;
            this.f19603l |= Integer.MIN_VALUE;
            return d.this.T(0L, null, null, this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends gm.m implements fm.l<Throwable, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m() {
            super(1);
            d.this = r1;
        }

        @Override // fm.l
        public final tl.l k(Throwable th2) {
            d.this.f19491i = null;
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl", f = "DataRepository.kt", l = {1174, 1177, 1188, 1191}, m = "uploadOxygen")
    /* loaded from: classes2.dex */
    public static final class m0 extends zl.c {

        /* renamed from: d */
        public d f19605d;

        /* renamed from: e */
        public Object f19606e;

        /* renamed from: f */
        public Object f19607f;

        /* renamed from: g */
        public Iterator f19608g;

        /* renamed from: h */
        public long f19609h;

        /* renamed from: i */
        public int f19610i;

        /* renamed from: j */
        public /* synthetic */ Object f19611j;

        /* renamed from: l */
        public int f19613l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m0(xl.d<? super m0> dVar) {
            super(dVar);
            d.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f19611j = obj;
            this.f19613l |= Integer.MIN_VALUE;
            return d.this.U(0L, null, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl$checkStepUpdate$1", f = "DataRepository.kt", l = {156, 162, 167, 169}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class n extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public long f19614e;

        /* renamed from: f */
        public int f19615f;

        /* renamed from: h */
        public final /* synthetic */ long f19617h;

        /* renamed from: i */
        public final /* synthetic */ Date f19618i;

        /* renamed from: j */
        public final /* synthetic */ Date f19619j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(long j10, Date date, Date date2, xl.d<? super n> dVar) {
            super(2, dVar);
            d.this = r1;
            this.f19617h = j10;
            this.f19618i = date;
            this.f19619j = date2;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((n) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new n(this.f19617h, this.f19618i, this.f19619j, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:74:0x00af A[Catch: Exception -> 0x00db, TryCatch #0 {Exception -> 0x00db, blocks: (B:52:0x0018, B:57:0x0027, B:80:0x00c8, B:60:0x002e, B:72:0x00a7, B:74:0x00af, B:61:0x0036, B:67:0x004e, B:69:0x007f, B:64:0x003f), top: B:87:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x00da A[RETURN] */
        @Override // zl.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object t(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 228
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: lg.d.n.t(java.lang.Object):java.lang.Object");
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl", f = "DataRepository.kt", l = {1249, 1252, 1263, 1266}, m = "uploadPressure")
    /* loaded from: classes2.dex */
    public static final class n0 extends zl.c {

        /* renamed from: d */
        public d f19620d;

        /* renamed from: e */
        public Object f19621e;

        /* renamed from: f */
        public Object f19622f;

        /* renamed from: g */
        public Iterator f19623g;

        /* renamed from: h */
        public long f19624h;

        /* renamed from: i */
        public int f19625i;

        /* renamed from: j */
        public /* synthetic */ Object f19626j;

        /* renamed from: l */
        public int f19628l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n0(xl.d<? super n0> dVar) {
            super(dVar);
            d.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f19626j = obj;
            this.f19628l |= Integer.MIN_VALUE;
            return d.this.V(0L, null, null, this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends gm.m implements fm.l<Throwable, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o() {
            super(1);
            d.this = r1;
        }

        @Override // fm.l
        public final tl.l k(Throwable th2) {
            d.this.f19490h = null;
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl", f = "DataRepository.kt", l = {1124, 1127, 1138, 1141}, m = "uploadSleep")
    /* loaded from: classes2.dex */
    public static final class o0 extends zl.c {

        /* renamed from: d */
        public d f19630d;

        /* renamed from: e */
        public Date f19631e;

        /* renamed from: f */
        public mf.t f19632f;

        /* renamed from: g */
        public Iterator f19633g;

        /* renamed from: h */
        public long f19634h;

        /* renamed from: i */
        public int f19635i;

        /* renamed from: j */
        public /* synthetic */ Object f19636j;

        /* renamed from: l */
        public int f19638l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0(xl.d<? super o0> dVar) {
            super(dVar);
            d.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f19636j = obj;
            this.f19638l |= Integer.MIN_VALUE;
            return d.this.W(0L, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl$checkTemperatureUpdate$1", f = "DataRepository.kt", l = {805, 811, 817, 819}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class p extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public long f19639e;

        /* renamed from: f */
        public int f19640f;

        /* renamed from: h */
        public final /* synthetic */ long f19642h;

        /* renamed from: i */
        public final /* synthetic */ Date f19643i;

        /* renamed from: j */
        public final /* synthetic */ Date f19644j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(long j10, Date date, Date date2, xl.d<? super p> dVar) {
            super(2, dVar);
            d.this = r1;
            this.f19642h = j10;
            this.f19643i = date;
            this.f19644j = date2;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((p) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new p(this.f19642h, this.f19643i, this.f19644j, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:74:0x00b0 A[Catch: Exception -> 0x00dc, TryCatch #0 {Exception -> 0x00dc, blocks: (B:52:0x0018, B:57:0x0027, B:80:0x00c9, B:60:0x002e, B:72:0x00a8, B:74:0x00b0, B:61:0x0036, B:67:0x004e, B:69:0x007f, B:64:0x003f), top: B:87:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x00db A[RETURN] */
        @Override // zl.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object t(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 229
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: lg.d.p.t(java.lang.Object):java.lang.Object");
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl", f = "DataRepository.kt", l = {1101, 1104, 1114, 1116}, m = "uploadStep")
    /* loaded from: classes2.dex */
    public static final class p0 extends zl.c {

        /* renamed from: d */
        public d f19645d;

        /* renamed from: e */
        public Date f19646e;

        /* renamed from: f */
        public long f19647f;

        /* renamed from: g */
        public int f19648g;

        /* renamed from: h */
        public /* synthetic */ Object f19649h;

        /* renamed from: j */
        public int f19651j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p0(xl.d<? super p0> dVar) {
            super(dVar);
            d.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f19649h = obj;
            this.f19651j |= Integer.MIN_VALUE;
            return d.this.X(0L, null, this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends gm.m implements fm.l<Throwable, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q() {
            super(1);
            d.this = r1;
        }

        @Override // fm.l
        public final tl.l k(Throwable th2) {
            d.this.f19495m = null;
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl", f = "DataRepository.kt", l = {1224, 1227, 1238, 1241}, m = "uploadTemperature")
    /* loaded from: classes2.dex */
    public static final class q0 extends zl.c {

        /* renamed from: d */
        public d f19653d;

        /* renamed from: e */
        public Object f19654e;

        /* renamed from: f */
        public Object f19655f;

        /* renamed from: g */
        public Iterator f19656g;

        /* renamed from: h */
        public long f19657h;

        /* renamed from: i */
        public int f19658i;

        /* renamed from: j */
        public /* synthetic */ Object f19659j;

        /* renamed from: l */
        public int f19661l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q0(xl.d<? super q0> dVar) {
            super(dVar);
            d.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f19659j = obj;
            this.f19661l |= Integer.MIN_VALUE;
            return d.this.Y(0L, null, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl", f = "DataRepository.kt", l = {612, 620, 635, 644, 648, 654}, m = "getBloodPressureDetail")
    /* loaded from: classes2.dex */
    public static final class r extends zl.c {

        /* renamed from: d */
        public Object f19662d;

        /* renamed from: e */
        public Date f19663e;

        /* renamed from: f */
        public vf.c f19664f;

        /* renamed from: g */
        public List f19665g;

        /* renamed from: h */
        public long f19666h;

        /* renamed from: i */
        public long f19667i;

        /* renamed from: j */
        public /* synthetic */ Object f19668j;

        /* renamed from: l */
        public int f19670l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(xl.d<? super r> dVar) {
            super(dVar);
            d.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f19668j = obj;
            this.f19670l |= Integer.MIN_VALUE;
            return d.this.E(null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl", f = "DataRepository.kt", l = {982, 990, 992, 994}, m = "getEcgDetail")
    /* loaded from: classes2.dex */
    public static final class s extends zl.c {

        /* renamed from: d */
        public Object f19671d;

        /* renamed from: e */
        public UUID f19672e;

        /* renamed from: f */
        public rg.d f19673f;

        /* renamed from: g */
        public long f19674g;

        /* renamed from: h */
        public /* synthetic */ Object f19675h;

        /* renamed from: j */
        public int f19677j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(xl.d<? super s> dVar) {
            super(dVar);
            d.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f19675h = obj;
            this.f19677j |= Integer.MIN_VALUE;
            return d.this.L(null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl", f = "DataRepository.kt", l = {1013, 1027, 1028, 1031, 1032}, m = "getEcgReportUrl")
    /* loaded from: classes2.dex */
    public static final class t extends zl.c {

        /* renamed from: d */
        public Object f19678d;

        /* renamed from: e */
        public Object f19679e;

        /* renamed from: f */
        public Object f19680f;

        /* renamed from: g */
        public String f19681g;

        /* renamed from: h */
        public long f19682h;

        /* renamed from: i */
        public /* synthetic */ Object f19683i;

        /* renamed from: k */
        public int f19685k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(xl.d<? super t> dVar) {
            super(dVar);
            d.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f19683i = obj;
            this.f19685k |= Integer.MIN_VALUE;
            return d.this.h(null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl", f = "DataRepository.kt", l = {346, 354, 369, 378, 382, 388}, m = "getHeartRateDetail")
    /* loaded from: classes2.dex */
    public static final class u extends zl.c {

        /* renamed from: d */
        public Object f19686d;

        /* renamed from: e */
        public Date f19687e;

        /* renamed from: f */
        public vf.f f19688f;

        /* renamed from: g */
        public List f19689g;

        /* renamed from: h */
        public long f19690h;

        /* renamed from: i */
        public long f19691i;

        /* renamed from: j */
        public /* synthetic */ Object f19692j;

        /* renamed from: l */
        public int f19694l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(xl.d<? super u> dVar) {
            super(dVar);
            d.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f19692j = obj;
            this.f19694l |= Integer.MIN_VALUE;
            return d.this.s(null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl", f = "DataRepository.kt", l = {1074, 1075, 1076, 1077, 1078, 1079, 1080, 1081}, m = "getNewDataCount")
    /* loaded from: classes2.dex */
    public static final class v extends zl.c {

        /* renamed from: d */
        public d f19695d;

        /* renamed from: e */
        public Date f19696e;

        /* renamed from: f */
        public long f19697f;

        /* renamed from: g */
        public int f19698g;

        /* renamed from: h */
        public /* synthetic */ Object f19699h;

        /* renamed from: j */
        public int f19701j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(xl.d<? super v> dVar) {
            super(dVar);
            d.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f19699h = obj;
            this.f19701j |= Integer.MIN_VALUE;
            return d.this.O(0L, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl", f = "DataRepository.kt", l = {479, 487, 502, 511, 515, 521}, m = "getOxygenDetail")
    /* loaded from: classes2.dex */
    public static final class w extends zl.c {

        /* renamed from: d */
        public Object f19702d;

        /* renamed from: e */
        public Date f19703e;

        /* renamed from: f */
        public vf.k f19704f;

        /* renamed from: g */
        public List f19705g;

        /* renamed from: h */
        public long f19706h;

        /* renamed from: i */
        public long f19707i;

        /* renamed from: j */
        public /* synthetic */ Object f19708j;

        /* renamed from: l */
        public int f19710l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(xl.d<? super w> dVar) {
            super(dVar);
            d.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f19708j = obj;
            this.f19710l |= Integer.MIN_VALUE;
            return d.this.q(null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl", f = "DataRepository.kt", l = {878, 886, 901, 910, 914, 920}, m = "getPressureDetail")
    /* loaded from: classes2.dex */
    public static final class x extends zl.c {

        /* renamed from: d */
        public Object f19711d;

        /* renamed from: e */
        public Date f19712e;

        /* renamed from: f */
        public vf.m f19713f;

        /* renamed from: g */
        public List f19714g;

        /* renamed from: h */
        public long f19715h;

        /* renamed from: i */
        public long f19716i;

        /* renamed from: j */
        public /* synthetic */ Object f19717j;

        /* renamed from: l */
        public int f19719l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(xl.d<? super x> dVar) {
            super(dVar);
            d.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f19717j = obj;
            this.f19719l |= Integer.MIN_VALUE;
            return d.this.d(null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl", f = "DataRepository.kt", l = {206, 213, 219, 225, 228}, m = "getSleepDetail")
    /* loaded from: classes2.dex */
    public static final class y extends zl.c {

        /* renamed from: d */
        public Object f19720d;

        /* renamed from: e */
        public Date f19721e;

        /* renamed from: f */
        public rg.p f19722f;

        /* renamed from: g */
        public long f19723g;

        /* renamed from: h */
        public /* synthetic */ Object f19724h;

        /* renamed from: j */
        public int f19726j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(xl.d<? super y> dVar) {
            super(dVar);
            d.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f19724h = obj;
            this.f19726j |= Integer.MIN_VALUE;
            return d.this.N(null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl", f = "DataRepository.kt", l = {745, 753, 768, 777, 781, 787}, m = "getTemperatureDetail")
    /* loaded from: classes2.dex */
    public static final class z extends zl.c {

        /* renamed from: d */
        public Object f19727d;

        /* renamed from: e */
        public Date f19728e;

        /* renamed from: f */
        public vf.r f19729f;

        /* renamed from: g */
        public List f19730g;

        /* renamed from: h */
        public long f19731h;

        /* renamed from: i */
        public long f19732i;

        /* renamed from: j */
        public /* synthetic */ Object f19733j;

        /* renamed from: l */
        public int f19735l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(xl.d<? super z> dVar) {
            super(dVar);
            d.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f19733j = obj;
            this.f19735l |= Integer.MIN_VALUE;
            return d.this.I(null, this);
        }
    }

    static {
        new a();
    }

    public d(Context context, yg.b bVar, AppDatabase appDatabase, pm.e0 e0Var, yg.b0 b0Var, vg.d dVar, mf.h0 h0Var) {
        gm.l.f(appDatabase, "appDatabase");
        gm.l.f(e0Var, "applicationScope");
        gm.l.f(h0Var, "moshi");
        this.f19483a = context;
        this.f19484b = bVar;
        this.f19485c = appDatabase;
        this.f19486d = e0Var;
        this.f19487e = b0Var;
        this.f19488f = dVar;
        this.f19489g = h0Var;
    }

    @Override // lg.c
    public final void A(HeartRateRealtime heartRateRealtime) {
        Long b10 = yg.l.b(this.f19484b);
        if (b10 != null) {
            z0.g(this.f19486d, null, 0, new d0(b10.longValue(), heartRateRealtime, null), 3);
        }
    }

    @Override // lg.c
    public final void B(Date date, Date date2) {
        Long a10;
        gm.l.f(date, "start");
        gm.l.f(date2, "end");
        g1 g1Var = this.f19493k;
        boolean z10 = true;
        if (((g1Var == null || !g1Var.a()) ? false : false) || (a10 = yg.l.a(this.f19484b)) == null) {
            return;
        }
        z1 g10 = z0.g(this.f19486d, null, 0, new h(a10.longValue(), date, date2, null), 3);
        g10.k(new i());
        this.f19493k = g10;
    }

    @Override // lg.c
    public final tm.j C(Date date, Date date2) {
        gm.l.f(date, "start");
        gm.l.f(date2, "end");
        return bi.r.O(this.f19484b.h(), new lg.r(null, this, date, date2));
    }

    @Override // lg.c
    public final tm.j D() {
        return bi.r.O(this.f19484b.h(), new lg.q(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0145 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0161 A[Catch: Exception -> 0x0076, TryCatch #1 {Exception -> 0x0076, blocks: (B:116:0x0038, B:119:0x0049, B:186:0x01ae, B:192:0x01ba, B:122:0x005c, B:181:0x0185, B:125:0x0071, B:169:0x014d, B:171:0x0155, B:177:0x0161), top: B:204:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x01a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x01ba A[Catch: Exception -> 0x0076, TRY_LEAVE, TryCatch #1 {Exception -> 0x0076, blocks: (B:116:0x0038, B:119:0x0049, B:186:0x01ae, B:192:0x01ba, B:122:0x005c, B:181:0x0185, B:125:0x0071, B:169:0x014d, B:171:0x0155, B:177:0x0161), top: B:204:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:? A[RETURN, SYNTHETIC] */
    @Override // lg.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object E(java.util.Date r23, xl.d<? super vf.c> r24) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lg.d.E(java.util.Date, xl.d):java.lang.Object");
    }

    @Override // lg.c
    public final void F(Date date, Date date2) {
        Long a10;
        gm.l.f(date, "start");
        gm.l.f(date2, "end");
        g1 g1Var = this.f19496n;
        boolean z10 = true;
        if (((g1Var == null || !g1Var.a()) ? false : false) || (a10 = yg.l.a(this.f19484b)) == null) {
            return;
        }
        z1 g10 = z0.g(this.f19486d, null, 0, new j(a10.longValue(), date, date2, null), 3);
        g10.k(new k());
        this.f19496n = g10;
    }

    @Override // lg.c
    public final tm.j G(Date date, Date date2) {
        gm.l.f(date, "start");
        gm.l.f(date2, "end");
        return bi.r.O(this.f19484b.h(), new lg.o(null, this, date, date2));
    }

    @Override // lg.c
    public final tm.j H() {
        return bi.r.O(this.f19484b.h(), new lg.k(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0145 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0161 A[Catch: Exception -> 0x0076, TryCatch #1 {Exception -> 0x0076, blocks: (B:116:0x0038, B:119:0x0049, B:186:0x01ae, B:192:0x01ba, B:122:0x005c, B:181:0x0185, B:125:0x0071, B:169:0x014d, B:171:0x0155, B:177:0x0161), top: B:204:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x01a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x01ba A[Catch: Exception -> 0x0076, TRY_LEAVE, TryCatch #1 {Exception -> 0x0076, blocks: (B:116:0x0038, B:119:0x0049, B:186:0x01ae, B:192:0x01ba, B:122:0x005c, B:181:0x0185, B:125:0x0071, B:169:0x014d, B:171:0x0155, B:177:0x0161), top: B:204:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:? A[RETURN, SYNTHETIC] */
    @Override // lg.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object I(java.util.Date r23, xl.d<? super vf.r> r24) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lg.d.I(java.util.Date, xl.d):java.lang.Object");
    }

    @Override // lg.c
    public final lg.y J(Date date) {
        gm.l.f(date, "date");
        return new lg.y(bi.r.O(this.f19484b.h(), new lg.x(null, this, date)), date);
    }

    @Override // lg.c
    public final tm.j K(Date date, Date date2) {
        gm.l.f(date, "start");
        gm.l.f(date2, "end");
        return bi.r.O(this.f19484b.h(), new lg.z(null, this, date, date2));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:(1:(1:(5:13|14|15|16|(2:18|19)(1:21))(2:26|27))(4:28|29|30|(1:32)(3:33|16|(0)(0))))(4:35|36|37|(1:39)(3:40|30|(0)(0))))(1:41))(2:58|(2:60|(1:62)(1:63))(1:64))|42|(1:44)(2:45|(2:56|57)(3:49|50|(1:52)(3:53|37|(0)(0))))))|67|6|7|(0)(0)|42|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0064, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0113, code lost:
        r2 = r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x010c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x002b  */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    @Override // lg.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object L(java.util.UUID r22, xl.d<? super com.topstep.fitcloud.pro.model.data.EcgRecord> r23) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lg.d.L(java.util.UUID, xl.d):java.lang.Object");
    }

    @Override // lg.c
    public final void M(Date date, Date date2) {
        Long a10;
        gm.l.f(date, "start");
        gm.l.f(date2, "end");
        g1 g1Var = this.f19495m;
        boolean z10 = true;
        if (((g1Var == null || !g1Var.a()) ? false : false) || (a10 = yg.l.a(this.f19484b)) == null) {
            return;
        }
        z1 g10 = z0.g(this.f19486d, null, 0, new p(a10.longValue(), date, date2, null), 3);
        g10.k(new q());
        this.f19495m = g10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0146 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x015c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0162 A[Catch: Exception -> 0x0041, TRY_LEAVE, TryCatch #2 {Exception -> 0x0041, blocks: (B:106:0x003b, B:155:0x015e, B:157:0x0162), top: B:176:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    @Override // lg.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object N(java.util.Date r26, xl.d<? super vf.n> r27) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lg.d.N(java.util.Date, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ba A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object O(long r10, xl.d<? super java.lang.Integer> r12) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lg.d.O(long, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0064  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x005b -> B:43:0x005e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object P(long r6, java.util.List<oj.h> r8, xl.d<? super tl.l> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof lg.d.g0
            if (r0 == 0) goto L13
            r0 = r9
            lg.d$g0 r0 = (lg.d.g0) r0
            int r1 = r0.f19546i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19546i = r1
            goto L18
        L13:
            lg.d$g0 r0 = new lg.d$g0
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f19544g
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f19546i
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r6 = r0.f19543f
            java.util.Iterator r8 = r0.f19542e
            lg.d r2 = r0.f19541d
            mf.a0.k(r9)
            goto L5e
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            mf.a0.k(r9)
            java.util.Iterator r8 = r8.iterator()
            r2 = r5
        L3d:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L64
            java.lang.Object r9 = r8.next()
            oj.h r9 = (oj.h) r9
            com.topstep.fitcloud.pro.shared.data.db.AppDatabase r4 = r2.f19485c
            mg.c6 r4 = r4.B()
            r0.f19541d = r2
            r0.f19542e = r8
            r0.f19543f = r6
            r0.f19546i = r3
            java.lang.Object r9 = r4.q(r6, r9, r0)
            if (r9 != r1) goto L5e
            return r1
        L5e:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            r9.booleanValue()
            goto L3d
        L64:
            tl.l r6 = tl.l.f28297a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: lg.d.P(long, java.util.List, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Q(long r22, java.util.Calendar r24, java.util.Date r25, xl.d<? super tl.l> r26) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lg.d.Q(long, java.util.Calendar, java.util.Date, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0125 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0143 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0160 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0196 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object R(long r18, xl.d<? super tl.l> r20) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lg.d.R(long, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x014e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x0101 -> B:92:0x0106). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x0148 -> B:97:0x014b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object S(long r18, java.util.Date r20, xl.d<? super tl.l> r21) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lg.d.S(long, java.util.Date, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object T(long r22, java.util.Calendar r24, java.util.Date r25, xl.d<? super tl.l> r26) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lg.d.T(long, java.util.Calendar, java.util.Date, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object U(long r22, java.util.Calendar r24, java.util.Date r25, xl.d<? super tl.l> r26) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lg.d.U(long, java.util.Calendar, java.util.Date, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object V(long r22, java.util.Calendar r24, java.util.Date r25, xl.d<? super tl.l> r26) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lg.d.V(long, java.util.Calendar, java.util.Date, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0195 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object W(long r21, java.util.Date r23, xl.d<? super tl.l> r24) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lg.d.W(long, java.util.Date, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0166 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object X(long r21, java.util.Date r23, xl.d<? super tl.l> r24) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lg.d.X(long, java.util.Date, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Y(long r22, java.util.Calendar r24, java.util.Date r25, xl.d<? super tl.l> r26) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lg.d.Y(long, java.util.Calendar, java.util.Date, xl.d):java.lang.Object");
    }

    @Override // lg.c
    public final void a(PressureRealtime pressureRealtime) {
        Long b10 = yg.l.b(this.f19484b);
        if (b10 != null) {
            z0.g(this.f19486d, null, 0, new f0(b10.longValue(), pressureRealtime, null), 3);
        }
    }

    @Override // lg.c
    public final tm.j b(Date date) {
        gm.l.f(date, "start");
        return bi.r.O(this.f19484b.h(), new lg.i(null, this, date));
    }

    @Override // lg.c
    public final tm.j c() {
        return bi.r.O(this.f19484b.h(), new lg.n(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0145 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0161 A[Catch: Exception -> 0x0076, TryCatch #1 {Exception -> 0x0076, blocks: (B:116:0x0038, B:119:0x0049, B:186:0x01ae, B:192:0x01ba, B:122:0x005c, B:181:0x0185, B:125:0x0071, B:169:0x014d, B:171:0x0155, B:177:0x0161), top: B:204:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x01a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x01ba A[Catch: Exception -> 0x0076, TRY_LEAVE, TryCatch #1 {Exception -> 0x0076, blocks: (B:116:0x0038, B:119:0x0049, B:186:0x01ae, B:192:0x01ba, B:122:0x005c, B:181:0x0185, B:125:0x0071, B:169:0x014d, B:171:0x0155, B:177:0x0161), top: B:204:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:? A[RETURN, SYNTHETIC] */
    @Override // lg.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.util.Date r23, xl.d<? super vf.m> r24) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lg.d.d(java.util.Date, xl.d):java.lang.Object");
    }

    @Override // lg.c
    public final Object e(Date date, b0.a aVar) {
        Long b10 = yg.l.b(this.f19484b);
        if (b10 != null) {
            return this.f19485c.D().k(b10.longValue(), date, aVar);
        }
        return null;
    }

    @Override // lg.c
    public final lg.u f(Date date) {
        gm.l.f(date, "date");
        return new lg.u(bi.r.O(this.f19484b.h(), new lg.t(null, this, date)), date);
    }

    @Override // lg.c
    public final void g(BloodPressureRealtime bloodPressureRealtime) {
        Long b10 = yg.l.b(this.f19484b);
        if (b10 != null) {
            z0.g(this.f19486d, null, 0, new b0(b10.longValue(), bloodPressureRealtime, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x014d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0183 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b7 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ad  */
    @Override // lg.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(java.util.UUID r20, xl.d<? super java.lang.String> r21) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lg.d.h(java.util.UUID, xl.d):java.lang.Object");
    }

    @Override // lg.c
    public final tm.j i() {
        return bi.r.O(this.f19484b.h(), new lg.f(this, null));
    }

    @Override // lg.c
    public final tm.j j(Date date, Date date2) {
        gm.l.f(date, "start");
        gm.l.f(date2, "end");
        return bi.r.O(this.f19484b.h(), new lg.c0(null, this, date, date2));
    }

    @Override // lg.c
    public final tm.j k() {
        return bi.r.O(this.f19484b.h(), new lg.b0(this, null));
    }

    @Override // lg.c
    public final void l(Date date, Date date2) {
        Long a10;
        gm.l.f(date, "start");
        gm.l.f(date2, "end");
        g1 g1Var = this.f19491i;
        boolean z10 = true;
        if (((g1Var == null || !g1Var.a()) ? false : false) || (a10 = yg.l.a(this.f19484b)) == null) {
            return;
        }
        z1 g10 = z0.g(this.f19486d, null, 0, new l(a10.longValue(), date, date2, null), 3);
        g10.k(new m());
        this.f19491i = g10;
    }

    @Override // lg.c
    public final tm.j m() {
        return bi.r.O(this.f19484b.h(), new lg.e(this, null));
    }

    @Override // lg.c
    public final void n(Date date) {
        Long a10;
        gm.l.f(date, "start");
        g1 g1Var = this.f19497o;
        boolean z10 = true;
        if (((g1Var == null || !g1Var.a()) ? false : false) || (a10 = yg.l.a(this.f19484b)) == null) {
            return;
        }
        z1 g10 = z0.g(this.f19486d, null, 0, new C0352d(a10.longValue(), date, null), 3);
        g10.k(new e());
        this.f19497o = g10;
    }

    @Override // lg.c
    public final void o(Date date, Date date2) {
        Long a10;
        gm.l.f(date, "start");
        gm.l.f(date2, "end");
        g1 g1Var = this.f19490h;
        boolean z10 = true;
        if (((g1Var == null || !g1Var.a()) ? false : false) || (a10 = yg.l.a(this.f19484b)) == null) {
            return;
        }
        z1 g10 = z0.g(this.f19486d, null, 0, new n(a10.longValue(), date, date2, null), 3);
        g10.k(new o());
        this.f19490h = g10;
    }

    @Override // lg.c
    public final void p(vf.a aVar) {
        Long b10 = yg.l.b(this.f19484b);
        if (b10 != null) {
            z0.g(this.f19486d, null, 0, new a0(b10.longValue(), aVar, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0145 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0161 A[Catch: Exception -> 0x0076, TryCatch #1 {Exception -> 0x0076, blocks: (B:116:0x0038, B:119:0x0049, B:186:0x01ae, B:192:0x01ba, B:122:0x005c, B:181:0x0185, B:125:0x0071, B:169:0x014d, B:171:0x0155, B:177:0x0161), top: B:204:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x01a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x01ba A[Catch: Exception -> 0x0076, TRY_LEAVE, TryCatch #1 {Exception -> 0x0076, blocks: (B:116:0x0038, B:119:0x0049, B:186:0x01ae, B:192:0x01ba, B:122:0x005c, B:181:0x0185, B:125:0x0071, B:169:0x014d, B:171:0x0155, B:177:0x0161), top: B:204:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:? A[RETURN, SYNTHETIC] */
    @Override // lg.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(java.util.Date r23, xl.d<? super vf.k> r24) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lg.d.q(java.util.Date, xl.d):java.lang.Object");
    }

    @Override // lg.c
    public final void r(EcgRecord ecgRecord) {
        gm.l.f(ecgRecord, "record");
        z0.g(this.f19486d, null, 0, new c0(ecgRecord, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0145 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0161 A[Catch: Exception -> 0x0076, TryCatch #1 {Exception -> 0x0076, blocks: (B:116:0x0038, B:119:0x0049, B:186:0x01ae, B:192:0x01ba, B:122:0x005c, B:181:0x0185, B:125:0x0071, B:169:0x014d, B:171:0x0155, B:177:0x0161), top: B:204:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x01a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x01ba A[Catch: Exception -> 0x0076, TRY_LEAVE, TryCatch #1 {Exception -> 0x0076, blocks: (B:116:0x0038, B:119:0x0049, B:186:0x01ae, B:192:0x01ba, B:122:0x005c, B:181:0x0185, B:125:0x0071, B:169:0x014d, B:171:0x0155, B:177:0x0161), top: B:204:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:? A[RETURN, SYNTHETIC] */
    @Override // lg.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s(java.util.Date r23, xl.d<? super vf.f> r24) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lg.d.s(java.util.Date, xl.d):java.lang.Object");
    }

    @Override // lg.c
    public final tm.j t(Date date, Date date2) {
        gm.l.f(date, "start");
        gm.l.f(date2, "end");
        return bi.r.O(this.f19484b.h(), new lg.g(null, this, date, date2));
    }

    @Override // lg.c
    public final void u(TemperatureRealtime temperatureRealtime) {
        Long b10 = yg.l.b(this.f19484b);
        if (b10 != null) {
            z0.g(this.f19486d, null, 0, new h0(b10.longValue(), temperatureRealtime, null), 3);
        }
    }

    @Override // lg.c
    public final void v(OxygenRealtime oxygenRealtime) {
        Long b10 = yg.l.b(this.f19484b);
        if (b10 != null) {
            z0.g(this.f19486d, null, 0, new e0(b10.longValue(), oxygenRealtime, null), 3);
        }
    }

    @Override // lg.c
    public final tm.j w(Date date, Date date2) {
        gm.l.f(date, "start");
        gm.l.f(date2, "end");
        return bi.r.O(this.f19484b.h(), new lg.l(null, this, date, date2));
    }

    @Override // lg.c
    public final void x(Date date, Date date2) {
        Long a10;
        gm.l.f(date, "start");
        gm.l.f(date2, "end");
        g1 g1Var = this.f19492j;
        boolean z10 = true;
        if (((g1Var == null || !g1Var.a()) ? false : false) || (a10 = yg.l.a(this.f19484b)) == null) {
            return;
        }
        z1 g10 = z0.g(this.f19486d, null, 0, new f(a10.longValue(), date, date2, null), 3);
        g10.k(new g());
        this.f19492j = g10;
    }

    @Override // lg.c
    public final void y(Date date, Date date2) {
        Long a10;
        gm.l.f(date, "start");
        gm.l.f(date2, "end");
        g1 g1Var = this.f19494l;
        boolean z10 = true;
        if (((g1Var == null || !g1Var.a()) ? false : false) || (a10 = yg.l.a(this.f19484b)) == null) {
            return;
        }
        z1 g10 = z0.g(this.f19486d, null, 0, new b(a10.longValue(), date, date2, null), 3);
        g10.k(new c());
        this.f19494l = g10;
    }

    @Override // lg.c
    public final tm.j z(Date date, Date date2) {
        gm.l.f(date, "start");
        gm.l.f(date2, "end");
        return bi.r.O(this.f19484b.h(), new lg.v(null, this, date, date2));
    }
}
