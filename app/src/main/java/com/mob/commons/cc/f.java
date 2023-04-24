package com.mob.commons.cc;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.VersionedPackage;
import android.os.Build;

/* loaded from: classes.dex */
public class f implements s<PackageManager> {
    @Override // com.mob.commons.cc.s
    public boolean a(PackageManager packageManager, Class<PackageManager> cls, String str, Object[] objArr, boolean[] zArr, Object[] objArr2, Throwable[] thArr) {
        PackageInfo packageInfo;
        if (com.mob.commons.o.a("019kGdcIiXdhdiegdk$di.dk0dAeh_i;dh2jFdedgOiRfg").equals(str) && objArr.length == 2) {
            Object obj = objArr[0];
            if (obj instanceof Intent) {
                Object obj2 = objArr[1];
                if (obj2 instanceof Integer) {
                    objArr2[0] = packageManager.queryIntentServices((Intent) obj, ((Integer) obj2).intValue());
                    return true;
                }
            }
        }
        if (!com.mob.commons.o.a("014AffDid-ghdfdgdjdfff<i$egdkfhec").equals(str)) {
            if (com.mob.commons.o.a("025WffKid%ekdfdcdkdg$cHegdk!diJdkPd[fkecdhghdfdgdjdfff2i").equals(str) && objArr.length == 1) {
                Object obj3 = objArr[0];
                if (obj3 instanceof String) {
                    objArr2[0] = packageManager.getLaunchIntentForPackage((String) obj3);
                    return true;
                }
            }
            if (com.mob.commons.o.a("015OdhHi,fgeced;ji:ejdg<dEde=jRdeId*di").equals(str) && objArr.length == 2) {
                Object obj4 = objArr[0];
                if (obj4 instanceof Integer) {
                    Object obj5 = objArr[1];
                    if (obj5 instanceof Integer) {
                        objArr2[0] = packageManager.resolveActivity((Intent) obj4, ((Integer) obj5).intValue());
                        return true;
                    }
                }
            }
            return false;
        }
        if (objArr.length == 2) {
            Object obj6 = objArr[0];
            if (obj6 instanceof String) {
                Object obj7 = objArr[1];
                if (obj7 instanceof Integer) {
                    try {
                        objArr2[0] = packageManager.getPackageInfo((String) obj6, ((Integer) obj7).intValue());
                    } catch (Throwable th2) {
                        thArr[0] = th2;
                        objArr2[0] = null;
                    }
                    return true;
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 26 && objArr.length == 2) {
            Object obj8 = objArr[0];
            if (obj8 instanceof VersionedPackage) {
                Object obj9 = objArr[1];
                if (obj9 instanceof Integer) {
                    try {
                        packageInfo = packageManager.getPackageInfo((VersionedPackage) obj8, ((Integer) obj9).intValue());
                        objArr2[0] = packageInfo;
                    } catch (Throwable th3) {
                        thArr[0] = th3;
                        objArr2[0] = null;
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
