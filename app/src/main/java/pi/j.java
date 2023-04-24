package pi;

/* loaded from: classes2.dex */
public final class j extends z7.i {
    public j(a8.g gVar, s7.i iVar, a8.e eVar) {
        super(gVar, iVar, eVar);
    }

    @Override // z7.i, z7.a
    public final void e(float f10, float f11) {
        int i10;
        int i11 = this.f32012b.f26643n;
        double abs = Math.abs(f11 - f10);
        if (i11 != 0 && abs > 0.0d && !Double.isInfinite(abs)) {
            int e10 = (int) a8.f.e(abs / i11);
            if (e10 < 1) {
                e10 = 1;
            }
            int i12 = (((int) f11) / e10) + 1;
            s7.a aVar = this.f32012b;
            aVar.f26641l = i12;
            if (aVar.f26640k.length != i12) {
                aVar.f26640k = new float[i12];
            }
            for (int i13 = 0; i13 < i12; i13++) {
                this.f32012b.f26640k[i13] = i10 - (((i12 - 1) - i13) * e10);
            }
            this.f32012b.f26642m = 0;
            f();
            return;
        }
        s7.a aVar2 = this.f32012b;
        aVar2.f26640k = new float[0];
        aVar2.f26641l = 0;
    }
}
