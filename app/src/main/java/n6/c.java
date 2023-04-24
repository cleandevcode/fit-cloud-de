package n6;

import android.content.ComponentName;
import android.net.Uri;
import android.os.RemoteException;
import java.util.concurrent.locks.ReentrantLock;
import p.f;

/* loaded from: classes.dex */
public final class c extends p.f {

    /* renamed from: a */
    public static p.e f22053a;

    /* renamed from: b */
    public static p.g f22054b;

    /* renamed from: c */
    public static final ReentrantLock f22055c = new ReentrantLock();

    /* loaded from: classes.dex */
    public static final class a {
        public static void a(Uri uri) {
            b();
            c.f22055c.lock();
            p.g gVar = c.f22054b;
            if (gVar != null) {
                try {
                    ((b.b) gVar.f23727b).B((b.a) gVar.f23728c, uri);
                } catch (RemoteException unused) {
                }
            }
            c.f22055c.unlock();
        }

        public static void b() {
            p.e eVar;
            c.f22055c.lock();
            if (c.f22054b == null && (eVar = c.f22053a) != null) {
                p.g gVar = null;
                p.d dVar = new p.d();
                try {
                    if (eVar.f23724a.F(dVar)) {
                        gVar = new p.g(eVar.f23724a, dVar, eVar.f23725b);
                    }
                } catch (RemoteException unused) {
                }
                c.f22054b = gVar;
            }
            c.f22055c.unlock();
        }
    }

    @Override // p.f
    public final void a(ComponentName componentName, f.a aVar) {
        gm.l.f(componentName, "name");
        try {
            aVar.f23724a.u0();
        } catch (RemoteException unused) {
        }
        f22053a = aVar;
        a.b();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        gm.l.f(componentName, "componentName");
    }
}
