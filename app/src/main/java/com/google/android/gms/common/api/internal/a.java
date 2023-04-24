package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import g8.a;
import g8.h;
import h8.g0;
import i8.p;

/* loaded from: classes.dex */
public abstract class a<R extends h, A> extends BasePendingResult<R> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g8.a aVar, g0 g0Var) {
        super(g0Var);
        if (g0Var == null) {
            throw new NullPointerException("GoogleApiClient must not be null");
        }
        if (aVar == null) {
            throw new NullPointerException("Api must not be null");
        }
    }

    public abstract void i(a.e eVar);

    public final void j(Status status) {
        boolean z10;
        if (status.f6057b <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        p.a("Failed result must not be success", !z10);
        e(b(status));
    }
}
