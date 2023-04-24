package s;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import cn.sharesdk.framework.InnerShareParams;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.hmsscankit.OnResultCallback;
import com.huawei.hms.ml.scan.HmsScan;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgDetailReportFragment;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgDetailReportViewModel;
import com.topstep.fitcloud.pro.ui.device.bind.DeviceQrCodeActivity;
import com.topstep.fitcloud.pro.ui.device.contacts.ContactsFragment;
import com.topstep.fitcloud.pro.ui.device.contacts.ContactsViewModel;
import com.topstep.fitcloud.pro.ui.device.dial.DfuViewModel;
import com.topstep.fitcloud.pro.ui.device.settings.HardwareUpgradeFragment;
import com.topstep.fitcloud.pro.ui.widget.CountDownView;
import com.topstep.fitcloud.pro.ui.widget.LoadingView;
import d6.s;
import java.net.URLDecoder;
import java.util.regex.Matcher;
import p0.c;
import si.f;

/* loaded from: classes.dex */
public final /* synthetic */ class m1 implements c.InterfaceC0425c, androidx.fragment.app.o0, s.a, androidx.activity.result.b, CountDownView.b, LoadingView.a, f.a, OnResultCallback {

    /* renamed from: a */
    public final /* synthetic */ int f26080a;

    /* renamed from: b */
    public final /* synthetic */ Object f26081b;

    public /* synthetic */ m1(int i10, Object obj) {
        this.f26080a = i10;
        this.f26081b = obj;
    }

    @Override // androidx.activity.result.b
    public final void a(Object obj) {
        Uri uri;
        switch (this.f26080a) {
            case 5:
                jc.u uVar = (jc.u) this.f26081b;
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                int i10 = jc.u.f17601x0;
                gm.l.f(uVar, "this$0");
                uVar.e1(new jc.s(uVar));
                return;
            case 6:
                lh.h.g1((lh.h) this.f26081b, (androidx.activity.result.a) obj);
                return;
            default:
                HardwareUpgradeFragment hardwareUpgradeFragment = (HardwareUpgradeFragment) this.f26081b;
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                mm.h<Object>[] hVarArr = HardwareUpgradeFragment.f11129y0;
                gm.l.f(hardwareUpgradeFragment, "this$0");
                Intent intent = aVar2.f752b;
                if (intent != null) {
                    uri = intent.getData();
                } else {
                    uri = null;
                }
                if (aVar2.f751a == -1) {
                    if (uri == null) {
                        d7.e.e(hardwareUpgradeFragment.f1(), "Select file error!");
                        return;
                    } else {
                        ((DfuViewModel) hardwareUpgradeFragment.f11131u0.getValue()).g(1, uri, (byte) 0);
                        return;
                    }
                }
                return;
        }
    }

    @Override // si.f.a
    public final void b(boolean z10) {
        uh.i iVar = (uh.i) this.f26081b;
        if (!z10) {
            iVar.j1().o();
            iVar.c1(false, false);
        }
    }

    @Override // d6.s.a
    public final void c(boolean z10) {
        boolean z11;
        String str = (String) this.f26081b;
        int i10 = o5.p.f22804a;
        if (z10) {
            try {
                j6.a aVar = new j6.a(str);
                if (aVar.f17508b != null && aVar.f17509c != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    f6.f.f(aVar.f17507a, aVar.toString());
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.topstep.fitcloud.pro.ui.widget.LoadingView.a
    public final void d() {
        switch (this.f26080a) {
            case 8:
                EcgDetailReportFragment ecgDetailReportFragment = (EcgDetailReportFragment) this.f26081b;
                mm.h<Object>[] hVarArr = EcgDetailReportFragment.f10638v0;
                gm.l.f(ecgDetailReportFragment, "this$0");
                ((EcgDetailReportViewModel) ecgDetailReportFragment.f10640u0.getValue()).j();
                return;
            default:
                ContactsFragment contactsFragment = (ContactsFragment) this.f26081b;
                mm.h<Object>[] hVarArr2 = ContactsFragment.f10879y0;
                gm.l.f(contactsFragment, "this$0");
                ContactsViewModel i12 = contactsFragment.i1();
                i12.getClass();
                bi.z0.g(rm.l.h(i12), null, 0, new vh.h(i12, null), 3);
                return;
        }
    }

    @Override // androidx.fragment.app.o0
    public final void e(Bundle bundle, String str) {
        fm.p pVar = (fm.p) this.f26081b;
        gm.l.f(pVar, "$tmp0");
        gm.l.f(str, "p0");
        pVar.A(str, bundle);
    }

    @Override // p0.c.InterfaceC0425c
    public final String g(c.a aVar) {
        String str;
        boolean z10 = false;
        switch (this.f26080a) {
            case 0:
                n1 n1Var = (n1) this.f26081b;
                synchronized (n1Var.f26085a) {
                    if (n1Var.f26098n == null) {
                        z10 = true;
                    }
                    h1.k("Release completer expected to be null", z10);
                    n1Var.f26098n = aVar;
                    str = "Release[session=" + n1Var + "]";
                }
                return str;
            case 1:
                androidx.camera.core.n nVar = (androidx.camera.core.n) this.f26081b;
                synchronized (nVar.f1746a) {
                    nVar.f1756k = aVar;
                }
                return "ProcessingImageReader-close";
            default:
                na.a aVar2 = (na.a) this.f26081b;
                d0.f.g(false, aVar2, aVar, o8.b.i());
                return "nonCancellationPropagating[" + aVar2 + "]";
        }
    }

    @Override // com.huawei.hms.hmsscankit.OnResultCallback
    public final void onResult(HmsScan[] hmsScanArr) {
        boolean z10;
        HmsScan hmsScan;
        boolean z11;
        String str;
        String substring;
        String str2;
        boolean z12;
        DeviceQrCodeActivity deviceQrCodeActivity = (DeviceQrCodeActivity) this.f26081b;
        int i10 = DeviceQrCodeActivity.A;
        gm.l.f(deviceQrCodeActivity, "this$0");
        boolean z13 = true;
        if (hmsScanArr != null) {
            if (hmsScanArr.length == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z12) {
                z10 = false;
                if (z10 && (hmsScan = hmsScanArr[0]) != null) {
                    String originalValue = hmsScan.getOriginalValue();
                    if (originalValue != null && originalValue.length() != 0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (!z11) {
                        String decode = URLDecoder.decode(originalValue, "UTF-8");
                        p000do.a.f13275a.n("str:%s", decode);
                        gm.l.e(decode, "str");
                        Matcher matcher = deviceQrCodeActivity.f10821z.matcher(decode);
                        String str3 = null;
                        if (matcher.find()) {
                            str = matcher.group();
                        } else {
                            str = null;
                        }
                        if (BluetoothAdapter.checkBluetoothAddress(str)) {
                            int h02 = om.l.h0(decode, "BtName=", 0, false, 6);
                            if (h02 != -1) {
                                int i11 = h02 + 7;
                                int h03 = om.l.h0(decode, ContainerUtils.FIELD_DELIMITER, i11, false, 4);
                                if (h03 != -1) {
                                    substring = decode.substring(i11, h03);
                                    str2 = "this as java.lang.String…ing(startIndex, endIndex)";
                                } else {
                                    substring = decode.substring(i11);
                                    str2 = "this as java.lang.String).substring(startIndex)";
                                }
                                str3 = substring;
                                gm.l.e(str3, str2);
                            }
                            if (str3 != null && str3.length() != 0) {
                                z13 = false;
                            }
                            if (!z13) {
                                Intent intent = new Intent();
                                intent.putExtra(InnerShareParams.ADDRESS, str);
                                intent.putExtra("name", str3);
                                deviceQrCodeActivity.setResult(-1, intent);
                                deviceQrCodeActivity.finish();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
        z10 = true;
        if (z10) {
        }
    }
}
