package androidx.camera.view;

import a0.b0;
import a0.f1;
import a0.g1;
import a0.r1;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.m;
import androidx.camera.core.s;
import androidx.camera.view.PreviewView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.a0;
import b0.p;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import k0.h;
import k1.o0;
import s.e0;
import t.n;
import y.m1;
import y.u0;
import y.w0;

/* loaded from: classes.dex */
public final class PreviewView extends FrameLayout {

    /* renamed from: l */
    public static final /* synthetic */ int f1847l = 0;

    /* renamed from: a */
    public c f1848a;

    /* renamed from: b */
    public androidx.camera.view.c f1849b;

    /* renamed from: c */
    public final androidx.camera.view.b f1850c;

    /* renamed from: d */
    public boolean f1851d;

    /* renamed from: e */
    public final a0<g> f1852e;

    /* renamed from: f */
    public final AtomicReference<androidx.camera.view.a> f1853f;

    /* renamed from: g */
    public h f1854g;

    /* renamed from: h */
    public a0.a0 f1855h;

    /* renamed from: i */
    public final b f1856i;

    /* renamed from: j */
    public final k0.f f1857j;

    /* renamed from: k */
    public final a f1858k;

    /* loaded from: classes.dex */
    public class a implements m.d {
        public a() {
            PreviewView.this = r1;
        }

        @Override // androidx.camera.core.m.d
        public final void a(final s sVar) {
            s.d dVar;
            boolean z10;
            androidx.camera.view.c dVar2;
            if (!p.b.s()) {
                y0.a.c(PreviewView.this.getContext()).execute(new n(this, sVar, 6));
                return;
            }
            u0.a("PreviewView", "Surface requested by Preview.");
            final b0 b0Var = sVar.f1789d;
            PreviewView.this.f1855h = b0Var.l();
            Executor c10 = y0.a.c(PreviewView.this.getContext());
            s.e eVar = new s.e() { // from class: k0.g
                @Override // androidx.camera.core.s.e
                public final void a(s.d dVar3) {
                    boolean z11;
                    PreviewView previewView;
                    androidx.camera.view.c cVar;
                    PreviewView.a aVar = PreviewView.a.this;
                    b0 b0Var2 = b0Var;
                    s sVar2 = sVar;
                    aVar.getClass();
                    u0.a("PreviewView", "Preview transformation info updated. " + dVar3);
                    Integer c11 = b0Var2.l().c();
                    if (c11 == null) {
                        u0.h("PreviewView", "The lens facing is null, probably an external.");
                    } else if (c11.intValue() != 0) {
                        z11 = false;
                        androidx.camera.view.b bVar2 = PreviewView.this.f1850c;
                        Size size2 = sVar2.f1787b;
                        bVar2.getClass();
                        u0.a("PreviewTransform", "Transformation info set: " + dVar3 + " " + size2 + " " + z11);
                        bVar2.f1881b = dVar3.a();
                        bVar2.f1882c = dVar3.b();
                        bVar2.f1883d = dVar3.c();
                        bVar2.f1880a = size2;
                        bVar2.f1884e = z11;
                        if (dVar3.c() == -1 && ((cVar = (previewView = PreviewView.this).f1849b) == null || !(cVar instanceof androidx.camera.view.d))) {
                            previewView.f1851d = false;
                        } else {
                            PreviewView.this.f1851d = true;
                        }
                        PreviewView.this.b();
                        PreviewView.this.a();
                    }
                    z11 = true;
                    androidx.camera.view.b bVar22 = PreviewView.this.f1850c;
                    Size size22 = sVar2.f1787b;
                    bVar22.getClass();
                    u0.a("PreviewTransform", "Transformation info set: " + dVar3 + " " + size22 + " " + z11);
                    bVar22.f1881b = dVar3.a();
                    bVar22.f1882c = dVar3.b();
                    bVar22.f1883d = dVar3.c();
                    bVar22.f1880a = size22;
                    bVar22.f1884e = z11;
                    if (dVar3.c() == -1) {
                    }
                    PreviewView.this.f1851d = true;
                    PreviewView.this.b();
                    PreviewView.this.a();
                }
            };
            synchronized (sVar.f1786a) {
                sVar.f1796k = eVar;
                sVar.f1797l = c10;
                dVar = sVar.f1795j;
            }
            if (dVar != null) {
                c10.execute(new n(eVar, dVar, 4));
            }
            PreviewView previewView = PreviewView.this;
            c cVar = previewView.f1848a;
            boolean equals = sVar.f1789d.l().h().equals("androidx.camera.camera2.legacy");
            r1 r1Var = l0.a.f18664a;
            boolean z11 = true;
            if (r1Var.c(l0.c.class) == null && r1Var.c(l0.b.class) == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!sVar.f1788c && Build.VERSION.SDK_INT > 24 && !equals && !z10) {
                int ordinal = cVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        throw new IllegalArgumentException("Invalid implementation mode: " + cVar);
                    }
                } else {
                    z11 = false;
                }
            }
            if (z11) {
                PreviewView previewView2 = PreviewView.this;
                dVar2 = new androidx.camera.view.f(previewView2, previewView2.f1850c);
            } else {
                PreviewView previewView3 = PreviewView.this;
                dVar2 = new androidx.camera.view.d(previewView3, previewView3.f1850c);
            }
            previewView.f1849b = dVar2;
            e0 l10 = b0Var.l();
            PreviewView previewView4 = PreviewView.this;
            androidx.camera.view.a aVar = new androidx.camera.view.a(l10, previewView4.f1852e, previewView4.f1849b);
            PreviewView.this.f1853f.set(aVar);
            g1 a10 = b0Var.a();
            Executor c11 = y0.a.c(PreviewView.this.getContext());
            synchronized (a10.f72b) {
                try {
                    g1.a aVar2 = (g1.a) a10.f72b.get(aVar);
                    if (aVar2 != null) {
                        aVar2.f73a.set(false);
                    }
                    g1.a aVar3 = new g1.a(c11, aVar);
                    a10.f72b.put(aVar, aVar3);
                    o8.b.p().execute(new f1(a10, aVar2, aVar3, 0));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            PreviewView.this.f1849b.e(sVar, new j0.h(this, aVar, b0Var));
            PreviewView.this.getClass();
        }
    }

