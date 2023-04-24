package com.topstep.fitcloud.pro.ui;

import a5.k;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.r;
import androidx.lifecycle.t0;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import bi.z0;
import cn.sharesdk.framework.InnerShareParams;
import com.bumptech.glide.n;
import com.github.kilnn.tool.widget.item.PreferenceItem;
import com.topstep.fitcloud.pro.databinding.FragmentMineBinding;
import com.topstep.fitcloud.pro.ui.auth.AuthActivity;
import com.topstep.fitcloudpro.R;
import d2.a;
import fm.l;
import fm.p;
import gi.d;
import gm.m;
import gm.t;
import i2.b0;
import ih.a0;
import ih.o;
import ih.v;
import java.util.Locale;
import kotlin.Metadata;
import pm.e0;
import s.r0;
import sm.s0;
import y0.a;
import zl.i;

@Metadata
/* loaded from: classes2.dex */
public final class MineFragment extends o<String> implements d.a {

    /* renamed from: z0 */
    public static final /* synthetic */ mm.h<Object>[] f10260z0;

    /* renamed from: u0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f10261u0;

    /* renamed from: v0 */
    public final t0 f10262v0;

    /* renamed from: w0 */
    public long f10263w0;

    /* renamed from: x0 */
    public int f10264x0;

    /* renamed from: y0 */
    public final a f10265y0;

