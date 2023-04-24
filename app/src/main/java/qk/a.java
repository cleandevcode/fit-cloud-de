package qk;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ c f24938a;

    public a(c cVar) {
        this.f24938a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            c.a(this.f24938a);
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }
}
