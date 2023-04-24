package j9;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.R;
import da.e;
import ga.f;
import j9.b;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import z9.l;
import z9.o;

/* loaded from: classes.dex */
public final class a extends Drawable implements l.b {

    /* renamed from: n */
    public static final int f17522n = R.style.Widget_MaterialComponents_Badge;

    /* renamed from: o */
    public static final int f17523o = R.attr.badgeStyle;

    /* renamed from: a */
    public final WeakReference<Context> f17524a;

    /* renamed from: b */
    public final f f17525b;

    /* renamed from: c */
    public final l f17526c;

    /* renamed from: d */
    public final Rect f17527d;

    /* renamed from: e */
    public final b f17528e;

    /* renamed from: f */
    public float f17529f;

    /* renamed from: g */
    public float f17530g;

    /* renamed from: h */
    public int f17531h;

    /* renamed from: i */
    public float f17532i;

    /* renamed from: j */
    public float f17533j;

    /* renamed from: k */
    public float f17534k;

    /* renamed from: l */
    public WeakReference<View> f17535l;

    /* renamed from: m */
    public WeakReference<FrameLayout> f17536m;

    public a(Context context, b.a aVar) {
        FrameLayout frameLayout;
        e eVar;
        Context context2;
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.f17524a = weakReference;
        o.c(context, o.f32161b, "Theme.MaterialComponents");
        this.f17527d = new Rect();
        f fVar = new f();
        this.f17525b = fVar;
        l lVar = new l(this);
        this.f17526c = lVar;
        lVar.f32152a.setTextAlign(Paint.Align.CENTER);
        int i10 = R.style.TextAppearance_MaterialComponents_Badge;
        Context context3 = weakReference.get();
        if (context3 != null && lVar.f32157f != (eVar = new e(context3, i10)) && (context2 = weakReference.get()) != null) {
            lVar.b(eVar, context2);
            i();
        }
        b bVar = new b(context, aVar);
        this.f17528e = bVar;
        this.f17531h = ((int) Math.pow(10.0d, bVar.f17538b.f17547f - 1.0d)) - 1;
        lVar.f32155d = true;
        i();
        invalidateSelf();
        lVar.f32155d = true;
        i();
        invalidateSelf();
        lVar.f32152a.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(bVar.f17538b.f17543b.intValue());
        if (fVar.f15069a.f15095c != valueOf) {
            fVar.k(valueOf);
            invalidateSelf();
        }
        lVar.f32152a.setColor(bVar.f17538b.f17544c.intValue());
        invalidateSelf();
        WeakReference<View> weakReference2 = this.f17535l;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = this.f17535l.get();
            WeakReference<FrameLayout> weakReference3 = this.f17536m;
            if (weakReference3 != null) {
                frameLayout = weakReference3.get();
            } else {
                frameLayout = null;
            }
            h(view, frameLayout);
        }
        i();
        setVisible(bVar.f17538b.f17553l.booleanValue(), false);
    }

    @Override // z9.l.b
    public final void a() {
        invalidateSelf();
    }

    public final String b() {
        if (e() <= this.f17531h) {
            return NumberFormat.getInstance(this.f17528e.f17538b.f17548g).format(e());
        }
        Context context = this.f17524a.get();
        if (context == null) {
            return "";
        }
        return String.format(this.f17528e.f17538b.f17548g, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f17531h), "+");
    }

    public final CharSequence c() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (f()) {
            if (this.f17528e.f17538b.f17550i == 0 || (context = this.f17524a.get()) == null) {
                return null;
            }
            int e10 = e();
            int i10 = this.f17531h;
            if (e10 <= i10) {
                return context.getResources().getQuantityString(this.f17528e.f17538b.f17550i, e(), Integer.valueOf(e()));
            }
            return context.getString(this.f17528e.f17538b.f17551j, Integer.valueOf(i10));
        }
        return this.f17528e.f17538b.f17549h;
    }

    public final FrameLayout d() {
        WeakReference<FrameLayout> weakReference = this.f17536m;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.f17525b.draw(canvas);
            if (f()) {
                Rect rect = new Rect();
                String b10 = b();
                this.f17526c.f32152a.getTextBounds(b10, 0, b10.length(), rect);
                canvas.drawText(b10, this.f17529f, this.f17530g + (rect.height() / 2), this.f17526c.f32152a);
            }
        }
    }

    public final int e() {
        if (f()) {
            return this.f17528e.f17538b.f17546e;
        }
        return 0;
    }

    public final boolean f() {
        if (this.f17528e.f17538b.f17546e != -1) {
            return true;
        }
        return false;
    }

    public final void g(boolean z10) {
        b bVar = this.f17528e;
        bVar.f17537a.f17553l = Boolean.valueOf(z10);
        bVar.f17538b.f17553l = Boolean.valueOf(z10);
        setVisible(this.f17528e.f17538b.f17553l.booleanValue(), false);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f17528e.f17538b.f17545d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f17527d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f17527d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h(View view, FrameLayout frameLayout) {
        this.f17535l = new WeakReference<>(view);
        this.f17536m = new WeakReference<>(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        i();
        invalidateSelf();
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0109, code lost:
        if (k1.o0.e.d(r1) == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0112, code lost:
        if (k1.o0.e.d(r1) == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0114, code lost:
        r1 = ((r4.left - r8.f17533j) + r0) + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x011f, code lost:
        r1 = ((r4.right + r8.f17533j) - r0) - r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.a.i():void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, z9.l.b
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        b bVar = this.f17528e;
        bVar.f17537a.f17545d = i10;
        bVar.f17538b.f17545d = i10;
        this.f17526c.f32152a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