    /* loaded from: classes2.dex */
    public static final class a extends m implements l<View, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            MineFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(View view) {
            i2.m f10;
            i2.a aVar;
            View view2 = view;
            gm.l.f(view2, "view");
            MineFragment mineFragment = MineFragment.this;
            mm.h<Object>[] hVarArr = MineFragment.f10260z0;
            if (gm.l.a(view2, mineFragment.j1().itemUser)) {
                f10 = tb.a.f(MineFragment.this);
                aVar = new i2.a(R.id.toEditUser);
            } else if (gm.l.a(view2, MineFragment.this.j1().itemFriends)) {
                if (!hh.b.f(MineFragment.this.g1().f10287h)) {
                    f10 = tb.a.f(MineFragment.this);
                    aVar = new i2.a(R.id.toFriend);
                }
                int i10 = AuthActivity.f10303x;
                AuthActivity.a.a(MineFragment.this.V0());
                return tl.l.f28297a;
            } else {
                if (!gm.l.a(view2, MineFragment.this.j1().btnSignIn)) {
                    if (gm.l.a(view2, MineFragment.this.j1().itemUnit)) {
                        f10 = tb.a.f(MineFragment.this);
                        aVar = new i2.a(R.id.toUnit);
                    } else {
                        try {
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                        if (gm.l.a(view2, MineFragment.this.j1().itemFaq)) {
                            i2.m f11 = tb.a.f(MineFragment.this);
                            Locale b10 = f7.e.b(MineFragment.this.V0());
                            String language = b10.getLanguage();
                            String str = "es";
                            if (gm.l.a(language, Locale.CHINESE.getLanguage())) {
                                if (h7.a.o(b10)) {
                                    str = "cn";
                                } else {
                                    str = "zh";
                                }
                            } else if (!gm.l.a(language, "es")) {
                                str = "en";
                            }
                            String str2 = "https://fitcloud.hetangsmart.com/oss/static/fitcloudpro/faq/index_" + str + ".html";
                            gm.l.f(str2, InnerShareParams.URL);
                            b0 a10 = v.d().a();
                            Bundle bundle = new Bundle();
                            bundle.putInt(InnerShareParams.TITLE, R.string.faq_module);
                            bundle.putString(InnerShareParams.URL, str2);
                            f11.l(R.id.toWebView, bundle, a10);
                        } else if (gm.l.a(view2, MineFragment.this.j1().itemSettings)) {
                            f10 = tb.a.f(MineFragment.this);
                            aVar = new i2.a(R.id.toSettings);
                        } else {
                            if (gm.l.a(view2, MineFragment.this.j1().itemWechat)) {
                                if (MineFragment.this.V0().getPackageManager().getLaunchIntentForPackage("com.tencent.mm") == null) {
                                    d7.e.f(MineFragment.this.f1(), R.string.account_no_app);
                                } else {
                                    MineViewModel g12 = MineFragment.this.g1();
                                    g12.getClass();
                                    g12.h(new a0(g12, null), 0L);
                                }
                            } else if (gm.l.a(view2, MineFragment.this.j1().itemFeedback)) {
                                f10 = tb.a.f(MineFragment.this);
                                aVar = new i2.a(R.id.toFeedback);
                            } else if (gm.l.a(view2, MineFragment.this.j1().itemExerciseGoal)) {
                                i2.m f12 = tb.a.f(MineFragment.this);
                                b0 a11 = v.d().a();
                                Bundle bundle2 = new Bundle();
                                bundle2.putBoolean("isAfterFillUser", false);
                                f12.l(R.id.toExerciseGoal, bundle2, a11);
                            } else if (gm.l.a(view2, MineFragment.this.j1().itemAssist)) {
                                f10 = tb.a.f(MineFragment.this);
                                aVar = new i2.a(R.id.toAssist);
                            } else if (gm.l.a(view2, MineFragment.this.j1().itemGoogleFit)) {
                                new gi.d().h1(MineFragment.this.h0(), null);
                            } else if (gm.l.a(view2, MineFragment.this.j1().itemWomenHealth)) {
                                si.f fVar = si.f.f27071a;
                                MineFragment mineFragment2 = MineFragment.this;
                                fVar.g(mineFragment2, new r0(9, mineFragment2));
                            }
                            return tl.l.f28297a;
                        }
                        return tl.l.f28297a;
                    }
                }
                int i102 = AuthActivity.f10303x;
                AuthActivity.a.a(MineFragment.this.V0());
                return tl.l.f28297a;
            }
            v.l(f10, aVar);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.MineFragment$onViewCreated$1", f = "MineFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f10267e;

        @zl.e(c = "com.topstep.fitcloud.pro.ui.MineFragment$onViewCreated$1$1", f = "MineFragment.kt", l = {89}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f10269e;

            /* renamed from: f */
            public final /* synthetic */ MineFragment f10270f;

            /* renamed from: com.topstep.fitcloud.pro.ui.MineFragment$b$a$a */
            /* loaded from: classes2.dex */
            public static final class C0131a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ MineFragment f10271a;

                public C0131a(MineFragment mineFragment) {
                    this.f10271a = mineFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    uf.d dVar2 = (uf.d) obj;
                    Context V0 = this.f10271a.V0();
                    String str = dVar2.f28717c;
                    ImageView imageView = this.f10271a.j1().imgAvatar;
                    gm.l.e(imageView, "viewBind.imgAvatar");
                    n<Drawable> x10 = com.bumptech.glide.b.c(V0).b(V0).k(str).x(i5.g.w(R.drawable.ic_user_avatar));
                    x10.getClass();
                    ((n) x10.r(a5.m.f293b, new k())).A(imageView);
                    this.f10271a.j1().tvNickName.setText(dVar2.f28715a);
                    this.f10271a.j1().tvId.setText(qi.h.g(this.f10271a, dVar2.f28718d));
                    PreferenceItem preferenceItem = this.f10271a.j1().itemWomenHealth;
                    gm.l.e(preferenceItem, "viewBind.itemWomenHealth");
                    int i10 = 0;
                    boolean z10 = true;
                    if (dVar2.f28716b != 1) {
                        z10 = false;
                    }
                    if (!z10) {
                        i10 = 8;
                    }
                    preferenceItem.setVisibility(i10);
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MineFragment mineFragment, xl.d<? super a> dVar) {
                super(2, dVar);
                this.f10270f = mineFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                ((a) p(e0Var, dVar)).t(tl.l.f28297a);
                return yl.a.COROUTINE_SUSPENDED;
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new a(this.f10270f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f10269e;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mf.a0.k(obj);
                } else {
                    mf.a0.k(obj);
                    s0 s0Var = this.f10270f.g1().f10293n;
                    C0131a c0131a = new C0131a(this.f10270f);
                    this.f10269e = 1;
                    if (s0Var.a(c0131a, this) == aVar) {
                        return aVar;
                    }
                }
                throw new u2.b();
            }
        }

        @zl.e(c = "com.topstep.fitcloud.pro.ui.MineFragment$onViewCreated$1$2", f = "MineFragment.kt", l = {98}, m = "invokeSuspend")
        /* renamed from: com.topstep.fitcloud.pro.ui.MineFragment$b$b */
        /* loaded from: classes2.dex */
        public static final class C0132b extends i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f10272e;

            /* renamed from: f */
            public final /* synthetic */ MineFragment f10273f;

            /* renamed from: com.topstep.fitcloud.pro.ui.MineFragment$b$b$a */
            /* loaded from: classes2.dex */
            public static final class a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ MineFragment f10274a;

                public a(MineFragment mineFragment) {
                    this.f10274a = mineFragment;
                }

                /* JADX WARN: Removed duplicated region for block: B:54:0x008b  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x008d  */
                /* JADX WARN: Removed duplicated region for block: B:57:0x0090  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x00aa  */
                @Override // sm.g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object n(java.lang.Object r7, xl.d r8) {
                    /*
                        r6 = this;
                        nj.c r7 = (nj.c) r7
                        com.topstep.fitcloud.pro.ui.MineFragment r8 = r6.f10274a
                        com.topstep.fitcloud.pro.ui.MineViewModel r8 = r8.g1()
                        long r0 = r8.f10287h
                        boolean r8 = hh.b.f(r0)
                        r0 = 8
                        r1 = 1
                        r2 = 0
                        java.lang.String r3 = "viewBind.itemWechat"
                        if (r8 != 0) goto L60
                        com.topstep.fitcloud.pro.ui.MineFragment r8 = r6.f10274a
                        android.content.Context r8 = r8.V0()
                        java.util.Locale r8 = f7.e.b(r8)
                        java.lang.String r4 = r8.getLanguage()
                        java.util.Locale r5 = java.util.Locale.CHINESE
                        java.lang.String r5 = r5.getLanguage()
                        boolean r4 = gm.l.a(r4, r5)
                        if (r4 != 0) goto L43
                        java.lang.String r8 = r8.getLanguage()
                        java.util.Locale r4 = java.util.Locale.ENGLISH
                        java.lang.String r4 = r4.getLanguage()
                        boolean r8 = gm.l.a(r8, r4)
                        if (r8 == 0) goto L41
                        goto L43
                    L41:
                        r8 = 0
                        goto L44
                    L43:
                        r8 = 1
                    L44:
                        if (r8 == 0) goto L60
                        com.topstep.fitcloud.pro.ui.MineFragment r8 = r6.f10274a
                        com.topstep.fitcloud.pro.databinding.FragmentMineBinding r8 = r8.j1()
                        com.github.kilnn.tool.widget.item.PreferenceItem r8 = r8.itemWechat
                        gm.l.e(r8, r3)
                        r4 = 7
                        boolean r7 = r7.g(r4)
                        if (r7 == 0) goto L5a
                        r7 = 0
                        goto L5c
                    L5a:
                        r7 = 8
                    L5c:
                        r8.setVisibility(r7)
                        goto L6b
                    L60:
                        com.topstep.fitcloud.pro.ui.MineFragment r7 = r6.f10274a
                        com.topstep.fitcloud.pro.databinding.FragmentMineBinding r7 = r7.j1()
                        com.github.kilnn.tool.widget.item.PreferenceItem r7 = r7.itemWechat
                        r7.setVisibility(r0)
                    L6b:
                        com.topstep.fitcloud.pro.ui.MineFragment r7 = r6.f10274a
                        com.topstep.fitcloud.pro.databinding.FragmentMineBinding r7 = r7.j1()
                        android.widget.LinearLayout r7 = r7.layoutThird
                        java.lang.String r8 = "viewBind.layoutThird"
                        gm.l.e(r7, r8)
                        com.topstep.fitcloud.pro.ui.MineFragment r8 = r6.f10274a
                        com.topstep.fitcloud.pro.databinding.FragmentMineBinding r8 = r8.j1()
                        com.github.kilnn.tool.widget.item.PreferenceItem r8 = r8.itemGoogleFit
                        java.lang.String r4 = "viewBind.itemGoogleFit"
                        gm.l.e(r8, r4)
                        int r8 = r8.getVisibility()
                        if (r8 != 0) goto L8d
                        r8 = 1
                        goto L8e
                    L8d:
                        r8 = 0
                    L8e:
                        if (r8 != 0) goto La8
                        com.topstep.fitcloud.pro.ui.MineFragment r8 = r6.f10274a
                        com.topstep.fitcloud.pro.databinding.FragmentMineBinding r8 = r8.j1()
                        com.github.kilnn.tool.widget.item.PreferenceItem r8 = r8.itemWechat
                        gm.l.e(r8, r3)
                        int r8 = r8.getVisibility()
                        if (r8 != 0) goto La3
                        r8 = 1
                        goto La4
                    La3:
                        r8 = 0
                    La4:
                        if (r8 == 0) goto La7
                        goto La8
                    La7:
                        r1 = 0
                    La8:
                        if (r1 == 0) goto Lab
                        r0 = 0
                    Lab:
                        r7.setVisibility(r0)
                        tl.l r7 = tl.l.f28297a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.MineFragment.b.C0132b.a.n(java.lang.Object, xl.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0132b(MineFragment mineFragment, xl.d<? super C0132b> dVar) {
                super(2, dVar);
                this.f10273f = mineFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                ((C0132b) p(e0Var, dVar)).t(tl.l.f28297a);
                return yl.a.COROUTINE_SUSPENDED;
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new C0132b(this.f10273f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f10272e;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mf.a0.k(obj);
                } else {
                    mf.a0.k(obj);
                    s0 s0Var = this.f10273f.g1().f10294o;
                    a aVar2 = new a(this.f10273f);
                    this.f10272e = 1;
                    if (s0Var.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                throw new u2.b();
            }
        }

        @zl.e(c = "com.topstep.fitcloud.pro.ui.MineFragment$onViewCreated$1$3", f = "MineFragment.kt", l = {109}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class c extends i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f10275e;

            /* renamed from: f */
            public final /* synthetic */ MineFragment f10276f;

            /* loaded from: classes2.dex */
            public static final class a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ MineFragment f10277a;

                public a(MineFragment mineFragment) {
                    this.f10277a = mineFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    ag.a aVar = (ag.a) obj;
                    if (aVar != null && aVar.f464c) {
                        Context V0 = this.f10277a.V0();
                        Object obj2 = y0.a.f30807a;
                        Drawable b10 = a.c.b(V0, R.drawable.shape_badge);
                        gm.l.c(b10);
                        b10.setBounds(0, 0, b10.getIntrinsicWidth(), b10.getIntrinsicHeight());
                        this.f10277a.j1().itemFriends.getImageView().setImageDrawable(b10);
                    } else {
                        MineFragment mineFragment = this.f10277a;
                        mm.h<Object>[] hVarArr = MineFragment.f10260z0;
                        mineFragment.j1().itemFriends.getImageView().setImageDrawable(null);
                    }
                    if (aVar != null && aVar.f462a) {
                        Context V02 = this.f10277a.V0();
                        Object obj3 = y0.a.f30807a;
                        Drawable b11 = a.c.b(V02, R.drawable.shape_badge);
                        gm.l.c(b11);
                        b11.setBounds(0, 0, b11.getIntrinsicWidth(), b11.getIntrinsicHeight());
                        this.f10277a.j1().itemSettings.getImageView().setImageDrawable(b11);
                    } else {
                        MineFragment mineFragment2 = this.f10277a;
                        mm.h<Object>[] hVarArr2 = MineFragment.f10260z0;
                        mineFragment2.j1().itemSettings.getImageView().setImageDrawable(null);
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(MineFragment mineFragment, xl.d<? super c> dVar) {
                super(2, dVar);
                this.f10276f = mineFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                ((c) p(e0Var, dVar)).t(tl.l.f28297a);
                return yl.a.COROUTINE_SUSPENDED;
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new c(this.f10276f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f10275e;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mf.a0.k(obj);
                } else {
                    mf.a0.k(obj);
                    sm.t0 a10 = this.f10276f.g1().f10291l.a();
                    a aVar2 = new a(this.f10276f);
                    this.f10275e = 1;
                    if (a10.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                throw new u2.b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(2, dVar);
            MineFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f10267e = obj;
            return bVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            mf.a0.k(obj);
            e0 e0Var = (e0) this.f10267e;
            z0.g(e0Var, null, 0, new a(MineFragment.this, null), 3);
            z0.g(e0Var, null, 0, new C0132b(MineFragment.this, null), 3);
            z0.g(e0Var, null, 0, new c(MineFragment.this, null), 3);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.MineFragment$onViewCreated$2", f = "MineFragment.kt", l = {128}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public PreferenceItem f10278e;

        /* renamed from: f */
        public int f10279f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(2, dVar);
            MineFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((c) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new c(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            PreferenceItem preferenceItem;
            int i10;
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i11 = this.f10279f;
            if (i11 != 0) {
                if (i11 == 1) {
                    preferenceItem = this.f10278e;
                    mf.a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                mf.a0.k(obj);
                MineFragment mineFragment = MineFragment.this;
                mm.h<Object>[] hVarArr = MineFragment.f10260z0;
                PreferenceItem preferenceItem2 = mineFragment.j1().itemAssist;
                gm.l.e(preferenceItem2, "viewBind.itemAssist");
                MineViewModel g12 = MineFragment.this.g1();
                this.f10278e = preferenceItem2;
                this.f10279f = 1;
                Object z10 = g12.f10290k.z(this);
                if (z10 == aVar) {
                    return aVar;
                }
                preferenceItem = preferenceItem2;
                obj = z10;
            }
            if (((Boolean) obj).booleanValue()) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            preferenceItem.setVisibility(i10);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends m implements fm.a<r> {

        /* renamed from: b */
        public final /* synthetic */ r f10281b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(r rVar) {
            super(0);
            this.f10281b = rVar;
        }

        @Override // fm.a
        public final r m() {
            return this.f10281b;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends m implements fm.a<y0> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f10282b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.f10282b = dVar;
        }

        @Override // fm.a
        public final y0 m() {
            return (y0) this.f10282b.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f10283b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(tl.d dVar) {
            super(0);
            this.f10283b = dVar;
        }

        @Override // fm.a
        public final x0 m() {
            return ih.b.a(this.f10283b, "owner.viewModelStore");
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f10284b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(tl.d dVar) {
            super(0);
            this.f10284b = dVar;
        }

        @Override // fm.a
        public final d2.a m() {
            y0 b10 = ab.b.b(this.f10284b);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            d2.c s10 = iVar != null ? iVar.s() : null;
            return s10 == null ? a.C0214a.f12612b : s10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f10285b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f10286c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(r rVar, tl.d dVar) {
            super(0);
            this.f10285b = rVar;
            this.f10286c = dVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10;
            y0 b10 = ab.b.b(this.f10286c);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            if (iVar == null || (r10 = iVar.r()) == null) {
                r10 = this.f10285b.r();
            }
            gm.l.e(r10, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return r10;
        }
    }

    static {
        t tVar = new t(MineFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentMineBinding;", 0);
        gm.b0.f15488a.getClass();
        f10260z0 = new mm.h[]{tVar};
    }

    public MineFragment() {
        super(R.layout.fragment_mine);
        this.f10261u0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentMineBinding.class, this);
        tl.d a10 = fb.e.a(new e(new d(this)));
        this.f10262v0 = ab.b.f(this, gm.b0.a(MineViewModel.class), new f(a10), new g(a10), new h(this, a10));
        this.f10265y0 = new a();
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0154  */
    @Override // nh.a, lh.c, androidx.fragment.app.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O0(android.view.View r5, android.os.Bundle r6) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.MineFragment.O0(android.view.View, android.os.Bundle):void");
    }

    @Override // gi.d.a
    public final void U() {
        l1(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005f  */
    @Override // nh.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h1(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r0 = "result"
            gm.l.f(r7, r0)
            r0 = 0
            r1 = 1
            java.lang.String r2 = "/"
            r3 = 6
            int r2 = om.l.k0(r7, r2, r3)     // Catch: java.lang.Exception -> L30
            r3 = -1
            if (r2 != r3) goto L14
            goto L36
        L14:
            int r2 = r2 + r1
            java.lang.String r2 = r7.substring(r2)     // Catch: java.lang.Exception -> L30
            java.lang.String r3 = "this as java.lang.String).substring(startIndex)"
            gm.l.e(r2, r3)     // Catch: java.lang.Exception -> L30
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L30
            r3.<init>()     // Catch: java.lang.Exception -> L30
            java.lang.String r4 = "weixin://dl/business/?t="
            r3.append(r4)     // Catch: java.lang.Exception -> L30
            r3.append(r2)     // Catch: java.lang.Exception -> L30
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Exception -> L30
            goto L37
        L30:
            r2 = move-exception
            do.a$b r3 = p000do.a.f13275a
            r3.q(r2)
        L36:
            r2 = r0
        L37:
            do.a$b r3 = p000do.a.f13275a
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r7
            r4[r1] = r2
            java.lang.String r7 = "wechat sport url src:%s dst:%s"
            r3.p(r7, r4)
            if (r2 == 0) goto L50
            int r7 = r2.length()
            if (r7 != 0) goto L4f
            goto L50
        L4f:
            r1 = 0
        L50:
            if (r1 == 0) goto L5f
            d7.e r7 = r6.f1()
            r1 = 2131952205(0x7f13024d, float:1.9540846E38)
            r2 = 30
            d7.e.d(r7, r1, r0, r5, r2)
            goto L70
        L5f:
            android.content.Intent r7 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.VIEW"
            r7.<init>(r0)
            android.net.Uri r0 = android.net.Uri.parse(r2)
            r7.setData(r0)
            r6.b1(r7)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.MineFragment.h1(java.lang.Object):void");
    }

    public final FragmentMineBinding j1() {
        return (FragmentMineBinding) this.f10261u0.a(this, f10260z0[0]);
    }

    @Override // nh.a
    /* renamed from: k1 */
    public final MineViewModel g1() {
        return (MineViewModel) this.f10262v0.getValue();
    }

    public final void l1(boolean z10) {
        if (z10) {
            j1().itemGoogleFit.getTextView().setText(R.string.google_fit_connected);
        } else {
            j1().itemGoogleFit.getTextView().setText((CharSequence) null);
        }
    }
}
