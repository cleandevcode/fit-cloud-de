package y5;

import android.text.TextUtils;
import gm.l;
import java.io.File;
import java.nio.charset.Charset;
import o5.v;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    public static final f f31163a = new f();

    public static final File a() {
        if (i6.a.b(f.class)) {
            return null;
        }
        try {
            File file = new File(v.a().getFilesDir(), "facebook_ml/");
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return null;
                }
            }
            return file;
        } catch (Throwable th2) {
            i6.a.a(f.class, th2);
            return null;
        }
    }

    public final String b(String str) {
        if (i6.a.b(this)) {
            return null;
        }
        try {
            l.f(str, "str");
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = l.h(str.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    }
                    length--;
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            Object[] array = new om.c("\\s+").a(str.subSequence(i10, length + 1).toString()).toArray(new String[0]);
            if (array != null) {
                String join = TextUtils.join(" ", (String[]) array);
                l.e(join, "join(\" \", strArray)");
                return join;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return null;
        }
    }

    public final int[] c(String str) {
        if (i6.a.b(this)) {
            return null;
        }
        try {
            l.f(str, "texts");
            int[] iArr = new int[128];
            String b10 = b(str);
            Charset forName = Charset.forName("UTF-8");
            l.e(forName, "forName(\"UTF-8\")");
            if (b10 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = b10.getBytes(forName);
            l.e(bytes, "(this as java.lang.String).getBytes(charset)");
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (i10 < bytes.length) {
                    iArr[i10] = bytes[i10] & 255;
                } else {
                    iArr[i10] = 0;
                }
                if (i11 >= 128) {
                    return iArr;
                }
                i10 = i11;
            }
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return null;
        }
    }
}
