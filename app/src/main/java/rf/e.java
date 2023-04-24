package rf;

import android.content.Context;
import gm.l;
import java.io.File;
import ul.i;
import y0.a;

/* loaded from: classes2.dex */
public final class e implements sg.a {

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public final long f25599a;

        /* renamed from: b */
        public final int f25600b;

        /* renamed from: c */
        public final File f25601c;

        public a(long j10, int i10, File file) {
            this.f25599a = j10;
            this.f25600b = i10;
            this.f25601c = file;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f25599a == aVar.f25599a && this.f25600b == aVar.f25600b && l.a(this.f25601c, aVar.f25601c);
            }
            return false;
        }

        public final int hashCode() {
            long j10 = this.f25599a;
            return this.f25601c.hashCode() + (((((int) (j10 ^ (j10 >>> 32))) * 31) + this.f25600b) * 31);
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("FileSorter(time=");
            a10.append(this.f25599a);
            a10.append(", index=");
            a10.append(this.f25600b);
            a10.append(", file=");
            a10.append(this.f25601c);
            a10.append(')');
            return a10.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00c0  */
    @Override // sg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable a(android.content.Context r17, xl.d r18) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.e.a(android.content.Context, xl.d):java.io.Serializable");
    }

    @Override // sg.a
    public final File b(Context context) {
        l.f(context, "context");
        Object obj = y0.a.f30807a;
        File[] a10 = a.b.a(context);
        l.e(a10, "getExternalCacheDirs(context)");
        File file = (File) i.B(a10);
        if (file == null || (!file.exists() && !file.mkdirs())) {
            return null;
        }
        return file;
    }

    @Override // sg.a
    public final File c(Context context) {
        l.f(context, "context");
        Object obj = y0.a.f30807a;
        File[] a10 = a.b.a(context);
        l.e(a10, "getExternalCacheDirs(context)");
        File file = (File) i.B(a10);
        if (file == null || (!file.exists() && !file.mkdirs())) {
            return null;
        }
        return file;
    }
}
