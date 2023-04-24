package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* loaded from: classes.dex */
public class k0 {

    /* renamed from: c */
    public static final int[] f1393c = {16843067, 16843068};

    /* renamed from: a */
    public final ProgressBar f1394a;

    /* renamed from: b */
    public Bitmap f1395b;

    public k0(ProgressBar progressBar) {
        this.f1394a = progressBar;
    }

    public void a(AttributeSet attributeSet, int i10) {
        l2 m10 = l2.m(this.f1394a.getContext(), attributeSet, f1393c, i10);
        Drawable f10 = m10.f(0);
        if (f10 != null) {
            ProgressBar progressBar = this.f1394a;
            if (f10 instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) f10;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i11 = 0; i11 < numberOfFrames; i11++) {
                    Drawable b10 = b(animationDrawable.getFrame(i11), true);
                    b10.setLevel(10000);
                    animationDrawable2.addFrame(b10, animationDrawable.getDuration(i11));
                }
                animationDrawable2.setLevel(10000);
                f10 = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(f10);
        }
        Drawable f11 = m10.f(1);
        if (f11 != null) {
            this.f1394a.setProgressDrawable(b(f11, false));
        }
        m10.n();
    }

    public final Drawable b(Drawable drawable, boolean z10) {
        int layerGravity;
        int layerWidth;
        int layerHeight;
        int layerInsetLeft;
        int layerInsetRight;
        int layerInsetTop;
        int layerInsetBottom;
        int layerInsetStart;
        int layerInsetEnd;
        boolean z11;
        if (drawable instanceof b1.k) {
            b1.k kVar = (b1.k) drawable;
            Drawable b10 = kVar.b();
            if (b10 != null) {
                kVar.a(b(b10, z10));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                int id2 = layerDrawable.getId(i10);
                Drawable drawable2 = layerDrawable.getDrawable(i10);
                if (id2 != 16908301 && id2 != 16908303) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                drawableArr[i10] = b(drawable2, z11);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i11 = 0; i11 < numberOfLayers; i11++) {
                layerDrawable2.setId(i11, layerDrawable.getId(i11));
                if (Build.VERSION.SDK_INT >= 23) {
                    layerGravity = layerDrawable.getLayerGravity(i11);
                    layerDrawable2.setLayerGravity(i11, layerGravity);
                    layerWidth = layerDrawable.getLayerWidth(i11);
                    layerDrawable2.setLayerWidth(i11, layerWidth);
                    layerHeight = layerDrawable.getLayerHeight(i11);
                    layerDrawable2.setLayerHeight(i11, layerHeight);
                    layerInsetLeft = layerDrawable.getLayerInsetLeft(i11);
                    layerDrawable2.setLayerInsetLeft(i11, layerInsetLeft);
                    layerInsetRight = layerDrawable.getLayerInsetRight(i11);
                    layerDrawable2.setLayerInsetRight(i11, layerInsetRight);
                    layerInsetTop = layerDrawable.getLayerInsetTop(i11);
                    layerDrawable2.setLayerInsetTop(i11, layerInsetTop);
                    layerInsetBottom = layerDrawable.getLayerInsetBottom(i11);
                    layerDrawable2.setLayerInsetBottom(i11, layerInsetBottom);
                    layerInsetStart = layerDrawable.getLayerInsetStart(i11);
                    layerDrawable2.setLayerInsetStart(i11, layerInsetStart);
                    layerInsetEnd = layerDrawable.getLayerInsetEnd(i11);
                    layerDrawable2.setLayerInsetEnd(i11, layerInsetEnd);
                }
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f1395b == null) {
                this.f1395b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            if (z10) {
                return new ClipDrawable(shapeDrawable, 3, 1);
            }
            return shapeDrawable;
        }
        return drawable;
    }
}
