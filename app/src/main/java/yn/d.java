package yn;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class d extends Handler {

    /* renamed from: a */
    public final WeakReference<pl.droidsonroids.gif.b> f31822a;

    public d(pl.droidsonroids.gif.b bVar) {
        super(Looper.getMainLooper());
        this.f31822a = new WeakReference<>(bVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        pl.droidsonroids.gif.b bVar = this.f31822a.get();
        if (bVar == null) {
            return;
        }
        if (message.what == -1) {
            bVar.invalidateSelf();
            return;
        }
        Iterator<a> it = bVar.f24300h.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }
}
