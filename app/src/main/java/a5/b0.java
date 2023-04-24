package a5;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class b0 implements r4.j<Bitmap, Bitmap> {

    /* loaded from: classes.dex */
    public static final class a implements t4.x<Bitmap> {

        /* renamed from: a */
        public final Bitmap f265a;

        public a(Bitmap bitmap) {
            this.f265a = bitmap;
        }

        @Override // t4.x
        public final int b() {
            return m5.l.c(this.f265a);
        }

        @Override // t4.x
        public final void c() {
        }

        @Override // t4.x
        public final Class<Bitmap> d() {
            return Bitmap.class;
        }

        @Override // t4.x
        public final Bitmap get() {
            return this.f265a;
        }
    }

    @Override // r4.j
    public final t4.x<Bitmap> a(Bitmap bitmap, int i10, int i11, r4.h hVar) {
        return new a(bitmap);
    }

    @Override // r4.j
    public final /* bridge */ /* synthetic */ boolean b(Bitmap bitmap, r4.h hVar) {
        return true;
    }
}
