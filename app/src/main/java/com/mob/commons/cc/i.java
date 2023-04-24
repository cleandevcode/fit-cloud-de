package com.mob.commons.cc;

/* loaded from: classes.dex */
public class i implements s<g> {
    @Override // com.mob.commons.cc.s
    public boolean a(g gVar, Class<g> cls, String str, Object[] objArr, boolean[] zArr, Object[] objArr2, Throwable[] thArr) {
        if ("new".equals(str) && objArr.length == 2) {
            objArr2[0] = new g((String) objArr[0], ((Integer) objArr[1]).intValue());
        } else if ("putString".equals(str) && objArr.length == 2) {
            gVar.a((String) objArr[0], (String) objArr[1]);
        } else if ("getString".equals(str) && objArr.length == 2) {
            objArr2[0] = gVar.b((String) objArr[0], (String) objArr[1]);
        } else {
            if ("putBoolean".equals(str) && objArr.length == 2) {
                Object obj = objArr[1];
                if (obj instanceof Boolean) {
                    gVar.a((String) objArr[0], ((Boolean) obj).booleanValue());
                }
            }
            if ("getBoolean".equals(str) && objArr.length == 2) {
                Object obj2 = objArr[1];
                if (obj2 instanceof Boolean) {
                    objArr2[0] = Boolean.valueOf(gVar.b((String) objArr[0], ((Boolean) obj2).booleanValue()));
                }
            }
            if ("putLong".equals(str) && objArr.length == 2) {
                Object obj3 = objArr[1];
                if (obj3 instanceof Long) {
                    gVar.a((String) objArr[0], ((Long) obj3).longValue());
                }
            }
            if ("getLong".equals(str) && objArr.length == 2) {
                Object obj4 = objArr[1];
                if (obj4 instanceof Long) {
                    objArr2[0] = Long.valueOf(gVar.b((String) objArr[0], ((Long) obj4).longValue()));
                }
            }
            if ("putInt".equals(str) && objArr.length == 2) {
                Object obj5 = objArr[1];
                if (obj5 instanceof Integer) {
                    gVar.a((String) objArr[0], ((Integer) obj5).intValue());
                }
            }
            if ("getInt".equals(str) && objArr.length == 2) {
                objArr2[0] = Integer.valueOf(gVar.b((String) objArr[0], ((Integer) objArr[1]).intValue()));
            } else if ("putObj".equals(str) && objArr.length == 2) {
                gVar.a((String) objArr[0], objArr[1]);
            } else if (!"getObj".equals(str) || objArr.length != 1) {
                return false;
            } else {
                objArr2[0] = gVar.a((String) objArr[0]);
            }
        }
        return true;
    }
}
