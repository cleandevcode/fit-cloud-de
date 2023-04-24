package s4;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class a implements d<InputStream> {

    /* renamed from: a */
    public final Uri f26556a;

    /* renamed from: b */
    public final c f26557b;

    /* renamed from: c */
    public InputStream f26558c;

    /* renamed from: s4.a$a */
    /* loaded from: classes.dex */
    public static class C0470a implements s4.b {

        /* renamed from: b */
        public static final String[] f26559b = {"_data"};

        /* renamed from: a */
        public final ContentResolver f26560a;

        public C0470a(ContentResolver contentResolver) {
            this.f26560a = contentResolver;
        }

        @Override // s4.b
        public final Cursor a(Uri uri) {
            return this.f26560a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f26559b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements s4.b {

        /* renamed from: b */
        public static final String[] f26561b = {"_data"};

        /* renamed from: a */
        public final ContentResolver f26562a;

        public b(ContentResolver contentResolver) {
            this.f26562a = contentResolver;
        }

        @Override // s4.b
        public final Cursor a(Uri uri) {
            return this.f26562a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f26561b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    public a(Uri uri, c cVar) {
        this.f26556a = uri;
        this.f26557b = cVar;
    }

    public static a c(Context context, Uri uri, s4.b bVar) {
        return new a(uri, new c(com.bumptech.glide.b.b(context).f5662c.a().d(), bVar, com.bumptech.glide.b.b(context).f5663d, context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        InputStream inputStream = this.f26558c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    public final r4.a d() {
        return r4.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(j jVar, d.a<? super InputStream> aVar) {
        try {
            InputStream f10 = f();
            this.f26558c = f10;
            aVar.f(f10);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e10);
            }
            aVar.c(e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x004b, code lost:
        if (r6 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x004d, code lost:
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0050, code lost:
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0028, code lost:
        if (r6 != null) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0023: MOVE  (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:96:0x0023 */
    /* JADX WARN: Removed duplicated region for block: B:125:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Throwable, java.lang.NullPointerException] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.InputStream f() {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.a.f():java.io.InputStream");
    }
}
