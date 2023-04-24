package cj;

import al.j;
import androidx.appcompat.widget.s2;
import bi.r;
import fl.d0;
import fl.k0;
import fl.q;
import gm.l;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kc.v0;
import no.nordicsemi.android.dfu.DfuServiceInitiator;
import og.u;
import p000do.a;
import rh.b0;
import rh.z;
import tk.o;
import wi.w;
import wi.x;
import yk.a;

/* loaded from: classes2.dex */
public final class h implements a {

    /* renamed from: a */
    public final String f4887a;

    /* renamed from: b */
    public final i f4888b;

    /* renamed from: c */
    public final o f4889c;

    /* renamed from: d */
    public final ql.b<bj.b> f4890d;

    /* renamed from: e */
    public volatile boolean f4891e;

    /* renamed from: f */
    public final ql.a<lc.g> f4892f;

    /* renamed from: g */
    public boolean f4893g;

    /* renamed from: h */
    public bj.f f4894h;

    /* renamed from: i */
    public final ReentrantLock f4895i;

    /* renamed from: j */
    public final Condition f4896j;

    /* renamed from: k */
    public boolean f4897k;

    /* renamed from: l */
    public volatile boolean f4898l;

    /* renamed from: m */
    public final AtomicInteger f4899m;

    /* renamed from: n */
    public final ArrayBlockingQueue<byte[]> f4900n;

    /* renamed from: o */
    public final tl.i f4901o;

    /* renamed from: p */
    public final Future<?> f4902p;

    /* renamed from: q */
    public final j f4903q;

    public h(String str, x.a aVar, ExecutorService executorService, o oVar, ql.b bVar) {
        l.f(str, "deviceMacAddress");
        l.f(executorService, "receiveQueueExecutor");
        l.f(oVar, "receiveCallbackScheduler");
        l.f(bVar, "receiveProtocolPacketSubject");
        this.f4887a = str;
        this.f4888b = aVar;
        this.f4889c = oVar;
        this.f4890d = bVar;
        this.f4891e = true;
        this.f4892f = new ql.a<>(null);
        this.f4894h = new bj.f();
        ReentrantLock reentrantLock = new ReentrantLock(true);
        this.f4895i = reentrantLock;
        this.f4896j = reentrantLock.newCondition();
        this.f4899m = new AtomicInteger(1);
        this.f4900n = new ArrayBlockingQueue<>(64, true);
        this.f4901o = new tl.i(g.f4886b);
        this.f4902p = executorService.submit(new s2(11, this));
        tk.i<byte[]> iVar = aVar.f29962d;
        z zVar = new z(2, w.f29956b);
        a.d dVar = yk.a.f31789d;
        a.c cVar = yk.a.f31788c;
        this.f4903q = iVar.k(zVar, dVar, cVar, cVar).y(new ph.o(7, new c(this)), new b0(4, d.f4883b), new wk.a() { // from class: cj.b
            @Override // wk.a
            public final void run() {
                a.b bVar2 = p000do.a.f13275a;
                bVar2.t("Fc#ProtocolQueue");
                bVar2.n("protocolRawChannel onCompleted", new Object[0]);
            }
        });
    }

    public static byte[] c(bj.b bVar, int i10) {
        byte[] bArr;
        byte b10 = bVar.f4397a;
        byte b11 = bVar.f4398b;
        byte[] bArr2 = bVar.f4399c;
        if (bArr2 != null) {
            bArr = new byte[bArr2.length + 3];
            System.arraycopy(bArr2, 0, bArr, 3, bArr2.length);
            bArr[0] = b11;
            bArr[1] = (byte) ((bArr2.length >> 8) & 1);
            bArr[2] = (byte) (bArr2.length & 255);
        } else {
            bArr = new byte[]{b11};
        }
        byte[] bArr3 = new byte[bArr.length + 2];
        bArr3[0] = b10;
        bArr3[1] = 0;
        System.arraycopy(bArr, 0, bArr3, 2, bArr.length);
        return bj.f.b(i10, false, false, bArr3);
    }

    public final void a(boolean z10, int i10) {
        if (this.f4891e) {
            try {
                ((x.a) this.f4888b).a(bj.f.b(i10, z10, true, null));
                return;
            } catch (Exception e10) {
                a.b bVar = p000do.a.f13275a;
                bVar.t("Fc#ProtocolQueue");
                bVar.o(e10, "sendAckPacket error", new Object[0]);
                return;
            }
        }
        a.b bVar2 = p000do.a.f13275a;
        bVar2.t("Fc#ProtocolQueue");
        bVar2.n("sendAckPacket abort sequenceId=%d err=%b abort", Integer.valueOf(i10), Boolean.valueOf(z10));
    }

