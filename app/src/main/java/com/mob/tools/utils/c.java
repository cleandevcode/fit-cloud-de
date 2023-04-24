package com.mob.tools.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;

@SuppressLint({"MissingPermission"})
/* loaded from: classes.dex */
public class c {

    /* renamed from: a */
    private static c f9364a;

    private c() {
    }

    public static c a() {
        if (f9364a == null) {
            synchronized (c.class) {
                if (f9364a == null) {
                    f9364a = new c();
                }
            }
        }
        return f9364a;
    }

    public Location a(Context context, int i10, int i11, boolean z10) {
        return a(context, i10, i11, z10, false);
    }

    public Location a(Context context, int i10, int i11, boolean z10, boolean z11) {
        return null;
    }
}
