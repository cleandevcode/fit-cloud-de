package h8;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class h1 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: b */
    public volatile boolean f15963b;

    /* renamed from: c */
    public final AtomicReference f15964c;

    /* renamed from: d */
    public final v8.j f15965d;

    /* renamed from: e */
    public final f8.d f15966e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(g gVar) {
        super(gVar);
        f8.d dVar = f8.d.f14180d;
        this.f15964c = new AtomicReference(null);
        this.f15965d = new v8.j(Looper.getMainLooper());
        this.f15966e = dVar;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void b(int i10, int i11, Intent intent) {
        f1 f1Var = (f1) this.f15964c.get();
        if (i10 != 1) {
            if (i10 == 2) {
                int c10 = this.f15966e.c(a());
                if (c10 == 0) {
                    this.f15964c.set(null);
                    v8.j jVar = ((t) this).f16022g.f15938n;
                    jVar.sendMessage(jVar.obtainMessage(3));
                    return;
                } else if (f1Var == null) {
                    return;
                } else {
                    if (f1Var.f15952b.f14170b == 18 && c10 == 18) {
                        return;
                    }
                }
            }
        } else if (i11 == -1) {
            this.f15964c.set(null);
            v8.j jVar2 = ((t) this).f16022g.f15938n;
            jVar2.sendMessage(jVar2.obtainMessage(3));
            return;
        } else if (i11 == 0) {
            if (f1Var == null) {
                return;
            }
            int i12 = 13;
            if (intent != null) {
                i12 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
            }
            h(new f8.a(1, i12, null, f1Var.f15952b.toString()), f1Var.f15951a);
            return;
        }
        if (f1Var != null) {
            h(f1Var.f15952b, f1Var.f15951a);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void c(Bundle bundle) {
        if (bundle != null) {
            this.f15964c.set(bundle.getBoolean("resolving_error", false) ? new f1(new f8.a(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void e(Bundle bundle) {
        f1 f1Var = (f1) this.f15964c.get();
        if (f1Var == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", f1Var.f15951a);
        bundle.putInt("failed_status", f1Var.f15952b.f14170b);
        bundle.putParcelable("failed_resolution", f1Var.f15952b.f14171c);
    }

    public final void h(f8.a aVar, int i10) {
        this.f15964c.set(null);
        ((t) this).f16022g.h(aVar, i10);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i10;
        f8.a aVar = new f8.a(13, null);
        f1 f1Var = (f1) this.f15964c.get();
        if (f1Var == null) {
            i10 = -1;
        } else {
            i10 = f1Var.f15951a;
        }
        h(aVar, i10);
    }
}
