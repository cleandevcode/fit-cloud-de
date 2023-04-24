package com.topstep.fitcloud.pro.shared.data.bean;

import a0.a2;
import android.support.v4.media.d;
import com.topstep.fitcloud.pro.shared.data.net.json.StringNotBlank;
import gm.l;
import i2.t;
import kotlin.Metadata;
import mf.p;
import mf.u;

@Metadata
@u(generateAdapter = true)
/* loaded from: classes2.dex */
public final class TokenBean {

    /* renamed from: a */
    public final String f9809a;

    /* renamed from: b */
    public final int f9810b;

    /* renamed from: c */
    public final String f9811c;

    /* renamed from: d */
    public final String f9812d;

    /* renamed from: e */
    public final long f9813e;

    /* renamed from: f */
    public final long f9814f;

    public TokenBean(@StringNotBlank @p(name = "access_token") String str, @p(name = "expires_in") int i10, @StringNotBlank @p(name = "refresh_token") String str2, String str3) {
        l.f(str, "accessToken");
        l.f(str2, "refreshToken");
        this.f9809a = str;
        this.f9810b = i10;
        this.f9811c = str2;
        this.f9812d = str3;
        long currentTimeMillis = System.currentTimeMillis();
        this.f9813e = currentTimeMillis;
        this.f9814f = (i10 * 1000) + currentTimeMillis;
    }

    public final TokenBean copy(@StringNotBlank @p(name = "access_token") String str, @p(name = "expires_in") int i10, @StringNotBlank @p(name = "refresh_token") String str2, String str3) {
        l.f(str, "accessToken");
        l.f(str2, "refreshToken");
        return new TokenBean(str, i10, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TokenBean) {
            TokenBean tokenBean = (TokenBean) obj;
            return l.a(this.f9809a, tokenBean.f9809a) && this.f9810b == tokenBean.f9810b && l.a(this.f9811c, tokenBean.f9811c) && l.a(this.f9812d, tokenBean.f9812d);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int a10 = t.a(this.f9811c, ((this.f9809a.hashCode() * 31) + this.f9810b) * 31, 31);
        String str = this.f9812d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return a10 + hashCode;
    }

    public final String toString() {
        StringBuilder a10 = d.a("TokenBean(accessToken=");
        a10.append(this.f9809a);
        a10.append(", expiresIn=");
        a10.append(this.f9810b);
        a10.append(", refreshToken=");
        a10.append(this.f9811c);
        a10.append(", endpoint=");
        return a2.a(a10, this.f9812d, ')');
    }
}
