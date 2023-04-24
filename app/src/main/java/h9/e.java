package h9;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* loaded from: classes.dex */
public final class e extends Property<ImageView, Matrix> {

    /* renamed from: a */
    public final Matrix f16051a;

    public e() {
        super(Matrix.class, "imageMatrixProperty");
        this.f16051a = new Matrix();
    }

    @Override // android.util.Property
    public final Matrix get(ImageView imageView) {
        this.f16051a.set(imageView.getImageMatrix());
        return this.f16051a;
    }

    @Override // android.util.Property
    public final void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
