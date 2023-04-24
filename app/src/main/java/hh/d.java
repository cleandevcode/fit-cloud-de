package hh;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.fitness.data.DataType;
import e8.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a */
    public static final int[] f16096a = new int[0];

    /* renamed from: b */
    public static final Object[] f16097b = new Object[0];

    /* JADX WARN: Code restructure failed: missing block: B:502:0x00f7, code lost:
        if (r5.f26297d == r6) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x0184, code lost:
        if (r3 == r6) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x019a, code lost:
        if (r3 == r6) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:556:0x019c, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:0x019e, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:609:0x026d, code lost:
        if (r4.f26297d == r6) goto L149;
     */
    /* JADX WARN: Removed duplicated region for block: B:638:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:651:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:684:0x042d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:708:0x0497 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:741:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:742:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:748:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:751:0x0532 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:766:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:767:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:771:0x0591 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:780:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:804:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:805:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:808:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:809:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:824:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:832:0x069c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:837:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:838:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:841:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:842:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:845:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:846:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:848:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:853:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:855:0x06d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:865:0x06f8 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(s0.e r36, q0.c r37, java.util.ArrayList r38, int r39) {
        /*
            Method dump skipped, instructions count: 1798
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hh.d.a(s0.e, q0.c, java.util.ArrayList, int):void");
    }

    public static int b(int i10, int i11, int[] iArr) {
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else if (i15 <= i11) {
                return i14;
            } else {
                i12 = i14 - 1;
            }
        }
        return ~i13;
    }

    public static int c(long[] jArr, int i10, long j10) {
        int i11 = i10 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = (jArr[i13] > j10 ? 1 : (jArr[i13] == j10 ? 0 : -1));
            if (i14 < 0) {
                i12 = i13 + 1;
            } else if (i14 <= 0) {
                return i13;
            } else {
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }

    public static boolean d(Context context) {
        GoogleSignInAccount googleSignInAccount;
        n a10 = n.a(context);
        synchronized (a10) {
            googleSignInAccount = a10.f13502b;
        }
        r8.a aVar = new r8.a();
        aVar.a(DataType.f6085f);
        aVar.a(DataType.f6086g);
        aVar.a(DataType.f6084e);
        aVar.a(DataType.f6087h);
        aVar.a(DataType.f6088i);
        ArrayList arrayList = new ArrayList(aVar.f25448a);
        Scope[] scopeArr = (Scope[]) arrayList.toArray(new Scope[arrayList.size()]);
        if (googleSignInAccount == null) {
            return false;
        }
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, scopeArr);
        return new HashSet(googleSignInAccount.f6012j).containsAll(hashSet);
    }
}
