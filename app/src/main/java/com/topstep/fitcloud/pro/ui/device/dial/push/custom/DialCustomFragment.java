package com.topstep.fitcloud.pro.ui.device.dial.push.custom;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.r;
import androidx.fragment.app.x;
import androidx.lifecycle.t0;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import androidx.viewpager2.widget.ViewPager2;
import bi.z0;
import com.github.kilnn.tool.widget.preference.PreferenceRelativeLayout;
import com.topstep.fitcloud.pro.databinding.FragmentDialCustomBinding;
import com.topstep.fitcloud.pro.ui.device.dial.DialPushViewModel;
import com.topstep.fitcloud.pro.ui.widget.LoadingView;
import com.topstep.fitcloud.sdk.v2.utils.dial.a;
import com.topstep.fitcloudpro.R;
import d2.a;
import fm.p;
import gm.b0;
import gm.t;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import mf.a0;
import nh.c;
import pm.e0;
import pm.o0;
import s.i0;
import s.n2;
import tl.l;
import y3.c1;
import y3.d1;
import zh.f;
import zh.i;
import zh.m;
import zh.n;

@Metadata
/* loaded from: classes2.dex */
public final class DialCustomFragment extends m {
    public static final /* synthetic */ mm.h<Object>[] M0;
    public final com.topstep.fitcloud.pro.utils.viewbinding.a A0;
    public final t0 B0;
    public i.b C0;
    public final t0 D0;
    public zh.f E0;
    public zh.f F0;
    public zh.f G0;
    public zh.h H0;
    public List<Uri> I0;
    public final List<a.EnumC0212a> J0;
    public long K0;
    public final a L0;

    /* loaded from: classes2.dex */
    public static final class a implements f.b {

