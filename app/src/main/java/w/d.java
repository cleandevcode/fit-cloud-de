package w;

import android.os.Parcel;
import bi.m0;
import com.polidea.rxandroidble3.internal.RxBleLog;
import com.topstep.fitcloud.pro.model.data.EcgReport;
import g8.a;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import mf.l0;

/* loaded from: classes.dex */
public final class d implements h8.m {

    /* renamed from: a */
    public Object f29489a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(int i10) {
        this(TimeUnit.MINUTES);
        if (i10 == 3) {
            this.f29489a = new ConcurrentHashMap();
        } else if (i10 == 6) {
            this.f29489a = new AtomicBoolean(false);
        } else {
            switch (i10) {
                case 8:
                    this.f29489a = m0.k("yyyy-MMM");
                    return;
                case 9:
                    return;
                case 10:
                    return;
                default:
                    this.f29489a = new ArrayList();
                    return;
            }
        }
    }

    public /* synthetic */ d(TimeUnit timeUnit) {
        gm.l.f(timeUnit, "timeUnit");
        this.f29489a = new dn.j(cn.d.f4967h, timeUnit);
    }

    public static void c(r2.f fVar, rg.d dVar) {
        boolean z10;
        String e10;
        boolean z11;
        fVar.H(1, dVar.f25610a);
        UUID uuid = dVar.f25611b;
        gm.l.f(uuid, "uuid");
        String uuid2 = uuid.toString();
        gm.l.e(uuid2, "uuid.toString()");
        fVar.p(2, uuid2);
        Date date = dVar.f25612c;
        k.f.b(date, "date", date, fVar, 3);
        fVar.H(4, dVar.f25613d);
        fVar.H(5, dVar.f25614e);
        fVar.H(6, dVar.f25615f);
        fVar.H(7, dVar.f25616g);
        String str = dVar.f25617h;
        if (str == null) {
            fVar.m0(8);
        } else {
            fVar.p(8, str);
        }
        List<Integer> list = dVar.f25618i;
        if (list != null && !list.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        String str2 = null;
        if (z10) {
            e10 = null;
        } else {
            e10 = qg.a.f24816a.b(l0.d(List.class, Integer.class)).e(list);
        }
        if (e10 == null) {
            fVar.m0(9);
        } else {
            fVar.p(9, e10);
        }
        List<EcgReport> list2 = dVar.f25619j;
        if (list2 != null && !list2.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            str2 = qg.a.f24816a.b(l0.d(List.class, EcgReport.class)).e(list2);
        }
        if (str2 == null) {
            fVar.m0(10);
        } else {
            fVar.p(10, str2);
        }
        fVar.H(11, dVar.f25620k);
    }

    @Override // h8.m
    public final void a(a.e eVar, Object obj) {
        i8.s sVar = (i8.s) this.f29489a;
        g9.h hVar = (g9.h) obj;
        g8.a aVar = k8.c.f18204k;
        k8.a aVar2 = (k8.a) ((k8.d) eVar).u();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(aVar2.f29169b);
        int i10 = v8.c.f29171a;
        if (sVar == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            sVar.writeToParcel(obtain, 0);
        }
        try {
            aVar2.f29168a.transact(1, obtain, null, 1);
            obtain.recycle();
            hVar.a(null);
        } catch (Throwable th2) {
            obtain.recycle();
            throw th2;
        }
    }

    public final synchronized void b() {
        while (!((AtomicBoolean) this.f29489a).get()) {
            try {
                wait();
            } catch (InterruptedException e10) {
                if (!((AtomicBoolean) this.f29489a).get()) {
                    RxBleLog.w(e10, "Queue's awaitRelease() has been interrupted abruptly while it wasn't released by the release() method.", new Object[0]);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00d6 A[Catch: all -> 0x014b, Exception -> 0x014d, TryCatch #0 {Exception -> 0x014d, blocks: (B:89:0x0016, B:90:0x0058, B:92:0x005e, B:96:0x006f, B:102:0x008e, B:106:0x00b1, B:111:0x00bf, B:119:0x00f9, B:124:0x0107, B:132:0x0133, B:131:0x0116, B:122:0x0101, B:118:0x00d6, B:109:0x00b9, B:105:0x00ab, B:99:0x0080, B:95:0x006b), top: B:154:0x0016, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0101 A[Catch: all -> 0x014b, Exception -> 0x014d, TryCatch #0 {Exception -> 0x014d, blocks: (B:89:0x0016, B:90:0x0058, B:92:0x005e, B:96:0x006f, B:102:0x008e, B:106:0x00b1, B:111:0x00bf, B:119:0x00f9, B:124:0x0107, B:132:0x0133, B:131:0x0116, B:122:0x0101, B:118:0x00d6, B:109:0x00b9, B:105:0x00ab, B:99:0x0080, B:95:0x006b), top: B:154:0x0016, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0116 A[Catch: all -> 0x014b, Exception -> 0x014d, TryCatch #0 {Exception -> 0x014d, blocks: (B:89:0x0016, B:90:0x0058, B:92:0x005e, B:96:0x006f, B:102:0x008e, B:106:0x00b1, B:111:0x00bf, B:119:0x00f9, B:124:0x0107, B:132:0x0133, B:131:0x0116, B:122:0x0101, B:118:0x00d6, B:109:0x00b9, B:105:0x00ab, B:99:0x0080, B:95:0x006b), top: B:154:0x0016, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.d.d():void");
    }

    public final synchronized void e() {
        if (((AtomicBoolean) this.f29489a).compareAndSet(false, true)) {
            notify();
        }
    }

    public /* synthetic */ d(Object obj) {
        this.f29489a = obj;
    }
}
