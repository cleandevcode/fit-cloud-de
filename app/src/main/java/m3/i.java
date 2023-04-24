package m3;

import android.content.Context;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: e */
    public static i f20349e;

    /* renamed from: a */
    public a f20350a;

    /* renamed from: b */
    public b f20351b;

    /* renamed from: c */
    public g f20352c;

    /* renamed from: d */
    public h f20353d;

    public i(Context context, r3.a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f20350a = new a(applicationContext, aVar);
        this.f20351b = new b(applicationContext, aVar);
        this.f20352c = new g(applicationContext, aVar);
        this.f20353d = new h(applicationContext, aVar);
    }

    public static synchronized i a(Context context, r3.a aVar) {
        i iVar;
        synchronized (i.class) {
            if (f20349e == null) {
                f20349e = new i(context, aVar);
            }
            iVar = f20349e;
        }
        return iVar;
    }
}
