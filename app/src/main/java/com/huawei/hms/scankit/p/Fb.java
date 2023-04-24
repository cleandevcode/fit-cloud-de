package com.huawei.hms.scankit.p;

import android.graphics.Point;
import android.util.SparseArray;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.ml.scan.HmsScanBase;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class Fb {

    /* renamed from: a */
    private static final Fb[] f7502a = {new C0738yb(), new Cb(), new Hb(), new Gb(), new Lb(), new C0726vb(), new Jb(), new Kb(), new Ab(), new Ib(), new Db(), new C0722ub(), new C0718tb(), new Bb(), new Eb(), new C0734xb()};

    /* renamed from: b */
    private static final SparseArray<Integer> f7503b;

    /* renamed from: c */
    private static final Pattern f7504c;

    /* renamed from: d */
    private static final Pattern f7505d;

    /* renamed from: e */
    private static final Pattern f7506e;

    /* renamed from: f */
    public static final String[] f7507f;

    static {
        SparseArray<Integer> sparseArray = new SparseArray<>();
        f7503b = sparseArray;
        sparseArray.put(BarcodeFormat.AZTEC.ordinal(), Integer.valueOf(HmsScanBase.AZTEC_SCAN_TYPE));
        sparseArray.put(BarcodeFormat.CODABAR.ordinal(), Integer.valueOf(HmsScanBase.CODABAR_SCAN_TYPE));
        sparseArray.put(BarcodeFormat.CODE_39.ordinal(), Integer.valueOf(HmsScanBase.CODE39_SCAN_TYPE));
        sparseArray.put(BarcodeFormat.CODE_93.ordinal(), Integer.valueOf(HmsScanBase.CODE93_SCAN_TYPE));
        sparseArray.put(BarcodeFormat.CODE_128.ordinal(), Integer.valueOf(HmsScanBase.CODE128_SCAN_TYPE));
        sparseArray.put(BarcodeFormat.DATA_MATRIX.ordinal(), Integer.valueOf(HmsScanBase.DATAMATRIX_SCAN_TYPE));
        sparseArray.put(BarcodeFormat.EAN_8.ordinal(), Integer.valueOf(HmsScanBase.EAN8_SCAN_TYPE));
        sparseArray.put(BarcodeFormat.EAN_13.ordinal(), Integer.valueOf(HmsScanBase.EAN13_SCAN_TYPE));
        sparseArray.put(BarcodeFormat.ITF.ordinal(), Integer.valueOf(HmsScanBase.ITF14_SCAN_TYPE));
        sparseArray.put(BarcodeFormat.PDF_417.ordinal(), Integer.valueOf(HmsScanBase.PDF417_SCAN_TYPE));
        sparseArray.put(BarcodeFormat.QR_CODE.ordinal(), Integer.valueOf(HmsScanBase.QRCODE_SCAN_TYPE));
        sparseArray.put(BarcodeFormat.UPC_A.ordinal(), Integer.valueOf(HmsScanBase.UPCCODE_A_SCAN_TYPE));
        sparseArray.put(BarcodeFormat.UPC_E.ordinal(), Integer.valueOf(HmsScanBase.UPCCODE_E_SCAN_TYPE));
        f7504c = Pattern.compile("\\d+");
        f7505d = Pattern.compile(ContainerUtils.FIELD_DELIMITER);
        f7506e = Pattern.compile(ContainerUtils.KEY_VALUE_DELIMITER);
        f7507f = new String[0];
    }

    public static int a(char c10) {
        if (c10 < '0' || c10 > '9') {
            char c11 = 'a';
            if (c10 < 'a' || c10 > 'f') {
                c11 = 'A';
                if (c10 < 'A' || c10 > 'F') {
                    return -1;
                }
            }
            return (c10 - c11) + 10;
        }
        return c10 - '0';
    }

    public static int a(BarcodeFormat barcodeFormat) {
        Integer num;
        if (barcodeFormat != null && (num = f7503b.get(barcodeFormat.ordinal())) != null) {
            return num.intValue();
        }
        return HmsScanBase.FORMAT_UNKNOWN;
    }

    public static String a(com.huawei.hms.scankit.aiscan.common.x xVar) {
        String i10 = xVar.i();
        return i10 == null ? "" : i10.startsWith("\ufeff") ? i10.substring(1) : i10;
    }

    public static String a(String str) {
        if (str == null) {
            return str;
        }
        int length = str.length();
        while (length > 0 && str.charAt(length - 1) <= ' ') {
            length--;
        }
        return length < str.length() ? str.substring(0, length) : str;
    }

    public static boolean a(CharSequence charSequence, int i10) {
        return charSequence != null && i10 > 0 && i10 == charSequence.length() && f7504c.matcher(charSequence).matches();
    }

    public static Point[] a(com.huawei.hms.scankit.aiscan.common.z[] zVarArr) {
        if (zVarArr == null || zVarArr.length <= 0) {
            return new Point[0];
        }
        Point[] pointArr = new Point[zVarArr.length];
        for (int i10 = 0; i10 < zVarArr.length; i10++) {
            if (zVarArr[i10] != null) {
                pointArr[i10] = new Point((int) zVarArr[i10].b(), (int) zVarArr[i10].c());
            }
        }
        return pointArr;
    }

    public static HmsScan[] a(com.huawei.hms.scankit.aiscan.common.x[] xVarArr) {
        if (xVarArr == null || xVarArr.length <= 0) {
            return new HmsScan[0];
        }
        HmsScan[] hmsScanArr = new HmsScan[xVarArr.length];
        for (int i10 = 0; i10 < xVarArr.length; i10++) {
            com.huawei.hms.scankit.aiscan.common.x xVar = xVarArr[i10];
            if (xVar == null) {
                hmsScanArr[i10] = null;
            } else {
                hmsScanArr[i10] = c(xVar);
            }
        }
        return hmsScanArr;
    }

    public static String[] a(String str, String str2, char c10, boolean z10) {
        int length = str2.length();
        ArrayList arrayList = null;
        int i10 = 0;
        while (i10 < length) {
            int indexOf = str2.indexOf(str, i10);
            if (indexOf < 0) {
                break;
            }
            int length2 = str.length() + indexOf;
            boolean z11 = true;
            ArrayList arrayList2 = arrayList;
            int i11 = length2;
            while (z11) {
                int indexOf2 = str2.indexOf(c10, i11);
                if (indexOf2 < 0) {
                    i11 = str2.length();
                } else if (b(str2, indexOf2) % 2 != 0) {
                    i11 = indexOf2 + 1;
                } else {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(3);
                    }
                    String b10 = b(str2.substring(length2, indexOf2));
                    if (z10) {
                        b10 = b10.trim();
                    }
                    arrayList2.add(b10);
                    i11 = indexOf2 + 1;
                }
                z11 = false;
            }
            i10 = i11;
            arrayList = arrayList2;
        }
        if (arrayList == null) {
            return null;
        }
        return (String[]) arrayList.toArray(f7507f);
    }

    private static int b(CharSequence charSequence, int i10) {
        int i11 = 0;
        for (int i12 = i10 - 1; i12 >= 0 && charSequence.charAt(i12) == '\\'; i12--) {
            i11++;
        }
        return i11;
    }

    public static String b(String str) {
        int indexOf = str.indexOf(92);
        if (indexOf < 0) {
            return str;
        }
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length - 1);
        sb2.append(str.toCharArray(), 0, indexOf);
        boolean z10 = false;
        while (indexOf < length) {
            char charAt = str.charAt(indexOf);
            if (z10 || charAt != '\\') {
                sb2.append(charAt);
                z10 = false;
            } else {
                z10 = true;
            }
            indexOf++;
        }
        return sb2.toString();
    }

    public static String b(String str, String str2, char c10, boolean z10) {
        String str3;
        String[] a10 = a(str, str2, c10, z10);
        return (a10 == null || a10.length == 0 || (str3 = a10[0]) == null) ? "" : str3;
    }

    public static HmsScan c(com.huawei.hms.scankit.aiscan.common.x xVar) {
        if (xVar == null) {
            return null;
        }
        for (Fb fb2 : f7502a) {
            HmsScan b10 = fb2.b(xVar);
            if (b10 != null) {
                return b10;
            }
        }
        return new HmsScan(xVar.i(), a(xVar.b()), xVar.i(), HmsScan.PURE_TEXT_FORM, xVar.g(), a(xVar.h()), null, null).setZoomValue(xVar.j());
    }

    public abstract HmsScan b(com.huawei.hms.scankit.aiscan.common.x xVar);
}
