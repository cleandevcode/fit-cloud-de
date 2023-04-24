package kc;

import android.content.ContentResolver;
import android.content.Context;

/* loaded from: classes.dex */
public final class j implements v3.c<ContentResolver> {

    /* renamed from: a */
    public final w3.a<Context> f18341a;

    public j(v3.d dVar) {
        this.f18341a = dVar;
    }

    @Override // w3.a
    public final Object get() {
        ContentResolver contentResolver = this.f18341a.get().getContentResolver();
        b0.c.j(contentResolver);
        return contentResolver;
    }
}
