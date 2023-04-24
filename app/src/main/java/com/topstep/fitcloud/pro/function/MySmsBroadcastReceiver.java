package com.topstep.fitcloud.pro.function;

import android.content.Context;
import android.os.PowerManager;
import bi.m0;
import dk.a;
import gm.l;
import hj.b;
import kotlin.Metadata;
import of.o;
import og.j1;
import p000do.a;
import sf.q;

@Metadata
/* loaded from: classes2.dex */
public final class MySmsBroadcastReceiver extends q {

    /* renamed from: d */
    public a<j1> f9567d;

    @Override // bk.e
    public final b b(Context context) {
        return o.a(context);
    }

    @Override // bk.e
    public final boolean c(Context context) {
        l.f(context, "context");
        a<j1> aVar = this.f9567d;
        if (aVar != null) {
            if (!m0.w(aVar.get().d(), 2)) {
                a.b bVar = p000do.a.f13275a;
                bVar.t("Fc#SMS");
                bVar.h("FLAG_SMS is disabled!", new Object[0]);
                return false;
            }
            dk.a<j1> aVar2 = this.f9567d;
            if (aVar2 != null) {
                if (aVar2.get().b()) {
                    Object systemService = context.getSystemService("power");
                    l.d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
                    if (((PowerManager) systemService).isInteractive()) {
                        a.b bVar2 = p000do.a.f13275a;
                        bVar2.t("Fc#SMS");
                        bVar2.b("Skip ScreenOff", new Object[0]);
                        return false;
                    }
                    return true;
                }
                return true;
            }
            l.l("notificationRepository");
            throw null;
        }
        l.l("notificationRepository");
        throw null;
    }
}
