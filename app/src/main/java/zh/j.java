package zh;

import androidx.lifecycle.s0;
import androidx.lifecycle.v0;
import com.topstep.fitcloud.pro.ui.device.dial.DialPushViewModel;
import zh.i;

/* loaded from: classes2.dex */
public final class j implements v0.b {

    /* renamed from: a */
    public final /* synthetic */ i.b f32463a;

    /* renamed from: b */
    public final /* synthetic */ DialPushViewModel f32464b;

    public j(i.b bVar, DialPushViewModel dialPushViewModel) {
        this.f32463a = bVar;
        this.f32464b = dialPushViewModel;
    }

    @Override // androidx.lifecycle.v0.b
    public final s0 a(Class cls, d2.c cVar) {
        return b(cls);
    }

    @Override // androidx.lifecycle.v0.b
    public final <T extends s0> T b(Class<T> cls) {
        i a10 = this.f32463a.a(this.f32464b);
        gm.l.d(a10, "null cannot be cast to non-null type T of com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomViewModel.Companion.provideFactory.<no name provided>.create");
        return a10;
    }
}
