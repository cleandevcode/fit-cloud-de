package t3;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import gm.j;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public final class a implements c4.e, c4.a, c4.d, c4.b {

    /* renamed from: f */
    public static String f27524f;

    /* renamed from: a */
    public final f f27525a;

    /* renamed from: b */
    public b4.a f27526b;

    /* renamed from: c */
    public a.e f27527c;

    /* renamed from: d */
    public c4.c f27528d;

    /* renamed from: e */
    public c4.b f27529e;

    /* renamed from: t3.a$a */
    /* loaded from: classes.dex */
    public class RunnableC0492a implements Runnable {
        public RunnableC0492a() {
            a.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.getClass();
            a.this.getClass();
        }
    }

    /* loaded from: classes.dex */
    public class b implements c4.g {
        @Override // c4.g
        public final void a() {
            j.e("AliAgentImpl", "onIotConnected onSendSuccess...");
        }

        @Override // c4.g
        public final void b(int i10, String str) {
            j.e("AliAgentImpl", "onIotConnected onSendFailed..." + str + " errorCode ==> " + i10);
        }
    }

    public a(Context context) {
        new RunnableC0492a();
        if (f.f27551j == null) {
            synchronized (f.class) {
                if (f.f27551j == null) {
                    f.f27551j = new f(context);
                }
            }
        }
        f fVar = f.f27551j;
        this.f27525a = fVar;
        if (this.f27526b == null) {
            this.f27526b = new e(context);
        }
        this.f27527c = new a.e(context);
        if (fVar != null) {
            if (!fVar.f27555d.contains(this)) {
                fVar.f27555d.add(this);
            }
            if (!fVar.f27556e.contains(this)) {
                fVar.f27556e.add(this);
            }
            if (!fVar.f27554c.contains(this)) {
                fVar.f27554c.add(this);
            }
        }
        b4.a aVar = this.f27526b;
        if (aVar != null) {
            aVar.a(this);
        }
        HandlerThread handlerThread = new HandlerThread("aliAgent");
        handlerThread.start();
        new Handler(handlerThread.getLooper());
    }

    @Override // c4.b
    public final void a(int i10, String str) {
        if (this.f27526b == null) {
            j.e("AliAgentImpl", "onIotConnectFailure ==> " + str + " code " + i10);
            return;
        }
        if (4 == i10) {
            this.f27526b.b(x3.b.b((byte) 1), null);
        } else if (32103 == i10) {
            this.f27526b.b(x3.b.b((byte) 2), null);
        }
        c4.b bVar = this.f27529e;
        if (bVar != null) {
            bVar.a(i10, str);
        }
    }

    @Override // c4.b
    public final void b() {
        StringBuilder a10 = android.support.v4.media.d.a("onIotDisconnected...");
        a10.append(this.f27526b);
        j.e("AliAgentImpl", a10.toString());
        c4.b bVar = this.f27529e;
        if (bVar != null) {
            bVar.b();
        }
    }

    @Override // c4.b
    public final void c() {
        StringBuilder a10 = android.support.v4.media.d.a("onIotConnected...");
        a10.append(this.f27526b);
        j.e("AliAgentImpl", a10.toString());
        if (this.f27526b != null) {
            this.f27526b.b(x3.b.b((byte) 0), new b());
        }
        c4.b bVar = this.f27529e;
        if (bVar != null) {
            bVar.c();
        }
    }

    @Override // c4.e
    public final void d(String str, long j10, String str2) {
        a.e eVar;
        j.e("AliAgentImpl", "onID2Dispatch ==> topicFragment:" + str);
        j.e("AliAgentImpl", "onID2Dispatch ==> data:" + str2);
        j.e("AliAgentImpl", "onID2Dispatch ==> msgId:" + j10);
        if (this.f27526b != null && (eVar = this.f27527c) != null) {
            String f10 = eVar.f3a.f(new d4.c(eVar.f3a.f(new d4.a(str, str2))));
            String b10 = a.b.b("send to bt id2 ==> ", f10);
            if (!j.f15503a) {
                Log.d("SobLog", b10);
            }
            this.f27526b.b(f10.getBytes(StandardCharsets.UTF_8), new c(this, str));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00a1, code lost:
        if (r5 == 1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00a3, code lost:
        if (r5 == 2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00a5, code lost:
        if (r5 == 3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00a7, code lost:
        android.util.Log.d("DefaultDataHandler", "无法识别的sid：" + r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00bc, code lost:
        r0 = new java.lang.StringBuilder();
        r2 = r1.f27553b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c3, code lost:
        if (r2 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c5, code lost:
        r2 = r2.f4919o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00c8, code lost:
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00ca, code lost:
        r0.append(r2);
        r0.append("/event/WearCommonEvent/post");
        r0 = r0.toString();
        r13 = r13.f12623b;
        r2 = new a.f(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00de, code lost:
        a.e.a(r13, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00e2, code lost:
        r13 = (d4.a) r0.f3a.b(r13.f12623b, d4.a.class);
        r0 = r13.f12620a;
        r13 = r13.f12621b;
        r2 = new a.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00f7, code lost:
        r1.c(r0, r13, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(byte[] r13) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.a.e(byte[]):void");
    }
}
