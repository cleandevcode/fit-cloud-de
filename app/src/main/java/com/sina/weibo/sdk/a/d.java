package com.sina.weibo.sdk.a;

import android.content.Context;
import com.sina.weibo.sdk.net.HttpManager;
import com.sina.weibo.sdk.net.e;

/* loaded from: classes.dex */
public final class d extends c<Void, Void, String> {
    private Context Z;

    /* renamed from: aa */
    private com.sina.weibo.sdk.net.c<String> f9483aa;

    /* renamed from: ab */
    private Throwable f9484ab;

    /* renamed from: ac */
    private String f9485ac;

    /* renamed from: ad */
    private String f9486ad;

    /* renamed from: ae */
    private String f9487ae;

    public d(Context context, String str, String str2, String str3, com.sina.weibo.sdk.net.c<String> cVar) {
        this.Z = context;
        this.f9485ac = str;
        this.f9486ad = str2;
        this.f9487ae = str3;
        this.f9483aa = cVar;
    }

    private String d(String str) {
        return HttpManager.a(this.Z, "", this.f9487ae, this.f9486ad, str);
    }

    @Override // com.sina.weibo.sdk.a.c
    /* renamed from: n */
    public String l() {
        try {
            String valueOf = String.valueOf(System.currentTimeMillis() / 1000);
            e.a aVar = new e.a();
            aVar.f9511i = "https://service.weibo.com/share/mobilesdk_uppic.php";
            return new com.sina.weibo.sdk.net.b().a(aVar.a("oauth_timestamp", valueOf).a("oauth_sign", d(valueOf)).b("appKey", this.f9486ad).b("oauth_timestamp", valueOf).b("oauth_sign", d(valueOf)).b("img", this.f9485ac).e()).f();
        } catch (Throwable th2) {
            th2.printStackTrace();
            this.f9484ab = th2;
            return null;
        }
    }

    @Override // com.sina.weibo.sdk.a.c
    public final /* synthetic */ void onPostExecute(String str) {
        String str2 = str;
        Throwable th2 = this.f9484ab;
        if (th2 != null) {
            com.sina.weibo.sdk.net.c<String> cVar = this.f9483aa;
            if (cVar != null) {
                cVar.onError(th2);
                return;
            }
            return;
        }
        com.sina.weibo.sdk.net.c<String> cVar2 = this.f9483aa;
        if (cVar2 != null) {
            cVar2.a(str2);
        }
    }
}
