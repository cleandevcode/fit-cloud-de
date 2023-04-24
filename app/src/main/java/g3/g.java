package g3;

import android.content.Context;
import android.text.TextUtils;
import r2.c;

/* loaded from: classes.dex */
public final class g implements c.InterfaceC0458c {

    /* renamed from: a */
    public final /* synthetic */ Context f14887a;

    public g(Context context) {
        this.f14887a = context;
    }

    @Override // r2.c.InterfaceC0458c
    public final r2.c a(c.b bVar) {
        Context context = this.f14887a;
        String str = bVar.f25192b;
        c.a aVar = bVar.f25193c;
        if (aVar != null) {
            if (context != null) {
                if (!TextUtils.isEmpty(str)) {
                    return new s2.b(context, str, aVar, true, false);
                }
                throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
            }
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        throw new IllegalArgumentException("Must set a callback to create the configuration.");
    }
}
