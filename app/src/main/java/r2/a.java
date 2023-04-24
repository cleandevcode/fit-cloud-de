package r2;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: a */
    public final String f25188a;

    /* renamed from: b */
    public final Object[] f25189b;

    public a(String str, Object[] objArr) {
        this.f25188a = str;
        this.f25189b = objArr;
    }

    @Override // r2.e
    public final void a(d dVar) {
        double floatValue;
        long longValue;
        int intValue;
        Object[] objArr = this.f25189b;
        if (objArr != null) {
            int length = objArr.length;
            int i10 = 0;
            while (i10 < length) {
                Object obj = objArr[i10];
                i10++;
                if (obj == null) {
                    dVar.m0(i10);
                } else if (obj instanceof byte[]) {
                    dVar.Q(i10, (byte[]) obj);
                } else {
                    if (obj instanceof Float) {
                        floatValue = ((Float) obj).floatValue();
                    } else if (obj instanceof Double) {
                        floatValue = ((Double) obj).doubleValue();
                    } else {
                        if (obj instanceof Long) {
                            longValue = ((Long) obj).longValue();
                        } else {
                            if (obj instanceof Integer) {
                                intValue = ((Integer) obj).intValue();
                            } else if (obj instanceof Short) {
                                intValue = ((Short) obj).shortValue();
                            } else if (obj instanceof Byte) {
                                intValue = ((Byte) obj).byteValue();
                            } else if (obj instanceof String) {
                                dVar.p(i10, (String) obj);
                            } else if (obj instanceof Boolean) {
                                if (((Boolean) obj).booleanValue()) {
                                    longValue = 1;
                                } else {
                                    longValue = 0;
                                }
                            } else {
                                throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: null, byte[], float, double, long, int, short, byte, string");
                            }
                            longValue = intValue;
                        }
                        dVar.H(i10, longValue);
                    }
                    dVar.j0(floatValue, i10);
                }
            }
        }
    }

    @Override // r2.e
    public final String b() {
        return this.f25188a;
    }
}
