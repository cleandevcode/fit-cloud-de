package com.mob;

import com.mob.tools.proguard.PublicMemberKeeper;

@Deprecated
/* loaded from: classes.dex */
public class RHolder implements PublicMemberKeeper {

    /* renamed from: a */
    private static RHolder f8199a;

    /* renamed from: b */
    private int f8200b;

    /* renamed from: c */
    private int f8201c;

    /* renamed from: d */
    private int f8202d;

    private RHolder() {
    }

    public static RHolder getInstance() {
        if (f8199a == null) {
            synchronized (RHolder.class) {
                if (f8199a == null) {
                    f8199a = new RHolder();
                }
            }
        }
        return f8199a;
    }

    public int getActivityThemeId() {
        return this.f8200b;
    }

    public int getDialogLayoutId() {
        return this.f8201c;
    }

    public int getDialogThemeId() {
        return this.f8202d;
    }

    public RHolder setActivityThemeId(int i10) {
        this.f8200b = i10;
        return f8199a;
    }

    public RHolder setDialogLayoutId(int i10) {
        this.f8201c = i10;
        return f8199a;
    }

    public RHolder setDialogThemeId(int i10) {
        this.f8202d = i10;
        return f8199a;
    }
}
