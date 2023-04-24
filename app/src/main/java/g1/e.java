package g1;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public static final d f14808a = new Comparator() { // from class: g1.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = (byte[]) obj2;
            if (bArr.length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            for (int i10 = 0; i10 < bArr.length; i10++) {
                byte b10 = bArr[i10];
                byte b11 = bArr2[i10];
                if (b10 != b11) {
                    return b10 - b11;
                }
            }
            return 0;
        }
    };

    /* loaded from: classes.dex */
    public static class a {
        public static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0090 A[LOOP:1: B:99:0x004b->B:114:0x0090, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0094 A[EDGE_INSN: B:163:0x0094->B:116:0x0094 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static g1.l a(android.content.Context r20, g1.f r21) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.e.a(android.content.Context, g1.f):g1.l");
    }
}
