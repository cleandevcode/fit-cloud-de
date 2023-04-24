package com.mob.commons.cc;

import com.mob.commons.C0744r;
import com.mob.tools.network.NetCommunicator;
import com.mob.tools.network.NetworkHelper;
import java.io.OutputStream;
import java.util.HashMap;

/* loaded from: classes.dex */
public class d implements s<d> {

    /* renamed from: a */
    private static final NetworkHelper f8293a = new NetworkHelper();

    public static <T> T a(NetCommunicator netCommunicator, HashMap<String, String> hashMap, HashMap<String, Object> hashMap2, String str, boolean z10) {
        return (T) netCommunicator.requestSynchronized(false, hashMap, hashMap2, str, z10);
    }

    public static String a(String str) {
        return com.mob.commons.c.a(str);
    }

    public static String a(String str, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
        return f8293a.httpGet(str, hashMap, hashMap2);
    }

    public static String a(String str, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2, NetworkHelper.NetworkTimeOut networkTimeOut) {
        return f8293a.httpPostNew(str, hashMap, hashMap2, networkTimeOut);
    }

    public static String a(String str, byte[] bArr, HashMap<String, String> hashMap, NetworkHelper.NetworkTimeOut networkTimeOut) {
        return f8293a.httpPostWithBytes(str, bArr, hashMap, networkTimeOut);
    }

    public static void a(String str, OutputStream outputStream, NetworkHelper.NetworkTimeOut networkTimeOut) {
        f8293a.download(str, outputStream, networkTimeOut);
    }

    public static String b(String str) {
        return C0744r.a(str);
    }

    public static String c(String str) {
        return C0744r.b(str);
    }

    @Override // com.mob.commons.cc.s
    public boolean a(d dVar, Class<d> cls, String str, Object[] objArr, boolean[] zArr, Object[] objArr2, Throwable[] thArr) {
        if ("gDmn".equals(str)) {
            a((String) objArr[0]);
            return true;
        } else if ("hGet".equals(str)) {
            try {
                objArr2[0] = a((String) objArr[0], (HashMap) objArr[1], (HashMap) objArr[2]);
            } catch (Throwable th2) {
                thArr[0] = th2;
                objArr2[0] = null;
            }
            return true;
        } else if ("pst".equals(str)) {
            try {
                objArr2[0] = a((String) objArr[0], (HashMap) objArr[1], (HashMap) objArr[2], (NetworkHelper.NetworkTimeOut) objArr[3]);
            } catch (Throwable th3) {
                thArr[0] = th3;
                objArr2[0] = null;
            }
            return true;
        } else if ("postWithBytes".equals(str)) {
            try {
                objArr2[0] = a((String) objArr[0], (byte[]) objArr[1], (HashMap) objArr[2], (NetworkHelper.NetworkTimeOut) objArr[3]);
            } catch (Throwable th4) {
                thArr[0] = th4;
                objArr2[0] = null;
            }
            return true;
        } else if ("download".equals(str)) {
            try {
                a((String) objArr[0], (OutputStream) objArr[1], (NetworkHelper.NetworkTimeOut) objArr[2]);
            } catch (Throwable th5) {
                thArr[0] = th5;
                objArr2[0] = null;
            }
            return true;
        } else if (com.mob.commons.o.a("006h5di*l)eedhed").equals(str)) {
            try {
                objArr2[0] = b((String) objArr[0]);
            } catch (Throwable th6) {
                thArr[0] = th6;
                objArr2[0] = null;
            }
            return true;
        } else if (com.mob.commons.o.a("005Udgdjeedhed").equals(str)) {
            try {
                objArr2[0] = c((String) objArr[0]);
            } catch (Throwable th7) {
                thArr[0] = th7;
                objArr2[0] = null;
            }
            return true;
        } else if (com.mob.commons.o.a("007Zdh1ikSehdidkdg").equals(str)) {
            try {
                objArr2[0] = a((NetCommunicator) objArr[0], (HashMap) objArr[1], (HashMap) objArr[2], (String) objArr[3], ((Boolean) objArr[4]).booleanValue());
            } catch (Throwable th8) {
                thArr[0] = th8;
                objArr2[0] = null;
            }
            return true;
        } else {
            return false;
        }
    }
}
