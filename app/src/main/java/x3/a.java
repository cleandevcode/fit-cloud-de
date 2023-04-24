package x3;

import android.os.Build;
import android.util.Log;
import gm.j;
import java.nio.charset.Charset;
import java.util.Base64;
import rl.b;

/* loaded from: classes.dex */
public final class a {
    public static String a(byte[] bArr) {
        String str;
        if (Build.VERSION.SDK_INT >= 26) {
            return Base64.getEncoder().encodeToString(bArr);
        }
        rl.a aVar = new rl.a(rl.a.f25786f);
        if (bArr != null && bArr.length != 0) {
            b.a aVar2 = new b.a();
            aVar.d(bArr, bArr.length, aVar2);
            aVar.d(bArr, -1, aVar2);
            int i10 = aVar2.f25796c - aVar2.f25797d;
            byte[] bArr2 = new byte[i10];
            rl.b.a(bArr2, i10, aVar2);
            bArr = bArr2;
        }
        Charset charset = rk.a.f25785a;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr, charset);
        }
        String b10 = a.b.b("encodeToString ==> ", str);
        if (!j.f15503a) {
            Log.d("SobLog", b10);
        }
        return str;
    }

    public static byte[] b(String str) {
        byte[] bytes;
        String b10 = a.b.b("decode data ==> ", str);
        if (!j.f15503a) {
            Log.d("SobLog", b10);
        }
        String replaceAll = str.replaceAll("[\\t\\n\\r]", "");
        String b11 = a.b.b("decode result ====> ", replaceAll);
        if (!j.f15503a) {
            Log.d("SobLog", b11);
        }
        rl.a aVar = new rl.a(rl.a.f25786f);
        Charset charset = rk.a.f25785a;
        if (replaceAll == null) {
            bytes = null;
        } else {
            bytes = replaceAll.getBytes(charset);
        }
        if (bytes != null && bytes.length != 0) {
            b.a aVar2 = new b.a();
            aVar.c(bytes, bytes.length, aVar2);
            aVar.c(bytes, -1, aVar2);
            int i10 = aVar2.f25796c;
            byte[] bArr = new byte[i10];
            rl.b.a(bArr, i10, aVar2);
            return bArr;
        }
        return bytes;
    }
}
