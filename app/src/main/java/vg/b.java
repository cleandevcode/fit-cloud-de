package vg;

import android.annotation.SuppressLint;
import bi.z0;
import cn.sharesdk.framework.InnerShareParams;
import com.topstep.fitcloud.pro.shared.data.bean.TokenBean;
import fm.p;
import java.io.IOException;
import java.util.List;
import mf.h0;
import mf.l0;
import p000do.a;
import pm.e0;
import ul.s;
import zm.a0;
import zm.q;
import zm.r;
import zm.w;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a */
    public final e0 f29330a;

    /* renamed from: b */
    public final yg.j f29331b;

    /* renamed from: c */
    public final h0 f29332c;

    /* renamed from: d */
    public final hg.a f29333d;

    /* renamed from: e */
    public final String f29334e;

    /* renamed from: f */
    public final String f29335f;

    /* renamed from: g */
    public final String f29336g;

    /* renamed from: h */
    public volatile String f29337h;

    /* renamed from: i */
    public final vg.d f29338i;

    /* loaded from: classes2.dex */
    public final class a implements r {
        public a() {
            b.this = r1;
        }

        @Override // zm.r
        public final a0 a(en.g gVar) {
            boolean z10;
            String str;
            Long l10;
            TokenBean tokenBean;
            String str2;
            boolean z11;
            w wVar = gVar.f13856f;
            wVar.getClass();
            w.a aVar = new w.a(wVar);
            String str3 = b.this.f29334e;
            if (str3 != null) {
                if (str3.length() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    aVar.f32758c.d("User-Agent");
                    String str4 = b.this.f29334e;
                    gm.l.f(str4, "value");
                    aVar.f32758c.a("User-Agent", str4);
                }
            }
            String str5 = b.this.f29335f;
            if (str5 != null && str5.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                String str6 = b.this.f29335f;
                gm.l.f(str6, "value");
                aVar.f32758c.a("X-App-Name", str6);
            }
            String str7 = wVar.f32751b.f32666j;
            String str8 = b.this.f29336g;
            gm.l.f(str7, InnerShareParams.URL);
            gm.l.f(str8, "baseUrl");
            int h02 = om.l.h0(str7, str8, 0, false, 6);
            if (h02 != -1) {
                str = str7.substring(str8.length() + h02, str7.length());
                gm.l.e(str, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                str = null;
            }
            C0530b c0530b = new C0530b(str7, str);
            String str9 = b.this.f29337h;
            if (str9 == null) {
                str9 = b.this.f29336g;
            }
            c0530b.a(aVar, str9);
            String e10 = wVar.f32753d.e("userId");
            if (e10 != null) {
                l10 = om.g.T(e10);
            } else {
                l10 = null;
            }
            if (l10 != null) {
                aVar.f32758c.d("userId");
                try {
                    return b(l10.longValue(), gVar, aVar, c0530b);
                } catch (Exception e11) {
                    throw e11;
                }
            }
            a0 c10 = gVar.c(aVar.a());
            if (om.l.c0(c0530b.f29341b, "/auth/login", false) || om.l.c0(c0530b.f29341b, "/auth/login2", false) || om.l.c0(c0530b.f29341b, "/auth/register ", false) || om.l.c0(c0530b.f29341b, "/auth/refreshToken", false)) {
                String a10 = g.a(c10);
                a.b bVar = p000do.a.f13275a;
                bVar.t("ApiClient");
                bVar.n("process token response : " + a10, new Object[0]);
                try {
                    k kVar = (k) b.this.f29332c.b(l0.d(k.class, TokenBean.class)).a(a10);
                    if (kVar != null) {
                        tokenBean = (TokenBean) kVar.f29381c;
                    } else {
                        tokenBean = null;
                    }
                    if (tokenBean != null && (str2 = tokenBean.f9812d) != null) {
                        b bVar2 = b.this;
                        if (!gm.l.a(str2, bVar2.f29336g)) {
                            bVar2.f29337h = str2;
                            bVar.t("ApiClient");
                            bVar.b("base url changed:" + str2, new Object[0]);
                        }
                        z0.n(new vg.a(b.this, str2, null));
                        return c10;
                    }
                    return c10;
                } catch (IOException e12) {
                    throw e12;
                } catch (Exception e13) {
                    throw new IOException(e13);
                }
            }
            return c10;
        }

        @SuppressLint({"CheckResult"})
        public final a0 b(long j10, en.g gVar, w.a aVar, C0530b c0530b) {
            ig.c cVar;
            pg.a c10 = yg.l.c(b.this.f29331b, j10);
            if (System.currentTimeMillis() > c10.f24018e) {
                b.this.a(c10);
                c10 = yg.l.c(b.this.f29331b, j10);
                String str = b.this.f29337h;
                if (str == null) {
                    str = b.this.f29336g;
                }
                c0530b.a(aVar, str);
            }
            String str2 = c10.f24016c;
            gm.l.c(str2);
            aVar.b("Authorization", e.c(str2));
            a0 c11 = gVar.c(aVar.a());
            if (c11.f32532d == 401) {
                try {
                    b.this.f29332c.a(f.class).a(g.a(c11));
                    cVar = new ig.c(1008, null);
                } catch (Exception e10) {
                    if (e10 instanceof ig.c) {
                        cVar = (ig.c) e10;
                    } else {
                        cVar = new ig.c(1008, null);
                    }
                }
                if (cVar.f16819a == 1002) {
                    b.this.a(c10);
                    pg.a c12 = yg.l.c(b.this.f29331b, j10);
                    String str3 = b.this.f29337h;
                    if (str3 == null) {
                        str3 = b.this.f29336g;
                    }
                    c0530b.a(aVar, str3);
                    String str4 = c12.f24016c;
                    gm.l.c(str4);
                    aVar.b("Authorization", e.c(str4));
                    return gVar.c(aVar.a());
                }
                throw new ig.a(0);
            }
            return c11;
        }
    }

    /* renamed from: vg.b$b */
    /* loaded from: classes2.dex */
    public static final class C0530b {

        /* renamed from: a */
        public final String f29340a;

        /* renamed from: b */
        public String f29341b;

        public C0530b(String str, String str2) {
            this.f29340a = str2;
            this.f29341b = str;
        }

        public final void a(w.a aVar, String str) {
            gm.l.f(str, "baseUrl");
            if (this.f29340a != null && !om.h.a0(this.f29341b, str, false)) {
                StringBuilder a10 = android.support.v4.media.d.a(str);
                a10.append(this.f29340a);
                String sb2 = a10.toString();
                this.f29341b = sb2;
                aVar.e(sb2);
                a.b bVar = p000do.a.f13275a;
                bVar.t("ApiClient");
                bVar.b("intercept replace url " + this.f29341b, new Object[0]);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements zm.j {

        /* renamed from: b */
        public List<zm.i> f29342b;

        @Override // zm.j
        public final List<zm.i> a(q qVar) {
            gm.l.f(qVar, InnerShareParams.URL);
            List<zm.i> list = this.f29342b;
            if (list == null) {
                return s.f28879a;
            }
            String str = qVar.f32666j;
            if (!om.h.U(str, "/auth/register ", false) && !om.h.U(str, "/auth/resetPassword ", false) && !om.h.U(str, "/user/rebind", false)) {
                return s.f28879a;
            }
            return list;
        }

        @Override // zm.j
        public final void b(q qVar, List<zm.i> list) {
            gm.l.f(qVar, InnerShareParams.URL);
            if (om.h.U(qVar.f32666j, "/auth/requestAuthCode ", false)) {
                this.f29342b = list;
            }
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.net.ApiClient$refreshToken$1$1", f = "ApiClient.kt", l = {270}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f29343e;

        /* renamed from: g */
        public final /* synthetic */ pg.a f29345g;

        /* renamed from: h */
        public final /* synthetic */ TokenBean f29346h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(pg.a aVar, TokenBean tokenBean, xl.d<? super d> dVar) {
            super(2, dVar);
            b.this = r1;
            this.f29345g = aVar;
            this.f29346h = tokenBean;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((d) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new d(this.f29345g, this.f29346h, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f29343e;
            if (i10 != 0) {
                if (i10 == 1) {
                    mf.a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                mf.a0.k(obj);
                yg.j jVar = b.this.f29331b;
                long j10 = this.f29345g.f24014a;
                TokenBean tokenBean = this.f29346h;
                this.f29343e = 1;
                if (jVar.v(j10, tokenBean, this) == aVar) {
                    return aVar;
                }
            }
            return tl.l.f28297a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x0118, code lost:
        if (r10 == null) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(android.content.Context r10, pm.e0 r11, yg.b r12, mf.h0 r13, hg.a r14, mf.a0 r15) {
        /*
            Method dump skipped, instructions count: 673
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vg.b.<init>(android.content.Context, pm.e0, yg.b, mf.h0, hg.a, mf.a0):void");
    }

    public final void a(pg.a aVar) {
        boolean z10;
        synchronized (this) {
            yg.j jVar = this.f29331b;
            gm.l.f(jVar, "<this>");
            pg.a aVar2 = (pg.a) z0.n(new yg.k(jVar, null));
            if (aVar2 != null && aVar2.f24014a == aVar.f24014a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (gm.l.a(aVar2, aVar)) {
                    try {
                        vg.d dVar = this.f29338i;
                        String str = aVar.f24017d;
                        gm.l.c(str);
                        k<TokenBean> kVar = dVar.W(str).execute().f3792b;
                        gm.l.c(kVar);
                        z0.n(new d(aVar, kVar.f29381c, null));
                    } catch (ig.b e10) {
                        throw e10;
                    } catch (Exception unused) {
                        throw new ig.a(1);
                    }
                }
                tl.l lVar = tl.l.f28297a;
            } else {
                throw new ig.b();
            }
        }
    }
}
