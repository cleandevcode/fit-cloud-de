package e8;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: c */
    public static n f13500c;

    /* renamed from: a */
    public final b f13501a;

    /* renamed from: b */
    public GoogleSignInAccount f13502b;

    public n(Context context) {
        b a10 = b.a(context);
        this.f13501a = a10;
        this.f13502b = a10.b();
        a10.c();
    }

    public static synchronized n a(Context context) {
        n nVar;
        synchronized (n.class) {
            Context applicationContext = context.getApplicationContext();
            synchronized (n.class) {
                nVar = f13500c;
                if (nVar == null) {
                    nVar = new n(applicationContext);
                    f13500c = nVar;
                }
            }
            return nVar;
        }
        return nVar;
    }

    public final synchronized void b() {
        b bVar = this.f13501a;
        bVar.f13490a.lock();
        bVar.f13491b.edit().clear().apply();
        bVar.f13490a.unlock();
        this.f13502b = null;
    }
}
