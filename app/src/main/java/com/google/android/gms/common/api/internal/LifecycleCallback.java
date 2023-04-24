package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import h8.f;
import h8.g;
import i8.p;

/* loaded from: classes.dex */
public class LifecycleCallback {

    /* renamed from: a */
    public final g f6071a;

    public LifecycleCallback(g gVar) {
        this.f6071a = gVar;
    }

    @Keep
    private static g getChimeraLifecycleFragmentImpl(f fVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public final Activity a() {
        Activity A = this.f6071a.A();
        p.f(A);
        return A;
    }

    public void b(int i10, int i11, Intent intent) {
    }

    public void c(Bundle bundle) {
    }

    public void d() {
    }

    public void e(Bundle bundle) {
    }

    public void f() {
    }

    public void g() {
    }
}
