package pl.droidsonroids.gif;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a */
    public static final List<String> f24314a = Arrays.asList("raw", "drawable", "mipmap");

    /* loaded from: classes2.dex */
    public static class a extends b {

        /* renamed from: c */
        public final int f24315c;

        /* renamed from: d */
        public final int f24316d;

        public a() {
            this.f24315c = 0;
            this.f24316d = 0;
        }

        public a(ImageView imageView, AttributeSet attributeSet) {
            super(imageView, attributeSet);
            this.f24315c = a(imageView, attributeSet, true);
            this.f24316d = a(imageView, attributeSet, false);
        }

        public static int a(ImageView imageView, AttributeSet attributeSet, boolean z10) {
            int attributeResourceValue = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", z10 ? "src" : "background", 0);
            if (attributeResourceValue > 0) {
                if (d.f24314a.contains(imageView.getResources().getResourceTypeName(attributeResourceValue)) && !d.a(imageView, z10, attributeResourceValue)) {
                    return attributeResourceValue;
                }
            }
            return 0;
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a */
        public boolean f24317a;

        /* renamed from: b */
        public final int f24318b;

        public b() {
            this.f24317a = false;
            this.f24318b = -1;
        }

        public b(View view, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, R.styleable.GifView, 0, 0);
            this.f24317a = obtainStyledAttributes.getBoolean(R.styleable.GifView_freezesAnimation, false);
            this.f24318b = obtainStyledAttributes.getInt(R.styleable.GifView_loopCount, -1);
            obtainStyledAttributes.recycle();
        }
    }

    public static boolean a(ImageView imageView, boolean z10, int i10) {
        Resources resources = imageView.getResources();
        if (resources != null) {
            try {
                if (f24314a.contains(resources.getResourceTypeName(i10))) {
                    pl.droidsonroids.gif.b bVar = new pl.droidsonroids.gif.b(resources, i10);
                    if (z10) {
                        imageView.setImageDrawable(bVar);
                        return true;
                    }
                    imageView.setBackground(bVar);
                    return true;
                }
                return false;
            } catch (Resources.NotFoundException | IOException unused) {
            }
        }
        return false;
    }
}
