package com.topstep.fitcloud.pro.ui.device.song.push;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.IntentFilter;
import androidx.lifecycle.l0;
import bi.r;
import bi.z0;
import ci.g0;
import ci.k0;
import ci.m0;
import ci.n0;
import ci.o0;
import ci.q0;
import ci.v;
import ci.v0;
import com.realsil.sdk.bbpro.internal.BaseBeeProManager;
import fm.p;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import jj.k1;
import kotlin.Metadata;
import mf.a0;
import og.t;
import p000do.a;
import pm.e0;
import pm.z1;
import s.x2;
import sm.f1;
import sm.g;
import sm.g1;
import sm.t0;
import tl.l;
import u6.x;
import u6.z;
import zl.i;

@Metadata
/* loaded from: classes2.dex */
public final class SongPushViewModel extends v6.b<k0> {

    /* renamed from: j */
    public final Context f11382j;

    /* renamed from: k */
    public final t f11383k;

    /* renamed from: l */
    public final BluetoothAdapter f11384l;

    /* renamed from: m */
    public final yc.a f11385m;

    /* renamed from: n */
    public final v f11386n;

    /* renamed from: o */
    public final f f11387o;

    /* renamed from: p */
    public final rm.a f11388p;

    /* renamed from: q */
    public final sm.c f11389q;

    /* renamed from: r */
    public final g1 f11390r;

    /* renamed from: s */
    public final g1 f11391s;

    /* renamed from: t */
    public final g1 f11392t;

    /* renamed from: u */
    public final t0 f11393u;

    /* renamed from: v */
    public z1 f11394v;

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.song.push.SongPushViewModel$2", f = "SongPushViewModel.kt", l = {119}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<e0, xl.d<? super l>, Object> {

        /* renamed from: e */
        public int f11395e;

        /* renamed from: com.topstep.fitcloud.pro.ui.device.song.push.SongPushViewModel$a$a */
        /* loaded from: classes2.dex */
        public static final class C0193a<T> implements g {

            /* renamed from: a */
            public final /* synthetic */ SongPushViewModel f11397a;

            public C0193a(SongPushViewModel songPushViewModel) {
                this.f11397a = songPushViewModel;
            }

            @Override // sm.g
            public final Object n(Object obj, xl.d dVar) {
                wf.b bVar = (wf.b) obj;
                SongPushViewModel songPushViewModel = this.f11397a;
                songPushViewModel.f11390r.setValue(((k1) songPushViewModel.f11383k.s()).b());
                return l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d<? super a> dVar) {
            super(2, dVar);
            SongPushViewModel.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super l> dVar) {
            ((a) p(e0Var, dVar)).t(l.f28297a);
            return yl.a.COROUTINE_SUSPENDED;
        }

