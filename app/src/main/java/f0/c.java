package f0;

import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public static Method f14027a;

    static {
        try {
            Class cls = Integer.TYPE;
            f14027a = ImageWriter.class.getMethod("newInstance", Surface.class, cls, cls);
        } catch (NoSuchMethodException e10) {
            Log.i("ImageWriterCompatApi26", "Unable to initialize via reflection.", e10);
        }
    }
}