    /* loaded from: classes.dex */
    public class b implements DisplayManager.DisplayListener {
        public b() {
            PreviewView.this = r1;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i10) {
            Display display = PreviewView.this.getDisplay();
            if (display == null || display.getDisplayId() != i10) {
                return;
            }
            PreviewView.this.b();
            PreviewView.this.a();
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i10) {
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        PERFORMANCE(0),
        /* JADX INFO: Fake field, exist only in values array */
        COMPATIBLE(1);
        

        /* renamed from: a */
        public final int f1863a;

        c(int i10) {
            this.f1863a = i10;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a();
    }

    /* loaded from: classes.dex */
    public class e extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public e() {
            PreviewView.this = r1;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            PreviewView.this.getClass();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public enum f {
        /* JADX INFO: Fake field, exist only in values array */
        FILL_START(0),
        FILL_CENTER(1),
        /* JADX INFO: Fake field, exist only in values array */
        FILL_END(2),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);
        

        /* renamed from: a */
        public final int f1870a;

        f(int i10) {
            this.f1870a = i10;
        }
    }

    /* loaded from: classes.dex */
    public enum g {
        IDLE,
        STREAMING
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v5, types: [k0.f] */
    public PreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        f[] values;
        c[] values2;
        this.f1848a = c.PERFORMANCE;
        androidx.camera.view.b bVar = new androidx.camera.view.b();
        this.f1850c = bVar;
        this.f1851d = true;
        this.f1852e = new a0<>(g.IDLE);
        this.f1853f = new AtomicReference<>();
        this.f1854g = new h(bVar);
        this.f1856i = new b();
        this.f1857j = new View.OnLayoutChangeListener() { // from class: k0.f
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                boolean z10;
                PreviewView previewView = PreviewView.this;
                int i18 = PreviewView.f1847l;
                previewView.getClass();
                if (i12 - i10 == i16 - i14 && i13 - i11 == i17 - i15) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    previewView.a();
                    p.b.f();
                    previewView.getDisplay();
                    previewView.getViewPort();
                }
            }
        };
        this.f1858k = new a();
        p.b.f();
        Resources.Theme theme = context.getTheme();
        int[] iArr = R.styleable.PreviewView;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        o0.o(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        try {
            int integer = obtainStyledAttributes.getInteger(R.styleable.PreviewView_scaleType, bVar.f1885f.f1870a);
            for (f fVar : f.values()) {
                if (fVar.f1870a == integer) {
                    setScaleType(fVar);
                    int integer2 = obtainStyledAttributes.getInteger(R.styleable.PreviewView_implementationMode, 0);
                    for (c cVar : c.values()) {
                        if (cVar.f1863a == integer2) {
                            setImplementationMode(cVar);
                            obtainStyledAttributes.recycle();
                            new ScaleGestureDetector(context, new e());
                            if (getBackground() == null) {
                                setBackgroundColor(y0.a.b(getContext(), 17170444));
                                return;
                            }
                            return;
                        }
                    }
                    throw new IllegalArgumentException("Unknown implementation mode id " + integer2);
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + integer);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getApplicationContext().getSystemService("display");
    }

    private int getViewPortScaleType() {
        int ordinal = getScaleType().ordinal();
        if (ordinal != 0) {
            int i10 = 1;
            if (ordinal != 1) {
                i10 = 2;
                if (ordinal != 2) {
                    i10 = 3;
                    if (ordinal != 3 && ordinal != 4 && ordinal != 5) {
                        StringBuilder a10 = android.support.v4.media.d.a("Unexpected scale type: ");
                        a10.append(getScaleType());
                        throw new IllegalStateException(a10.toString());
                    }
                }
            }
            return i10;
        }
        return 0;
    }

    public final void a() {
        p.b.f();
        androidx.camera.view.c cVar = this.f1849b;
        if (cVar != null) {
            cVar.f();
        }
        h hVar = this.f1854g;
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        hVar.getClass();
        p.b.f();
        synchronized (hVar) {
            if (size.getWidth() != 0 && size.getHeight() != 0) {
                hVar.f18078a.a(layoutDirection, size);
            }
        }
    }

    public final void b() {
        Display display;
        a0.a0 a0Var;
        if (this.f1851d && (display = getDisplay()) != null && (a0Var = this.f1855h) != null) {
            androidx.camera.view.b bVar = this.f1850c;
            int e10 = a0Var.e(display.getRotation());
            int rotation = display.getRotation();
            bVar.f1882c = e10;
            bVar.f1883d = rotation;
        }
    }

    public Bitmap getBitmap() {
        Bitmap b10;
        p.b.f();
        androidx.camera.view.c cVar = this.f1849b;
        if (cVar == null || (b10 = cVar.b()) == null) {
            return null;
        }
        androidx.camera.view.b bVar = cVar.f1888c;
        Size size = new Size(cVar.f1887b.getWidth(), cVar.f1887b.getHeight());
        int layoutDirection = cVar.f1887b.getLayoutDirection();
        if (!bVar.f()) {
            return b10;
        }
        Matrix d10 = bVar.d();
        RectF e10 = bVar.e(layoutDirection, size);
        Bitmap createBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), b10.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(d10);
        matrix.postScale(e10.width() / bVar.f1880a.getWidth(), e10.height() / bVar.f1880a.getHeight());
        matrix.postTranslate(e10.left, e10.top);
        canvas.drawBitmap(b10, matrix, new Paint(7));
        return createBitmap;
    }

    public k0.a getController() {
        p.b.f();
        return null;
    }

    public c getImplementationMode() {
        p.b.f();
        return this.f1848a;
    }

    public w0 getMeteringPointFactory() {
        p.b.f();
        return this.f1854g;
    }

    public m0.a getOutputTransform() {
        Matrix matrix;
        p.b.f();
        try {
            matrix = this.f1850c.c(getLayoutDirection(), new Size(getWidth(), getHeight()));
        } catch (IllegalStateException unused) {
            matrix = null;
        }
        Rect rect = this.f1850c.f1881b;
        if (matrix != null && rect != null) {
            RectF rectF = p.f3976a;
            RectF rectF2 = new RectF(rect);
            Matrix matrix2 = new Matrix();
            matrix2.setRectToRect(p.f3976a, rectF2, Matrix.ScaleToFit.FILL);
            matrix.preConcat(matrix2);
            if (this.f1849b instanceof androidx.camera.view.f) {
                matrix.postConcat(getMatrix());
            } else {
                u0.h("PreviewView", "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
            }
            new Size(rect.width(), rect.height());
            return new m0.a();
        }
        u0.a("PreviewView", "Transform info is not ready");
        return null;
    }

    public LiveData<g> getPreviewStreamState() {
        return this.f1852e;
    }

    public f getScaleType() {
        p.b.f();
        return this.f1850c.f1885f;
    }

    public m.d getSurfaceProvider() {
        p.b.f();
        return this.f1858k;
    }

    public m1 getViewPort() {
        p.b.f();
        if (getDisplay() == null) {
            return null;
        }
        int rotation = getDisplay().getRotation();
        p.b.f();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return new m1(getViewPortScaleType(), new Rational(getWidth(), getHeight()), rotation, getLayoutDirection());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
        DisplayManager displayManager = getDisplayManager();
        if (displayManager != null) {
            displayManager.registerDisplayListener(this.f1856i, new Handler(Looper.getMainLooper()));
        }
        addOnLayoutChangeListener(this.f1857j);
        androidx.camera.view.c cVar = this.f1849b;
        if (cVar != null) {
            cVar.c();
        }
        p.b.f();
        getDisplay();
        getViewPort();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f1857j);
        androidx.camera.view.c cVar = this.f1849b;
        if (cVar != null) {
            cVar.d();
        }
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.f1856i);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return super.performClick();
    }

    public void setController(k0.a aVar) {
        p.b.f();
        p.b.f();
        getDisplay();
        getViewPort();
    }

    public void setImplementationMode(c cVar) {
        p.b.f();
        this.f1848a = cVar;
    }

    public void setScaleType(f fVar) {
        p.b.f();
        this.f1850c.f1885f = fVar;
        a();
        p.b.f();
        getDisplay();
        getViewPort();
    }
}
