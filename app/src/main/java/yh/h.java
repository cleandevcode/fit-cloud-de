package yh;

import androidx.lifecycle.s0;
import androidx.lifecycle.v0;
import com.topstep.fitcloud.pro.ui.device.dial.DialPushViewModel;
import yh.g;

/* loaded from: classes2.dex */
public final class h implements v0.b {

    /* renamed from: a */
    public final /* synthetic */ g.b f31748a;

    /* renamed from: b */
    public final /* synthetic */ DialPushViewModel f31749b;

    /* renamed from: c */
    public final /* synthetic */ boolean f31750c;

    public h(g.b bVar, DialPushViewModel dialPushViewModel, boolean z10) {
        this.f31748a = bVar;
        this.f31749b = dialPushViewModel;
        this.f31750c = z10;
    }

    @Override // androidx.lifecycle.v0.b
    public final s0 a(Class cls, d2.c cVar) {
        return b(cls);
    }

    @Override // androidx.lifecycle.v0.b
    public final <T extends s0> T b(Class<T> cls) {
        g a10 = this.f31748a.a(this.f31749b, this.f31750c);
        gm.l.d(a10, "null cannot be cast to non-null type T of com.topstep.fitcloud.pro.ui.device.dial.push.DialPacketListViewModel.Companion.provideFactory.<no name provided>.create");
        return a10;
    }
}
