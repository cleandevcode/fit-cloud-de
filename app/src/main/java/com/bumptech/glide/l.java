package com.bumptech.glide;

import android.os.Trace;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class l implements m5.g<k> {

    /* renamed from: a */
    public boolean f5695a;

    /* renamed from: b */
    public final /* synthetic */ b f5696b;

    /* renamed from: c */
    public final /* synthetic */ List f5697c;

    public l(b bVar, ArrayList arrayList, g5.a aVar) {
        this.f5696b = bVar;
        this.f5697c = arrayList;
    }

    @Override // m5.g
    public final k get() {
        if (!this.f5695a) {
            this.f5695a = true;
            Trace.beginSection("Glide registry");
            try {
                return m.a(this.f5696b, this.f5697c);
            } finally {
                Trace.endSection();
            }
        }
        throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
    }
}
