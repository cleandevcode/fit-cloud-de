package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.appcompat.R;
import androidx.appcompat.widget.k;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class z1 {

    /* renamed from: i */
    public static z1 f1600i;

    /* renamed from: a */
    public WeakHashMap<Context, o0.i<ColorStateList>> f1602a;

    /* renamed from: b */
    public o0.h<String, e> f1603b;

    /* renamed from: c */
    public o0.i<String> f1604c;

    /* renamed from: d */
    public final WeakHashMap<Context, o0.e<WeakReference<Drawable.ConstantState>>> f1605d = new WeakHashMap<>(0);

    /* renamed from: e */
    public TypedValue f1606e;

    /* renamed from: f */
    public boolean f1607f;

    /* renamed from: g */
    public f f1608g;

    /* renamed from: h */
    public static final PorterDuff.Mode f1599h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j */
    public static final c f1601j = new c();

    /* loaded from: classes.dex */
    public static class a implements e {
        @Override // androidx.appcompat.widget.z1.e
        public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return h.a.g(context, theme, context.getResources(), attributeSet, xmlResourceParser);
            } catch (Exception e10) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e10);
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements e {
        @Override // androidx.appcompat.widget.z1.e
        public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                y2.b bVar = new y2.b(context);
                bVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                return bVar;
            } catch (Exception e10) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e10);
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends o0.f<Integer, PorterDuffColorFilter> {
        public c() {
            super(6);
        }
    }

    /* loaded from: classes.dex */
    public static class d implements e {
        @Override // androidx.appcompat.widget.z1.e
        public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    i.b.c(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e10) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e10);
                    return null;
                }
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* loaded from: classes.dex */
    public interface f {
    }

    /* loaded from: classes.dex */
    public static class g implements e {
        @Override // androidx.appcompat.widget.z1.e
        public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                y2.f fVar = new y2.f();
                fVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                return fVar;
            } catch (Exception e10) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e10);
                return null;
            }
        }
    }

    public static synchronized z1 d() {
        z1 z1Var;
        synchronized (z1.class) {
            if (f1600i == null) {
                z1 z1Var2 = new z1();
                f1600i = z1Var2;
                j(z1Var2);
            }
            z1Var = f1600i;
        }
        return z1Var;
    }

    public static synchronized PorterDuffColorFilter h(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter a10;
        synchronized (z1.class) {
            c cVar = f1601j;
            cVar.getClass();
            int i11 = (i10 + 31) * 31;
            a10 = cVar.a(Integer.valueOf(mode.hashCode() + i11));
            if (a10 == null) {
                a10 = new PorterDuffColorFilter(i10, mode);
                cVar.b(Integer.valueOf(mode.hashCode() + i11), a10);
            }
        }
        return a10;
    }

    public static void j(z1 z1Var) {
        if (Build.VERSION.SDK_INT < 24) {
            z1Var.a("vector", new g());
            z1Var.a("animated-vector", new b());
            z1Var.a("animated-selector", new a());
            z1Var.a("drawable", new d());
        }
    }

    public final void a(String str, e eVar) {
        if (this.f1603b == null) {
            this.f1603b = new o0.h<>();
        }
        this.f1603b.put(str, eVar);
    }

    public final synchronized void b(Context context, long j10, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            o0.e<WeakReference<Drawable.ConstantState>> eVar = this.f1605d.get(context);
            if (eVar == null) {
                eVar = new o0.e<>();
                this.f1605d.put(context, eVar);
            }
            eVar.g(j10, new WeakReference<>(constantState));
        }
    }

    public final Drawable c(Context context, int i10) {
        int i11;
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        if (this.f1606e == null) {
            this.f1606e = new TypedValue();
        }
        TypedValue typedValue = this.f1606e;
        context.getResources().getValue(i10, typedValue, true);
        long j10 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e10 = e(context, j10);
        if (e10 != null) {
            return e10;
        }
        LayerDrawable layerDrawable = null;
        if (this.f1608g != null) {
            if (i10 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{f(context, R.drawable.abc_cab_background_internal_bg), f(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else {
                if (i10 == R.drawable.abc_ratingbar_material) {
                    i11 = R.dimen.abc_star_big;
                } else if (i10 == R.drawable.abc_ratingbar_indicator_material) {
                    i11 = R.dimen.abc_star_medium;
                } else if (i10 == R.drawable.abc_ratingbar_small_material) {
                    i11 = R.dimen.abc_star_small;
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(i11);
                Drawable f10 = f(context, R.drawable.abc_star_black_48dp);
                Drawable f11 = f(context, R.drawable.abc_star_half_black_48dp);
                if ((f10 instanceof BitmapDrawable) && f10.getIntrinsicWidth() == dimensionPixelSize && f10.getIntrinsicHeight() == dimensionPixelSize) {
                    bitmapDrawable = (BitmapDrawable) f10;
                    bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    f10.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                    f10.draw(canvas);
                    bitmapDrawable = new BitmapDrawable(createBitmap);
                    bitmapDrawable2 = new BitmapDrawable(createBitmap);
                }
                bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
                if ((f11 instanceof BitmapDrawable) && f11.getIntrinsicWidth() == dimensionPixelSize && f11.getIntrinsicHeight() == dimensionPixelSize) {
                    bitmapDrawable3 = (BitmapDrawable) f11;
                } else {
                    Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap2);
                    f11.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                    f11.draw(canvas2);
                    bitmapDrawable3 = new BitmapDrawable(createBitmap2);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
                layerDrawable2.setId(0, 16908288);
                layerDrawable2.setId(1, 16908303);
                layerDrawable2.setId(2, 16908301);
                layerDrawable = layerDrawable2;
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j10, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized Drawable e(Context context, long j10) {
        o0.e<WeakReference<Drawable.ConstantState>> eVar = this.f1605d.get(context);
        if (eVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) eVar.e(j10, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            eVar.h(j10);
        }
        return null;
    }

    public final synchronized Drawable f(Context context, int i10) {
        return g(context, i10, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x002a, code lost:
        if (r0 == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0117, code lost:
        b1.a.b.i(r13, r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00e9 A[Catch: all -> 0x00cb, TryCatch #1 {all -> 0x00cb, blocks: (B:111:0x0001, B:124:0x002c, B:126:0x0031, B:128:0x0037, B:130:0x003d, B:133:0x004b, B:137:0x005c, B:139:0x0060, B:140:0x0067, B:168:0x00e9, B:170:0x00ef, B:172:0x00f7, B:174:0x00fd, B:181:0x0117, B:177:0x010f, B:179:0x0113, B:183:0x011d, B:185:0x0121, B:187:0x012d, B:188:0x0158, B:190:0x015c, B:192:0x0160, B:194:0x0164, B:198:0x0192, B:205:0x019f, B:143:0x0081, B:145:0x0085, B:147:0x0091, B:148:0x0099, B:153:0x00a5, B:155:0x00b8, B:157:0x00c2, B:160:0x00ce, B:161:0x00d5, B:163:0x00d7, B:165:0x00e0, B:136:0x0055, B:114:0x0008, B:116:0x0012, B:118:0x0016, B:208:0x01a4, B:209:0x01ad), top: B:213:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00ef A[Catch: all -> 0x00cb, TryCatch #1 {all -> 0x00cb, blocks: (B:111:0x0001, B:124:0x002c, B:126:0x0031, B:128:0x0037, B:130:0x003d, B:133:0x004b, B:137:0x005c, B:139:0x0060, B:140:0x0067, B:168:0x00e9, B:170:0x00ef, B:172:0x00f7, B:174:0x00fd, B:181:0x0117, B:177:0x010f, B:179:0x0113, B:183:0x011d, B:185:0x0121, B:187:0x012d, B:188:0x0158, B:190:0x015c, B:192:0x0160, B:194:0x0164, B:198:0x0192, B:205:0x019f, B:143:0x0081, B:145:0x0085, B:147:0x0091, B:148:0x0099, B:153:0x00a5, B:155:0x00b8, B:157:0x00c2, B:160:0x00ce, B:161:0x00d5, B:163:0x00d7, B:165:0x00e0, B:136:0x0055, B:114:0x0008, B:116:0x0012, B:118:0x0016, B:208:0x01a4, B:209:0x01ad), top: B:213:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00f7 A[Catch: all -> 0x00cb, TryCatch #1 {all -> 0x00cb, blocks: (B:111:0x0001, B:124:0x002c, B:126:0x0031, B:128:0x0037, B:130:0x003d, B:133:0x004b, B:137:0x005c, B:139:0x0060, B:140:0x0067, B:168:0x00e9, B:170:0x00ef, B:172:0x00f7, B:174:0x00fd, B:181:0x0117, B:177:0x010f, B:179:0x0113, B:183:0x011d, B:185:0x0121, B:187:0x012d, B:188:0x0158, B:190:0x015c, B:192:0x0160, B:194:0x0164, B:198:0x0192, B:205:0x019f, B:143:0x0081, B:145:0x0085, B:147:0x0091, B:148:0x0099, B:153:0x00a5, B:155:0x00b8, B:157:0x00c2, B:160:0x00ce, B:161:0x00d5, B:163:0x00d7, B:165:0x00e0, B:136:0x0055, B:114:0x0008, B:116:0x0012, B:118:0x0016, B:208:0x01a4, B:209:0x01ad), top: B:213:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x019f A[Catch: all -> 0x00cb, TRY_LEAVE, TryCatch #1 {all -> 0x00cb, blocks: (B:111:0x0001, B:124:0x002c, B:126:0x0031, B:128:0x0037, B:130:0x003d, B:133:0x004b, B:137:0x005c, B:139:0x0060, B:140:0x0067, B:168:0x00e9, B:170:0x00ef, B:172:0x00f7, B:174:0x00fd, B:181:0x0117, B:177:0x010f, B:179:0x0113, B:183:0x011d, B:185:0x0121, B:187:0x012d, B:188:0x0158, B:190:0x015c, B:192:0x0160, B:194:0x0164, B:198:0x0192, B:205:0x019f, B:143:0x0081, B:145:0x0085, B:147:0x0091, B:148:0x0099, B:153:0x00a5, B:155:0x00b8, B:157:0x00c2, B:160:0x00ce, B:161:0x00d5, B:163:0x00d7, B:165:0x00e0, B:136:0x0055, B:114:0x0008, B:116:0x0012, B:118:0x0016, B:208:0x01a4, B:209:0x01ad), top: B:213:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized android.graphics.drawable.Drawable g(android.content.Context r13, int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.z1.g(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    public final synchronized ColorStateList i(Context context, int i10) {
        ColorStateList colorStateList;
        o0.i<ColorStateList> iVar;
        try {
            WeakHashMap<Context, o0.i<ColorStateList>> weakHashMap = this.f1602a;
            ColorStateList colorStateList2 = null;
            if (weakHashMap != null && (iVar = weakHashMap.get(context)) != null) {
                colorStateList = (ColorStateList) iVar.d(i10, null);
            } else {
                colorStateList = null;
            }
            if (colorStateList == null) {
                f fVar = this.f1608g;
                if (fVar != null) {
                    colorStateList2 = ((k.a) fVar).c(context, i10);
                }
                if (colorStateList2 != null) {
                    if (this.f1602a == null) {
                        this.f1602a = new WeakHashMap<>();
                    }
                    o0.i<ColorStateList> iVar2 = this.f1602a.get(context);
                    if (iVar2 == null) {
                        iVar2 = new o0.i<>();
                        this.f1602a.put(context, iVar2);
                    }
                    iVar2.a(i10, colorStateList2);
                }
                colorStateList = colorStateList2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
        /*
            r7 = this;
            androidx.appcompat.widget.z1$f r0 = r7.f1608g
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L67
            androidx.appcompat.widget.k$a r0 = (androidx.appcompat.widget.k.a) r0
            android.graphics.PorterDuff$Mode r3 = androidx.appcompat.widget.k.f1384b
            int[] r4 = r0.f1387a
            boolean r4 = androidx.appcompat.widget.k.a.a(r9, r4)
            r5 = 16842801(0x1010031, float:2.3693695E-38)
            r6 = -1
            if (r4 == 0) goto L19
            int r5 = androidx.appcompat.R.attr.colorControlNormal
            goto L42
        L19:
            int[] r4 = r0.f1389c
            boolean r4 = androidx.appcompat.widget.k.a.a(r9, r4)
            if (r4 == 0) goto L24
            int r5 = androidx.appcompat.R.attr.colorControlActivated
            goto L42
        L24:
            int[] r0 = r0.f1390d
            boolean r0 = androidx.appcompat.widget.k.a.a(r9, r0)
            if (r0 == 0) goto L2f
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L42
        L2f:
            int r0 = androidx.appcompat.R.drawable.abc_list_divider_mtrl_alpha
            if (r9 != r0) goto L3e
            r9 = 16842800(0x1010030, float:2.3693693E-38)
            r0 = 1109603123(0x42233333, float:40.8)
            int r0 = java.lang.Math.round(r0)
            goto L44
        L3e:
            int r0 = androidx.appcompat.R.drawable.abc_dialog_material_background
            if (r9 != r0) goto L46
        L42:
            r9 = r5
            r0 = -1
        L44:
            r4 = 1
            goto L49
        L46:
            r9 = 0
            r0 = -1
            r4 = 0
        L49:
            if (r4 == 0) goto L63
            int[] r4 = androidx.appcompat.widget.k1.f1396a
            android.graphics.drawable.Drawable r10 = r10.mutate()
            int r8 = androidx.appcompat.widget.g2.c(r8, r9)
            android.graphics.PorterDuffColorFilter r8 = androidx.appcompat.widget.k.c(r8, r3)
            r10.setColorFilter(r8)
            if (r0 == r6) goto L61
            r10.setAlpha(r0)
        L61:
            r8 = 1
            goto L64
        L63:
            r8 = 0
        L64:
            if (r8 == 0) goto L67
            goto L68
        L67:
            r1 = 0
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.z1.k(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
