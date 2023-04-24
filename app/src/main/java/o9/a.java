package o9;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import b1.a;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButton;
import ea.b;
import ga.f;
import ga.i;
import ga.m;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: t */
    public static final boolean f22893t;

    /* renamed from: u */
    public static final boolean f22894u;

    /* renamed from: a */
    public final MaterialButton f22895a;

    /* renamed from: b */
    public i f22896b;

    /* renamed from: c */
    public int f22897c;

    /* renamed from: d */
    public int f22898d;

    /* renamed from: e */
    public int f22899e;

    /* renamed from: f */
    public int f22900f;

    /* renamed from: g */
    public int f22901g;

    /* renamed from: h */
    public int f22902h;

    /* renamed from: i */
    public PorterDuff.Mode f22903i;

    /* renamed from: j */
    public ColorStateList f22904j;

    /* renamed from: k */
    public ColorStateList f22905k;

    /* renamed from: l */
    public ColorStateList f22906l;

    /* renamed from: m */
    public Drawable f22907m;

    /* renamed from: n */
    public boolean f22908n = false;

    /* renamed from: o */
    public boolean f22909o = false;

    /* renamed from: p */
    public boolean f22910p = false;

    /* renamed from: q */
    public boolean f22911q;

    /* renamed from: r */
    public LayerDrawable f22912r;

    /* renamed from: s */
    public int f22913s;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f22893t = true;
        f22894u = i10 <= 22;
    }

    public a(MaterialButton materialButton, i iVar) {
        this.f22895a = materialButton;
        this.f22896b = iVar;
    }

    public final m a() {
        LayerDrawable layerDrawable = this.f22912r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (m) (this.f22912r.getNumberOfLayers() > 2 ? this.f22912r.getDrawable(2) : this.f22912r.getDrawable(1));
    }

    public final f b(boolean z10) {
        LayerDrawable layerDrawable = this.f22912r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (f) (f22893t ? (LayerDrawable) ((InsetDrawable) this.f22912r.getDrawable(0)).getDrawable() : this.f22912r).getDrawable(!z10 ? 1 : 0);
    }

    public final void c(i iVar) {
        this.f22896b = iVar;
        if (f22894u && !this.f22909o) {
            MaterialButton materialButton = this.f22895a;
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            int f10 = o0.e.f(materialButton);
            int paddingTop = this.f22895a.getPaddingTop();
            int e10 = o0.e.e(this.f22895a);
            int paddingBottom = this.f22895a.getPaddingBottom();
            e();
            o0.e.k(this.f22895a, f10, paddingTop, e10, paddingBottom);
            return;
        }
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(iVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(iVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(iVar);
        }
    }

    public final void d(int i10, int i11) {
        MaterialButton materialButton = this.f22895a;
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        int f10 = o0.e.f(materialButton);
        int paddingTop = this.f22895a.getPaddingTop();
        int e10 = o0.e.e(this.f22895a);
        int paddingBottom = this.f22895a.getPaddingBottom();
        int i12 = this.f22899e;
        int i13 = this.f22900f;
        this.f22900f = i11;
        this.f22899e = i10;
        if (!this.f22909o) {
            e();
        }
        o0.e.k(this.f22895a, f10, (paddingTop + i10) - i12, e10, (paddingBottom + i11) - i13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [android.graphics.drawable.LayerDrawable, android.graphics.drawable.RippleDrawable] */
    public final void e() {
        int i10;
        InsetDrawable insetDrawable;
        MaterialButton materialButton = this.f22895a;
        f fVar = new f(this.f22896b);
        fVar.i(this.f22895a.getContext());
        a.b.h(fVar, this.f22904j);
        PorterDuff.Mode mode = this.f22903i;
        if (mode != null) {
            a.b.i(fVar, mode);
        }
        ColorStateList colorStateList = this.f22905k;
        fVar.f15069a.f15103k = this.f22902h;
        fVar.invalidateSelf();
        f.b bVar = fVar.f15069a;
        if (bVar.f15096d != colorStateList) {
            bVar.f15096d = colorStateList;
            fVar.onStateChange(fVar.getState());
        }
        f fVar2 = new f(this.f22896b);
        fVar2.setTint(0);
        float f10 = this.f22902h;
        if (this.f22908n) {
            i10 = u9.a.b(this.f22895a, R.attr.colorSurface);
        } else {
            i10 = 0;
        }
        fVar2.f15069a.f15103k = f10;
        fVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(i10);
        f.b bVar2 = fVar2.f15069a;
        if (bVar2.f15096d != valueOf) {
            bVar2.f15096d = valueOf;
            fVar2.onStateChange(fVar2.getState());
        }
        if (f22893t) {
            f fVar3 = new f(this.f22896b);
            this.f22907m = fVar3;
            a.b.g(fVar3, -1);
            ?? rippleDrawable = new RippleDrawable(b.c(this.f22906l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{fVar2, fVar}), this.f22897c, this.f22899e, this.f22898d, this.f22900f), this.f22907m);
            this.f22912r = rippleDrawable;
            insetDrawable = rippleDrawable;
        } else {
            ea.a aVar = new ea.a(this.f22896b);
            this.f22907m = aVar;
            a.b.h(aVar, b.c(this.f22906l));
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{fVar2, fVar, this.f22907m});
            this.f22912r = layerDrawable;
            insetDrawable = new InsetDrawable((Drawable) layerDrawable, this.f22897c, this.f22899e, this.f22898d, this.f22900f);
        }
        materialButton.setInternalBackground(insetDrawable);
        f b10 = b(false);
        if (b10 != null) {
            b10.j(this.f22913s);
        }
    }

    public final void f() {
        int i10 = 0;
        f b10 = b(false);
        f b11 = b(true);
        if (b10 != null) {
            ColorStateList colorStateList = this.f22905k;
            b10.f15069a.f15103k = this.f22902h;
            b10.invalidateSelf();
            f.b bVar = b10.f15069a;
            if (bVar.f15096d != colorStateList) {
                bVar.f15096d = colorStateList;
                b10.onStateChange(b10.getState());
            }
            if (b11 != null) {
                float f10 = this.f22902h;
                if (this.f22908n) {
                    i10 = u9.a.b(this.f22895a, R.attr.colorSurface);
                }
                b11.f15069a.f15103k = f10;
                b11.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i10);
                f.b bVar2 = b11.f15069a;
                if (bVar2.f15096d != valueOf) {
                    bVar2.f15096d = valueOf;
                    b11.onStateChange(b11.getState());
                }
            }
        }
    }
}
