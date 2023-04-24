package o8;

import android.content.Context;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b */
    public static final d f22891b = new d();

    /* renamed from: a */
    public c f22892a = null;

    public static c a(Context context) {
        c cVar;
        d dVar = f22891b;
        synchronized (dVar) {
            if (dVar.f22892a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                dVar.f22892a = new c(context);
            }
            cVar = dVar.f22892a;
        }
        return cVar;
    }
}
