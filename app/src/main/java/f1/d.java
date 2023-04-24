package f1;

import android.os.CancellationSignal;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public boolean f14028a;

    /* renamed from: b */
    public b f14029b;

    /* renamed from: c */
    public CancellationSignal f14030c;

    /* renamed from: d */
    public boolean f14031d;

    /* loaded from: classes.dex */
    public static class a {
        public static void a(Object obj) {
            ((CancellationSignal) obj).cancel();
        }

        public static CancellationSignal b() {
            return new CancellationSignal();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void onCancel();
    }

    public final void a() {
        synchronized (this) {
            if (this.f14028a) {
                return;
            }
            this.f14028a = true;
            this.f14031d = true;
            b bVar = this.f14029b;
            CancellationSignal cancellationSignal = this.f14030c;
            if (bVar != null) {
                try {
                    bVar.onCancel();
                } catch (Throwable th2) {
                    synchronized (this) {
                        this.f14031d = false;
                        notifyAll();
                        throw th2;
                    }
                }
            }
            if (cancellationSignal != null) {
                a.a(cancellationSignal);
            }
            synchronized (this) {
                this.f14031d = false;
                notifyAll();
            }
        }
    }

    public final void b(b bVar) {
        synchronized (this) {
            while (this.f14031d) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.f14029b == bVar) {
                return;
            }
            this.f14029b = bVar;
            if (this.f14028a) {
                bVar.onCancel();
            }
        }
    }
}
