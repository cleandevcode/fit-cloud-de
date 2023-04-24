package com.google.android.gms.dynamite;

import android.content.Context;

/* loaded from: classes.dex */
public final class c {
    public final q8.a a(Context context, String str, a aVar) {
        q8.a aVar2 = new q8.a();
        int a10 = aVar.a(context, str, true);
        aVar2.f24637b = a10;
        if (a10 != 0) {
            aVar2.f24638c = 1;
        } else {
            int b10 = aVar.b(context, str);
            aVar2.f24636a = b10;
            if (b10 != 0) {
                aVar2.f24638c = -1;
            }
        }
        return aVar2;
    }
}
