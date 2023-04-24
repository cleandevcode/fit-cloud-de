package a5;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* loaded from: classes.dex */
public final class a<DataType> implements r4.j<DataType, BitmapDrawable> {

    /* renamed from: a */
    public final r4.j<DataType, Bitmap> f257a;

    /* renamed from: b */
    public final Resources f258b;

    public a(Resources resources, r4.j<DataType, Bitmap> jVar) {
        this.f258b = resources;
        this.f257a = jVar;
    }

    @Override // r4.j
    public final t4.x<BitmapDrawable> a(DataType datatype, int i10, int i11, r4.h hVar) {
        t4.x<Bitmap> a10 = this.f257a.a(datatype, i10, i11, hVar);
        Resources resources = this.f258b;
        if (a10 == null) {
            return null;
        }
        return new v(resources, a10);
    }

    @Override // r4.j
    public final boolean b(DataType datatype, r4.h hVar) {
        return this.f257a.b(datatype, hVar);
    }
}
