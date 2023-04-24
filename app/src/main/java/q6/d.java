package q6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.fragment.app.i1;
import d6.m0;
import d6.n0;
import gm.l;
import java.util.List;
import java.util.Locale;
import o5.a0;
import o5.p;
import o5.v;
import r6.k;
import r6.m;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public static final C0447d f24606a = new C0447d();

    /* renamed from: b */
    public static final c f24607b = new c();

    /* renamed from: c */
    public static final b f24608c;

    /* loaded from: classes.dex */
    public static final class a extends c {
        @Override // q6.d.c
        public final void a(r6.f fVar) {
            m0 m0Var = m0.f12709a;
            if (m0.A(fVar.f25367g)) {
                return;
            }
            throw new p("Cannot share link content with quote using the share api");
        }

        @Override // q6.d.c
        public final void c(r6.h hVar) {
            throw new p("Cannot share ShareMediaContent using the share api");
        }

        @Override // q6.d.c
        public final void d(r6.i iVar) {
            l.f(iVar, "photo");
            C0447d c0447d = d.f24606a;
            Bitmap bitmap = iVar.f25375b;
            Uri uri = iVar.f25376c;
            if (bitmap == null && uri == null) {
                throw new p("SharePhoto does not have a Bitmap or ImageUrl specified");
            }
            if (bitmap == null && m0.B(uri)) {
                throw new p("Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent");
            }
        }

        @Override // q6.d.c
        public final void g(m mVar) {
            boolean z10;
            m0 m0Var = m0.f12709a;
            if (m0.A(mVar.f25355c)) {
                List<String> list = mVar.f25354b;
                if (list != null && !list.isEmpty()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    if (m0.A(mVar.f25357e)) {
                        return;
                    }
                    throw new p("Cannot share video content with referrer URL using the share api");
                }
                throw new p("Cannot share video content with people IDs using the share api");
            }
            throw new p("Cannot share video content with place IDs using the share api");
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends c {
        @Override // q6.d.c
        public final void e(k kVar) {
            d.a(kVar, this);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static void f(r6.l lVar) {
            C0447d c0447d = d.f24606a;
            if (lVar != null) {
                Uri uri = lVar.f25390b;
                if (uri != null) {
                    m0 m0Var = m0.f12709a;
                    if (!om.h.V("content", uri.getScheme()) && !om.h.V("file", uri.getScheme())) {
                        throw new p("ShareVideo must reference a video that is on the device");
                    }
                    return;
                }
                throw new p("ShareVideo does not have a LocalUrl specified");
            }
            throw new p("Cannot share a null ShareVideo");
        }

        public void a(r6.f fVar) {
            C0447d c0447d = d.f24606a;
            Uri uri = fVar.f25353a;
            if (uri != null && !m0.B(uri)) {
                throw new p("Content Url must be an http:// or https:// url");
            }
        }

        public final void b(r6.g<?, ?> gVar) {
            l.f(gVar, "medium");
            C0447d c0447d = d.f24606a;
            if (gVar instanceof r6.i) {
                d((r6.i) gVar);
            } else if (gVar instanceof r6.l) {
                f((r6.l) gVar);
            } else {
                throw new p(a0.a(new Object[]{gVar.getClass().getSimpleName()}, 1, Locale.ROOT, "Invalid media type: %s", "java.lang.String.format(locale, format, *args)"));
            }
        }

        public void c(r6.h hVar) {
            C0447d c0447d = d.f24606a;
            List<r6.g<?, ?>> list = hVar.f25374g;
            if (list != null && !list.isEmpty()) {
                if (list.size() <= 6) {
                    for (r6.g<?, ?> gVar : list) {
                        b(gVar);
                    }
                    return;
                }
                throw new p(a0.a(new Object[]{6}, 1, Locale.ROOT, "Cannot add more than %d media.", "java.lang.String.format(locale, format, *args)"));
            }
            throw new p("Must specify at least one medium in ShareMediaContent.");
        }

        public void d(r6.i iVar) {
            l.f(iVar, "photo");
            C0447d c0447d = d.f24606a;
            Bitmap bitmap = iVar.f25375b;
            Uri uri = iVar.f25376c;
            if (bitmap == null && uri == null) {
                throw new p("SharePhoto does not have a Bitmap or ImageUrl specified");
            }
            if (bitmap == null && m0.B(uri)) {
                throw new p("Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent");
            }
            if (iVar.f25375b == null) {
                m0 m0Var = m0.f12709a;
                if (m0.B(iVar.f25376c)) {
                    return;
                }
            }
            String str = n0.f12718a;
            Context a10 = v.a();
            String b10 = v.b();
            PackageManager packageManager = a10.getPackageManager();
            if (packageManager != null) {
                String k10 = l.k(b10, "com.facebook.app.FacebookContentProvider");
                if (packageManager.resolveContentProvider(k10, 0) == null) {
                    throw new IllegalStateException(i1.d(new Object[]{k10}, 1, "A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.", "java.lang.String.format(format, *args)").toString());
                }
            }
        }

        public void e(k kVar) {
            d.a(kVar, this);
        }

        public void g(m mVar) {
            C0447d c0447d = d.f24606a;
            f(mVar.f25396j);
            r6.i iVar = mVar.f25395i;
            if (iVar != null) {
                d(iVar);
            }
        }
    }

    /* renamed from: q6.d$d */
    /* loaded from: classes.dex */
    public static final class C0447d extends c {
        @Override // q6.d.c
        public final void c(r6.h hVar) {
            throw new p("Cannot share ShareMediaContent via web sharing dialogs");
        }

        @Override // q6.d.c
        public final void d(r6.i iVar) {
            l.f(iVar, "photo");
            C0447d c0447d = d.f24606a;
            Bitmap bitmap = iVar.f25375b;
            Uri uri = iVar.f25376c;
            if (bitmap == null && uri == null) {
                throw new p("SharePhoto does not have a Bitmap or ImageUrl specified");
            }
        }

        @Override // q6.d.c
        public final void g(m mVar) {
            throw new p("Cannot share ShareVideoContent via web sharing dialogs");
        }
    }

    static {
        new a();
        f24608c = new b();
    }

    public static final void a(k kVar, c cVar) {
        r6.g<?, ?> gVar = kVar.f25386g;
        if (gVar == null && kVar.f25387h == null) {
            throw new p("Must pass the Facebook app a background asset, a sticker asset, or both");
        }
        if (gVar != null) {
            cVar.b(gVar);
        }
        r6.i iVar = kVar.f25387h;
        if (iVar != null) {
            cVar.d(iVar);
        }
    }

    public static void b(r6.d dVar, c cVar) {
        if (dVar instanceof r6.f) {
            cVar.a((r6.f) dVar);
        } else if (dVar instanceof r6.j) {
            cVar.getClass();
            List<r6.i> list = ((r6.j) dVar).f25384g;
            if (list != null && !list.isEmpty()) {
                if (list.size() <= 6) {
                    for (r6.i iVar : list) {
                        cVar.d(iVar);
                    }
                    return;
                }
                throw new p(a0.a(new Object[]{6}, 1, Locale.ROOT, "Cannot add more than %d photos.", "java.lang.String.format(locale, format, *args)"));
            }
            throw new p("Must specify at least one Photo in SharePhotoContent.");
        } else if (dVar instanceof m) {
            cVar.g((m) dVar);
        } else if (dVar instanceof r6.h) {
            cVar.c((r6.h) dVar);
        } else if (dVar instanceof r6.c) {
            cVar.getClass();
            if (m0.A(((r6.c) dVar).f25350g)) {
                throw new p("Must specify a non-empty effectId");
            }
        } else if (dVar instanceof k) {
            cVar.e((k) dVar);
        }
    }
}
