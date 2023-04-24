package com.topstep.fitcloud.pro;

import a0.j1;
import a0.n1;
import android.content.res.Configuration;
import androidx.camera.camera2.Camera2Config;
import androidx.work.a;
import bi.m0;
import f7.e;
import gm.l;
import kotlin.Metadata;
import of.p;
import og.t;
import pm.e0;
import sf.i;
import y.v;
import yg.m;

@Metadata
/* loaded from: classes2.dex */
public final class MyApplication extends p implements a.b, v.b {

    /* renamed from: c */
    public dk.a<e0> f9536c;

    /* renamed from: d */
    public dk.a<t> f9537d;

    /* renamed from: e */
    public dk.a<i> f9538e;

    /* renamed from: f */
    public dk.a<Object> f9539f;

    /* renamed from: g */
    public dk.a<b2.a> f9540g;

    /* renamed from: h */
    public dk.a<m> f9541h;

    /* renamed from: i */
    public sf.v f9542i;

    @Override // androidx.work.a.b
    public final a a() {
        a.C0037a c0037a = new a.C0037a();
        dk.a<b2.a> aVar = this.f9540g;
        if (aVar != null) {
            c0037a.f3645a = aVar.get();
            return new a(c0037a);
        }
        l.l("workerFactory");
        throw null;
    }

    @Override // y.v.b
    public final v getCameraXConfig() {
        j1 C = j1.C(Camera2Config.a());
        new v.a(C);
        C.E(v.E, 6);
        return new v(n1.A(C));
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        l.f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        m0.u(e.b(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x002f, code lost:
        if (r5.mkdirs() == false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0211 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0145  */
    @Override // of.p, android.app.Application
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate() {
        /*
            Method dump skipped, instructions count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.MyApplication.onCreate():void");
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        if (i10 >= 20) {
            qi.i.f24863a = null;
        }
    }
}
