package t7;

import java.util.ArrayList;
import java.util.List;
import t7.k;

/* loaded from: classes.dex */
public abstract class j<T extends k> extends f<T> {

    /* renamed from: o */
    public List<T> f27832o;

    /* renamed from: p */
    public float f27833p;

    /* renamed from: q */
    public float f27834q;

    /* renamed from: r */
    public float f27835r;

    /* renamed from: s */
    public float f27836s;

    /* loaded from: classes.dex */
    public enum a {
        UP,
        DOWN,
        CLOSEST
    }

    public j(String str, ArrayList arrayList) {
        super(str);
        this.f27833p = -3.4028235E38f;
        this.f27834q = Float.MAX_VALUE;
        this.f27835r = -3.4028235E38f;
        this.f27836s = Float.MAX_VALUE;
        this.f27832o = arrayList;
        if (arrayList == null) {
            this.f27832o = new ArrayList();
        }
        List<T> list = this.f27832o;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.f27833p = -3.4028235E38f;
        this.f27834q = Float.MAX_VALUE;
        this.f27835r = -3.4028235E38f;
        this.f27836s = Float.MAX_VALUE;
        for (T t10 : this.f27832o) {
            j0(t10);
        }
    }

    @Override // x7.d
    public final T A(float f10, float f11, a aVar) {
        int m02 = m0(f10, f11, aVar);
        if (m02 > -1) {
            return this.f27832o.get(m02);
        }
        return null;
    }

    @Override // x7.d
    public final void L(float f10, float f11) {
        List<T> list = this.f27832o;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.f27833p = -3.4028235E38f;
        this.f27834q = Float.MAX_VALUE;
        int m02 = m0(f11, Float.NaN, a.UP);
        for (int m03 = m0(f10, Float.NaN, a.DOWN); m03 <= m02; m03++) {
            l0(this.f27832o.get(m03));
        }
    }

    @Override // x7.d
    public final ArrayList M(float f10) {
        ArrayList arrayList = new ArrayList();
        int size = this.f27832o.size() - 1;
        int i10 = 0;
        while (true) {
            if (i10 > size) {
                break;
            }
            int i11 = (size + i10) / 2;
            T t10 = this.f27832o.get(i11);
            if (f10 == t10.b()) {
                while (i11 > 0) {
                    int i12 = i11 - 1;
                    if (this.f27832o.get(i12).b() != f10) {
                        break;
                    }
                    i11 = i12;
                }
                int size2 = this.f27832o.size();
                while (i11 < size2) {
                    T t11 = this.f27832o.get(i11);
                    if (t11.b() != f10) {
                        break;
                    }
                    arrayList.add(t11);
                    i11++;
                }
            } else if (f10 > t10.b()) {
                i10 = i11 + 1;
            } else {
                size = i11 - 1;
            }
        }
        return arrayList;
    }

    @Override // x7.d
    public final float P() {
        return this.f27835r;
    }

    @Override // x7.d
    public final int Y() {
        return this.f27832o.size();
    }

    @Override // x7.d
    public final float c() {
        return this.f27836s;
    }

    @Override // x7.d
    public final float d() {
        return this.f27833p;
    }

    @Override // x7.d
    public final T h(float f10, float f11) {
        return A(f10, f11, a.CLOSEST);
    }

    public void j0(T t10) {
        if (t10 == null) {
            return;
        }
        k0(t10);
        l0(t10);
    }

    public final void k0(T t10) {
        if (t10.b() < this.f27836s) {
            this.f27836s = t10.b();
        }
        if (t10.b() > this.f27835r) {
            this.f27835r = t10.b();
        }
    }

    @Override // x7.d
    public final int l(k kVar) {
        return this.f27832o.indexOf(kVar);
    }

    public final void l0(T t10) {
        if (t10.a() < this.f27834q) {
            this.f27834q = t10.a();
        }
        if (t10.a() > this.f27833p) {
            this.f27833p = t10.a();
        }
    }

    public final int m0(float f10, float f11, a aVar) {
        T t10;
        List<T> list = this.f27832o;
        if (list == null || list.isEmpty()) {
            return -1;
        }
        int i10 = 0;
        int size = this.f27832o.size() - 1;
        while (i10 < size) {
            int i11 = (i10 + size) / 2;
            float b10 = this.f27832o.get(i11).b() - f10;
            int i12 = i11 + 1;
            float abs = Math.abs(b10);
            float abs2 = Math.abs(this.f27832o.get(i12).b() - f10);
            if (abs2 >= abs) {
                if (abs >= abs2) {
                    double d10 = b10;
                    if (d10 < 0.0d) {
                        if (d10 < 0.0d) {
                        }
                    }
                }
                size = i11;
            }
            i10 = i12;
        }
        if (size != -1) {
            float b11 = this.f27832o.get(size).b();
            if (aVar == a.UP) {
                if (b11 < f10 && size < this.f27832o.size() - 1) {
                    size++;
                }
            } else if (aVar == a.DOWN && b11 > f10 && size > 0) {
                size--;
            }
            if (Float.isNaN(f11)) {
                return size;
            }
            while (size > 0) {
                int i13 = size - 1;
                if (this.f27832o.get(i13).b() != b11) {
                    break;
                }
                size = i13;
            }
            float a10 = this.f27832o.get(size).a();
            int i14 = size;
            loop2: while (true) {
                int i15 = i14;
                do {
                    i15++;
                    if (i15 >= this.f27832o.size()) {
                        break loop2;
                    }
                    t10 = this.f27832o.get(i15);
                    if (t10.b() != b11) {
                        break loop2;
                    }
                } while (Math.abs(t10.a() - f11) >= Math.abs(a10 - f11));
                a10 = f11;
                i14 = i15;
            }
            return i14;
        }
        return size;
    }

    @Override // x7.d
    public final float p() {
        return this.f27834q;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        StringBuilder a10 = android.support.v4.media.d.a("DataSet, label: ");
        String str = this.f27809c;
        if (str == null) {
            str = "";
        }
        a10.append(str);
        a10.append(", entries: ");
        a10.append(this.f27832o.size());
        a10.append("\n");
        stringBuffer2.append(a10.toString());
        stringBuffer.append(stringBuffer2.toString());
        for (int i10 = 0; i10 < this.f27832o.size(); i10++) {
            stringBuffer.append(this.f27832o.get(i10).toString() + " ");
        }
        return stringBuffer.toString();
    }

    @Override // x7.d
    public final T x(int i10) {
        return this.f27832o.get(i10);
    }
}
