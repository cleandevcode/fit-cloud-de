package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.j0;
import androidx.fragment.app.r;
import com.bumptech.glide.i;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import v4.j;
import w4.a;

/* loaded from: classes.dex */
public final class b implements ComponentCallbacks2 {

    /* renamed from: h */
    public static volatile b f5658h;

    /* renamed from: i */
    public static volatile boolean f5659i;

    /* renamed from: a */
    public final u4.d f5660a;

    /* renamed from: b */
    public final v4.i f5661b;

    /* renamed from: c */
    public final h f5662c;

    /* renamed from: d */
    public final u4.b f5663d;

    /* renamed from: e */
    public final com.bumptech.glide.manager.o f5664e;

    /* renamed from: f */
    public final com.bumptech.glide.manager.c f5665f;

    /* renamed from: g */
    public final ArrayList f5666g = new ArrayList();

    /* loaded from: classes.dex */
    public interface a {
    }

    public b(Context context, t4.o oVar, v4.i iVar, u4.d dVar, u4.b bVar, com.bumptech.glide.manager.o oVar2, com.bumptech.glide.manager.c cVar, int i10, c cVar2, o0.b bVar2, List list, ArrayList arrayList, g5.a aVar, i iVar2) {
        this.f5660a = dVar;
        this.f5663d = bVar;
        this.f5661b = iVar;
        this.f5664e = oVar2;
        this.f5665f = cVar;
        this.f5662c = new h(context, bVar, new l(this, arrayList, aVar), new a.g(4), cVar2, bVar2, list, oVar, iVar2, i10);
    }

