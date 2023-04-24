package cn.sharesdk.framework.authorize;

import android.content.Intent;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a */
    public SSOAuthorizeActivity f5203a;

    /* renamed from: b */
    public int f5204b;

    /* renamed from: c */
    public SSOListener f5205c;

    public c(SSOAuthorizeActivity sSOAuthorizeActivity) {
        this.f5203a = sSOAuthorizeActivity;
        this.f5205c = sSOAuthorizeActivity.getHelper().getSSOListener();
    }

    public abstract void a();

    public void a(int i10) {
        this.f5204b = i10;
    }

    public void a(int i10, int i11, Intent intent) {
    }

    public void a(Intent intent) {
    }
}
