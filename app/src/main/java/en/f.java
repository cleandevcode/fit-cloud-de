package en;

import android.content.Context;
import android.os.Environment;
import gm.l;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.Locale;
import sa.p;
import y0.a;

/* loaded from: classes2.dex */
public final class f implements fj.e, p {
    public static File b(Context context) {
        l.f(context, "context");
        String str = Environment.DIRECTORY_PICTURES;
        Object obj = y0.a.f30807a;
        File[] b10 = a.b.b(context, str);
        l.e(b10, "getExternalFilesDirs(con…nment.DIRECTORY_PICTURES)");
        File file = (File) ul.i.B(b10);
        if (file == null || (!file.exists() && !file.mkdirs())) {
            file = null;
        }
        if (file == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        String format = new SimpleDateFormat("_yyyyMMdd_HHmmssSSS", Locale.US).format(new Date(System.currentTimeMillis()));
        l.e(format, "SimpleDateFormat(\"_yyyyM…le.US).format(Date(time))");
        sb2.append(format);
        sb2.append(".jpg");
        return new File(file, sb2.toString());
    }

    public static File c(Context context, sj.e eVar) {
        String str;
        String str2 = Environment.DIRECTORY_DOWNLOADS;
        Object obj = y0.a.f30807a;
        File[] b10 = a.b.b(context, str2);
        l.e(b10, "getExternalFilesDirs(con…ment.DIRECTORY_DOWNLOADS)");
        File file = (File) ul.i.B(b10);
        if (file == null || (!file.exists() && !file.mkdirs())) {
            file = null;
        }
        if (file == null) {
            return null;
        }
        boolean z10 = true;
        if (eVar.f27095a != 1) {
            z10 = false;
        }
        if (z10) {
            str = "circle_";
        } else {
            str = "rect_";
        }
        StringBuilder a10 = android.support.v4.media.d.a(str);
        a10.append(eVar.f27096b);
        a10.append('_');
        a10.append(eVar.f27097c);
        return new File(file, a10.toString());
    }

    public static final boolean d(String str) {
        l.f(str, "method");
        return (l.a(str, "GET") || l.a(str, "HEAD")) ? false : true;
    }

    @Override // sa.p
    public Object a() {
        return new ArrayDeque();
    }
}