    public static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        int i10;
        ArrayList arrayList;
        u4.d eVar;
        if (!f5659i) {
            f5659i = true;
            o0.b bVar = new o0.b();
            i.a aVar = new i.a();
            c cVar = new c();
            Context applicationContext = context.getApplicationContext();
            Collections.emptyList();
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Loading Glide modules");
            }
            ArrayList arrayList2 = new ArrayList();
            try {
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                if (applicationInfo.metaData == null) {
                    if (Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Got null app info metadata");
                    }
                } else {
                    if (Log.isLoggable("ManifestParser", 2)) {
                        Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                    }
                    for (String str : applicationInfo.metaData.keySet()) {
                        if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                            arrayList2.add(g5.e.a(str));
                            if (Log.isLoggable("ManifestParser", 3)) {
                                Log.d("ManifestParser", "Loaded Glide module: " + str);
                            }
                        }
                    }
                    if (Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Finished loading Glide modules");
                    }
                }
                if (generatedAppGlideModule != null && !new HashSet().isEmpty()) {
                    HashSet hashSet = new HashSet();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        g5.c cVar2 = (g5.c) it.next();
                        if (hashSet.contains(cVar2.getClass())) {
                            if (Log.isLoggable("Glide", 3)) {
                                Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + cVar2);
                            }
                            it.remove();
                        }
                    }
                }
                if (Log.isLoggable("Glide", 3)) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        StringBuilder a10 = android.support.v4.media.d.a("Discovered GlideModule from manifest: ");
                        a10.append(((g5.c) it2.next()).getClass());
                        Log.d("Glide", a10.toString());
                    }
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    ((g5.c) it3.next()).b();
                }
                a.ThreadFactoryC0540a threadFactoryC0540a = new a.ThreadFactoryC0540a();
                if (w4.a.f29738c == 0) {
                    w4.a.f29738c = Math.min(4, Runtime.getRuntime().availableProcessors());
                }
                int i11 = w4.a.f29738c;
                if (!TextUtils.isEmpty("source")) {
                    w4.a aVar2 = new w4.a(new ThreadPoolExecutor(i11, i11, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.b(threadFactoryC0540a, "source", false)));
                    int i12 = w4.a.f29738c;
                    a.ThreadFactoryC0540a threadFactoryC0540a2 = new a.ThreadFactoryC0540a();
                    if (!TextUtils.isEmpty("disk-cache")) {
                        w4.a aVar3 = new w4.a(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.b(threadFactoryC0540a2, "disk-cache", true)));
                        if (w4.a.f29738c == 0) {
                            w4.a.f29738c = Math.min(4, Runtime.getRuntime().availableProcessors());
                        }
                        if (w4.a.f29738c >= 4) {
                            i10 = 2;
                        } else {
                            i10 = 1;
                        }
                        a.ThreadFactoryC0540a threadFactoryC0540a3 = new a.ThreadFactoryC0540a();
                        if (!TextUtils.isEmpty("animation")) {
                            w4.a aVar4 = new w4.a(new ThreadPoolExecutor(i10, i10, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.b(threadFactoryC0540a3, "animation", true)));
                            v4.j jVar = new v4.j(new j.a(applicationContext));
                            com.bumptech.glide.manager.e eVar2 = new com.bumptech.glide.manager.e();
                            int i13 = jVar.f29053a;
                            if (i13 > 0) {
                                arrayList = arrayList2;
                                eVar = new u4.j(i13);
                            } else {
                                arrayList = arrayList2;
                                eVar = new u4.e();
                            }
                            u4.i iVar = new u4.i(jVar.f29055c);
                            v4.h hVar = new v4.h(jVar.f29054b);
                            t4.o oVar = new t4.o(hVar, new v4.g(applicationContext), aVar3, aVar2, new w4.a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, w4.a.f29737b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new a.b(new a.ThreadFactoryC0540a(), "source-unlimited", false))), aVar4);
                            List emptyList = Collections.emptyList();
                            i iVar2 = new i(aVar);
                            b bVar2 = new b(applicationContext, oVar, hVar, eVar, iVar, new com.bumptech.glide.manager.o(null, iVar2), eVar2, 4, cVar, bVar, emptyList, arrayList, generatedAppGlideModule, iVar2);
                            applicationContext.registerComponentCallbacks(bVar2);
                            f5658h = bVar2;
                            f5659i = false;
                            return;
                        }
                        throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
                    }
                    throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
                }
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("Unable to find metadata to parse GlideModules", e10);
            }
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }

    public static b b(Context context) {
        if (f5658h == null) {
            GeneratedAppGlideModule generatedAppGlideModule = null;
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e10);
            } catch (InstantiationException e11) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e11);
            } catch (NoSuchMethodException e12) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e12);
            } catch (InvocationTargetException e13) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e13);
            }
            synchronized (b.class) {
                if (f5658h == null) {
                    a(context, generatedAppGlideModule);
                }
            }
        }
        return f5658h;
    }

    public static com.bumptech.glide.manager.o c(Context context) {
        if (context != null) {
            return b(context).f5664e;
        }
        throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
    }

    public static o e(Context context) {
        return c(context).b(context);
    }

    public static o f(r rVar) {
        boolean z10;
        com.bumptech.glide.manager.o c10 = c(rVar.i0());
        c10.getClass();
        if (rVar.i0() != null) {
            char[] cArr = m5.l.f20382a;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return c10.b(rVar.i0().getApplicationContext());
            }
            if (rVar.f0() != null) {
                com.bumptech.glide.manager.h hVar = c10.f5752g;
                rVar.f0();
                hVar.b();
            }
            j0 h02 = rVar.h0();
            Context i02 = rVar.i0();
            if (c10.f5751f.f5678a.containsKey(f.class)) {
                return c10.f5753h.a(i02, b(i02.getApplicationContext()), rVar.Z, h02, rVar.w0());
            }
            return c10.f(i02, h02, rVar, rVar.w0());
        }
        throw new NullPointerException("You cannot start a load on a fragment before it is attached or after it is destroyed");
    }

    public final void d(o oVar) {
        synchronized (this.f5666g) {
            if (!this.f5666g.contains(oVar)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            this.f5666g.remove(oVar);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        m5.l.a();
        ((m5.i) this.f5661b).e(0L);
        this.f5660a.b();
        this.f5663d.b();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        long j10;
        m5.l.a();
        synchronized (this.f5666g) {
            Iterator it = this.f5666g.iterator();
            while (it.hasNext()) {
                ((o) it.next()).getClass();
            }
        }
        v4.h hVar = (v4.h) this.f5661b;
        if (i10 >= 40) {
            hVar.e(0L);
        } else if (i10 < 20 && i10 != 15) {
            hVar.getClass();
        } else {
            synchronized (hVar) {
                j10 = hVar.f20374b;
            }
            hVar.e(j10 / 2);
        }
        this.f5660a.a(i10);
        this.f5663d.a(i10);
    }
}
