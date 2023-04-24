package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.ArrayList;
import java.util.List;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public class Za {
    public static List<List<BarcodeFormat>> a(int i10) {
        if (i10 <= 0) {
            i10 = 8191;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        if (i10 > 0) {
            BarcodeFormat barcodeFormat = BarcodeFormat.QR_CODE;
            BarcodeFormat[] barcodeFormatArr = {BarcodeFormat.CODE_128, BarcodeFormat.CODE_39, BarcodeFormat.CODE_93, BarcodeFormat.CODABAR, BarcodeFormat.DATA_MATRIX, BarcodeFormat.EAN_13, BarcodeFormat.EAN_8, BarcodeFormat.ITF, barcodeFormat, BarcodeFormat.UPC_A, BarcodeFormat.UPC_E, BarcodeFormat.PDF_417, BarcodeFormat.AZTEC};
            int[] iArr = {1, 2, 4, 8, 16, 32, 64, 128, DfuBaseService.ERROR_REMOTE_TYPE_LEGACY, DfuBaseService.ERROR_REMOTE_TYPE_SECURE, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED, 2048, 4096};
            if ((iArr[8] & i10) != 0) {
                arrayList.add(barcodeFormat);
            }
            if ((iArr[11] & i10) != 0) {
                arrayList3.add(barcodeFormatArr[11]);
            }
            for (int i11 = 0; i11 < 13; i11++) {
                if ((iArr[i11] & i10) != 0 && i11 != 8 && i11 != 11) {
                    if (i11 == 4) {
                        arrayList5.add(barcodeFormatArr[i11]);
                    } else if (i11 == 12) {
                        arrayList4.add(barcodeFormatArr[i11]);
                    } else {
                        arrayList2.add(barcodeFormatArr[i11]);
                    }
                }
            }
        }
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(arrayList);
        arrayList6.add(arrayList2);
        arrayList6.add(arrayList3);
        arrayList6.add(arrayList5);
        arrayList6.add(arrayList4);
        return arrayList6;
    }
}
