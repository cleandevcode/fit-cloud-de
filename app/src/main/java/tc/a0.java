package tc;

import android.content.BroadcastReceiver;

/* loaded from: classes.dex */
public final class a0 implements wk.c {

    /* renamed from: a */
    public final /* synthetic */ BroadcastReceiver f27960a;

    /* renamed from: b */
    public final /* synthetic */ b0 f27961b;

    public a0(b0 b0Var, z zVar) {
        this.f27961b = b0Var;
        this.f27960a = zVar;
    }

    @Override // wk.c
    public final void cancel() {
        this.f27961b.f27962a.f27964a.unregisterReceiver(this.f27960a);
    }
}
