package com.mob.commons.cc;

/* loaded from: classes.dex */
public class o implements s<o> {
    @Override // com.mob.commons.cc.s
    public boolean a(o oVar, Class<o> cls, String str, Object[] objArr, boolean[] zArr, Object[] objArr2, Throwable[] thArr) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        if ("andOperation".equals(str) && objArr.length == 2) {
            Object obj11 = objArr[0];
            if (obj11 != null && (obj11 instanceof Integer) && (obj10 = objArr[1]) != null && (obj10 instanceof Integer)) {
                objArr2[0] = Integer.valueOf(((Integer) obj11).intValue() & ((Integer) objArr[1]).intValue());
            } else if (obj11 != null && (obj11 instanceof Long) && (obj9 = objArr[1]) != null && (obj9 instanceof Long)) {
                objArr2[0] = Long.valueOf(((Long) obj11).longValue() & ((Long) objArr[1]).longValue());
            }
        } else if ("orOperation".equals(str) && objArr.length == 2) {
            Object obj12 = objArr[0];
            if (obj12 != null && (obj12 instanceof Integer) && (obj8 = objArr[1]) != null && (obj8 instanceof Integer)) {
                objArr2[0] = Integer.valueOf(((Integer) obj12).intValue() | ((Integer) objArr[1]).intValue());
            } else if (obj12 != null && (obj12 instanceof Long) && (obj7 = objArr[1]) != null && (obj7 instanceof Long)) {
                objArr2[0] = Long.valueOf(((Long) obj12).longValue() | ((Long) objArr[1]).longValue());
            }
        } else if ("rMoveOperation".equals(str) && objArr.length == 2) {
            Object obj13 = objArr[0];
            if (obj13 != null && (obj13 instanceof Integer) && (obj6 = objArr[1]) != null && (obj6 instanceof Integer)) {
                objArr2[0] = Integer.valueOf(((Integer) obj13).intValue() >> ((Integer) objArr[1]).intValue());
            } else if (obj13 != null && (obj13 instanceof Long) && (obj5 = objArr[1]) != null && (obj5 instanceof Long)) {
                objArr2[0] = Long.valueOf(((Long) obj13).longValue() >> ((int) ((Long) objArr[1]).longValue()));
            }
        } else if ("lMoveOperation".equals(str) && objArr.length == 2) {
            Object obj14 = objArr[0];
            if (obj14 != null && (obj14 instanceof Integer) && (obj4 = objArr[1]) != null && (obj4 instanceof Integer)) {
                objArr2[0] = Integer.valueOf(((Integer) obj14).intValue() << ((Integer) objArr[1]).intValue());
            } else if (obj14 != null && (obj14 instanceof Long) && (obj3 = objArr[1]) != null && (obj3 instanceof Long)) {
                objArr2[0] = Long.valueOf(((Long) obj14).longValue() << ((int) ((Long) objArr[1]).longValue()));
            }
        } else if ("xOperation".equals(str) && objArr.length == 1) {
            Object obj15 = objArr[0];
            if (obj15 != null && (obj15 instanceof Integer)) {
                objArr2[0] = Integer.valueOf(~((Integer) obj15).intValue());
            } else if (obj15 != null && (obj15 instanceof Long)) {
                objArr2[0] = Long.valueOf(~((Long) obj15).longValue());
            }
        } else if (!"xorOperation".equals(str) || objArr.length != 2) {
            return false;
        } else {
            Object obj16 = objArr[0];
            if (obj16 != null && (obj16 instanceof Integer) && (obj2 = objArr[1]) != null && (obj2 instanceof Integer)) {
                objArr2[0] = Integer.valueOf(((Integer) obj16).intValue() ^ ((Integer) objArr[1]).intValue());
            } else if (obj16 != null && (obj16 instanceof Long) && (obj = objArr[1]) != null && (obj instanceof Long)) {
                objArr2[0] = Long.valueOf(((Long) obj16).longValue() ^ ((Long) objArr[1]).longValue());
            }
        }
        return true;
    }
}
