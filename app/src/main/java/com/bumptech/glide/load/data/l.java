package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class l<T> implements d<T> {

    /* renamed from: a */
    public final Uri f5723a;

    /* renamed from: b */
    public final ContentResolver f5724b;

    /* renamed from: c */
    public T f5725c;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f5724b = contentResolver;
        this.f5723a = uri;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        T t10 = this.f5725c;
        if (t10 != null) {
            try {
                c(t10);
            } catch (IOException unused) {
            }
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

    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Object] */
    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.j jVar, d.a<? super T> aVar) {
        try {
            ?? r32 = (T) f(this.f5724b, this.f5723a);
            this.f5725c = r32;
            aVar.f(r32);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e10);
            }
            aVar.c(e10);
        }
    }

    public abstract Object f(ContentResolver contentResolver, Uri uri);
}
