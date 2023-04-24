package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class b<T> implements d<T> {

    /* renamed from: a */
    public final String f5702a;

    /* renamed from: b */
    public final AssetManager f5703b;

    /* renamed from: c */
    public T f5704c;

    public b(AssetManager assetManager, String str) {
        this.f5703b = assetManager;
        this.f5702a = str;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        T t10 = this.f5704c;
        if (t10 == null) {
            return;
        }
        try {
            c(t10);
        } catch (IOException unused) {
        }
    }

    public abstract void c(T t10);

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    public final r4.a d() {
        return r4.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.j jVar, d.a<? super T> aVar) {
        try {
            T f10 = f(this.f5703b, this.f5702a);
            this.f5704c = f10;
            aVar.f(f10);
        } catch (IOException e10) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e10);
            }
            aVar.c(e10);
        }
    }

    public abstract T f(AssetManager assetManager, String str);
}
