package jc;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.Log;
import androidx.appcompat.widget.m2;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import s.i0;
import s.m1;
import s.n2;

@Metadata
/* loaded from: classes.dex */
public final class u extends androidx.fragment.app.r {

    /* renamed from: x0 */
    public static final /* synthetic */ int f17601x0 = 0;

    /* renamed from: m0 */
    public x f17603m0;

    /* renamed from: n0 */
    public c f17604n0;

    /* renamed from: l0 */
    public final Handler f17602l0 = new Handler(Looper.getMainLooper());

    /* renamed from: o0 */
    public final androidx.fragment.app.q f17605o0 = R0(new androidx.activity.result.b(this) { // from class: jc.d

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ u f17577b;

        {
            this.f17577b = this;
        }

        @Override // androidx.activity.result.b
        public final void a(Object obj) {
            switch (r2) {
                case 0:
                    u uVar = this.f17577b;
                    int i10 = u.f17601x0;
                    gm.l.f(uVar, "this$0");
                    uVar.e1(new q(uVar, (Map) obj));
                    return;
                default:
                    u uVar2 = this.f17577b;
                    int i11 = u.f17601x0;
                    gm.l.f(uVar2, "this$0");
                    uVar2.e1(new n(uVar2, (Boolean) obj));
                    return;
            }
        }
    }, new e.b());

    /* renamed from: p0 */
    public final androidx.fragment.app.q f17606p0 = R0(new androidx.activity.result.b(this) { // from class: jc.e

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ u f17579b;

        {
            this.f17579b = this;
        }

        @Override // androidx.activity.result.b
        public final void a(Object obj) {
            switch (r2) {
                case 0:
                    u uVar = this.f17579b;
                    int i10 = u.f17601x0;
                    gm.l.f(uVar, "this$0");
                    uVar.e1(new m(uVar, (Boolean) obj));
                    return;
                default:
                    u uVar2 = this.f17579b;
                    androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                    int i11 = u.f17601x0;
                    gm.l.f(uVar2, "this$0");
                    if (uVar2.c1()) {
                        c cVar = uVar2.f17604n0;
                        if (cVar != null) {
                            x xVar = uVar2.f17603m0;
                            if (xVar != null) {
                                cVar.a(new ArrayList(xVar.f17634m));
                                return;
                            } else {
                                gm.l.l("pb");
                                throw null;
                            }
                        }
                        gm.l.l("task");
                        throw null;
                    }
                    return;
            }
        }
    }, new e.c());

    /* renamed from: q0 */
    public final androidx.fragment.app.q f17607q0 = R0(new m1(5, this), new e.d());

    /* renamed from: r0 */
    public final androidx.fragment.app.q f17608r0 = R0(new s.i(5, this), new e.d());

    /* renamed from: s0 */
    public final androidx.fragment.app.q f17609s0 = R0(new n2(4, this), new e.d());

    /* renamed from: t0 */
    public final androidx.fragment.app.q f17610t0 = R0(new i0(4, this), new e.d());

    /* renamed from: u0 */
    public final androidx.fragment.app.q f17611u0 = R0(new f(0, this), new e.d());

    /* renamed from: v0 */
    public final androidx.fragment.app.q f17612v0 = R0(new androidx.activity.result.b(this) { // from class: jc.d

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ u f17577b;

        {
            this.f17577b = this;
        }

        @Override // androidx.activity.result.b
        public final void a(Object obj) {
            switch (r2) {
                case 0:
                    u uVar = this.f17577b;
                    int i10 = u.f17601x0;
                    gm.l.f(uVar, "this$0");
                    uVar.e1(new q(uVar, (Map) obj));
                    return;
                default:
                    u uVar2 = this.f17577b;
                    int i11 = u.f17601x0;
                    gm.l.f(uVar2, "this$0");
                    uVar2.e1(new n(uVar2, (Boolean) obj));
                    return;
            }
        }
    }, new e.c());

    /* renamed from: w0 */
    public final androidx.fragment.app.q f17613w0 = R0(new androidx.activity.result.b(this) { // from class: jc.e

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ u f17579b;

        {
            this.f17579b = this;
        }

        @Override // androidx.activity.result.b
        public final void a(Object obj) {
            switch (r2) {
                case 0:
                    u uVar = this.f17579b;
                    int i10 = u.f17601x0;
                    gm.l.f(uVar, "this$0");
                    uVar.e1(new m(uVar, (Boolean) obj));
                    return;
                default:
                    u uVar2 = this.f17579b;
                    androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                    int i11 = u.f17601x0;
                    gm.l.f(uVar2, "this$0");
                    if (uVar2.c1()) {
                        c cVar = uVar2.f17604n0;
                        if (cVar != null) {
                            x xVar = uVar2.f17603m0;
                            if (xVar != null) {
                                cVar.a(new ArrayList(xVar.f17634m));
                                return;
                            } else {
                                gm.l.l("pb");
                                throw null;
                            }
                        }
                        gm.l.l("task");
                        throw null;
                    }
                    return;
            }
        }
    }, new e.d());

    @Override // androidx.fragment.app.r
    public final void D0() {
        this.E = true;
        if (c1() && this.f17603m0 == null) {
            gm.l.l("pb");
            throw null;
        }
    }

    public final boolean c1() {
        if (this.f17603m0 == null || this.f17604n0 == null) {
            Log.w("PermissionX", "PermissionBuilder and ChainTask should not be null at this time, so we can do nothing in this case.");
            return false;
        }
        return true;
    }

    public final void d1() {
        c cVar;
        boolean canDrawOverlays;
        if (c1()) {
            if (Build.VERSION.SDK_INT >= 23) {
                canDrawOverlays = Settings.canDrawOverlays(V0());
                if (!canDrawOverlays) {
                    x xVar = this.f17603m0;
                    if (xVar == null) {
                        gm.l.l("pb");
                        throw null;
                    } else if (xVar.f17636o == null) {
                        if (xVar != null) {
                            return;
                        }
                        gm.l.l("pb");
                        throw null;
                    } else if (xVar == null) {
                        gm.l.l("pb");
                        throw null;
                    } else {
                        x xVar2 = this.f17603m0;
                        if (xVar2 == null) {
                            gm.l.l("pb");
                            throw null;
                        }
                        s5.b bVar = xVar2.f17636o;
                        gm.l.c(bVar);
                        c cVar2 = this.f17604n0;
                        if (cVar2 != null) {
                            bVar.a(cVar2.c(), h7.a.p("android.permission.SYSTEM_ALERT_WINDOW"));
                            return;
                        } else {
                            gm.l.l("task");
                            throw null;
                        }
                    }
                }
                cVar = this.f17604n0;
                if (cVar == null) {
                    gm.l.l("task");
                    throw null;
                }
            } else {
                cVar = this.f17604n0;
                if (cVar == null) {
                    gm.l.l("task");
                    throw null;
                }
            }
            cVar.b();
        }
    }

    public final void e1(fm.a<tl.l> aVar) {
        this.f17602l0.post(new m2(7, aVar));
    }
}
