package p5;

import o5.v;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f23889a;

    public /* synthetic */ b(int i10) {
        this.f23889a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23889a) {
            case 0:
                c.f23890a.getClass();
                c.a();
                return;
            case 1:
                String str = i.f23913a;
                if (!i6.a.b(i.class)) {
                    try {
                        int i10 = j.f23919a;
                        j.b(i.f23915c);
                        i.f23915c = new e(0, 0);
                        return;
                    } catch (Throwable th2) {
                        i6.a.a(i.class, th2);
                        return;
                    }
                }
                return;
            default:
                y5.d dVar = y5.d.f31147a;
                if (!i6.a.b(y5.d.class)) {
                    try {
                        w5.a aVar = w5.a.f29748a;
                        if (!i6.a.b(w5.a.class)) {
                            w5.a.f29749b = true;
                            d6.u uVar = d6.u.f12789a;
                            w5.a.f29750c = d6.u.b("FBSDKFeatureIntegritySample", v.b(), false);
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        i6.a.a(y5.d.class, th3);
                        return;
                    }
                }
                return;
        }
    }
}
