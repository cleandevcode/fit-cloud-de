package d6;

import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a */
    public static final d0 f12651a = new d0();

    /* renamed from: b */
    public static final String f12652b = d0.class.getName();

    /* renamed from: c */
    public static File f12653c;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final UUID f12654a;

        /* renamed from: b */
        public final Bitmap f12655b;

        /* renamed from: c */
        public final Uri f12656c;

        /* renamed from: d */
        public final String f12657d;

        /* renamed from: e */
        public final String f12658e;

        /* renamed from: f */
        public boolean f12659f;

        /* renamed from: g */
        public boolean f12660g;

        /* JADX WARN: Removed duplicated region for block: B:60:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0071  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public a(android.graphics.Bitmap r6, android.net.Uri r7, java.util.UUID r8) {
            /*
                r5 = this;
                java.lang.String r0 = "callId"
                gm.l.f(r8, r0)
                r5.<init>()
                r5.f12654a = r8
                r5.f12655b = r6
                r5.f12656c = r7
                r0 = 1
                r1 = 0
                if (r7 == 0) goto L54
                java.lang.String r6 = r7.getScheme()
                java.lang.String r2 = "content"
                boolean r2 = om.h.V(r2, r6)
                if (r2 == 0) goto L34
                r5.f12659f = r0
                java.lang.String r6 = r7.getAuthority()
                if (r6 == 0) goto L30
                java.lang.String r2 = "media"
                boolean r6 = om.h.a0(r6, r2, r1)
                if (r6 != 0) goto L30
                r6 = 1
                goto L31
            L30:
                r6 = 0
            L31:
                r5.f12660g = r6
                goto L58
            L34:
                java.lang.String r2 = r7.getScheme()
                java.lang.String r3 = "file"
                boolean r2 = om.h.V(r3, r2)
                if (r2 == 0) goto L41
                goto L56
            L41:
                boolean r2 = d6.m0.B(r7)
                if (r2 == 0) goto L48
                goto L58
            L48:
                o5.p r7 = new o5.p
                java.lang.String r8 = "Unsupported scheme for media Uri : "
                java.lang.String r6 = gm.l.k(r6, r8)
                r7.<init>(r6)
                throw r7
            L54:
                if (r6 == 0) goto L95
            L56:
                r5.f12660g = r0
            L58:
                boolean r6 = r5.f12660g
                if (r6 != 0) goto L5e
                r6 = 0
                goto L66
            L5e:
                java.util.UUID r6 = java.util.UUID.randomUUID()
                java.lang.String r6 = r6.toString()
            L66:
                r5.f12658e = r6
                boolean r2 = r5.f12660g
                if (r2 != 0) goto L71
                java.lang.String r6 = java.lang.String.valueOf(r7)
                goto L92
            L71:
                java.lang.String r7 = com.facebook.FacebookContentProvider.f5829a
                java.lang.String r7 = o5.v.b()
                r2 = 4
                java.lang.Object[] r3 = new java.lang.Object[r2]
                java.lang.String r4 = "content://com.facebook.app.FacebookContentProvider"
                r3[r1] = r4
                r3[r0] = r7
                java.lang.String r7 = r8.toString()
                r8 = 2
                r3[r8] = r7
                r7 = 3
                r3[r7] = r6
                java.lang.String r6 = "%s%s/%s/%s"
                java.lang.String r7 = "java.lang.String.format(format, *args)"
                java.lang.String r6 = androidx.fragment.app.i1.d(r3, r2, r6, r7)
            L92:
                r5.f12657d = r6
                return
            L95:
                o5.p r6 = new o5.p
                java.lang.String r7 = "Cannot share media without a bitmap or Uri set"
                r6.<init>(r7)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: d6.d0.a.<init>(android.graphics.Bitmap, android.net.Uri, java.util.UUID):void");
        }
    }

    public static final void a(List list) {
        InputStream openInputStream;
        File d10;
        if (list.isEmpty()) {
            return;
        }
        if (f12653c == null && (d10 = d()) != null) {
            dm.b.B(d10);
        }
        File d11 = d();
        if (d11 != null) {
            d11.mkdirs();
        }
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if (aVar.f12660g) {
                    UUID uuid = aVar.f12654a;
                    String str = aVar.f12658e;
                    gm.l.f(uuid, "callId");
                    File e10 = e(uuid, true);
                    File file = null;
                    if (e10 != null) {
                        try {
                            file = new File(e10, URLEncoder.encode(str, "UTF-8"));
                        } catch (UnsupportedEncodingException unused) {
                        }
                    }
                    if (file != null) {
                        arrayList.add(file);
                        Bitmap bitmap = aVar.f12655b;
                        if (bitmap != null) {
                            f12651a.getClass();
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                            m0.e(fileOutputStream);
                        } else {
                            Uri uri = aVar.f12656c;
                            if (uri != null) {
                                d0 d0Var = f12651a;
                                boolean z10 = aVar.f12659f;
                                d0Var.getClass();
                                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                                if (!z10) {
                                    openInputStream = new FileInputStream(uri.getPath());
                                } else {
                                    openInputStream = o5.v.a().getContentResolver().openInputStream(uri);
                                }
                                m0.j(openInputStream, fileOutputStream2);
                                m0.e(fileOutputStream2);
                            }
                        }
                    }
                }
            }
        } catch (IOException e11) {
            Log.e(f12652b, gm.l.k(e11, "Got unexpected exception:"));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                File file2 = (File) it2.next();
                if (file2 != null) {
                    try {
                        file2.delete();
                    } catch (Exception unused2) {
                    }
                }
            }
            throw new o5.p(e11);
        }
    }

    public static final a b(UUID uuid, Bitmap bitmap) {
        gm.l.f(uuid, "callId");
        gm.l.f(bitmap, "attachmentBitmap");
        return new a(bitmap, null, uuid);
    }

    public static final a c(UUID uuid, Uri uri) {
        gm.l.f(uuid, "callId");
        gm.l.f(uri, "attachmentUri");
        return new a(null, uri, uuid);
    }

    public static final synchronized File d() {
        File file;
        synchronized (d0.class) {
            if (f12653c == null) {
                f12653c = new File(o5.v.a().getCacheDir(), "com.facebook.NativeAppCallAttachmentStore.files");
            }
            file = f12653c;
        }
        return file;
    }

    public static final File e(UUID uuid, boolean z10) {
        gm.l.f(uuid, "callId");
        if (f12653c == null) {
            return null;
        }
        File file = new File(f12653c, uuid.toString());
        if (z10 && !file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
