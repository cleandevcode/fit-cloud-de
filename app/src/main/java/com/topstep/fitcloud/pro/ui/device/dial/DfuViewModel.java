package com.topstep.fitcloud.pro.ui.device.dial;

import android.net.Uri;
import androidx.lifecycle.s0;
import bi.r;
import bi.z0;
import gm.k;
import gm.l;
import gm.m;
import ij.b0;
import ij.c;
import jh.v;
import kotlin.Metadata;
import og.t;
import pm.z1;
import qi.h;
import sm.b;
import sm.c;
import tl.i;

@Metadata
/* loaded from: classes2.dex */
public final class DfuViewModel extends s0 {

    /* renamed from: d */
    public final t f10909d;

    /* renamed from: e */
    public final i f10910e;

    /* renamed from: f */
    public final rm.a f10911f;

    /* renamed from: g */
    public final c f10912g;

    /* renamed from: h */
    public z1 f10913h;

    /* loaded from: classes2.dex */
    public static final class a extends m implements fm.a<ij.c> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(0);
            DfuViewModel.this = r1;
        }

        @Override // fm.a
        public final ij.c m() {
            return DfuViewModel.this.f10909d.q();
        }
    }

    public DfuViewModel(t tVar) {
        l.f(tVar, "deviceManager");
        this.f10909d = tVar;
        this.f10910e = new i(new a());
        rm.a a10 = v.a(0, null, 7);
        this.f10911f = a10;
        this.f10912g = r.J(a10);
    }

    @Override // androidx.lifecycle.s0
    public final void c() {
        b0 b0Var = ((ij.c) this.f10910e.getValue()).f17043j;
        if (b0Var != null) {
            b0Var.release();
        }
    }

    public final b e() {
        ql.a<c.a> aVar = ((ij.c) this.f10910e.getValue()).f17042i;
        l.e(aVar, "stateProgressSubject");
        return h.d(aVar);
    }

    public final boolean f() {
        z1 z1Var = this.f10913h;
        return z1Var != null && z1Var.a();
    }

    public final void g(int i10, Uri uri, byte b10) {
        k.b(i10, "dfuType");
        z1 z1Var = this.f10913h;
        if (z1Var != null) {
            z1Var.h(null);
        }
        this.f10913h = z0.g(rm.l.h(this), null, 0, new wh.a(this, i10, uri, b10, null), 3);
    }
}
