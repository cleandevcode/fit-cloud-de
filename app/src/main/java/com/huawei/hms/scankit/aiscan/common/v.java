package com.huawei.hms.scankit.aiscan.common;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a */
    private final h f7312a;

    /* renamed from: b */
    private final List<i> f7313b;

    public v(h hVar) {
        this.f7312a = hVar;
        ArrayList arrayList = new ArrayList();
        this.f7313b = arrayList;
        arrayList.add(new i(hVar, new int[]{1}));
    }

    private i a(int i10) {
        if (i10 >= this.f7313b.size()) {
            List<i> list = this.f7313b;
            i iVar = list.get(list.size() - 1);
            for (int size = this.f7313b.size(); size <= i10; size++) {
                h hVar = this.f7312a;
                iVar = iVar.c(new i(hVar, new int[]{1, hVar.a(hVar.a() + (size - 1))}));
                this.f7313b.add(iVar);
            }
        }
        return this.f7313b.get(i10);
    }

    public void a(int[] iArr, int i10) {
        if (i10 == 0) {
            try {
                throw new IllegalArgumentException("No error correction bytes");
            } catch (Exception e10) {
                throw e10;
            }
        }
        int length = iArr.length - i10;
        if (length <= 0) {
            try {
                throw new IllegalArgumentException("No data bytes provided");
            } catch (Exception e11) {
                throw e11;
            }
        }
        i a10 = a(i10);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] a11 = new i(this.f7312a, iArr2).a(i10, 1).b(a10)[1].a();
        int length2 = i10 - a11.length;
        for (int i11 = 0; i11 < length2; i11++) {
            iArr[length + i11] = 0;
        }
        System.arraycopy(a11, 0, iArr, length + length2, a11.length);
    }
}
