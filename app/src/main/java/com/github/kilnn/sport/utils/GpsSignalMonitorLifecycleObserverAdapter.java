package com.github.kilnn.sport.utils;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import androidx.lifecycle.g;
import androidx.lifecycle.u;
import bi.z0;
import c7.b;
import c7.c;
import c7.d;
import c7.f;
import c7.i;
import c7.j;
import gm.l;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import p000do.a;
import pm.g1;
import y0.a;

@Metadata
/* loaded from: classes.dex */
public final class GpsSignalMonitorLifecycleObserverAdapter implements g {

    /* renamed from: a */
    public final b f5867a;

    public GpsSignalMonitorLifecycleObserverAdapter(b bVar) {
        this.f5867a = bVar;
    }

    @Override // androidx.lifecycle.g
    public final void c(u uVar) {
    }

    @Override // androidx.lifecycle.g
    public final void onDestroy(u uVar) {
    }

    @Override // androidx.lifecycle.g
    public final void onPause(u uVar) {
    }

    @Override // androidx.lifecycle.g
    public final void onResume(u uVar) {
    }

    @Override // androidx.lifecycle.g
    public final void onStart(u uVar) {
        boolean z10;
        b bVar = this.f5867a;
        bVar.f4546b.f4556e.f(bVar.f4549e);
        f fVar = bVar.f4546b;
        if (!fVar.f4558g) {
            fVar.a();
            fVar.f4552a.registerReceiver(fVar.f4559h, new IntentFilter("android.location.PROVIDERS_CHANGED"));
            c cVar = fVar.f4554c;
            if (cVar != null) {
                d dVar = fVar.f4555d;
                l.c(dVar);
                Context context = cVar.f4564a;
                String[] strArr = cVar.f4565b;
                String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
                l.f(context, "context");
                l.f(strArr2, "permissions");
                if (Build.VERSION.SDK_INT >= 23) {
                    for (String str : strArr2) {
                        if (a.a(context, str) != 0) {
                            z10 = false;
                            break;
                        }
                    }
                }
                z10 = true;
                if (z10) {
                    dVar.a();
                } else {
                    if (cVar.f4567d == null) {
                        cVar.f4567d = new ArrayList<>(cVar.f4566c);
                    }
                    ArrayList<i> arrayList = cVar.f4567d;
                    if (arrayList != null) {
                        arrayList.add(dVar);
                    }
                    if (cVar.f4568e == null) {
                        cVar.f4568e = z0.g(pm.z0.f24420a, null, 0, new c7.g(cVar, null), 3);
                    }
                }
            }
            fVar.f4558g = true;
        }
    }

    @Override // androidx.lifecycle.g
    public final void onStop(u uVar) {
        b bVar = this.f5867a;
        bVar.f4546b.f4556e.i(bVar.f4549e);
        if (bVar.f4545a) {
            f fVar = bVar.f4546b;
            if (fVar.f4558g) {
                fVar.f4552a.unregisterReceiver(fVar.f4559h);
                c cVar = fVar.f4554c;
                if (cVar != null) {
                    d dVar = fVar.f4555d;
                    l.c(dVar);
                    ArrayList<i> arrayList = cVar.f4567d;
                    if (arrayList != null) {
                        arrayList.remove(dVar);
                    }
                    ArrayList<i> arrayList2 = cVar.f4567d;
                    boolean z10 = true;
                    if (!((arrayList2 == null || !(arrayList2.isEmpty() ^ true)) ? false : false)) {
                        a.b bVar2 = p000do.a.f13275a;
                        bVar2.t("PermissionsMonitor");
                        bVar2.b("cancelCheck:no listener", new Object[0]);
                        g1 g1Var = cVar.f4568e;
                        if (g1Var != null) {
                            g1Var.h(null);
                        }
                        cVar.f4568e = null;
                        cVar.f4567d = null;
                    }
                }
                fVar.f4558g = false;
            }
        }
        j jVar = bVar.f4547c;
        if (jVar.f4571c != null) {
            jVar.b();
            jVar.f4569a.removeUpdates(jVar.f4575g);
        }
        jVar.f4572d = null;
        jVar.f4571c = null;
    }
}
