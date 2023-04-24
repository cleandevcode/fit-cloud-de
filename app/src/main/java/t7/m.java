package t7;

import android.graphics.Color;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m extends n<k> implements x7.e {
    public ArrayList A;
    public int B;
    public float C;
    public float D;
    public float E;
    public boolean F;
    public boolean G;

    /* renamed from: z */
    public int f27842z;

    public m(String str, ArrayList arrayList) {
        super(str, arrayList);
        this.f27842z = 1;
        this.A = null;
        this.B = -1;
        this.C = 8.0f;
        this.D = 4.0f;
        this.E = 0.2f;
        new rm.l();
        this.F = true;
        this.G = true;
        ArrayList arrayList2 = new ArrayList();
        this.A = arrayList2;
        arrayList2.clear();
        this.A.add(Integer.valueOf(Color.rgb(140, 234, 255)));
    }

    @Override // x7.e
    public final int V(int i10) {
        return ((Integer) this.A.get(i10)).intValue();
    }

    @Override // x7.e
    public final int a() {
        return this.A.size();
    }

    @Override // x7.e
    public final boolean b0() {
        return this.F;
    }

    @Override // x7.e
    public final float e0() {
        return this.D;
    }

    @Override // x7.e
    public final boolean h0() {
        return this.G;
    }

    @Override // x7.e
    public final void i() {
    }

    @Override // x7.e
    public final int k() {
        return this.B;
    }

    @Override // x7.e
    public final float q() {
        return this.E;
    }

    @Override // x7.e
    public final void s() {
    }

    @Override // x7.e
    public final int v() {
        return this.f27842z;
    }

    @Override // x7.e
    public final float y() {
        return this.C;
    }
}
