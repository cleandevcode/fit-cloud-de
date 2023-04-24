package j5;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.bumptech.glide.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@Deprecated
/* loaded from: classes.dex */
public abstract class i<T extends View, Z> extends j5.a<Z> {

    /* renamed from: c */
    public static int f17498c = R.id.glide_custom_view_target_tag;

    /* renamed from: a */
    public final T f17499a;

    /* renamed from: b */
    public final a f17500b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: e */
        public static Integer f17501e;

        /* renamed from: a */
        public final View f17502a;

        /* renamed from: b */
        public final ArrayList f17503b = new ArrayList();

        /* renamed from: c */
        public boolean f17504c;

        /* renamed from: d */
        public ViewTreeObserver$OnPreDrawListenerC0306a f17505d;

        /* renamed from: j5.i$a$a */
        /* loaded from: classes.dex */
        public static final class ViewTreeObserver$OnPreDrawListenerC0306a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a */
            public final WeakReference<a> f17506a;

            public ViewTreeObserver$OnPreDrawListenerC0306a(a aVar) {
                this.f17506a = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                boolean z10;
                boolean z11;
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = this.f17506a.get();
                if (aVar != null && !aVar.f17503b.isEmpty()) {
                    int c10 = aVar.c();
                    int b10 = aVar.b();
                    boolean z12 = false;
                    if (c10 <= 0 && c10 != Integer.MIN_VALUE) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        if (b10 <= 0 && b10 != Integer.MIN_VALUE) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (z11) {
                            z12 = true;
                        }
                    }
                    if (z12) {
                        Iterator it = new ArrayList(aVar.f17503b).iterator();
                        while (it.hasNext()) {
                            ((g) it.next()).c(c10, b10);
                        }
                        ViewTreeObserver viewTreeObserver = aVar.f17502a.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.removeOnPreDrawListener(aVar.f17505d);
                        }
                        aVar.f17505d = null;
                        aVar.f17503b.clear();
                    }
                }
                return true;
            }
        }

        public a(View view) {
            this.f17502a = view;
        }

        public final int a(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            if (this.f17504c && this.f17502a.isLayoutRequested()) {
                return 0;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            if (this.f17502a.isLayoutRequested() || i11 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context = this.f17502a.getContext();
            if (f17501e == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                b0.c.i(windowManager);
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f17501e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f17501e.intValue();
        }

        public final int b() {
            int paddingBottom = this.f17502a.getPaddingBottom() + this.f17502a.getPaddingTop();
            ViewGroup.LayoutParams layoutParams = this.f17502a.getLayoutParams();
            return a(this.f17502a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingBottom);
        }

        public final int c() {
            int paddingRight = this.f17502a.getPaddingRight() + this.f17502a.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = this.f17502a.getLayoutParams();
            return a(this.f17502a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        }
    }

    public i(T t10) {
        this.f17499a = t10;
        this.f17500b = new a(t10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0020, code lost:
        if (r3 != false) goto L10;
     */
    @Override // j5.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(j5.g r8) {
        /*
            r7 = this;
            j5.i$a r0 = r7.f17500b
            int r1 = r0.c()
            int r2 = r0.b()
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1
            r5 = 0
            if (r1 > 0) goto L15
            if (r1 != r3) goto L13
            goto L15
        L13:
            r6 = 0
            goto L16
        L15:
            r6 = 1
        L16:
            if (r6 == 0) goto L23
            if (r2 > 0) goto L1f
            if (r2 != r3) goto L1d
            goto L1f
        L1d:
            r3 = 0
            goto L20
        L1f:
            r3 = 1
        L20:
            if (r3 == 0) goto L23
            goto L24
        L23:
            r4 = 0
        L24:
            if (r4 == 0) goto L2a
            r8.c(r1, r2)
            goto L4b
        L2a:
            java.util.ArrayList r1 = r0.f17503b
            boolean r1 = r1.contains(r8)
            if (r1 != 0) goto L37
            java.util.ArrayList r1 = r0.f17503b
            r1.add(r8)
        L37:
            j5.i$a$a r8 = r0.f17505d
            if (r8 != 0) goto L4b
            android.view.View r8 = r0.f17502a
            android.view.ViewTreeObserver r8 = r8.getViewTreeObserver()
            j5.i$a$a r1 = new j5.i$a$a
            r1.<init>(r0)
            r0.f17505d = r1
            r8.addOnPreDrawListener(r1)
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.i.a(j5.g):void");
    }

    @Override // j5.h
    public final void b(i5.d dVar) {
        this.f17499a.setTag(f17498c, dVar);
    }

    @Override // j5.h
    public final void d(g gVar) {
        this.f17500b.f17503b.remove(gVar);
    }

    @Override // j5.h
    public final i5.d g() {
        Object tag = this.f17499a.getTag(f17498c);
        if (tag == null) {
            return null;
        }
        if (tag instanceof i5.d) {
            return (i5.d) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // j5.h
    public void h(Drawable drawable) {
        a aVar = this.f17500b;
        ViewTreeObserver viewTreeObserver = aVar.f17502a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(aVar.f17505d);
        }
        aVar.f17505d = null;
        aVar.f17503b.clear();
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("Target for: ");
        a10.append(this.f17499a);
        return a10.toString();
    }
}
