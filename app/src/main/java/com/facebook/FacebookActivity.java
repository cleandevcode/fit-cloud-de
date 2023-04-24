package com.facebook;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.k0;
import androidx.fragment.app.r;
import androidx.fragment.app.x;
import com.facebook.common.R;
import d6.e0;
import d6.m0;
import d6.o;
import gm.l;
import i6.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.Metadata;
import o5.p;
import o5.v;

@Metadata
/* loaded from: classes.dex */
public class FacebookActivity extends x {

    /* renamed from: t */
    public r f5828t;

    @Override // androidx.fragment.app.x, android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (a.b(this)) {
            return;
        }
        try {
            l.f(str, "prefix");
            l.f(printWriter, "writer");
            int i10 = l6.a.f19394a;
            if (l.a(null, Boolean.TRUE)) {
                return;
            }
            super.dump(str, fileDescriptor, printWriter, strArr);
        } catch (Throwable th2) {
            a.a(this, th2);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        l.f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        r rVar = this.f5828t;
        if (rVar == null) {
            return;
        }
        rVar.onConfigurationChanged(configuration);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v9, types: [androidx.fragment.app.r, androidx.fragment.app.o, d6.o] */
    @Override // androidx.fragment.app.x, androidx.activity.ComponentActivity, x0.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        n6.r rVar;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!v.h()) {
            m0 m0Var = m0.f12709a;
            Context applicationContext = getApplicationContext();
            l.e(applicationContext, "applicationContext");
            v.k(applicationContext);
        }
        setContentView(R.layout.com_facebook_activity_layout);
        if (l.a("PassThrough", intent.getAction())) {
            Intent intent2 = getIntent();
            e0 e0Var = e0.f12668a;
            l.e(intent2, "requestIntent");
            p j10 = e0.j(e0.m(intent2));
            Intent intent3 = getIntent();
            l.e(intent3, "intent");
            setResult(0, e0.f(intent3, null, j10));
            finish();
            return;
        }
        Intent intent4 = getIntent();
        k0 J = J();
        l.e(J, "supportFragmentManager");
        r E = J.E("SingleFragment");
        if (E == null) {
            if (l.a("FacebookDialogFragment", intent4.getAction())) {
                ?? oVar = new o();
                oVar.a1();
                oVar.h1(J, "SingleFragment");
                rVar = oVar;
            } else {
                n6.r rVar2 = new n6.r();
                rVar2.a1();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(J);
                aVar.g(R.id.com_facebook_fragment_container, rVar2, "SingleFragment", 1);
                aVar.d();
                rVar = rVar2;
            }
            E = rVar;
        }
        this.f5828t = E;
    }
}
