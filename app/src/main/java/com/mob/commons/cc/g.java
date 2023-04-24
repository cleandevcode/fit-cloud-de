package com.mob.commons.cc;

import com.mob.MobSDK;
import com.mob.tools.utils.SharePrefrenceHelper;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a */
    private final SharePrefrenceHelper f8294a;

    public g(String str, int i10) {
        SharePrefrenceHelper sharePrefrenceHelper = new SharePrefrenceHelper(MobSDK.getContext());
        this.f8294a = sharePrefrenceHelper;
        sharePrefrenceHelper.open(str, i10);
    }

    public Object a(String str) {
        return this.f8294a.get(str);
    }

    public void a(String str, int i10) {
        this.f8294a.putInt(str, Integer.valueOf(i10));
    }

    public void a(String str, long j10) {
        this.f8294a.putLong(str, Long.valueOf(j10));
    }

    public void a(String str, Object obj) {
        this.f8294a.put(str, obj);
    }

    public void a(String str, String str2) {
        if (str2 == null) {
            this.f8294a.remove(str);
        } else {
            this.f8294a.putString(str, str2);
        }
    }

    public void a(String str, boolean z10) {
        this.f8294a.putBoolean(str, Boolean.valueOf(z10));
    }

    public int b(String str, int i10) {
        return this.f8294a.getInt(str, i10);
    }

    public long b(String str, long j10) {
        return this.f8294a.getLong(str, j10);
    }

    public String b(String str, String str2) {
        return this.f8294a.getString(str, str2);
    }

    public boolean b(String str, boolean z10) {
        return this.f8294a.getBoolean(str, z10);
    }
}
