package androidx.transition;

import android.animation.AnimatorListenerAdapter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;

/* loaded from: classes.dex */
public final class a extends androidx.transition.i {
    public static final d A;
    public static final e B;
    public static final f C;

    /* renamed from: x */
    public static final String[] f3387x = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: y */
    public static final b f3388y;

    /* renamed from: z */
    public static final c f3389z;

    /* renamed from: androidx.transition.a$a */
    /* loaded from: classes.dex */
    public class C0034a extends Property<Drawable, PointF> {

        /* renamed from: a */
        public Rect f3390a;

        public C0034a(Class cls) {
            super(cls, "boundsOrigin");
            this.f3390a = new Rect();
        }

        @Override // android.util.Property
        public final PointF get(Drawable drawable) {
            drawable.copyBounds(this.f3390a);
            Rect rect = this.f3390a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        public final void set(Drawable drawable, PointF pointF) {
            Drawable drawable2 = drawable;
            PointF pointF2 = pointF;
            drawable2.copyBounds(this.f3390a);
            this.f3390a.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
            drawable2.setBounds(this.f3390a);
        }
    }

    /* loaded from: classes.dex */
    public class b extends Property<i, PointF> {
        public b(Class cls) {
            super(cls, "topLeft");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            iVar2.getClass();
            iVar2.f3393a = Math.round(pointF2.x);
            int round = Math.round(pointF2.y);
            iVar2.f3394b = round;
            int i10 = iVar2.f3398f + 1;
            iVar2.f3398f = i10;
            if (i10 == iVar2.f3399g) {
                x2.l.a(iVar2.f3397e, iVar2.f3393a, round, iVar2.f3395c, iVar2.f3396d);
                iVar2.f3398f = 0;
                iVar2.f3399g = 0;
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends Property<i, PointF> {
        public c(Class cls) {
            super(cls, "bottomRight");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            iVar2.getClass();
            iVar2.f3395c = Math.round(pointF2.x);
            int round = Math.round(pointF2.y);
            iVar2.f3396d = round;
            int i10 = iVar2.f3399g + 1;
            iVar2.f3399g = i10;
            if (iVar2.f3398f == i10) {
                x2.l.a(iVar2.f3397e, iVar2.f3393a, iVar2.f3394b, iVar2.f3395c, round);
                iVar2.f3398f = 0;
                iVar2.f3399g = 0;
            }
        }
    }

    /* loaded from: classes.dex */
    public class d extends Property<View, PointF> {
        public d(Class cls) {
            super(cls, "bottomRight");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            x2.l.a(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    /* loaded from: classes.dex */
    public class e extends Property<View, PointF> {
        public e(Class cls) {
            super(cls, "topLeft");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            x2.l.a(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    /* loaded from: classes.dex */
    public class f extends Property<View, PointF> {
        public f(Class cls) {
            super(cls, "position");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int round = Math.round(pointF2.x);
            int round2 = Math.round(pointF2.y);
            x2.l.a(view2, round, round2, view2.getWidth() + round, view2.getHeight() + round2);
        }
    }

    /* loaded from: classes.dex */
    public class g extends AnimatorListenerAdapter {
        private i mViewBounds;

        public g(i iVar) {
            this.mViewBounds = iVar;
        }
    }

    /* loaded from: classes.dex */
    public class h extends j {

        /* renamed from: a */
        public boolean f3391a = false;

        /* renamed from: b */
        public final /* synthetic */ ViewGroup f3392b;

        public h(ViewGroup viewGroup) {
            this.f3392b = viewGroup;
        }

        @Override // androidx.transition.j, androidx.transition.i.d
        public final void a() {
            x2.k.a(this.f3392b, false);
        }

        @Override // androidx.transition.j, androidx.transition.i.d
        public final void c() {
            x2.k.a(this.f3392b, false);
            this.f3391a = true;
        }

        @Override // androidx.transition.i.d
        public final void d(androidx.transition.i iVar) {
            if (!this.f3391a) {
                x2.k.a(this.f3392b, false);
            }
            iVar.z(this);
        }

        @Override // androidx.transition.j, androidx.transition.i.d
        public final void e() {
            x2.k.a(this.f3392b, true);
        }
    }

    /* loaded from: classes.dex */
    public static class i {

        /* renamed from: a */
        public int f3393a;

        /* renamed from: b */
        public int f3394b;

        /* renamed from: c */
        public int f3395c;

        /* renamed from: d */
        public int f3396d;

        /* renamed from: e */
        public View f3397e;

        /* renamed from: f */
        public int f3398f;

        /* renamed from: g */
        public int f3399g;

        public i(View view) {
            this.f3397e = view;
        }
    }

    static {
        new C0034a(PointF.class);
        f3388y = new b(PointF.class);
        f3389z = new c(PointF.class);
        A = new d(PointF.class);
        B = new e(PointF.class);
        C = new f(PointF.class);
    }

    public final void L(x2.g gVar) {
        View view = gVar.f30176b;
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        if (o0.g.c(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            gVar.f30175a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            gVar.f30175a.put("android:changeBounds:parent", gVar.f30176b.getParent());
        }
    }

    @Override // androidx.transition.i
    public final void d(x2.g gVar) {
        L(gVar);
    }

    @Override // androidx.transition.i
    public final void g(x2.g gVar) {
        L(gVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0116  */
    @Override // androidx.transition.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator m(android.view.ViewGroup r19, x2.g r20, x2.g r21) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.a.m(android.view.ViewGroup, x2.g, x2.g):android.animation.Animator");
    }

    @Override // androidx.transition.i
    public final String[] t() {
        return f3387x;
    }
}
