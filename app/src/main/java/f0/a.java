package f0;

import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.view.Surface;
import androidx.activity.i;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class a {
    public static ImageWriter a(int i10, Surface surface) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23) {
            return b.c(i10, surface);
        }
        throw new RuntimeException(i.a("Unable to call newInstance(Surface, int) on API ", i11, ". Version 23 or higher required."));
    }

    public static ImageWriter b(Surface surface, int i10, int i11) {
        ImageWriter newInstance;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 29) {
            newInstance = ImageWriter.newInstance(surface, i10, i11);
            return newInstance;
        } else if (i12 >= 26) {
            Method method = c.f14027a;
            Throwable th2 = null;
            if (i12 >= 26) {
                try {
                    Object invoke = c.f14027a.invoke(null, surface, Integer.valueOf(i10), Integer.valueOf(i11));
                    invoke.getClass();
                    return (ImageWriter) invoke;
                } catch (IllegalAccessException | InvocationTargetException e10) {
                    th2 = e10;
                }
            }
            throw new RuntimeException("Unable to invoke newInstance(Surface, int, int) via reflection.", th2);
        } else {
            throw new RuntimeException(i.a("Unable to call newInstance(Surface, int, int) on API ", i12, ". Version 26 or higher required."));
        }
    }

    public static void c(ImageWriter imageWriter, Image image) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            b.d(imageWriter, image);
            return;
        }
        throw new RuntimeException(i.a("Unable to call queueInputImage() on API ", i10, ". Version 23 or higher required."));
    }
}
