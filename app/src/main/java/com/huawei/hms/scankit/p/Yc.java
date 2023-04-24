package com.huawei.hms.scankit.p;

import java.security.SecureRandom;

/* loaded from: classes.dex */
public class Yc {

    /* renamed from: a */
    private static final SecureRandom f7788a = new SecureRandom();

    public static float a(float f10) {
        return f7788a.nextFloat() * f10;
    }

    public static int a(int i10) {
        return f7788a.nextInt(i10);
    }
}
