package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.Map;

/* loaded from: classes.dex */
public final class Ob implements Pb {
    /* JADX WARN: Can't wrap try/catch for region: R(3:(6:(15:179|(1:181)(2:182|(1:200))|14|(9:16|(1:18)|19|(1:21)|22|(1:24)|25|(1:27)(1:177)|28)(1:178)|29|(1:31)(2:141|(1:143)(4:144|(1:146)(2:(2:150|(1:152)(2:153|(1:155)(2:156|(1:158)(2:159|(1:161)(2:162|(1:164)(2:165|(1:167)(2:168|(1:170)(2:171|(1:173)(2:174|(1:176))))))))))|149)|147|(8:41|42|43|(3:87|88|(1:90)(9:91|(4:93|(3:95|(2:97|98)(2:100|101)|99)|102|103)|104|105|106|107|(5:113|(1:115)(1:116)|(1:82)(1:85)|83|84)|117|118))(4:48|49|50|(1:52)(6:53|(4:55|(3:57|(2:68|(2:70|71)(2:72|73))(2:65|66)|67)|74|75)|76|77|78|79))|80|(0)(0)|83|84)(2:38|39)))|32|(1:34)|41|42|43|(0)|87|88|(0)(0))|43|(0)|87|88|(0)(0))|41|42) */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0298, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0299, code lost:
        r17 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x02ae, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x02af, code lost:
        r17 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x012a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0213 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0214 A[Catch: Exception -> 0x01de, IllegalArgumentException -> 0x01e1, OutOfMemoryError -> 0x01e4, TryCatch #1 {OutOfMemoryError -> 0x01e4, blocks: (B:318:0x0126, B:321:0x012c, B:323:0x0130, B:325:0x014d, B:328:0x0154, B:332:0x01a9, B:334:0x01ad, B:336:0x01b1, B:338:0x01b5, B:340:0x01b9, B:345:0x01db, B:341:0x01ca, B:343:0x01d0, B:344:0x01d6, B:352:0x01e7, B:353:0x01ea, B:358:0x020d, B:361:0x0214, B:365:0x0226, B:367:0x022c, B:369:0x0237, B:368:0x0232, B:370:0x023a, B:371:0x023d), top: B:414:0x0126 }] */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0289  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Bitmap a(java.lang.String r28, int r29, int r30, int r31, com.huawei.hms.ml.scan.HmsBuildBitmapOption r32) {
        /*
            Method dump skipped, instructions count: 762
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.Ob.a(java.lang.String, int, int, int, com.huawei.hms.ml.scan.HmsBuildBitmapOption):android.graphics.Bitmap");
    }

    @Override // com.huawei.hms.scankit.p.Pb
    public C0736y a(String str, BarcodeFormat barcodeFormat, int i10, int i11, Map<Jc, ?> map) {
        Pb c0711rc;
        switch (Nb.f7614a[barcodeFormat.ordinal()]) {
            case 1:
                c0711rc = new C0711rc();
                break;
            case 2:
                c0711rc = new C0731wc();
                break;
            case 3:
                c0711rc = new C0708qc();
                break;
            case 4:
                c0711rc = new C0723uc();
                break;
            case 5:
                c0711rc = new Gc();
                break;
            case 6:
                c0711rc = new C0700oc();
                break;
            case 7:
                c0711rc = new C0704pc();
                break;
            case 8:
                c0711rc = new C0696nc();
                break;
            case 9:
                c0711rc = new C0715sc();
                break;
            case 10:
                c0711rc = new C0735xc();
                break;
            case 11:
                c0711rc = new C0692mc();
                break;
            case 12:
                c0711rc = new Yb();
                break;
            case 13:
                c0711rc = new Qb();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format " + barcodeFormat);
        }
        return c0711rc.a(str, barcodeFormat, i10, i11, map);
    }
}
