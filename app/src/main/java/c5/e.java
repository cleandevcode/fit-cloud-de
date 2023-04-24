package c5;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import r4.g;
import r4.h;
import r4.j;
import t4.x;

/* loaded from: classes.dex */
public final class e implements j<Uri, Drawable> {

    /* renamed from: b */
    public static final g<Resources.Theme> f4538b = new g<>("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, g.f25213e);

    /* renamed from: a */
    public final Context f4539a;

    public e(Context context) {
        this.f4539a = context.getApplicationContext();
    }

    @Override // r4.j
    public final /* bridge */ /* synthetic */ x<Drawable> a(Uri uri, int i10, int i11, h hVar) {
        return c(uri, hVar);
    }

    @Override // r4.j
    public final boolean b(Uri uri, h hVar) {
        return uri.getScheme().equals("android.resource");
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final t4.x c(android.net.Uri r9, r4.h r10) {
        /*
            r8 = this;
            java.lang.String r0 = r9.getAuthority()
            android.content.Context r1 = r8.f4539a
            java.lang.String r1 = r1.getPackageName()
            boolean r1 = r0.equals(r1)
            r2 = 0
            if (r1 == 0) goto L12
            goto L26
        L12:
            android.content.Context r1 = r8.f4539a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L19
            android.content.Context r1 = r1.createPackageContext(r0, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L19
            goto L28
        L19:
            r1 = move-exception
            android.content.Context r3 = r8.f4539a
            java.lang.String r3 = r3.getPackageName()
            boolean r3 = r0.contains(r3)
            if (r3 == 0) goto Le9
        L26:
            android.content.Context r1 = r8.f4539a
        L28:
            java.util.List r3 = r9.getPathSegments()
            int r4 = r3.size()
            r5 = 2
            r6 = 1
            if (r4 != r5) goto L76
            java.util.List r3 = r9.getPathSegments()
            java.lang.String r4 = r9.getAuthority()
            java.lang.Object r5 = r3.get(r2)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r3 = r3.get(r6)
            java.lang.String r3 = (java.lang.String) r3
            android.content.res.Resources r7 = r1.getResources()
            int r4 = r7.getIdentifier(r3, r5, r4)
            if (r4 != 0) goto L5c
            android.content.res.Resources r4 = android.content.res.Resources.getSystem()
            java.lang.String r7 = "android"
            int r4 = r4.getIdentifier(r3, r5, r7)
        L5c:
            if (r4 == 0) goto L5f
            goto L8c
        L5f:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to find resource id for: "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r10.<init>(r9)
            throw r10
        L76:
            int r3 = r3.size()
            java.lang.String r4 = "Unrecognized Uri format: "
            if (r3 != r6) goto Ld4
            java.util.List r3 = r9.getPathSegments()
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.NumberFormatException -> Lbe
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.NumberFormatException -> Lbe
            int r4 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> Lbe
        L8c:
            r4.g<android.content.res.Resources$Theme> r9 = c5.e.f4538b
            java.lang.Object r9 = r10.c(r9)
            android.content.res.Resources$Theme r9 = (android.content.res.Resources.Theme) r9
            java.lang.String r10 = r1.getPackageName()
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto La0
            if (r9 != 0) goto La1
        La0:
            r2 = 1
        La1:
            java.lang.String r10 = "Can't get a theme from another package"
            b0.c.g(r10, r2)
            r10 = 0
            if (r9 != 0) goto Lb0
            android.content.Context r9 = r8.f4539a
            android.graphics.drawable.Drawable r9 = c5.b.a(r9, r1, r4, r10)
            goto Lb6
        Lb0:
            android.content.Context r0 = r8.f4539a
            android.graphics.drawable.Drawable r9 = c5.b.a(r0, r0, r4, r9)
        Lb6:
            if (r9 == 0) goto Lbd
            c5.d r10 = new c5.d
            r10.<init>(r9)
        Lbd:
            return r10
        Lbe:
            r10 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9, r10)
            throw r0
        Ld4:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r10.<init>(r9)
            throw r10
        Le9:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Failed to obtain context or unrecognized Uri format for: "
            r0.append(r2)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r10.<init>(r9, r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.e.c(android.net.Uri, r4.h):t4.x");
    }
}
