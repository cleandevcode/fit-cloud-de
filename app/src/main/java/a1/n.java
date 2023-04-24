package a1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
import z0.d;

/* loaded from: classes.dex */
public class n {

    /* loaded from: classes.dex */
    public interface a<T> {
        int a(T t10);

        boolean b(T t10);
    }

    public n() {
        new ConcurrentHashMap();
    }

    public static <T> T e(T[] tArr, int i10, a<T> aVar) {
        int i11 = (i10 & 1) == 0 ? 400 : 700;
        boolean z10 = (i10 & 2) != 0;
        T t10 = null;
        int i12 = Integer.MAX_VALUE;
        for (T t11 : tArr) {
            int abs = (Math.abs(aVar.a(t11) - i11) * 2) + (aVar.b(t11) == z10 ? 0 : 1);
            if (t10 == null || i12 > abs) {
                t10 = t11;
                i12 = abs;
            }
        }
        return t10;
    }

    public Typeface a(Context context, d.c cVar, Resources resources, int i10) {
        throw null;
    }

    public Typeface b(Context context, g1.m[] mVarArr, int i10) {
        throw null;
    }

    public Typeface c(Context context, InputStream inputStream) {
        File d10 = o.d(context);
        if (d10 == null) {
            return null;
        }
        try {
            if (o.c(inputStream, d10)) {
                return Typeface.createFromFile(d10.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d10.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        File d10 = o.d(context);
        if (d10 == null) {
            return null;
        }
        try {
            if (o.b(d10, resources, i10)) {
                return Typeface.createFromFile(d10.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d10.delete();
        }
    }

    public g1.m f(int i10, g1.m[] mVarArr) {
        return (g1.m) e(mVarArr, i10, new m());
    }
}
