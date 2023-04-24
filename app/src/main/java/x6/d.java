package x6;

import android.os.RemoteException;
import x6.b;

/* loaded from: classes.dex */
public final class d implements b.a {

    /* renamed from: a */
    public final /* synthetic */ c f30358a;

    public d(c cVar) {
        this.f30358a = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0037 A[Catch: all -> 0x0116, TryCatch #0 {, blocks: (B:63:0x0009, B:66:0x0011, B:68:0x0015, B:77:0x0037, B:79:0x003c, B:83:0x005f, B:86:0x0083, B:88:0x0087, B:95:0x00ae, B:94:0x00a5, B:96:0x00b2, B:98:0x00bc, B:99:0x00c4, B:101:0x00e8, B:103:0x00f8, B:107:0x010f, B:106:0x010c, B:71:0x0023), top: B:113:0x0009, inners: #1 }] */
    @Override // x6.b.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(double r21, double r23, double r25) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.d.a(double, double, double):void");
    }

    @Override // x6.b.a
    public final void b() {
        Integer num;
        c cVar = this.f30358a;
        synchronized (cVar) {
            y6.d dVar = cVar.f30344h;
            if (cVar.f30345i && dVar != null && (num = dVar.f31179m) != null && num.intValue() == 0) {
                dVar.f31179m = 0;
                cVar.d().a().edit().putInt("coord_type", 0).apply();
                int beginBroadcast = cVar.f30337a.beginBroadcast();
                for (int i10 = 0; i10 < beginBroadcast; i10++) {
                    try {
                        g broadcastItem = cVar.f30337a.getBroadcastItem(i10);
                        gm.l.e(broadcastItem, "callbacks.getBroadcastItem(i)");
                        broadcastItem.g(0);
                    } catch (RemoteException e10) {
                        e10.printStackTrace();
                    }
                }
                cVar.f30337a.finishBroadcast();
                tl.l lVar = tl.l.f28297a;
            }
        }
    }

    @Override // x6.b.a
    public final void c(double d10, double d11) {
        c cVar = this.f30358a;
        synchronized (cVar) {
            int beginBroadcast = cVar.f30337a.beginBroadcast();
            for (int i10 = 0; i10 < beginBroadcast; i10++) {
                try {
                    g broadcastItem = cVar.f30337a.getBroadcastItem(i10);
                    gm.l.e(broadcastItem, "callbacks.getBroadcastItem(i)");
                    broadcastItem.y(d10, d11);
                } catch (RemoteException e10) {
                    e10.printStackTrace();
                }
            }
            cVar.f30337a.finishBroadcast();
            tl.l lVar = tl.l.f28297a;
        }
    }
}
