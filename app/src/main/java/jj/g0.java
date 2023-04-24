package jj;

import jj.d0;
import p000do.a;

/* loaded from: classes2.dex */
public final class g0 implements d0.a {

    /* renamed from: a */
    public final /* synthetic */ d0 f17897a;

    public g0(d0 d0Var) {
        this.f17897a = d0Var;
    }

    public final void a(int i10) {
        int i11 = this.f17897a.f17886f;
        if (i11 <= 0) {
            a.b bVar = p000do.a.f13275a;
            bVar.t("Fc#Sync");
            bVar.p("OnSyncSize Add:" + i10 + ", but totalSize is 0", new Object[0]);
            return;
        }
        a.b bVar2 = p000do.a.f13275a;
        bVar2.t("Fc#Sync");
        bVar2.h("OnSyncSize Add:" + i10, new Object[0]);
        float addAndGet = ((float) this.f17897a.f17887g.addAndGet(i10)) / ((float) i11);
        int i12 = 100;
        int i13 = (int) (addAndGet * ((float) 100));
        if (i13 <= 100) {
            i12 = i13;
        }
        this.f17897a.f17885e.b(Integer.valueOf(i12));
    }
}
