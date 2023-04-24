package h8;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;

/* loaded from: classes.dex */
public final class g1 implements Runnable {

    /* renamed from: a */
    public final f1 f15954a;

    /* renamed from: b */
    public final /* synthetic */ h1 f15955b;

    public g1(t tVar, f1 f1Var) {
        this.f15955b = tVar;
        this.f15954a = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (!this.f15955b.f15963b) {
            return;
        }
        f8.a aVar = this.f15954a.f15952b;
        int i10 = 0;
        if (aVar.f14170b != 0 && aVar.f14171c != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            h1 h1Var = this.f15955b;
            g gVar = h1Var.f6071a;
            Activity a10 = h1Var.a();
            PendingIntent pendingIntent = aVar.f14171c;
            i8.p.f(pendingIntent);
            int i11 = this.f15954a.f15951a;
            int i12 = GoogleApiActivity.f6047b;
            Intent intent = new Intent(a10, GoogleApiActivity.class);
            intent.putExtra("pending_intent", pendingIntent);
            intent.putExtra("failing_client_id", i11);
            intent.putExtra("notify_manager", false);
            gVar.D(intent, 1);
            return;
        }
        h1 h1Var2 = this.f15955b;
        if (h1Var2.f15966e.a(h1Var2.a(), aVar.f14170b, null) != null) {
            h1 h1Var3 = this.f15955b;
            f8.d dVar = h1Var3.f15966e;
            Activity a11 = h1Var3.a();
            h1 h1Var4 = this.f15955b;
            dVar.h(a11, h1Var4.f6071a, aVar.f14170b, h1Var4);
        } else if (aVar.f14170b == 18) {
            h1 h1Var5 = this.f15955b;
            f8.d dVar2 = h1Var5.f15966e;
            Activity a12 = h1Var5.a();
            h1 h1Var6 = this.f15955b;
            dVar2.getClass();
            ProgressBar progressBar = new ProgressBar(a12, null, 16842874);
            progressBar.setIndeterminate(true);
            progressBar.setVisibility(0);
            AlertDialog.Builder builder = new AlertDialog.Builder(a12);
            builder.setView(progressBar);
            builder.setMessage(i8.x.c(a12, 18));
            builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
            AlertDialog create = builder.create();
            f8.d.f(a12, create, "GooglePlayServicesUpdatingDialog", h1Var6);
            h1 h1Var7 = this.f15955b;
            f8.d dVar3 = h1Var7.f15966e;
            Context applicationContext = h1Var7.a().getApplicationContext();
            a5.b bVar = new a5.b(this, create);
            dVar3.getClass();
            IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentFilter.addDataScheme(WiseOpenHianalyticsData.UNION_PACKAGE);
            h0 h0Var = new h0(bVar);
            int i13 = v8.h.f29174b;
            int i14 = Build.VERSION.SDK_INT;
            if (i14 < 33 && Build.VERSION.CODENAME.charAt(0) != 'T') {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                if (i14 < 33 && Build.VERSION.CODENAME.charAt(0) != 'T') {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (true == z12) {
                    i10 = 2;
                }
                applicationContext.registerReceiver(h0Var, intentFilter, i10);
            } else {
                applicationContext.registerReceiver(h0Var, intentFilter);
            }
            h0Var.f15961a = applicationContext;
            if (!com.google.android.gms.common.a.b(applicationContext)) {
                h1 h1Var8 = this.f15955b;
                h1Var8.f15964c.set(null);
                v8.j jVar = ((t) h1Var8).f16022g.f15938n;
                jVar.sendMessage(jVar.obtainMessage(3));
                if (create.isShowing()) {
                    create.dismiss();
                }
                synchronized (h0Var) {
                    Context context = h0Var.f15961a;
                    if (context != null) {
                        context.unregisterReceiver(h0Var);
                    }
                    h0Var.f15961a = null;
                }
            }
        } else {
            this.f15955b.h(aVar, this.f15954a.f15951a);
        }
    }
}
