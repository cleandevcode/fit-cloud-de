package yg;

import android.content.Context;
import bi.z0;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.topstep.fitcloud.pro.model.device.DeviceShellSpecify;
import com.topstep.fitcloud.pro.shared.data.bean.TokenBean;
import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileLock;
import java.util.List;
import jg.b;
import mf.h0;
import mf.l0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000do.a;
import pm.e0;
import sm.f1;
import sm.k0;
import v1.d;
import zg.c;

/* loaded from: classes2.dex */
public final class b implements yg.m, yg.j {

    /* renamed from: g */
    public static final /* synthetic */ mm.h<Object>[] f31481g;

    /* renamed from: a */
    public final Context f31482a;

    /* renamed from: b */
    public final e0 f31483b;

    /* renamed from: c */
    public final e0 f31484c;

    /* renamed from: d */
    public final h0 f31485d;

    /* renamed from: e */
    public final u1.c f31486e;

    /* renamed from: f */
    public final f1<Long> f31487f;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public static final d.a<Long> f31488a = new d.a<>("last_user_id");

        /* renamed from: b */
        public static final d.a<Boolean> f31489b = new d.a<>("last_user_status");

        /* renamed from: c */
        public static final d.a<Integer> f31490c = rm.l.k("last_user_auth_type");

        /* renamed from: d */
        public static final d.a<Long> f31491d = new d.a<>("token_auth_time");

        /* renamed from: e */
        public static final d.a<String> f31492e = rm.l.w(Oauth2AccessToken.KEY_ACCESS_TOKEN);

        /* renamed from: f */
        public static final d.a<String> f31493f = rm.l.w(Oauth2AccessToken.KEY_REFRESH_TOKEN);

        /* renamed from: g */
        public static final d.a<Long> f31494g = new d.a<>("token_expires_time");

