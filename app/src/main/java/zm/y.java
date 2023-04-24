package zm;

/* loaded from: classes2.dex */
public final class y extends z {

    /* renamed from: b */
    public final /* synthetic */ byte[] f32763b;

    /* renamed from: c */
    public final /* synthetic */ s f32764c;

    /* renamed from: d */
    public final /* synthetic */ int f32765d;

    /* renamed from: e */
    public final /* synthetic */ int f32766e;

    public y(s sVar, byte[] bArr, int i10, int i11) {
        this.f32763b = bArr;
        this.f32764c = sVar;
        this.f32765d = i10;
        this.f32766e = i11;
    }

    @Override // zm.z
    public final long a() {
        return this.f32765d;
    }

    @Override // zm.z
    public final s b() {
        return this.f32764c;
    }

    @Override // zm.z
    public final void c(ln.f fVar) {
        fVar.write(this.f32763b, this.f32766e, this.f32765d);
    }
}
