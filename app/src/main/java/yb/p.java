package yb;

import android.os.Build;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class p implements d0 {

    /* renamed from: a */
    public byte[] f31367a;

    /* renamed from: b */
    public String f31368b;

    /* renamed from: c */
    public String f31369c;

    /* renamed from: d */
    public String f31370d;

    /* renamed from: e */
    public String f31371e;

    /* renamed from: f */
    public List<h0> f31372f;

    public p(byte[] bArr, String str, String str2, String str3, String str4, List<h0> list) {
        this.f31367a = (byte[]) bArr.clone();
        this.f31368b = str;
        this.f31369c = str2;
        this.f31371e = str3;
        this.f31370d = str4;
        this.f31372f = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        Map<String, String> map;
        m2.f.b("send data running");
        String str = this.f31369c;
        String str2 = this.f31371e;
        String str3 = this.f31370d;
        HashMap hashMap = new HashMap();
        hashMap.put("App-Id", y.o());
        hashMap.put("App-Ver", r.a().f31380a.f31424e);
        hashMap.put("Sdk-Name", "hianalytics");
        hashMap.put("Sdk-Ver", "2.2.0.313");
        hashMap.put("Device-Type", Build.MODEL);
        hashMap.put("servicetag", str);
        Object[] objArr = {str3};
        p0 p0Var = m2.f.f20193a;
        if (p0Var.f31373a && 4 >= p0Var.f31374b) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            p0.a(4, "hmsSdk", String.format("sendData RequestId : %s", objArr));
        }
        hashMap.put("Request-Id", str3);
        w r10 = y.r(str, str2);
        if (r10 != null) {
            map = r10.f31405i;
        } else {
            map = null;
        }
        if (map != null) {
            hashMap.putAll(map);
        }
        int i10 = a.b(this.f31368b, this.f31367a, hashMap).f31275a;
        if (i10 != 200) {
            e0.f31289b.a(new x(this.f31369c, this.f31370d, this.f31371e, this.f31372f));
            return;
        }
        StringBuilder a10 = android.support.v4.media.d.a("events PostRequest sendevent TYPE : %s, TAG : %s, resultCode: %d ,reqID:");
        a10.append(this.f31370d);
        m2.f.d(String.format(a10.toString(), this.f31371e, this.f31369c, Integer.valueOf(i10)));
    }
}