        /* renamed from: h */
        public static final d.a<String> f31495h = rm.l.w("end_point");
    }

    /* renamed from: yg.b$b */
    /* loaded from: classes2.dex */
    public static final class C0579b {

        /* renamed from: a */
        public static final d.a<Integer> f31496a = rm.l.k("agreed_policy_version");

        /* renamed from: b */
        public static final d.a<Boolean> f31497b = new d.a<>("assist_enabled");

        /* renamed from: c */
        public static final d.a<String> f31498c = rm.l.w("app_upgrade_version");

        /* renamed from: d */
        public static final d.a<Boolean> f31499d = new d.a<>("app_upgrade_ignore");

        /* renamed from: e */
        public static final d.a<String> f31500e = rm.l.w("hardware_upgrade_version");

        /* renamed from: f */
        public static final d.a<Boolean> f31501f = new d.a<>("hardware_upgrade_ignore");

        /* renamed from: g */
        public static final d.a<Long> f31502g = new d.a<>("upgrade_check_time");

        /* renamed from: h */
        public static final d.a<String> f31503h = rm.l.w("ecg_algorithm_token");

        /* renamed from: i */
        public static final d.a<String> f31504i = rm.l.w("selected_theme");
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.GlobalStorageImpl", f = "GlobalStorageImpl.kt", l = {307, 316}, m = "deleteAuthInfo")
    /* loaded from: classes2.dex */
    public static final class c extends zl.c {

        /* renamed from: d */
        public b f31505d;

        /* renamed from: e */
        public /* synthetic */ Object f31506e;

        /* renamed from: g */
        public int f31508g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(dVar);
            b.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f31506e = obj;
            this.f31508g |= Integer.MIN_VALUE;
            return b.this.u(this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.GlobalStorageImpl$deleteAuthInfo$2", f = "GlobalStorageImpl.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends zl.i implements fm.p<v1.a, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f31509e;

        public d(xl.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // fm.p
        public final Object A(v1.a aVar, xl.d<? super tl.l> dVar) {
            return ((d) p(aVar, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f31509e = obj;
            return dVar2;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            mf.a0.k(obj);
            v1.a aVar = (v1.a) this.f31509e;
            d.a<Long> aVar2 = a.f31488a;
            aVar.d(a.f31489b, Boolean.FALSE);
            aVar.d(a.f31491d, new Long(0L));
            aVar.d(a.f31492e, "");
            aVar.d(a.f31493f, "");
            aVar.d(a.f31494g, new Long(0L));
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.GlobalStorageImpl$flowAuthedUserId$1", f = "GlobalStorageImpl.kt", l = {220}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends zl.i implements fm.p<e0, xl.d<? super f1<? extends Long>>, Object> {

        /* renamed from: e */
        public int f31510e;

        @zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.GlobalStorageImpl$flowAuthedUserId$1$2", f = "GlobalStorageImpl.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends zl.i implements fm.p<Long, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public /* synthetic */ Object f31512e;

            public a(xl.d<? super a> dVar) {
                super(2, dVar);
            }

            @Override // fm.p
            public final Object A(Long l10, xl.d<? super tl.l> dVar) {
                return ((a) p(l10, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                a aVar = new a(dVar);
                aVar.f31512e = obj;
                return aVar;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                mf.a0.k(obj);
                a.b bVar = p000do.a.f13275a;
                bVar.t("globalStorage");
                bVar.h("flowAuthedUserId:" + ((Long) this.f31512e), new Object[0]);
                return tl.l.f28297a;
            }
        }

        /* renamed from: yg.b$e$b */
        /* loaded from: classes2.dex */
        public static final class C0580b implements sm.f<Long> {

            /* renamed from: a */
            public final /* synthetic */ sm.f f31513a;

            /* renamed from: yg.b$e$b$a */
            /* loaded from: classes2.dex */
            public static final class a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ sm.g f31514a;

                @zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.GlobalStorageImpl$flowAuthedUserId$1$invokeSuspend$$inlined$map$1$2", f = "GlobalStorageImpl.kt", l = {223}, m = "emit")
                /* renamed from: yg.b$e$b$a$a */
                /* loaded from: classes2.dex */
                public static final class C0581a extends zl.c {

                    /* renamed from: d */
                    public /* synthetic */ Object f31515d;

                    /* renamed from: e */
                    public int f31516e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0581a(xl.d dVar) {
                        super(dVar);
                        a.this = r1;
                    }

                    @Override // zl.a
                    public final Object t(Object obj) {
                        this.f31515d = obj;
                        this.f31516e |= Integer.MIN_VALUE;
                        return a.this.n(null, this);
                    }
                }

                public a(sm.g gVar) {
                    this.f31514a = gVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:38:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x002f  */
                @Override // sm.g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object n(java.lang.Object r8, xl.d r9) {
                    /*
                        r7 = this;
                        boolean r0 = r9 instanceof yg.b.e.C0580b.a.C0581a
                        if (r0 == 0) goto L13
                        r0 = r9
                        yg.b$e$b$a$a r0 = (yg.b.e.C0580b.a.C0581a) r0
                        int r1 = r0.f31516e
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f31516e = r1
                        goto L18
                    L13:
                        yg.b$e$b$a$a r0 = new yg.b$e$b$a$a
                        r0.<init>(r9)
                    L18:
                        java.lang.Object r9 = r0.f31515d
                        yl.a r1 = yl.a.COROUTINE_SUSPENDED
                        int r2 = r0.f31516e
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        mf.a0.k(r9)
                        goto L67
                    L27:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r9)
                        throw r8
                    L2f:
                        mf.a0.k(r9)
                        sm.g r9 = r7.f31514a
                        v1.d r8 = (v1.d) r8
                        v1.d$a<java.lang.Long> r2 = yg.b.a.f31488a
                        v1.d$a<java.lang.Long> r2 = yg.b.a.f31488a
                        java.lang.Object r2 = r8.b(r2)
                        java.lang.Long r2 = (java.lang.Long) r2
                        r4 = 0
                        if (r2 == 0) goto L5d
                        long r5 = r2.longValue()
                        boolean r5 = hh.b.g(r5)
                        if (r5 != 0) goto L4e
                        goto L5d
                    L4e:
                        v1.d$a<java.lang.Boolean> r5 = yg.b.a.f31489b
                        java.lang.Object r8 = r8.b(r5)
                        java.lang.Boolean r5 = java.lang.Boolean.TRUE
                        boolean r8 = gm.l.a(r8, r5)
                        if (r8 == 0) goto L5d
                        goto L5e
                    L5d:
                        r2 = r4
                    L5e:
                        r0.f31516e = r3
                        java.lang.Object r8 = r9.n(r2, r0)
                        if (r8 != r1) goto L67
                        return r1
                    L67:
                        tl.l r8 = tl.l.f28297a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: yg.b.e.C0580b.a.n(java.lang.Object, xl.d):java.lang.Object");
                }
            }

            public C0580b(sm.f fVar) {
                this.f31513a = fVar;
            }

            @Override // sm.f
            public final Object a(sm.g<? super Long> gVar, xl.d dVar) {
                Object a10 = this.f31513a.a(new a(gVar), dVar);
                return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(xl.d<? super e> dVar) {
            super(2, dVar);
            b.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super f1<? extends Long>> dVar) {
            return ((e) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new e(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f31510e;
            if (i10 != 0) {
                if (i10 == 1) {
                    mf.a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                mf.a0.k(obj);
                b bVar = b.this;
                k0 k0Var = new k0(new a(null), new C0580b(bVar.D(bVar.f31482a).getData()));
                e0 e0Var = b.this.f31483b;
                this.f31510e = 1;
                obj = bi.r.L(k0Var, e0Var, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.GlobalStorageImpl", f = "GlobalStorageImpl.kt", l = {258, 269}, m = "insertAuthInfo")
    /* loaded from: classes2.dex */
    public static final class f extends zl.c {

        /* renamed from: d */
        public b f31518d;

        /* renamed from: e */
        public long f31519e;

        /* renamed from: f */
        public /* synthetic */ Object f31520f;

        /* renamed from: h */
        public int f31522h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(xl.d<? super f> dVar) {
            super(dVar);
            b.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f31520f = obj;
            this.f31522h |= Integer.MIN_VALUE;
            return b.this.y(0L, 0, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.GlobalStorageImpl$insertAuthInfo$4", f = "GlobalStorageImpl.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends zl.i implements fm.p<v1.a, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f31523e;

        /* renamed from: f */
        public final /* synthetic */ long f31524f;

        /* renamed from: g */
        public final /* synthetic */ int f31525g;

        /* renamed from: h */
        public final /* synthetic */ TokenBean f31526h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(long j10, int i10, TokenBean tokenBean, xl.d<? super g> dVar) {
            super(2, dVar);
            this.f31524f = j10;
            this.f31525g = i10;
            this.f31526h = tokenBean;
        }

        @Override // fm.p
        public final Object A(v1.a aVar, xl.d<? super tl.l> dVar) {
            return ((g) p(aVar, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            g gVar = new g(this.f31524f, this.f31525g, this.f31526h, dVar);
            gVar.f31523e = obj;
            return gVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            long j10;
            String str;
            mf.a0.k(obj);
            v1.a aVar = (v1.a) this.f31523e;
            d.a<Long> aVar2 = a.f31488a;
            aVar.d(a.f31488a, new Long(this.f31524f));
            aVar.d(a.f31489b, Boolean.TRUE);
            aVar.d(a.f31490c, new Integer(this.f31525g));
            d.a<Long> aVar3 = a.f31491d;
            TokenBean tokenBean = this.f31526h;
            long j11 = 0;
            if (tokenBean != null) {
                j10 = tokenBean.f9813e;
            } else {
                j10 = 0;
            }
            aVar.d(aVar3, new Long(j10));
            d.a<String> aVar4 = a.f31492e;
            TokenBean tokenBean2 = this.f31526h;
            String str2 = "";
            aVar.d(aVar4, (tokenBean2 == null || (r1 = tokenBean2.f9809a) == null) ? "" : "");
            d.a<String> aVar5 = a.f31493f;
            TokenBean tokenBean3 = this.f31526h;
            if (tokenBean3 != null && (str = tokenBean3.f9811c) != null) {
                str2 = str;
            }
            aVar.d(aVar5, str2);
            d.a<Long> aVar6 = a.f31494g;
            TokenBean tokenBean4 = this.f31526h;
            if (tokenBean4 != null) {
                j11 = tokenBean4.f9814f;
            }
            aVar.d(aVar6, new Long(j11));
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.GlobalStorageImpl", f = "GlobalStorageImpl.kt", l = {62}, m = "isPolicyAgreed")
    /* loaded from: classes2.dex */
    public static final class h extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f31527d;

        /* renamed from: f */
        public int f31529f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(xl.d<? super h> dVar) {
            super(dVar);
            b.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f31527d = obj;
            this.f31529f |= Integer.MIN_VALUE;
            return b.this.l(this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.GlobalStorageImpl", f = "GlobalStorageImpl.kt", l = {288}, m = "queryAuthInfo")
    /* loaded from: classes2.dex */
    public static final class i extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f31530d;

        /* renamed from: f */
        public int f31532f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(xl.d<? super i> dVar) {
            super(dVar);
            b.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f31530d = obj;
            this.f31532f |= Integer.MIN_VALUE;
            return b.this.w(this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.GlobalStorageImpl$setAppUpgradeIgnore$2", f = "GlobalStorageImpl.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends zl.i implements fm.p<v1.a, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f31533e;

        public j(xl.d<? super j> dVar) {
            super(2, dVar);
        }

        @Override // fm.p
        public final Object A(v1.a aVar, xl.d<? super tl.l> dVar) {
            return ((j) p(aVar, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            j jVar = new j(dVar);
            jVar.f31533e = obj;
            return jVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            mf.a0.k(obj);
            d.a<Integer> aVar = C0579b.f31496a;
            ((v1.a) this.f31533e).d(C0579b.f31499d, Boolean.TRUE);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.GlobalStorageImpl$setAssistEnabled$2", f = "GlobalStorageImpl.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k extends zl.i implements fm.p<v1.a, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f31534e;

        /* renamed from: f */
        public final /* synthetic */ boolean f31535f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(boolean z10, xl.d<? super k> dVar) {
            super(2, dVar);
            this.f31535f = z10;
        }

        @Override // fm.p
        public final Object A(v1.a aVar, xl.d<? super tl.l> dVar) {
            return ((k) p(aVar, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            k kVar = new k(this.f31535f, dVar);
            kVar.f31534e = obj;
            return kVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            mf.a0.k(obj);
            d.a<Integer> aVar = C0579b.f31496a;
            ((v1.a) this.f31534e).d(C0579b.f31497b, Boolean.valueOf(this.f31535f));
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.GlobalStorageImpl$setPolicyAgreed$2", f = "GlobalStorageImpl.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class l extends zl.i implements fm.p<v1.a, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f31536e;

        /* renamed from: f */
        public final /* synthetic */ boolean f31537f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(boolean z10, xl.d<? super l> dVar) {
            super(2, dVar);
            this.f31537f = z10;
        }

        @Override // fm.p
        public final Object A(v1.a aVar, xl.d<? super tl.l> dVar) {
            return ((l) p(aVar, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            l lVar = new l(this.f31537f, dVar);
            lVar.f31536e = obj;
            return lVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            mf.a0.k(obj);
            d.a<Integer> aVar = C0579b.f31496a;
            ((v1.a) this.f31536e).d(C0579b.f31496a, new Integer(this.f31537f ? 1 : 0));
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.GlobalStorageImpl$updateAuthInfo$2", f = "GlobalStorageImpl.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class m extends zl.i implements fm.p<v1.a, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f31538e;

        /* renamed from: f */
        public final /* synthetic */ long f31539f;

        /* renamed from: g */
        public final /* synthetic */ TokenBean f31540g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(long j10, TokenBean tokenBean, xl.d<? super m> dVar) {
            super(2, dVar);
            this.f31539f = j10;
            this.f31540g = tokenBean;
        }

        @Override // fm.p
        public final Object A(v1.a aVar, xl.d<? super tl.l> dVar) {
            return ((m) p(aVar, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            m mVar = new m(this.f31539f, this.f31540g, dVar);
            mVar.f31538e = obj;
            return mVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            mf.a0.k(obj);
            v1.a aVar = (v1.a) this.f31538e;
            d.a<Long> aVar2 = a.f31488a;
            Long l10 = (Long) aVar.b(a.f31488a);
            long j10 = this.f31539f;
            if (l10 != null && l10.longValue() == j10 && gm.l.a(aVar.b(a.f31489b), Boolean.TRUE)) {
                aVar.d(a.f31492e, this.f31540g.f9809a);
                aVar.d(a.f31493f, this.f31540g.f9811c);
                aVar.d(a.f31494g, new Long(this.f31540g.f9814f));
                return tl.l.f28297a;
            }
            throw new ig.b();
        }
    }

    static {
        gm.v vVar = new gm.v(b.class, "globalDataStore", "getGlobalDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        gm.b0.f15488a.getClass();
        f31481g = new mm.h[]{vVar};
    }

    public b(Context context, e0 e0Var, e0 e0Var2, h0 h0Var) {
        gm.l.f(e0Var, "applicationScope");
        gm.l.f(e0Var2, "applicationIoScope");
        gm.l.f(h0Var, "moshi");
        this.f31482a = context;
        this.f31483b = e0Var;
        this.f31484c = e0Var2;
        this.f31485d = h0Var;
        this.f31486e = n6.a0.m("globalStorage", e0Var2);
        this.f31487f = (f1) z0.n(new e(null));
    }

    public static String E(String str) {
        StringBuilder a10 = android.support.v4.media.d.a("shell_");
        a10.append(om.h.Y(str, ".", ""));
        return a10.toString();
    }

    @Override // yg.j
    public final Object A(xl.d<? super String> dVar) {
        return yg.a.b(D(this.f31482a), a.f31495h, null, dVar);
    }

    @Override // yg.m
    public final Boolean B(String str) {
        boolean z10;
        Context context = this.f31482a;
        String E = E(str);
        gm.l.f(context, "context");
        gm.l.f(E, "filename");
        File file = new File(context.getFilesDir(), android.support.v4.media.a.a("json/", E, ".json"));
        File parentFile = file.getParentFile();
        if (parentFile != null && (parentFile.exists() || parentFile.mkdirs())) {
            z10 = file.exists();
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override // yg.m
    public final yg.f C() {
        return new yg.f(D(this.f31482a).getData());
    }

    public final s1.i<v1.d> D(Context context) {
        return (s1.i) this.f31486e.a(context, f31481g[0]);
    }

    @Override // yg.m
    public final yg.d a() {
        return new yg.d(D(this.f31482a).getData());
    }

    @Override // yg.m
    public final Object b(String str, c.C0611c c0611c) {
        Object a10 = v1.e.a(D(this.f31482a), new yg.h(str, null), c0611c);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }

    @Override // yg.m
    public final Object c(c.a aVar) {
        return yg.a.a(D(this.f31482a), C0579b.f31499d, Boolean.FALSE, aVar);
    }

    @Override // yg.m
    public final Object d(cg.a aVar, xl.d<? super tl.l> dVar) {
        Object c10 = yg.a.c(D(this.f31482a), C0579b.f31504i, aVar.name(), dVar);
        if (c10 == yl.a.COROUTINE_SUSPENDED) {
            return c10;
        }
        return tl.l.f28297a;
    }

    @Override // yg.m
    public final Object e(String str, c.C0611c c0611c) {
        Object a10 = v1.e.a(D(this.f31482a), new yg.g(str, null), c0611c);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }

    @Override // yg.m
    public final Object f(xl.d<? super String> dVar) {
        return yg.a.b(D(this.f31482a), C0579b.f31503h, null, dVar);
    }

    @Override // yg.j
    public final Object g(String str, xl.d<? super tl.l> dVar) {
        Object c10 = yg.a.c(D(this.f31482a), a.f31495h, str, dVar);
        if (c10 == yl.a.COROUTINE_SUSPENDED) {
            return c10;
        }
        return tl.l.f28297a;
    }

    @Override // yg.j
    public final f1<Long> h() {
        return this.f31487f;
    }

    @Override // yg.m
    public final Object i(boolean z10, xl.d<? super tl.l> dVar) {
        Object a10 = v1.e.a(D(this.f31482a), new k(z10, null), dVar);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.nio.channels.spi.AbstractInterruptibleChannel] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.nio.channels.spi.AbstractInterruptibleChannel, java.nio.channels.FileChannel] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Override // yg.m
    public final Object j(String str) {
        FileInputStream fileInputStream;
        FileLock fileLock;
        Object obj;
        mf.t b10 = this.f31485d.b(l0.d(List.class, DeviceShellSpecify.class));
        Context context = this.f31482a;
        String E = E(str);
        gm.l.f(context, "context");
        gm.l.f(E, "filename");
        synchronized (E) {
            ?? n10 = o8.b.n(context, E);
            FileLock fileLock2 = null;
            obj = null;
            obj = null;
            obj = null;
            ?? r32 = 0;
            fileLock2 = null;
            fileLock2 = null;
            try {
                try {
                    fileInputStream = new FileInputStream((File) n10);
                    try {
                        n10 = fileInputStream.getChannel();
                        try {
                            fileLock = n10.lock(0L, Long.MAX_VALUE, true);
                            try {
                                byte[] bArr = new byte[DfuBaseService.ERROR_REMOTE_TYPE_SECURE];
                                gm.z zVar = new gm.z();
                                String str2 = "";
                                while (true) {
                                    int read = fileInputStream.read(bArr);
                                    zVar.f15508a = read;
                                    if (read == -1) {
                                        break;
                                    }
                                    str2 = str2 + new String(bArr, 0, zVar.f15508a, om.a.f23623a);
                                }
                                try {
                                    if (!(str2.length() == 0)) {
                                        obj = b10.a(str2);
                                        if (fileLock != null) {
                                            fileLock.close();
                                        }
                                    } else if (fileLock != null) {
                                        fileLock.close();
                                    }
                                    n10.close();
                                    fileInputStream.close();
                                } catch (Exception unused) {
                                }
                            } catch (Exception e10) {
                                e = e10;
                                r32 = n10;
                                a.b bVar = p000do.a.f13275a;
                                bVar.t("FileJsonExt");
                                bVar.r(e, "read from file %s failed", E);
                                throw e;
                            } catch (Throwable th2) {
                                th = th2;
                                fileLock2 = fileLock;
                                if (fileLock2 != null) {
                                    try {
                                        fileLock2.close();
                                    } catch (Exception unused2) {
                                        throw th;
                                    }
                                }
                                if (n10 != 0) {
                                    n10.close();
                                }
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                throw th;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            fileLock = null;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        fileLock = null;
                    } catch (Throwable th3) {
                        th = th3;
                        n10 = 0;
                    }
                } catch (Exception e13) {
                    e = e13;
                } catch (Throwable th4) {
                    th = th4;
                    n10 = 0;
                    fileInputStream = null;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
        return obj;
    }

    @Override // yg.j
    public final Object k(b.f fVar) {
        return yg.a.b(D(this.f31482a), a.f31488a, null, fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0053  */
    @Override // yg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(xl.d<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof yg.b.h
            if (r0 == 0) goto L13
            r0 = r7
            yg.b$h r0 = (yg.b.h) r0
            int r1 = r0.f31529f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31529f = r1
            goto L18
        L13:
            yg.b$h r0 = new yg.b$h
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f31527d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f31529f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            mf.a0.k(r7)
            goto L4b
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L30:
            mf.a0.k(r7)
            android.content.Context r7 = r6.f31482a
            s1.i r7 = r6.D(r7)
            v1.d$a<java.lang.Integer> r2 = yg.b.C0579b.f31496a
            v1.d$a<java.lang.Integer> r2 = yg.b.C0579b.f31496a
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r3)
            r0.f31529f = r4
            java.lang.Object r7 = yg.a.a(r7, r2, r5, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r7 < r4) goto L54
            r3 = 1
        L54:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.b.l(xl.d):java.lang.Object");
    }

    @Override // yg.m
    public final Object m(String str, xl.d<? super tl.l> dVar) {
        Object c10 = yg.a.c(D(this.f31482a), C0579b.f31503h, str, dVar);
        if (c10 == yl.a.COROUTINE_SUSPENDED) {
            return c10;
        }
        return tl.l.f28297a;
    }

    @Override // yg.j
    public final Object n(zl.c cVar) {
        return yg.a.a(D(this.f31482a), a.f31490c, new Integer(3), cVar);
    }

    @Override // yg.m
    public final yg.e o() {
        return new yg.e(D(this.f31482a).getData());
    }

    @Override // yg.m
    public final Object p(boolean z10, xl.d<? super tl.l> dVar) {
        Object a10 = v1.e.a(D(this.f31482a), new l(z10, null), dVar);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0099 A[Catch: Exception -> 0x00a1, all -> 0x00a2, TryCatch #2 {, blocks: (B:62:0x0025, B:72:0x0061, B:73:0x0064, B:93:0x0094, B:95:0x0099, B:97:0x009e, B:98:0x00a1), top: B:106:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x009e A[Catch: Exception -> 0x00a1, all -> 0x00a2, TRY_LEAVE, TryCatch #2 {, blocks: (B:62:0x0025, B:72:0x0061, B:73:0x0064, B:93:0x0094, B:95:0x0099, B:97:0x009e, B:98:0x00a1), top: B:106:0x0025 }] */
    @Override // yg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final tl.l q(java.lang.String r10, java.util.List r11) {
        /*
            r9 = this;
            java.lang.Class<java.util.List> r0 = java.util.List.class
            r1 = 1
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r1]
            java.lang.Class<com.topstep.fitcloud.pro.model.device.DeviceShellSpecify> r3 = com.topstep.fitcloud.pro.model.device.DeviceShellSpecify.class
            r4 = 0
            r2[r4] = r3
            nf.b$b r0 = mf.l0.d(r0, r2)
            mf.h0 r2 = r9.f31485d
            mf.t r0 = r2.b(r0)
            android.content.Context r2 = r9.f31482a
            java.lang.String r10 = E(r10)
            java.lang.String r3 = "context"
            gm.l.f(r2, r3)
            java.lang.String r3 = "filename"
            gm.l.f(r10, r3)
            monitor-enter(r10)
            java.io.File r2 = o8.b.n(r2, r10)     // Catch: java.lang.Throwable -> La2
            r3 = 0
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7b
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7b
            java.nio.channels.FileChannel r2 = r5.getChannel()     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L75
            java.nio.channels.FileLock r3 = r2.lock()     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L70
            if (r11 != 0) goto L4a
            java.lang.String r0 = ""
            java.nio.charset.Charset r6 = om.a.f23623a     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L70
            byte[] r0 = r0.getBytes(r6)     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L70
            java.lang.String r6 = "this as java.lang.String).getBytes(charset)"
            gm.l.e(r0, r6)     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L70
            r5.write(r0)     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L70
            goto L5c
        L4a:
            java.lang.String r0 = r0.e(r11)     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L70
            java.nio.charset.Charset r6 = om.a.f23623a     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L70
            byte[] r0 = r0.getBytes(r6)     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L70
            java.lang.String r6 = "this as java.lang.String).getBytes(charset)"
            gm.l.e(r0, r6)     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L70
            r5.write(r0)     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L70
        L5c:
            r5.flush()     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L70
            if (r3 == 0) goto L64
            r3.close()     // Catch: java.lang.Exception -> L6a java.lang.Throwable -> La2
        L64:
            r2.close()     // Catch: java.lang.Exception -> L6a java.lang.Throwable -> La2
            r5.close()     // Catch: java.lang.Exception -> L6a java.lang.Throwable -> La2
        L6a:
            monitor-exit(r10)
            tl.l r10 = tl.l.f28297a
            return r10
        L6e:
            r11 = move-exception
            goto L92
        L70:
            r0 = move-exception
            goto L7e
        L72:
            r11 = move-exception
            r2 = r3
            goto L92
        L75:
            r0 = move-exception
            goto L7d
        L77:
            r11 = move-exception
            r2 = r3
            r5 = r2
            goto L92
        L7b:
            r0 = move-exception
            r5 = r3
        L7d:
            r2 = r3
        L7e:
            do.a$b r6 = p000do.a.f13275a     // Catch: java.lang.Throwable -> L6e
            java.lang.String r7 = "FileJsonExt"
            r6.t(r7)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r7 = "write %s to file %s failed"
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L6e
            r8[r4] = r11     // Catch: java.lang.Throwable -> L6e
            r8[r1] = r10     // Catch: java.lang.Throwable -> L6e
            r6.r(r0, r7, r8)     // Catch: java.lang.Throwable -> L6e
            throw r0     // Catch: java.lang.Throwable -> L6e
        L92:
            if (r3 == 0) goto L97
            r3.close()     // Catch: java.lang.Exception -> La1 java.lang.Throwable -> La2
        L97:
            if (r2 == 0) goto L9c
            r2.close()     // Catch: java.lang.Exception -> La1 java.lang.Throwable -> La2
        L9c:
            if (r5 == 0) goto La1
            r5.close()     // Catch: java.lang.Exception -> La1 java.lang.Throwable -> La2
        La1:
            throw r11     // Catch: java.lang.Throwable -> La2
        La2:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.b.q(java.lang.String, java.util.List):tl.l");
    }

    @Override // yg.m
    public final Object r(long j10, c.C0611c c0611c) {
        Object a10 = v1.e.a(D(this.f31482a), new yg.i(j10, null), c0611c);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }

    @Override // yg.m
    public final Object s(c.a aVar) {
        return yg.a.a(D(this.f31482a), C0579b.f31502g, new Long(0L), aVar);
    }

    @Override // yg.m
    public final Object t(c.a aVar) {
        return yg.a.a(D(this.f31482a), C0579b.f31501f, Boolean.FALSE, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0079 A[RETURN] */
    @Override // yg.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u(xl.d<? super tl.l> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof yg.b.c
            if (r0 == 0) goto L13
            r0 = r10
            yg.b$c r0 = (yg.b.c) r0
            int r1 = r0.f31508g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31508g = r1
            goto L18
        L13:
            yg.b$c r0 = new yg.b$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f31506e
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f31508g
            r3 = 0
            java.lang.String r4 = "globalStorage"
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L3c
            if (r2 == r6) goto L36
            if (r2 != r5) goto L2e
            mf.a0.k(r10)
            goto L7a
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L36:
            yg.b r2 = r0.f31505d
            mf.a0.k(r10)
            goto L62
        L3c:
            mf.a0.k(r10)
            do.a$b r10 = p000do.a.f13275a
            r10.t(r4)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r8 = "deleteAuthInfo"
            r10.h(r8, r2)
            android.content.Context r10 = r9.f31482a
            s1.i r10 = r9.D(r10)
            yg.b$d r2 = new yg.b$d
            r2.<init>(r7)
            r0.f31505d = r9
            r0.f31508g = r6
            java.lang.Object r10 = v1.e.a(r10, r2, r0)
            if (r10 != r1) goto L61
            return r1
        L61:
            r2 = r9
        L62:
            r0.f31505d = r7
            r0.f31508g = r5
            r2.getClass()
            yg.c r10 = new yg.c
            r10.<init>(r2, r7, r7)
            java.lang.Object r10 = bi.r.s(r10, r0)
            if (r10 != r1) goto L75
            goto L77
        L75:
            tl.l r10 = tl.l.f28297a
        L77:
            if (r10 != r1) goto L7a
            return r1
        L7a:
            do.a$b r10 = p000do.a.f13275a
            r10.t(r4)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r1 = "awaitAuthedUserId finish"
            r10.h(r1, r0)
            tl.l r10 = tl.l.f28297a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.b.u(xl.d):java.lang.Object");
    }

    @Override // yg.j
    public final Object v(long j10, TokenBean tokenBean, xl.d<? super tl.l> dVar) {
        a.b bVar = p000do.a.f13275a;
        bVar.t("globalStorage");
        bVar.h("updateAuthInfo userId:%d", new Long(j10));
        Object a10 = v1.e.a(D(this.f31482a), new m(j10, tokenBean, null), dVar);
        if (a10 == yl.a.COROUTINE_SUSPENDED) {
            return a10;
        }
        return tl.l.f28297a;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x006c  */
    @Override // yg.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object w(xl.d<? super pg.a> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof yg.b.i
            if (r0 == 0) goto L13
            r0 = r13
            yg.b$i r0 = (yg.b.i) r0
            int r1 = r0.f31532f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31532f = r1
            goto L18
        L13:
            yg.b$i r0 = new yg.b$i
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f31530d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f31532f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            mf.a0.k(r13)
            goto L45
        L27:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L2f:
            mf.a0.k(r13)
            android.content.Context r13 = r12.f31482a
            s1.i r13 = r12.D(r13)
            sm.f r13 = r13.getData()
            r0.f31532f = r3
            java.lang.Object r13 = bi.r.w(r13, r0)
            if (r13 != r1) goto L45
            return r1
        L45:
            v1.d r13 = (v1.d) r13
            v1.d$a<java.lang.Long> r0 = yg.b.a.f31488a
            java.lang.Object r0 = r13.b(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            r1 = 0
            if (r0 == 0) goto La9
            long r2 = r0.longValue()
            boolean r2 = hh.b.g(r2)
            if (r2 != 0) goto L5d
            goto La9
        L5d:
            v1.d$a<java.lang.Boolean> r2 = yg.b.a.f31489b
            java.lang.Object r2 = r13.b(r2)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r2 = gm.l.a(r2, r3)
            if (r2 != 0) goto L6c
            return r1
        L6c:
            pg.a r1 = new pg.a
            long r4 = r0.longValue()
            v1.d$a<java.lang.Long> r0 = yg.b.a.f31491d
            java.lang.Object r0 = r13.b(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            r2 = 0
            if (r0 == 0) goto L83
            long r6 = r0.longValue()
            goto L84
        L83:
            r6 = r2
        L84:
            v1.d$a<java.lang.String> r0 = yg.b.a.f31492e
            java.lang.Object r0 = r13.b(r0)
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            v1.d$a<java.lang.String> r0 = yg.b.a.f31493f
            java.lang.Object r0 = r13.b(r0)
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9
            v1.d$a<java.lang.Long> r0 = yg.b.a.f31494g
            java.lang.Object r13 = r13.b(r0)
            java.lang.Long r13 = (java.lang.Long) r13
            if (r13 == 0) goto La4
            long r2 = r13.longValue()
        La4:
            r10 = r2
            r3 = r1
            r3.<init>(r4, r6, r8, r9, r10)
        La9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.b.w(xl.d):java.lang.Object");
    }

    @Override // yg.m
    public final Object x(xl.d<? super tl.l> dVar) {
        Object a10 = v1.e.a(D(this.f31482a), new j(null), dVar);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ce A[RETURN] */
    @Override // yg.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object y(long r18, int r20, com.topstep.fitcloud.pro.shared.data.bean.TokenBean r21, xl.d<? super tl.l> r22) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.b.y(long, int, com.topstep.fitcloud.pro.shared.data.bean.TokenBean, xl.d):java.lang.Object");
    }

    @Override // yg.m
    public final Object z(xl.d<? super Boolean> dVar) {
        return yg.a.a(D(this.f31482a), C0579b.f31497b, Boolean.FALSE, dVar);
    }
}
