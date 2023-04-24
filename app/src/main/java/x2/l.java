package x2;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a */
    public static final r f30185a;

    /* renamed from: b */
    public static final a f30186b;

    /* loaded from: classes.dex */
    public class a extends Property<View, Float> {
        public a() {
            super(Float.class, "translationAlpha");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(l.f30185a.c(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f10) {
            float floatValue = f10.floatValue();
            l.f30185a.d(view, floatValue);
        }
    }

    /* loaded from: classes.dex */
    public class b extends Property<View, Rect> {
        public b(Class cls) {
            super(cls, "clipBounds");
        }

        @Override // android.util.Property
        public final Rect get(View view) {
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            return o0.f.a(view);
        }

        @Override // android.util.Property
        public final void set(View view, Rect rect) {
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            o0.f.c(view, rect);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f30185a = i10 >= 29 ? new v() : i10 >= 23 ? new u() : i10 >= 22 ? new t() : new r();
        f30186b = new a();
        new b(Rect.class);
    }

    public static void a(View view, int i10, int i11, int i12, int i13) {
        f30185a.a(view, i10, i11, i12, i13);
    }
}
