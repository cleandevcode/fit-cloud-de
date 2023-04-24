package kd;

import android.bluetooth.BluetoothDevice;
import com.realsil.sdk.bbpro.internal.BaseBeeProManager;
import ed.f;
import ed.g;
import h4.l;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kd.d;
import no.nordicsemi.android.dfu.DfuBaseService;
import yb.y;

/* loaded from: classes.dex */
public abstract class c<MCB extends d> {

    /* renamed from: f */
    public static boolean f18443f = true;

    /* renamed from: g */
    public static boolean f18444g = false;

    /* renamed from: h */
    public static final UUID f18445h = de.a.a(DfuBaseService.ERROR_REMOTE_TYPE_LEGACY);

    /* renamed from: i */
    public static final UUID f18446i;

    /* renamed from: a */
    public BaseBeeProManager f18447a;

    /* renamed from: b */
    public CopyOnWriteArrayList f18448b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public ed.c f18449c;

    /* renamed from: d */
    public ConcurrentHashMap f18450d;

    /* renamed from: e */
    public final b f18451e;

    /* loaded from: classes.dex */
    public class a extends f {
        public a() {
            c.this = r1;
        }

        @Override // ed.f
        public final void a(ed.a aVar) {
            c.this.b(aVar);
        }

        @Override // ed.f
        public final void b(BluetoothDevice bluetoothDevice, int i10) {
            c.this.getClass();
        }

        @Override // ed.f
        public final void c(g gVar) {
            c.this.d(gVar);
        }
    }

    /* loaded from: classes.dex */
    public class b extends yc.c {
        public b() {
            c.this = r1;
        }

        @Override // yc.c
        public final void a() {
        }

        @Override // yc.c
        public final void b(int i10, nd.b bVar) {
            c.this.c(i10, bVar);
        }

        @Override // yc.c
        public final void c(int i10) {
            if (i10 == 264) {
                c.this.getClass();
                new l(0, 1);
            }
            c cVar = c.this;
            CopyOnWriteArrayList copyOnWriteArrayList = cVar.f18448b;
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                Iterator it = cVar.f18448b.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).getClass();
                }
            } else if (c.f18444g) {
                ge.b.n("no callback registered");
            }
        }
    }

    static {
        de.a.a(DfuBaseService.ERROR_REMOTE_TYPE_SECURE);
        de.a.a(768);
        f18446i = de.a.a(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
    }

    public c() {
        this.f18450d = new ConcurrentHashMap();
        a aVar = new a();
        this.f18451e = new b();
        f18443f = rd.b.f25539b;
        f18444g = rd.b.f25540c;
        this.f18450d = new ConcurrentHashMap();
        new ThreadPoolExecutor(10, 10, 1000L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadPoolExecutor.AbortPolicy());
        if (this.f18449c == null) {
            ed.c l10 = ed.c.l();
            this.f18449c = l10;
            l10.b(aVar);
        }
    }

    public final void a(byte b10, int i10) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f18448b;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            if (f18444g) {
                ge.b.n("no callback registered");
                return;
            }
            return;
        }
        Iterator it = this.f18448b.iterator();
        while (it.hasNext()) {
            ((d) it.next()).a(b10, i10);
        }
    }

    public abstract void b(ed.a aVar);

    public void c(int i10, nd.b bVar) {
    }

    public abstract void d(g gVar);

    public final void e(MCB mcb) {
        if (mcb == null) {
            return;
        }
        if (this.f18448b == null) {
            this.f18448b = new CopyOnWriteArrayList();
        }
        if (!this.f18448b.contains(mcb)) {
            this.f18448b.add(mcb);
        }
        boolean z10 = f18444g;
        StringBuilder a10 = android.support.v4.media.d.a("mCallbacks.size=");
        a10.append(this.f18448b.size());
        ge.b.o(a10.toString(), z10);
    }

    public final l f(y yVar) {
        if (f18444g) {
            ge.b.n(yVar.toString());
        }
        ed.c cVar = this.f18449c;
        BaseBeeProManager baseBeeProManager = this.f18447a;
        if (baseBeeProManager != null) {
            baseBeeProManager.k();
        }
        if (cVar.e(yVar.j())) {
            return new l(0, 1);
        }
        return new l("sendCommand failed");
    }

    public final l g(ed.b bVar) {
        BaseBeeProManager baseBeeProManager = this.f18447a;
        return baseBeeProManager == null ? new l(16, 1) : baseBeeProManager.n(bVar);
    }

    public final void h(wc.b bVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f18448b;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(bVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x004e, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(java.util.UUID r6) {
        /*
            r5 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r5.f18450d
            if (r0 != 0) goto L5
            return
        L5:
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L51
            java.lang.Object r1 = r0.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.util.concurrent.ConcurrentHashMap r3 = r5.f18450d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r3.get(r1)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L4d
            int r3 = r1.size()
            if (r3 > 0) goto L33
            goto L4d
        L33:
            java.util.Iterator r1 = r1.iterator()
        L37:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L4d
            java.lang.Object r3 = r1.next()
            kd.e r3 = (kd.e) r3
            r3.getClass()
            boolean r4 = r6.equals(r2)
            if (r4 == 0) goto L37
            goto L4e
        L4d:
            r3 = r2
        L4e:
            if (r3 == 0) goto Ld
            goto L52
        L51:
            r3 = r2
        L52:
            if (r3 != 0) goto L55
            return
        L55:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kd.c.i(java.util.UUID):void");
    }
}