        @Override // zl.a
        public final xl.d<l> p(Object obj, xl.d<?> dVar) {
            return new a(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f11395e;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.k(obj);
            } else {
                a0.k(obj);
                f1<wf.b> J = SongPushViewModel.this.f11383k.J();
                C0193a c0193a = new C0193a(SongPushViewModel.this);
                this.f11395e = 1;
                if (J.a(c0193a, this) == aVar) {
                    return aVar;
                }
            }
            throw new u2.b();
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.song.push.SongPushViewModel$3", f = "SongPushViewModel.kt", l = {124}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends i implements p<e0, xl.d<? super l>, Object> {

        /* renamed from: e */
        public int f11398e;

        /* loaded from: classes2.dex */
        public static final class a<T> implements g {

            /* renamed from: a */
            public final /* synthetic */ SongPushViewModel f11400a;

            public a(SongPushViewModel songPushViewModel) {
                this.f11400a = songPushViewModel;
            }

            @Override // sm.g
            public final Object n(Object obj, xl.d dVar) {
                String str = (String) obj;
                a.b bVar = p000do.a.f13275a;
                bVar.t("SongPush");
                boolean z10 = true;
                bVar.p("device changed:%s", str);
                if (str != null && str.length() != 0) {
                    z10 = false;
                }
                if (z10) {
                    SongPushViewModel songPushViewModel = this.f11400a;
                    songPushViewModel.f11385m.i();
                    songPushViewModel.f11391s.setValue(0);
                } else {
                    Object j10 = SongPushViewModel.j(this.f11400a, str, dVar);
                    if (j10 == yl.a.COROUTINE_SUSPENDED) {
                        return j10;
                    }
                }
                return l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(2, dVar);
            SongPushViewModel.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super l> dVar) {
            ((b) p(e0Var, dVar)).t(l.f28297a);
            return yl.a.COROUTINE_SUSPENDED;
        }

        @Override // zl.a
        public final xl.d<l> p(Object obj, xl.d<?> dVar) {
            return new b(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f11398e;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.k(obj);
            } else {
                a0.k(obj);
                SongPushViewModel songPushViewModel = SongPushViewModel.this;
                g1 g1Var = songPushViewModel.f11390r;
                a aVar2 = new a(songPushViewModel);
                this.f11398e = 1;
                if (g1Var.a(aVar2, this) == aVar) {
                    return aVar;
                }
            }
            throw new u2.b();
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.song.push.SongPushViewModel$4", f = "SongPushViewModel.kt", l = {134}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends i implements p<e0, xl.d<? super l>, Object> {

        /* renamed from: e */
        public int f11401e;

        /* loaded from: classes2.dex */
        public static final class a<T> implements g {

            /* renamed from: a */
            public final /* synthetic */ SongPushViewModel f11403a;

            public a(SongPushViewModel songPushViewModel) {
                this.f11403a = songPushViewModel;
            }

            @Override // sm.g
            public final Object n(Object obj, xl.d dVar) {
                if (((Number) obj).intValue() == 3) {
                    SongPushViewModel.k(this.f11403a);
                }
                return l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(2, dVar);
            SongPushViewModel.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super l> dVar) {
            ((c) p(e0Var, dVar)).t(l.f28297a);
            return yl.a.COROUTINE_SUSPENDED;
        }

        @Override // zl.a
        public final xl.d<l> p(Object obj, xl.d<?> dVar) {
            return new c(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f11401e;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.k(obj);
            } else {
                a0.k(obj);
                SongPushViewModel songPushViewModel = SongPushViewModel.this;
                g1 g1Var = songPushViewModel.f11391s;
                a aVar2 = new a(songPushViewModel);
                this.f11401e = 1;
                if (g1Var.a(aVar2, this) == aVar) {
                    return aVar;
                }
            }
            throw new u2.b();
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.song.push.SongPushViewModel$6", f = "SongPushViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends i implements p<l, xl.d<? super l>, Object> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(xl.d<? super e> dVar) {
            super(2, dVar);
            SongPushViewModel.this = r1;
        }

        @Override // fm.p
        public final Object A(l lVar, xl.d<? super l> dVar) {
            return ((e) p(lVar, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final xl.d<l> p(Object obj, xl.d<?> dVar) {
            return new e(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            SongPushViewModel.k(SongPushViewModel.this);
            return l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends yc.c {
        public f() {
            SongPushViewModel.this = r1;
        }

        @Override // yc.c
        public final void c(int i10) {
            boolean z10;
            a.b bVar = p000do.a.f13275a;
            bVar.t("SongPush");
            int i11 = 1;
            bVar.h("onStateChanged:%d", Integer.valueOf(i10));
            SongPushViewModel songPushViewModel = SongPushViewModel.this;
            CharSequence charSequence = (CharSequence) songPushViewModel.f11390r.getValue();
            if (charSequence != null && charSequence.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                i11 = 0;
            } else {
                int i12 = songPushViewModel.f11385m.f9430i;
                if (i12 != 257) {
                    if (i12 != 513) {
                        switch (i12) {
                            case 261:
                                i11 = 2;
                                break;
                        }
                    }
                    i11 = 3;
                }
            }
            songPushViewModel.f11391s.setValue(Integer.valueOf(i11));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SongPushViewModel(l0 l0Var, Context context, t tVar) {
        super(new k0(null, null, 3, null), l0Var);
        pd.b bVar;
        gm.l.f(l0Var, "savedStateHandle");
        gm.l.f(context, "context");
        gm.l.f(tVar, "deviceManager");
        this.f11382j = context;
        this.f11383k = tVar;
        Object systemService = context.getSystemService("bluetooth");
        gm.l.d(systemService, "null cannot be cast to non-null type android.bluetooth.BluetoothManager");
        this.f11384l = ((BluetoothManager) systemService).getAdapter();
        f fVar = new f();
        this.f11387o = fVar;
        rm.a a10 = jh.v.a(0, null, 7);
        this.f11388p = a10;
        this.f11389q = r.J(a10);
        this.f11390r = r.c(null);
        this.f11391s = r.c(0);
        rd.a aVar = new rd.a();
        aVar.f25534a = true;
        aVar.f25535b = true;
        aVar.f25537d = 1;
        aVar.f25536c = "AudioConnectSDK";
        rd.b.a(context, aVar);
        rd.b.f25540c = true;
        ge.b.f15317d = new x2(5);
        yc.b bVar2 = new yc.b();
        bVar2.f31437c = true;
        bVar2.f31436b = true;
        bVar2.f31435a = true;
        bVar2.f31438d = UUID.fromString("6A24EEAB-4B65-4693-986B-3C26C352264F");
        bVar2.f31439e = 1;
        yc.a q10 = yc.a.q(context);
        gm.l.e(q10, "getInstance(context)");
        this.f11385m = q10;
        BaseBeeProManager.f9421z = bVar2;
        StringBuilder a11 = android.support.v4.media.d.a("initialize:");
        a11.append(BaseBeeProManager.j().toString());
        ge.b.d(a11.toString());
        Context context2 = q10.mContext;
        if (pd.b.f24012k == null) {
            synchronized (pd.b.class) {
                if (pd.b.f24012k == null) {
                    context2.getApplicationContext();
                    pd.b.f24012k = new pd.b();
                }
            }
        }
        if (pd.b.f24012k == null) {
            ge.b.p("please call setup(Context, BeeProManager) first");
            bVar = null;
        } else {
            bVar = pd.b.f24012k;
        }
        q10.f9436o = bVar;
        if (bVar != null) {
            bVar.f18447a = q10;
            q10.e(bVar.f18451e);
            q10.f9436o.e(q10.f9438q);
        }
        Context context3 = q10.mContext;
        if (gd.f.f15266t == null) {
            synchronized (gd.f.class) {
                if (gd.f.f15266t == null) {
                    context3.getApplicationContext();
                    gd.f.f15266t = new gd.f();
                }
            }
        }
        if (gd.f.f15266t == null) {
            ge.b.p("please call setup(Context, BeeProManager) first");
        }
        gd.f fVar2 = gd.f.f15266t;
        fVar2.f18447a = q10;
        q10.e(fVar2.f18451e);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.device.action.UUID");
        q10.mContext.registerReceiver(new BaseBeeProManager.g(q10), intentFilter);
        q10.c(q10.f9430i, true);
        q10.f9422a = true;
        ge.b.o("initialize success", BaseBeeProManager.f9419x);
        if (wc.c.f29781j == null) {
            synchronized (wc.c.class) {
                if (wc.c.f29781j == null) {
                    context.getApplicationContext();
                    wc.c.f29781j = new wc.c();
                }
            }
        }
        if (wc.c.f29781j == null) {
            ge.b.p("please call setup(Context, BeeProManager) first");
        }
        wc.c cVar = wc.c.f29781j;
        gm.l.e(cVar, "getInstance()");
        yc.a q11 = yc.a.q(context);
        q11.getClass();
        cVar.f18447a = q11;
        q11.e(cVar.f18451e);
        this.f11386n = new v(context, cVar);
        q10.e(fVar);
        z0.g(rm.l.h(this), null, 0, new a(null), 3);
        z0.g(rm.l.h(this), null, 0, new b(null), 3);
        z0.g(rm.l.h(this), null, 0, new c(null), 3);
        x.b(this, null, new gm.t() { // from class: com.topstep.fitcloud.pro.ui.device.song.push.SongPushViewModel.d
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((k0) obj).f4784b;
            }
        }, z.f28636a, null, new e(null));
        g1 c10 = r.c(new v0(0));
        this.f11392t = c10;
        this.f11393u = r.f(c10);
    }

    public static final Object j(SongPushViewModel songPushViewModel, String str, xl.d dVar) {
        UUID uuid;
        BluetoothDevice remoteDevice = songPushViewModel.f11384l.getRemoteDevice(str);
        UUID uuid2 = yc.d.f31440f;
        UUID fromString = UUID.fromString("6A24EEAB-4B65-4693-986B-3C26C352264F");
        if (fromString != null) {
            uuid = fromString;
        } else {
            uuid = uuid2;
        }
        int p10 = songPushViewModel.f11385m.p(new yc.d(remoteDevice, null, uuid, true, 0));
        a.b bVar = p000do.a.f13275a;
        bVar.t("SongPush");
        bVar.p("startConnect result beeError:%d", new Integer(p10));
        if (p10 != 0) {
            songPushViewModel.f11391s.setValue(new Integer(1));
            Object d10 = songPushViewModel.f11388p.d(new g0.a(new h4.l(p10, 1)), dVar);
            if (d10 == yl.a.COROUTINE_SUSPENDED) {
                return d10;
            }
        } else {
            songPushViewModel.f11391s.setValue(new Integer(2));
        }
        return l.f28297a;
    }

    public static final void k(SongPushViewModel songPushViewModel) {
        songPushViewModel.getClass();
        v6.b.f(songPushViewModel, new o0(songPushViewModel, null), new gm.t() { // from class: ci.p0
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((k0) obj).f4783a;
            }
        }, q0.f4818b, 1);
    }

    @Override // androidx.lifecycle.s0
    public final void c() {
        yc.a aVar = this.f11385m;
        f fVar = this.f11387o;
        CopyOnWriteArrayList copyOnWriteArrayList = aVar.f9435n;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(fVar);
            boolean z10 = BaseBeeProManager.f9420y;
            StringBuilder a10 = android.support.v4.media.d.a("mManagerCallback.size=");
            a10.append(aVar.f9435n.size());
            ge.b.o(a10.toString(), z10);
        }
        this.f11385m.i();
    }

    public final void l(ArrayList arrayList) {
        gm.l.f(arrayList, "audios");
        if (m()) {
            return;
        }
        z1 g10 = z0.g(rm.l.h(this), null, 0, new m0(this, arrayList, null), 3);
        g10.k(new n0(this));
        this.f11394v = g10;
    }

    public final boolean m() {
        z1 z1Var = this.f11394v;
        return z1Var != null && z1Var.a();
    }
}
