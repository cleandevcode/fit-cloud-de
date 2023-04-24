package i4;

import java.lang.reflect.Type;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h implements t {

    /* renamed from: a */
    public final Class<?> f16448a;

    /* renamed from: b */
    public final Enum[] f16449b;

    /* renamed from: c */
    public final Enum[] f16450c;

    /* renamed from: d */
    public long[] f16451d;

    /* JADX WARN: Removed duplicated region for block: B:124:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public h(java.lang.Class<?> r22) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.h.<init>(java.lang.Class):void");
    }

    @Override // i4.t
    public final int b() {
        return 2;
    }

    public final Enum c(long j10) {
        int binarySearch;
        if (this.f16449b != null && (binarySearch = Arrays.binarySearch(this.f16451d, j10)) >= 0) {
            return this.f16449b[binarySearch];
        }
        return null;
    }

    @Override // i4.t
    public final <T> T d(h4.a aVar, Type type, Object obj) {
        try {
            h4.c cVar = aVar.f15774f;
            int h02 = cVar.h0();
            if (h02 == 2) {
                int E = cVar.E();
                cVar.J(16);
                if (E >= 0) {
                    Enum[] enumArr = this.f16450c;
                    if (E < enumArr.length) {
                        return (T) enumArr[E];
                    }
                }
                throw new e4.d("parse enum " + this.f16448a.getName() + " error, value : " + E);
            } else if (h02 == 4) {
                String W = cVar.W();
                cVar.J(16);
                if (W.length() == 0) {
                    return null;
                }
                long j10 = -3750763034362895579L;
                long j11 = -3750763034362895579L;
                for (int i10 = 0; i10 < W.length(); i10++) {
                    int charAt = W.charAt(i10);
                    long j12 = j10 ^ charAt;
                    if (charAt >= 65 && charAt <= 90) {
                        charAt += 32;
                    }
                    j10 = j12 * 1099511628211L;
                    j11 = (j11 ^ charAt) * 1099511628211L;
                }
                T t10 = (T) c(j10);
                if (t10 == null && j11 != j10) {
                    t10 = (T) c(j11);
                }
                if (t10 == null && cVar.I(h4.b.ErrorOnEnumNotMatch)) {
                    throw new e4.d("not match enum value, " + this.f16448a.getName() + " : " + W);
                }
                return t10;
            } else if (h02 == 8) {
                cVar.J(16);
                return null;
            } else {
                throw new e4.d("parse enum " + this.f16448a.getName() + " error, value : " + aVar.E(null));
            }
        } catch (e4.d e10) {
            throw e10;
        } catch (Exception e11) {
            throw new e4.d(e11.getMessage(), e11);
        }
    }
}
