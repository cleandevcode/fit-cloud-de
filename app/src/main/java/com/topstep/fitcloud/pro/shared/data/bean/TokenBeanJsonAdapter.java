package com.topstep.fitcloud.pro.shared.data.bean;

import bi.z0;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.topstep.fitcloud.pro.shared.data.net.json.StringNotBlank;
import gm.l;
import kotlin.Metadata;
import mf.e0;
import mf.h0;
import mf.t;
import mf.y;
import nf.b;
import ul.u;

@Metadata
/* loaded from: classes2.dex */
public final class TokenBeanJsonAdapter extends t<TokenBean> {

    /* renamed from: a */
    public final y.a f9815a;

    /* renamed from: b */
    public final t<String> f9816b;

    /* renamed from: c */
    public final t<Integer> f9817c;

    /* renamed from: d */
    public final t<String> f9818d;

    public TokenBeanJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f9815a = y.a.a(Oauth2AccessToken.KEY_ACCESS_TOKEN, Oauth2AccessToken.KEY_EXPIRES_IN, Oauth2AccessToken.KEY_REFRESH_TOKEN, "endpoint");
        this.f9816b = h0Var.c(String.class, z0.o(new StringNotBlank() { // from class: com.topstep.fitcloud.pro.shared.data.bean.TokenBeanJsonAdapter.a
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return StringNotBlank.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (obj instanceof StringNotBlank) {
                    StringNotBlank stringNotBlank = (StringNotBlank) obj;
                    return true;
                }
                return false;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return 0;
            }

            @Override // java.lang.annotation.Annotation
            public final String toString() {
                return "@com.topstep.fitcloud.pro.shared.data.net.json.StringNotBlank()";
            }
        }), "accessToken");
        Class cls = Integer.TYPE;
        u uVar = u.f28881a;
        this.f9817c = h0Var.c(cls, uVar, "expiresIn");
        this.f9818d = h0Var.c(String.class, uVar, "endpoint");
    }

    @Override // mf.t
    public final TokenBean b(y yVar) {
        l.f(yVar, "reader");
        yVar.b();
        String str = null;
        Integer num = null;
        String str2 = null;
        String str3 = null;
        while (yVar.q()) {
            int L = yVar.L(this.f9815a);
            if (L == -1) {
                yVar.R();
                yVar.W();
            } else if (L == 0) {
                str = this.f9816b.b(yVar);
                if (str == null) {
                    throw b.m("accessToken", Oauth2AccessToken.KEY_ACCESS_TOKEN, yVar);
                }
            } else if (L == 1) {
                num = this.f9817c.b(yVar);
                if (num == null) {
                    throw b.m("expiresIn", Oauth2AccessToken.KEY_EXPIRES_IN, yVar);
                }
            } else if (L == 2) {
                str2 = this.f9816b.b(yVar);
                if (str2 == null) {
                    throw b.m("refreshToken", Oauth2AccessToken.KEY_REFRESH_TOKEN, yVar);
                }
            } else if (L == 3) {
                str3 = this.f9818d.b(yVar);
            }
        }
        yVar.j();
        if (str != null) {
            if (num != null) {
                int intValue = num.intValue();
                if (str2 != null) {
                    return new TokenBean(str, intValue, str2, str3);
                }
                throw b.g("refreshToken", Oauth2AccessToken.KEY_REFRESH_TOKEN, yVar);
            }
            throw b.g("expiresIn", Oauth2AccessToken.KEY_EXPIRES_IN, yVar);
        }
        throw b.g("accessToken", Oauth2AccessToken.KEY_ACCESS_TOKEN, yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, TokenBean tokenBean) {
        TokenBean tokenBean2 = tokenBean;
        l.f(e0Var, "writer");
        if (tokenBean2 != null) {
            e0Var.b();
            e0Var.s(Oauth2AccessToken.KEY_ACCESS_TOKEN);
            this.f9816b.f(e0Var, tokenBean2.f9809a);
            e0Var.s(Oauth2AccessToken.KEY_EXPIRES_IN);
            fb.b.b(tokenBean2.f9810b, this.f9817c, e0Var, Oauth2AccessToken.KEY_REFRESH_TOKEN);
            this.f9816b.f(e0Var, tokenBean2.f9811c);
            e0Var.s("endpoint");
            this.f9818d.f(e0Var, tokenBean2.f9812d);
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(TokenBean)";
    }
}
