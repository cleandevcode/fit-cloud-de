package com.huawei.hms.scankit;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a */
    public static final Set<BarcodeFormat> f7397a;

    /* renamed from: b */
    public static final Set<BarcodeFormat> f7398b;

    /* renamed from: c */
    public static final Set<BarcodeFormat> f7399c;

    /* renamed from: d */
    public static final Set<BarcodeFormat> f7400d;

    /* renamed from: e */
    public static final Set<BarcodeFormat> f7401e;

    /* renamed from: f */
    public static final Set<BarcodeFormat> f7402f;

    /* renamed from: g */
    public static final Set<BarcodeFormat> f7403g;

    /* renamed from: h */
    private static final Map<String, Set<BarcodeFormat>> f7404h;

    static {
        EnumSet of2 = EnumSet.of(BarcodeFormat.QR_CODE);
        f7400d = of2;
        EnumSet of3 = EnumSet.of(BarcodeFormat.DATA_MATRIX);
        f7401e = of3;
        EnumSet of4 = EnumSet.of(BarcodeFormat.AZTEC);
        f7402f = of4;
        EnumSet of5 = EnumSet.of(BarcodeFormat.PDF_417);
        f7403g = of5;
        EnumSet of6 = EnumSet.of(BarcodeFormat.UPC_A, BarcodeFormat.UPC_E, BarcodeFormat.EAN_13, BarcodeFormat.EAN_8);
        f7397a = of6;
        EnumSet of7 = EnumSet.of(BarcodeFormat.CODE_39, BarcodeFormat.CODE_93, BarcodeFormat.CODE_128, BarcodeFormat.ITF, BarcodeFormat.CODABAR);
        f7398b = of7;
        EnumSet copyOf = EnumSet.copyOf((Collection) of6);
        f7399c = copyOf;
        copyOf.addAll(of7);
        HashMap hashMap = new HashMap();
        f7404h = hashMap;
        hashMap.put("ONE_D_MODE", copyOf);
        hashMap.put("PRODUCT_MODE", of6);
        hashMap.put("QR_CODE_MODE", of2);
        hashMap.put("DATA_MATRIX_MODE", of3);
        hashMap.put("AZTEC_MODE", of4);
        hashMap.put("PDF417_MODE", of5);
    }
}
