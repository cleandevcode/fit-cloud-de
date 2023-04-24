package com.sina.weibo.sdk.a;

import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.sina.weibo.sdk.net.e;

/* loaded from: classes.dex */
public final class e extends c<Void, Void, String> {

    /* renamed from: aa */
    private com.sina.weibo.sdk.net.c<String> f9488aa;

    /* renamed from: ab */
    private Throwable f9489ab;

    /* renamed from: ad */
    private String f9490ad;

    /* renamed from: af */
    private Oauth2AccessToken f9491af;

    public e(String str, Oauth2AccessToken oauth2AccessToken, com.sina.weibo.sdk.net.c<String> cVar) {
        this.f9490ad = str;
        this.f9491af = oauth2AccessToken;
        this.f9488aa = cVar;
    }

    @Override // com.sina.weibo.sdk.a.c
    /* renamed from: n */
    public String l() {
        try {
            e.a aVar = new e.a();
            aVar.f9511i = "https://api.weibo.com/oauth2/access_token";
            return new com.sina.weibo.sdk.net.b().a(aVar.b("client_id", this.f9490ad).b("appKey", this.f9490ad).b("grant_type", Oauth2AccessToken.KEY_REFRESH_TOKEN).b(Oauth2AccessToken.KEY_REFRESH_TOKEN, this.f9491af.getRefreshToken()).e()).f();
        } catch (Throwable th2) {
            th2.printStackTrace();
            this.f9489ab = th2;
            return null;
        }
    }

    @Override // com.sina.weibo.sdk.a.c
    public final /* synthetic */ void onPostExecute(String str) {
        String str2 = str;
        Throwable th2 = this.f9489ab;
        if (th2 != null) {
            com.sina.weibo.sdk.net.c<String> cVar = this.f9488aa;
            if (cVar != null) {
                cVar.onError(th2);
                return;
            }
            return;
        }
        com.sina.weibo.sdk.net.c<String> cVar2 = this.f9488aa;
        if (cVar2 != null) {
            cVar2.a(str2);
        }
    }
}