        @zl.e(c = "com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomFragment$adapterListener$1$onItemDelete$1", f = "DialCustomFragment.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomFragment$a$a */
        /* loaded from: classes2.dex */
        public static final class C0166a extends zl.i implements p<e0, xl.d<? super l>, Object> {

            /* renamed from: e */
            public final /* synthetic */ zh.g f11012e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0166a(zh.g gVar, xl.d<? super C0166a> dVar) {
                super(2, dVar);
                this.f11012e = gVar;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super l> dVar) {
                return ((C0166a) p(e0Var, dVar)).t(l.f28297a);
            }

            @Override // zl.a
            public final xl.d<l> p(Object obj, xl.d<?> dVar) {
                return new C0166a(this.f11012e, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                a0.k(obj);
                String path = this.f11012e.f32450a.getPath();
                if (path != null) {
                    new File(path).delete();
                }
                return l.f28297a;
            }
        }

        public a() {
            DialCustomFragment.this = r1;
        }

        @Override // zh.f.b
        public final void a(zh.g gVar) {
            gm.l.f(gVar, "item");
            List<Uri> list = DialCustomFragment.this.I0;
            boolean z10 = true;
            if ((list == null || !list.remove(gVar.f32450a)) ? false : false) {
                z0.g(qi.h.j(DialCustomFragment.this), o0.f24382b, 0, new C0166a(gVar, null), 2);
            }
            DialCustomFragment.this.s1();
        }

        @Override // zh.f.b
        public final void b() {
            int i10;
            List<Uri> list = DialCustomFragment.this.I0;
            if (list != null) {
                i10 = list.size();
            } else {
                i10 = 0;
            }
            if (i10 >= 5) {
                d7.e.f(DialCustomFragment.this.f1(), R.string.ds_dial_img_over_tips);
            } else {
                DialCustomFragment.this.m1(1);
            }
        }

        @Override // zh.f.b
        public final void c(zh.g gVar) {
            gm.l.f(gVar, "item");
            DialCustomFragment dialCustomFragment = DialCustomFragment.this;
            mm.h<Object>[] hVarArr = DialCustomFragment.M0;
            dialCustomFragment.s1();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends gm.m implements fm.l<Button, l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(1);
            DialCustomFragment.this = r1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x0042, code lost:
            if (r1 == null) goto L22;
         */
        @Override // fm.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final tl.l k(android.widget.Button r8) {
            /*
                r7 = this;
                android.widget.Button r8 = (android.widget.Button) r8
                java.lang.String r0 = "it"
                gm.l.f(r8, r0)
                com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomFragment r8 = com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomFragment.this
                androidx.lifecycle.t0 r8 = r8.B0
                java.lang.Object r8 = r8.getValue()
                com.topstep.fitcloud.pro.ui.device.dial.DialPushViewModel r8 = (com.topstep.fitcloud.pro.ui.device.dial.DialPushViewModel) r8
                og.t r8 = r8.f10917h
                boolean r8 = og.x0.b(r8)
                if (r8 == 0) goto Lae
                com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomFragment r8 = com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomFragment.this
                zh.i r8 = r8.u1()
                java.lang.Object r8 = r8.e()
                nh.d r8 = (nh.d) r8
                y3.b<T> r8 = r8.f22382a
                java.lang.Object r8 = r8.a()
                zh.n r8 = (zh.n) r8
                if (r8 == 0) goto Lba
                com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomFragment r0 = com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomFragment.this
                java.util.List<android.net.Uri> r1 = r0.I0
                r2 = 0
                if (r1 == 0) goto L4b
                zh.f r3 = r0.E0
                if (r3 == 0) goto L45
                int r3 = r3.f32440h
                java.lang.Object r1 = ul.q.J(r3, r1)
                android.net.Uri r1 = (android.net.Uri) r1
                if (r1 != 0) goto L4f
                goto L4b
            L45:
                java.lang.String r8 = "backgroundAdapter"
                gm.l.l(r8)
                throw r2
            L4b:
                xf.a r1 = r8.f32474b
                android.net.Uri r1 = r1.f30536a
            L4f:
                xf.a r3 = r8.f32474b
                java.util.List<xf.a$a> r3 = r3.f30537b
                zh.f r4 = r0.F0
                if (r4 == 0) goto La8
                int r4 = r4.f32440h
                java.lang.Object r3 = ul.q.J(r4, r3)
                xf.a$a r3 = (xf.a.C0558a) r3
                if (r3 != 0) goto L6c
                xf.a r3 = r8.f32474b
                java.util.List<xf.a$a> r3 = r3.f30537b
                r4 = 0
                java.lang.Object r3 = r3.get(r4)
                xf.a$a r3 = (xf.a.C0558a) r3
            L6c:
                com.topstep.fitcloud.pro.databinding.FragmentDialCustomBinding r4 = r0.t1()
                com.topstep.fitcloud.sdk.v2.utils.dial.DialView r4 = r4.dialView
                com.topstep.fitcloud.sdk.v2.utils.dial.a$a r4 = r4.getStylePosition()
                zh.g r5 = new zh.g
                java.lang.String r6 = "selectPosition"
                gm.l.e(r4, r6)
                r5.<init>(r1, r3, r4)
                int r1 = zh.a.N0
                com.topstep.fitcloud.pro.model.dial.DialPushParams r8 = r8.f32473a
                java.lang.String r1 = "params"
                gm.l.f(r8, r1)
                zh.a r1 = new zh.a
                r1.<init>()
                android.os.Bundle r3 = new android.os.Bundle
                r3.<init>()
                java.lang.String r4 = "custom_item"
                r3.putParcelable(r4, r5)
                java.lang.String r4 = "push_params"
                r3.putParcelable(r4, r8)
                r1.Z0(r3)
                androidx.fragment.app.j0 r8 = r0.h0()
                r1.h1(r8, r2)
                goto Lba
            La8:
                java.lang.String r8 = "styleAdapter"
                gm.l.l(r8)
                throw r2
            Lae:
                com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomFragment r8 = com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomFragment.this
                d7.e r8 = r8.f1()
                r0 = 2131951894(0x7f130116, float:1.9540215E38)
                d7.e.f(r8, r0)
            Lba:
                tl.l r8 = tl.l.f28297a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomFragment.b.k(java.lang.Object):java.lang.Object");
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomFragment$onViewCreated$3", f = "DialCustomFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends zl.i implements p<e0, xl.d<? super l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11014e;

        @zl.e(c = "com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomFragment$onViewCreated$3$1", f = "DialCustomFragment.kt", l = {107}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends zl.i implements p<e0, xl.d<? super l>, Object> {

            /* renamed from: e */
            public int f11016e;

            /* renamed from: f */
            public final /* synthetic */ DialCustomFragment f11017f;

            /* renamed from: com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomFragment$c$a$a */
            /* loaded from: classes2.dex */
            public static final class C0167a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ DialCustomFragment f11018a;

                public C0167a(DialCustomFragment dialCustomFragment) {
                    this.f11018a = dialCustomFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    boolean z10;
                    ArrayList arrayList;
                    boolean z11;
                    LoadingView loadingView;
                    int i10;
                    y3.b<T> bVar = ((nh.d) obj).f22382a;
                    if (gm.l.a(bVar, d1.f30940b)) {
                        z10 = true;
                    } else {
                        z10 = bVar instanceof y3.p;
                    }
                    if (z10) {
                        DialCustomFragment dialCustomFragment = this.f11018a;
                        mm.h<Object>[] hVarArr = DialCustomFragment.M0;
                        dialCustomFragment.t1().loadingView.c();
                    } else if (bVar instanceof y3.j) {
                        Throwable th2 = ((y3.j) bVar).f30961b;
                        if (th2 instanceof ig.e) {
                            DialCustomFragment dialCustomFragment2 = this.f11018a;
                            mm.h<Object>[] hVarArr2 = DialCustomFragment.M0;
                            loadingView = dialCustomFragment2.t1().loadingView;
                            i10 = R.string.ds_dial_error_shape;
                        } else if (th2 instanceof ig.d) {
                            DialCustomFragment dialCustomFragment3 = this.f11018a;
                            mm.h<Object>[] hVarArr3 = DialCustomFragment.M0;
                            loadingView = dialCustomFragment3.t1().loadingView;
                            i10 = R.string.ds_dial_error_style;
                        } else {
                            DialCustomFragment dialCustomFragment4 = this.f11018a;
                            mm.h<Object>[] hVarArr4 = DialCustomFragment.M0;
                            loadingView = dialCustomFragment4.t1().loadingView;
                            i10 = R.string.tip_load_error;
                        }
                        loadingView.a(i10);
                    } else if (bVar instanceof c1) {
                        n nVar = (n) ((c1) bVar).f30937b;
                        sj.e shape = nVar.f32473a.getShape();
                        DialCustomFragment dialCustomFragment5 = this.f11018a;
                        mm.h<Object>[] hVarArr5 = DialCustomFragment.M0;
                        dialCustomFragment5.t1().dialView.setShape(shape);
                        zh.f fVar = this.f11018a.E0;
                        if (fVar != null) {
                            gm.l.f(shape, "<set-?>");
                            fVar.f32438f = shape;
                            DialCustomFragment dialCustomFragment6 = this.f11018a;
                            zh.f fVar2 = dialCustomFragment6.F0;
                            if (fVar2 != null) {
                                fVar2.f32438f = shape;
                                zh.f fVar3 = dialCustomFragment6.G0;
                                if (fVar3 != null) {
                                    fVar3.f32438f = shape;
                                    File c10 = en.f.c(dialCustomFragment6.V0(), shape);
                                    if (c10 == null || !c10.exists()) {
                                        arrayList = null;
                                    } else {
                                        File[] listFiles = c10.listFiles();
                                        if (listFiles != null) {
                                            ArrayList arrayList2 = new ArrayList();
                                            for (File file : listFiles) {
                                                String name = file.getName();
                                                gm.l.e(name, "it.name");
                                                Locale locale = Locale.US;
                                                gm.l.e(locale, "US");
                                                String lowerCase = name.toLowerCase(locale);
                                                gm.l.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                                                if ((om.h.U(lowerCase, ".jpg", false) || om.h.U(lowerCase, ".jpeg", false)) && file.length() > 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                if (z11) {
                                                    arrayList2.add(file);
                                                }
                                            }
                                            arrayList = new ArrayList(ul.l.B(arrayList2, 10));
                                            Iterator it = arrayList2.iterator();
                                            while (it.hasNext()) {
                                                arrayList.add(Uri.fromFile((File) it.next()));
                                            }
                                        } else {
                                            arrayList = null;
                                        }
                                        gm.l.d(arrayList, "null cannot be cast to non-null type kotlin.collections.MutableList<android.net.Uri>");
                                        gm.e0.b(arrayList);
                                    }
                                    dialCustomFragment6.I0 = arrayList;
                                    zh.h hVar = this.f11018a.H0;
                                    if (hVar != null) {
                                        hVar.f32456g = nVar.f32473a.isSupportGUI();
                                        zh.h hVar2 = this.f11018a.H0;
                                        if (hVar2 != null) {
                                            hVar2.h();
                                            new com.google.android.material.tabs.e(this.f11018a.t1().tabLayout, this.f11018a.t1().viewPager, new i0(9, this.f11018a)).a();
                                            this.f11018a.t1().loadingView.setVisibility(8);
                                            this.f11018a.s1();
                                        } else {
                                            gm.l.l("pageAdapter");
                                            throw null;
                                        }
                                    } else {
                                        gm.l.l("pageAdapter");
                                        throw null;
                                    }
                                } else {
                                    gm.l.l("positionAdapter");
                                    throw null;
                                }
                            } else {
                                gm.l.l("styleAdapter");
                                throw null;
                            }
                        } else {
                            gm.l.l("backgroundAdapter");
                            throw null;
                        }
                    }
                    return l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DialCustomFragment dialCustomFragment, xl.d<? super a> dVar) {
                super(2, dVar);
                this.f11017f = dialCustomFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super l> dVar) {
                return ((a) p(e0Var, dVar)).t(l.f28297a);
            }

            @Override // zl.a
            public final xl.d<l> p(Object obj, xl.d<?> dVar) {
                return new a(this.f11017f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f11016e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    DialCustomFragment dialCustomFragment = this.f11017f;
                    mm.h<Object>[] hVarArr = DialCustomFragment.M0;
                    sm.t0 t0Var = dialCustomFragment.u1().f22394e;
                    C0167a c0167a = new C0167a(this.f11017f);
                    this.f11016e = 1;
                    if (t0Var.a(c0167a, this) == aVar) {
                        return aVar;
                    }
                }
                return l.f28297a;
            }
        }

        @zl.e(c = "com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomFragment$onViewCreated$3$2", f = "DialCustomFragment.kt", l = {147}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends zl.i implements p<e0, xl.d<? super l>, Object> {

            /* renamed from: e */
            public int f11019e;

            /* renamed from: f */
            public final /* synthetic */ DialCustomFragment f11020f;

            /* loaded from: classes2.dex */
            public static final class a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ DialCustomFragment f11021a;

                public a(DialCustomFragment dialCustomFragment) {
                    this.f11021a = dialCustomFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    nh.c cVar = (nh.c) obj;
                    if (cVar instanceof c.a) {
                        DialCustomFragment dialCustomFragment = this.f11021a;
                        mm.h<Object>[] hVarArr = DialCustomFragment.M0;
                        qi.p.f(dialCustomFragment.f1(), ((c.a) cVar).f22380a);
                    }
                    return l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(DialCustomFragment dialCustomFragment, xl.d<? super b> dVar) {
                super(2, dVar);
                this.f11020f = dialCustomFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super l> dVar) {
                return ((b) p(e0Var, dVar)).t(l.f28297a);
            }

            @Override // zl.a
            public final xl.d<l> p(Object obj, xl.d<?> dVar) {
                return new b(this.f11020f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f11019e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    DialCustomFragment dialCustomFragment = this.f11020f;
                    mm.h<Object>[] hVarArr = DialCustomFragment.M0;
                    sm.c cVar = dialCustomFragment.u1().f22396g;
                    a aVar2 = new a(this.f11020f);
                    this.f11019e = 1;
                    if (cVar.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return l.f28297a;
            }
        }

        @zl.e(c = "com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomFragment$onViewCreated$3$3", f = "DialCustomFragment.kt", l = {158}, m = "invokeSuspend")
        /* renamed from: com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomFragment$c$c */
        /* loaded from: classes2.dex */
        public static final class C0168c extends zl.i implements p<e0, xl.d<? super l>, Object> {

            /* renamed from: e */
            public int f11022e;

            /* renamed from: f */
            public final /* synthetic */ DialCustomFragment f11023f;

            /* renamed from: com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomFragment$c$c$a */
            /* loaded from: classes2.dex */
            public static final class a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ DialCustomFragment f11024a;

                public a(DialCustomFragment dialCustomFragment) {
                    this.f11024a = dialCustomFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    int i10;
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    DialCustomFragment dialCustomFragment = this.f11024a;
                    mm.h<Object>[] hVarArr = DialCustomFragment.M0;
                    PreferenceRelativeLayout preferenceRelativeLayout = dialCustomFragment.t1().layoutLocationService;
                    gm.l.e(preferenceRelativeLayout, "viewBind.layoutLocationService");
                    if (!booleanValue) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    preferenceRelativeLayout.setVisibility(i10);
                    return l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0168c(DialCustomFragment dialCustomFragment, xl.d<? super C0168c> dVar) {
                super(2, dVar);
                this.f11023f = dialCustomFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super l> dVar) {
                return ((C0168c) p(e0Var, dVar)).t(l.f28297a);
            }

            @Override // zl.a
            public final xl.d<l> p(Object obj, xl.d<?> dVar) {
                return new C0168c(this.f11023f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f11022e;
                if (i10 == 0) {
                    a0.k(obj);
                    sm.b e10 = qi.h.e(this.f11023f.V0());
                    a aVar2 = new a(this.f11023f);
                    this.f11022e = 1;
                    if (e10.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    a0.k(obj);
                }
                return l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(2, dVar);
            DialCustomFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super l> dVar) {
            return ((c) p(e0Var, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final xl.d<l> p(Object obj, xl.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f11014e = obj;
            return cVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            e0 e0Var = (e0) this.f11014e;
            z0.g(e0Var, null, 0, new a(DialCustomFragment.this, null), 3);
            z0.g(e0Var, null, 0, new b(DialCustomFragment.this, null), 3);
            if (Build.VERSION.SDK_INT < 31) {
                z0.g(e0Var, null, 0, new C0168c(DialCustomFragment.this, null), 3);
            } else {
                DialCustomFragment dialCustomFragment = DialCustomFragment.this;
                mm.h<Object>[] hVarArr = DialCustomFragment.M0;
                PreferenceRelativeLayout preferenceRelativeLayout = dialCustomFragment.t1().layoutLocationService;
                gm.l.e(preferenceRelativeLayout, "viewBind.layoutLocationService");
                preferenceRelativeLayout.setVisibility(8);
            }
            return l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends gm.m implements fm.a<i2.j> {

        /* renamed from: b */
        public final /* synthetic */ r f11025b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(r rVar) {
            super(0);
            this.f11025b = rVar;
        }

        @Override // fm.a
        public final i2.j m() {
            return tb.a.f(this.f11025b).f(R.id.dial_push_nav_graph);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends gm.m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11026b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(tl.i iVar) {
            super(0);
            this.f11026b = iVar;
        }

        @Override // fm.a
        public final x0 m() {
            i2.j jVar = (i2.j) this.f11026b.getValue();
            gm.l.e(jVar, "backStackEntry");
            x0 z10 = jVar.z();
            gm.l.e(z10, "backStackEntry.viewModelStore");
            return z10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends gm.m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f11027b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f11028c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(r rVar, tl.i iVar) {
            super(0);
            this.f11027b = rVar;
            this.f11028c = iVar;
        }

        @Override // fm.a
        public final v0.b m() {
            x T0 = this.f11027b.T0();
            i2.j jVar = (i2.j) this.f11028c.getValue();
            gm.l.e(jVar, "backStackEntry");
            return p.b.i(T0, jVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends gm.m implements fm.a<r> {

        /* renamed from: b */
        public final /* synthetic */ r f11029b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(r rVar) {
            super(0);
            this.f11029b = rVar;
        }

        @Override // fm.a
        public final r m() {
            return this.f11029b;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends gm.m implements fm.a<y0> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f11030b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f11030b = gVar;
        }

        @Override // fm.a
        public final y0 m() {
            return (y0) this.f11030b.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends gm.m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11031b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(tl.d dVar) {
            super(0);
            this.f11031b = dVar;
        }

        @Override // fm.a
        public final x0 m() {
            return ih.b.a(this.f11031b, "owner.viewModelStore");
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends gm.m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11032b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(tl.d dVar) {
            super(0);
            this.f11032b = dVar;
        }

        @Override // fm.a
        public final d2.a m() {
            y0 b10 = ab.b.b(this.f11032b);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            d2.c s10 = iVar != null ? iVar.s() : null;
            return s10 == null ? a.C0214a.f12612b : s10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends gm.m implements fm.a<v0.b> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k() {
            super(0);
            DialCustomFragment.this = r1;
        }

        @Override // fm.a
        public final v0.b m() {
            DialCustomFragment dialCustomFragment = DialCustomFragment.this;
            i.b bVar = dialCustomFragment.C0;
            if (bVar != null) {
                DialPushViewModel dialPushViewModel = (DialPushViewModel) dialCustomFragment.B0.getValue();
                gm.l.f(dialPushViewModel, "dialPushViewModel");
                return new zh.j(bVar, dialPushViewModel);
            }
            gm.l.l("customFactory");
            throw null;
        }
    }

    static {
        t tVar = new t(DialCustomFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentDialCustomBinding;", 0);
        b0.f15488a.getClass();
        M0 = new mm.h[]{tVar};
    }

    public DialCustomFragment() {
        super(R.layout.fragment_dial_custom);
        this.A0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentDialCustomBinding.class, this);
        tl.i iVar = new tl.i(new d(this));
        this.B0 = ab.b.e(this, b0.a(DialPushViewModel.class), new e(iVar), new f(this, iVar));
        k kVar = new k();
        tl.d a10 = fb.e.a(new h(new g(this)));
        this.D0 = ab.b.f(this, b0.a(zh.i.class), new i(a10), new j(a10), kVar);
        this.J0 = h7.a.q(a.EnumC0212a.BOTTOM, a.EnumC0212a.TOP, a.EnumC0212a.LEFT, a.EnumC0212a.RIGHT);
        this.L0 = new a();
    }

    @Override // lh.h, androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        zh.f fVar = new zh.f(true);
        fVar.f32437e = this.L0;
        this.E0 = fVar;
        zh.f fVar2 = new zh.f(false);
        fVar2.f32437e = this.L0;
        this.F0 = fVar2;
        zh.f fVar3 = new zh.f(false);
        fVar3.f32437e = this.L0;
        this.G0 = fVar3;
        zh.f fVar4 = this.E0;
        if (fVar4 != null) {
            zh.f fVar5 = this.F0;
            if (fVar5 != null) {
                this.H0 = new zh.h(fVar4, fVar5, fVar3);
                return;
            } else {
                gm.l.l("styleAdapter");
                throw null;
            }
        }
        gm.l.l("backgroundAdapter");
        throw null;
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        t1().loadingView.setListener(new n2(8, this));
        ViewPager2 viewPager2 = t1().viewPager;
        zh.h hVar = this.H0;
        if (hVar == null) {
            gm.l.l("pageAdapter");
            throw null;
        }
        viewPager2.setAdapter(hVar);
        p.b.g(t1().btnCreateDial, new b());
        qi.h.k(qi.h.i(this), new c(null));
    }

    @Override // lh.h
    public final File k1() {
        Context V0 = V0();
        sj.e shape = t1().dialView.getShape();
        gm.l.e(shape, "viewBind.dialView.shape");
        File c10 = en.f.c(V0, shape);
        if (c10 != null) {
            StringBuilder sb2 = new StringBuilder();
            String uuid = UUID.randomUUID().toString();
            gm.l.e(uuid, "randomUUID().toString()");
            sb2.append(om.h.Y(uuid, "-", ""));
            sb2.append(".jpg");
            File file = new File(c10, sb2.toString());
            File parentFile = file.getParentFile();
            if (parentFile != null && (parentFile.exists() || parentFile.mkdirs())) {
                return file;
            }
        }
        return null;
    }

    @Override // lh.h
    public final lh.d l1() {
        sj.e shape = t1().dialView.getShape();
        gm.l.e(shape, "viewBind.dialView.shape");
        int i10 = shape.f27096b;
        int i11 = shape.f27097c;
        return new lh.d(i10, i11, i10, i11);
    }

    @Override // lh.h
    public final File n1() {
        return en.f.b(V0());
    }

    @Override // lh.h
    public final void p1(Uri uri) {
        gm.l.f(uri, "uri");
        List list = this.I0;
        if (list == null) {
            list = new ArrayList();
            this.I0 = list;
        }
        list.add(uri);
        s1();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x002d, code lost:
        if (r1 == null) goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s1() {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomFragment.s1():void");
    }

    public final FragmentDialCustomBinding t1() {
        return (FragmentDialCustomBinding) this.A0.a(this, M0[0]);
    }

    public final zh.i u1() {
        return (zh.i) this.D0.getValue();
    }
}
