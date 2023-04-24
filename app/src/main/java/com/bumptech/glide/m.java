package com.bumptech.glide;

import a0.r1;
import a5.b0;
import a5.e0;
import a5.q;
import a5.u;
import a5.w;
import a5.y;
import a5.z;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import b5.a;
import c5.a;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import h5.a;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import x4.a;
import x4.b;
import x4.c;
import x4.d;
import x4.e;
import x4.j;
import x4.s;
import x4.t;
import x4.u;
import x4.v;
import x4.w;
import y4.a;
import y4.b;
import y4.c;
import y4.d;
import y4.g;

/* loaded from: classes.dex */
public final class m {
    public static k a(b bVar, List list) {
        r4.j gVar;
        r4.j zVar;
        Class cls;
        Class cls2;
        int i10;
        u4.d dVar = bVar.f5660a;
        u4.b bVar2 = bVar.f5663d;
        Context applicationContext = bVar.f5662c.getApplicationContext();
        i iVar = bVar.f5662c.f5675h;
        k kVar = new k();
        a5.l lVar = new a5.l();
        r1 r1Var = kVar.f5691g;
        synchronized (r1Var) {
            r1Var.f176a.add(lVar);
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 27) {
            q qVar = new q();
            r1 r1Var2 = kVar.f5691g;
            synchronized (r1Var2) {
                r1Var2.f176a.add(qVar);
            }
        }
        Resources resources = applicationContext.getResources();
        ArrayList d10 = kVar.d();
        e5.a aVar = new e5.a(applicationContext, d10, dVar, bVar2);
        e0 e0Var = new e0(dVar, new e0.g());
        a5.n nVar = new a5.n(kVar.d(), resources.getDisplayMetrics(), dVar, bVar2);
        if (i11 >= 28 && iVar.f5678a.containsKey(d.class)) {
            zVar = new u();
            gVar = new a5.h();
        } else {
            gVar = new a5.g(nVar);
            zVar = new z(nVar, bVar2);
        }
        if (i11 < 28) {
            cls = q4.a.class;
            cls2 = Integer.class;
            i10 = i11;
        } else {
            i10 = i11;
            cls2 = Integer.class;
            cls = q4.a.class;
            kVar.c(new a.c(new c5.a(d10, bVar2)), InputStream.class, Drawable.class, "Animation");
            kVar.c(new a.b(new c5.a(d10, bVar2)), ByteBuffer.class, Drawable.class, "Animation");
        }
        c5.e eVar = new c5.e(applicationContext);
        s.c cVar = new s.c(resources);
        s.d dVar2 = new s.d(resources);
        s.b bVar3 = new s.b(resources);
        s.a aVar2 = new s.a(resources);
        a5.c cVar2 = new a5.c(bVar2);
        f5.a aVar3 = new f5.a();
        h7.a aVar4 = new h7.a((Object) null);
        ContentResolver contentResolver = applicationContext.getContentResolver();
        a.g gVar2 = new a.g(1);
        h5.a aVar5 = kVar.f5686b;
        synchronized (aVar5) {
            aVar5.f15869a.add(new a.C0283a(ByteBuffer.class, gVar2));
        }
        x2.i iVar2 = new x2.i(2, bVar2);
        h5.a aVar6 = kVar.f5686b;
        synchronized (aVar6) {
            aVar6.f15869a.add(new a.C0283a(InputStream.class, iVar2));
        }
        kVar.c(gVar, ByteBuffer.class, Bitmap.class, "Bitmap");
        kVar.c(zVar, InputStream.class, Bitmap.class, "Bitmap");
        String str = Build.FINGERPRINT;
        if (!"robolectric".equals(str)) {
            kVar.c(new w(nVar), ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
        }
        kVar.c(e0Var, ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
        kVar.c(new e0(dVar, new e0.c()), AssetFileDescriptor.class, Bitmap.class, "Bitmap");
        u.a<?> aVar7 = u.a.f30268a;
        kVar.a(Bitmap.class, Bitmap.class, aVar7);
        kVar.c(new b0(), Bitmap.class, Bitmap.class, "Bitmap");
        kVar.b(Bitmap.class, cVar2);
        kVar.c(new a5.a(resources, gVar), ByteBuffer.class, BitmapDrawable.class, "BitmapDrawable");
        kVar.c(new a5.a(resources, zVar), InputStream.class, BitmapDrawable.class, "BitmapDrawable");
        kVar.c(new a5.a(resources, e0Var), ParcelFileDescriptor.class, BitmapDrawable.class, "BitmapDrawable");
        kVar.b(BitmapDrawable.class, new a5.b(dVar, cVar2));
        kVar.c(new e5.i(d10, aVar, bVar2), InputStream.class, e5.c.class, "Animation");
        kVar.c(aVar, ByteBuffer.class, e5.c.class, "Animation");
        kVar.b(e5.c.class, new a.g(2));
        Class cls3 = cls;
        kVar.a(cls3, cls3, aVar7);
        kVar.c(new e5.g(dVar), cls3, Bitmap.class, "Bitmap");
        kVar.c(eVar, Uri.class, Drawable.class, "legacy_append");
        kVar.c(new y(eVar, dVar), Uri.class, Bitmap.class, "legacy_append");
        kVar.g(new a.C0050a());
        kVar.a(File.class, ByteBuffer.class, new c.b());
        kVar.a(File.class, InputStream.class, new e.C0552e());
        kVar.c(new d5.a(), File.class, File.class, "legacy_append");
        kVar.a(File.class, ParcelFileDescriptor.class, new e.b());
        kVar.a(File.class, File.class, aVar7);
        kVar.g(new k.a(bVar2));
        if (!"robolectric".equals(str)) {
            kVar.g(new ParcelFileDescriptorRewinder.a());
        }
        Class cls4 = Integer.TYPE;
        kVar.a(cls4, InputStream.class, cVar);
        kVar.a(cls4, ParcelFileDescriptor.class, bVar3);
        Class cls5 = cls2;
        kVar.a(cls5, InputStream.class, cVar);
        kVar.a(cls5, ParcelFileDescriptor.class, bVar3);
        kVar.a(cls5, Uri.class, dVar2);
        kVar.a(cls4, AssetFileDescriptor.class, aVar2);
        kVar.a(cls5, AssetFileDescriptor.class, aVar2);
        kVar.a(cls4, Uri.class, dVar2);
        kVar.a(String.class, InputStream.class, new d.c());
        kVar.a(Uri.class, InputStream.class, new d.c());
        kVar.a(String.class, InputStream.class, new t.c());
        kVar.a(String.class, ParcelFileDescriptor.class, new t.b());
        kVar.a(String.class, AssetFileDescriptor.class, new t.a());
        kVar.a(Uri.class, InputStream.class, new a.c(applicationContext.getAssets()));
        kVar.a(Uri.class, AssetFileDescriptor.class, new a.b(applicationContext.getAssets()));
        kVar.a(Uri.class, InputStream.class, new b.a(applicationContext));
        kVar.a(Uri.class, InputStream.class, new c.a(applicationContext));
        int i12 = i10;
        if (i12 >= 29) {
            kVar.a(Uri.class, InputStream.class, new d.c(applicationContext));
            kVar.a(Uri.class, ParcelFileDescriptor.class, new d.b(applicationContext));
        }
        kVar.a(Uri.class, InputStream.class, new v.d(contentResolver));
        kVar.a(Uri.class, ParcelFileDescriptor.class, new v.b(contentResolver));
        kVar.a(Uri.class, AssetFileDescriptor.class, new v.a(contentResolver));
        kVar.a(Uri.class, InputStream.class, new w.a());
        kVar.a(URL.class, InputStream.class, new g.a());
        kVar.a(Uri.class, File.class, new j.a(applicationContext));
        kVar.a(x4.f.class, InputStream.class, new a.C0572a());
        kVar.a(byte[].class, ByteBuffer.class, new b.a());
        kVar.a(byte[].class, InputStream.class, new b.d());
        kVar.a(Uri.class, Uri.class, aVar7);
        kVar.a(Drawable.class, Drawable.class, aVar7);
        kVar.c(new c5.f(), Drawable.class, Drawable.class, "legacy_append");
        kVar.h(Bitmap.class, BitmapDrawable.class, new f.s(resources));
        kVar.h(Bitmap.class, byte[].class, aVar3);
        kVar.h(Drawable.class, byte[].class, new f5.b(dVar, aVar3, aVar4));
        kVar.h(e5.c.class, byte[].class, aVar4);
        if (i12 >= 23) {
            e0 e0Var2 = new e0(dVar, new e0.d());
            kVar.c(e0Var2, ByteBuffer.class, Bitmap.class, "legacy_append");
            kVar.c(new a5.a(resources, e0Var2), ByteBuffer.class, BitmapDrawable.class, "legacy_append");
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g5.c cVar3 = (g5.c) it.next();
            try {
                cVar3.a();
            } catch (AbstractMethodError e10) {
                StringBuilder a10 = android.support.v4.media.d.a("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ");
                a10.append(cVar3.getClass().getName());
                throw new IllegalStateException(a10.toString(), e10);
            }
        }
        return kVar;
    }
}
