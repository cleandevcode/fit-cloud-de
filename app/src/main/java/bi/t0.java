package bi;

import android.graphics.Bitmap;
import com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsFragment;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsFragment$createQrCode$2", f = "QrCodeSettingsFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class t0 extends zl.i implements fm.p<pm.e0, xl.d<? super Bitmap>, Object> {

    /* renamed from: e */
    public final /* synthetic */ QrCodeSettingsFragment f4356e;

    /* renamed from: f */
    public final /* synthetic */ String f4357f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(QrCodeSettingsFragment qrCodeSettingsFragment, String str, xl.d<? super t0> dVar) {
        super(2, dVar);
        this.f4356e = qrCodeSettingsFragment;
        this.f4357f = str;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super Bitmap> dVar) {
        return ((t0) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new t0(this.f4356e, this.f4357f, dVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:60:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x006b  */
    @Override // zl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(java.lang.Object r5) {
        /*
            r4 = this;
            mf.a0.k(r5)
            com.huawei.hms.ml.scan.HmsBuildBitmapOption$Creator r5 = new com.huawei.hms.ml.scan.HmsBuildBitmapOption$Creator
            r5.<init>()
            com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsFragment r0 = r4.f4356e
            int r1 = com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsFragment.I0
            int r1 = r0.u1()
            r2 = 33
            if (r1 == r2) goto L63
            r2 = 41
            if (r1 == r2) goto L5f
            switch(r1) {
                case 1: goto L63;
                case 2: goto L37;
                case 3: goto L33;
                case 4: goto L4b;
                case 5: goto L2f;
                case 6: goto L2b;
                case 7: goto L27;
                case 8: goto L23;
                default: goto L1b;
            }
        L1b:
            switch(r1) {
                case 35: goto L4b;
                case 36: goto L47;
                case 37: goto L43;
                case 38: goto L3f;
                case 39: goto L3b;
                default: goto L1e;
            }
        L1e:
            switch(r1) {
                case 43: goto L5b;
                case 44: goto L57;
                case 45: goto L53;
                case 46: goto L4f;
                default: goto L21;
            }
        L21:
            r1 = 0
            goto L66
        L23:
            r1 = 2131230988(0x7f08010c, float:1.8078044E38)
            goto L66
        L27:
            r1 = 2131230991(0x7f08010f, float:1.807805E38)
            goto L66
        L2b:
            r1 = 2131231000(0x7f080118, float:1.8078069E38)
            goto L66
        L2f:
            r1 = 2131230998(0x7f080116, float:1.8078065E38)
            goto L66
        L33:
            r1 = 2131230997(0x7f080115, float:1.8078063E38)
            goto L66
        L37:
            r1 = 2131230987(0x7f08010b, float:1.8078042E38)
            goto L66
        L3b:
            r1 = 2131230992(0x7f080110, float:1.8078052E38)
            goto L66
        L3f:
            r1 = 2131231005(0x7f08011d, float:1.8078079E38)
            goto L66
        L43:
            r1 = 2131231008(0x7f080120, float:1.8078085E38)
            goto L66
        L47:
            r1 = 2131230990(0x7f08010e, float:1.8078048E38)
            goto L66
        L4b:
            r1 = 2131231001(0x7f080119, float:1.807807E38)
            goto L66
        L4f:
            r1 = 2131230995(0x7f080113, float:1.8078059E38)
            goto L66
        L53:
            r1 = 2131230999(0x7f080117, float:1.8078067E38)
            goto L66
        L57:
            r1 = 2131230989(0x7f08010d, float:1.8078046E38)
            goto L66
        L5b:
            r1 = 2131231002(0x7f08011a, float:1.8078073E38)
            goto L66
        L5f:
            r1 = 2131230994(0x7f080112, float:1.8078056E38)
            goto L66
        L63:
            r1 = 2131231007(0x7f08011f, float:1.8078083E38)
        L66:
            r2 = 0
            if (r1 != 0) goto L6b
            r0 = r2
            goto L73
        L6b:
            android.content.res.Resources r0 = r0.n0()
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r0, r1)
        L73:
            com.huawei.hms.ml.scan.HmsBuildBitmapOption$Creator r5 = r5.setQRLogoBitmap(r0)
            com.huawei.hms.ml.scan.HmsBuildBitmapOption r5 = r5.create()
            com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsFragment r0 = r4.f4356e     // Catch: java.lang.Exception -> L90
            android.content.Context r0 = r0.V0()     // Catch: java.lang.Exception -> L90
            r1 = 1129316352(0x43500000, float:208.0)
            int r0 = g7.a.a(r0, r1)     // Catch: java.lang.Exception -> L90
            java.lang.String r1 = r4.f4357f     // Catch: java.lang.Exception -> L90
            int r3 = com.huawei.hms.ml.scan.HmsScanBase.QRCODE_SCAN_TYPE     // Catch: java.lang.Exception -> L90
            android.graphics.Bitmap r2 = com.huawei.hms.hmsscankit.ScanUtil.buildBitmap(r1, r3, r0, r0, r5)     // Catch: java.lang.Exception -> L90
            goto L9b
        L90:
            r5 = move-exception
            do.a$b r0 = p000do.a.f13275a
            java.lang.String r1 = "QrCode"
            r0.t(r1)
            r0.q(r5)
        L9b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: bi.t0.t(java.lang.Object):java.lang.Object");
    }
}
