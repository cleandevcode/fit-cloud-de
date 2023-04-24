package z9;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import java.util.WeakHashMap;
import k1.e0;
import k1.i2;
import k1.n2;
import k1.o0;

/* loaded from: classes.dex */
public final class r {

    /* loaded from: classes.dex */
    public class a implements e0 {

        /* renamed from: a */
        public final /* synthetic */ b f32164a;

        /* renamed from: b */
        public final /* synthetic */ c f32165b;

        public a(b bVar, c cVar) {
            this.f32164a = bVar;
            this.f32165b = cVar;
        }

        @Override // k1.e0
        public final n2 a(View view, n2 n2Var) {
            return this.f32164a.b(view, n2Var, new c(this.f32165b));
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        n2 b(View view, n2 n2Var, c cVar);
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public int f32166a;

        /* renamed from: b */
        public int f32167b;

        /* renamed from: c */
        public int f32168c;

        /* renamed from: d */
        public int f32169d;

        public c(int i10, int i11, int i12, int i13) {
            this.f32166a = i10;
            this.f32167b = i11;
            this.f32168c = i12;
            this.f32169d = i13;
        }

        public c(c cVar) {
            this.f32166a = cVar.f32166a;
            this.f32167b = cVar.f32167b;
            this.f32168c = cVar.f32168c;
            this.f32169d = cVar.f32169d;
        }

        public final void a(View view) {
            int i10 = this.f32166a;
            int i11 = this.f32167b;
            int i12 = this.f32168c;
            int i13 = this.f32169d;
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            o0.e.k(view, i10, i11, i12, i13);
        }
    }

    public static void a(View view, b bVar) {
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        o0.i.u(view, new a(bVar, new c(o0.e.f(view), view.getPaddingTop(), o0.e.e(view), view.getPaddingBottom())));
        if (o0.g.b(view)) {
            o0.h.c(view);
        } else {
            view.addOnAttachStateChangeListener(new s());
        }
    }

    public static float b(Context context, int i10) {
        return TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    public static boolean c(View view) {
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        return o0.e.d(view) == 1;
    }

    public static PorterDuff.Mode d(int i10, PorterDuff.Mode mode) {
        if (i10 != 3) {
            if (i10 != 5) {
                if (i10 != 9) {
                    switch (i10) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