    public final boolean b(ej.a aVar) {
        boolean z10;
        if (this.f4891e) {
            ej.b bVar = (ej.b) aVar;
            synchronized (bVar.f13817a) {
                z10 = bVar.f13818b.get();
            }
            return z10;
        }
        ql.a<lc.g> aVar2 = this.f4892f;
        aVar2.getClass();
        al.d dVar = new al.d();
        aVar2.d(dVar);
        if (dVar.getCount() != 0) {
            try {
                dVar.await();
            } catch (InterruptedException e10) {
                dVar.c();
                throw kl.d.d(e10);
            }
        }
        Throwable th2 = dVar.f609b;
        if (th2 == null) {
            Object obj = dVar.f608a;
            if (obj != null) {
                throw ((Throwable) obj);
            }
            throw new NoSuchElementException();
        }
        throw kl.d.d(th2);
    }

    public final k0 d() {
        ql.b<bj.b> bVar = this.f4890d;
        tk.i<R> o10 = this.f4892f.o(new wi.f(3, e.f4884b));
        bVar.getClass();
        Objects.requireNonNull(o10, "other is null");
        tk.i v10 = tk.i.v(bVar, o10);
        o oVar = this.f4889c;
        v10.getClass();
        int i10 = tk.d.f28269a;
        Objects.requireNonNull(oVar, "scheduler is null");
        yk.b.a(i10, "bufferSize");
        return new k0(v10, oVar, true, i10);
    }

    public final k0 e() {
        ql.b bVar = (ql.b) this.f4901o.getValue();
        tk.i<R> o10 = this.f4892f.o(new u(4, f.f4885b));
        bVar.getClass();
        Objects.requireNonNull(o10, "other is null");
        tk.i v10 = tk.i.v(bVar, o10);
        o oVar = this.f4889c;
        v10.getClass();
        int i10 = tk.d.f28269a;
        Objects.requireNonNull(oVar, "scheduler is null");
        yk.b.a(i10, "bufferSize");
        return new k0(v10, oVar, true, i10);
    }

    public final tk.a f(int i10) {
        i iVar = this.f4888b;
        byte[] b10 = bj.f.b(i10, false, true, null);
        x.a aVar = (x.a) iVar;
        aVar.getClass();
        a.b bVar = p000do.a.f13275a;
        bVar.t("Fc#FcConnection");
        bVar.h("Send Data:%s", r.h(b10));
        if (b10.length <= aVar.f29960b) {
            q e10 = aVar.f29959a.e(aVar.f29961c, b10);
            e10.getClass();
            return new bl.e(e10);
        }
        v0.a c10 = aVar.f29959a.c();
        c10.c(b10);
        c10.b(aVar.f29961c);
        c10.a(aVar.f29960b);
        tk.i<byte[]> build = c10.build();
        build.getClass();
        return new d0(build);
    }

    public final void g(bj.b bVar, ej.a aVar) {
        l.f(bVar, "packet");
        l.f(aVar, "releaseSemaphore");
        this.f4895i.lock();
        try {
            a.b bVar2 = p000do.a.f13275a;
            bVar2.t("Fc#ProtocolQueue");
            bVar2.n("sendProtocolPacket lock start", new Object[0]);
            while (true) {
                if ((this.f4893g || this.f4894h.f4406a) && !b(aVar)) {
                    a.b bVar3 = p000do.a.f13275a;
                    bVar3.t("Fc#ProtocolQueue");
                    bVar3.n("sendProtocolPacket wait stateCanSend", new Object[0]);
                    this.f4896j.await(500L, TimeUnit.MILLISECONDS);
                }
            }
            if (b(aVar)) {
                a.b bVar4 = p000do.a.f13275a;
                bVar4.t("Fc#ProtocolQueue");
                bVar4.n("sendProtocolPacket lock end", new Object[0]);
            } else {
                int i10 = this.f4899m.get();
                this.f4893g = true;
                byte[] c10 = c(bVar, i10);
                this.f4897k = false;
                Exception e10 = null;
                int i11 = 0;
                do {
                    try {
                        ((x.a) this.f4888b).a(c10);
                        this.f4896j.await(DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT, TimeUnit.MILLISECONDS);
                    } catch (Exception e11) {
                        e10 = e11;
                        i11 = 3;
                    }
                    i11++;
                    if (this.f4897k || i11 >= 3) {
                        break;
                    }
                } while (!b(aVar));
                this.f4893g = false;
                this.f4899m.incrementAndGet();
                if (e10 == null) {
                    if (this.f4897k) {
                        a.b bVar5 = p000do.a.f13275a;
                        bVar5.t("Fc#ProtocolQueue");
                        bVar5.n("sendProtocolPacket lock end", new Object[0]);
                    } else {
                        throw new yi.a(c10);
                    }
                } else {
                    a.b bVar6 = p000do.a.f13275a;
                    bVar6.t("Fc#ProtocolQueue");
                    bVar6.o(e10, "sendProtocolPacket error", new Object[0]);
                    throw e10;
                }
            }
            this.f4895i.unlock();
        } catch (Throwable th2) {
            a.b bVar7 = p000do.a.f13275a;
            bVar7.t("Fc#ProtocolQueue");
            bVar7.n("sendProtocolPacket lock end", new Object[0]);
            this.f4895i.unlock();
            throw th2;
        }
    }
}
