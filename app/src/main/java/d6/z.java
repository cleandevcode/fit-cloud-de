package d6;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import d6.y;
import p5.m;

/* loaded from: classes.dex */
public final class z implements InstallReferrerStateListener {

    /* renamed from: a */
    public final /* synthetic */ InstallReferrerClient f12823a;

    /* renamed from: b */
    public final /* synthetic */ y.a f12824b;

    public z(o4.a aVar, m.a.C0431a c0431a) {
        this.f12823a = aVar;
        this.f12824b = c0431a;
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void a(int i10) {
        if (i6.a.b(this)) {
            return;
        }
        if (i10 != 0) {
            if (i10 != 2) {
                return;
            }
        } else {
            try {
                try {
                    String string = this.f12823a.a().f5656a.getString("install_referrer");
                    if (string != null && (om.l.c0(string, "fb", false) || om.l.c0(string, "facebook", false))) {
                        this.f12824b.a(string);
                    }
                } catch (RemoteException unused) {
                    return;
                }
            } catch (Throwable th2) {
                i6.a.a(this, th2);
                return;
            }
        }
        y.a();
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void b() {
    }
}
