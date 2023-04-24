package kc;

import android.content.BroadcastReceiver;
import kc.m0;

/* loaded from: classes.dex */
public final class l0 implements wk.c {

    /* renamed from: a */
    public final /* synthetic */ BroadcastReceiver f18348a;

    /* renamed from: b */
    public final /* synthetic */ m0.a f18349b;

    public l0(m0.a aVar, k0 k0Var) {
        this.f18349b = aVar;
        this.f18348a = k0Var;
    }

    @Override // wk.c
    public final void cancel() {
        this.f18349b.f18352a.unregisterReceiver(this.f18348a);
    }
}
